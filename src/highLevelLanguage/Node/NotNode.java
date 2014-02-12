package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class NotNode extends Node {

	private Node exp;

	public NotNode(Node e) {
		exp = e;
	}

	@Override
	public String toPrint() {

		return "<NotNode>" + exp.toPrint() + "</NotNode>";
	}

	@Override
	public String typeCheck() {

		if (MiniFunLib.isCompatible(exp, new BoolTypeNode()))
			return MiniFunLib.BOOL;

		System.out.println("TypeCheck Error: Not operand are incompatible: "
				+ exp.typeCheck() + ".Shutdown parser");
		System.exit(0);
		return "";
	}

	@Override
	public String codeGen() {
		String notLabel = "NotLabel" + MiniFunLib.getLabIndex();
		String continueLabel = "FALSELabel" + MiniFunLib.getLabIndex();

		return exp.codeGen() + VMCommands.PUSH + " " + MiniFunLib.FALSE
				+ "\n " + VMCommands.BEQ + " " + notLabel + "\n "
				+ VMCommands.PUSH + " " + MiniFunLib.FALSE + "\n "
				+ VMCommands.B + " " + continueLabel + "\n " + notLabel
				+ ": \n" + VMCommands.PUSH + " " + MiniFunLib.TRUE
				+ "\n " + continueLabel + ": \n";
	}

}
