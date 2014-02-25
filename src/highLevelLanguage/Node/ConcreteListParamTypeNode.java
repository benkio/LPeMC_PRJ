package highLevelLanguage.Node;

public class ConcreteListParamTypeNode extends ListTypeNode {

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
		return NodeType.CONCRETELISTPARAMTYPE_NODE;
	}

}
