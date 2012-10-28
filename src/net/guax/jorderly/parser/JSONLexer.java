// $ANTLR 3.4 JSON.g 2012-10-28 13:33:18

package net.guax.jorderly.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class JSONLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public JSONLexer() {} 
    public JSONLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public JSONLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "JSON.g"; }

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:11:7: ( ',' )
            // JSON.g:11:9: ','
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
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:12:7: ( ':' )
            // JSON.g:12:9: ':'
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
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:13:7: ( '[' )
            // JSON.g:13:9: '['
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
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:14:7: ( ']' )
            // JSON.g:14:9: ']'
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
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:15:7: ( '{' )
            // JSON.g:15:9: '{'
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
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // JSON.g:16:7: ( '}' )
            // JSON.g:16:9: '}'
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
    // $ANTLR end "T__25"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            // JSON.g:33:14: ( ( '-' | '+' )? ( DIGIT | '1' .. '9' ( DIGIT )+ ) )
            // JSON.g:33:16: ( '-' | '+' )? ( DIGIT | '1' .. '9' ( DIGIT )+ )
            {
            // JSON.g:33:16: ( '-' | '+' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='+'||LA1_0=='-') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // JSON.g:
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


            // JSON.g:33:30: ( DIGIT | '1' .. '9' ( DIGIT )+ )
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
                    // JSON.g:33:31: DIGIT
                    {
                    mDIGIT(); 


                    }
                    break;
                case 2 :
                    // JSON.g:33:39: '1' .. '9' ( DIGIT )+
                    {
                    matchRange('1','9'); 

                    // JSON.g:33:48: ( DIGIT )+
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
                    	    // JSON.g:
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
            // JSON.g:35:14: ( ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+ )
            // JSON.g:35:16: ( 'e' | 'E' ) ( '+' | '-' )? ( DIGIT )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // JSON.g:35:30: ( '+' | '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='+'||LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // JSON.g:
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


            // JSON.g:35:42: ( DIGIT )+
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
            	    // JSON.g:
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
            // JSON.g:38:4: ( '.' ( DIGIT )+ )
            // JSON.g:38:6: '.' ( DIGIT )+
            {
            match('.'); 

            // JSON.g:38:10: ( DIGIT )+
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
            	    // JSON.g:
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
            // JSON.g:42:5: ( INT ( FRAC )? ( EXP )? )
            // JSON.g:42:7: INT ( FRAC )? ( EXP )?
            {
            mINT(); 


            // JSON.g:42:11: ( FRAC )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // JSON.g:42:11: FRAC
                    {
                    mFRAC(); 


                    }
                    break;

            }


            // JSON.g:42:17: ( EXP )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='E'||LA8_0=='e') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // JSON.g:42:17: EXP
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
            // JSON.g:46:5: ( 'null' )
            // JSON.g:46:7: 'null'
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
            // JSON.g:50:5: ( 'true' )
            // JSON.g:50:7: 'true'
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
            // JSON.g:54:5: ( 'false' )
            // JSON.g:54:7: 'false'
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
            // JSON.g:58:9: ( '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' ) )
            // JSON.g:58:13: '\\\\' ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
            {
            match('\\'); 

            // JSON.g:58:18: ( UnicodeEscape | 'b' | 't' | 'n' | 'f' | 'r' | '\\\"' | '\\'' | '\\\\' )
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
                    // JSON.g:58:19: UnicodeEscape
                    {
                    mUnicodeEscape(); 


                    }
                    break;
                case 2 :
                    // JSON.g:58:34: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 3 :
                    // JSON.g:58:38: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // JSON.g:58:42: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 5 :
                    // JSON.g:58:46: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // JSON.g:58:50: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 7 :
                    // JSON.g:58:54: '\\\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 8 :
                    // JSON.g:58:59: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 9 :
                    // JSON.g:58:64: '\\\\'
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
            // JSON.g:62:5: ( 'u' HexDigit HexDigit HexDigit HexDigit )
            // JSON.g:62:7: 'u' HexDigit HexDigit HexDigit HexDigit
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
            // JSON.g:66:5: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
            // JSON.g:
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
            // JSON.g:70:5: ( '0' .. '9' )
            // JSON.g:
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
            // JSON.g:74:2: ( '/' ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )* '/' )
            // JSON.g:74:4: '/' ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )* '/'
            {
            match('/'); 

            // JSON.g:74:8: ( '\\\\' . |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' ) )*
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
            	    // JSON.g:74:10: '\\\\' .
            	    {
            	    match('\\'); 

            	    matchAny(); 

            	    }
            	    break;
            	case 2 :
            	    // JSON.g:74:19: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '/' )
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
            // JSON.g:77:9: ( '\"' ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"' )
            // JSON.g:78:5: '\"' ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )* '\"'
            {
            match('\"'); 

            // JSON.g:78:9: ( EscapeSequence |~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' ) )*
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
            	    // JSON.g:78:11: EscapeSequence
            	    {
            	    mEscapeSequence(); 


            	    }
            	    break;
            	case 2 :
            	    // JSON.g:78:28: ~ ( '\\u0000' .. '\\u001f' | '\\\\' | '\\\"' )
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
            // JSON.g:82:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )* )
            // JSON.g:82:7: ( 'a' .. 'z' | 'A' .. 'Z' | DIGIT ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )*
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // JSON.g:82:37: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '-' | DIGIT )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='-'||(LA12_0 >= '0' && LA12_0 <= '9')||(LA12_0 >= 'A' && LA12_0 <= 'Z')||LA12_0=='_'||(LA12_0 >= 'a' && LA12_0 <= 'z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // JSON.g:
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
            // JSON.g:85:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // JSON.g:85:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // JSON.g:85:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
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
            	    // JSON.g:
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
            // JSON.g:87:9: ( ( '//' | '#' ) ( . )* ( '\\n' | '\\r' ) )
            // JSON.g:87:11: ( '//' | '#' ) ( . )* ( '\\n' | '\\r' )
            {
            // JSON.g:87:11: ( '//' | '#' )
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
                    // JSON.g:87:12: '//'
                    {
                    match("//"); 



                    }
                    break;
                case 2 :
                    // JSON.g:87:19: '#'
                    {
                    match('#'); 

                    }
                    break;

            }


            // JSON.g:87:25: ( . )*
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
            	    // JSON.g:87:25: .
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
        // JSON.g:1:8: ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | NUMBER | NULL | TRUE | FALSE | REGEX | STRING | IDENTIFIER | WS | COMMENT )
        int alt16=15;
        alt16 = dfa16.predict(input);
        switch (alt16) {
            case 1 :
                // JSON.g:1:10: T__20
                {
                mT__20(); 


                }
                break;
            case 2 :
                // JSON.g:1:16: T__21
                {
                mT__21(); 


                }
                break;
            case 3 :
                // JSON.g:1:22: T__22
                {
                mT__22(); 


                }
                break;
            case 4 :
                // JSON.g:1:28: T__23
                {
                mT__23(); 


                }
                break;
            case 5 :
                // JSON.g:1:34: T__24
                {
                mT__24(); 


                }
                break;
            case 6 :
                // JSON.g:1:40: T__25
                {
                mT__25(); 


                }
                break;
            case 7 :
                // JSON.g:1:46: NUMBER
                {
                mNUMBER(); 


                }
                break;
            case 8 :
                // JSON.g:1:53: NULL
                {
                mNULL(); 


                }
                break;
            case 9 :
                // JSON.g:1:58: TRUE
                {
                mTRUE(); 


                }
                break;
            case 10 :
                // JSON.g:1:63: FALSE
                {
                mFALSE(); 


                }
                break;
            case 11 :
                // JSON.g:1:69: REGEX
                {
                mREGEX(); 


                }
                break;
            case 12 :
                // JSON.g:1:75: STRING
                {
                mSTRING(); 


                }
                break;
            case 13 :
                // JSON.g:1:82: IDENTIFIER
                {
                mIDENTIFIER(); 


                }
                break;
            case 14 :
                // JSON.g:1:93: WS
                {
                mWS(); 


                }
                break;
            case 15 :
                // JSON.g:1:96: COMMENT
                {
                mCOMMENT(); 


                }
                break;

        }

    }


    protected DFA16 dfa16 = new DFA16(this);
    static final String DFA16_eotS =
        "\10\uffff\2\7\3\17\5\uffff\1\17\1\7\3\17\1\30\1\uffff\1\17\1\7\3"+
        "\17\1\41\1\42\1\17\2\uffff\1\44\1\uffff";
    static final String DFA16_eofS =
        "\45\uffff";
    static final String DFA16_minS =
        "\1\11\7\uffff\2\55\1\165\1\162\1\141\1\40\4\uffff\1\53\1\55\1\154"+
        "\1\165\1\154\1\0\1\uffff\1\60\1\55\1\154\1\145\1\163\2\55\1\145"+
        "\2\uffff\1\55\1\uffff";
    static final String DFA16_maxS =
        "\1\175\7\uffff\2\172\1\165\1\162\1\141\1\uffff\4\uffff\1\71\1\172"+
        "\1\154\1\165\1\154\1\uffff\1\uffff\1\71\1\172\1\154\1\145\1\163"+
        "\2\172\1\145\2\uffff\1\172\1\uffff";
    static final String DFA16_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\14\1\15\1\16\1\17"+
        "\6\uffff\1\13\10\uffff\1\10\1\11\1\uffff\1\12";
    static final String DFA16_specialS =
        "\27\uffff\1\0\15\uffff}>";
    static final String[] DFA16_transitionS = {
            "\2\20\2\uffff\1\20\22\uffff\1\20\1\uffff\1\16\1\21\7\uffff\1"+
            "\7\1\1\1\7\1\uffff\1\15\1\11\11\10\1\2\6\uffff\32\17\1\3\1\uffff"+
            "\1\4\3\uffff\5\17\1\14\7\17\1\12\5\17\1\13\6\17\1\5\1\uffff"+
            "\1\6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\17\2\uffff\12\23\7\uffff\4\17\1\22\25\17\4\uffff\1\17\1"+
            "\uffff\4\17\1\22\25\17",
            "\1\17\2\uffff\12\17\7\uffff\4\17\1\22\25\17\4\uffff\1\17\1"+
            "\uffff\4\17\1\22\25\17",
            "\1\24",
            "\1\25",
            "\1\26",
            "\17\30\1\27\uffd0\30",
            "",
            "",
            "",
            "",
            "\1\7\1\uffff\1\31\2\uffff\12\32",
            "\1\17\2\uffff\12\23\7\uffff\4\17\1\22\25\17\4\uffff\1\17\1"+
            "\uffff\4\17\1\22\25\17",
            "\1\33",
            "\1\34",
            "\1\35",
            "\0\21",
            "",
            "\12\32",
            "\1\17\2\uffff\12\32\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\36",
            "\1\37",
            "\1\40",
            "\1\17\2\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\17\2\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
            "\1\43",
            "",
            "",
            "\1\17\2\uffff\12\17\7\uffff\32\17\4\uffff\1\17\1\uffff\32\17",
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
            return "1:1: Tokens : ( T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | NUMBER | NULL | TRUE | FALSE | REGEX | STRING | IDENTIFIER | WS | COMMENT );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA16_23 = input.LA(1);

                        s = -1;
                        if ( ((LA16_23 >= '\u0000' && LA16_23 <= '\uFFFF')) ) {s = 17;}

                        else s = 24;

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