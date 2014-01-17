package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class FunNode extends Node {

    private STentry funEntry;
    private int diffNesting;
    private ArrayList<Node> funParams;

    public FunNode(STentry entry, int diffNesting, ArrayList<Node> params) {
	// TODO Auto-generated constructor stub
	funEntry = entry;
	funParams = params;
	this.diffNesting = diffNesting;
    }

    @Override
    public String toPrint() {

	String funParamsToPrint = "<FunParams>";
	for (Node p : funParams) {
	    funParamsToPrint += p.toPrint();
	}
	funParamsToPrint += "</FunParams>";

	// TODO Auto-generated method stub

	// ATTENZIONE SI POTREBBE ANDARE IN LOOP!!!! FUNZIONE CHE CHIAMA SE
	// STESSA E QUINDI NON SI FINISCE? PER QUESTO INSERISCO L'OFFSET E NON
	// RICHIAMO LA FUNZIONE.
	return "<FunNode><FunDiffNesting>" + diffNesting + "</FunDiffNesting>"
		+ "<FunSTEntryOffset>" + funEntry.getOffSet()
		+ "</FunSTEntryOffset>" + funParamsToPrint + "</FunNode>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	if (funEntry.getNode() instanceof DecFunNode) {
	    ArrayList<Node> decFunNodeParams = ((DecFunNode) funEntry.getNode())
		    .getParams();
	    if (decFunNodeParams.size() == funParams.size()) {
		for (int i = 0; i < funParams.size(); i++)
		    if (!MiniFunLib.isCompatible(decFunNodeParams.get(i),
			    funParams.get(i))) {
			System.out
				.println("TypeCheck Error: decFunNodeParam and funParam are incompatible: "
					+ decFunNodeParams.get(i).typeCheck()
					+ ", "
					+ funParams.get(i).typeCheck()
					+ ".Shutdown parser");
			System.exit(0);
		    }

		// Per evitare che si abbia l'autoricorsione della funzione.
		if (((DecFunNode) funEntry.getNode()).isTypeChecked())
		    return funEntry.getNode().typeCheck();
		else
		    return ((DecFunNode) funEntry.getNode()).getFunType()
			    .typeCheck();
	    }

	    System.out
		    .println("TypeCheck Error: wrong function parameter number: "
			    + decFunNodeParams.size()
			    + ", "
			    + funParams.size()
			    + ".Shutdown parser");
	    System.exit(0);
	    return "";
	} else {
	    System.out
		    .println("TypeCheck Error: Function node without DecFunNode"
			    + ".Shutdown parser");
	    System.exit(0);
	    return "";
	}
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	// Costruisco l'activation link

	String parCode = "";
	String lookupAL = "";

	// Mi creo il codice per far in modo di caricare i parametri al
	// contrario sullo stack

	for (int i = funParams.size() - 1; i >= 0; i--) {
	    parCode += (funParams.get(i)).codeGen();
	}

	// Devo scorrere attrvareso gli access link per recuperare l'activation
	// record del
	// padre sintattico
	// Della funzione da chiamare

	for (int i = 0; i < diffNesting; i++)
	    lookupAL += VMCommands.lw.name() + "\n";

	return VMCommands.lfp.name()
		+ "\n"
		+ // Ho messo il control link
		parCode
		+ // Metto il valore dei parametri

		VMCommands.lfp.name()
		+ "\n"
		+ // Metto l'access Link del padre sintattico
		lookupAL
		+ // Cerca l'activation Record del padre sintattico della
		  // funzione.

		// Andare a cercare la locazione di memoria su cui fare il jump,
		// dove st� la mia funzione
		// Vado a vedere a che livello �, poi vado a prendere l'offset
		// della funzione e li devo saltare

		// Mi sposto al padre sintattico

		// Ricarico di nuovo il frame pointer,
		// cos� posso sottrarci l'offset della funzione
		VMCommands.lfp.name()
		+ "\n"
		+ lookupAL
		+
		// trovo l'indirizzo di ritorno della funzione.
		// Del tutto simile a quando si carica una variabile
		VMCommands.push.name() + " " + funEntry.getOffSet() + "\n"
		+ VMCommands.sub.name() + "\n" + VMCommands.lw.name() + "\n"
		+ VMCommands.js.name() + "\n";
    }
}
