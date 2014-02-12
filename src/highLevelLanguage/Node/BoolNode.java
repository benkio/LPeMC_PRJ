package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class BoolNode extends Node {

    private boolean value;

    public BoolNode(boolean value) {
	// TODO Auto-generated constructor stub
	this.value = value;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<BoolNode>" + value + "</BoolNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return MiniFunLib.BOOL;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	if (value)
	    return VMCommands.PUSH + " " + MiniFunLib.TRUE + " \n";
	return VMCommands.PUSH + " " + MiniFunLib.FALSE + " \n";
    }

}
