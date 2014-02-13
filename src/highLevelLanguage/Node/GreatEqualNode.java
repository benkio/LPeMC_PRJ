package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class GreatEqualNode extends Node {

    private Node left;
    private Node right;

    public GreatEqualNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<GreatEqualNode><GreatEqualNodeLeft>" + left.toPrint()
		+ "</GreatEqualNodeLeft><GreatEqualNodeRight>"
		+ right.toPrint() + "</GreatEqualNodeRight></GreatEqualNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.BOOL;

	System.out
		.println("TypeCheck Error: GreatEqual operands are incompatible: "
			+ left.typeCheck()
			+ ", "
			+ right.typeCheck()
			+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	String GEQLabel = "GEQLabel" + MiniFunLib.getLabIndex();
	String ContinueLabel = "ContinueLabel" + MiniFunLib.getLabIndex();
	// TODO Auto-generated method stub
	return left.codeGen() + right.codeGen() + VMCommands.BGREAT
		+ " " + GEQLabel + "\n " + VMCommands.PUSH + " "
		+ MiniFunLib.FALSE + "\n " + VMCommands.B + " "
		+ ContinueLabel + "\n " + GEQLabel + ": \n"
		+ VMCommands.PUSH + " " + MiniFunLib.TRUE + "\n "
		+ ContinueLabel + ": \n";
    }

	@Override
	public NodeType getNodeType() {
		// TODO Auto-generated method stub
		return null;
	}

}
