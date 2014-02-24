package highLevelLanguage.Node;

public class GenericListParamTypeNode extends Node {

    private Node genericTypeID;

    public GenericListParamTypeNode(Node i) {
	this.genericTypeID = i;
    }

    @Override
    public String toPrint() {
	return "<GenericListParamTypeNode>" + genericTypeID.toPrint()
		+ "</GenericListParamTypeNode>";
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
