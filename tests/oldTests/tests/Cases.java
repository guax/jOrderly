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
public class Cases {

    public Cases() {
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
        CharStream stream = new ANTLRFileStream("tests/cases/" + filename);
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
    public void array_with_rangeTest() throws IOException, RecognitionException {
        assertFile("array_with_range.orderly");
    }

    @Test
    public void comment_at_eolTest() throws IOException, RecognitionException {
        assertFile("comment_at_eol.orderly");
    }

    @Test
    public void commentsTest() throws IOException, RecognitionException {
        assertFile("comments.orderly", 1);
    }

    @Test
    public void complexTest() throws IOException, RecognitionException {
        assertFile("complex.orderly");
    }

    @Test
    public void default_valueTest() throws IOException, RecognitionException {
        assertFile("default_value.orderly");
    }

    @Test
    public void default_values_in_objectTest() throws IOException, RecognitionException {
        assertFile("default_values_in_object.orderly");
    }

    @Test
    public void double_with_rangeTest() throws IOException, RecognitionException {
        assertFile("double_with_range.orderly");
    }

    @Test
    public void emptyTest() throws IOException, RecognitionException {
        assertFile("empty.orderly", 1);
    }

    @Test
    public void enum_valuesTest() throws IOException, RecognitionException {
        assertFile("enum_values.orderly");
    }

    @Test
    public void enum_values_in_objectTest() throws IOException, RecognitionException {
        assertFile("enum_values_in_object.orderly");
    }

    @Test
    public void integer_with_rangeTest() throws IOException, RecognitionException {
        assertFile("integer_with_range.orderly");
    }

    @Test
    public void json_stringTest() throws IOException, RecognitionException {
        assertFile("json_string.orderly");
    }

    @Test
    public void nullTest() throws IOException, RecognitionException {
        assertFile("null.orderly");
    }

    @Test
    public void null_with_default_valueTest() throws IOException, RecognitionException {
        assertFile("null_with_default_value.orderly");
    }

    @Test
    public void null_with_enum_valueTest() throws IOException, RecognitionException {
        assertFile("null_with_enum_value.orderly");
    }

    @Test
    public void null_with_optionalTest() throws IOException, RecognitionException {
        assertFile("null_with_optional.orderly");
    }

    @Test
    public void null_with_requiresTest() throws IOException, RecognitionException {
        assertFile("null_with_requires.orderly");
    }

    @Test
    public void objectTest() throws IOException, RecognitionException {
        assertFile("object.orderly");
    }

    @Test
    public void optional_specificationTest() throws IOException, RecognitionException {
        assertFile("optional_specification.orderly");
    }

    @Test
    public void property_namesTest() throws IOException, RecognitionException {
        assertFile("property_names.orderly", 1);
    }

    @Test
    public void regexTest() throws IOException, RecognitionException {
        assertFile("regex.orderly");
    }

    @Test
    public void required_propertyTest() throws IOException, RecognitionException {
        assertFile("required_property.orderly");
    }

    @Test
    public void stringTest() throws IOException, RecognitionException {
        assertFile("string.orderly");
    }

    @Test
    public void string_with_rangeTest() throws IOException, RecognitionException {
        assertFile("string_with_range.orderly");
    }

    @Test
    public void unionTest() throws IOException, RecognitionException {
        assertFile("union.orderly");
    }
}
