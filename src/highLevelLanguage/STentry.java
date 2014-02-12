package highLevelLanguage;

import highLevelLanguage.Node.Node;

public class STentry {

	private Node node;
	private int offSet;

	public STentry(Node node, int offSet) {
		this.node = node;
		this.offSet = offSet;
	}

	public String toPrint() {
		return node.toPrint();
	}

	public Node getNode() {
		return node;
	}

	public int getOffSet() {
		return offSet;
	}
	
	

}
