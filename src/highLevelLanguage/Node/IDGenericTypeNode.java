package highLevelLanguage.Node;

public class IDGenericTypeNode extends Node {

    private String id;

    public IDGenericTypeNode(String id) {
	this.id = id;
    }

    public String getID() {
	return id;
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
	return NodeType.IDGENERICTYPE_NODE;
    }

}
