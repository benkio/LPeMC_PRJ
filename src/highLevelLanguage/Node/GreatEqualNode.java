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
	return left.codeGen() + right.codeGen() + VMCommands.bgreat.name()
		+ " " + GEQLabel + "\n " + VMCommands.push.name() + " "
		+ MiniFunLib.FALSE + "\n " + VMCommands.b.name() + " "
		+ ContinueLabel + "\n " + GEQLabel + ": \n"
		+ VMCommands.push.name() + " " + MiniFunLib.TRUE + "\n "
		+ ContinueLabel + ": \n";
    }

}