package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class PlusNode extends Node {

	/* From the factor of the plus operation */
	private Node right;
	private Node left;

	public PlusNode(Node left, Node right) {

		this.left = left;
		this.right = right;
	}

	@Override
	public String toPrint() {

		return "<PlusNode><PlusNodeLeft>" + left.toPrint()
				+ "</PlusNodeLeft><PlusNodeRight>" + right.toPrint()
				+ "</PlusNodeRight></PlusNode>";
	}

	@Override
	public String typeCheck() {

		if ((MiniFunLib.isCompatible(left, new IntTypeNode()))
				&& (MiniFunLib.isCompatible(right, new IntTypeNode())))
			return MiniFunLib.INT;

		System.out.println("TypeCheck Error: Plus operands are incompatible: "
				+ left.typeCheck() + ", " + right.typeCheck()
				+ ".Shutdown parser");
		System.exit(0);
		return "";
	}

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub
		return left.codeGen() + right.codeGen() + VMCommands.ADD + "\n";
	}

}
