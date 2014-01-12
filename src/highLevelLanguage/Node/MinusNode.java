package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class MinusNode extends Node {

    private Node left;
    private Node right;

    public MinusNode(Node l, Node r) {
	left = l;
	right = r;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<MinusNode><MinusNodeLeft>" + left.toPrint()
		+ "</MinusNodeLeft><MinusNodeRight>" + right.toPrint()
		+ "</MinusNodeRight></MinusNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
		&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
	    return MiniFunLib.INT;

	System.out
		.println("TypeCheck Error: Minus operands are incompatible, shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return left.codeGen() + right.codeGen() + VMCommands.sub.name() + "\n";
    }

}
