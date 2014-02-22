package highLevelLanguage.Node;

public class GenericListParamTypeNode extends Node {

    private String genericTypeID;

    public GenericListParamTypeNode(String id) {
	this.genericTypeID = id;
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
	return NodeType.GENERICLISTPARAMTYPE_NODE;
    }

}
