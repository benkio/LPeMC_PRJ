// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-01-14 18:38:31

package highLevelLanguage;

import highLevelLanguage.Node.AndNode;
import highLevelLanguage.Node.BoolNode;
import highLevelLanguage.Node.BoolTypeNode;
import highLevelLanguage.Node.DecFunNode;
import highLevelLanguage.Node.DecVarNode;
import highLevelLanguage.Node.DivNode;
import highLevelLanguage.Node.EmptyNode;
import highLevelLanguage.Node.EqualNode;
import highLevelLanguage.Node.FirstNode;
import highLevelLanguage.Node.FunNode;
import highLevelLanguage.Node.GreatEqualNode;
import highLevelLanguage.Node.IfNode;
import highLevelLanguage.Node.IntTypeNode;
import highLevelLanguage.Node.LessEqualNode;
import highLevelLanguage.Node.ListNode;
import highLevelLanguage.Node.MinusNode;
import highLevelLanguage.Node.NatNode;
import highLevelLanguage.Node.Node;
import highLevelLanguage.Node.NotNode;
import highLevelLanguage.Node.OrNode;
import highLevelLanguage.Node.ParamNode;
import highLevelLanguage.Node.PlusNode;
import highLevelLanguage.Node.PrintNode;
import highLevelLanguage.Node.ProgNode;
import highLevelLanguage.Node.RestNode;
import highLevelLanguage.Node.TimesNode;
import highLevelLanguage.Node.VarNode;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class MiniFunParser extends Parser {
    public static final String[] tokenNames = new String[] { "<invalid>",
	    "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "ASS", "BOOLTYPE",
	    "CLPAR", "COL", "COMMA", "CRPAR", "DIVIDE", "DOUBLECOL", "ELSE",
	    "EMPTY", "EQ", "ERR", "FALSE", "FIRST", "FUN", "GREATEREQ", "ID",
	    "IF", "IN", "INTTYPE", "LESSEQ", "LET", "LPAR", "MINUS", "NAT",
	    "NOT", "OR", "PLUS", "PRINT", "REST", "RPAR", "SEMIC", "SLPAR",
	    "SRPAR", "THEN", "TIMES", "TRUE", "VAR", "WHITESP" };
    public static final int EOF = -1;
    public static final int AND = 4;
    public static final int ARROW = 5;
    public static final int ASS = 6;
    public static final int BOOLTYPE = 7;
    public static final int CLPAR = 8;
    public static final int COL = 9;
    public static final int COMMA = 10;
    public static final int CRPAR = 11;
    public static final int DIVIDE = 12;
    public static final int DOUBLECOL = 13;
    public static final int ELSE = 14;
    public static final int EMPTY = 15;
    public static final int EQ = 16;
    public static final int ERR = 17;
    public static final int FALSE = 18;
    public static final int FIRST = 19;
    public static final int FUN = 20;
    public static final int GREATEREQ = 21;
    public static final int ID = 22;
    public static final int IF = 23;
    public static final int IN = 24;
    public static final int INTTYPE = 25;
    public static final int LESSEQ = 26;
    public static final int LET = 27;
    public static final int LPAR = 28;
    public static final int MINUS = 29;
    public static final int NAT = 30;
    public static final int NOT = 31;
    public static final int OR = 32;
    public static final int PLUS = 33;
    public static final int PRINT = 34;
    public static final int REST = 35;
    public static final int RPAR = 36;
    public static final int SEMIC = 37;
    public static final int SLPAR = 38;
    public static final int SRPAR = 39;
    public static final int THEN = 40;
    public static final int TIMES = 41;
    public static final int TRUE = 42;
    public static final int VAR = 43;
    public static final int WHITESP = 44;

    // delegates
    public Parser[] getDelegates() {
	return new Parser[] {};
    }

    // delegators

    public MiniFunParser(TokenStream input) {
	this(input, new RecognizerSharedState());
    }

    public MiniFunParser(TokenStream input, RecognizerSharedState state) {
	super(input, state);
    }

    @Override
    public String[] getTokenNames() {
	return MiniFunParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
	return "/home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g";
    }

    private ArrayList<HashMap<String, STentry>> symTable = new ArrayList<HashMap<String, STentry>>();
    private int nestingLevel = 0;

    // $ANTLR start "prog"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:20:1: prog returns [Node ast] :
    // LET d= declist IN e= exp SEMIC ;
    public final Node prog() throws RecognitionException {
	Node ast = null;

	ArrayList<Node> d = null;
	Node e = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:21:2: ( LET d= declist IN
	    // e= exp SEMIC )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:21:4: LET d= declist IN
	    // e= exp SEMIC
	    {
		match(input, LET, FOLLOW_LET_in_prog30);

		HashMap<String, STentry> hm = new HashMap<String, STentry>();
		symTable.add(hm);

		pushFollow(FOLLOW_declist_in_prog52);
		d = declist();
		state._fsp--;

		match(input, IN, FOLLOW_IN_in_prog55);
		pushFollow(FOLLOW_exp_in_prog59);
		e = exp();
		state._fsp--;

		match(input, SEMIC, FOLLOW_SEMIC_in_prog61);

		ast = new ProgNode(d, e);

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "prog"

    // $ANTLR start "declist"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:33:1: declist returns
    // [ArrayList<Node> astList] : ( VAR i= ID COL t= type ASS e= exp SEMIC |
    // FUN i= ID COL (rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID (
    // COL pt= type )? )* )? RPAR |at= arrowType LPAR ( ID ( COMMA ID )* )? RPAR
    // ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
    public final ArrayList<Node> declist() throws RecognitionException {
	ArrayList<Node> astList = null;

	Token i = null;
	Token fpi = null;
	Token pi = null;
	Node t = null;
	Node e = null;
	Node rt = null;
	Node fpt = null;
	Node pt = null;
	Node at = null;
	ArrayList<Node> dec = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:34:3: ( ( VAR i= ID COL
	    // t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID
	    // ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR
	    // |at= arrowType LPAR ( ID ( COMMA ID )* )? RPAR ) CLPAR ( (dec=
	    // declist ) e= exp ) CRPAR SEMIC )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:34:4: ( VAR i= ID COL t=
	    // type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID (
	    // COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR |at=
	    // arrowType LPAR ( ID ( COMMA ID )* )? RPAR ) CLPAR ( (dec= declist
	    // ) e= exp ) CRPAR SEMIC )*
	    {

		astList = new ArrayList<Node>();
		int offSet = 1;

		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:39:5: ( VAR i= ID COL
		// t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi=
		// ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )?
		// RPAR |at= arrowType LPAR ( ID ( COMMA ID )* )? RPAR ) CLPAR (
		// (dec= declist ) e= exp ) CRPAR SEMIC )*
		loop8: while (true) {
		    int alt8 = 3;
		    int LA8_0 = input.LA(1);
		    if ((LA8_0 == VAR)) {
			alt8 = 1;
		    } else if ((LA8_0 == FUN)) {
			alt8 = 2;
		    }

		    switch (alt8) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:39:6: VAR i= ID
		    // COL t= type ASS e= exp SEMIC
		    {
			match(input, VAR, FOLLOW_VAR_in_declist91);
			i = (Token) match(input, ID, FOLLOW_ID_in_declist95);
			match(input, COL, FOLLOW_COL_in_declist97);
			pushFollow(FOLLOW_type_in_declist101);
			t = type();
			state._fsp--;

			match(input, ASS, FOLLOW_ASS_in_declist103);
			pushFollow(FOLLOW_exp_in_declist107);
			e = exp();
			state._fsp--;

			match(input, SEMIC, FOLLOW_SEMIC_in_declist109);

			DecVarNode vn = new DecVarNode((i != null ? i.getText()
				: null), t, e);
			STentry entry = new STentry(vn, offSet++);
			HashMap<String, STentry> hm = symTable
				.get(nestingLevel);

			if (hm.put((i != null ? i.getText() : null), entry) != null) {
			    System.out.println("Identifier "
				    + (i != null ? i.getText() : null)
				    + " at line "
				    + (i != null ? i.getLine() : 0)
				    + " already defined");
			    System.exit(0);
			}

			astList.add(vn);

		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:53:6: FUN i= ID
		    // COL (rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA
		    // pi= ID ( COL pt= type )? )* )? RPAR |at= arrowType LPAR (
		    // ID ( COMMA ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp
		    // ) CRPAR SEMIC
		    {
			match(input, FUN, FOLLOW_FUN_in_declist129);
			i = (Token) match(input, ID, FOLLOW_ID_in_declist133);
			match(input, COL, FOLLOW_COL_in_declist135);
			DecFunNode fn = null;
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:54:6: (rt=
			// type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID
			// ( COL pt= type )? )* )? RPAR |at= arrowType LPAR ( ID
			// ( COMMA ID )* )? RPAR )
			int alt7 = 2;
			int LA7_0 = input.LA(1);
			if ((LA7_0 == BOOLTYPE || LA7_0 == INTTYPE)) {
			    alt7 = 1;
			} else if ((LA7_0 == LPAR)) {
			    alt7 = 2;
			}

			else {
			    NoViableAltException nvae = new NoViableAltException(
				    "", 7, 0, input);
			    throw nvae;
			}

			switch (alt7) {
			case 1:
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:55:6: rt=
			// type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID
			// ( COL pt= type )? )* )? RPAR
			{
			    pushFollow(FOLLOW_type_in_declist153);
			    rt = type();
			    state._fsp--;

			    fn = new DecFunNode(
				    (i != null ? i.getText() : null), rt);
			    STentry entry = new STentry(fn, offSet++);
			    HashMap<String, STentry> hm = symTable
				    .get(nestingLevel);

			    if (hm.put((i != null ? i.getText() : null), entry) != null) {
				System.out.println("Identifier "
					+ (i != null ? i.getText() : null)
					+ " at line "
					+ (i != null ? i.getLine() : 0)
					+ " already defined");
				System.exit(0);
			    }

			    match(input, LPAR, FOLLOW_LPAR_in_declist168);

			    int parOffSet = -1;
			    hm = new HashMap<String, STentry>();
			    symTable.add(hm);
			    nestingLevel++;

			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:74:7:
			    // (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL
			    // pt= type )? )* )?
			    int alt4 = 2;
			    int LA4_0 = input.LA(1);
			    if ((LA4_0 == ID)) {
				alt4 = 1;
			    }
			    switch (alt4) {
			    case 1:
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:75:8:
			    // fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL
			    // pt= type )? )*
			    {
				fpi = (Token) match(input, ID,
					FOLLOW_ID_in_declist197);
				// /home/benkio/workspace/LPeMC Lab
				// Project/src/highLevelLanguage/MiniFun.g:75:15:
				// ( COL fpt= type )?
				int alt1 = 2;
				int LA1_0 = input.LA(1);
				if ((LA1_0 == COL)) {
				    alt1 = 1;
				}
				switch (alt1) {
				case 1:
				// /home/benkio/workspace/LPeMC Lab
				// Project/src/highLevelLanguage/MiniFun.g:75:16:
				// COL fpt= type
				{
				    match(input, COL, FOLLOW_COL_in_declist200);
				    pushFollow(FOLLOW_type_in_declist204);
				    fpt = type();
				    state._fsp--;

				}
				    break;

				}

				ParamNode pn = new ParamNode(
					(fpi != null ? fpi.getText() : null),
					fpt);
				entry = new STentry(pn, parOffSet--);
				hm.put((fpi != null ? fpi.getText() : null),
					entry);
				fn.addParam(pn);

				// /home/benkio/workspace/LPeMC Lab
				// Project/src/highLevelLanguage/MiniFun.g:82:8:
				// ( COMMA pi= ID ( COL pt= type )? )*
				loop3: while (true) {
				    int alt3 = 2;
				    int LA3_0 = input.LA(1);
				    if ((LA3_0 == COMMA)) {
					alt3 = 1;
				    }

				    switch (alt3) {
				    case 1:
				    // /home/benkio/workspace/LPeMC Lab
				    // Project/src/highLevelLanguage/MiniFun.g:82:9:
				    // COMMA pi= ID ( COL pt= type )?
				    {
					match(input, COMMA,
						FOLLOW_COMMA_in_declist226);
					pi = (Token) match(input, ID,
						FOLLOW_ID_in_declist230);
					// /home/benkio/workspace/LPeMC Lab
					// Project/src/highLevelLanguage/MiniFun.g:82:21:
					// ( COL pt= type )?
					int alt2 = 2;
					int LA2_0 = input.LA(1);
					if ((LA2_0 == COL)) {
					    alt2 = 1;
					}
					switch (alt2) {
					case 1:
					// /home/benkio/workspace/LPeMC Lab
					// Project/src/highLevelLanguage/MiniFun.g:82:22:
					// COL pt= type
					{
					    match(input, COL,
						    FOLLOW_COL_in_declist233);
					    pushFollow(FOLLOW_type_in_declist237);
					    pt = type();
					    state._fsp--;

					}
					    break;

					}

					pn = new ParamNode(
						(pi != null ? pi.getText()
							: null), pt);
					entry = new STentry(pn, parOffSet--);
					if (hm.put((pi != null ? pi.getText()
						: null), entry) != null) {
					    System.out.println("Identifier "
						    + (pi != null ? pi
							    .getText() : null)
						    + " at line "
						    + (pi != null ? pi
							    .getLine() : 0)
						    + " already defined");
					    System.exit(0);
					}
					fn.addParam(pn);

				    }
					break;

				    default:
					break loop3;
				    }
				}

			    }
				break;

			    }

			    match(input, RPAR, FOLLOW_RPAR_in_declist269);
			}
			    break;
			case 2:
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:94:6: at=
			// arrowType LPAR ( ID ( COMMA ID )* )? RPAR
			{
			    pushFollow(FOLLOW_arrowType_in_declist286);
			    at = arrowType();
			    state._fsp--;

			    fn = new DecFunNode(
				    (i != null ? i.getText() : null), at);
			    match(input, LPAR, FOLLOW_LPAR_in_declist295);
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:96:7: (
			    // ID ( COMMA ID )* )?
			    int alt6 = 2;
			    int LA6_0 = input.LA(1);
			    if ((LA6_0 == ID)) {
				alt6 = 1;
			    }
			    switch (alt6) {
			    case 1:
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:96:8: ID
			    // ( COMMA ID )*
			    {
				match(input, ID, FOLLOW_ID_in_declist304);
				// /home/benkio/workspace/LPeMC Lab
				// Project/src/highLevelLanguage/MiniFun.g:96:11:
				// ( COMMA ID )*
				loop5: while (true) {
				    int alt5 = 2;
				    int LA5_0 = input.LA(1);
				    if ((LA5_0 == COMMA)) {
					alt5 = 1;
				    }

				    switch (alt5) {
				    case 1:
				    // /home/benkio/workspace/LPeMC Lab
				    // Project/src/highLevelLanguage/MiniFun.g:96:12:
				    // COMMA ID
				    {
					match(input, COMMA,
						FOLLOW_COMMA_in_declist307);
					match(input, ID,
						FOLLOW_ID_in_declist309);
				    }
					break;

				    default:
					break loop5;
				    }
				}

			    }
				break;

			    }

			    match(input, RPAR, FOLLOW_RPAR_in_declist321);
			}
			    break;

			}

			match(input, CLPAR, FOLLOW_CLPAR_in_declist336);
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:100:6: (
			// (dec= declist ) e= exp )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:101:7: (dec=
			// declist ) e= exp
			{
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:101:7:
			    // (dec= declist )
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:101:8:
			    // dec= declist
			    {
				pushFollow(FOLLOW_declist_in_declist355);
				dec = declist();
				state._fsp--;

			    }

			    pushFollow(FOLLOW_exp_in_declist380);
			    e = exp();
			    state._fsp--;
			    fn.addExpValue(e);
			    symTable.remove(nestingLevel--);
			    astList.add(fn);

			}

			match(input, CRPAR, FOLLOW_CRPAR_in_declist406);
			match(input, SEMIC, FOLLOW_SEMIC_in_declist413);
		    }
			break;

		    default:
			break loop8;
		    }
		}

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return astList;
    }

    // $ANTLR end "declist"

    // $ANTLR start "exp"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:113:1: exp returns [Node ast] :
    // f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
    // ;
    public final Node exp() throws RecognitionException {
	Node ast = null;

	Node f = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:114:4: (f= term ( ( EQ l=
	    // term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:114:6: f= term ( ( EQ l=
	    // term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
	    {
		pushFollow(FOLLOW_term_in_exp434);
		f = term();
		state._fsp--;

		ast = f;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:115:7: ( ( EQ l= term
		// ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
		loop9: while (true) {
		    int alt9 = 4;
		    switch (input.LA(1)) {
		    case EQ: {
			alt9 = 1;
		    }
			break;
		    case LESSEQ: {
			alt9 = 2;
		    }
			break;
		    case GREATEREQ: {
			alt9 = 3;
		    }
			break;
		    }
		    switch (alt9) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:115:8: ( EQ l=
		    // term )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:115:8: ( EQ
			// l= term )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:116:8: EQ l=
			// term
			{
			    match(input, EQ, FOLLOW_EQ_in_exp454);
			    pushFollow(FOLLOW_term_in_exp458);
			    l = term();
			    state._fsp--;

			    ast = new EqualNode(ast, l);
			}

		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:119:9: ( LESSEQ
		    // l= term )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:119:9: (
			// LESSEQ l= term )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:120:9: LESSEQ
			// l= term
			{
			    match(input, LESSEQ, FOLLOW_LESSEQ_in_exp498);
			    pushFollow(FOLLOW_term_in_exp502);
			    l = term();
			    state._fsp--;

			    ast = new LessEqualNode(ast, l);
			}

		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:123:9: (
		    // GREATEREQ l= term )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:123:9: (
			// GREATEREQ l= term )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:123:11:
			// GREATEREQ l= term
			{
			    match(input, GREATEREQ, FOLLOW_GREATEREQ_in_exp533);
			    pushFollow(FOLLOW_term_in_exp537);
			    l = term();
			    state._fsp--;

			    ast = new GreatEqualNode(ast, l);
			}

		    }
			break;

		    default:
			break loop9;
		    }
		}

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "exp"

    // $ANTLR start "term"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:128:1: term returns [Node ast] :
    // f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
    public final Node term() throws RecognitionException {
	Node ast = null;

	Node f = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:129:2: (f= value ( ( PLUS
	    // l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:129:4: f= value ( ( PLUS
	    // l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
	    {
		pushFollow(FOLLOW_value_in_term582);
		f = value();
		state._fsp--;

		ast = f;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:130:6: ( ( PLUS l=
		// value ) | ( MINUS l= value ) | ( OR l= value ) )*
		loop10: while (true) {
		    int alt10 = 4;
		    switch (input.LA(1)) {
		    case PLUS: {
			alt10 = 1;
		    }
			break;
		    case MINUS: {
			alt10 = 2;
		    }
			break;
		    case OR: {
			alt10 = 3;
		    }
			break;
		    }
		    switch (alt10) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:131:5: ( PLUS l=
		    // value )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:131:5: ( PLUS
			// l= value )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:132:6: PLUS
			// l= value
			{
			    match(input, PLUS, FOLLOW_PLUS_in_term604);
			    pushFollow(FOLLOW_value_in_term608);
			    l = value();
			    state._fsp--;

			    ast = new PlusNode(ast, l);
			}

		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:135:9: ( MINUS l=
		    // value )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:135:9: (
			// MINUS l= value )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:136:9: MINUS
			// l= value
			{
			    match(input, MINUS, FOLLOW_MINUS_in_term647);
			    pushFollow(FOLLOW_value_in_term651);
			    l = value();
			    state._fsp--;

			    ast = new MinusNode(ast, l);
			}

		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:139:9: ( OR l=
		    // value )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:139:9: ( OR
			// l= value )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:140:9: OR l=
			// value
			{
			    match(input, OR, FOLLOW_OR_in_term690);
			    pushFollow(FOLLOW_value_in_term694);
			    l = value();
			    state._fsp--;

			    ast = new OrNode(ast, l);
			}

		    }
			break;

		    default:
			break loop10;
		    }
		}

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "term"

    // $ANTLR start "value"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:146:1: value returns [Node ast] :
    // f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
    public final Node value() throws RecognitionException {
	Node ast = null;

	Node f = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:147:3: (f= fatt ( ( TIMES
	    // l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:147:5: f= fatt ( ( TIMES
	    // l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
	    {
		pushFollow(FOLLOW_fatt_in_value740);
		f = fatt();
		state._fsp--;

		ast = f;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:148:6: ( ( TIMES l=
		// fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
		loop11: while (true) {
		    int alt11 = 4;
		    switch (input.LA(1)) {
		    case TIMES: {
			alt11 = 1;
		    }
			break;
		    case DIVIDE: {
			alt11 = 2;
		    }
			break;
		    case AND: {
			alt11 = 3;
		    }
			break;
		    }
		    switch (alt11) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:149:7: ( TIMES l=
		    // fatt )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:149:7: (
			// TIMES l= fatt )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:150:8: TIMES
			// l= fatt
			{
			    match(input, TIMES, FOLLOW_TIMES_in_value766);
			    pushFollow(FOLLOW_fatt_in_value770);
			    l = fatt();
			    state._fsp--;

			    ast = new TimesNode(ast, l);
			}

		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:153:9: ( DIVIDE
		    // l= fatt )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:153:9: (
			// DIVIDE l= fatt )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:154:9: DIVIDE
			// l= fatt
			{
			    match(input, DIVIDE, FOLLOW_DIVIDE_in_value810);
			    pushFollow(FOLLOW_fatt_in_value814);
			    l = fatt();
			    state._fsp--;

			    ast = new DivNode(ast, l);
			}

		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:157:9: ( AND l=
		    // fatt )
		    {
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:157:9: ( AND
			// l= fatt )
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:158:9: AND l=
			// fatt
			{
			    match(input, AND, FOLLOW_AND_in_value853);
			    pushFollow(FOLLOW_fatt_in_value857);
			    l = fatt();
			    state._fsp--;

			    ast = new AndNode(ast, l);
			}

		    }
			break;

		    default:
			break loop11;
		    }
		}

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "value"

    // $ANTLR start "fatt"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:163:1: fatt returns [Node ast] :
    // (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LPAR (fp= exp
    // ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE
    // CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR
    // e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR
    // e= exp RPAR );
    public final Node fatt() throws RecognitionException {
	Node ast = null;

	Token n = null;
	Token i = null;
	Node e = null;
	Node fp = null;
	Node p = null;
	Node x = null;
	Node y = null;
	Node z = null;
	Node e1 = null;
	Node e2 = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:164:2: (n= NAT | TRUE |
	    // FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LPAR (fp= exp ( COMMA
	    // p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE
	    // CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR |
	    // FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e=
	    // exp RPAR | NOT LPAR e= exp RPAR )
	    int alt15 = 12;
	    switch (input.LA(1)) {
	    case NAT: {
		alt15 = 1;
	    }
		break;
	    case TRUE: {
		alt15 = 2;
	    }
		break;
	    case FALSE: {
		alt15 = 3;
	    }
		break;
	    case EMPTY: {
		alt15 = 4;
	    }
		break;
	    case LPAR: {
		alt15 = 5;
	    }
		break;
	    case ID: {
		alt15 = 6;
	    }
		break;
	    case IF: {
		alt15 = 7;
	    }
		break;
	    case SLPAR: {
		alt15 = 8;
	    }
		break;
	    case FIRST: {
		alt15 = 9;
	    }
		break;
	    case REST: {
		alt15 = 10;
	    }
		break;
	    case PRINT: {
		alt15 = 11;
	    }
		break;
	    case NOT: {
		alt15 = 12;
	    }
		break;
	    default:
		NoViableAltException nvae = new NoViableAltException("", 15, 0,
			input);
		throw nvae;
	    }
	    switch (alt15) {
	    case 1:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:164:4: n= NAT
	    {
		n = (Token) match(input, NAT, FOLLOW_NAT_in_fatt904);
		ast = new NatNode(Integer.parseInt((n != null ? n.getText()
			: null)));
	    }
		break;
	    case 2:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:166:4: TRUE
	    {
		match(input, TRUE, FOLLOW_TRUE_in_fatt920);
		ast = new BoolNode(true);
	    }
		break;
	    case 3:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:168:4: FALSE
	    {
		match(input, FALSE, FOLLOW_FALSE_in_fatt934);
		ast = new BoolNode(false);
	    }
		break;
	    case 4:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:170:4: EMPTY
	    {
		match(input, EMPTY, FOLLOW_EMPTY_in_fatt946);
		ast = new EmptyNode();
	    }
		break;
	    case 5:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:172:4: LPAR e= exp RPAR
	    {
		match(input, LPAR, FOLLOW_LPAR_in_fatt960);
		pushFollow(FOLLOW_exp_in_fatt964);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt966);
		ast = e;
	    }
		break;
	    case 6:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:174:4: i= ID ( LPAR (fp=
	    // exp ( COMMA p= exp )* )? RPAR )?
	    {
		i = (Token) match(input, ID, FOLLOW_ID_in_fatt981);

		HashMap<String, STentry> hm;
		STentry entry = null;
		int declNL;
		for (declNL = nestingLevel; declNL >= 0; declNL--) {
		    hm = symTable.get(declNL);
		    entry = hm.get((i != null ? i.getText() : null));
		    if (entry != null)
			break;
		}
		if (entry == null) {
		    System.out
			    .println("Identifier "
				    + (i != null ? i.getText() : null)
				    + " at line "
				    + (i != null ? i.getLine() : 0)
				    + " is not defined");
		    System.exit(0);
		}
		ast = new VarNode(entry, nestingLevel - declNL);

		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:190:2: ( LPAR (fp=
		// exp ( COMMA p= exp )* )? RPAR )?
		int alt14 = 2;
		int LA14_0 = input.LA(1);
		if ((LA14_0 == LPAR)) {
		    alt14 = 1;
		}
		switch (alt14) {
		case 1:
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:191:3: LPAR (fp= exp
		// ( COMMA p= exp )* )? RPAR
		{
		    match(input, LPAR, FOLLOW_LPAR_in_fatt993);
		    ArrayList<Node> parList = new ArrayList<Node>();
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:194:3: (fp= exp (
		    // COMMA p= exp )* )?
		    int alt13 = 2;
		    int LA13_0 = input.LA(1);
		    if ((LA13_0 == EMPTY
			    || (LA13_0 >= FALSE && LA13_0 <= FIRST)
			    || (LA13_0 >= ID && LA13_0 <= IF) || LA13_0 == LPAR
			    || (LA13_0 >= NAT && LA13_0 <= NOT)
			    || (LA13_0 >= PRINT && LA13_0 <= REST)
			    || LA13_0 == SLPAR || LA13_0 == TRUE)) {
			alt13 = 1;
		    }
		    switch (alt13) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:195:4: fp= exp (
		    // COMMA p= exp )*
		    {
			pushFollow(FOLLOW_exp_in_fatt1012);
			fp = exp();
			state._fsp--;

			parList.add(fp);
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:196:4: (
			// COMMA p= exp )*
			loop12: while (true) {
			    int alt12 = 2;
			    int LA12_0 = input.LA(1);
			    if ((LA12_0 == COMMA)) {
				alt12 = 1;
			    }

			    switch (alt12) {
			    case 1:
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:196:5:
			    // COMMA p= exp
			    {
				match(input, COMMA, FOLLOW_COMMA_in_fatt1020);
				pushFollow(FOLLOW_exp_in_fatt1024);
				p = exp();
				state._fsp--;

				parList.add(p);
			    }
				break;

			    default:
				break loop12;
			    }
			}

		    }
			break;

		    }

		    match(input, RPAR, FOLLOW_RPAR_in_fatt1038);
		    ast = new FunNode(entry, nestingLevel - declNL, parList);
		}
		    break;

		}

	    }
		break;
	    case 7:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:200:4: IF x= exp THEN
	    // CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
	    {
		match(input, IF, FOLLOW_IF_in_fatt1049);
		pushFollow(FOLLOW_exp_in_fatt1053);
		x = exp();
		state._fsp--;

		match(input, THEN, FOLLOW_THEN_in_fatt1055);
		match(input, CLPAR, FOLLOW_CLPAR_in_fatt1057);
		pushFollow(FOLLOW_exp_in_fatt1061);
		y = exp();
		state._fsp--;

		match(input, CRPAR, FOLLOW_CRPAR_in_fatt1063);
		match(input, ELSE, FOLLOW_ELSE_in_fatt1068);
		match(input, CLPAR, FOLLOW_CLPAR_in_fatt1070);
		pushFollow(FOLLOW_exp_in_fatt1074);
		z = exp();
		state._fsp--;

		match(input, CRPAR, FOLLOW_CRPAR_in_fatt1076);
		ast = new IfNode(x, y, z);
	    }
		break;
	    case 8:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:204:4: SLPAR e1= exp
	    // DOUBLECOL e2= exp SRPAR
	    {
		match(input, SLPAR, FOLLOW_SLPAR_in_fatt1090);
		pushFollow(FOLLOW_exp_in_fatt1094);
		e1 = exp();
		state._fsp--;

		match(input, DOUBLECOL, FOLLOW_DOUBLECOL_in_fatt1096);
		pushFollow(FOLLOW_exp_in_fatt1100);
		e2 = exp();
		state._fsp--;

		match(input, SRPAR, FOLLOW_SRPAR_in_fatt1102);
		ast = new ListNode(e1, e2);
	    }
		break;
	    case 9:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:207:4: FIRST LPAR e= exp
	    // RPAR
	    {
		match(input, FIRST, FOLLOW_FIRST_in_fatt1115);
		match(input, LPAR, FOLLOW_LPAR_in_fatt1117);
		pushFollow(FOLLOW_exp_in_fatt1121);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt1123);
		ast = new FirstNode(e);
	    }
		break;
	    case 10:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:210:4: REST LPAR e= exp
	    // RPAR
	    {
		match(input, REST, FOLLOW_REST_in_fatt1140);
		match(input, LPAR, FOLLOW_LPAR_in_fatt1142);
		pushFollow(FOLLOW_exp_in_fatt1146);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt1148);
		ast = new RestNode(e);
	    }
		break;
	    case 11:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:213:4: PRINT LPAR e= exp
	    // RPAR
	    {
		match(input, PRINT, FOLLOW_PRINT_in_fatt1165);
		match(input, LPAR, FOLLOW_LPAR_in_fatt1167);
		pushFollow(FOLLOW_exp_in_fatt1171);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt1173);
		ast = new PrintNode(e);
	    }
		break;
	    case 12:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:216:4: NOT LPAR e= exp
	    // RPAR
	    {
		match(input, NOT, FOLLOW_NOT_in_fatt1190);
		match(input, LPAR, FOLLOW_LPAR_in_fatt1192);
		pushFollow(FOLLOW_exp_in_fatt1196);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt1198);
		ast = new NotNode(e);
	    }
		break;

	    }
	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "fatt"

    // $ANTLR start "type"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:220:1: type returns [Node ast] :
    // ( INTTYPE | BOOLTYPE );
    public final Node type() throws RecognitionException {
	Node ast = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:221:2: ( INTTYPE |
	    // BOOLTYPE )
	    int alt16 = 2;
	    int LA16_0 = input.LA(1);
	    if ((LA16_0 == INTTYPE)) {
		alt16 = 1;
	    } else if ((LA16_0 == BOOLTYPE)) {
		alt16 = 2;
	    }

	    else {
		NoViableAltException nvae = new NoViableAltException("", 16, 0,
			input);
		throw nvae;
	    }

	    switch (alt16) {
	    case 1:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:221:4: INTTYPE
	    {
		match(input, INTTYPE, FOLLOW_INTTYPE_in_type1223);
		ast = new IntTypeNode();
	    }
		break;
	    case 2:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:222:6: BOOLTYPE
	    {
		match(input, BOOLTYPE, FOLLOW_BOOLTYPE_in_type1235);
		ast = new BoolTypeNode();
	    }
		break;

	    }
	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "type"

    // $ANTLR start "arrowType"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:225:1: arrowType returns [Node
    // ast] : LPAR ( (t1= type ( COMMA tn= type )* )? | arrowType ) RPAR ARROW
    // type ;
    public final Node arrowType() throws RecognitionException {
	Node ast = null;

	Node t1 = null;
	Node tn = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:226:3: ( LPAR ( (t1= type
	    // ( COMMA tn= type )* )? | arrowType ) RPAR ARROW type )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:226:5: LPAR ( (t1= type (
	    // COMMA tn= type )* )? | arrowType ) RPAR ARROW type
	    {
		match(input, LPAR, FOLLOW_LPAR_in_arrowType1256);
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:226:10: ( (t1= type (
		// COMMA tn= type )* )? | arrowType )
		int alt19 = 2;
		int LA19_0 = input.LA(1);
		if ((LA19_0 == BOOLTYPE || LA19_0 == INTTYPE || LA19_0 == RPAR)) {
		    alt19 = 1;
		} else if ((LA19_0 == LPAR)) {
		    alt19 = 2;
		}

		else {
		    NoViableAltException nvae = new NoViableAltException("",
			    19, 0, input);
		    throw nvae;
		}

		switch (alt19) {
		case 1:
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:226:11: (t1= type (
		// COMMA tn= type )* )?
		{
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:226:11: (t1= type
		    // ( COMMA tn= type )* )?
		    int alt18 = 2;
		    int LA18_0 = input.LA(1);
		    if ((LA18_0 == BOOLTYPE || LA18_0 == INTTYPE)) {
			alt18 = 1;
		    }
		    switch (alt18) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:226:12: t1= type
		    // ( COMMA tn= type )*
		    {
			pushFollow(FOLLOW_type_in_arrowType1262);
			t1 = type();
			state._fsp--;

			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:226:23: (
			// COMMA tn= type )*
			loop17: while (true) {
			    int alt17 = 2;
			    int LA17_0 = input.LA(1);
			    if ((LA17_0 == COMMA)) {
				alt17 = 1;
			    }

			    switch (alt17) {
			    case 1:
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:226:24:
			    // COMMA tn= type
			    {
				match(input, COMMA,
					FOLLOW_COMMA_in_arrowType1266);
				pushFollow(FOLLOW_type_in_arrowType1270);
				tn = type();
				state._fsp--;

			    }
				break;

			    default:
				break loop17;
			    }
			}

		    }
			break;

		    }

		}
		    break;
		case 2:
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:226:44: arrowType
		{
		    pushFollow(FOLLOW_arrowType_in_arrowType1278);
		    arrowType();
		    state._fsp--;

		}
		    break;

		}

		match(input, RPAR, FOLLOW_RPAR_in_arrowType1281);
		match(input, ARROW, FOLLOW_ARROW_in_arrowType1283);
		pushFollow(FOLLOW_type_in_arrowType1285);
		type();
		state._fsp--;

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
	return ast;
    }

    // $ANTLR end "arrowType"

    // Delegated rules

    public static final BitSet FOLLOW_LET_in_prog30 = new BitSet(
	    new long[] { 0x0000080001100000L });
    public static final BitSet FOLLOW_declist_in_prog52 = new BitSet(
	    new long[] { 0x0000000001000000L });
    public static final BitSet FOLLOW_IN_in_prog55 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_prog59 = new BitSet(
	    new long[] { 0x0000002000000000L });
    public static final BitSet FOLLOW_SEMIC_in_prog61 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_VAR_in_declist91 = new BitSet(
	    new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_ID_in_declist95 = new BitSet(
	    new long[] { 0x0000000000000200L });
    public static final BitSet FOLLOW_COL_in_declist97 = new BitSet(
	    new long[] { 0x0000000002000080L });
    public static final BitSet FOLLOW_type_in_declist101 = new BitSet(
	    new long[] { 0x0000000000000040L });
    public static final BitSet FOLLOW_ASS_in_declist103 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_declist107 = new BitSet(
	    new long[] { 0x0000002000000000L });
    public static final BitSet FOLLOW_SEMIC_in_declist109 = new BitSet(
	    new long[] { 0x0000080000100002L });
    public static final BitSet FOLLOW_FUN_in_declist129 = new BitSet(
	    new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_ID_in_declist133 = new BitSet(
	    new long[] { 0x0000000000000200L });
    public static final BitSet FOLLOW_COL_in_declist135 = new BitSet(
	    new long[] { 0x0000000012000080L });
    public static final BitSet FOLLOW_type_in_declist153 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_declist168 = new BitSet(
	    new long[] { 0x0000001000400000L });
    public static final BitSet FOLLOW_ID_in_declist197 = new BitSet(
	    new long[] { 0x0000001000000600L });
    public static final BitSet FOLLOW_COL_in_declist200 = new BitSet(
	    new long[] { 0x0000000002000080L });
    public static final BitSet FOLLOW_type_in_declist204 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_COMMA_in_declist226 = new BitSet(
	    new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_ID_in_declist230 = new BitSet(
	    new long[] { 0x0000001000000600L });
    public static final BitSet FOLLOW_COL_in_declist233 = new BitSet(
	    new long[] { 0x0000000002000080L });
    public static final BitSet FOLLOW_type_in_declist237 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_RPAR_in_declist269 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_arrowType_in_declist286 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_declist295 = new BitSet(
	    new long[] { 0x0000001000400000L });
    public static final BitSet FOLLOW_ID_in_declist304 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_COMMA_in_declist307 = new BitSet(
	    new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_ID_in_declist309 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_RPAR_in_declist321 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_CLPAR_in_declist336 = new BitSet(
	    new long[] { 0x00000C4CD0DC8000L });
    public static final BitSet FOLLOW_declist_in_declist355 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_declist380 = new BitSet(
	    new long[] { 0x0000000000000800L });
    public static final BitSet FOLLOW_CRPAR_in_declist406 = new BitSet(
	    new long[] { 0x0000002000000000L });
    public static final BitSet FOLLOW_SEMIC_in_declist413 = new BitSet(
	    new long[] { 0x0000080000100002L });
    public static final BitSet FOLLOW_term_in_exp434 = new BitSet(
	    new long[] { 0x0000000004210002L });
    public static final BitSet FOLLOW_EQ_in_exp454 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_term_in_exp458 = new BitSet(
	    new long[] { 0x0000000004210002L });
    public static final BitSet FOLLOW_LESSEQ_in_exp498 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_term_in_exp502 = new BitSet(
	    new long[] { 0x0000000004210002L });
    public static final BitSet FOLLOW_GREATEREQ_in_exp533 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_term_in_exp537 = new BitSet(
	    new long[] { 0x0000000004210002L });
    public static final BitSet FOLLOW_value_in_term582 = new BitSet(
	    new long[] { 0x0000000320000002L });
    public static final BitSet FOLLOW_PLUS_in_term604 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_value_in_term608 = new BitSet(
	    new long[] { 0x0000000320000002L });
    public static final BitSet FOLLOW_MINUS_in_term647 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_value_in_term651 = new BitSet(
	    new long[] { 0x0000000320000002L });
    public static final BitSet FOLLOW_OR_in_term690 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_value_in_term694 = new BitSet(
	    new long[] { 0x0000000320000002L });
    public static final BitSet FOLLOW_fatt_in_value740 = new BitSet(
	    new long[] { 0x0000020000001012L });
    public static final BitSet FOLLOW_TIMES_in_value766 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_fatt_in_value770 = new BitSet(
	    new long[] { 0x0000020000001012L });
    public static final BitSet FOLLOW_DIVIDE_in_value810 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_fatt_in_value814 = new BitSet(
	    new long[] { 0x0000020000001012L });
    public static final BitSet FOLLOW_AND_in_value853 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_fatt_in_value857 = new BitSet(
	    new long[] { 0x0000020000001012L });
    public static final BitSet FOLLOW_NAT_in_fatt904 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_TRUE_in_fatt920 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_FALSE_in_fatt934 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_EMPTY_in_fatt946 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_LPAR_in_fatt960 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt964 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt966 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_fatt981 = new BitSet(
	    new long[] { 0x0000000010000002L });
    public static final BitSet FOLLOW_LPAR_in_fatt993 = new BitSet(
	    new long[] { 0x0000045CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1012 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_COMMA_in_fatt1020 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1024 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_RPAR_in_fatt1038 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_IF_in_fatt1049 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1053 = new BitSet(
	    new long[] { 0x0000010000000000L });
    public static final BitSet FOLLOW_THEN_in_fatt1055 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_CLPAR_in_fatt1057 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1061 = new BitSet(
	    new long[] { 0x0000000000000800L });
    public static final BitSet FOLLOW_CRPAR_in_fatt1063 = new BitSet(
	    new long[] { 0x0000000000004000L });
    public static final BitSet FOLLOW_ELSE_in_fatt1068 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_CLPAR_in_fatt1070 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1074 = new BitSet(
	    new long[] { 0x0000000000000800L });
    public static final BitSet FOLLOW_CRPAR_in_fatt1076 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_SLPAR_in_fatt1090 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1094 = new BitSet(
	    new long[] { 0x0000000000002000L });
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt1096 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1100 = new BitSet(
	    new long[] { 0x0000008000000000L });
    public static final BitSet FOLLOW_SRPAR_in_fatt1102 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_FIRST_in_fatt1115 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt1117 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1121 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt1123 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_REST_in_fatt1140 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt1142 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1146 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt1148 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_PRINT_in_fatt1165 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt1167 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1171 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt1173 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_NOT_in_fatt1190 = new BitSet(
	    new long[] { 0x0000000010000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt1192 = new BitSet(
	    new long[] { 0x0000044CD0CC8000L });
    public static final BitSet FOLLOW_exp_in_fatt1196 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt1198 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_INTTYPE_in_type1223 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_BOOLTYPE_in_type1235 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_LPAR_in_arrowType1256 = new BitSet(
	    new long[] { 0x0000001012000080L });
    public static final BitSet FOLLOW_type_in_arrowType1262 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_COMMA_in_arrowType1266 = new BitSet(
	    new long[] { 0x0000000002000080L });
    public static final BitSet FOLLOW_type_in_arrowType1270 = new BitSet(
	    new long[] { 0x0000001000000400L });
    public static final BitSet FOLLOW_arrowType_in_arrowType1278 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_RPAR_in_arrowType1281 = new BitSet(
	    new long[] { 0x0000000000000020L });
    public static final BitSet FOLLOW_ARROW_in_arrowType1283 = new BitSet(
	    new long[] { 0x0000000002000080L });
    public static final BitSet FOLLOW_type_in_arrowType1285 = new BitSet(
	    new long[] { 0x0000000000000002L });
}
