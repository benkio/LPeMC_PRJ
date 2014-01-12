package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class ProgNode extends Node {

	private ArrayList<Node> decList;
	private Node expression;

	public ProgNode(ArrayList<Node> decList, Node espression) {

		this.decList = decList;
		this.expression = espression;
	}

	@Override
	public String toPrint() {
		// TODO Auto-generated method stub

		String decListPrint = "<DecList>";

		for (Node n : decList) {
			decListPrint += n.toPrint();
		}
		decListPrint += "</DecList>";

		return "<ProgNode>" + decListPrint + "<ProgNodeExp>"
				+ expression.toPrint() + "</ProgNodeExp></ProgNode>";
	}

	@Override
	public String typeCheck() {
		// TODO Auto-generated method stub
		for (Node n : decList)
			n.typeCheck();

		return expression.typeCheck();
	}

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub
		String code = "";
		for (Node n : decList)
			code += n.codeGen();

		code += expression.codeGen() + VMCommands.halt.name() + "\n"
				+ MiniFunLib.getFunctionCode();
		return code;
	}

}
