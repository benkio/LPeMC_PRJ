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
		if(n1.getNodeType() == NodeType.ARROWTYPE_NODE){
			if(n2.getNodeType() != NodeType.ARROWTYPE_NODE) return false;
			
			ArrowTypeNode p1 = (ArrowTypeNode) n1;
			ArrowTypeNode p2 = (ArrowTypeNode) n2;
			
			if(p1.getNPar() == p2.getNPar() ){
				
				if(MiniFunLib.isCompatible(p1.getRetType(), p2.getRetType())){
					for(int cont=0; cont<= p1.getNPar();cont++){
						if(!MiniFunLib.isCompatible(p1.getParType(cont), p2.getParType(cont))){
							return false;
						}
					}
					return true;
				}
				else{
					return false;
				}
			}
			else{
				return false;
			}
		}
		if (n1.typeCheck().equals(n2.typeCheck()) || n1.typeCheck() == EMPTY || n2.typeCheck() == EMPTY)
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
