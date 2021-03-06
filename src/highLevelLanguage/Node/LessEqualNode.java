package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class LessEqualNode extends Node {

    private Node left;
    private Node right;

    public LessEqualNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	return "<LessEqualNode><LessEqualNodeLeft>" + left.toPrint()
		+ "</LessEqualNodeLeft><LessEqualNodeRight>" + right.toPrint()
		+ "</LessEqualNodeRight></LessEqualNode>";
    }

    @Override
    public String typeCheck() {
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.BOOL;

	System.out
		.println("Lessequalnode TypeCheck Error: LessEqual operands are incompatible: "
			+ left.typeCheck()
			+ ", "
			+ right.typeCheck()
			+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String LEQLabel = "LEQLabel" + MiniFunLib.getLabIndex();
	String ContinueLabel = "ContinueLabel" + MiniFunLib.getLabIndex();

	return left.codeGen() + right.codeGen() + VMCommands.BLESS + " "
		+ LEQLabel + "\n " + VMCommands.PUSH + " " + MiniFunLib.FALSE
		+ "\n " + VMCommands.B + " " + ContinueLabel + "\n " + LEQLabel
		+ ": \n" + VMCommands.PUSH + " " + MiniFunLib.TRUE + "\n "
		+ ContinueLabel + ": \n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.LESSEQUAL_NODE;
    }

}
