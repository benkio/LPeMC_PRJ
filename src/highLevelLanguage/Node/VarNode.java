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
	if (simbleSTentry.getNode().getNodeType() == NodeType.DECVAR_NODE
		|| simbleSTentry.getNode().getNodeType() == NodeType.PARAM_NODE) {
	    /*
	     * Aggiungo questo controllo perchè se una funzione passata per
	     * parametro, e quindi paramNode viene poi usata come variabile
	     * allora devo sollevare un errore.
	     */
	    if (simbleSTentry.getNode().getNodeType() == NodeType.PARAM_NODE) {
		if (((ParamNode) simbleSTentry.getNode()).getType()
			.getNodeType() == NodeType.ARROWTYPE_NODE) {
		    System.out
			    .println("VarNode Typecheck error: Function Used as a Variable");
		    System.exit(0);
		    return "";
		} else
		    return simbleSTentry.getNode().typeCheck();
	    } else
		return simbleSTentry.getNode().typeCheck();
	} else {
	    System.out.println("Varnode Typecheck error: Wrong STentry");
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

	return VMCommands.LFP + "\n" + lookupAL + VMCommands.PUSH + " "
		+ simbleSTentry.getOffSet() + "\n" + VMCommands.SUB + "\n"
		+ VMCommands.LW + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.VAR_NODE;
    }
}
