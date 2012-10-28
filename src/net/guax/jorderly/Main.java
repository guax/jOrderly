package net.guax.jorderly;

import java.io.IOException;
import org.antlr.runtime.RecognitionException;

/**
 *
 * @author guax
 */
public class Main {

    public static void main(String args[]) throws IOException, RecognitionException {
        OrderlyParser parser = new OrderlyParser();
        int errors = parser.parseFiles(args[0], args[1]);
        
        if(errors > 0) {
            System.exit(1);
        }
    }
}
