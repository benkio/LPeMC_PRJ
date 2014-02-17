package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class BoolNode extends Node {

    private boolean value;

    public BoolNode(boolean value) {
	this.value = value;
    }

    @Override
    public String toPrint() {
	return "<BoolNode>" + value + "</BoolNode>";
    }

    @Override
    public String typeCheck() {
	return MiniFunLib.BOOL;
    }

    @Override
    public String codeGen() {
	if (value)
	    return VMCommands.PUSH + " " + MiniFunLib.TRUE + " \n";
	return VMCommands.PUSH + " " + MiniFunLib.FALSE + " \n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.BOOLTYPE_NODE;
    }

}
