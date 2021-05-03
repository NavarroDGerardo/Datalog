import javax.sound.midi.Soundbank;
import java.util.*;

public class Listener extends DatalogBaseListener{
    StringBuilder sb = new StringBuilder();
    Stack<String> stack = new Stack<>();
    HashMap<String, HashSet<String>> tables = new HashMap<>();

    public String getQuery(){
        return sb.toString();
    }

    @Override
    public void exitAtom(DatalogParser.AtomContext ctx) {

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
        String pop = stack.pop().split(" ")[1];
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


        stack.push("Where " + pop + " " + ctx.getText());
    }

    @Override
    public void exitVariable(DatalogParser.VariableContext ctx) {
        if(stack.peek().equals("SELECT ")){
            String subString = ctx.getText().substring(1, ctx.getText().length());
            stack.push(subString + " ");
        }else {
            String key =  stack.peek().split(" ")[1];
            tables.get(key).add(ctx.getText());
        }
    }

    @Override
    public void exitPredicate(DatalogParser.PredicateContext ctx)
    {
        if(!stack.isEmpty()){
            if(!stack.peek().split(" ")[0].equals("FROM")){
                tables.put(ctx.getText(), new HashSet<>());
                stack.push("FROM " + ctx.getText() + " ");
            }else{
                tables.put(ctx.getText(), new HashSet<>());
                stack.push("JOIN " + ctx.getText() + " ON ");
            }
        }else {
            stack.push("SELECT ");
        }
    }
}
