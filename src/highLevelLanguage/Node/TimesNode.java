package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class TimesNode extends Node {

    private Node left;
    private Node right;

    public TimesNode(Node left, Node right) {
	this.left = left;
	this.right = right;
    }

    @Override
    public String toPrint() {
	return "<TimesNode><TimesNodeLeft>" + left.toPrint()
		+ "</TimesNodeLeft><TimesNodeRight>" + right.toPrint()
		+ "</TimesNodeRight></TimesNode>";
    }

    @Override
    public String typeCheck() {
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.INT;

	System.out
		.println("Timesnode TypeCheck Error: Times operands are incompatible: "
			+ left.typeCheck()
			+ ", "
			+ right.typeCheck()
			+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	return left.codeGen() + right.codeGen() + VMCommands.MULT + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.TIMES_NODE;
    }

}
