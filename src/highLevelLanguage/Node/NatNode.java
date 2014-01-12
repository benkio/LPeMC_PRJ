package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class NatNode extends Node {

    private int value;

    public NatNode(int value) {
	// TODO Auto-generated constructor stub
	this.value = value;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<NatNode>" + value + "</NatNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return MiniFunLib.INT;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return VMCommands.push.name() + " " + value + "\n";
    }

}
