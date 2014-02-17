package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class NatNode extends Node {

    private int value;

    public NatNode(int value) {
	this.value = value;
    }

    @Override
    public String toPrint() {
	return "<NatNode>" + value + "</NatNode>";
    }

    @Override
    public String typeCheck() {
	return MiniFunLib.INT;
    }

    @Override
    public String codeGen() {
	return VMCommands.PUSH + " " + value + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.NAT_NODE;
    }

}
