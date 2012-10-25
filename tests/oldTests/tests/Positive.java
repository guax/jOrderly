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
public class Positive {

    public Positive() {
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
        assertFile(filename, 0);
    }

    protected void assertFile(String filename, int expectedErrors) throws IOException, RecognitionException {
        CharStream stream = new ANTLRFileStream("tests/positive_cases/" + filename);
        OrderlyLexer lexer = new OrderlyLexer(stream);
        TokenStream tokenStream = new CommonTokenStream(lexer);
        OrderlyParser parser = new OrderlyParser(tokenStream);

        parser.orderly_schema();
        assertEquals(expectedErrors, parser.getNumberOfSyntaxErrors());
    }

    @Test
    public void additionalTest() throws IOException, RecognitionException {
        assertFile("additional.orderly");
    }

    @Test
    public void additional_anyTest() throws IOException, RecognitionException {
        assertFile("additional_any.orderly");
    }

    @Test
    public void array_any_closedTest() throws IOException, RecognitionException {
        assertFile("array_any_closed.orderly");
    }

    @Test
    public void array_typingTest() throws IOException, RecognitionException {
        assertFile("array_typing.orderly");
    }

    @Test
    public void default_valuesTest() throws IOException, RecognitionException {
        assertFile("default_values.orderly");
    }

    @Test
    public void enum_valuesTest() throws IOException, RecognitionException {
        assertFile("enum_values.orderly");
    }

    @Test
    public void mediumTest() throws IOException, RecognitionException {
        assertFile("medium.orderly");
    }

    @Test
    public void objectTest() throws IOException, RecognitionException {
        assertFile("object.orderly");
    }

    @Test
    public void optionalTest() throws IOException, RecognitionException {
        assertFile("optional.orderly");
    }

    @Test
    public void patternTest() throws IOException, RecognitionException {
        assertFile("pattern.orderly");
    }

    @Test
    public void rangesTest() throws IOException, RecognitionException {
        assertFile("ranges.orderly");
    }

    @Test
    public void requiresTest() throws IOException, RecognitionException {
        assertFile("requires.orderly");
    }

    @Test
    public void stringTest() throws IOException, RecognitionException {
        assertFile("string.orderly");
    }

    @Test
    public void typesTest() throws IOException, RecognitionException {
        assertFile("types.orderly");
    }

    @Test
    public void unionTest() throws IOException, RecognitionException {
        assertFile("union.orderly");
    }
}
