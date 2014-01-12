package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

public class EqualNode extends Node {

    /* From the factor of the plus operation */
    private Node right;
    private Node left;

    public EqualNode(Node left, Node right) {
	// TODO Auto-generated constructor stub
	this.left = left;
	this.right = right;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<EqualNode><LeftEqualNode>" + left.toPrint()
		+ "</LeftEqualNode><RightEqualNode>" + right.toPrint()
		+ "</RightEqualNode></EqualNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (MiniFunLib.isCompatible(left, right))
	    return MiniFunLib.BOOL;
	else if (MiniFunLib.isCompatible(right, left))
	    return MiniFunLib.BOOL;

	System.out.println("TypeCheck Error: Equal operands are incompatible: "
		+ left.typeCheck() + ", " + right.typeCheck()
		+ ".Shutdown parser");
	System.exit(0);
	return "";
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	String EQLabel = "EQLabel" + MiniFunLib.getLabIndex();
	String NEQLabel = "NEQLabel" + MiniFunLib.getLabIndex();

	return left.codeGen() + right.codeGen() + VMCommands.beq.name() + " "
		+ EQLabel + " \n" + VMCommands.push.name() + " "
		+ MiniFunLib.FALSE + " \n" + VMCommands.b.name() + " "
		+ NEQLabel + " \n" + EQLabel + " : \n" + VMCommands.push.name()
		+ " " + MiniFunLib.TRUE + " \n" + NEQLabel + " : \n";
    }

}
