package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.VMCommands;

public class VarNode extends Node {

    private STentry simbleSTentry;
    private int diffNesting;

    public VarNode(STentry symbleTableEntry, int diffNesting) {
	// TODO Auto-generated constructor stub
	this.simbleSTentry = symbleTableEntry;
	this.diffNesting = diffNesting;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<VarNode>" + simbleSTentry.toPrint() + "</VarNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
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
	    lookupAL += VMCommands.lw.name() + "\n";

	// TODO Auto-generated method stub
	return VMCommands.lfp.name() + "\n" + lookupAL + VMCommands.push.name()
		+ " " + simbleSTentry.getOffSet() + "\n"
		+ VMCommands.sub.name() + "\n" + VMCommands.lw.name() + "\n";
    }
}
