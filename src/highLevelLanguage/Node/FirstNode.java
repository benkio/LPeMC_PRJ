package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class FirstNode extends Node {

    private static Node firstBody;

    public FirstNode(Node e) {
	firstBody = e;
    }

    @Override
    public String toPrint() {
	return "<FirstNode>" + firstBody.toPrint() + "</FirstNode>";
    }

    @Override
    public String typeCheck() {
	return firstBody.typeCheck();
    }

    @Override
    public String codeGen() {
	return firstBody.codeGen() + VMCommands.LW + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.FIRSTLIST_NODE;
    }

}
