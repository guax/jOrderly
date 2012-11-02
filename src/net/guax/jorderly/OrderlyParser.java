/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly;

import java.io.IOException;
import net.guax.jorderly.json.JsonProperty;
import net.guax.jorderly.parser.JSONLexer;
import net.guax.jorderly.parser.JSONParser;
import net.guax.jorderly.parser.OrderlyLexer;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;

/**
 *
 * @author guax
 */
public class OrderlyParser {
    public int parseFiles(String orderlyFile, String jsonFile) throws IOException, RecognitionException {
        CharStream stream = new ANTLRFileStream(orderlyFile);
        OrderlyLexer lexer = new OrderlyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        net.guax.jorderly.parser.OrderlyParser parser = new net.guax.jorderly.parser.OrderlyParser(tokenStream);
        
        JsonProperty parseTree = parser.orderly_schema();
        
        stream = new ANTLRFileStream(jsonFile);
        JSONLexer jsonLexer = new JSONLexer(stream);
        tokenStream = new CommonTokenStream(jsonLexer);
        JSONParser jsonParser = new JSONParser(tokenStream);
        
        jsonParser.setValidationTree(parseTree);
        
        jsonParser.jsonDocument();
        
        return jsonParser.getNumberOfSyntaxErrors();
    }
    
    public static void main(String[] args) throws IOException, RecognitionException {
        OrderlyParser parser = new OrderlyParser();
        int errors = parser.parseFiles("tests/grammarBasics/object/grammar.orderly", "tests/grammarBasics/object/object.json");
    }
}
