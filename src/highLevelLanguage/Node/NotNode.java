package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class NotNode extends Node {

    private Node exp;

    public NotNode(Node e) {
	exp = e;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<NotNode>" + exp.toPrint() + "</NotNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (MiniFunLib.isCompatible(exp, new BoolTypeNode()))
	    return MiniFunLib.BOOL;

	System.out.println("TypeCheck Error: Not operand are incompatible: "
		+ exp.typeCheck() + ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String notLabel = "NotLabel" + MiniFunLib.getLabIndex();
	String continueLabel = "FALSELabel" + MiniFunLib.getLabIndex();
	// TODO Auto-generated method stub
	return exp.codeGen() + VMCommands.push.name() + " " + MiniFunLib.FALSE
		+ "\n " + VMCommands.beq.name() + " " + notLabel + "\n "
		+ VMCommands.push.name() + " " + MiniFunLib.FALSE + "\n "
		+ VMCommands.b.name() + " " + continueLabel + "\n " + notLabel
		+ ": \n" + VMCommands.push.name() + " " + MiniFunLib.TRUE
		+ "\n " + continueLabel + ": \n";
    }

}
