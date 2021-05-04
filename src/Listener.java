import javax.sound.midi.Soundbank;
import java.util.*;

public class Listener extends DatalogBaseListener{
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();
    String lastF = "";
    int counter = 0;
    HashMap<String, HashSet<String>> tables = new HashMap<>();
    boolean appear = false;
    boolean from = false;
    boolean activeCount = false;

    String PredictOp = "";

    public String getQuery(){
        String str = sb.toString();
        String[] arrOfStr = str.split(" ", 100);
        String  newe = "SELECT ";

        for (String a : arrOfStr){
            if(!a.equals("FROM") && !from){
                String key = "";
                for (Map.Entry<String, HashSet<String>> entry : tables.entrySet()) {
                    key = entry.getKey();
                    for (String s2 : entry.getValue()) {
                        s2 = s2.replace("?", "");
                        if(a.equals(s2) == true){
                            
                            newe = newe + key + "." + s2 + ", ";
                            
                        }
                    }
                }
            }else if(a.equals("FROM")){
                newe = newe.substring(0, newe.length()-2) + " ";
                newe = newe + a + " ";
                from = true;
            }else{
                newe = " " + newe + a + " " ;
            }
        }
        newe = newe.substring(newe.indexOf("SELECT"));
        String aux = newe.substring(newe.indexOf("GROUP") + 10);
        newe = newe.substring(0, newe.indexOf("BY") + 2) + aux;

        if(activeCount){
            String g = newe.substring(newe.indexOf("FROM"));
            newe = newe.substring(0, newe.indexOf("FROM") - 1) + " COUNT(*) " + g;
        }

        return newe;

    }

    @Override
    public void exitAggregateOp(DatalogParser.AggregateOpContext ctx) {
        if(ctx.getText().equals("count")){
            activeCount = true;
            stack.push(" GROUP BY ");
        }
    }

    @Override
    public void exitQuery(DatalogParser.QueryContext ctx) {
        while (!stack.isEmpty()){
            sb.insert(0, stack.pop());
        }
    }

    @Override
    public void exitLiteral(DatalogParser.LiteralContext ctx) {

        if(!ctx.getText().equals("_")){
            String pop = stack.pop();
            stack.push(pop + " " + ctx.getText());
        }
    }

    @Override
    public void exitRelOp(DatalogParser.RelOpContext ctx) {
        String[] ar = stack.pop().split(" ");

        if(!ar[0].equals("WHERE")){
            String rigth = stack.pop();
            String left = stack.peek();
            stack.push(rigth);

            if(left.split(" ")[0].equals("FROM")){
                left = left.split(" ")[1];
                rigth = rigth.split(" ")[1];
                Iterator<String> it = tables.get(left).iterator();
                while(it.hasNext()){
                    String s = it.next();
                    if(tables.get(rigth).contains(s)){
                        s = s.substring(1, s.length());
                        stack.push(left + "." + s + " = " + rigth + "." + s + " ");
                    }

                }
            }

            stack.push(" Where " + ar[1] + " " + ctx.getText());
        }
    }

    @Override
    public void exitVariable(DatalogParser.VariableContext ctx) {
        if(stack.peek().equals("SELECT ")){
            String subString = ctx.getText().substring(1, ctx.getText().length());
            stack.push(subString + " ");
        }else {
            try{
                String key =  stack.peek().split(" ")[1];
                tables.get(key).add(ctx.getText());
            }catch(Exception e){
                String subString = ctx.getText().substring(1, ctx.getText().length());
                stack.push(", " + subString + " ");
            }
            
        }
    }

    @Override
    public void exitPredicate(DatalogParser.PredicateContext ctx)
    {
        if(!stack.isEmpty()){
            if(!stack.peek().split(" ")[0].equals("FROM") && !appear){
                tables.put(ctx.getText(), new HashSet<>());
                stack.push("FROM " + ctx.getText() + " ");
                appear = true;
            }else{
                tables.put(ctx.getText(), new HashSet<>());
                
                if(counter < 1){
                    stack.push("JOIN " + ctx.getText() + " ON ");
                }else{
                    String rigth = stack.pop();
                    String left = stack.peek();
                    stack.push(rigth);
                    String key = "";
                    if(counter > 1){
                        try{
                            for (String s : tables.get(lastF)) {
                                for (String s2 : tables.get(rigth.split(" ")[1])) {
                                    if(s.equals(s2) == true){
                                        key = s;
                                        key = key.replace("?", "");
                                    }
                                }

                            }
                            stack.push(lastF + "." + key + " = " + rigth.split(" ")[1] + "." + key);
                            lastF = rigth.split(" ")[1];
                            stack.push("JOIN " + ctx.getText() + " ON ");
                        }catch (Exception ex){
                            stack.push("WHERE " + ctx.getText());
                        }
                    }else{
                        for (String s : tables.get(left.split(" ")[1])) {
                            for (String s2 : tables.get(rigth.split(" ")[1])) {
                                if(s.equals(s2) == true){
                                    key = s;
                                    key = key.replace("?", "");
                                }
                            }
                        
                        }
                        stack.push(left.split(" ")[1] + "." + key + " = " + rigth.split(" ")[1] + "." + key + " ");
                        lastF = rigth.split(" ")[1];
                        stack.push("JOIN " + ctx.getText() + " ON ");
                    }
                }
                counter++;
            }
        }else {
            stack.push("SELECT ");
        }
    }
}
