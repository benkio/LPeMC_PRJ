package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

import java.util.ArrayList;

public class ArrowTypeNode extends Node {

    private Node returnType;
    private ArrayList<Node> parTypes;

    public ArrowTypeNode() {
	this.parTypes = new ArrayList<Node>();
    }

    @Override
    public String toPrint() {
	String parString = "";

	for (int cont = 0; cont < parTypes.size(); cont++)
	    parString += "<ParType>" + parTypes.get(cont).toPrint()
		    + "</ParType>";
	return "<ArrowTypeNode>" + parString + "<ReturnType>"
		+ returnType.toPrint() + "</ReturnType>" + "</ArrowTypeNode>";
    }

    @Override
    public String typeCheck() {
	return returnType.typeCheck();
    }

    @Override
    public String codeGen() {
	return null;
    }

    public Node getRetType() {
	return this.returnType;
    }

    public Node getParType(int index) {
	if (index >= parTypes.size())
	    return null;

	return parTypes.get(index);
    }

    public void addParType(Node t) {
	this.parTypes.add(t);
    }

    public void addRetType(Node t) {
	this.returnType = t;
    }

    public int getNPar() {
	return this.parTypes.size();
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.ARROWTYPE_NODE;
    }

    public ArrayList<Node> getParTypes() {
	return this.parTypes;
    }

    public String typeCheck(ArrayList<Node> parTypes2) {
	// Controllo la correttezza dei parametri tra quelli dell'arrowtype con
	// quelli in ingresso
	if (this.parTypes.size() != parTypes2.size()) {
	    System.out
		    .println("ArrowTypes Typecheck Error: Wrong Number of Parameters!");
	    System.exit(0);
	} else {
	    for (int i = 0; i < parTypes.size(); i++) {
		if (!MiniFunLib.isCompatible(parTypes.get(i), parTypes2.get(i))) {
		    System.out
			    .println("ArrowTypes Typecheck Error: Wrong Type of Parameters!");
		    System.exit(0);
		}
	    }
	}
	// Restituisco il valore del parametro di ritorno
	return this.returnType.typeCheck();
    }
}
