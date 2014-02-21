package highLevelLanguage.Node;

public class ParamNode extends Node {

    private String paramName;
    private Node paramType;
    private Node paramGenericType;

    public ParamNode(String string, Node t1) {
	paramName = string;
	paramType = t1;
    }

    public ParamNode(String name) {
	this.paramName = name;
    }

    public void addType(Node paramType) {
	this.paramType = paramType;
    }

    public void addGenericType(Node genericType) {
	this.paramGenericType = genericType;
    }

    public Node getType() {
	return this.paramType;
    }

    @Override
    public String toPrint() {

	String parTypeToPrint = "null";

	if (paramType != null) {
	    parTypeToPrint = paramType.toPrint();
	}

	return "<ParamNode>" + "<ParamName>" + paramName
		+ "</ParamName><ParamType>" + parTypeToPrint
		+ "</ParamType></ParamNode>";
    }

    @Override
    public String typeCheck() {
	return paramType.typeCheck();
    }

    @Override
    public String codeGen() {
	return null;
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.PARAM_NODE;
    }

}
