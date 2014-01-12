// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-01-12 12:15:07
package highLevelLanguage;

import org.antlr.runtime.BaseRecognizer;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.DFA;
import org.antlr.runtime.EarlyExitException;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;

@SuppressWarnings("all")
public class MiniFunLexer extends Lexer {
    public static final int EOF = -1;
    public static final int AND = 4;
    public static final int ASS = 5;
    public static final int BOOLTYPE = 6;
    public static final int CLPAR = 7;
    public static final int COL = 8;
    public static final int COMMA = 9;
    public static final int CRPAR = 10;
    public static final int DIV = 11;
    public static final int DOUBLECOL = 12;
    public static final int ELSE = 13;
    public static final int EMPTY = 14;
    public static final int EQ = 15;
    public static final int ERR = 16;
    public static final int FALSE = 17;
    public static final int FIRST = 18;
    public static final int FUN = 19;
    public static final int ID = 20;
    public static final int IF = 21;
    public static final int IN = 22;
    public static final int INTTYPE = 23;
    public static final int LET = 24;
    public static final int LPAR = 25;
    public static final int MINUS = 26;
    public static final int NAT = 27;
    public static final int NOT = 28;
    public static final int OR = 29;
    public static final int PLUS = 30;
    public static final int PRINT = 31;
    public static final int REST = 32;
    public static final int RPAR = 33;
    public static final int SEMIC = 34;
    public static final int SLPAR = 35;
    public static final int SRPAR = 36;
    public static final int THEN = 37;
    public static final int TIMES = 38;
    public static final int TRUE = 39;
    public static final int VAR = 40;
    public static final int WHITESP = 41;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
	return new Lexer[] {};
    }

    public MiniFunLexer() {
    }

    public MiniFunLexer(CharStream input) {
	this(input, new RecognizerSharedState());
    }

    public MiniFunLexer(CharStream input, RecognizerSharedState state) {
	super(input, state);
    }

    @Override
    public String getGrammarFileName() {
	return "/home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g";
    }

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
	try {
	    int _type = COMMA;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:237:8: ( ',' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:237:10: ','
	    {
		match(',');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "COMMA"

    // $ANTLR start "COL"
    public final void mCOL() throws RecognitionException {
	try {
	    int _type = COL;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:238:6: ( ':' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:238:8: ':'
	    {
		match(':');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "COL"

    // $ANTLR start "SEMIC"
    public final void mSEMIC() throws RecognitionException {
	try {
	    int _type = SEMIC;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:239:8: ( ';' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:239:10: ';'
	    {
		match(';');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "SEMIC"

    // $ANTLR start "ASS"
    public final void mASS() throws RecognitionException {
	try {
	    int _type = ASS;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:240:6: ( '=' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:240:8: '='
	    {
		match('=');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "ASS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
	try {
	    int _type = TIMES;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:241:8: ( '*' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:241:10: '*'
	    {
		match('*');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "TIMES"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
	try {
	    int _type = DIV;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:242:6: ( '/' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:242:8: '/'
	    {
		match('/');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "DIV"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
	try {
	    int _type = PLUS;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:243:7: ( '+' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:243:9: '+'
	    {
		match('+');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
	try {
	    int _type = MINUS;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:244:8: ( '-' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:244:10: '-'
	    {
		match('-');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "MINUS"

    // $ANTLR start "LPAR"
    public final void mLPAR() throws RecognitionException {
	try {
	    int _type = LPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:245:7: ( '(' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:245:9: '('
	    {
		match('(');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "LPAR"

    // $ANTLR start "RPAR"
    public final void mRPAR() throws RecognitionException {
	try {
	    int _type = RPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:246:7: ( ')' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:246:9: ')'
	    {
		match(')');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "RPAR"

    // $ANTLR start "CRPAR"
    public final void mCRPAR() throws RecognitionException {
	try {
	    int _type = CRPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:247:8: ( '}' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:247:10: '}'
	    {
		match('}');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "CRPAR"

    // $ANTLR start "CLPAR"
    public final void mCLPAR() throws RecognitionException {
	try {
	    int _type = CLPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:248:8: ( '{' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:248:10: '{'
	    {
		match('{');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "CLPAR"

    // $ANTLR start "SLPAR"
    public final void mSLPAR() throws RecognitionException {
	try {
	    int _type = SLPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:249:8: ( '[' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:249:10: '['
	    {
		match('[');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "SLPAR"

    // $ANTLR start "SRPAR"
    public final void mSRPAR() throws RecognitionException {
	try {
	    int _type = SRPAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:250:8: ( ']' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:250:10: ']'
	    {
		match(']');
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "SRPAR"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
	try {
	    int _type = OR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:251:5: ( '||' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:251:7: '||'
	    {
		match("||");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "OR"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
	try {
	    int _type = AND;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:252:6: ( '&&' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:252:8: '&&'
	    {
		match("&&");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "AND"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
	try {
	    int _type = EQ;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:253:5: ( '==' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:253:7: '=='
	    {
		match("==");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "EQ"

    // $ANTLR start "DOUBLECOL"
    public final void mDOUBLECOL() throws RecognitionException {
	try {
	    int _type = DOUBLECOL;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:254:10: ( '::' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:254:12: '::'
	    {
		match("::");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "DOUBLECOL"

    // $ANTLR start "IF"
    public final void mIF() throws RecognitionException {
	try {
	    int _type = IF;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:255:5: ( 'if' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:255:7: 'if'
	    {
		match("if");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "IF"

    // $ANTLR start "IN"
    public final void mIN() throws RecognitionException {
	try {
	    int _type = IN;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:256:5: ( 'in' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:256:7: 'in'
	    {
		match("in");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "IN"

    // $ANTLR start "LET"
    public final void mLET() throws RecognitionException {
	try {
	    int _type = LET;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:257:6: ( 'let' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:257:8: 'let'
	    {
		match("let");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "LET"

    // $ANTLR start "INTTYPE"
    public final void mINTTYPE() throws RecognitionException {
	try {
	    int _type = INTTYPE;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:258:10: ( 'int' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:258:12: 'int'
	    {
		match("int");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "INTTYPE"

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
	try {
	    int _type = VAR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:259:6: ( 'var' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:259:8: 'var'
	    {
		match("var");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "VAR"

    // $ANTLR start "FUN"
    public final void mFUN() throws RecognitionException {
	try {
	    int _type = FUN;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:260:6: ( 'fun' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:260:8: 'fun'
	    {
		match("fun");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "FUN"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
	try {
	    int _type = NOT;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:261:6: ( 'not' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:261:8: 'not'
	    {
		match("not");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "NOT"

    // $ANTLR start "BOOLTYPE"
    public final void mBOOLTYPE() throws RecognitionException {
	try {
	    int _type = BOOLTYPE;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:262:10: ( 'bool' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:262:12: 'bool'
	    {
		match("bool");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "BOOLTYPE"

    // $ANTLR start "THEN"
    public final void mTHEN() throws RecognitionException {
	try {
	    int _type = THEN;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:263:7: ( 'then' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:263:9: 'then'
	    {
		match("then");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "THEN"

    // $ANTLR start "ELSE"
    public final void mELSE() throws RecognitionException {
	try {
	    int _type = ELSE;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:264:7: ( 'else' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:264:9: 'else'
	    {
		match("else");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "ELSE"

    // $ANTLR start "TRUE"
    public final void mTRUE() throws RecognitionException {
	try {
	    int _type = TRUE;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:265:7: ( 'true' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:265:9: 'true'
	    {
		match("true");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "TRUE"

    // $ANTLR start "REST"
    public final void mREST() throws RecognitionException {
	try {
	    int _type = REST;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:266:7: ( 'rest' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:266:9: 'rest'
	    {
		match("rest");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "REST"

    // $ANTLR start "PRINT"
    public final void mPRINT() throws RecognitionException {
	try {
	    int _type = PRINT;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:267:8: ( 'print' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:267:10: 'print'
	    {
		match("print");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "PRINT"

    // $ANTLR start "EMPTY"
    public final void mEMPTY() throws RecognitionException {
	try {
	    int _type = EMPTY;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:268:8: ( 'empty' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:268:10: 'empty'
	    {
		match("empty");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "EMPTY"

    // $ANTLR start "FIRST"
    public final void mFIRST() throws RecognitionException {
	try {
	    int _type = FIRST;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:269:8: ( 'first' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:269:10: 'first'
	    {
		match("first");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "FIRST"

    // $ANTLR start "FALSE"
    public final void mFALSE() throws RecognitionException {
	try {
	    int _type = FALSE;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:270:8: ( 'false' )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:270:10: 'false'
	    {
		match("false");

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "FALSE"

    // $ANTLR start "NAT"
    public final void mNAT() throws RecognitionException {
	try {
	    int _type = NAT;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:271:6: ( '0' | ( '1' ..
	    // '9' ) ( '0' .. '9' )* )
	    int alt2 = 2;
	    int LA2_0 = input.LA(1);
	    if ((LA2_0 == '0')) {
		alt2 = 1;
	    } else if (((LA2_0 >= '1' && LA2_0 <= '9'))) {
		alt2 = 2;
	    }

	    else {
		NoViableAltException nvae = new NoViableAltException("", 2, 0,
			input);
		throw nvae;
	    }

	    switch (alt2) {
	    case 1:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:271:8: '0'
	    {
		match('0');
	    }
		break;
	    case 2:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:271:14: ( '1' .. '9' ) (
	    // '0' .. '9' )*
	    {
		if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
		    input.consume();
		} else {
		    MismatchedSetException mse = new MismatchedSetException(
			    null, input);
		    recover(mse);
		    throw mse;
		}
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:271:24: ( '0' .. '9'
		// )*
		loop1: while (true) {
		    int alt1 = 2;
		    int LA1_0 = input.LA(1);
		    if (((LA1_0 >= '0' && LA1_0 <= '9'))) {
			alt1 = 1;
		    }

		    switch (alt1) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:
		    {
			if ((input.LA(1) >= '0' && input.LA(1) <= '9')) {
			    input.consume();
			} else {
			    MismatchedSetException mse = new MismatchedSetException(
				    null, input);
			    recover(mse);
			    throw mse;
			}
		    }
			break;

		    default:
			break loop1;
		    }
		}

	    }
		break;

	    }
	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "NAT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
	try {
	    int _type = ID;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:272:5: ( ( 'a' .. 'z' |
	    // 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:272:7: ( 'a' .. 'z' | 'A'
	    // .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
	    {
		if ((input.LA(1) >= 'A' && input.LA(1) <= 'Z')
			|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
		    input.consume();
		} else {
		    MismatchedSetException mse = new MismatchedSetException(
			    null, input);
		    recover(mse);
		    throw mse;
		}
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:272:26: ( 'a' .. 'z'
		// | 'A' .. 'Z' | '0' .. '9' )*
		loop3: while (true) {
		    int alt3 = 2;
		    int LA3_0 = input.LA(1);
		    if (((LA3_0 >= '0' && LA3_0 <= '9')
			    || (LA3_0 >= 'A' && LA3_0 <= 'Z') || (LA3_0 >= 'a' && LA3_0 <= 'z'))) {
			alt3 = 1;
		    }

		    switch (alt3) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:
		    {
			if ((input.LA(1) >= '0' && input.LA(1) <= '9')
				|| (input.LA(1) >= 'A' && input.LA(1) <= 'Z')
				|| (input.LA(1) >= 'a' && input.LA(1) <= 'z')) {
			    input.consume();
			} else {
			    MismatchedSetException mse = new MismatchedSetException(
				    null, input);
			    recover(mse);
			    throw mse;
			}
		    }
			break;

		    default:
			break loop3;
		    }
		}

	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "ID"

    // $ANTLR start "WHITESP"
    public final void mWHITESP() throws RecognitionException {
	try {
	    int _type = WHITESP;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:275:10: ( ( '\\t' | ' ' |
	    // '\\r' | '\\n' )+ )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:275:12: ( '\\t' | ' ' |
	    // '\\r' | '\\n' )+
	    {
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:275:12: ( '\\t' | ' '
		// | '\\r' | '\\n' )+
		int cnt4 = 0;
		loop4: while (true) {
		    int alt4 = 2;
		    int LA4_0 = input.LA(1);
		    if (((LA4_0 >= '\t' && LA4_0 <= '\n') || LA4_0 == '\r' || LA4_0 == ' ')) {
			alt4 = 1;
		    }

		    switch (alt4) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:
		    {
			if ((input.LA(1) >= '\t' && input.LA(1) <= '\n')
				|| input.LA(1) == '\r' || input.LA(1) == ' ') {
			    input.consume();
			} else {
			    MismatchedSetException mse = new MismatchedSetException(
				    null, input);
			    recover(mse);
			    throw mse;
			}
		    }
			break;

		    default:
			if (cnt4 >= 1)
			    break loop4;
			EarlyExitException eee = new EarlyExitException(4,
				input);
			throw eee;
		    }
		    cnt4++;
		}

		skip();
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "WHITESP"

    // $ANTLR start "ERR"
    public final void mERR() throws RecognitionException {
	try {
	    int _type = ERR;
	    int _channel = DEFAULT_TOKEN_CHANNEL;
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:277:9: ( . )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:277:11: .
	    {
		matchAny();
		System.out.println("Invalid char: " + getText());
	    }

	    state.type = _type;
	    state.channel = _channel;
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "ERR"

    @Override
    public void mTokens() throws RecognitionException {
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:8: ( COMMA | COL | SEMIC |
	// ASS | TIMES | DIV | PLUS | MINUS | LPAR | RPAR | CRPAR | CLPAR |
	// SLPAR | SRPAR | OR | AND | EQ | DOUBLECOL | IF | IN | LET | INTTYPE |
	// VAR | FUN | NOT | BOOLTYPE | THEN | ELSE | TRUE | REST | PRINT |
	// EMPTY | FIRST | FALSE | NAT | ID | WHITESP | ERR )
	int alt5 = 38;
	alt5 = dfa5.predict(input);
	switch (alt5) {
	case 1:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:10: COMMA
	{
	    mCOMMA();

	}
	    break;
	case 2:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:16: COL
	{
	    mCOL();

	}
	    break;
	case 3:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:20: SEMIC
	{
	    mSEMIC();

	}
	    break;
	case 4:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:26: ASS
	{
	    mASS();

	}
	    break;
	case 5:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:30: TIMES
	{
	    mTIMES();

	}
	    break;
	case 6:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:36: DIV
	{
	    mDIV();

	}
	    break;
	case 7:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:40: PLUS
	{
	    mPLUS();

	}
	    break;
	case 8:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:45: MINUS
	{
	    mMINUS();

	}
	    break;
	case 9:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:51: LPAR
	{
	    mLPAR();

	}
	    break;
	case 10:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:56: RPAR
	{
	    mRPAR();

	}
	    break;
	case 11:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:61: CRPAR
	{
	    mCRPAR();

	}
	    break;
	case 12:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:67: CLPAR
	{
	    mCLPAR();

	}
	    break;
	case 13:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:73: SLPAR
	{
	    mSLPAR();

	}
	    break;
	case 14:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:79: SRPAR
	{
	    mSRPAR();

	}
	    break;
	case 15:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:85: OR
	{
	    mOR();

	}
	    break;
	case 16:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:88: AND
	{
	    mAND();

	}
	    break;
	case 17:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:92: EQ
	{
	    mEQ();

	}
	    break;
	case 18:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:95: DOUBLECOL
	{
	    mDOUBLECOL();

	}
	    break;
	case 19:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:105: IF
	{
	    mIF();

	}
	    break;
	case 20:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:108: IN
	{
	    mIN();

	}
	    break;
	case 21:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:111: LET
	{
	    mLET();

	}
	    break;
	case 22:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:115: INTTYPE
	{
	    mINTTYPE();

	}
	    break;
	case 23:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:123: VAR
	{
	    mVAR();

	}
	    break;
	case 24:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:127: FUN
	{
	    mFUN();

	}
	    break;
	case 25:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:131: NOT
	{
	    mNOT();

	}
	    break;
	case 26:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:135: BOOLTYPE
	{
	    mBOOLTYPE();

	}
	    break;
	case 27:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:144: THEN
	{
	    mTHEN();

	}
	    break;
	case 28:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:149: ELSE
	{
	    mELSE();

	}
	    break;
	case 29:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:154: TRUE
	{
	    mTRUE();

	}
	    break;
	case 30:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:159: REST
	{
	    mREST();

	}
	    break;
	case 31:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:164: PRINT
	{
	    mPRINT();

	}
	    break;
	case 32:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:170: EMPTY
	{
	    mEMPTY();

	}
	    break;
	case 33:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:176: FIRST
	{
	    mFIRST();

	}
	    break;
	case 34:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:182: FALSE
	{
	    mFALSE();

	}
	    break;
	case 35:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:188: NAT
	{
	    mNAT();

	}
	    break;
	case 36:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:192: ID
	{
	    mID();

	}
	    break;
	case 37:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:195: WHITESP
	{
	    mWHITESP();

	}
	    break;
	case 38:
	// /home/benkio/workspace/LPeMC Lab
	// Project/src/highLevelLanguage/MiniFun.g:1:203: ERR
	{
	    mERR();

	}
	    break;

	}
    }

    protected DFA5 dfa5 = new DFA5(this);
    static final String DFA5_eotS = "\2\uffff\1\42\1\uffff\1\45\12\uffff\2\37\12\64\27\uffff\1\104\1\106\1"
	    + "\uffff\15\64\3\uffff\1\124\1\uffff\1\125\1\126\1\127\2\64\1\132\7\64\4"
	    + "\uffff\2\64\1\uffff\1\144\1\145\1\146\1\147\1\64\1\151\1\64\1\153\1\154"
	    + "\4\uffff\1\155\1\uffff\1\156\4\uffff";
    static final String DFA5_eofS = "\157\uffff";
    static final String DFA5_minS = "\1\0\1\uffff\1\72\1\uffff\1\75\12\uffff\1\174\1\46\1\146\1\145\2\141\2"
	    + "\157\1\150\1\154\1\145\1\162\27\uffff\2\60\1\uffff\1\164\1\162\1\156\1"
	    + "\162\1\154\1\164\1\157\1\145\1\165\1\163\1\160\1\163\1\151\3\uffff\1\60"
	    + "\1\uffff\3\60\2\163\1\60\1\154\1\156\2\145\2\164\1\156\4\uffff\1\164\1"
	    + "\145\1\uffff\4\60\1\171\1\60\1\164\2\60\4\uffff\1\60\1\uffff\1\60\4\uffff";
    static final String DFA5_maxS = "\1\uffff\1\uffff\1\72\1\uffff\1\75\12\uffff\1\174\1\46\1\156\1\145\1\141"
	    + "\1\165\2\157\1\162\1\155\1\145\1\162\27\uffff\2\172\1\uffff\1\164\1\162"
	    + "\1\156\1\162\1\154\1\164\1\157\1\145\1\165\1\163\1\160\1\163\1\151\3\uffff"
	    + "\1\172\1\uffff\3\172\2\163\1\172\1\154\1\156\2\145\2\164\1\156\4\uffff"
	    + "\1\164\1\145\1\uffff\4\172\1\171\1\172\1\164\2\172\4\uffff\1\172\1\uffff"
	    + "\1\172\4\uffff";
    static final String DFA5_acceptS = "\1\uffff\1\1\1\uffff\1\3\1\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"
	    + "\1\15\1\16\14\uffff\2\43\1\44\1\45\1\46\1\1\1\22\1\2\1\3\1\21\1\4\1\5"
	    + "\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\2\uffff\1\44\15"
	    + "\uffff\1\43\1\45\1\23\1\uffff\1\24\15\uffff\1\26\1\25\1\27\1\30\2\uffff"
	    + "\1\31\11\uffff\1\32\1\33\1\35\1\34\1\uffff\1\36\1\uffff\1\41\1\42\1\40"
	    + "\1\37";
    static final String DFA5_specialS = "\1\0\156\uffff}>";
    static final String[] DFA5_transitionS = {
	    "\11\37\2\36\2\37\1\36\22\37\1\36\5\37\1\20\1\37\1\11\1\12\1\5\1\7\1\1"
		    + "\1\10\1\37\1\6\1\33\11\34\1\2\1\3\1\37\1\4\3\37\32\35\1\15\1\37\1\16"
		    + "\3\37\1\35\1\26\2\35\1\30\1\24\2\35\1\21\2\35\1\22\1\35\1\25\1\35\1\32"
		    + "\1\35\1\31\1\35\1\27\1\35\1\23\4\35\1\14\1\17\1\13\uff82\37",
	    "", "\1\41", "", "\1\44", "", "", "", "", "", "", "", "", "", "",
	    "\1\60", "\1\61", "\1\62\7\uffff\1\63", "\1\65", "\1\66",
	    "\1\71\7\uffff\1\70\13\uffff\1\67", "\1\72", "\1\73",
	    "\1\74\11\uffff\1\75", "\1\76\1\77", "\1\100", "\1\101", "", "",
	    "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "",
	    "", "", "", "", "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\23\64\1\105\6\64", "", "\1\107",
	    "\1\110", "\1\111", "\1\112", "\1\113", "\1\114", "\1\115",
	    "\1\116", "\1\117", "\1\120", "\1\121", "\1\122", "\1\123", "", "",
	    "", "\12\64\7\uffff\32\64\6\uffff\32\64", "",
	    "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "\1\130", "\1\131",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "\1\133", "\1\134", "\1\135",
	    "\1\136", "\1\137", "\1\140", "\1\141", "", "", "", "", "\1\142",
	    "\1\143", "", "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "\1\150",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "\1\152",
	    "\12\64\7\uffff\32\64\6\uffff\32\64",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "", "", "", "",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "",
	    "\12\64\7\uffff\32\64\6\uffff\32\64", "", "", "", "" };

    static final short[] DFA5_eot = DFA.unpackEncodedString(DFA5_eotS);
    static final short[] DFA5_eof = DFA.unpackEncodedString(DFA5_eofS);
    static final char[] DFA5_min = DFA
	    .unpackEncodedStringToUnsignedChars(DFA5_minS);
    static final char[] DFA5_max = DFA
	    .unpackEncodedStringToUnsignedChars(DFA5_maxS);
    static final short[] DFA5_accept = DFA.unpackEncodedString(DFA5_acceptS);
    static final short[] DFA5_special = DFA.unpackEncodedString(DFA5_specialS);
    static final short[][] DFA5_transition;

    static {
	int numStates = DFA5_transitionS.length;
	DFA5_transition = new short[numStates][];
	for (int i = 0; i < numStates; i++) {
	    DFA5_transition[i] = DFA.unpackEncodedString(DFA5_transitionS[i]);
	}
    }

    protected class DFA5 extends DFA {

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

	@Override
	public String getDescription() {
	    return "1:1: Tokens : ( COMMA | COL | SEMIC | ASS | TIMES | DIV | PLUS | MINUS | LPAR | RPAR | CRPAR | CLPAR | SLPAR | SRPAR | OR | AND | EQ | DOUBLECOL | IF | IN | LET | INTTYPE | VAR | FUN | NOT | BOOLTYPE | THEN | ELSE | TRUE | REST | PRINT | EMPTY | FIRST | FALSE | NAT | ID | WHITESP | ERR );";
	}

	@Override
	public int specialStateTransition(int s, IntStream _input)
		throws NoViableAltException {
	    IntStream input = _input;
	    int _s = s;
	    switch (s) {
	    case 0:
		int LA5_0 = input.LA(1);
		s = -1;
		if ((LA5_0 == ',')) {
		    s = 1;
		} else if ((LA5_0 == ':')) {
		    s = 2;
		} else if ((LA5_0 == ';')) {
		    s = 3;
		} else if ((LA5_0 == '=')) {
		    s = 4;
		} else if ((LA5_0 == '*')) {
		    s = 5;
		} else if ((LA5_0 == '/')) {
		    s = 6;
		} else if ((LA5_0 == '+')) {
		    s = 7;
		} else if ((LA5_0 == '-')) {
		    s = 8;
		} else if ((LA5_0 == '(')) {
		    s = 9;
		} else if ((LA5_0 == ')')) {
		    s = 10;
		} else if ((LA5_0 == '}')) {
		    s = 11;
		} else if ((LA5_0 == '{')) {
		    s = 12;
		} else if ((LA5_0 == '[')) {
		    s = 13;
		} else if ((LA5_0 == ']')) {
		    s = 14;
		} else if ((LA5_0 == '|')) {
		    s = 15;
		} else if ((LA5_0 == '&')) {
		    s = 16;
		} else if ((LA5_0 == 'i')) {
		    s = 17;
		} else if ((LA5_0 == 'l')) {
		    s = 18;
		} else if ((LA5_0 == 'v')) {
		    s = 19;
		} else if ((LA5_0 == 'f')) {
		    s = 20;
		} else if ((LA5_0 == 'n')) {
		    s = 21;
		} else if ((LA5_0 == 'b')) {
		    s = 22;
		} else if ((LA5_0 == 't')) {
		    s = 23;
		} else if ((LA5_0 == 'e')) {
		    s = 24;
		} else if ((LA5_0 == 'r')) {
		    s = 25;
		} else if ((LA5_0 == 'p')) {
		    s = 26;
		} else if ((LA5_0 == '0')) {
		    s = 27;
		} else if (((LA5_0 >= '1' && LA5_0 <= '9'))) {
		    s = 28;
		} else if (((LA5_0 >= 'A' && LA5_0 <= 'Z') || LA5_0 == 'a'
			|| (LA5_0 >= 'c' && LA5_0 <= 'd')
			|| (LA5_0 >= 'g' && LA5_0 <= 'h')
			|| (LA5_0 >= 'j' && LA5_0 <= 'k') || LA5_0 == 'm'
			|| LA5_0 == 'o' || LA5_0 == 'q' || LA5_0 == 's'
			|| LA5_0 == 'u' || (LA5_0 >= 'w' && LA5_0 <= 'z'))) {
		    s = 29;
		} else if (((LA5_0 >= '\t' && LA5_0 <= '\n') || LA5_0 == '\r' || LA5_0 == ' ')) {
		    s = 30;
		} else if (((LA5_0 >= '\u0000' && LA5_0 <= '\b')
			|| (LA5_0 >= '\u000B' && LA5_0 <= '\f')
			|| (LA5_0 >= '\u000E' && LA5_0 <= '\u001F')
			|| (LA5_0 >= '!' && LA5_0 <= '%') || LA5_0 == '\''
			|| LA5_0 == '.' || LA5_0 == '<'
			|| (LA5_0 >= '>' && LA5_0 <= '@') || LA5_0 == '\\'
			|| (LA5_0 >= '^' && LA5_0 <= '`') || (LA5_0 >= '~' && LA5_0 <= '\uFFFF'))) {
		    s = 31;
		}
		if (s >= 0)
		    return s;
		break;
	    }
	    NoViableAltException nvae = new NoViableAltException(
		    getDescription(), 5, _s, input);
	    error(nvae);
	    throw nvae;
	}
    }

}
