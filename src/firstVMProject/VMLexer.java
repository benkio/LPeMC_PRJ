// $ANTLR 3.5.1 /home/benkio/Documents/Compilator/VM.g 2013-11-24 15:23:10
package firstVMProject;

import org.antlr.runtime.*;

@SuppressWarnings("all")
public class VMLexer extends Lexer {
	public static final int EOF = -1;
	public static final int ADD = 4;
	public static final int BRANCH = 5;
	public static final int BRANCHEQUAL = 6;
	public static final int BRANCHLESS = 7;
	public static final int CFP = 8;
	public static final int COL = 9;
	public static final int DIV = 10;
	public static final int ERR = 11;
	public static final int HALT = 12;
	public static final int JS = 13;
	public static final int LABEL = 14;
	public static final int LFP = 15;
	public static final int LHP = 16;
	public static final int LRA = 17;
	public static final int LRV = 18;
	public static final int LW = 19;
	public static final int MULT = 20;
	public static final int NUMBER = 21;
	public static final int POP = 22;
	public static final int PRINT = 23;
	public static final int PUSH = 24;
	public static final int SFP = 25;
	public static final int SHP = 26;
	public static final int SRA = 27;
	public static final int SRV = 28;
	public static final int SUB = 29;
	public static final int SW = 30;
	public static final int WHITESP = 31;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public VMLexer() {
	}

	public VMLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}

	public VMLexer(CharStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override
	public String getGrammarFileName() {
		return "/home/benkio/Documents/Compilator/VM.g";
	}

	// $ANTLR start "PUSH"
	public final void mPUSH() throws RecognitionException {
		try {
			int _type = PUSH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:89:9: ( 'push' )
			// /home/benkio/Documents/Compilator/VM.g:89:11: 'push'
			{
				match("push");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "PUSH"

	// $ANTLR start "POP"
	public final void mPOP() throws RecognitionException {
		try {
			int _type = POP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:90:6: ( 'pop' )
			// /home/benkio/Documents/Compilator/VM.g:90:8: 'pop'
			{
				match("pop");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "POP"

	// $ANTLR start "ADD"
	public final void mADD() throws RecognitionException {
		try {
			int _type = ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:91:6: ( 'add' )
			// /home/benkio/Documents/Compilator/VM.g:91:8: 'add'
			{
				match("add");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "ADD"

	// $ANTLR start "SUB"
	public final void mSUB() throws RecognitionException {
		try {
			int _type = SUB;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:92:6: ( 'sub' )
			// /home/benkio/Documents/Compilator/VM.g:92:8: 'sub'
			{
				match("sub");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SUB"

	// $ANTLR start "MULT"
	public final void mMULT() throws RecognitionException {
		try {
			int _type = MULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:93:7: ( 'mult' )
			// /home/benkio/Documents/Compilator/VM.g:93:9: 'mult'
			{
				match("mult");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "MULT"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:94:6: ( 'div' )
			// /home/benkio/Documents/Compilator/VM.g:94:8: 'div'
			{
				match("div");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "DIV"

	// $ANTLR start "BRANCH"
	public final void mBRANCH() throws RecognitionException {
		try {
			int _type = BRANCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:95:9: ( 'b' )
			// /home/benkio/Documents/Compilator/VM.g:95:11: 'b'
			{
				match('b');
			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BRANCH"

	// $ANTLR start "BRANCHLESS"
	public final void mBRANCHLESS() throws RecognitionException {
		try {
			int _type = BRANCHLESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:96:11: ( 'bless' )
			// /home/benkio/Documents/Compilator/VM.g:96:12: 'bless'
			{
				match("bless");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BRANCHLESS"

	// $ANTLR start "PRINT"
	public final void mPRINT() throws RecognitionException {
		try {
			int _type = PRINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:97:8: ( 'print' )
			// /home/benkio/Documents/Compilator/VM.g:97:10: 'print'
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

	// $ANTLR start "HALT"
	public final void mHALT() throws RecognitionException {
		try {
			int _type = HALT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:98:7: ( 'halt' )
			// /home/benkio/Documents/Compilator/VM.g:98:9: 'halt'
			{
				match("halt");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "HALT"

	// $ANTLR start "SW"
	public final void mSW() throws RecognitionException {
		try {
			int _type = SW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:101:5: ( 'sw' )
			// /home/benkio/Documents/Compilator/VM.g:101:7: 'sw'
			{
				match("sw");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SW"

	// $ANTLR start "LW"
	public final void mLW() throws RecognitionException {
		try {
			int _type = LW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:102:5: ( 'lw' )
			// /home/benkio/Documents/Compilator/VM.g:102:7: 'lw'
			{
				match("lw");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LW"

	// $ANTLR start "BRANCHEQUAL"
	public final void mBRANCHEQUAL() throws RecognitionException {
		try {
			int _type = BRANCHEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:103:12: ( 'beq' )
			// /home/benkio/Documents/Compilator/VM.g:103:13: 'beq'
			{
				match("beq");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "BRANCHEQUAL"

	// $ANTLR start "JS"
	public final void mJS() throws RecognitionException {
		try {
			int _type = JS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:104:5: ( 'js' )
			// /home/benkio/Documents/Compilator/VM.g:104:7: 'js'
			{
				match("js");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "JS"

	// $ANTLR start "LRA"
	public final void mLRA() throws RecognitionException {
		try {
			int _type = LRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:105:6: ( 'lra' )
			// /home/benkio/Documents/Compilator/VM.g:105:8: 'lra'
			{
				match("lra");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LRA"

	// $ANTLR start "SRA"
	public final void mSRA() throws RecognitionException {
		try {
			int _type = SRA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:106:6: ( 'sra' )
			// /home/benkio/Documents/Compilator/VM.g:106:8: 'sra'
			{
				match("sra");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SRA"

	// $ANTLR start "LRV"
	public final void mLRV() throws RecognitionException {
		try {
			int _type = LRV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:107:6: ( 'lrv' )
			// /home/benkio/Documents/Compilator/VM.g:107:8: 'lrv'
			{
				match("lrv");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LRV"

	// $ANTLR start "SRV"
	public final void mSRV() throws RecognitionException {
		try {
			int _type = SRV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:108:6: ( 'srv' )
			// /home/benkio/Documents/Compilator/VM.g:108:8: 'srv'
			{
				match("srv");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SRV"

	// $ANTLR start "LHP"
	public final void mLHP() throws RecognitionException {
		try {
			int _type = LHP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:109:6: ( 'lhp' )
			// /home/benkio/Documents/Compilator/VM.g:109:8: 'lhp'
			{
				match("lhp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LHP"

	// $ANTLR start "SHP"
	public final void mSHP() throws RecognitionException {
		try {
			int _type = SHP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:110:6: ( 'shp' )
			// /home/benkio/Documents/Compilator/VM.g:110:8: 'shp'
			{
				match("shp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SHP"

	// $ANTLR start "LFP"
	public final void mLFP() throws RecognitionException {
		try {
			int _type = LFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:111:6: ( 'lfp' )
			// /home/benkio/Documents/Compilator/VM.g:111:8: 'lfp'
			{
				match("lfp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LFP"

	// $ANTLR start "SFP"
	public final void mSFP() throws RecognitionException {
		try {
			int _type = SFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:112:6: ( 'sfp' )
			// /home/benkio/Documents/Compilator/VM.g:112:8: 'sfp'
			{
				match("sfp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "SFP"

	// $ANTLR start "CFP"
	public final void mCFP() throws RecognitionException {
		try {
			int _type = CFP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:113:6: ( 'cfp' )
			// /home/benkio/Documents/Compilator/VM.g:113:8: 'cfp'
			{
				match("cfp");

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "CFP"

	// $ANTLR start "COL"
	public final void mCOL() throws RecognitionException {
		try {
			int _type = COL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:115:6: ( ':' )
			// /home/benkio/Documents/Compilator/VM.g:115:8: ':'
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

	// $ANTLR start "LABEL"
	public final void mLABEL() throws RecognitionException {
		try {
			int _type = LABEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:116:8: ( ( 'a' .. 'z' |
			// 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' )* )
			// /home/benkio/Documents/Compilator/VM.g:116:10: ( 'a' .. 'z' | 'A'
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
				// /home/benkio/Documents/Compilator/VM.g:116:29: ( 'a' .. 'z' |
				// 'A' .. 'Z' | '0' .. '9' )*
				loop1: while (true) {
					int alt1 = 2;
					int LA1_0 = input.LA(1);
					if (((LA1_0 >= '0' && LA1_0 <= '9')
							|| (LA1_0 >= 'A' && LA1_0 <= 'Z') || (LA1_0 >= 'a' && LA1_0 <= 'z'))) {
						alt1 = 1;
					}

					switch (alt1) {
					case 1:
					// /home/benkio/Documents/Compilator/VM.g:
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
						break loop1;
					}
				}

			}

			state.type = _type;
			state.channel = _channel;
		} finally {
			// do for sure before leaving
		}
	}

	// $ANTLR end "LABEL"

	// $ANTLR start "NUMBER"
	public final void mNUMBER() throws RecognitionException {
		try {
			int _type = NUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:117:9: ( '0' | ( '-' )? (
			// ( '1' .. '9' ) ( '0' .. '9' )* ) )
			int alt4 = 2;
			int LA4_0 = input.LA(1);
			if ((LA4_0 == '0')) {
				alt4 = 1;
			} else if ((LA4_0 == '-' || (LA4_0 >= '1' && LA4_0 <= '9'))) {
				alt4 = 2;
			}

			else {
				NoViableAltException nvae = new NoViableAltException("", 4, 0,
						input);
				throw nvae;
			}

			switch (alt4) {
			case 1:
			// /home/benkio/Documents/Compilator/VM.g:117:11: '0'
			{
				match('0');
			}
				break;
			case 2:
			// /home/benkio/Documents/Compilator/VM.g:117:17: ( '-' )? ( ( '1'
			// .. '9' ) ( '0' .. '9' )* )
			{
				// /home/benkio/Documents/Compilator/VM.g:117:17: ( '-' )?
				int alt2 = 2;
				int LA2_0 = input.LA(1);
				if ((LA2_0 == '-')) {
					alt2 = 1;
				}
				switch (alt2) {
				case 1:
				// /home/benkio/Documents/Compilator/VM.g:117:18: '-'
				{
					match('-');
				}
					break;

				}

				// /home/benkio/Documents/Compilator/VM.g:117:23: ( ( '1' .. '9'
				// ) ( '0' .. '9' )* )
				// /home/benkio/Documents/Compilator/VM.g:117:24: ( '1' .. '9' )
				// ( '0' .. '9' )*
				{
					if ((input.LA(1) >= '1' && input.LA(1) <= '9')) {
						input.consume();
					} else {
						MismatchedSetException mse = new MismatchedSetException(
								null, input);
						recover(mse);
						throw mse;
					}
					// /home/benkio/Documents/Compilator/VM.g:117:34: ( '0' ..
					// '9' )*
					loop3: while (true) {
						int alt3 = 2;
						int LA3_0 = input.LA(1);
						if (((LA3_0 >= '0' && LA3_0 <= '9'))) {
							alt3 = 1;
						}

						switch (alt3) {
						case 1:
						// /home/benkio/Documents/Compilator/VM.g:
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
							break loop3;
						}
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

	// $ANTLR end "NUMBER"

	// $ANTLR start "WHITESP"
	public final void mWHITESP() throws RecognitionException {
		try {
			int _type = WHITESP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// /home/benkio/Documents/Compilator/VM.g:119:10: ( ( '\\t' | ' ' |
			// '\\r' | '\\n' )+ )
			// /home/benkio/Documents/Compilator/VM.g:119:12: ( '\\t' | ' ' |
			// '\\r' | '\\n' )+
			{
				// /home/benkio/Documents/Compilator/VM.g:119:12: ( '\\t' | ' '
				// | '\\r' | '\\n' )+
				int cnt5 = 0;
				loop5: while (true) {
					int alt5 = 2;
					int LA5_0 = input.LA(1);
					if (((LA5_0 >= '\t' && LA5_0 <= '\n') || LA5_0 == '\r' || LA5_0 == ' ')) {
						alt5 = 1;
					}

					switch (alt5) {
					case 1:
					// /home/benkio/Documents/Compilator/VM.g:
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
						if (cnt5 >= 1)
							break loop5;
						EarlyExitException eee = new EarlyExitException(5,
								input);
						throw eee;
					}
					cnt5++;
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
			// /home/benkio/Documents/Compilator/VM.g:121:9: ( . )
			// /home/benkio/Documents/Compilator/VM.g:121:11: .
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
		// /home/benkio/Documents/Compilator/VM.g:1:8: ( PUSH | POP | ADD | SUB
		// | MULT | DIV | BRANCH | BRANCHLESS | PRINT | HALT | SW | LW |
		// BRANCHEQUAL | JS | LRA | SRA | LRV | SRV | LHP | SHP | LFP | SFP |
		// CFP | COL | LABEL | NUMBER | WHITESP | ERR )
		int alt6 = 28;
		alt6 = dfa6.predict(input);
		switch (alt6) {
		case 1:
		// /home/benkio/Documents/Compilator/VM.g:1:10: PUSH
		{
			mPUSH();

		}
			break;
		case 2:
		// /home/benkio/Documents/Compilator/VM.g:1:15: POP
		{
			mPOP();

		}
			break;
		case 3:
		// /home/benkio/Documents/Compilator/VM.g:1:19: ADD
		{
			mADD();

		}
			break;
		case 4:
		// /home/benkio/Documents/Compilator/VM.g:1:23: SUB
		{
			mSUB();

		}
			break;
		case 5:
		// /home/benkio/Documents/Compilator/VM.g:1:27: MULT
		{
			mMULT();

		}
			break;
		case 6:
		// /home/benkio/Documents/Compilator/VM.g:1:32: DIV
		{
			mDIV();

		}
			break;
		case 7:
		// /home/benkio/Documents/Compilator/VM.g:1:36: BRANCH
		{
			mBRANCH();

		}
			break;
		case 8:
		// /home/benkio/Documents/Compilator/VM.g:1:43: BRANCHLESS
		{
			mBRANCHLESS();

		}
			break;
		case 9:
		// /home/benkio/Documents/Compilator/VM.g:1:54: PRINT
		{
			mPRINT();

		}
			break;
		case 10:
		// /home/benkio/Documents/Compilator/VM.g:1:60: HALT
		{
			mHALT();

		}
			break;
		case 11:
		// /home/benkio/Documents/Compilator/VM.g:1:65: SW
		{
			mSW();

		}
			break;
		case 12:
		// /home/benkio/Documents/Compilator/VM.g:1:68: LW
		{
			mLW();

		}
			break;
		case 13:
		// /home/benkio/Documents/Compilator/VM.g:1:71: BRANCHEQUAL
		{
			mBRANCHEQUAL();

		}
			break;
		case 14:
		// /home/benkio/Documents/Compilator/VM.g:1:83: JS
		{
			mJS();

		}
			break;
		case 15:
		// /home/benkio/Documents/Compilator/VM.g:1:86: LRA
		{
			mLRA();

		}
			break;
		case 16:
		// /home/benkio/Documents/Compilator/VM.g:1:90: SRA
		{
			mSRA();

		}
			break;
		case 17:
		// /home/benkio/Documents/Compilator/VM.g:1:94: LRV
		{
			mLRV();

		}
			break;
		case 18:
		// /home/benkio/Documents/Compilator/VM.g:1:98: SRV
		{
			mSRV();

		}
			break;
		case 19:
		// /home/benkio/Documents/Compilator/VM.g:1:102: LHP
		{
			mLHP();

		}
			break;
		case 20:
		// /home/benkio/Documents/Compilator/VM.g:1:106: SHP
		{
			mSHP();

		}
			break;
		case 21:
		// /home/benkio/Documents/Compilator/VM.g:1:110: LFP
		{
			mLFP();

		}
			break;
		case 22:
		// /home/benkio/Documents/Compilator/VM.g:1:114: SFP
		{
			mSFP();

		}
			break;
		case 23:
		// /home/benkio/Documents/Compilator/VM.g:1:118: CFP
		{
			mCFP();

		}
			break;
		case 24:
		// /home/benkio/Documents/Compilator/VM.g:1:122: COL
		{
			mCOL();

		}
			break;
		case 25:
		// /home/benkio/Documents/Compilator/VM.g:1:126: LABEL
		{
			mLABEL();

		}
			break;
		case 26:
		// /home/benkio/Documents/Compilator/VM.g:1:132: NUMBER
		{
			mNUMBER();

		}
			break;
		case 27:
		// /home/benkio/Documents/Compilator/VM.g:1:139: WHITESP
		{
			mWHITESP();

		}
			break;
		case 28:
		// /home/benkio/Documents/Compilator/VM.g:1:147: ERR
		{
			mERR();

		}
			break;

		}
	}

	protected DFA6 dfa6 = new DFA6(this);
	static final String DFA6_eotS = "\1\uffff\5\25\1\40\4\25\3\uffff\1\21\3\uffff\3\25\1\uffff\2\25\1\60\7"
			+ "\25\1\uffff\1\25\1\72\3\25\1\77\1\25\3\uffff\1\25\1\102\1\25\1\104\1\105"
			+ "\1\uffff\1\106\1\107\1\110\1\111\1\25\1\113\1\25\1\115\1\25\1\uffff\1"
			+ "\117\1\120\1\121\1\122\1\uffff\1\123\1\124\1\uffff\1\25\6\uffff\1\126"
			+ "\1\uffff\1\25\1\uffff\1\130\6\uffff\1\131\1\uffff\1\132\3\uffff";
	static final String DFA6_eofS = "\133\uffff";
	static final String DFA6_minS = "\1\0\1\157\1\144\1\146\1\165\1\151\1\60\1\141\1\146\1\163\1\146\3\uffff"
			+ "\1\61\3\uffff\1\163\1\160\1\151\1\uffff\1\144\1\142\1\60\1\141\2\160\1"
			+ "\154\1\166\1\145\1\161\1\uffff\1\154\1\60\1\141\2\160\1\60\1\160\3\uffff"
			+ "\1\150\1\60\1\156\2\60\1\uffff\4\60\1\164\1\60\1\163\1\60\1\164\1\uffff"
			+ "\4\60\1\uffff\2\60\1\uffff\1\164\6\uffff\1\60\1\uffff\1\163\1\uffff\1"
			+ "\60\6\uffff\1\60\1\uffff\1\60\3\uffff";
	static final String DFA6_maxS = "\1\uffff\1\165\1\144\1\167\1\165\1\151\1\172\1\141\1\167\1\163\1\146\3"
			+ "\uffff\1\71\3\uffff\1\163\1\160\1\151\1\uffff\1\144\1\142\1\172\1\166"
			+ "\2\160\1\154\1\166\1\145\1\161\1\uffff\1\154\1\172\1\166\2\160\1\172\1"
			+ "\160\3\uffff\1\150\1\172\1\156\2\172\1\uffff\4\172\1\164\1\172\1\163\1"
			+ "\172\1\164\1\uffff\4\172\1\uffff\2\172\1\uffff\1\164\6\uffff\1\172\1\uffff"
			+ "\1\163\1\uffff\1\172\6\uffff\1\172\1\uffff\1\172\3\uffff";
	static final String DFA6_acceptS = "\13\uffff\1\30\1\31\1\32\1\uffff\1\32\1\33\1\34\3\uffff\1\31\12\uffff"
			+ "\1\7\7\uffff\1\30\1\32\1\33\5\uffff\1\13\11\uffff\1\14\4\uffff\1\16\2"
			+ "\uffff\1\2\1\uffff\1\3\1\4\1\20\1\22\1\24\1\26\1\uffff\1\6\1\uffff\1\15"
			+ "\1\uffff\1\17\1\21\1\23\1\25\1\27\1\1\1\uffff\1\5\1\uffff\1\12\1\11\1"
			+ "\10";
	static final String DFA6_specialS = "\1\0\132\uffff}>";
	static final String[] DFA6_transitionS = {
			"\11\21\2\20\2\21\1\20\22\21\1\20\14\21\1\16\2\21\1\15\11\17\1\13\6\21"
					+ "\32\14\6\21\1\2\1\6\1\12\1\5\3\14\1\7\1\14\1\11\1\14\1\10\1\4\2\14\1"
					+ "\1\2\14\1\3\7\14\uff85\21",
			"\1\23\2\uffff\1\24\2\uffff\1\22", "\1\26",
			"\1\33\1\uffff\1\32\11\uffff\1\31\2\uffff\1\27\1\uffff\1\30",
			"\1\34", "\1\35",
			"\12\25\7\uffff\32\25\6\uffff\4\25\1\37\6\25\1\36\16\25", "\1\41",
			"\1\45\1\uffff\1\44\11\uffff\1\43\4\uffff\1\42", "\1\46", "\1\47",
			"", "", "", "\11\51", "", "", "", "\1\53", "\1\54", "\1\55", "",
			"\1\56", "\1\57", "\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\61\24\uffff\1\62", "\1\63", "\1\64", "\1\65", "\1\66", "\1\67",
			"\1\70", "", "\1\71", "\12\25\7\uffff\32\25\6\uffff\32\25",
			"\1\73\24\uffff\1\74", "\1\75", "\1\76",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "\1\100", "", "", "",
			"\1\101", "\12\25\7\uffff\32\25\6\uffff\32\25", "\1\103",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "\1\112",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "\1\114",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "\1\116", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "", "\1\125", "", "", "", "",
			"", "", "\12\25\7\uffff\32\25\6\uffff\32\25", "", "\1\127", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "", "", "", "", "", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "",
			"\12\25\7\uffff\32\25\6\uffff\32\25", "", "", "" };

	static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
	static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
	static final char[] DFA6_min = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_minS);
	static final char[] DFA6_max = DFA
			.unpackEncodedStringToUnsignedChars(DFA6_maxS);
	static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
	static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
	static final short[][] DFA6_transition;

	static {
		int numStates = DFA6_transitionS.length;
		DFA6_transition = new short[numStates][];
		for (int i = 0; i < numStates; i++) {
			DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
		}
	}

	protected class DFA6 extends DFA {

		public DFA6(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 6;
			this.eot = DFA6_eot;
			this.eof = DFA6_eof;
			this.min = DFA6_min;
			this.max = DFA6_max;
			this.accept = DFA6_accept;
			this.special = DFA6_special;
			this.transition = DFA6_transition;
		}

		@Override
		public String getDescription() {
			return "1:1: Tokens : ( PUSH | POP | ADD | SUB | MULT | DIV | BRANCH | BRANCHLESS | PRINT | HALT | SW | LW | BRANCHEQUAL | JS | LRA | SRA | LRV | SRV | LHP | SHP | LFP | SFP | CFP | COL | LABEL | NUMBER | WHITESP | ERR );";
		}

		@Override
		public int specialStateTransition(int s, IntStream _input)
				throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch (s) {
			case 0:
				int LA6_0 = input.LA(1);
				s = -1;
				if ((LA6_0 == 'p')) {
					s = 1;
				} else if ((LA6_0 == 'a')) {
					s = 2;
				} else if ((LA6_0 == 's')) {
					s = 3;
				} else if ((LA6_0 == 'm')) {
					s = 4;
				} else if ((LA6_0 == 'd')) {
					s = 5;
				} else if ((LA6_0 == 'b')) {
					s = 6;
				} else if ((LA6_0 == 'h')) {
					s = 7;
				} else if ((LA6_0 == 'l')) {
					s = 8;
				} else if ((LA6_0 == 'j')) {
					s = 9;
				} else if ((LA6_0 == 'c')) {
					s = 10;
				} else if ((LA6_0 == ':')) {
					s = 11;
				} else if (((LA6_0 >= 'A' && LA6_0 <= 'Z')
						|| (LA6_0 >= 'e' && LA6_0 <= 'g') || LA6_0 == 'i'
						|| LA6_0 == 'k' || (LA6_0 >= 'n' && LA6_0 <= 'o')
						|| (LA6_0 >= 'q' && LA6_0 <= 'r') || (LA6_0 >= 't' && LA6_0 <= 'z'))) {
					s = 12;
				} else if ((LA6_0 == '0')) {
					s = 13;
				} else if ((LA6_0 == '-')) {
					s = 14;
				} else if (((LA6_0 >= '1' && LA6_0 <= '9'))) {
					s = 15;
				} else if (((LA6_0 >= '\t' && LA6_0 <= '\n') || LA6_0 == '\r' || LA6_0 == ' ')) {
					s = 16;
				} else if (((LA6_0 >= '\u0000' && LA6_0 <= '\b')
						|| (LA6_0 >= '\u000B' && LA6_0 <= '\f')
						|| (LA6_0 >= '\u000E' && LA6_0 <= '\u001F')
						|| (LA6_0 >= '!' && LA6_0 <= ',')
						|| (LA6_0 >= '.' && LA6_0 <= '/')
						|| (LA6_0 >= ';' && LA6_0 <= '@')
						|| (LA6_0 >= '[' && LA6_0 <= '`') || (LA6_0 >= '{' && LA6_0 <= '\uFFFF'))) {
					s = 17;
				}
				if (s >= 0)
					return s;
				break;
			}
			NoViableAltException nvae = new NoViableAltException(
					getDescription(), 6, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
