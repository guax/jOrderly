// $ANTLR 3.4 JSON.g 2012-11-04 19:20:18

package net.guax.jorderly.parser;

import java.util.HashMap;
import net.guax.jorderly.json.*;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JSONParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIGIT", "EXP", "EscapeSequence", "FALSE", "FRAC", "HexDigit", "IDENTIFIER", "INT", "NULL", "NUMBER", "REGEX", "STRING", "TRUE", "UnicodeEscape", "WS", "','", "':'", "'['", "']'", "'{'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int COMMENT=4;
    public static final int DIGIT=5;
    public static final int EXP=6;
    public static final int EscapeSequence=7;
    public static final int FALSE=8;
    public static final int FRAC=9;
    public static final int HexDigit=10;
    public static final int IDENTIFIER=11;
    public static final int INT=12;
    public static final int NULL=13;
    public static final int NUMBER=14;
    public static final int REGEX=15;
    public static final int STRING=16;
    public static final int TRUE=17;
    public static final int UnicodeEscape=18;
    public static final int WS=19;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public JSONParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return JSONParser.tokenNames; }
    public String getGrammarFileName() { return "JSON.g"; }


        JsonProperty expectedProperty;

        JsonProperty validationTree;

        public void setValidationTree(JsonProperty validationTree) {
        	this.validationTree = this.expectedProperty = validationTree;
        }

        public JsonProperty resolvArrayContext(String type) {
            if (this.expectedProperty instanceof JsonArray && JsonArray.class.cast(this.expectedProperty).inside) {
                JsonProperty resolvedObject = JsonArray.class.cast(this.expectedProperty).getProperty(type);
                resolvedObject.setInput(this.input);
                return resolvedObject;
            }

            return this.expectedProperty;
        }



    // $ANTLR start "jsonDocument"
    // JSON.g:39:1: jsonDocument :{...}? jsonValue ;
    public final void jsonDocument() throws RecognitionException {
        try {
            // JSON.g:40:2: ({...}? jsonValue )
            // JSON.g:40:4: {...}? jsonValue
            {
            if ( !((this.validationTree != null)) ) {
                throw new FailedPredicateException(input, "jsonDocument", "this.validationTree != null");
            }

            pushFollow(FOLLOW_jsonValue_in_jsonDocument53);
            jsonValue();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonDocument"



    // $ANTLR start "jsonBooleanLiteral"
    // JSON.g:101:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // JSON.g:102:5: ( TRUE | FALSE )
            // JSON.g:
            {
            if ( input.LA(1)==FALSE||input.LA(1)==TRUE ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonBooleanLiteral"



    // $ANTLR start "jsonObject"
    // JSON.g:106:1: jsonObject : ( '{' '}' {...}?| '{' jsonMember ( ',' jsonMember )* '}' {...}?);
    public final void jsonObject() throws RecognitionException {

                boolean isAny = this.expectedProperty instanceof JsonAny;
                JsonObject jo = null;
                
                if(!isAny) {
                    jo = JsonObject.class.cast(this.expectedProperty);
                    jo.startKeyMark();
                }
            
        try {
            // JSON.g:116:5: ( '{' '}' {...}?| '{' jsonMember ( ',' jsonMember )* '}' {...}?)
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==24) ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==25) ) {
                    alt2=1;
                }
                else if ( (LA2_1==STRING) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // JSON.g:116:7: '{' '}' {...}?
                    {
                    match(input,24,FOLLOW_24_in_jsonObject579); 

                    match(input,25,FOLLOW_25_in_jsonObject581); 

                    if ( !(((!isAny && jo.finishKeyMark()) || isAny)) ) {
                        throw new FailedPredicateException(input, "jsonObject", "(!isAny && jo.finishKeyMark()) || isAny");
                    }

                    }
                    break;
                case 2 :
                    // JSON.g:117:7: '{' jsonMember ( ',' jsonMember )* '}' {...}?
                    {
                    match(input,24,FOLLOW_24_in_jsonObject591); 

                    pushFollow(FOLLOW_jsonMember_in_jsonObject593);
                    jsonMember();

                    state._fsp--;


                    // JSON.g:117:22: ( ',' jsonMember )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==20) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // JSON.g:117:23: ',' jsonMember
                    	    {
                    	    match(input,20,FOLLOW_20_in_jsonObject596); 

                    	    pushFollow(FOLLOW_jsonMember_in_jsonObject598);
                    	    jsonMember();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    match(input,25,FOLLOW_25_in_jsonObject602); 

                    if ( !(((!isAny && jo.finishKeyMark()) || isAny)) ) {
                        throw new FailedPredicateException(input, "jsonObject", "(!isAny && jo.finishKeyMark()) || isAny");
                    }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonObject"



    // $ANTLR start "jsonValue"
    // JSON.g:120:1: jsonValue : ({...}? NULL |{...}? jsonBooleanLiteral |{...}?string= STRING {...}?|{...}?number= NUMBER {...}?|{...}? jsonObject |{...}? jsonArray );
    public final void jsonValue() throws RecognitionException {
        Token string=null;
        Token number=null;


                JsonProperty expected = this.expectedProperty;
                expected.setInput(this.input);

                boolean isAny = this.expectedProperty instanceof JsonAny;
            
        try {
            // JSON.g:129:5: ({...}? NULL |{...}? jsonBooleanLiteral |{...}?string= STRING {...}?|{...}?number= NUMBER {...}?|{...}? jsonObject |{...}? jsonArray )
            int alt3=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt3=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt3=2;
                }
                break;
            case STRING:
                {
                alt3=3;
                }
                break;
            case NUMBER:
                {
                alt3=4;
                }
                break;
            case 24:
                {
                alt3=5;
                }
                break;
            case 22:
                {
                alt3=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // JSON.g:129:7: {...}? NULL
                    {
                    if ( !(( this.expectedProperty.allow(JsonNull.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonNull.class) ");
                    }

                    match(input,NULL,FOLLOW_NULL_in_jsonValue640); 

                    }
                    break;
                case 2 :
                    // JSON.g:131:7: {...}? jsonBooleanLiteral
                    {
                    if ( !(( this.expectedProperty.allow(JsonBoolean.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonBoolean.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonBoolean.class.getName());

                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue656);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // JSON.g:133:7: {...}?string= STRING {...}?
                    {
                    if ( !(( this.expectedProperty.allow(JsonString.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonString.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonString.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    string=(Token)match(input,STRING,FOLLOW_STRING_in_jsonValue675); 

                    if ( !(( isAny || JsonString.class.cast(this.expectedProperty).isValid(string.getText()) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " isAny || JsonString.class.cast(this.expectedProperty).isValid($string.getText()) ");
                    }

                    }
                    break;
                case 4 :
                    // JSON.g:135:7: {...}?number= NUMBER {...}?
                    {
                    if ( !(( this.expectedProperty.allow(JsonNumber.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonNumber.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonNumber.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue696); 

                    if ( !(( isAny || JsonNumber.class.cast(this.expectedProperty).isValidNumber(number.getText()) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " isAny || JsonNumber.class.cast(this.expectedProperty).isValidNumber($number.getText()) ");
                    }

                    }
                    break;
                case 5 :
                    // JSON.g:137:7: {...}? jsonObject
                    {
                    if ( !(( this.expectedProperty.allow(JsonObject.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonObject.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonObject.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    pushFollow(FOLLOW_jsonObject_in_jsonValue727);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // JSON.g:141:7: {...}? jsonArray
                    {
                    if ( !(( this.expectedProperty.allow(JsonArray.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonArray.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonArray.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                     if(!isAny) {JsonArray.class.cast(this.expectedProperty).setInside(true);} 

                    pushFollow(FOLLOW_jsonArray_in_jsonValue764);
                    jsonArray();

                    state._fsp--;


                     if(!isAny) {JsonArray.class.cast(this.expectedProperty).setInside(false); }

                    }
                    break;

            }
             this.expectedProperty = expected; 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonValue"



    // $ANTLR start "jsonMember"
    // JSON.g:148:1: jsonMember : property= STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        Token property=null;


                JsonProperty expected = this.expectedProperty;
                boolean isAny = this.expectedProperty instanceof JsonAny;
            
        try {
            // JSON.g:154:5: (property= STRING ':' jsonValue )
            // JSON.g:154:7: property= STRING ':' jsonValue
            {
            property=(Token)match(input,STRING,FOLLOW_STRING_in_jsonMember813); 


                    if(!isAny) {
                        String key = JsonString.trimQuotes(property.getText());
                        JsonObject jo = JsonObject.class.cast(expected);
                        jo.markKey(key);
                        this.expectedProperty = jo.getProperty(key);
                    }
                

            match(input,21,FOLLOW_21_in_jsonMember817); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember819);
            jsonValue();

            state._fsp--;


            }

             this.expectedProperty = expected; 
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonMember"



    // $ANTLR start "jsonArray"
    // JSON.g:164:1: jsonArray : ( '[' {...}? ']' | '[' jsonValue ( ',' jsonValue )* {...}? ']' );
    public final void jsonArray() throws RecognitionException {

                int length = 0;
            
        try {
            // JSON.g:168:5: ( '[' {...}? ']' | '[' jsonValue ( ',' jsonValue )* {...}? ']' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==22) ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1==23) ) {
                    alt5=1;
                }
                else if ( (LA5_1==FALSE||(LA5_1 >= NULL && LA5_1 <= NUMBER)||(LA5_1 >= STRING && LA5_1 <= TRUE)||LA5_1==22||LA5_1==24) ) {
                    alt5=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // JSON.g:168:7: '[' {...}? ']'
                    {
                    match(input,22,FOLLOW_22_in_jsonArray845); 

                    if ( !((JsonArray.class.cast(this.expectedProperty).inRange(0))) ) {
                        throw new FailedPredicateException(input, "jsonArray", "JsonArray.class.cast(this.expectedProperty).inRange(0)");
                    }

                    match(input,23,FOLLOW_23_in_jsonArray849); 

                    }
                    break;
                case 2 :
                    // JSON.g:169:7: '[' jsonValue ( ',' jsonValue )* {...}? ']'
                    {
                    match(input,22,FOLLOW_22_in_jsonArray857); 

                    pushFollow(FOLLOW_jsonValue_in_jsonArray859);
                    jsonValue();

                    state._fsp--;


                    length++;

                    // JSON.g:169:33: ( ',' jsonValue )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==20) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // JSON.g:169:34: ',' jsonValue
                    	    {
                    	    match(input,20,FOLLOW_20_in_jsonArray864); 

                    	    pushFollow(FOLLOW_jsonValue_in_jsonArray866);
                    	    jsonValue();

                    	    state._fsp--;


                    	    length++;

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    if ( !((JsonArray.class.cast(this.expectedProperty).inRange(length))) ) {
                        throw new FailedPredicateException(input, "jsonArray", "JsonArray.class.cast(this.expectedProperty).inRange(length)");
                    }

                    match(input,23,FOLLOW_23_in_jsonArray874); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "jsonArray"

    // Delegated rules


 

    public static final BitSet FOLLOW_jsonValue_in_jsonDocument53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_jsonObject579 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_jsonObject581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_jsonObject591 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMember_in_jsonObject593 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_20_in_jsonObject596 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMember_in_jsonObject598 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_25_in_jsonObject602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember813 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_jsonMember817 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_jsonArray845 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_jsonArray849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_jsonArray857 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray859 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_20_in_jsonArray864 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonArray866 = new BitSet(new long[]{0x0000000000900000L});
    public static final BitSet FOLLOW_23_in_jsonArray874 = new BitSet(new long[]{0x0000000000000002L});

}