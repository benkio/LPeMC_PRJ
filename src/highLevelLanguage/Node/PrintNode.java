package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class PrintNode extends Node {

    private Node exp;

    public PrintNode(Node exp) {
	// TODO Auto-generated constructor stub
	this.exp = exp;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<PrintNode>" + exp.toPrint() + "</PrintNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return exp.typeCheck();
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return exp.codeGen() + VMCommands.print.name() + "\n";
    }

}
