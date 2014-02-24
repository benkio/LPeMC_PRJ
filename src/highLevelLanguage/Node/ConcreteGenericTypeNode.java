package highLevelLanguage.Node;

import java.util.ArrayList;

public class ConcreteGenericTypeNode extends Node {

    private ArrayList<Node> types;

    public ConcreteGenericTypeNode(Node bt) {
	this.types = new ArrayList<>();
	types.add(bt);
    }

    @Override
    public String toPrint() {
	String typesToString = "";
	for (int i = 0; i < types.size(); i++) {
	    typesToString += "<ConcreteGenericTypeNode" + i + ">"
		    + types.get(i).toPrint() + "</ConcreteGenericTypeNode" + i
		    + "> ";
	}

	return "<ConcreteGenericTypeNode> " + typesToString
		+ "</ConcreteGenericTypeNode> ";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.CONCRETEGENERICTYPE_NODE;
    }

    public void addType(Node bt) {
	this.types.add(bt);

    }

}
