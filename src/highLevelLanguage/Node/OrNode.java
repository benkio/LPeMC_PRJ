package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class OrNode extends Node {

    private Node left;
    private Node right;

    public OrNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<OrNode><OrNodeLeft>" + left.toPrint()
		+ "</OrNodeLeft><OrNodeRight>" + right.toPrint()
		+ "</OrNodeRight></OrNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (MiniFunLib.isCompatible(left, right))
	    return MiniFunLib.BOOL;
	else if (MiniFunLib.isCompatible(right, left))
	    return MiniFunLib.BOOL;

	System.out.println("TypeCheck Error: Or operands are incompatible: "
		+ left.typeCheck() + ", " + right.typeCheck()
		+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String trueLabel = "TRUELabel" + MiniFunLib.getLabIndex();
	String falseLabel = "FALSELabel" + MiniFunLib.getLabIndex();

	// TODO Auto-generated method stub
	return left.codeGen() + VMCommands.push.name() + " " + MiniFunLib.TRUE
		+ "\n" + VMCommands.beq.name() + " " + trueLabel + "\n"
		+ right.codeGen() + VMCommands.push.name() + " "
		+ MiniFunLib.TRUE + "\n" + VMCommands.beq.name() + " "
		+ trueLabel + "\n" + VMCommands.push.name() + " "
		+ MiniFunLib.FALSE + "\n" + VMCommands.b.name() + " "
		+ falseLabel + "\n" + trueLabel + ": \n"
		+ VMCommands.push.name() + " " + MiniFunLib.TRUE + "\n"
		+ falseLabel + ": \n";
    }
}
