package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class PrintNode extends Node {

    private Node exp;

    public PrintNode(Node exp) {
	this.exp = exp;
    }

    @Override
    public String toPrint() {
	return "<PrintNode>" + exp.toPrint() + "</PrintNode>";
    }

    @Override
    public String typeCheck() {
	return exp.typeCheck();
    }

    @Override
    public String codeGen() {
	return exp.codeGen() + VMCommands.PRINT + "\n";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.PRINT_NODE;
    }

}
