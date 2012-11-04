// $ANTLR 3.4 Orderly.g 2012-11-04 19:20:17

package net.guax.jorderly.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class OrderlyLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public OrderlyLexer() {} 
    public OrderlyLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public OrderlyLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "Orderly.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:11:7: ( '*' )
            // Orderly.g:11:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:12:7: ( ',' )
            // Orderly.g:12:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:13:7: ( ':' )
            // Orderly.g:13:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:14:7: ( ';' )
            // Orderly.g:14:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:15:7: ( '<' )
            // Orderly.g:15:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:16:7: ( '=' )
            // Orderly.g:16:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:17:7: ( '>' )
            // Orderly.g:17:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:18:7: ( '?' )
            // Orderly.g:18:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:19:7: ( '[' )
            // Orderly.g:19:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:20:7: ( ']' )
            // Orderly.g:20:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:21:7: ( 'any' )
            // Orderly.g:21:9: 'any'
            {
            match("any"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:22:7: ( 'array' )
            // Orderly.g:22:9: 'array'
            {
            match("array"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:23:7: ( 'boolean' )
            // Orderly.g:23:9: 'boolean'
            {
            match("boolean"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:24:7: ( 'in' )
            // Orderly.g:24:9: 'in'
            {
            match("in"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:25:7: ( 'integer' )
            // Orderly.g:25:9: 'integer'
            {
            match("integer"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:26:7: ( 'number' )
            // Orderly.g:26:9: 'number'
            {
            match("number"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:27:7: ( 'object' )
            // Orderly.g:27:9: 'object'
            {
            match("object"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:28:7: ( 'string' )
            // Orderly.g:28:9: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:29:7: ( 'union' )
            // Orderly.g:29:9: 'union'
            {
            match("union"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:30:7: ( '{' )
            // Orderly.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:31:7: ( '}' )
            // Orderly.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // Orderly.g:131:14: ( ( '-' | '+' )? ( DIGIT | '1' .. '9' ( DIGIT )+ ) )
            // Orderly.g:131:16: ( '-' | '+' )? ( DIGIT | '1' .. '9' ( DIGIT )+ )
            {
            // Orderly.g:131:16: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // Orderly.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Orderly.g:131:30: ( DIGIT | '1' .. '9' ( DIGIT )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0 >= '1' && LA3_0 <= '9')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1 >= '0' && LA3_1 <= '9')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;
                }
            }
            else if ( (LA3_0=='0') ) {
                alt3=1;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // Orderly.g:131:31: DIGIT
                    {
                    mDIGIT(); 


                    }
                    break;
                case 2 :
                    // Orderly.g:131:39: '1' .. '9' ( DIGIT )+
                    {
                    matchRange('1','9'); 

                    // Orderly.g:131:48: ( DIGIT )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // Orderly.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "EXP"
    public final void mEXP() throws RecognitionException {
        try {
            // Orderly.g:129:14: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
            // Orderly.g:129:16: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Orderly.g:129:30: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Orderly.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // Orderly.g:129:42: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Orderly.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXP"

    // $ANTLR start "FRAC"
    public final void mFRAC() throws RecognitionException {
        try {
            // Orderly.g:132:4: ( '.' ( DIGIT )+ )
            // Orderly.g:132:6: '.' ( DIGIT )+
            {
            match('.'); 

            // Orderly.g:132:10: ( DIGIT )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Orderly.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FRAC"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:136:5: ( INT ( FRAC )? ( EXP )? )
            // Orderly.g:136:7: INT ( FRAC )? ( EXP )?
            {
            mINT(); 


            // Orderly.g:136:11: ( FRAC )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // Orderly.g:136:11: FRAC
                    {
                    mFRAC(); 


                    }
                    break;

            }


            // Orderly.g:136:17: ( EXP )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // Orderly.g:136:17: EXP
                    {
                    mEXP(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "NULL"
    public final void mNULL() throws RecognitionException {
        try {
            int _type = NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:140:5: ( 'null' )
            // Orderly.g:140:7: 'null'
            {
            match("null"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NULL"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:144:5: ( 'true' )
            // Orderly.g:144:7: 'true'
            {
            match("true"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:148:5: ( 'false' )
            // Orderly.g:148:7: 'false'
            {
            match("false"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "EscapeSequence"
    public final void mEscapeSequence() throws RecognitionException {
        try {
            // Orderly.g:152:9: ( '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // Orderly.g:152:13: '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            // Orderly.g:152:18: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            int alt9=9;
            switch ( input.LA(1) ) {
            case 'u':
                {
                alt9=1;
                }
                break;
            case 'b':
                {
                alt9=2;
                }
                break;
            case 't':
                {
                alt9=3;
                }
                break;
            case 'n':
                {
                alt9=4;
                }
                break;
            case 'f':
                {
                alt9=5;
                }
                break;
            case 'r':
                {
                alt9=6;
                }
                break;
            case '\"':
                {
                alt9=7;
                }
                break;
            case '\'':
                {
                alt9=8;
                }
                break;
            case '\\':
                {
                alt9=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // Orderly.g:152:19: UnicodeEscape
                    {
                    mUnicodeEscape(); 


                    }
                    break;
                case 2 :
                    // Orderly.g:152:34: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // Orderly.g:152:38: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // Orderly.g:152:42: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // Orderly.g:152:46: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // Orderly.g:152:50: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // Orderly.g:152:54: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // Orderly.g:152:59: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // Orderly.g:152:64: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;

            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EscapeSequence"

    // $ANTLR start "UnicodeEscape"
    public final void mUnicodeEscape() throws RecognitionException {
        try {
            // Orderly.g:156:5: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // Orderly.g:156:7: 'u' HexDigit HexDigit HexDigit HexDigit
            {
            match('u'); 

            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            mHexDigit(); 


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UnicodeEscape"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // Orderly.g:160:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
            // Orderly.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Orderly.g:164:5: ( '0' .. '9' )
            // Orderly.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "REGEX"
    public final void mREGEX() throws RecognitionException {
        try {
            int _type = REGEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:168:2: ( '/' ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )* '/' )
            // Orderly.g:168:4: '/' ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )* '/'
            {
            match('/'); 

            // Orderly.g:168:8: ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( (LA10_0=='\\') ) {
                    alt10=1;
                }
                else if ( ((LA10_0 >= ' ' && LA10_0 <= '.')||(LA10_0 >= '0' && LA10_0 <= '[')||(LA10_0 >= ']' && LA10_0 <= '\uFFFF')) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // Orderly.g:168:10: '\\\\' .
            	    {
            	    match('\\'); 

            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // Orderly.g:168:19: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' )
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "REGEX"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:171:9: ( '\"' ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // Orderly.g:172:5: '\"' ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 

            // Orderly.g:172:9: ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='\\') ) {
                    alt11=1;
                }
                else if ( ((LA11_0 >= ' ' && LA11_0 <= '!')||(LA11_0 >= '#' && LA11_0 <= '[')||(LA11_0 >= ']' && LA11_0 <= '\uFFFF')) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // Orderly.g:172:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // Orderly.g:172:28: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
            	    {
            	    if ( (input.LA(1) >= ' ' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "IDENTIFIER"
    public final void mIDENTIFIER() throws RecognitionException {
        try {
            int _type = IDENTIFIER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:176:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )* )
            // Orderly.g:176:7: ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )*
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // Orderly.g:176:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Orderly.g:
            	    {
            	    if ( input.LA(1)=='-'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IDENTIFIER"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:179:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // Orderly.g:179:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // Orderly.g:179:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0 >= '\t' && LA13_0 <= '\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // Orderly.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Orderly.g:181:9: ( ( '//' | '#' ) ( . )* ( '\\n' | '\\r' ) )
            // Orderly.g:181:11: ( '//' | '#' ) ( . )* ( '\\n' | '\\r' )
            {
            // Orderly.g:181:11: ( '//' | '#' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='/') ) {
                alt14=1;
            }
            else if ( (LA14_0=='#') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // Orderly.g:181:12: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 2 :
                    // Orderly.g:181:19: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            // Orderly.g:181:25: ( . )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                    alt15=2;
                }
                else if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // Orderly.g:181:25: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    public void mTokens() throws RecognitionException {
        // Orderly.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | NUMBER | NULL | TRUE | FALSE | REGEX | STRING | IDENTIFIER | WS | COMMENT )
        int alt16=30;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // Orderly.g:1:10: T__20
                {
                mT__20(); 


                }
                break;
            case 2 :
                // Orderly.g:1:16: T__21
                {
                mT__21(); 


                }
                break;
            case 3 :
                // Orderly.g:1:22: T__22
                {
                mT__22(); 


                }
                break;
            case 4 :
                // Orderly.g:1:28: T__23
                {
                mT__23(); 


                }
                break;
            case 5 :
                // Orderly.g:1:34: T__24
                {
                mT__24(); 


                }
                break;
            case 6 :
                // Orderly.g:1:40: T__25
                {
                mT__25(); 


                }
                break;
            case 7 :
                // Orderly.g:1:46: T__26
                {
                mT__26(); 


                }
                break;
            case 8 :
                // Orderly.g:1:52: T__27
                {
                mT__27(); 


                }
                break;
            case 9 :
                // Orderly.g:1:58: T__28
                {
                mT__28(); 


                }
                break;
            case 10 :
                // Orderly.g:1:64: T__29
                {
                mT__29(); 


                }
                break;
            case 11 :
                // Orderly.g:1:70: T__30
                {
                mT__30(); 


                }
                break;
            case 12 :
                // Orderly.g:1:76: T__31
                {
                mT__31(); 


                }
                break;
            case 13 :
                // Orderly.g:1:82: T__32
                {
                mT__32(); 


                }
                break;
            case 14 :
                // Orderly.g:1:88: T__33
                {
                mT__33(); 


                }
                break;
            case 15 :
                // Orderly.g:1:94: T__34
                {
                mT__34(); 


                }
                break;
            case 16 :
                // Orderly.g:1:100: T__35
                {
                mT__35(); 


                }
                break;
            case 17 :
                // Orderly.g:1:106: T__36
                {
                mT__36(); 


                }
                break;
            case 18 :
                // Orderly.g:1:112: T__37
                {
                mT__37(); 


                }
                break;
            case 19 :
                // Orderly.g:1:118: T__38
                {
                mT__38(); 


                }
                break;
            case 20 :
                // Orderly.g:1:124: T__39
                {
                mT__39(); 


                }
                break;
            case 21 :
                // Orderly.g:1:130: T__40
                {
                mT__40(); 


                }
                break;
            case 22 :
                // Orderly.g:1:136: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 23 :
                // Orderly.g:1:143: NULL
                {
                mNULL(); 


                }
                break;
            case 24 :
                // Orderly.g:1:148: TRUE
                {
                mTRUE(); 


                }
                break;
            case 25 :
                // Orderly.g:1:153: FALSE
                {
                mFALSE(); 


                }
                break;
            case 26 :
                // Orderly.g:1:159: REGEX
                {
                mREGEX(); 


                }
                break;
            case 27 :
                // Orderly.g:1:165: STRING
                {
                mSTRING(); 


                }
                break;
            case 28 :
                // Orderly.g:1:172: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 29 :
                // Orderly.g:1:183: WS
                {
                mWS(); 


                }
                break;
            case 30 :
                // Orderly.g:1:186: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\13\uffff\7\33\3\uffff\2\24\2\33\5\uffff\3\33\1\60\5\33\1\24\2\33"+
        "\1\53\1\uffff\1\72\3\33\1\uffff\6\33\1\24\2\33\1\uffff\4\33\1\111"+
        "\3\33\1\115\1\33\1\117\3\33\1\uffff\2\33\1\125\1\uffff\1\126\1\uffff"+
        "\2\33\1\131\1\132\1\133\2\uffff\1\134\1\135\5\uffff";
    static final String DFA16_eofS =
        "\136\uffff";
    static final String DFA16_minS =
        "\1\11\12\uffff\1\156\1\157\1\156\1\165\1\142\1\164\1\156\3\uffff"+
        "\2\55\1\162\1\141\1\40\4\uffff\1\171\1\162\1\157\1\55\1\154\1\152"+
        "\1\162\1\151\1\53\1\55\1\165\1\154\1\0\1\uffff\1\55\1\141\1\154"+
        "\1\145\1\uffff\1\142\1\154\1\145\1\151\1\157\1\60\1\55\1\145\1\163"+
        "\1\uffff\1\171\1\145\1\147\1\145\1\55\1\143\2\156\1\55\1\145\1\55"+
        "\1\141\1\145\1\162\1\uffff\1\164\1\147\1\55\1\uffff\1\55\1\uffff"+
        "\1\156\1\162\3\55\2\uffff\2\55\5\uffff";
    static final String DFA16_maxS =
        "\1\175\12\uffff\1\162\1\157\1\156\1\165\1\142\1\164\1\156\3\uffff"+
        "\2\172\1\162\1\141\1\uffff\4\uffff\1\171\1\162\1\157\1\172\1\155"+
        "\1\152\1\162\1\151\1\71\1\172\1\165\1\154\1\uffff\1\uffff\1\172"+
        "\1\141\1\154\1\145\1\uffff\1\142\1\154\1\145\1\151\1\157\1\71\1"+
        "\172\1\145\1\163\1\uffff\1\171\1\145\1\147\1\145\1\172\1\143\2\156"+
        "\1\172\1\145\1\172\1\141\1\145\1\162\1\uffff\1\164\1\147\1\172\1"+
        "\uffff\1\172\1\uffff\1\156\1\162\3\172\2\uffff\2\172\5\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\7\uffff\1\24"+
        "\1\25\1\26\5\uffff\1\33\1\34\1\35\1\36\15\uffff\1\32\4\uffff\1\16"+
        "\11\uffff\1\13\16\uffff\1\27\3\uffff\1\30\1\uffff\1\14\5\uffff\1"+
        "\23\1\31\2\uffff\1\20\1\21\1\22\1\15\1\17";
    static final String DFA16_specialS =
        "\52\uffff\1\0\63\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\34\2\uffff\1\34\22\uffff\1\34\1\uffff\1\32\1\35\6\uffff\1"+
            "\1\1\24\1\2\1\24\1\uffff\1\31\1\26\11\25\1\3\1\4\1\5\1\6\1\7"+
            "\1\10\1\uffff\32\33\1\11\1\uffff\1\12\3\uffff\1\13\1\14\3\33"+
            "\1\30\2\33\1\15\4\33\1\16\1\17\3\33\1\20\1\27\1\21\5\33\1\22"+
            "\1\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\36\3\uffff\1\37",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "",
            "",
            "",
            "\1\33\2\uffff\12\47\7\uffff\4\33\1\46\25\33\4\uffff\1\33\1"+
            "\uffff\4\33\1\46\25\33",
            "\1\33\2\uffff\12\33\7\uffff\4\33\1\46\25\33\4\uffff\1\33\1"+
            "\uffff\4\33\1\46\25\33",
            "\1\50",
            "\1\51",
            "\17\53\1\52\uffd0\53",
            "",
            "",
            "",
            "",
            "\1\54",
            "\1\55",
            "\1\56",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\23\33"+
            "\1\57\6\33",
            "\1\62\1\61",
            "\1\63",
            "\1\64",
            "\1\65",
            "\1\24\1\uffff\1\66\2\uffff\12\67",
            "\1\33\2\uffff\12\47\7\uffff\4\33\1\46\25\33\4\uffff\1\33\1"+
            "\uffff\4\33\1\46\25\33",
            "\1\70",
            "\1\71",
            "\0\35",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\73",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\67",
            "\1\33\2\uffff\12\67\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\103",
            "\1\104",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\116",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\120",
            "\1\121",
            "\1\122",
            "",
            "\1\123",
            "\1\124",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "\1\127",
            "\1\130",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\33\2\uffff\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
    static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
    static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
    static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
    static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
    static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
    static final short[][] DFA16_transition;

    static {
        int numStates = DFA16_transitionS.length;
        DFA16_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
        }
    }

    class DFA16 extends DFA {

        public DFA16(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 16;
            this.eot = DFA16_eot;
            this.eof = DFA16_eof;
            this.min = DFA16_min;
            this.max = DFA16_max;
            this.accept = DFA16_accept;
            this.special = DFA16_special;
            this.transition = DFA16_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | NUMBER | NULL | TRUE | FALSE | REGEX | STRING | IDENTIFIER | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_42 = input.LA(1);

                        s = -1;
                        if ( ((LA16_42 >= '\u0000' && LA16_42 <= '\uFFFF')) ) {s = 29;}

                        else s = 43;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 16, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

}