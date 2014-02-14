package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class BoolTypeNode extends Node {

    public BoolTypeNode() {
    }

    @Override
    public String toPrint() {
	return "<BoolTypeNode/>";
    }

    @Override
    public String typeCheck() {
	return MiniFunLib.BOOL;
    }

    @Override
    public String codeGen() {
	return "";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.BOOLTYPE_NODE;
    }

}
