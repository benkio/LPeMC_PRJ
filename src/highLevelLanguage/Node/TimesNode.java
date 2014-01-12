package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class TimesNode extends Node {

    private Node left;
    private Node right;

    public TimesNode(Node left, Node right) {
	// TODO Auto-generated constructor stub
	this.left = left;
	this.right = right;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<TimesNode><TimesNodeLeft>" + left.toPrint()
		+ "</TimesNodeLeft><TimesNodeRight>" + right.toPrint()
		+ "</TimesNodeRight></TimesNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.INT;

	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return left.codeGen() + right.codeGen() + VMCommands.mult.name() + "\n";
    }

}
