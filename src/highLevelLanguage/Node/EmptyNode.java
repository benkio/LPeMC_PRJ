package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class EmptyNode extends Node {

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<EmptyNode />";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	// return MiniFunLib.EMPTYTYPE;
	return MiniFunLib.EMPTY;
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return VMCommands.push.name() + " " + MiniFunLib.NULLPOINTER + "\n";
    }

}
