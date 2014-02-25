package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class ListNode extends Node {

	private Node first;
	private Node rest;

	public ListNode(Node first, Node rest) {
		this.first = first;
		this.rest = rest;
	}

	@Override
	public String toPrint() {
		return "<ListNode>" + first.toPrint() + rest.toPrint() + "</ListNode>";
	}

	@Override
	public String typeCheck() {
		if (MiniFunLib.isCompatible(first, rest))
			if (first.typeCheck() == MiniFunLib.EMPTY)
				return rest.typeCheck();
			else
				return first.typeCheck();

		System.out
		.println("Listnode TypeCheck Error: List operands are incompatible: "
				+ first.typeCheck()
				+ ", "
				+ rest.typeCheck()
				+ ".Shutdown parser");
		System.exit(0);
		return "";

	}

	@Override
	public String codeGen() {
		return first.codeGen() + rest.codeGen() + VMCommands.PUSH + " 1\n"
				+ VMCommands.LHP + "\n" + VMCommands.ADD + "\n" + VMCommands.SW
				+ "\n" + VMCommands.LHP + "\n" + VMCommands.SW + "\n"
				+ VMCommands.LHP + "\n" + VMCommands.PUSH + " 2\n"
				+ VMCommands.LHP + "\n" + VMCommands.ADD + "\n"
				+ VMCommands.SHP + "\n";
	}

	/*
	 * Properties for get the parts of a list
	 */

	/**
	 * @return First node
	 */
	public Node getFirst() {
		return first;
	}

	/**
	 * @return Rest Node
	 */
	public Node getRest() {
		return first;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.LIST_NODE;
	}
}
