package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class DivNode extends Node {

    private Node left;
    private Node right;

    public DivNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<DivNode><DivNodeLeft>" + left.toPrint()
		+ "</DivNodeLeft><DivNodeRight>" + right.toPrint()
		+ "</DivNodeRight></DivNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.INT;

	System.out.println("TypeCheck Error: Div operands are incompatible: "
		+ left.typeCheck() + ", " + right.typeCheck()
		+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return left.codeGen() + right.codeGen() + VMCommands.div.name() + "\n";
    }

}
