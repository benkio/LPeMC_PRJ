package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class BoolTypeNode extends Node {

    public BoolTypeNode() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<BoolTypeNode></BoolTypeNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return MiniFunLib.BOOL;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return "";
    }

	@Override
	public NodeType getNodeType() {
		return NodeType.BOOLTYPE_NODE;
	}

}
