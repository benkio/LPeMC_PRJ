package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.VMCommands;

/**
 * Nodo che rappresenta una fuzione passata come parametro
 *
 */
public class FunParNode extends Node {

	private STentry entry;
	private int diffNesting;
	
	public FunParNode(STentry entry, int diffNesting){
		this.entry = entry;
		this.diffNesting = diffNesting;
	}
	
	@Override
	public String toPrint() {
		return "<FunParNode>" + entry.toPrint() + "</FunParNode>";
	}

	@Override
	public String typeCheck() {
		return entry.getNode().typeCheck();
	}

	@Override
	public String codeGen() {
		String lookupAL = "";
		for (int i = 0; i < diffNesting; i++)
			lookupAL += VMCommands.LW + "\n";

		//Implementazione della Chisura <IndCodFunz,AL>
		return 	//Scorro AL per recuperare codice della funzione
				VMCommands.LFP+ "\n" + 
				lookupAL + 
				VMCommands.PUSH+ " " + entry.getOffSet() + "\n"+ 
				VMCommands.SUB + "\n" + 
				VMCommands.LW + "\n" + 
				
				//L' AL da passare è quello del padre sintattico 
				VMCommands.LFP+ "\n"+
				lookupAL;
	}

	@Override
	public NodeType getNodeType() {
		// TODO Auto-generated method stub
		return null;
	}

}
