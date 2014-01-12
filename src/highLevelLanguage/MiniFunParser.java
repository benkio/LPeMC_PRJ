// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-01-12 14:14:09

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
	    "<EOR>", "<DOWN>", "<UP>", "AND", "ASS", "BOOLTYPE", "CLPAR",
	    "COL", "COMMA", "CRPAR", "DIV", "DOUBLECOL", "ELSE", "EMPTY", "EQ",
	    "ERR", "FALSE", "FIRST", "FUN", "GREATEQ", "ID", "IF", "IN",
	    "INTTYPE", "LESSEQ", "LET", "LPAR", "MINUS", "NAT", "NOT", "OR",
	    "PLUS", "PRINT", "REST", "RPAR", "SEMIC", "SLPAR", "SRPAR", "THEN",
	    "TIMES", "TRUE", "VAR", "WHITESP" };
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
    public static final int GREATEQ = 20;
    public static final int ID = 21;
    public static final int IF = 22;
    public static final int IN = 23;
    public static final int INTTYPE = 24;
    public static final int LESSEQ = 25;
    public static final int LET = 26;
    public static final int LPAR = 27;
    public static final int MINUS = 28;
    public static final int NAT = 29;
    public static final int NOT = 30;
    public static final int OR = 31;
    public static final int PLUS = 32;
    public static final int PRINT = 33;
    public static final int REST = 34;
    public static final int RPAR = 35;
    public static final int SEMIC = 36;
    public static final int SLPAR = 37;
    public static final int SRPAR = 38;
    public static final int THEN = 39;
    public static final int TIMES = 40;
    public static final int TRUE = 41;
    public static final int VAR = 42;
    public static final int WHITESP = 43;

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

    /*
     * private int[] code = new int[ExecuteVM.CODESIZE]; private int i = 0;
     * private HashMap<String,Integer> labelAddress = new
     * HashMap<String,Integer>(); private ArrayList<String> labels = new
     * ArrayList<String>(); private ArrayList<Integer> addresses = new
     * ArrayList<Integer>();
     * 
     * public int[] createCode() throws Exception { assembly(); return code; }
     */

    /*
     * SymbleTable che � diventato un Arraylist per gestire tutti i vari
     * possibili scoping
     */
    private ArrayList<HashMap<String, STentry>> symTable = new ArrayList<HashMap<String, STentry>>();
    private int nestingLevel; // Tiene traccia a quale livello di nesting siamo

    // $ANTLR start "prog"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:35:2: prog returns [Node ast] :
    // LET d= declist IN e= exp SEMIC ;
    public final Node prog() throws RecognitionException {
	Node ast = null;

	ArrayList<Node> d = null;
	Node e = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:36:3: ( LET d= declist IN
	    // e= exp SEMIC )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:36:5: LET d= declist IN
	    // e= exp SEMIC
	    {
		match(input, LET, FOLLOW_LET_in_prog33);
		/* Instanziazione della prima symble table globale */
		HashMap<String, STentry> hm = new HashMap<String, STentry>();
		symTable.add(hm);

		pushFollow(FOLLOW_declist_in_prog46);
		d = declist();
		state._fsp--;

		match(input, IN, FOLLOW_IN_in_prog52);
		pushFollow(FOLLOW_exp_in_prog56);
		e = exp();
		state._fsp--;

		match(input, SEMIC, FOLLOW_SEMIC_in_prog58);
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
    // Project/src/highLevelLanguage/MiniFun.g:55:1: declist returns
    // [ArrayList<Node> astList] : ( VAR i= ID COL t= type ASS e= exp SEMIC |
    // FUN i= ID COL t= type LPAR (p1= ID COL t1= type ( COMMA p= ID COL t= type
    // )* )? RPAR CLPAR e= exp CRPAR SEMIC )* ;
    public final ArrayList<Node> declist() throws RecognitionException {
	ArrayList<Node> astList = null;

	Token i = null;
	Token p1 = null;
	Token p = null;
	Node t = null;
	Node e = null;
	Node t1 = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:56:2: ( ( VAR i= ID COL
	    // t= type ASS e= exp SEMIC | FUN i= ID COL t= type LPAR (p1= ID COL
	    // t1= type ( COMMA p= ID COL t= type )* )? RPAR CLPAR e= exp CRPAR
	    // SEMIC )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:56:4: ( VAR i= ID COL t=
	    // type ASS e= exp SEMIC | FUN i= ID COL t= type LPAR (p1= ID COL
	    // t1= type ( COMMA p= ID COL t= type )* )? RPAR CLPAR e= exp CRPAR
	    // SEMIC )*
	    {
		astList = new ArrayList<Node>();
		int offSet = 1;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:58:4: ( VAR i= ID COL
		// t= type ASS e= exp SEMIC | FUN i= ID COL t= type LPAR (p1= ID
		// COL t1= type ( COMMA p= ID COL t= type )* )? RPAR CLPAR e=
		// exp CRPAR SEMIC )*
		loop3: while (true) {
		    int alt3 = 3;
		    int LA3_0 = input.LA(1);
		    if ((LA3_0 == VAR)) {
			alt3 = 1;
		    } else if ((LA3_0 == FUN)) {
			alt3 = 2;
		    }

		    switch (alt3) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:58:5: VAR i= ID
		    // COL t= type ASS e= exp SEMIC
		    {
			match(input, VAR, FOLLOW_VAR_in_declist90);
			i = (Token) match(input, ID, FOLLOW_ID_in_declist94);
			match(input, COL, FOLLOW_COL_in_declist96);
			pushFollow(FOLLOW_type_in_declist100);
			t = type();
			state._fsp--;

			match(input, ASS, FOLLOW_ASS_in_declist102);
			pushFollow(FOLLOW_exp_in_declist106);
			e = exp();
			state._fsp--;

			match(input, SEMIC, FOLLOW_SEMIC_in_declist108);

			DecVarNode vn = new DecVarNode((i != null ? i.getText()
				: null), t, e);
			STentry entry = new STentry(vn, offSet++); /*
								    * Metto il
								    * puntatore
								    * a quel
								    * nodo e il
								    * suo
								    * relativo
								    * offSet
								    */
			/*
			 * Inserisco il STentry nella symbol table incui ci sar�
			 * il puntatore a quel nodo associandolo al nome dell
			 * ID. Se ci restituisce null va bene perch� ho inserito
			 * un nuovo valore Se invece � != null allora avevo gi�
			 * la variabile presente. ERRORE.
			 */
			HashMap<String, STentry> hm = symTable
				.get(nestingLevel);
			if (hm.put((i != null ? i.getText() : null), entry) != null) // Controllo
										     // semantico
										     // [Multiple
										     // Declaration]
			{
			    System.out.println("identifer "
				    + (i != null ? i.getText() : null)
				    + " at line "
				    + (i != null ? i.getLine() : 0)
				    + "already defined.");
			    System.exit(0);
			}
			astList.add(vn);

		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:76:5: FUN i= ID
		    // COL t= type LPAR (p1= ID COL t1= type ( COMMA p= ID COL
		    // t= type )* )? RPAR CLPAR e= exp CRPAR SEMIC
		    {
			match(input, FUN, FOLLOW_FUN_in_declist119);
			i = (Token) match(input, ID, FOLLOW_ID_in_declist123);
			match(input, COL, FOLLOW_COL_in_declist125);
			pushFollow(FOLLOW_type_in_declist129);
			t = type();
			state._fsp--;

			/*
			 * Introdotto il caricamento e controllo sulla simble
			 * table principale del symble entry della funzione
			 * creato il nodo del AST associato al nodo della
			 * funzione, ma non completamente, queste informazioni
			 * verranno leggendo poi i singoli parametri.
			 */

			DecFunNode fn = new DecFunNode((i != null ? i.getText()
				: null), t);
			STentry entry = new STentry(fn, offSet++);

			HashMap<String, STentry> ParentHm = symTable
				.get(nestingLevel);
			if (ParentHm.put((i != null ? i.getText() : null),
				entry) != null) // Controllo semantico [Multiple
						// Declaration]
			{
			    System.out.println("identifer "
				    + (i != null ? i.getText() : null)
				    + " at line "
				    + (i != null ? i.getLine() : 0)
				    + "already defined.");
			    System.exit(0);
			}

			match(input, LPAR, FOLLOW_LPAR_in_declist136);

			/*
			 * Instanziata una nuova simble table che conterr� i
			 * parametri della funzione Aumentato il nesting level
			 */
			int parOffSet = -1;
			HashMap<String, STentry> FunHm = new HashMap<String, STentry>();
			symTable.add(FunHm);
			nestingLevel++;

			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:103:5: (p1=
			// ID COL t1= type ( COMMA p= ID COL t= type )* )?
			int alt2 = 2;
			int LA2_0 = input.LA(1);
			if ((LA2_0 == ID)) {
			    alt2 = 1;
			}
			switch (alt2) {
			case 1:
			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:103:6: p1= ID
			// COL t1= type ( COMMA p= ID COL t= type )*
			{
			    p1 = (Token) match(input, ID,
				    FOLLOW_ID_in_declist147);
			    match(input, COL, FOLLOW_COL_in_declist149);
			    pushFollow(FOLLOW_type_in_declist153);
			    t1 = type();
			    state._fsp--;

			    /*
			     * Introdurre nella hashmap della funzione, quindi
			     * annidata, i parametri Aggiornato l'AST della
			     * funzione
			     */
			    ParamNode param = new ParamNode(
				    (p1 != null ? p1.getText() : null), t1);
			    entry = new STentry(param, parOffSet--);
			    FunHm.put((p1 != null ? p1.getText() : null), entry);
			    fn.addParam(param);

			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:113:5: (
			    // COMMA p= ID COL t= type )*
			    loop1: while (true) {
				int alt1 = 2;
				int LA1_0 = input.LA(1);
				if ((LA1_0 == COMMA)) {
				    alt1 = 1;
				}

				switch (alt1) {
				case 1:
				// /home/benkio/workspace/LPeMC Lab
				// Project/src/highLevelLanguage/MiniFun.g:113:6:
				// COMMA p= ID COL t= type
				{
				    match(input, COMMA,
					    FOLLOW_COMMA_in_declist161);
				    p = (Token) match(input, ID,
					    FOLLOW_ID_in_declist165);
				    match(input, COL, FOLLOW_COL_in_declist167);
				    pushFollow(FOLLOW_type_in_declist171);
				    t = type();
				    state._fsp--;

				    /*
				     * Introdurre nella hashmap della funzione,
				     * quindi annidata, i parametri Aggiornato
				     * l'AST della funzione
				     */
				    param = new ParamNode(
					    (p != null ? p.getText() : null), t);
				    entry = new STentry(param, parOffSet--);
				    if (FunHm.put((p != null ? p.getText()
					    : null), entry) != null) {
					System.out.println("Param "
						+ (p != null ? p.getText()
							: null) + " at line "
						+ (p != null ? p.getLine() : 0)
						+ "already defined.");
					System.exit(0);
				    }
				    fn.addParam(param);

				}
				    break;

				default:
				    break loop1;
				}
			    }

			}
			    break;

			}

			match(input, RPAR, FOLLOW_RPAR_in_declist190);
			match(input, CLPAR, FOLLOW_CLPAR_in_declist195);
			pushFollow(FOLLOW_exp_in_declist203);
			e = exp();
			state._fsp--;

			/*
			 * Introdurre nel nodo funzione il valore del nodo della
			 * expressione Aggiungere al nodo decVarList il nodo
			 * della dichiarazione di funzione
			 */
			fn.addExpValue(e);
			astList.add(fn);

			match(input, CRPAR, FOLLOW_CRPAR_in_declist211);
			match(input, SEMIC, FOLLOW_SEMIC_in_declist217);

			/*
			 * Elimino l'hashmap perch� non mi serve pi� avendo
			 * finito il lifetime della funzione.
			 */
			symTable.remove(nestingLevel--);

		    }
			break;

		    default:
			break loop3;
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
    // Project/src/highLevelLanguage/MiniFun.g:149:1: exp returns [Node ast] :
    // r= term ( EQ l= term | GREATEQ l= term | LESSEQ l= term )* ;
    public final Node exp() throws RecognitionException {
	Node ast = null;

	Node r = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:150:2: (r= term ( EQ l=
	    // term | GREATEQ l= term | LESSEQ l= term )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:150:4: r= term ( EQ l=
	    // term | GREATEQ l= term | LESSEQ l= term )*
	    {
		pushFollow(FOLLOW_term_in_exp245);
		r = term();
		state._fsp--;

		ast = r;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:151:2: ( EQ l= term |
		// GREATEQ l= term | LESSEQ l= term )*
		loop4: while (true) {
		    int alt4 = 4;
		    switch (input.LA(1)) {
		    case EQ: {
			alt4 = 1;
		    }
			break;
		    case GREATEQ: {
			alt4 = 2;
		    }
			break;
		    case LESSEQ: {
			alt4 = 3;
		    }
			break;
		    }
		    switch (alt4) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:151:3: EQ l= term
		    {
			match(input, EQ, FOLLOW_EQ_in_exp251);
			pushFollow(FOLLOW_term_in_exp255);
			l = term();
			state._fsp--;

			ast = new EqualNode(ast, l);
		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:152:3: GREATEQ l=
		    // term
		    {
			match(input, GREATEQ, FOLLOW_GREATEQ_in_exp263);
			pushFollow(FOLLOW_term_in_exp267);
			l = term();
			state._fsp--;

			ast = new GreatEqualNode(ast, l);
		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:153:3: LESSEQ l=
		    // term
		    {
			match(input, LESSEQ, FOLLOW_LESSEQ_in_exp275);
			pushFollow(FOLLOW_term_in_exp279);
			l = term();
			state._fsp--;

			ast = new LessEqualNode(ast, l);
		    }
			break;

		    default:
			break loop4;
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

    // $ANTLR start "value"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:156:1: value returns [Node ast] :
    // r= fatt ( TIMES l= fatt | DIV l= fatt | AND l= fatt )* ;
    public final Node value() throws RecognitionException {
	Node ast = null;

	Node r = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:157:2: (r= fatt ( TIMES
	    // l= fatt | DIV l= fatt | AND l= fatt )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:157:4: r= fatt ( TIMES l=
	    // fatt | DIV l= fatt | AND l= fatt )*
	    {
		pushFollow(FOLLOW_fatt_in_value302);
		r = fatt();
		state._fsp--;

		ast = r;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:158:2: ( TIMES l=
		// fatt | DIV l= fatt | AND l= fatt )*
		loop5: while (true) {
		    int alt5 = 4;
		    switch (input.LA(1)) {
		    case TIMES: {
			alt5 = 1;
		    }
			break;
		    case DIV: {
			alt5 = 2;
		    }
			break;
		    case AND: {
			alt5 = 3;
		    }
			break;
		    }
		    switch (alt5) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:158:4: TIMES l=
		    // fatt
		    {
			match(input, TIMES, FOLLOW_TIMES_in_value309);
			pushFollow(FOLLOW_fatt_in_value313);
			l = fatt();
			state._fsp--;

			ast = new TimesNode(ast, l);
		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:159:4: DIV l=
		    // fatt
		    {
			match(input, DIV, FOLLOW_DIV_in_value320);
			pushFollow(FOLLOW_fatt_in_value324);
			l = fatt();
			state._fsp--;

			ast = new DivNode(ast, l);
		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:160:4: AND l=
		    // fatt
		    {
			match(input, AND, FOLLOW_AND_in_value331);
			pushFollow(FOLLOW_fatt_in_value335);
			l = fatt();
			state._fsp--;

			ast = new AndNode(ast, l);
		    }
			break;

		    default:
			break loop5;
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

    // $ANTLR start "term"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:163:1: term returns [Node ast] :
    // r= value ( PLUS l= value | MINUS l= value | OR l= value )* ;
    public final Node term() throws RecognitionException {
	Node ast = null;

	Node r = null;
	Node l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:164:2: (r= value ( PLUS
	    // l= value | MINUS l= value | OR l= value )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:164:4: r= value ( PLUS l=
	    // value | MINUS l= value | OR l= value )*
	    {
		pushFollow(FOLLOW_value_in_term358);
		r = value();
		state._fsp--;

		ast = r;
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:165:2: ( PLUS l=
		// value | MINUS l= value | OR l= value )*
		loop6: while (true) {
		    int alt6 = 4;
		    switch (input.LA(1)) {
		    case PLUS: {
			alt6 = 1;
		    }
			break;
		    case MINUS: {
			alt6 = 2;
		    }
			break;
		    case OR: {
			alt6 = 3;
		    }
			break;
		    }
		    switch (alt6) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:165:4: PLUS l=
		    // value
		    {
			match(input, PLUS, FOLLOW_PLUS_in_term365);
			pushFollow(FOLLOW_value_in_term370);
			l = value();
			state._fsp--;

			ast = new PlusNode(ast, l);
		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:166:4: MINUS l=
		    // value
		    {
			match(input, MINUS, FOLLOW_MINUS_in_term377);
			pushFollow(FOLLOW_value_in_term381);
			l = value();
			state._fsp--;

			ast = new MinusNode(ast, l);
		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:167:4: OR l=
		    // value
		    {
			match(input, OR, FOLLOW_OR_in_term388);
			pushFollow(FOLLOW_value_in_term393);
			l = value();
			state._fsp--;

			ast = new OrNode(ast, l);
		    }
			break;

		    default:
			break loop6;
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

    // $ANTLR start "fatt"
    // /home/benkio/workspace/LPeMC Lab
    // Project/src/highLevelLanguage/MiniFun.g:169:1: fatt returns [Node ast] :
    // (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LPAR (p1= exp
    // ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE
    // CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR
    // e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR p= exp RPAR | NOT LPAR
    // e= exp RPAR );
    public final Node fatt() throws RecognitionException {
	Node ast = null;

	Token n = null;
	Token i = null;
	Node e = null;
	Node p1 = null;
	Node p = null;
	Node x = null;
	Node y = null;
	Node z = null;
	Node e1 = null;
	Node e2 = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:170:2: (n= NAT | TRUE |
	    // FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LPAR (p1= exp ( COMMA
	    // p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE
	    // CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR |
	    // FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR p=
	    // exp RPAR | NOT LPAR e= exp RPAR )
	    int alt10 = 12;
	    switch (input.LA(1)) {
	    case NAT: {
		alt10 = 1;
	    }
		break;
	    case TRUE: {
		alt10 = 2;
	    }
		break;
	    case FALSE: {
		alt10 = 3;
	    }
		break;
	    case EMPTY: {
		alt10 = 4;
	    }
		break;
	    case LPAR: {
		alt10 = 5;
	    }
		break;
	    case ID: {
		alt10 = 6;
	    }
		break;
	    case IF: {
		alt10 = 7;
	    }
		break;
	    case SLPAR: {
		alt10 = 8;
	    }
		break;
	    case FIRST: {
		alt10 = 9;
	    }
		break;
	    case REST: {
		alt10 = 10;
	    }
		break;
	    case PRINT: {
		alt10 = 11;
	    }
		break;
	    case NOT: {
		alt10 = 12;
	    }
		break;
	    default:
		NoViableAltException nvae = new NoViableAltException("", 10, 0,
			input);
		throw nvae;
	    }
	    switch (alt10) {
	    case 1:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:170:4: n= NAT
	    {
		n = (Token) match(input, NAT, FOLLOW_NAT_in_fatt412);
		ast = new NatNode(Integer.parseInt((n != null ? n.getText()
			: null)));
	    }
		break;
	    case 2:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:171:4: TRUE
	    {
		match(input, TRUE, FOLLOW_TRUE_in_fatt419);
		ast = new BoolNode(true);
	    }
		break;
	    case 3:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:172:4: FALSE
	    {
		match(input, FALSE, FOLLOW_FALSE_in_fatt427);
		ast = new BoolNode(false);
	    }
		break;
	    case 4:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:173:4: EMPTY
	    {
		match(input, EMPTY, FOLLOW_EMPTY_in_fatt434);
		ast = new EmptyNode();
	    }
		break;
	    case 5:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:174:4: LPAR e= exp RPAR
	    {
		match(input, LPAR, FOLLOW_LPAR_in_fatt441);
		pushFollow(FOLLOW_exp_in_fatt445);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt447);
		ast = e;
	    }
		break;
	    case 6:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:175:4: i= ID ( LPAR (p1=
	    // exp ( COMMA p= exp )* )? RPAR )?
	    {
		i = (Token) match(input, ID, FOLLOW_ID_in_fatt456);

		STentry entry = null;
		/*
		 * Attenzione, non bisogna accontentarsi di guardare alla
		 * hashmap corrente ma tramite un ciclo controllare se la
		 * variabile � globale, solo nel caso non esistesse anche cos�
		 * allora bisogna dare errore.
		 */
		int declNL;
		for (declNL = nestingLevel; declNL >= 0; declNL--) {
		    HashMap<String, STentry> hm = symTable.get(declNL);
		    entry = hm.get((i != null ? i.getText() : null));
		    if (entry != null)
			break;
		}
		if (entry == null) {
		    System.out
			    .println("identifer "
				    + (i != null ? i.getText() : null)
				    + " at line "
				    + (i != null ? i.getLine() : 0)
				    + "is not defined.");
		    System.exit(0);
		}
		ast = new VarNode(entry, nestingLevel - declNL); /*
								  * Il secondo
								  * parametro mi
								  * dice a che
								  * livello ho
								  * trovato la
								  * variabile
								  */

		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:195:2: ( LPAR (p1=
		// exp ( COMMA p= exp )* )? RPAR )?
		int alt9 = 2;
		int LA9_0 = input.LA(1);
		if ((LA9_0 == LPAR)) {
		    alt9 = 1;
		}
		switch (alt9) {
		case 1:
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/highLevelLanguage/MiniFun.g:195:4: LPAR (p1= exp
		// ( COMMA p= exp )* )? RPAR
		{
		    match(input, LPAR, FOLLOW_LPAR_in_fatt463);

		    /*
		     * Capisco che si tratta di una chiamata a funzione
		     * Controllo se effettivamente � presente una dichiarazione
		     * di funzione e quindi creo una arraylist di parametri da
		     * aggiungere al nodo, questa mi servir� poi per effettuare
		     * il type checking e per passare adeguatamente i parametri
		     * al corpo della funzione
		     */
		    ArrayList<Node> params = new ArrayList<Node>();

		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:206:2: (p1= exp (
		    // COMMA p= exp )* )?
		    int alt8 = 2;
		    int LA8_0 = input.LA(1);
		    if ((LA8_0 == EMPTY || (LA8_0 >= FALSE && LA8_0 <= FIRST)
			    || (LA8_0 >= ID && LA8_0 <= IF) || LA8_0 == LPAR
			    || (LA8_0 >= NAT && LA8_0 <= NOT)
			    || (LA8_0 >= PRINT && LA8_0 <= REST)
			    || LA8_0 == SLPAR || LA8_0 == TRUE)) {
			alt8 = 1;
		    }
		    switch (alt8) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/highLevelLanguage/MiniFun.g:206:3: p1= exp (
		    // COMMA p= exp )*
		    {
			pushFollow(FOLLOW_exp_in_fatt473);
			p1 = exp();
			state._fsp--;

			params.add(p1);

			// /home/benkio/workspace/LPeMC Lab
			// Project/src/highLevelLanguage/MiniFun.g:210:2: (
			// COMMA p= exp )*
			loop7: while (true) {
			    int alt7 = 2;
			    int LA7_0 = input.LA(1);
			    if ((LA7_0 == COMMA)) {
				alt7 = 1;
			    }

			    switch (alt7) {
			    case 1:
			    // /home/benkio/workspace/LPeMC Lab
			    // Project/src/highLevelLanguage/MiniFun.g:210:3:
			    // COMMA p= exp
			    {
				match(input, COMMA, FOLLOW_COMMA_in_fatt481);
				pushFollow(FOLLOW_exp_in_fatt485);
				p = exp();
				state._fsp--;

				params.add(p);
			    }
				break;

			    default:
				break loop7;
			    }
			}

		    }
			break;

		    }

		    match(input, RPAR, FOLLOW_RPAR_in_fatt496);

		    ast = new FunNode(entry, nestingLevel - declNL, params);

		}
		    break;

		}

	    }
		break;
	    case 7:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:216:4: IF x= exp THEN
	    // CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
	    {
		match(input, IF, FOLLOW_IF_in_fatt512);
		pushFollow(FOLLOW_exp_in_fatt516);
		x = exp();
		state._fsp--;

		match(input, THEN, FOLLOW_THEN_in_fatt518);
		match(input, CLPAR, FOLLOW_CLPAR_in_fatt520);
		pushFollow(FOLLOW_exp_in_fatt524);
		y = exp();
		state._fsp--;

		match(input, CRPAR, FOLLOW_CRPAR_in_fatt526);
		match(input, ELSE, FOLLOW_ELSE_in_fatt534);
		match(input, CLPAR, FOLLOW_CLPAR_in_fatt536);
		pushFollow(FOLLOW_exp_in_fatt540);
		z = exp();
		state._fsp--;

		match(input, CRPAR, FOLLOW_CRPAR_in_fatt542);
		ast = new IfNode(x, y, z);
	    }
		break;
	    case 8:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:219:4: SLPAR e1= exp
	    // DOUBLECOL e2= exp SRPAR
	    {
		match(input, SLPAR, FOLLOW_SLPAR_in_fatt552);
		pushFollow(FOLLOW_exp_in_fatt556);
		e1 = exp();
		state._fsp--;

		match(input, DOUBLECOL, FOLLOW_DOUBLECOL_in_fatt558);
		pushFollow(FOLLOW_exp_in_fatt562);
		e2 = exp();
		state._fsp--;

		match(input, SRPAR, FOLLOW_SRPAR_in_fatt564);
		ast = new ListNode(e1, e2);
	    }
		break;
	    case 9:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:221:4: FIRST LPAR e= exp
	    // RPAR
	    {
		match(input, FIRST, FOLLOW_FIRST_in_fatt576);
		match(input, LPAR, FOLLOW_LPAR_in_fatt578);
		pushFollow(FOLLOW_exp_in_fatt582);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt584);
		ast = new FirstNode(e);
	    }
		break;
	    case 10:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:222:4: REST LPAR e= exp
	    // RPAR
	    {
		match(input, REST, FOLLOW_REST_in_fatt590);
		match(input, LPAR, FOLLOW_LPAR_in_fatt592);
		pushFollow(FOLLOW_exp_in_fatt596);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt598);
		ast = new RestNode(e);
	    }
		break;
	    case 11:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:223:4: PRINT LPAR p= exp
	    // RPAR
	    {
		match(input, PRINT, FOLLOW_PRINT_in_fatt604);
		match(input, LPAR, FOLLOW_LPAR_in_fatt607);
		pushFollow(FOLLOW_exp_in_fatt611);
		p = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt613);
		ast = new PrintNode(p);
	    }
		break;
	    case 12:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:225:4: NOT LPAR e= exp
	    // RPAR
	    {
		match(input, NOT, FOLLOW_NOT_in_fatt627);
		match(input, LPAR, FOLLOW_LPAR_in_fatt629);
		pushFollow(FOLLOW_exp_in_fatt633);
		e = exp();
		state._fsp--;

		match(input, RPAR, FOLLOW_RPAR_in_fatt635);
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
    // Project/src/highLevelLanguage/MiniFun.g:227:1: type returns [Node ast] :
    // ( INTTYPE | BOOLTYPE );
    public final Node type() throws RecognitionException {
	Node ast = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:228:2: ( INTTYPE |
	    // BOOLTYPE )
	    int alt11 = 2;
	    int LA11_0 = input.LA(1);
	    if ((LA11_0 == INTTYPE)) {
		alt11 = 1;
	    } else if ((LA11_0 == BOOLTYPE)) {
		alt11 = 2;
	    }

	    else {
		NoViableAltException nvae = new NoViableAltException("", 11, 0,
			input);
		throw nvae;
	    }

	    switch (alt11) {
	    case 1:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:228:4: INTTYPE
	    {
		match(input, INTTYPE, FOLLOW_INTTYPE_in_type652);
		ast = new IntTypeNode();
	    }
		break;
	    case 2:
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/highLevelLanguage/MiniFun.g:229:4: BOOLTYPE
	    {
		match(input, BOOLTYPE, FOLLOW_BOOLTYPE_in_type659);
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

    // Delegated rules

    public static final BitSet FOLLOW_LET_in_prog33 = new BitSet(
	    new long[] { 0x0000040000880000L });
    public static final BitSet FOLLOW_declist_in_prog46 = new BitSet(
	    new long[] { 0x0000000000800000L });
    public static final BitSet FOLLOW_IN_in_prog52 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_prog56 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_SEMIC_in_prog58 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_VAR_in_declist90 = new BitSet(
	    new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_ID_in_declist94 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_COL_in_declist96 = new BitSet(
	    new long[] { 0x0000000001000040L });
    public static final BitSet FOLLOW_type_in_declist100 = new BitSet(
	    new long[] { 0x0000000000000020L });
    public static final BitSet FOLLOW_ASS_in_declist102 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_declist106 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_SEMIC_in_declist108 = new BitSet(
	    new long[] { 0x0000040000080002L });
    public static final BitSet FOLLOW_FUN_in_declist119 = new BitSet(
	    new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_ID_in_declist123 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_COL_in_declist125 = new BitSet(
	    new long[] { 0x0000000001000040L });
    public static final BitSet FOLLOW_type_in_declist129 = new BitSet(
	    new long[] { 0x0000000008000000L });
    public static final BitSet FOLLOW_LPAR_in_declist136 = new BitSet(
	    new long[] { 0x0000000800200000L });
    public static final BitSet FOLLOW_ID_in_declist147 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_COL_in_declist149 = new BitSet(
	    new long[] { 0x0000000001000040L });
    public static final BitSet FOLLOW_type_in_declist153 = new BitSet(
	    new long[] { 0x0000000800000200L });
    public static final BitSet FOLLOW_COMMA_in_declist161 = new BitSet(
	    new long[] { 0x0000000000200000L });
    public static final BitSet FOLLOW_ID_in_declist165 = new BitSet(
	    new long[] { 0x0000000000000100L });
    public static final BitSet FOLLOW_COL_in_declist167 = new BitSet(
	    new long[] { 0x0000000001000040L });
    public static final BitSet FOLLOW_type_in_declist171 = new BitSet(
	    new long[] { 0x0000000800000200L });
    public static final BitSet FOLLOW_RPAR_in_declist190 = new BitSet(
	    new long[] { 0x0000000000000080L });
    public static final BitSet FOLLOW_CLPAR_in_declist195 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_declist203 = new BitSet(
	    new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_CRPAR_in_declist211 = new BitSet(
	    new long[] { 0x0000001000000000L });
    public static final BitSet FOLLOW_SEMIC_in_declist217 = new BitSet(
	    new long[] { 0x0000040000080002L });
    public static final BitSet FOLLOW_term_in_exp245 = new BitSet(
	    new long[] { 0x0000000002108002L });
    public static final BitSet FOLLOW_EQ_in_exp251 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_term_in_exp255 = new BitSet(
	    new long[] { 0x0000000002108002L });
    public static final BitSet FOLLOW_GREATEQ_in_exp263 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_term_in_exp267 = new BitSet(
	    new long[] { 0x0000000002108002L });
    public static final BitSet FOLLOW_LESSEQ_in_exp275 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_term_in_exp279 = new BitSet(
	    new long[] { 0x0000000002108002L });
    public static final BitSet FOLLOW_fatt_in_value302 = new BitSet(
	    new long[] { 0x0000010000000812L });
    public static final BitSet FOLLOW_TIMES_in_value309 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_fatt_in_value313 = new BitSet(
	    new long[] { 0x0000010000000812L });
    public static final BitSet FOLLOW_DIV_in_value320 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_fatt_in_value324 = new BitSet(
	    new long[] { 0x0000010000000812L });
    public static final BitSet FOLLOW_AND_in_value331 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_fatt_in_value335 = new BitSet(
	    new long[] { 0x0000010000000812L });
    public static final BitSet FOLLOW_value_in_term358 = new BitSet(
	    new long[] { 0x0000000190000002L });
    public static final BitSet FOLLOW_PLUS_in_term365 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_value_in_term370 = new BitSet(
	    new long[] { 0x0000000190000002L });
    public static final BitSet FOLLOW_MINUS_in_term377 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_value_in_term381 = new BitSet(
	    new long[] { 0x0000000190000002L });
    public static final BitSet FOLLOW_OR_in_term388 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_value_in_term393 = new BitSet(
	    new long[] { 0x0000000190000002L });
    public static final BitSet FOLLOW_NAT_in_fatt412 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_TRUE_in_fatt419 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_FALSE_in_fatt427 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_EMPTY_in_fatt434 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_LPAR_in_fatt441 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt445 = new BitSet(
	    new long[] { 0x0000000800000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt447 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_ID_in_fatt456 = new BitSet(
	    new long[] { 0x0000000008000002L });
    public static final BitSet FOLLOW_LPAR_in_fatt463 = new BitSet(
	    new long[] { 0x0000022E68664000L });
    public static final BitSet FOLLOW_exp_in_fatt473 = new BitSet(
	    new long[] { 0x0000000800000200L });
    public static final BitSet FOLLOW_COMMA_in_fatt481 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt485 = new BitSet(
	    new long[] { 0x0000000800000200L });
    public static final BitSet FOLLOW_RPAR_in_fatt496 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_IF_in_fatt512 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt516 = new BitSet(
	    new long[] { 0x0000008000000000L });
    public static final BitSet FOLLOW_THEN_in_fatt518 = new BitSet(
	    new long[] { 0x0000000000000080L });
    public static final BitSet FOLLOW_CLPAR_in_fatt520 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt524 = new BitSet(
	    new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_CRPAR_in_fatt526 = new BitSet(
	    new long[] { 0x0000000000002000L });
    public static final BitSet FOLLOW_ELSE_in_fatt534 = new BitSet(
	    new long[] { 0x0000000000000080L });
    public static final BitSet FOLLOW_CLPAR_in_fatt536 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt540 = new BitSet(
	    new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_CRPAR_in_fatt542 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_SLPAR_in_fatt552 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt556 = new BitSet(
	    new long[] { 0x0000000000001000L });
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt558 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt562 = new BitSet(
	    new long[] { 0x0000004000000000L });
    public static final BitSet FOLLOW_SRPAR_in_fatt564 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_FIRST_in_fatt576 = new BitSet(
	    new long[] { 0x0000000008000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt578 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt582 = new BitSet(
	    new long[] { 0x0000000800000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt584 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_REST_in_fatt590 = new BitSet(
	    new long[] { 0x0000000008000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt592 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt596 = new BitSet(
	    new long[] { 0x0000000800000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt598 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_PRINT_in_fatt604 = new BitSet(
	    new long[] { 0x0000000008000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt607 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt611 = new BitSet(
	    new long[] { 0x0000000800000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt613 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_NOT_in_fatt627 = new BitSet(
	    new long[] { 0x0000000008000000L });
    public static final BitSet FOLLOW_LPAR_in_fatt629 = new BitSet(
	    new long[] { 0x0000022668664000L });
    public static final BitSet FOLLOW_exp_in_fatt633 = new BitSet(
	    new long[] { 0x0000000800000000L });
    public static final BitSet FOLLOW_RPAR_in_fatt635 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_INTTYPE_in_type652 = new BitSet(
	    new long[] { 0x0000000000000002L });
    public static final BitSet FOLLOW_BOOLTYPE_in_type659 = new BitSet(
	    new long[] { 0x0000000000000002L });
}
