// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-03-01 13:33:42

package highLevelLanguage;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniFunLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int ASS=6;
	public static final int BOOLTYPE=7;
	public static final int CLPAR=8;
	public static final int COL=9;
	public static final int COMMA=10;
	public static final int CRPAR=11;
	public static final int DIVIDE=12;
	public static final int DOUBLECOL=13;
	public static final int ELSE=14;
	public static final int EMPTY=15;
	public static final int EQ=16;
	public static final int ERR=17;
	public static final int FALSE=18;
	public static final int FIRST=19;
	public static final int FUN=20;
	public static final int GREATEREQ=21;
	public static final int ID=22;
	public static final int IF=23;
	public static final int IN=24;
	public static final int INTTYPE=25;
	public static final int LANPAR=26;
	public static final int LESSEQ=27;
	public static final int LET=28;
	public static final int LIST=29;
	public static final int LPAR=30;
	public static final int MINUS=31;
	public static final int NAT=32;
	public static final int NOT=33;
	public static final int OR=34;
	public static final int PLUS=35;
	public static final int PRINT=36;
	public static final int RANPAR=37;
	public static final int REST=38;
	public static final int RPAR=39;
	public static final int SEMIC=40;
	public static final int SLPAR=41;
	public static final int SRPAR=42;
	public static final int THEN=43;
	public static final int TIMES=44;
	public static final int TRUE=45;
	public static final int VAR=46;
	public static final int WHITESP=47;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public MiniFunLexer() {} 
	public MiniFunLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public MiniFunLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "/home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g"; }

	// $ANTLR start "LET"
	public final void mLET() throws RecognitionException {
		try {
			int _type = LET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:445:7: ( 'let' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:445:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LET"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:446:5: ( 'in' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:446:7: 'in'
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
	// $ANTLR end "IN"

	// $ANTLR start "SEMIC"
	public final void mSEMIC() throws RecognitionException {
		try {
			int _type = SEMIC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:447:8: ( ';' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:447:10: ';'
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
	// $ANTLR end "SEMIC"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:448:6: ( ':' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:448:8: ':'
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
	// $ANTLR end "COL"

	// $ANTLR start "DOUBLECOL"
	public final void mDOUBLECOL() throws RecognitionException {
		try {
			int _type = DOUBLECOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:449:11: ( '::' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:449:13: '::'
			{
			match("::"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOUBLECOL"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:450:8: ( ',' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:450:10: ','
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
	// $ANTLR end "COMMA"

	// $ANTLR start "ASS"
	public final void mASS() throws RecognitionException {
		try {
			int _type = ASS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:451:6: ( '=' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:451:8: '='
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
	// $ANTLR end "ASS"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:452:5: ( '==' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:452:7: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "LANPAR"
	public final void mLANPAR() throws RecognitionException {
		try {
			int _type = LANPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:453:9: ( '<' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:453:11: '<'
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
	// $ANTLR end "LANPAR"

	// $ANTLR start "RANPAR"
	public final void mRANPAR() throws RecognitionException {
		try {
			int _type = RANPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:454:9: ( '>' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:454:11: '>'
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
	// $ANTLR end "RANPAR"

	// $ANTLR start "LESSEQ"
	public final void mLESSEQ() throws RecognitionException {
		try {
			int _type = LESSEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:455:10: ( '<=' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:455:12: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSEQ"

	// $ANTLR start "GREATEREQ"
	public final void mGREATEREQ() throws RecognitionException {
		try {
			int _type = GREATEREQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:456:11: ( '>=' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:456:13: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATEREQ"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:457:7: ( '+' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:457:9: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:458:8: ( '-' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:458:10: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "ARROW"
	public final void mARROW() throws RecognitionException {
		try {
			int _type = ARROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:459:8: ( '->' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:459:10: '->'
			{
			match("->"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ARROW"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:460:5: ( '||' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:460:7: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "TIMES"
	public final void mTIMES() throws RecognitionException {
		try {
			int _type = TIMES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:461:8: ( '*' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:461:10: '*'
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
	// $ANTLR end "TIMES"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:462:9: ( '/' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:462:11: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:463:6: ( '&&' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:463:8: '&&'
			{
			match("&&"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "NAT"
	public final void mNAT() throws RecognitionException {
		try {
			int _type = NAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:6: ( ( ( '1' .. '9' ) ( '0' .. '9' )* ) | '0' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( ((LA2_0 >= '1' && LA2_0 <= '9')) ) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:8: ( ( '1' .. '9' ) ( '0' .. '9' )* )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:8: ( ( '1' .. '9' ) ( '0' .. '9' )* )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:9: ( '1' .. '9' ) ( '0' .. '9' )*
					{
					if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:19: ( '0' .. '9' )*
					loop1:
					while (true) {
						int alt1=2;
						int LA1_0 = input.LA(1);
						if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
							alt1=1;
						}

						switch (alt1) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:
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
							break loop1;
						}
					}

					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:464:34: '0'
					{
					match('0'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NAT"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:465:7: ( 'true' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:465:9: 'true'
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
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:466:8: ( 'false' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:466:10: 'false'
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

	// $ANTLR start "EMPTY"
	public final void mEMPTY() throws RecognitionException {
		try {
			int _type = EMPTY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:467:10: ( 'empty' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:467:12: 'empty'
			{
			match("empty"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EMPTY"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:468:6: ( 'not' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:468:8: 'not'
			{
			match("not"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "VAR"
	public final void mVAR() throws RecognitionException {
		try {
			int _type = VAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:469:7: ( 'var' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:469:9: 'var'
			{
			match("var"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VAR"

	// $ANTLR start "FUN"
	public final void mFUN() throws RecognitionException {
		try {
			int _type = FUN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:470:7: ( 'fun' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:470:9: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FUN"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:471:8: ( '(' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:471:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:472:7: ( ')' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:472:9: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "CLPAR"
	public final void mCLPAR() throws RecognitionException {
		try {
			int _type = CLPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:473:9: ( '{' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:473:11: '{'
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
	// $ANTLR end "CLPAR"

	// $ANTLR start "CRPAR"
	public final void mCRPAR() throws RecognitionException {
		try {
			int _type = CRPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:474:8: ( '}' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:474:10: '}'
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
	// $ANTLR end "CRPAR"

	// $ANTLR start "SLPAR"
	public final void mSLPAR() throws RecognitionException {
		try {
			int _type = SLPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:475:9: ( '[' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:475:11: '['
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
	// $ANTLR end "SLPAR"

	// $ANTLR start "SRPAR"
	public final void mSRPAR() throws RecognitionException {
		try {
			int _type = SRPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:476:8: ( ']' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:476:10: ']'
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
	// $ANTLR end "SRPAR"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:477:6: ( 'if' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:477:8: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:478:8: ( 'then' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:478:10: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:479:8: ( 'else' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:479:10: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:480:8: ( 'print' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:480:10: 'print'
			{
			match("print"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PRINT"

	// $ANTLR start "FIRST"
	public final void mFIRST() throws RecognitionException {
		try {
			int _type = FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:481:10: ( 'first' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:481:12: 'first'
			{
			match("first"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FIRST"

	// $ANTLR start "REST"
	public final void mREST() throws RecognitionException {
		try {
			int _type = REST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:482:10: ( 'rest' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:482:12: 'rest'
			{
			match("rest"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "REST"

	// $ANTLR start "INTTYPE"
	public final void mINTTYPE() throws RecognitionException {
		try {
			int _type = INTTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:483:10: ( 'int' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:483:12: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTTYPE"

	// $ANTLR start "BOOLTYPE"
	public final void mBOOLTYPE() throws RecognitionException {
		try {
			int _type = BOOLTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:484:10: ( 'bool' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:484:12: 'bool'
			{
			match("bool"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BOOLTYPE"

	// $ANTLR start "LIST"
	public final void mLIST() throws RecognitionException {
		try {
			int _type = LIST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:485:7: ( 'list' )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:485:9: 'list'
			{
			match("list"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIST"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:487:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:487:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:487:27: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "WHITESP"
	public final void mWHITESP() throws RecognitionException {
		try {
			int _type = WHITESP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:489:11: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:489:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:489:13: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt4=0;
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '\t' && LA4_0 <= '\n')||LA4_0=='\r'||LA4_0==' ') ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:
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
					if ( cnt4 >= 1 ) break loop4;
					EarlyExitException eee = new EarlyExitException(4, input);
					throw eee;
				}
				cnt4++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHITESP"

	// $ANTLR start "ERR"
	public final void mERR() throws RecognitionException {
		try {
			int _type = ERR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:491:10: ( . )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:491:12: .
			{
			matchAny(); 
			 System.out.println("Invalid char: "+getText()); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ERR"

	@Override
	public void mTokens() throws RecognitionException {
		// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:8: ( LET | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LANPAR | RANPAR | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | LIST | ID | WHITESP | ERR )
		int alt5=44;
		alt5 = dfa5.predict(input);
		switch (alt5) {
			case 1 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:10: LET
				{
				mLET(); 

				}
				break;
			case 2 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:14: IN
				{
				mIN(); 

				}
				break;
			case 3 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:17: SEMIC
				{
				mSEMIC(); 

				}
				break;
			case 4 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:23: COL
				{
				mCOL(); 

				}
				break;
			case 5 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:27: DOUBLECOL
				{
				mDOUBLECOL(); 

				}
				break;
			case 6 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:37: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 7 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:43: ASS
				{
				mASS(); 

				}
				break;
			case 8 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:47: EQ
				{
				mEQ(); 

				}
				break;
			case 9 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:50: LANPAR
				{
				mLANPAR(); 

				}
				break;
			case 10 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:57: RANPAR
				{
				mRANPAR(); 

				}
				break;
			case 11 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:64: LESSEQ
				{
				mLESSEQ(); 

				}
				break;
			case 12 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:71: GREATEREQ
				{
				mGREATEREQ(); 

				}
				break;
			case 13 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:81: PLUS
				{
				mPLUS(); 

				}
				break;
			case 14 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:86: MINUS
				{
				mMINUS(); 

				}
				break;
			case 15 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:92: ARROW
				{
				mARROW(); 

				}
				break;
			case 16 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:98: OR
				{
				mOR(); 

				}
				break;
			case 17 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:101: TIMES
				{
				mTIMES(); 

				}
				break;
			case 18 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:107: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 19 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:114: AND
				{
				mAND(); 

				}
				break;
			case 20 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:118: NAT
				{
				mNAT(); 

				}
				break;
			case 21 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:122: TRUE
				{
				mTRUE(); 

				}
				break;
			case 22 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:127: FALSE
				{
				mFALSE(); 

				}
				break;
			case 23 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:133: EMPTY
				{
				mEMPTY(); 

				}
				break;
			case 24 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:139: NOT
				{
				mNOT(); 

				}
				break;
			case 25 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:143: VAR
				{
				mVAR(); 

				}
				break;
			case 26 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:147: FUN
				{
				mFUN(); 

				}
				break;
			case 27 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:151: LPAR
				{
				mLPAR(); 

				}
				break;
			case 28 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:156: RPAR
				{
				mRPAR(); 

				}
				break;
			case 29 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:161: CLPAR
				{
				mCLPAR(); 

				}
				break;
			case 30 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:167: CRPAR
				{
				mCRPAR(); 

				}
				break;
			case 31 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:173: SLPAR
				{
				mSLPAR(); 

				}
				break;
			case 32 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:179: SRPAR
				{
				mSRPAR(); 

				}
				break;
			case 33 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:185: IF
				{
				mIF(); 

				}
				break;
			case 34 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:188: THEN
				{
				mTHEN(); 

				}
				break;
			case 35 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:193: ELSE
				{
				mELSE(); 

				}
				break;
			case 36 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:198: PRINT
				{
				mPRINT(); 

				}
				break;
			case 37 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:204: FIRST
				{
				mFIRST(); 

				}
				break;
			case 38 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:210: REST
				{
				mREST(); 

				}
				break;
			case 39 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:215: INTTYPE
				{
				mINTTYPE(); 

				}
				break;
			case 40 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:223: BOOLTYPE
				{
				mBOOLTYPE(); 

				}
				break;
			case 41 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:232: LIST
				{
				mLIST(); 

				}
				break;
			case 42 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:237: ID
				{
				mID(); 

				}
				break;
			case 43 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:240: WHITESP
				{
				mWHITESP(); 

				}
				break;
			case 44 :
				// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:1:248: ERR
				{
				mERR(); 

				}
				break;

		}
	}


	protected DFA5 dfa5 = new DFA5(this);
	static final String DFA5_eotS =
		"\1\uffff\2\44\1\uffff\1\51\1\uffff\1\54\1\56\1\60\1\uffff\1\63\1\41\2"+
		"\uffff\1\41\2\uffff\5\44\6\uffff\3\44\3\uffff\2\44\1\uffff\1\117\1\120"+
		"\22\uffff\11\44\6\uffff\3\44\1\uffff\1\135\1\44\1\137\2\uffff\3\44\1\143"+
		"\3\44\1\147\1\150\3\44\1\uffff\1\154\1\uffff\1\155\1\156\1\44\1\uffff"+
		"\2\44\1\162\2\uffff\1\44\1\164\1\165\3\uffff\1\166\1\167\1\170\1\uffff"+
		"\1\171\6\uffff";
	static final String DFA5_eofS =
		"\172\uffff";
	static final String DFA5_minS =
		"\1\0\1\145\1\146\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76\1\174\2\uffff"+
		"\1\46\2\uffff\1\150\1\141\1\154\1\157\1\141\6\uffff\1\162\1\145\1\157"+
		"\3\uffff\1\164\1\163\1\uffff\2\60\22\uffff\1\165\1\145\1\154\1\156\1\162"+
		"\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163\1\157\1\uffff\1\60\1\164"+
		"\1\60\2\uffff\1\145\1\156\1\163\1\60\1\163\1\164\1\145\2\60\1\156\1\164"+
		"\1\154\1\uffff\1\60\1\uffff\2\60\1\145\1\uffff\1\164\1\171\1\60\2\uffff"+
		"\1\164\2\60\3\uffff\3\60\1\uffff\1\60\6\uffff";
	static final String DFA5_maxS =
		"\1\uffff\1\151\1\156\1\uffff\1\72\1\uffff\3\75\1\uffff\1\76\1\174\2\uffff"+
		"\1\46\2\uffff\1\162\1\165\1\155\1\157\1\141\6\uffff\1\162\1\145\1\157"+
		"\3\uffff\1\164\1\163\1\uffff\2\172\22\uffff\1\165\1\145\1\154\1\156\1"+
		"\162\1\160\1\163\1\164\1\162\6\uffff\1\151\1\163\1\157\1\uffff\1\172\1"+
		"\164\1\172\2\uffff\1\145\1\156\1\163\1\172\1\163\1\164\1\145\2\172\1\156"+
		"\1\164\1\154\1\uffff\1\172\1\uffff\2\172\1\145\1\uffff\1\164\1\171\1\172"+
		"\2\uffff\1\164\2\172\3\uffff\3\172\1\uffff\1\172\6\uffff";
	static final String DFA5_acceptS =
		"\3\uffff\1\3\1\uffff\1\6\3\uffff\1\15\2\uffff\1\21\1\22\1\uffff\2\24\5"+
		"\uffff\1\33\1\34\1\35\1\36\1\37\1\40\3\uffff\1\52\1\53\1\54\2\uffff\1"+
		"\52\2\uffff\1\3\1\5\1\4\1\6\1\10\1\7\1\13\1\11\1\14\1\12\1\15\1\17\1\16"+
		"\1\20\1\21\1\22\1\23\1\24\11\uffff\1\33\1\34\1\35\1\36\1\37\1\40\3\uffff"+
		"\1\53\3\uffff\1\2\1\41\14\uffff\1\1\1\uffff\1\47\3\uffff\1\32\3\uffff"+
		"\1\30\1\31\3\uffff\1\51\1\25\1\42\3\uffff\1\43\1\uffff\1\46\1\50\1\26"+
		"\1\45\1\27\1\44";
	static final String DFA5_specialS =
		"\1\0\171\uffff}>";
	static final String[] DFA5_transitionS = {
			"\11\41\2\40\2\41\1\40\22\41\1\40\5\41\1\16\1\41\1\26\1\27\1\14\1\11\1"+
			"\5\1\12\1\41\1\15\1\20\11\17\1\4\1\3\1\7\1\6\1\10\2\41\32\37\1\32\1\41"+
			"\1\33\3\41\1\37\1\36\2\37\1\23\1\22\2\37\1\2\2\37\1\1\1\37\1\24\1\37"+
			"\1\34\1\37\1\35\1\37\1\21\1\37\1\25\4\37\1\30\1\13\1\31\uff82\41",
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
			return "1:1: Tokens : ( LET | IN | SEMIC | COL | DOUBLECOL | COMMA | ASS | EQ | LANPAR | RANPAR | LESSEQ | GREATEREQ | PLUS | MINUS | ARROW | OR | TIMES | DIVIDE | AND | NAT | TRUE | FALSE | EMPTY | NOT | VAR | FUN | LPAR | RPAR | CLPAR | CRPAR | SLPAR | SRPAR | IF | THEN | ELSE | PRINT | FIRST | REST | INTTYPE | BOOLTYPE | LIST | ID | WHITESP | ERR );";
		}
		@Override
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
						else if ( ((LA5_0 >= '1' && LA5_0 <= '9')) ) {s = 15;}
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
						else if ( ((LA5_0 >= 'A' && LA5_0 <= 'Z')||LA5_0=='a'||(LA5_0 >= 'c' && LA5_0 <= 'd')||(LA5_0 >= 'g' && LA5_0 <= 'h')||(LA5_0 >= 'j' && LA5_0 <= 'k')||LA5_0=='m'||LA5_0=='o'||LA5_0=='q'||LA5_0=='s'||LA5_0=='u'||(LA5_0 >= 'w' && LA5_0 <= 'z')) ) {s = 31;}
						else if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {s = 32;}
						else if ( ((LA5_0 >= '\u0000' && LA5_0 <= '\b')||(LA5_0 >= '\u000B' && LA5_0 <= '\f')||(LA5_0 >= '\u000E' && LA5_0 <= '\u001F')||(LA5_0 >= '!' && LA5_0 <= '%')||LA5_0=='\''||LA5_0=='.'||(LA5_0 >= '?' && LA5_0 <= '@')||LA5_0=='\\'||(LA5_0 >= '^' && LA5_0 <= '`')||(LA5_0 >= '~' && LA5_0 <= '\uFFFF')) ) {s = 33;}
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
