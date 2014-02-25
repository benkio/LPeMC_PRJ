package highLevelLanguage.Node;

public class ConcreteListParamTypeNode extends Node {

    private Node baseType;

    public ConcreteListParamTypeNode(Node baseType) {
	this.baseType = baseType;
    }

    @Override
    public String toPrint() {
	return "<ConcreteListParamTypeNode>" + baseType.toPrint()
		+ "</ConcreteListParamTypeNode>";
    }

    @Override
    public String typeCheck() {
	return baseType.typeCheck();
    }

    @Override
    public String codeGen() {
	return "";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.CONCRETELISTPARAMTYPE_NODE;
    }

}
