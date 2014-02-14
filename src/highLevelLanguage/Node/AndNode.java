package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class AndNode extends Node {

    private Node left;
    private Node right;

    public AndNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	return "<AndNode><AndNodeLeft>" + left.toPrint()
		+ "</AndNodeLeft><AndNodeRight>" + right.toPrint()
		+ "</AndNodeRight></AndNode>";
    }

    @Override
    public String typeCheck() {
	if ((MiniFunLib.isCompatible(left, new BoolTypeNode()))
		&& (MiniFunLib.isCompatible(right, new BoolTypeNode())))
	    return MiniFunLib.BOOL;

	System.out
		.println("Andnode TypeCheck Error: And operands are incompatible: "
			+ left.typeCheck()
			+ ", "
			+ right.typeCheck()
			+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String trueLabel = "TRUELabel" + MiniFunLib.getLabIndex();
	String falseLabel = "FALSELabel" + MiniFunLib.getLabIndex();

	return left.codeGen() + VMCommands.PUSH + " " + MiniFunLib.FALSE
		+ "\n " + VMCommands.BEQ + " " + falseLabel + "\n "
		+ right.codeGen() + VMCommands.PUSH + " " + MiniFunLib.FALSE
		+ "\n " + VMCommands.BEQ + " " + falseLabel + "\n "
		+ VMCommands.PUSH + " " + MiniFunLib.TRUE + "\n "
		+ VMCommands.B + " " + trueLabel + "\n " + falseLabel + ": \n"
		+ VMCommands.PUSH + " " + MiniFunLib.FALSE + "\n " + trueLabel
		+ ": \n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.ANDTYPE_NODE;
    }

}
