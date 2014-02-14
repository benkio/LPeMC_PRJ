package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class DecVarNode extends Node {

    private String varName;
    private Node varType;
    private Node value;
    private boolean typeChecked;
    private String typeString;

    public DecVarNode(String varName, Node varType, Node value) {
	this.varName = varName;
	this.varType = varType;
	this.value = value;
	this.typeChecked = false;
	this.typeString = "";
    }

    @Override
    public String toPrint() {
	return "<DecVarNode>" + "<VarName>" + varName + "</VarName><VarType>"
		+ varType.toPrint() + "</VarType><VarValue>" + value.toPrint()
		+ "</VarValue>" + "</DecVarNode>";
    }

    @Override
    public String typeCheck() {
	if (!typeChecked) {
	    if (MiniFunLib.isCompatible(value, varType)) {
		typeChecked = true;
		typeString = varType.typeCheck();
	    } else {
		System.out
			.println("Decvarnode Typecheck error: value of variable incompatible");
		System.exit(0);
	    }
	}
	return typeString;
    }

    @Override
    public String codeGen() {
	return value.codeGen();

    }

    @Override
    public NodeType getNodeType() {
	return NodeType.DECVAR_NODE;
    }

}
