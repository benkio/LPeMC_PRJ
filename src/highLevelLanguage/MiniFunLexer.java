// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g 2014-02-27 17:22:03

package highLevelLanguage;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MiniFunLexer extends Lexer {
    public static final int LANPAR=12;
    public static final int REST=39;
    public static final int SRPAR=37;
    public static final int CRPAR=18;
    public static final int NOT=41;
    public static final int NAT=28;
    public static final int AND=27;
    public static final int ID=8;
    public static final int EOF=-1;
    public static final int ERR=47;
    public static final int IF=32;
    public static final int DOUBLECOL=36;
    public static final int THEN=33;
    public static final int IN=5;
    public static final int LPAR=14;
    public static final int LESSEQ=20;
    public static final int COMMA=15;
    public static final int COL=9;
    public static final int PLUS=22;
    public static final int VAR=7;
    public static final int EQ=19;
    public static final int DIVIDE=26;
    public static final int RANPAR=13;
    public static final int GREATEREQ=21;
    public static final int BOOLTYPE=43;
    public static final int ELSE=34;
    public static final int MINUS=23;
    public static final int WHITESP=46;
    public static final int LIST=45;
    public static final int TRUE=29;
    public static final int PRINT=40;
    public static final int EMPTY=31;
    public static final int CLPAR=17;
    public static final int OR=24;
    public static final int ARROW=44;
    public static final int RPAR=16;
    public static final int ASS=10;
    public static final int SLPAR=35;
    public static final int TIMES=25;
    public static final int FUN=11;
    public static final int SEMIC=6;
    public static final int INTTYPE=42;
    public static final int FALSE=30;
    public static final int LET=4;
    public static final int FIRST=38;

    // delegates
    // delegators

    public MiniFunLexer() {;} 
    public MiniFunLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public MiniFunLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "/Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g"; }

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
        try {
            int _type = LET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:448:7: ( 'let' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:448:9: 'let'
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

    // $ANTLR start "LIST"
    public final void mLIST() throws RecognitionException {
        try {
            int _type = LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:449:7: ( 'list' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:449:9: 'list'
            {
            match("list"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LIST"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
        try {
            int _type = IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:450:5: ( 'in' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:450:7: 'in'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:451:8: ( ';' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:451:10: ';'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:452:6: ( ':' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:452:8: ':'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:453:11: ( '::' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:453:13: '::'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:454:8: ( ',' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:454:10: ','
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:455:7: ( '=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:455:9: '='
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:456:6: ( '==' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:456:8: '=='
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

    // $ANTLR start "LANPAR"
    public final void mLANPAR() throws RecognitionException {
        try {
            int _type = LANPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:457:9: ( '<' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:457:11: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LANPAR"

    // $ANTLR start "RANPAR"
    public final void mRANPAR() throws RecognitionException {
        try {
            int _type = RANPAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:458:9: ( '>' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:458:11: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANPAR"

    // $ANTLR start "LESSEQ"
    public final void mLESSEQ() throws RecognitionException {
        try {
            int _type = LESSEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:459:10: ( '<=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:459:12: '<='
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:460:11: ( '>=' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:460:13: '>='
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:461:7: ( '+' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:461:9: '+'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:462:8: ( '-' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:462:10: '-'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:463:8: ( '->' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:463:10: '->'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:464:6: ( '||' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:464:8: '||'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:465:8: ( '*' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:465:10: '*'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:466:9: ( '/' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:466:11: '/'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:467:7: ( '&&' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:467:9: '&&'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:7: ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | '0' )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:9: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:9: ( ( '1' .. '9' ) ( '0' .. '9' )* )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:10: ( '1' .. '9' ) ( '0' .. '9' )*
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:10: ( '1' .. '9' )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:11: '1' .. '9'
                    {
                    matchRange('1','9'); 

                    }

                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:20: ( '0' .. '9' )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:21: '0' .. '9'
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:468:35: '0'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:469:7: ( 'true' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:469:9: 'true'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:470:8: ( 'false' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:470:10: 'false'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:471:10: ( 'empty' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:471:12: 'empty'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:472:7: ( 'not' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:472:9: 'not'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:473:7: ( 'var' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:473:9: 'var'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:474:7: ( 'fun' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:474:9: 'fun'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:475:8: ( '(' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:475:10: '('
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:476:7: ( ')' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:476:9: ')'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:477:9: ( '{' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:477:11: '{'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:478:8: ( '}' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:478:10: '}'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:479:9: ( '[' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:479:11: '['
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:480:8: ( ']' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:480:10: ']'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:481:7: ( 'if' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:481:9: 'if'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:482:8: ( 'then' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:482:10: 'then'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:483:8: ( 'else' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:483:10: 'else'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:484:8: ( 'print' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:484:10: 'print'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:485:10: ( 'first' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:485:12: 'first'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:486:10: ( 'rest' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:486:12: 'rest'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:487:10: ( 'int' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:487:12: 'int'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:488:10: ( 'bool' )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:488:12: 'bool'
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:490:7: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:490:9: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:490:28: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||(LA3_0>='a' && LA3_0<='z')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:492:11: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:492:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
            {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:492:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:494:10: ( . )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:494:12: .
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
        // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:8: ( LET | LIST | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LANPAR | RANPAR | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | ID | WHITESP | ERR )
        int alt5=44;
        alt5 = dfa5.predict(input);
        switch (alt5) {
            case 1 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:10: LET
                {
                mLET(); 

                }
                break;
            case 2 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:14: LIST
                {
                mLIST(); 

                }
                break;
            case 3 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:19: IN
                {
                mIN(); 

                }
                break;
            case 4 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:22: SEMIC
                {
                mSEMIC(); 

                }
                break;
            case 5 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:28: COL
                {
                mCOL(); 

                }
                break;
            case 6 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:32: DOUBLECOL
                {
                mDOUBLECOL(); 

                }
                break;
            case 7 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:42: COMMA
                {
                mCOMMA(); 

                }
                break;
            case 8 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:48: ASS
                {
                mASS(); 

                }
                break;
            case 9 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:52: EQ
                {
                mEQ(); 

                }
                break;
            case 10 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:55: LANPAR
                {
                mLANPAR(); 

                }
                break;
            case 11 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:62: RANPAR
                {
                mRANPAR(); 

                }
                break;
            case 12 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:69: LESSEQ
                {
                mLESSEQ(); 

                }
                break;
            case 13 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:76: GREATEREQ
                {
                mGREATEREQ(); 

                }
                break;
            case 14 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:86: PLUS
                {
                mPLUS(); 

                }
                break;
            case 15 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:91: MINUS
                {
                mMINUS(); 

                }
                break;
            case 16 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:97: ARROW
                {
                mARROW(); 

                }
                break;
            case 17 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:103: OR
                {
                mOR(); 

                }
                break;
            case 18 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:106: TIMES
                {
                mTIMES(); 

                }
                break;
            case 19 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:112: DIVIDE
                {
                mDIVIDE(); 

                }
                break;
            case 20 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:119: AND
                {
                mAND(); 

                }
                break;
            case 21 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:123: NAT
                {
                mNAT(); 

                }
                break;
            case 22 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:127: TRUE
                {
                mTRUE(); 

                }
                break;
            case 23 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:132: FALSE
                {
                mFALSE(); 

                }
                break;
            case 24 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:138: EMPTY
                {
                mEMPTY(); 

                }
                break;
            case 25 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:144: NOT
                {
                mNOT(); 

                }
                break;
            case 26 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:148: VAR
                {
                mVAR(); 

                }
                break;
            case 27 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:152: FUN
                {
                mFUN(); 

                }
                break;
            case 28 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:156: LPAR
                {
                mLPAR(); 

                }
                break;
            case 29 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:161: RPAR
                {
                mRPAR(); 

                }
                break;
            case 30 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:166: CLPAR
                {
                mCLPAR(); 

                }
                break;
            case 31 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:172: CRPAR
                {
                mCRPAR(); 

                }
                break;
            case 32 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:178: SLPAR
                {
                mSLPAR(); 

                }
                break;
            case 33 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:184: SRPAR
                {
                mSRPAR(); 

                }
                break;
            case 34 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:190: IF
                {
                mIF(); 

                }
                break;
            case 35 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:193: THEN
                {
                mTHEN(); 

                }
                break;
            case 36 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:198: ELSE
                {
                mELSE(); 

                }
                break;
            case 37 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:203: PRINT
                {
                mPRINT(); 

                }
                break;
            case 38 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:209: FIRST
                {
                mFIRST(); 

                }
                break;
            case 39 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:215: REST
                {
                mREST(); 

                }
                break;
            case 40 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:220: INTTYPE
                {
                mINTTYPE(); 

                }
                break;
            case 41 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:228: BOOLTYPE
                {
                mBOOLTYPE(); 

                }
                break;
            case 42 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:237: ID
                {
                mID(); 

                }
                break;
            case 43 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:240: WHITESP
                {
                mWHITESP(); 

                }
                break;
            case 44 :
                // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:1:248: ERR
                {
                mERR(); 

                }
                break;

        }

    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS =
        "\1\uffff\2\44\1\uffff\1\51\1\uffff\1\54\1\56\1\60\1\uffff\1\63\1"+
        "\41\2\uffff\1\41\2\uffff\5\44\6\uffff\3\44\3\uffff\2\44\1\uffff"+
        "\1\117\1\120\22\uffff\11\44\6\uffff\3\44\1\uffff\1\135\1\44\1\137"+
        "\2\uffff\3\44\1\143\3\44\1\147\1\150\3\44\1\uffff\1\154\1\uffff"+
        "\1\155\1\156\1\44\1\uffff\2\44\1\162\2\uffff\1\44\1\164\1\165\3"+
        "\uffff\1\166\1\167\1\170\1\uffff\1\171\6\uffff";
    static final String DFA5_eofS =
        "\172\uffff";
    static final String DFA5_minS =
        "\1\0\1\145\1\146\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76\1\174\2"+
        "\uffff\1\46\2\uffff\1\150\1\141\1\154\1\157\1\141\6\uffff\1\162"+
        "\1\145\1\157\3\uffff\1\164\1\163\1\uffff\2\60\22\uffff\1\165\1\145"+
        "\1\154\1\156\1\162\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163\1"+
        "\157\1\uffff\1\60\1\164\1\60\2\uffff\1\145\1\156\1\163\1\60\1\163"+
        "\1\164\1\145\2\60\1\156\1\164\1\154\1\uffff\1\60\1\uffff\2\60\1"+
        "\145\1\uffff\1\164\1\171\1\60\2\uffff\1\164\2\60\3\uffff\3\60\1"+
        "\uffff\1\60\6\uffff";
    static final String DFA5_maxS =
        "\1\uffff\1\151\1\156\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76\1\174"+
        "\2\uffff\1\46\2\uffff\1\162\1\165\1\155\1\157\1\141\6\uffff\1\162"+
        "\1\145\1\157\3\uffff\1\164\1\163\1\uffff\2\172\22\uffff\1\165\1"+
        "\145\1\154\1\156\1\162\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163"+
        "\1\157\1\uffff\1\172\1\164\1\172\2\uffff\1\145\1\156\1\163\1\172"+
        "\1\163\1\164\1\145\2\172\1\156\1\164\1\154\1\uffff\1\172\1\uffff"+
        "\2\172\1\145\1\uffff\1\164\1\171\1\172\2\uffff\1\164\2\172\3\uffff"+
        "\3\172\1\uffff\1\172\6\uffff";
    static final String DFA5_acceptS =
        "\3\uffff\1\4\1\uffff\1\7\3\uffff\1\16\2\uffff\1\22\1\23\1\uffff"+
        "\2\25\5\uffff\1\34\1\35\1\36\1\37\1\40\1\41\3\uffff\1\52\1\53\1"+
        "\54\2\uffff\1\52\2\uffff\1\4\1\6\1\5\1\7\1\11\1\10\1\14\1\12\1\15"+
        "\1\13\1\16\1\20\1\17\1\21\1\22\1\23\1\24\1\25\11\uffff\1\34\1\35"+
        "\1\36\1\37\1\40\1\41\3\uffff\1\53\3\uffff\1\3\1\42\14\uffff\1\1"+
        "\1\uffff\1\50\3\uffff\1\33\3\uffff\1\31\1\32\3\uffff\1\2\1\26\1"+
        "\43\3\uffff\1\44\1\uffff\1\47\1\51\1\27\1\46\1\30\1\45";
    static final String DFA5_specialS =
        "\1\0\171\uffff}>";
    static final String[] DFA5_transitionS = {
            "\11\41\2\40\2\41\1\40\22\41\1\40\5\41\1\16\1\41\1\26\1\27\1"+
            "\14\1\11\1\5\1\12\1\41\1\15\1\20\11\17\1\4\1\3\1\7\1\6\1\10"+
            "\2\41\32\37\1\32\1\41\1\33\3\41\1\37\1\36\2\37\1\23\1\22\2\37"+
            "\1\2\2\37\1\1\1\37\1\24\1\37\1\34\1\37\1\35\1\37\1\21\1\37\1"+
            "\25\4\37\1\30\1\13\1\31\uff82\41",
            "\1\42\3\uffff\1\43",
            "\1\46\7\uffff\1\45",
            "",
            "\1\50",
            "",
            "\1\53",
            "\1\55",
            "\1\57",
            "",
            "\1\62",
            "\1\64",
            "",
            "",
            "\1\67",
            "",
            "",
            "\1\72\11\uffff\1\71",
            "\1\73\7\uffff\1\75\13\uffff\1\74",
            "\1\77\1\76",
            "\1\100",
            "\1\101",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "\1\114",
            "\1\115",
            "",
            "\12\44\7\uffff\32\44\6\uffff\23\44\1\116\6\44",
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
            "",
            "",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\136",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\140",
            "\1\141",
            "\1\142",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\144",
            "\1\145",
            "\1\146",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\151",
            "\1\152",
            "\1\153",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\1\157",
            "",
            "\1\160",
            "\1\161",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
            "",
            "\1\163",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "\12\44\7\uffff\32\44\6\uffff\32\44",
            "",
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
            return "1:1: Tokens : ( LET | LIST | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LANPAR | RANPAR | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | ID | WHITESP | ERR );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA5_0 = input.LA(1);

                        s = -1;
                        if ( (LA5_0=='l') ) {s = 1;}

                        else if ( (LA5_0=='i') ) {s = 2;}

                        else if ( (LA5_0==';') ) {s = 3;}

                        else if ( (LA5_0==':') ) {s = 4;}

                        else if ( (LA5_0==',') ) {s = 5;}

                        else if ( (LA5_0=='=') ) {s = 6;}

                        else if ( (LA5_0=='<') ) {s = 7;}

                        else if ( (LA5_0=='>') ) {s = 8;}

                        else if ( (LA5_0=='+') ) {s = 9;}

                        else if ( (LA5_0=='-') ) {s = 10;}

                        else if ( (LA5_0=='|') ) {s = 11;}

                        else if ( (LA5_0=='*') ) {s = 12;}

                        else if ( (LA5_0=='/') ) {s = 13;}

                        else if ( (LA5_0=='&') ) {s = 14;}

                        else if ( ((LA5_0>='1' && LA5_0<='9')) ) {s = 15;}

                        else if ( (LA5_0=='0') ) {s = 16;}

                        else if ( (LA5_0=='t') ) {s = 17;}

                        else if ( (LA5_0=='f') ) {s = 18;}

                        else if ( (LA5_0=='e') ) {s = 19;}

                        else if ( (LA5_0=='n') ) {s = 20;}

                        else if ( (LA5_0=='v') ) {s = 21;}

                        else if ( (LA5_0=='(') ) {s = 22;}

                        else if ( (LA5_0==')') ) {s = 23;}

                        else if ( (LA5_0=='{') ) {s = 24;}

                        else if ( (LA5_0=='}') ) {s = 25;}

                        else if ( (LA5_0=='[') ) {s = 26;}

                        else if ( (LA5_0==']') ) {s = 27;}

                        else if ( (LA5_0=='p') ) {s = 28;}

                        else if ( (LA5_0=='r') ) {s = 29;}

                        else if ( (LA5_0=='b') ) {s = 30;}

                        else if ( ((LA5_0>='A' && LA5_0<='Z')||LA5_0=='a'||(LA5_0>='c' && LA5_0<='d')||(LA5_0>='g' && LA5_0<='h')||(LA5_0>='j' && LA5_0<='k')||LA5_0=='m'||LA5_0=='o'||LA5_0=='q'||LA5_0=='s'||LA5_0=='u'||(LA5_0>='w' && LA5_0<='z')) ) {s = 31;}

                        else if ( ((LA5_0>='\t' && LA5_0<='\n')||LA5_0=='\r'||LA5_0==' ') ) {s = 32;}

                        else if ( ((LA5_0>='\u0000' && LA5_0<='\b')||(LA5_0>='\u000B' && LA5_0<='\f')||(LA5_0>='\u000E' && LA5_0<='\u001F')||(LA5_0>='!' && LA5_0<='%')||LA5_0=='\''||LA5_0=='.'||(LA5_0>='?' && LA5_0<='@')||LA5_0=='\\'||(LA5_0>='^' && LA5_0<='`')||(LA5_0>='~' && LA5_0<='\uFFFF')) ) {s = 33;}

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