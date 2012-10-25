/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import java.io.IOException;
import net.guax.jorderly.parser.OrderlyLexer;
import net.guax.jorderly.parser.OrderlyParser;
import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.TokenStream;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author guax
 */
public class Negative {

    public Negative() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    protected void assertFile(String filename) throws IOException, RecognitionException {
        CharStream stream = new ANTLRFileStream("tests/negative_cases/" + filename);
        OrderlyLexer lexer = new OrderlyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        OrderlyParser parser = new OrderlyParser(tokenStream);

        parser.orderly_schema();
        assertTrue(parser.getNumberOfSyntaxErrors() > 0);
    }

    @Test
    public void bad_arrayTest() throws IOException, RecognitionException {
        assertFile("bad_array.orderly");
    }

    @Test
    public void bad_regexTest() throws IOException, RecognitionException {
        assertFile("bad_regex.orderly");
    }

    @Test
    public void integer_overflowTest() throws IOException, RecognitionException {
        assertFile("integer_overflow.orderly");
    }

    @Test
    public void malformed_rangeTest() throws IOException, RecognitionException {
        assertFile("malformed_range.orderly");
    }

    @Test
    public void missed_semicolonTest() throws IOException, RecognitionException {
        assertFile("missed_semicolon.orderly");
    }

    @Test
    public void missing_gtTest() throws IOException, RecognitionException {
        assertFile("missing_gt.orderly");
    }

    @Test
    public void missing_prop_nameTest() throws IOException, RecognitionException {
        assertFile("missing_prop_name.orderly");
    }

    @Test
    public void missing_schema_entryTest() throws IOException, RecognitionException {
        assertFile("missing_schema_entry.orderly");
    }

    @Test
    public void numeric_overflowTest() throws IOException, RecognitionException {
        assertFile("numeric_overflow.orderly");
    }

    @Test
    public void rubbishTest() throws IOException, RecognitionException {
        assertFile("rubbish.orderly");
    }

    @Test
    public void unionTest() throws IOException, RecognitionException {
        assertFile("union.orderly");
    }

    @Test
    public void unterminated_stringTest() throws IOException, RecognitionException {
        assertFile("unterminated_string.orderly");
    }
}
