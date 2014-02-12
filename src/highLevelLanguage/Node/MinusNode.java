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
		return "<MinusNode><MinusNodeLeft>" + left.toPrint()
				+ "</MinusNodeLeft><MinusNodeRight>" + right.toPrint()
				+ "</MinusNodeRight></MinusNode>";
	}

	@Override
	public String typeCheck() {
		if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
				&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
			return MiniFunLib.INT;

		System.out.println("TypeCheck Error: Minus operands are incompatible: "
				+ left.typeCheck() + ", " + right.typeCheck()
				+ ".Shutdown parser");
		System.exit(0);
		return "";
	}

	@Override
	public String codeGen() {
		return left.codeGen() + right.codeGen() + VMCommands.SUB + "\n";
	}

}
