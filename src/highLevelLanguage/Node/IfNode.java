package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class IfNode extends Node {

    private Node condition;
    private Node thenBranch;
    private Node elseBranch;

    public IfNode(Node condition, Node leftBranch, Node rightBranch) {
	// TODO Auto-generated constructor stub
	this.condition = condition;
	this.thenBranch = leftBranch;
	this.elseBranch = rightBranch;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<IfNode><IfNodeCondition>" + condition.toPrint()
		+ "</IfNodeCondition><IfNodeThenBranch>" + thenBranch.toPrint()
		+ "</IfNodeThenBranch><IfNodeElseBranch>"
		+ elseBranch.toPrint() + "</IfNodeElseBranch></IfNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (MiniFunLib.isCompatible(condition, new BoolTypeNode()))
	    if (MiniFunLib.isCompatible(thenBranch, elseBranch))
		return elseBranch.typeCheck();
	    else if (MiniFunLib.isCompatible(elseBranch, thenBranch))
		return thenBranch.typeCheck();
	System.exit(0);
	return "";

    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	String ELSELabel = "ELSELabel" + MiniFunLib.getLabIndex();
	String ENDIFLabel = "ENDIFLabel" + MiniFunLib.getLabIndex();

	return condition.codeGen() + VMCommands.push.name() + " "
		+ MiniFunLib.FALSE + " \n" + VMCommands.beq.name() + " "
		+ ELSELabel + " \n" + thenBranch.codeGen()
		+ VMCommands.b.name() + " " + ENDIFLabel + " \n" + ELSELabel
		+ " : \n" + elseBranch.codeGen() + ENDIFLabel + " : \n";
    }

}
