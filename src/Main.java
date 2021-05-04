import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.net.http.WebSocket;
import java.util.Collections;
public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            DatalogLexer lexer = new DatalogLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            DatalogParser parser = new DatalogParser(tokens);
            ParseTree tree = parser.program();

            ParseTreeWalker parseWalker = new ParseTreeWalker();
            Listener listener = new Listener();
            parseWalker.walk(listener, tree);

            System.out.println(listener.getQuery() + ";");
        }
        catch(Exception e) {
            System.out.println("Error"); }
    }
    public static String repite (int n, String str)
    {
        return "".join("", Collections.nCopies(n,str));
    }
}
