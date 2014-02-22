package highLevelLanguage.Node;

import java.util.ArrayList;

public class ConcreteGenericTypeNode extends Node {

    private ArrayList<Node> types;

    public ConcreteGenericTypeNode() {
	this.types = new ArrayList<>();
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return null;
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
