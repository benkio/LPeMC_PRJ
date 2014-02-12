package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class RestNode extends Node {

	private static Node restBody;

	public RestNode(Node e) {

		restBody = e;
	}

	@Override
	public String toPrint() {

		return "<RestBody>" + restBody.toPrint() + "</RestBody>";
	}

	@Override
	public String typeCheck() {

		return restBody.typeCheck();
	}

	@Override
	public String codeGen() {

		return restBody.codeGen() + VMCommands.PUSH + " 1 \n"
				+ VMCommands.ADD + "\n" + VMCommands.LW + "\n";
	}

}
