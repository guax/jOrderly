package net.guax.jorderly;

import java.io.IOException;
import net.guax.jorderly.json.JsonProperty;
import net.guax.jorderly.parser.JSONLexer;
import net.guax.jorderly.parser.JSONParser;
import net.guax.jorderly.parser.OrderlyLexer;
import net.guax.jorderly.parser.OrderlyParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 *
 * @author guax
 */
public class Main {

    public static void main(String args[]) throws IOException, RecognitionException {
        CharStream stream = new ANTLRFileStream("examples/browserplus_services.orderly");
        OrderlyLexer lexer = new OrderlyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        OrderlyParser parser = new OrderlyParser(tokenStream);
        
        JsonProperty parseTree = parser.orderly_schema();
        
        stream = new ANTLRFileStream("examples/browserplus_services.json");
        JSONLexer jsonLexer = new JSONLexer(stream);
        tokenStream = new CommonTokenStream(jsonLexer);
        JSONParser jsonParser = new JSONParser(tokenStream);
        
        jsonParser.setValidationTree(parseTree);
        
        jsonParser.jsonDocument();
    }
}
