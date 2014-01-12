package highLevelLanguage.Node;

public class ParamNode extends Node {

	private String paramName;
	private Node paramType;

	public ParamNode(String string, Node t1) {
		// TODO Auto-generated constructor stub
		paramName = string;
		paramType = t1;
	}

	@Override
	public String toPrint() {
		// TODO Auto-generated method stub
		return "<ParamNode>" + "<ParamName>" + paramName
				+ "</ParamName><ParamType>" + paramType.toPrint()
				+ "</ParamType></ParamNode>";
	}

	@Override
	public String typeCheck() {
		// TODO Auto-generated method stub
		return paramType.typeCheck();
	}

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub
		return null;
	}

}
