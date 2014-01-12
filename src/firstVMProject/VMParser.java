// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/firstVMProject/VM.g 2014-01-12 14:27:56
package firstVMProject;

import java.util.ArrayList;
import java.util.HashMap;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.Parser;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RecognizerSharedState;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenStream;

@SuppressWarnings("all")
public class VMParser extends Parser {
    public static final String[] tokenNames = new String[] { "<invalid>",
	    "<EOR>", "<DOWN>", "<UP>", "ADD", "BRANCH", "BRANCHEQUAL",
	    "BRANCHGREAT", "BRANCHLESS", "CFP", "COL", "DIV", "ERR", "HALT",
	    "JS", "LABEL", "LFP", "LHP", "LRA", "LRV", "LW", "MULT", "NUMBER",
	    "POP", "PRINT", "PUSH", "SFP", "SHP", "SRA", "SRV", "SUB", "SW",
	    "WHITESP" };
    public static final int EOF = -1;
    public static final int ADD = 4;
    public static final int BRANCH = 5;
    public static final int BRANCHEQUAL = 6;
    public static final int BRANCHGREAT = 7;
    public static final int BRANCHLESS = 8;
    public static final int CFP = 9;
    public static final int COL = 10;
    public static final int DIV = 11;
    public static final int ERR = 12;
    public static final int HALT = 13;
    public static final int JS = 14;
    public static final int LABEL = 15;
    public static final int LFP = 16;
    public static final int LHP = 17;
    public static final int LRA = 18;
    public static final int LRV = 19;
    public static final int LW = 20;
    public static final int MULT = 21;
    public static final int NUMBER = 22;
    public static final int POP = 23;
    public static final int PRINT = 24;
    public static final int PUSH = 25;
    public static final int SFP = 26;
    public static final int SHP = 27;
    public static final int SRA = 28;
    public static final int SRV = 29;
    public static final int SUB = 30;
    public static final int SW = 31;
    public static final int WHITESP = 32;

    // delegates
    public Parser[] getDelegates() {
	return new Parser[] {};
    }

    // delegators

    public VMParser(TokenStream input) {
	this(input, new RecognizerSharedState());
    }

    public VMParser(TokenStream input, RecognizerSharedState state) {
	super(input, state);
    }

    @Override
    public String[] getTokenNames() {
	return VMParser.tokenNames;
    }

    @Override
    public String getGrammarFileName() {
	return "/home/benkio/workspace/LPeMC Lab Project/src/firstVMProject/VM.g";
    }

    private int[] code = new int[ExecuteVM.CODESIZE];
    private int i = 0;
    private HashMap<String, Integer> labelAddress = new HashMap<String, Integer>();
    private ArrayList<String> labels = new ArrayList<String>();
    private ArrayList<Integer> addresses = new ArrayList<Integer>();

    public int[] createCode() throws Exception {
	assembly();
	return code;
    }

    // $ANTLR start "assembly"
    // /home/benkio/workspace/LPeMC Lab Project/src/firstVMProject/VM.g:27:1:
    // assembly : ( PUSH e= NUMBER | PUSH l= LABEL | POP | ADD | SUB | MULT |
    // DIV | SW | LW | BRANCHEQUAL l= LABEL | JS | LRA | SRA | LRV | SRV | LHP |
    // SHP | LFP | SFP | CFP |e= LABEL COL | BRANCH e= LABEL | BRANCHLESS e=
    // LABEL | BRANCHGREAT e= LABEL | PRINT | HALT )* ;
    public final void assembly() throws RecognitionException {
	Token e = null;
	Token l = null;

	try {
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/firstVMProject/VM.g:27:9: ( ( PUSH e= NUMBER | PUSH
	    // l= LABEL | POP | ADD | SUB | MULT | DIV | SW | LW | BRANCHEQUAL
	    // l= LABEL | JS | LRA | SRA | LRV | SRV | LHP | SHP | LFP | SFP |
	    // CFP |e= LABEL COL | BRANCH e= LABEL | BRANCHLESS e= LABEL |
	    // BRANCHGREAT e= LABEL | PRINT | HALT )* )
	    // /home/benkio/workspace/LPeMC Lab
	    // Project/src/firstVMProject/VM.g:27:11: ( PUSH e= NUMBER | PUSH l=
	    // LABEL | POP | ADD | SUB | MULT | DIV | SW | LW | BRANCHEQUAL l=
	    // LABEL | JS | LRA | SRA | LRV | SRV | LHP | SHP | LFP | SFP | CFP
	    // |e= LABEL COL | BRANCH e= LABEL | BRANCHLESS e= LABEL |
	    // BRANCHGREAT e= LABEL | PRINT | HALT )*
	    {
		// /home/benkio/workspace/LPeMC Lab
		// Project/src/firstVMProject/VM.g:27:11: ( PUSH e= NUMBER |
		// PUSH l= LABEL | POP | ADD | SUB | MULT | DIV | SW | LW |
		// BRANCHEQUAL l= LABEL | JS | LRA | SRA | LRV | SRV | LHP | SHP
		// | LFP | SFP | CFP |e= LABEL COL | BRANCH e= LABEL |
		// BRANCHLESS e= LABEL | BRANCHGREAT e= LABEL | PRINT | HALT )*
		loop1: while (true) {
		    int alt1 = 27;
		    switch (input.LA(1)) {
		    case PUSH: {
			int LA1_2 = input.LA(2);
			if ((LA1_2 == NUMBER)) {
			    alt1 = 1;
			} else if ((LA1_2 == LABEL)) {
			    alt1 = 2;
			}

		    }
			break;
		    case POP: {
			alt1 = 3;
		    }
			break;
		    case ADD: {
			alt1 = 4;
		    }
			break;
		    case SUB: {
			alt1 = 5;
		    }
			break;
		    case MULT: {
			alt1 = 6;
		    }
			break;
		    case DIV: {
			alt1 = 7;
		    }
			break;
		    case SW: {
			alt1 = 8;
		    }
			break;
		    case LW: {
			alt1 = 9;
		    }
			break;
		    case BRANCHEQUAL: {
			alt1 = 10;
		    }
			break;
		    case JS: {
			alt1 = 11;
		    }
			break;
		    case LRA: {
			alt1 = 12;
		    }
			break;
		    case SRA: {
			alt1 = 13;
		    }
			break;
		    case LRV: {
			alt1 = 14;
		    }
			break;
		    case SRV: {
			alt1 = 15;
		    }
			break;
		    case LHP: {
			alt1 = 16;
		    }
			break;
		    case SHP: {
			alt1 = 17;
		    }
			break;
		    case LFP: {
			alt1 = 18;
		    }
			break;
		    case SFP: {
			alt1 = 19;
		    }
			break;
		    case CFP: {
			alt1 = 20;
		    }
			break;
		    case LABEL: {
			alt1 = 21;
		    }
			break;
		    case BRANCH: {
			alt1 = 22;
		    }
			break;
		    case BRANCHLESS: {
			alt1 = 23;
		    }
			break;
		    case BRANCHGREAT: {
			alt1 = 24;
		    }
			break;
		    case PRINT: {
			alt1 = 25;
		    }
			break;
		    case HALT: {
			alt1 = 26;
		    }
			break;
		    }
		    switch (alt1) {
		    case 1:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:27:13: PUSH e= NUMBER
		    {
			match(input, PUSH, FOLLOW_PUSH_in_assembly26);
			e = (Token) match(input, NUMBER,
				FOLLOW_NUMBER_in_assembly30);
			code[i++] = PUSH;
			code[i++] = Integer.parseInt((e != null ? e.getText()
				: null));
		    }
			break;
		    case 2:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:34:6: PUSH l= LABEL
		    {
			match(input, PUSH, FOLLOW_PUSH_in_assembly51);
			l = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly55);
			code[i++] = PUSH;
			labels.add((l != null ? l.getText() : null));
			addresses.add(new Integer(i));
			code[i++] = 0;
		    }
			break;
		    case 3:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:39:6: POP
		    {
			match(input, POP, FOLLOW_POP_in_assembly78);
			code[i++] = POP;
		    }
			break;
		    case 4:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:40:6: ADD
		    {
			match(input, ADD, FOLLOW_ADD_in_assembly93);
			code[i++] = ADD;
		    }
			break;
		    case 5:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:41:6: SUB
		    {
			match(input, SUB, FOLLOW_SUB_in_assembly107);
			code[i++] = SUB;
		    }
			break;
		    case 6:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:42:6: MULT
		    {
			match(input, MULT, FOLLOW_MULT_in_assembly121);
			code[i++] = MULT;
		    }
			break;
		    case 7:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:43:6: DIV
		    {
			match(input, DIV, FOLLOW_DIV_in_assembly134);
			code[i++] = DIV;
		    }
			break;
		    case 8:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:46:6: SW
		    {
			match(input, SW, FOLLOW_SW_in_assembly163);
			code[i++] = SW;
		    }
			break;
		    case 9:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:47:6: LW
		    {
			match(input, LW, FOLLOW_LW_in_assembly177);
			code[i++] = LW;
		    }
			break;
		    case 10:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:48:6: BRANCHEQUAL l=
		    // LABEL
		    {
			match(input, BRANCHEQUAL,
				FOLLOW_BRANCHEQUAL_in_assembly191);
			l = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly195);
			code[i++] = BRANCHEQUAL;
			labels.add((l != null ? l.getText() : null));
			addresses.add(new Integer(i));
			code[i++] = 0;
		    }
			break;
		    case 11:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:53:6: JS
		    {
			match(input, JS, FOLLOW_JS_in_assembly216);
			code[i++] = JS;
		    }
			break;
		    case 12:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:55:6: LRA
		    {
			match(input, LRA, FOLLOW_LRA_in_assembly235);
			code[i++] = LRA;
		    }
			break;
		    case 13:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:56:6: SRA
		    {
			match(input, SRA, FOLLOW_SRA_in_assembly249);
			code[i++] = SRA;
		    }
			break;
		    case 14:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:57:6: LRV
		    {
			match(input, LRV, FOLLOW_LRV_in_assembly263);
			code[i++] = LRV;
		    }
			break;
		    case 15:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:58:8: SRV
		    {
			match(input, SRV, FOLLOW_SRV_in_assembly279);
			code[i++] = SRV;
		    }
			break;
		    case 16:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:59:6: LHP
		    {
			match(input, LHP, FOLLOW_LHP_in_assembly293);
			code[i++] = LHP;
		    }
			break;
		    case 17:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:60:6: SHP
		    {
			match(input, SHP, FOLLOW_SHP_in_assembly307);
			code[i++] = SHP;
		    }
			break;
		    case 18:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:61:6: LFP
		    {
			match(input, LFP, FOLLOW_LFP_in_assembly321);
			code[i++] = LFP;
		    }
			break;
		    case 19:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:62:6: SFP
		    {
			match(input, SFP, FOLLOW_SFP_in_assembly335);
			code[i++] = SFP;
		    }
			break;
		    case 20:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:63:6: CFP
		    {
			match(input, CFP, FOLLOW_CFP_in_assembly349);
			code[i++] = CFP;
		    }
			break;
		    case 21:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:65:6: e= LABEL COL
		    {
			e = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly372);
			match(input, COL, FOLLOW_COL_in_assembly374);
			labelAddress.put((e != null ? e.getText() : null),
				new Integer(i));
		    }
			break;
		    case 22:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:66:6: BRANCH e= LABEL
		    {
			match(input, BRANCH, FOLLOW_BRANCH_in_assembly387);
			e = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly391);
			code[i++] = BRANCH;
			labels.add((e != null ? e.getText() : null));
			addresses.add(new Integer(i));
			code[i++] = 0;
		    }
			break;
		    case 23:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:70:6: BRANCHLESS e= LABEL
		    {
			match(input, BRANCHLESS,
				FOLLOW_BRANCHLESS_in_assembly401);
			e = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly405);
			code[i++] = BRANCHLESS;
			labels.add((e != null ? e.getText() : null));
			addresses.add(new Integer(i));
			code[i++] = 0;
		    }
			break;
		    case 24:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:75:6: BRANCHGREAT e=
		    // LABEL
		    {
			match(input, BRANCHGREAT,
				FOLLOW_BRANCHGREAT_in_assembly436);
			e = (Token) match(input, LABEL,
				FOLLOW_LABEL_in_assembly440);
			code[i++] = BRANCHGREAT;
			labels.add((e != null ? e.getText() : null));
			addresses.add(new Integer(i));
			code[i++] = 0;
		    }
			break;
		    case 25:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:80:6: PRINT
		    {
			match(input, PRINT, FOLLOW_PRINT_in_assembly458);
			code[i++] = PRINT;
		    }
			break;
		    case 26:
		    // /home/benkio/workspace/LPeMC Lab
		    // Project/src/firstVMProject/VM.g:81:6: HALT
		    {
			match(input, HALT, FOLLOW_HALT_in_assembly477);
			code[i++] = HALT;
		    }
			break;

		    default:
			break loop1;
		    }
		}

		for (int ind = 0; ind < labels.size(); ind++) {
		    Integer t = labelAddress.get(labels.get(ind));
		    Integer a = addresses.get(ind);
		    code[a.intValue()] = t.intValue();
		}

	    }

	} catch (RecognitionException re) {
	    reportError(re);
	    recover(input, re);
	} finally {
	    // do for sure before leaving
	}
    }

    // $ANTLR end "assembly"

    // Delegated rules

    public static final BitSet FOLLOW_PUSH_in_assembly26 = new BitSet(
	    new long[] { 0x0000000000400000L });
    public static final BitSet FOLLOW_NUMBER_in_assembly30 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_PUSH_in_assembly51 = new BitSet(
	    new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_LABEL_in_assembly55 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_POP_in_assembly78 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_ADD_in_assembly93 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SUB_in_assembly107 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_MULT_in_assembly121 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_DIV_in_assembly134 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SW_in_assembly163 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LW_in_assembly177 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_BRANCHEQUAL_in_assembly191 = new BitSet(
	    new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_LABEL_in_assembly195 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_JS_in_assembly216 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LRA_in_assembly235 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SRA_in_assembly249 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LRV_in_assembly263 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SRV_in_assembly279 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LHP_in_assembly293 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SHP_in_assembly307 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LFP_in_assembly321 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_SFP_in_assembly335 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_CFP_in_assembly349 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_LABEL_in_assembly372 = new BitSet(
	    new long[] { 0x0000000000000400L });
    public static final BitSet FOLLOW_COL_in_assembly374 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_BRANCH_in_assembly387 = new BitSet(
	    new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_LABEL_in_assembly391 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_BRANCHLESS_in_assembly401 = new BitSet(
	    new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_LABEL_in_assembly405 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_BRANCHGREAT_in_assembly436 = new BitSet(
	    new long[] { 0x0000000000008000L });
    public static final BitSet FOLLOW_LABEL_in_assembly440 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_PRINT_in_assembly458 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
    public static final BitSet FOLLOW_HALT_in_assembly477 = new BitSet(
	    new long[] { 0x00000000FFBFEBF2L });
}
