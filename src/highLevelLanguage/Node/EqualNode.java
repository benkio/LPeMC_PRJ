package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class EqualNode extends Node {

    /* From the factor of the plus operation */
    private Node right;
    private Node left;

    public EqualNode(Node left, Node right) {
	this.left = left;
	this.right = right;
    }

    @Override
    public String toPrint() {
	return "<EqualNode><LeftEqualNode>" + left.toPrint()
		+ "</LeftEqualNode><RightEqualNode>" + right.toPrint()
		+ "</RightEqualNode></EqualNode>";
    }

    @Override
    public String typeCheck() {
	if (MiniFunLib.isCompatible(left, right))
	    return MiniFunLib.BOOL;
	else if (MiniFunLib.isCompatible(right, left))
	    return MiniFunLib.BOOL;

	System.out
		.println("Equalnode TypeCheck Error: Equal operands are incompatible: "
			+ left.typeCheck()
			+ ", "
			+ right.typeCheck()
			+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String EQLabel = "EQLabel" + MiniFunLib.getLabIndex();
	String NEQLabel = "NEQLabel" + MiniFunLib.getLabIndex();

	return left.codeGen() + right.codeGen() + VMCommands.BEQ + " "
		+ EQLabel + " \n" + VMCommands.PUSH + " " + MiniFunLib.FALSE
		+ " \n" + VMCommands.B + " " + NEQLabel + " \n" + EQLabel
		+ " : \n" + VMCommands.PUSH + " " + MiniFunLib.TRUE + " \n"
		+ NEQLabel + " : \n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.EQUAL_NODE;
    }

}
