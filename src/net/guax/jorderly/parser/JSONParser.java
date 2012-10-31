// $ANTLR 3.4 JSON.g 2012-10-30 22:53:23

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
            if (this.expectedProperty instanceof JsonArray && JsonArray.class.cast(this.expectedProperty).inArray) {
                return JsonArray.class.cast(this.expectedProperty).getProperty(type);
            }

            return this.expectedProperty;
        }



    // $ANTLR start "jsonDocument"
    // JSON.g:37:1: jsonDocument :{...}? jsonValue ;
    public final void jsonDocument() throws RecognitionException {
        try {
            // JSON.g:38:2: ({...}? jsonValue )
            // JSON.g:38:4: {...}? jsonValue
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
    // JSON.g:99:1: jsonBooleanLiteral : ( TRUE | FALSE );
    public final void jsonBooleanLiteral() throws RecognitionException {
        try {
            // JSON.g:100:5: ( TRUE | FALSE )
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
    // JSON.g:104:1: jsonObject : ( '{' '}' | '{' jsonMemberList '}' );
    public final void jsonObject() throws RecognitionException {
        try {
            // JSON.g:105:5: ( '{' '}' | '{' jsonMemberList '}' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==24) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==25) ) {
                    alt1=1;
                }
                else if ( (LA1_1==STRING) ) {
                    alt1=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // JSON.g:105:7: '{' '}'
                    {
                    match(input,24,FOLLOW_24_in_jsonObject570); 

                    match(input,25,FOLLOW_25_in_jsonObject572); 

                    }
                    break;
                case 2 :
                    // JSON.g:106:7: '{' jsonMemberList '}'
                    {
                    match(input,24,FOLLOW_24_in_jsonObject580); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonObject582);
                    jsonMemberList();

                    state._fsp--;


                    match(input,25,FOLLOW_25_in_jsonObject584); 

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
    // JSON.g:108:1: jsonValue : ({...}? NULL |{...}? jsonBooleanLiteral |{...}?string= STRING {...}?|{...}?number= NUMBER {...}?|{...}? jsonObject |{...}? jsonArray );
    public final void jsonValue() throws RecognitionException {
        Token string=null;
        Token number=null;


                JsonProperty expected = this.expectedProperty;
                expected.setInput(this.input);

                boolean isAny = this.expectedProperty instanceof JsonAny;
            
        try {
            // JSON.g:116:5: ({...}? NULL |{...}? jsonBooleanLiteral |{...}?string= STRING {...}?|{...}?number= NUMBER {...}?|{...}? jsonObject |{...}? jsonArray )
            int alt2=6;
            switch ( input.LA(1) ) {
            case NULL:
                {
                alt2=1;
                }
                break;
            case FALSE:
            case TRUE:
                {
                alt2=2;
                }
                break;
            case STRING:
                {
                alt2=3;
                }
                break;
            case NUMBER:
                {
                alt2=4;
                }
                break;
            case 24:
                {
                alt2=5;
                }
                break;
            case 22:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // JSON.g:116:7: {...}? NULL
                    {
                    if ( !(( this.expectedProperty.allow(JsonNull.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonNull.class) ");
                    }

                    match(input,NULL,FOLLOW_NULL_in_jsonValue614); 

                    }
                    break;
                case 2 :
                    // JSON.g:117:7: {...}? jsonBooleanLiteral
                    {
                    if ( !(( this.expectedProperty.allow(JsonBoolean.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonBoolean.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonBoolean.class.getName());

                    pushFollow(FOLLOW_jsonBooleanLiteral_in_jsonValue626);
                    jsonBooleanLiteral();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // JSON.g:118:7: {...}?string= STRING {...}?
                    {
                    if ( !(( this.expectedProperty.allow(JsonString.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonString.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonString.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    string=(Token)match(input,STRING,FOLLOW_STRING_in_jsonValue640); 

                    if ( !(( isAny || JsonString.class.cast(this.expectedProperty).isValid(string.getText()) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " isAny || JsonString.class.cast(this.expectedProperty).isValid($string.getText()) ");
                    }

                    }
                    break;
                case 4 :
                    // JSON.g:119:7: {...}?number= NUMBER {...}?
                    {
                    if ( !(( this.expectedProperty.allow(JsonNumber.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonNumber.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonNumber.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    number=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_jsonValue656); 

                    if ( !(( isAny || JsonNumber.class.cast(this.expectedProperty).isValidNumber(number.getText()) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " isAny || JsonNumber.class.cast(this.expectedProperty).isValidNumber($number.getText()) ");
                    }

                    }
                    break;
                case 5 :
                    // JSON.g:120:7: {...}? jsonObject
                    {
                    if ( !(( this.expectedProperty.allow(JsonObject.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonObject.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonObject.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                    pushFollow(FOLLOW_jsonObject_in_jsonValue670);
                    jsonObject();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // JSON.g:121:7: {...}? jsonArray
                    {
                    if ( !(( this.expectedProperty.allow(JsonArray.class) )) ) {
                        throw new FailedPredicateException(input, "jsonValue", " this.expectedProperty.allow(JsonArray.class) ");
                    }

                    this.expectedProperty = resolvArrayContext(JsonArray.class.getName()); isAny = this.expectedProperty instanceof JsonAny;

                     if(!isAny) {JsonArray.class.cast(this.expectedProperty).setInArray(true);} 

                    pushFollow(FOLLOW_jsonArray_in_jsonValue684);
                    jsonArray();

                    state._fsp--;


                     if(!isAny) {  JsonArray.class.cast(this.expectedProperty).setInArray(false); }

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
    // JSON.g:124:1: jsonMember : STRING ':' jsonValue ;
    public final void jsonMember() throws RecognitionException {
        try {
            // JSON.g:125:5: ( STRING ':' jsonValue )
            // JSON.g:125:7: STRING ':' jsonValue
            {
            match(input,STRING,FOLLOW_STRING_in_jsonMember707); 

            match(input,21,FOLLOW_21_in_jsonMember709); 

            pushFollow(FOLLOW_jsonValue_in_jsonMember711);
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
    // $ANTLR end "jsonMember"



    // $ANTLR start "jsonMemberList"
    // JSON.g:128:1: jsonMemberList : jsonMember ( ',' jsonMemberList )? ;
    public final void jsonMemberList() throws RecognitionException {
        try {
            // JSON.g:129:5: ( jsonMember ( ',' jsonMemberList )? )
            // JSON.g:129:7: jsonMember ( ',' jsonMemberList )?
            {
            pushFollow(FOLLOW_jsonMember_in_jsonMemberList728);
            jsonMember();

            state._fsp--;


            // JSON.g:129:18: ( ',' jsonMemberList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // JSON.g:129:19: ',' jsonMemberList
                    {
                    match(input,20,FOLLOW_20_in_jsonMemberList731); 

                    pushFollow(FOLLOW_jsonMemberList_in_jsonMemberList733);
                    jsonMemberList();

                    state._fsp--;


                    }
                    break;

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
    // $ANTLR end "jsonMemberList"



    // $ANTLR start "jsonArray"
    // JSON.g:132:1: jsonArray : ( '[' {...}? ']' | '[' jsonElementList ']' );
    public final void jsonArray() throws RecognitionException {
        try {
            // JSON.g:133:5: ( '[' {...}? ']' | '[' jsonElementList ']' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==22) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==23) ) {
                    alt4=1;
                }
                else if ( (LA4_1==FALSE||(LA4_1 >= NULL && LA4_1 <= NUMBER)||(LA4_1 >= STRING && LA4_1 <= TRUE)||LA4_1==22||LA4_1==24) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // JSON.g:133:7: '[' {...}? ']'
                    {
                    match(input,22,FOLLOW_22_in_jsonArray752); 

                    if ( !((JsonArray.class.cast(this.expectedProperty).inRange(0))) ) {
                        throw new FailedPredicateException(input, "jsonArray", "JsonArray.class.cast(this.expectedProperty).inRange(0)");
                    }

                    match(input,23,FOLLOW_23_in_jsonArray756); 

                    }
                    break;
                case 2 :
                    // JSON.g:134:7: '[' jsonElementList ']'
                    {
                    match(input,22,FOLLOW_22_in_jsonArray764); 

                    pushFollow(FOLLOW_jsonElementList_in_jsonArray766);
                    jsonElementList();

                    state._fsp--;


                    match(input,23,FOLLOW_23_in_jsonArray768); 

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



    // $ANTLR start "jsonElementList"
    // JSON.g:137:1: jsonElementList : jsonValue ( ',' jsonValue )* {...}?;
    public final void jsonElementList() throws RecognitionException {

                int length = 0;
            
        try {
            // JSON.g:141:5: ( jsonValue ( ',' jsonValue )* {...}?)
            // JSON.g:141:7: jsonValue ( ',' jsonValue )* {...}?
            {
            pushFollow(FOLLOW_jsonValue_in_jsonElementList794);
            jsonValue();

            state._fsp--;


            length++;

            // JSON.g:141:29: ( ',' jsonValue )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==20) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // JSON.g:141:30: ',' jsonValue
            	    {
            	    match(input,20,FOLLOW_20_in_jsonElementList799); 

            	    pushFollow(FOLLOW_jsonValue_in_jsonElementList801);
            	    jsonValue();

            	    state._fsp--;


            	    length++;

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            if ( !((JsonArray.class.cast(this.expectedProperty).inRange(length))) ) {
                throw new FailedPredicateException(input, "jsonElementList", "JsonArray.class.cast(this.expectedProperty).inRange(length)");
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
    // $ANTLR end "jsonElementList"

    // Delegated rules


 

    public static final BitSet FOLLOW_jsonValue_in_jsonDocument53 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_jsonObject570 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_jsonObject572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_jsonObject580 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonObject582 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_jsonObject584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_in_jsonValue614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonBooleanLiteral_in_jsonValue626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonValue640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_jsonValue656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonObject_in_jsonValue670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonArray_in_jsonValue684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_jsonMember707 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_jsonMember709 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonMember711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonMember_in_jsonMemberList728 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_jsonMemberList731 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_jsonMemberList_in_jsonMemberList733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_jsonArray752 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_jsonArray756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_jsonArray764 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonElementList_in_jsonArray766 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_jsonArray768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList794 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_20_in_jsonElementList799 = new BitSet(new long[]{0x0000000001436100L});
    public static final BitSet FOLLOW_jsonValue_in_jsonElementList801 = new BitSet(new long[]{0x0000000000100002L});

}