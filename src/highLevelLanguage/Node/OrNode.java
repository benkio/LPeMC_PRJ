package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class OrNode extends Node {

	private Node left;
	private Node right;

	public OrNode(Node l, Node r) {
		left = l;
		right = r;
	}

	@Override
	public String toPrint() {

		return "<OrNode><OrNodeLeft>" + left.toPrint()
				+ "</OrNodeLeft><OrNodeRight>" + right.toPrint()
				+ "</OrNodeRight></OrNode>";
	}

	@Override
	public String typeCheck() {

		if ((MiniFunLib.isCompatible(left, new BoolTypeNode()))
				&& (MiniFunLib.isCompatible(right, new BoolTypeNode())))
			return MiniFunLib.BOOL;

		System.out.println("TypeCheck Error: Or operands are incompatible: "
				+ left.typeCheck() + ", " + right.typeCheck()
				+ ".Shutdown parser");
		System.exit(0);
		return "";
	}

	@Override
	public String codeGen() {
		String trueLabel = "TRUELabel" + MiniFunLib.getLabIndex();
		String falseLabel = "FALSELabel" + MiniFunLib.getLabIndex();


		return left.codeGen() + VMCommands.PUSH + " " + MiniFunLib.TRUE
				+ "\n" + VMCommands.BEQ + " " + trueLabel + "\n"
				+ right.codeGen() + VMCommands.PUSH + " "
				+ MiniFunLib.TRUE + "\n" + VMCommands.BEQ + " "
				+ trueLabel + "\n" + VMCommands.PUSH + " "
				+ MiniFunLib.FALSE + "\n" + VMCommands.B + " "
				+ falseLabel + "\n" + trueLabel + ": \n"
				+ VMCommands.PUSH + " " + MiniFunLib.TRUE + "\n"
				+ falseLabel + ": \n";
	}
}
