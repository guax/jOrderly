/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.guax.jorderly;

import java.io.IOException;
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
        
        parser.orderly_schema();
        
        System.out.println(parser.getNumberOfSyntaxErrors() > 1 ? "Cagou" : "Foi!");
    }
}
