package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class FirstNode extends Node {

    private static Node firstBody;

    public FirstNode(Node e) {
	// TODO Auto-generated constructor stub
	firstBody = e;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<FirstNode>" + firstBody.toPrint() + "</FirstNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return firstBody.typeCheck();
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return firstBody.codeGen() + VMCommands.LW + "\n";
    }

}
