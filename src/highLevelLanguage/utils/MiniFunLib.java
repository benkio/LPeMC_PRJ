package highLevelLanguage.utils;

import highLevelLanguage.Node.ArrowTypeNode;
import highLevelLanguage.Node.Node;
import highLevelLanguage.Node.NodeType;

public class MiniFunLib {

    public static final String INT = "Int";
    public static final String BOOL = "Bool";
    public static final String EMPTY = "Empty";
    public static final String LIST = "list";
    public static final int TRUE = 1;
    public static final int FALSE = 0;
    public static final int NULLPOINTER = -1;

    private static int labIndex = 0;

    // buffer dove vado ad inserire il codice delle funzioni
    private static String functionCode = "";

    public static int getLabIndex() {
	return labIndex++;
    }

    /*
     * ATTENZIONE la posizione dei paramentri non e' casuale infatti si basa sul
     * subtyping.
     */
    public static boolean isCompatible(Node n1, Node n2) {
	/*
	 * Se anche avessi un arrowtype -> baseType non mi interessa controllo
	 * solo il tipo di ritorno dell'arrowtype con quello del baseType. es:
	 * fun : ()->int { 1 }
	 * 
	 * Aggiungo la possibilt�� di controllare 2 arrowtype tra di loro quando
	 * capita, si veda il typecheck dell'arrowtype con parametro.
	 */

	if (n1.getNodeType() == NodeType.ARROWTYPE_NODE && n2.getNodeType() == NodeType.ARROWTYPE_NODE) {
	    return ((ArrowTypeNode) n1).typeCheck(
		    ((ArrowTypeNode) n2).getParTypes()).equals(
		    ((ArrowTypeNode) n2).getRetType().typeCheck());
	} else if (n1.typeCheck().equals(n2.typeCheck())
		|| n1.typeCheck() == EMPTY || n2.typeCheck() == EMPTY)
	    return true;
	return false;
    }

    public static void addFunctionCode(String code) {
	functionCode += code;
    }

    public static String getFunctionCode() {
	return functionCode;
    }
}
