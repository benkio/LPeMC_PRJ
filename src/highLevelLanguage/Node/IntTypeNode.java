package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class IntTypeNode extends Node {

    public IntTypeNode() {
	// TODO Auto-generated constructor stub
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<IntTypeNode></IntTypeNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return MiniFunLib.INT;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return "";
    }

}
