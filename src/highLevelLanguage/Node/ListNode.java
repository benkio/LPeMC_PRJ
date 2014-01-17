package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

/**
 * @author benkio
 *
 */
/**
 * @author benkio
 *
 */
/**
 * @author benkio
 *
 */
/**
 * @author benkio
 * 
 */
public class ListNode extends Node {

    private Node first;
    private Node rest;

    public ListNode(Node first, Node rest) {
	// TODO Auto-generated constructor stub
	this.first = first;
	this.rest = rest;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<ListNode>" + first.toPrint() + rest.toPrint() + "</ListNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (MiniFunLib.isCompatible(first, rest))
	    if (first.typeCheck() == MiniFunLib.EMPTY)
		return rest.typeCheck();
	    else
		return first.typeCheck();

	System.out.println("TypeCheck Error: List operands are incompatible: "
		+ first.typeCheck() + ", " + rest.typeCheck()
		+ ".Shutdown parser");
	System.exit(0);
	return "";

    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return first.codeGen() + rest.codeGen() + VMCommands.push.name()
		+ " 1\n" + VMCommands.lhp.name() + "\n" + VMCommands.add.name()
		+ "\n" + VMCommands.sw.name() + "\n" + VMCommands.lhp.name()
		+ "\n" + VMCommands.sw.name() + "\n" + VMCommands.lhp.name()
		+ "\n" + VMCommands.push.name() + " 2\n"
		+ VMCommands.lhp.name() + "\n" + VMCommands.add.name() + "\n"
		+ VMCommands.shp.name() + "\n";
    }

    /*
     * Properties for get the parts of a list
     */

    /**
     * @return First node
     */
    public Node getFirst() {
	return first;
    }

    /**
     * @return Rest Node
     */
    public Node getRest() {
	return first;
    }
}
