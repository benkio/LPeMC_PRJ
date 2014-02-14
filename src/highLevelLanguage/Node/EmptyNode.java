package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class EmptyNode extends Node {

    @Override
    public String toPrint() {
	return "<EmptyNode />";
    }

    @Override
    public String typeCheck() {
	return MiniFunLib.EMPTY;
    }

    @Override
    public String codeGen() {
	return VMCommands.PUSH + " " + MiniFunLib.NULLPOINTER + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.EMPTY_NODE;
    }

}
