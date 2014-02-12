package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.VMCommands;

public class VarNode extends Node {

	private STentry simbleSTentry;
	private int diffNesting;

	public VarNode(STentry symbleTableEntry, int diffNesting) {

		this.simbleSTentry = symbleTableEntry;
		this.diffNesting = diffNesting;
	}

	@Override
	public String toPrint() {

		return "<VarNode>" + simbleSTentry.toPrint() + "</VarNode>";
	}

	@Override
	public String typeCheck() {

		if (simbleSTentry.getNode() instanceof DecVarNode
				|| simbleSTentry.getNode() instanceof ParamNode)
			return simbleSTentry.getNode().typeCheck();
		else {
			System.exit(0);
			return "";
		}
	}

	@Override
	public String codeGen() {

		// Devo scorrere attrvareso gli access link per recuperare l'activation
		// record del
		// padre sintattico
		// Della funzione da chiamare
		String lookupAL = "";
		for (int i = 0; i < diffNesting; i++)
			lookupAL += VMCommands.LW + "\n";


		return 	VMCommands.LFP+ "\n" + 
				lookupAL + 
				VMCommands.PUSH+ " " + simbleSTentry.getOffSet() + "\n"+ 
				VMCommands.SUB + "\n" + 
				VMCommands.LW + "\n";
	}

	@Override
	public NodeType getNodeType() {
		// TODO Auto-generated method stub
		return null;
	}
}
