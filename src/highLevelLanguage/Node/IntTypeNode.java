package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class IntTypeNode extends Node {

    public IntTypeNode() {
    }

    @Override
    public String toPrint() {
	return "<IntTypeNode></IntTypeNode>";
    }

    @Override
    public String typeCheck() {
	return MiniFunLib.INT;
    }

    @Override
    public String codeGen() {
	return "";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.INTTYPE_NODE;
    }

}
