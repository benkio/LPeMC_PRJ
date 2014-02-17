// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g 2014-02-17 16:08:00

package highLevelLanguage;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MiniFunLexer extends Lexer {
    public static final int REST=37;
    public static final int SRPAR=35;
    public static final int CRPAR=16;
    public static final int NOT=39;
    public static final int NAT=26;
    public static final int AND=25;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int ERR=45;
    public static final int IF=30;
    public static final int DOUBLECOL=34;
    public static final int THEN=31;
    public static final int IN=5;
    public static final int LPAR=12;
    public static final int LESSEQ=18;
    public static final int COMMA=13;
    public static final int COL=9;
    public static final int PLUS=20;
    public static final int VAR=7;
    public static final int EQ=17;
    public static final int DIVIDE=24;
    public static final int GREATEREQ=19;
    public static final int BOOLTYPE=41;
    public static final int ELSE=32;
    public static final int MINUS=21;
    public static final int WHITESP=44;
    public static final int TRUE=27;
    public static final int PRINT=38;
    public static final int EMPTY=29;
    public static final int GENERICTYPE=43;
    public static final int CLPAR=15;
    public static final int OR=22;
    public static final int ARROW=42;
    public static final int RPAR=14;
    public static final int ASS=10;
    public static final int SLPAR=33;
    public static final int FUN=11;
    public static final int SEMIC=6;
    public static final int TIMES=23;
    public static final int INTTYPE=40;
    public static final int FALSE=28;
    public static final int LET=4;
    public static final int FIRST=36;

    // delegates
    // delegators

    public MiniFunLexer() {;} 
    public MiniFunLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniFunLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g"; }

    // $ANTLR start "GENERICTYPE"
    public final void mGENERICTYPE() throws RecognitionException {
        try {
            int _type = GENERICTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:288:13: ( 'A' .. 'Z' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:288:15: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GENERICTYPE"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:289:7: ( 'let' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:289:9: 'let'
            {
            match("let"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LET"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:290:6: ( 'in' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:290:8: 'in'
            {
            match("in"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IN"

    // $ANTLR start "SEMIC"
    public final void mSEMIC() throws RecognitionException {
        try {
            int _type = SEMIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:291:8: ( ';' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:291:10: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMIC"

    // $ANTLR start "COL"
    public final void mCOL() throws RecognitionException {
        try {
            int _type = COL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:292:7: ( ':' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:292:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COL"

    // $ANTLR start "DOUBLECOL"
    public final void mDOUBLECOL() throws RecognitionException {
        try {
            int _type = DOUBLECOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:293:11: ( '::' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:293:13: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLECOL"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:294:8: ( ',' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:294:10: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "ASS"
    public final void mASS() throws RecognitionException {
        try {
            int _type = ASS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:295:7: ( '=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:295:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASS"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:296:6: ( '==' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:296:8: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "LESSEQ"
    public final void mLESSEQ() throws RecognitionException {
        try {
            int _type = LESSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:297:10: ( '<=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:297:12: '<='
            {
            match("<="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSEQ"

    // $ANTLR start "GREATEREQ"
    public final void mGREATEREQ() throws RecognitionException {
        try {
            int _type = GREATEREQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:298:11: ( '>=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:298:13: '>='
            {
            match(">="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GREATEREQ"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:299:7: ( '+' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:299:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:300:8: ( '-' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:300:10: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "ARROW"
    public final void mARROW() throws RecognitionException {
        try {
            int _type = ARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:301:8: ( '->' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:301:10: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ARROW"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:302:6: ( '||' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:302:8: '||'
            {
            match("||"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:303:8: ( '*' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:303:10: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:304:9: ( '/' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:304:11: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:305:7: ( '&&' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:305:9: '&&'
            {
            match("&&"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "NAT"
    public final void mNAT() throws RecognitionException {
        try {
            int _type = NAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:7: ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | '0' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>='1' && LA2_0<='9')) ) {
                alt2=1;
            }
            else if ( (LA2_0=='0') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:9: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:9: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:10: ( '1' .. '9' )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:20: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:21: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:306:35: '0'
                    {
                    match('0'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NAT"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
        try {
            int _type = TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:307:7: ( 'true' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:307:9: 'true'
            {
            match("true"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TRUE"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
        try {
            int _type = FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:308:8: ( 'false' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:308:10: 'false'
            {
            match("false"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FALSE"

    // $ANTLR start "EMPTY"
    public final void mEMPTY() throws RecognitionException {
        try {
            int _type = EMPTY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:309:10: ( 'empty' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:309:12: 'empty'
            {
            match("empty"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EMPTY"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:310:7: ( 'not' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:310:9: 'not'
            {
            match("not"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:311:7: ( 'var' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:311:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "FUN"
    public final void mFUN() throws RecognitionException {
        try {
            int _type = FUN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:312:7: ( 'fun' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:312:9: 'fun'
            {
            match("fun"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUN"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
        try {
            int _type = LPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:313:8: ( '(' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:313:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
        try {
            int _type = RPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:314:7: ( ')' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:314:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RPAR"

    // $ANTLR start "CLPAR"
    public final void mCLPAR() throws RecognitionException {
        try {
            int _type = CLPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:315:9: ( '{' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:315:11: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CLPAR"

    // $ANTLR start "CRPAR"
    public final void mCRPAR() throws RecognitionException {
        try {
            int _type = CRPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:316:8: ( '}' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:316:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CRPAR"

    // $ANTLR start "SLPAR"
    public final void mSLPAR() throws RecognitionException {
        try {
            int _type = SLPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:317:9: ( '[' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:317:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SLPAR"

    // $ANTLR start "SRPAR"
    public final void mSRPAR() throws RecognitionException {
        try {
            int _type = SRPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:318:8: ( ']' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:318:10: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SRPAR"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
        try {
            int _type = IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:319:7: ( 'if' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:319:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IF"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
        try {
            int _type = THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:320:8: ( 'then' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:320:10: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
        try {
            int _type = ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:321:8: ( 'else' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:321:10: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ELSE"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
        try {
            int _type = PRINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:322:8: ( 'print' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:322:10: 'print'
            {
            match("print"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PRINT"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
        try {
            int _type = FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:323:10: ( 'first' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:323:12: 'first'
            {
            match("first"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FIRST"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
        try {
            int _type = REST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:324:10: ( 'rest' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:324:12: 'rest'
            {
            match("rest"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REST"

    // $ANTLR start "INTTYPE"
    public final void mINTTYPE() throws RecognitionException {
        try {
            int _type = INTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:325:10: ( 'int' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:325:12: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTTYPE"

    // $ANTLR start "BOOLTYPE"
    public final void mBOOLTYPE() throws RecognitionException {
        try {
            int _type = BOOLTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:326:10: ( 'bool' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:326:12: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOOLTYPE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:328:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:328:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:328:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "WHITESP"
    public final void mWHITESP() throws RecognitionException {
        try {
            int _type = WHITESP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:330:11: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:330:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:330:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\t' && LA4_0<='\n')||LA4_0=='\r'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

             skip(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WHITESP"

    // $ANTLR start "ERR"
    public final void mERR() throws RecognitionException {
        try {
            int _type = ERR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:332:10: ( . )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:332:12: .
            {
            matchAny(); 
             System.out.println("Invalid char: "+getText()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ERR"

    public void mTokens() throws RecognitionException {
        // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:8: ( GENERICTYPE | LET | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | ID | WHITESP | ERR )
        int alt5=42;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:10: GENERICTYPE
                {
                mGENERICTYPE(); 

                }
                break;
            case 2 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:22: LET
                {
                mLET(); 

                }
                break;
            case 3 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:26: IN
                {
                mIN(); 

                }
                break;
            case 4 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:29: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 5 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:35: COL
                {
                mCOL(); 

                }
                break;
            case 6 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:39: DOUBLECOL
                {
                mDOUBLECOL(); 

                }
                break;
            case 7 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:49: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 8 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:55: ASS
                {
                mASS(); 

                }
                break;
            case 9 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:59: EQ
                {
                mEQ(); 

                }
                break;
            case 10 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:62: LESSEQ
                {
                mLESSEQ(); 

                }
                break;
            case 11 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:69: GREATEREQ
                {
                mGREATEREQ(); 

                }
                break;
            case 12 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:79: PLUS
                {
                mPLUS(); 

                }
                break;
            case 13 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:84: MINUS
                {
                mMINUS(); 

                }
                break;
            case 14 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:90: ARROW
                {
                mARROW(); 

                }
                break;
            case 15 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:96: OR
                {
                mOR(); 

                }
                break;
            case 16 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:99: TIMES
                {
                mTIMES(); 

                }
                break;
            case 17 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:105: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 18 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:112: AND
                {
                mAND(); 

                }
                break;
            case 19 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:116: NAT
                {
                mNAT(); 

                }
                break;
            case 20 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:120: TRUE
                {
                mTRUE(); 

                }
                break;
            case 21 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:125: FALSE
                {
                mFALSE(); 

                }
                break;
            case 22 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:131: EMPTY
                {
                mEMPTY(); 

                }
                break;
            case 23 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:137: NOT
                {
                mNOT(); 

                }
                break;
            case 24 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:141: VAR
                {
                mVAR(); 

                }
                break;
            case 25 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:145: FUN
                {
                mFUN(); 

                }
                break;
            case 26 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:149: LPAR
                {
                mLPAR(); 

                }
                break;
            case 27 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:154: RPAR
                {
                mRPAR(); 

                }
                break;
            case 28 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:159: CLPAR
                {
                mCLPAR(); 

                }
                break;
            case 29 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:165: CRPAR
                {
                mCRPAR(); 

                }
                break;
            case 30 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:171: SLPAR
                {
                mSLPAR(); 

                }
                break;
            case 31 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:177: SRPAR
                {
                mSRPAR(); 

                }
                break;
            case 32 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:183: IF
                {
                mIF(); 

                }
                break;
            case 33 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:186: THEN
                {
                mTHEN(); 

                }
                break;
            case 34 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:191: ELSE
                {
                mELSE(); 

                }
                break;
            case 35 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:196: PRINT
                {
                mPRINT(); 

                }
                break;
            case 36 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:202: FIRST
                {
                mFIRST(); 

                }
                break;
            case 37 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:208: REST
                {
                mREST(); 

                }
                break;
            case 38 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:213: INTTYPE
                {
                mINTTYPE(); 

                }
                break;
            case 39 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:221: BOOLTYPE
                {
                mBOOLTYPE(); 

                }
                break;
            case 40 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:230: ID
                {
                mID(); 

                }
                break;
            case 41 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:233: WHITESP
                {
                mWHITESP(); 

                }
                break;
            case 42 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:1:241: ERR
                {
                mERR(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\1\43\2\44\1\uffff\1\52\1\uffff\1\55\2\42\1\uffff\1\62\1"+
        "\42\2\uffff\1\42\2\uffff\5\44\6\uffff\3\44\5\uffff\1\44\1\115\1"+
        "\116\20\uffff\11\44\6\uffff\3\44\1\uffff\1\133\1\134\2\uffff\3\44"+
        "\1\140\3\44\1\144\1\145\3\44\2\uffff\1\151\1\152\1\44\1\uffff\2"+
        "\44\1\156\2\uffff\1\44\1\160\1\161\2\uffff\1\162\1\163\1\164\1\uffff"+
        "\1\165\6\uffff";
    static final String DFA5_eofS =
        "\166\uffff";
    static final String DFA5_minS =
        "\1\0\1\60\1\145\1\146\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76\1\174"+
        "\2\uffff\1\46\2\uffff\1\150\1\141\1\154\1\157\1\141\6\uffff\1\162"+
        "\1\145\1\157\5\uffff\1\164\2\60\20\uffff\1\165\1\145\1\154\1\156"+
        "\1\162\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163\1\157\1\uffff"+
        "\2\60\2\uffff\1\145\1\156\1\163\1\60\1\163\1\164\1\145\2\60\1\156"+
        "\1\164\1\154\2\uffff\2\60\1\145\1\uffff\1\164\1\171\1\60\2\uffff"+
        "\1\164\2\60\2\uffff\3\60\1\uffff\1\60\6\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\172\1\145\1\156\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76"+
        "\1\174\2\uffff\1\46\2\uffff\1\162\1\165\1\155\1\157\1\141\6\uffff"+
        "\1\162\1\145\1\157\5\uffff\1\164\2\172\20\uffff\1\165\1\145\1\154"+
        "\1\156\1\162\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163\1\157\1"+
        "\uffff\2\172\2\uffff\1\145\1\156\1\163\1\172\1\163\1\164\1\145\2"+
        "\172\1\156\1\164\1\154\2\uffff\2\172\1\145\1\uffff\1\164\1\171\1"+
        "\172\2\uffff\1\164\2\172\2\uffff\3\172\1\uffff\1\172\6\uffff";
    static final String DFA5_acceptS =
        "\4\uffff\1\4\1\uffff\1\7\3\uffff\1\14\2\uffff\1\20\1\21\1\uffff"+
        "\2\23\5\uffff\1\32\1\33\1\34\1\35\1\36\1\37\3\uffff\1\50\1\51\1"+
        "\52\1\1\1\50\3\uffff\1\4\1\6\1\5\1\7\1\11\1\10\1\12\1\13\1\14\1"+
        "\16\1\15\1\17\1\20\1\21\1\22\1\23\11\uffff\1\32\1\33\1\34\1\35\1"+
        "\36\1\37\3\uffff\1\51\2\uffff\1\3\1\40\14\uffff\1\2\1\46\3\uffff"+
        "\1\31\3\uffff\1\27\1\30\3\uffff\1\24\1\41\3\uffff\1\42\1\uffff\1"+
        "\45\1\47\1\25\1\44\1\26\1\43";
    static final String DFA5_specialS =
        "\1\0\165\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\42\2\41\2\42\1\41\22\42\1\41\5\42\1\17\1\42\1\27\1\30\1"+
            "\15\1\12\1\6\1\13\1\42\1\16\1\21\11\20\1\5\1\4\1\10\1\7\1\11"+
            "\2\42\32\1\1\33\1\42\1\34\3\42\1\40\1\37\2\40\1\24\1\23\2\40"+
            "\1\3\2\40\1\2\1\40\1\25\1\40\1\35\1\40\1\36\1\40\1\22\1\40\1"+
            "\26\4\40\1\31\1\14\1\32\uff82\42",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\45",
            "\1\47\7\uffff\1\46",
            "",
            "\1\51",
            "",
            "\1\54",
            "\1\56",
            "\1\57",
            "",
            "\1\61",
            "\1\63",
            "",
            "",
            "\1\66",
            "",
            "",
            "\1\71\11\uffff\1\70",
            "\1\72\7\uffff\1\74\13\uffff\1\73",
            "\1\76\1\75",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\107",
            "\1\110",
            "\1\111",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\12\44\7\uffff\32\44\6\uffff\23\44\1\114\6\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\130",
            "\1\131",
            "\1\132",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\135",
            "\1\136",
            "\1\137",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\146",
            "\1\147",
            "\1\150",
            "",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\153",
            "",
            "\1\154",
            "\1\155",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\157",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA.unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA.unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
        int numStates = DFA5_transitionS.length;
        DFA5_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
        }
    }

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = DFA5_eot;
            this.eof = DFA5_eof;
            this.min = DFA5_min;
            this.max = DFA5_max;
            this.accept = DFA5_accept;
            this.special = DFA5_special;
            this.transition = DFA5_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( GENERICTYPE | LET | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | ID | WHITESP | ERR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( ((LA5_0>='A' && LA5_0<='Z')) ) {s = 1;}

                        else if ( (LA5_0=='l') ) {s = 2;}

                        else if ( (LA5_0=='i') ) {s = 3;}

                        else if ( (LA5_0==';') ) {s = 4;}

                        else if ( (LA5_0==':') ) {s = 5;}

                        else if ( (LA5_0==',') ) {s = 6;}

                        else if ( (LA5_0=='=') ) {s = 7;}

                        else if ( (LA5_0=='<') ) {s = 8;}

                        else if ( (LA5_0=='>') ) {s = 9;}

                        else if ( (LA5_0=='+') ) {s = 10;}

                        else if ( (LA5_0=='-') ) {s = 11;}

                        else if ( (LA5_0=='|') ) {s = 12;}

                        else if ( (LA5_0=='*') ) {s = 13;}

                        else if ( (LA5_0=='/') ) {s = 14;}

                        else if ( (LA5_0=='&') ) {s = 15;}

                        else if ( ((LA5_0>='1' && LA5_0<='9')) ) {s = 16;}

                        else if ( (LA5_0=='0') ) {s = 17;}

                        else if ( (LA5_0=='t') ) {s = 18;}

                        else if ( (LA5_0=='f') ) {s = 19;}

                        else if ( (LA5_0=='e') ) {s = 20;}

                        else if ( (LA5_0=='n') ) {s = 21;}

                        else if ( (LA5_0=='v') ) {s = 22;}

                        else if ( (LA5_0=='(') ) {s = 23;}

                        else if ( (LA5_0==')') ) {s = 24;}

                        else if ( (LA5_0=='{') ) {s = 25;}

                        else if ( (LA5_0=='}') ) {s = 26;}

                        else if ( (LA5_0=='[') ) {s = 27;}

                        else if ( (LA5_0==']') ) {s = 28;}

                        else if ( (LA5_0=='p') ) {s = 29;}

                        else if ( (LA5_0=='r') ) {s = 30;}

                        else if ( (LA5_0=='b') ) {s = 31;}

                        else if ( (LA5_0=='a'||(LA5_0>='c' && LA5_0<='d')||(LA5_0>='g' && LA5_0<='h')||(LA5_0>='j' && LA5_0<='k')||LA5_0=='m'||LA5_0=='o'||LA5_0=='q'||LA5_0=='s'||LA5_0=='u'||(LA5_0>='w' && LA5_0<='z')) ) {s = 32;}

                        else if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {s = 33;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='%')||LA5_0=='\''||LA5_0=='.'||(LA5_0>='?' && LA5_0<='@')||LA5_0=='\\'||(LA5_0>='^' && LA5_0<='`')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {s = 34;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 5, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}