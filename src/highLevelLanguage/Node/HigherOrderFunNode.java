package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class HigherOrderFunNode extends FunNode {

    public HigherOrderFunNode(STentry entry, int diffNesting,
	    ArrayList<Node> params, Node genericType) {
	super(entry, diffNesting, params, genericType);
    }

    @Override
    public String toPrint() {
	return super.toPrint();
	// String funParamsToPrint = "<FunParams>";
	// for (Node p : funParams) {
	// funParamsToPrint += p.toPrint();
	// }
	// funParamsToPrint += "</FunParams>";
	//
	// // ATTENZIONE SI POTREBBE ANDARE IN LOOP!!!! FUNZIONE CHE CHIAMA SE
	// // STESSA E QUINDI NON SI FINISCE? PER QUESTO INSERISCO L'OFFSET E
	// NON
	// // RICHIAMO LA FUNZIONE.
	// return "<HigherOrderFunNode><FunDiffNesting>" + diffNesting +
	// "</FunDiffNesting>"
	// + "<FunSTEntryOffset>" + funEntry.getOffSet()
	// + "</FunSTEntryOffset>" + funParamsToPrint + "</HigherOrderFunNode>";
    }

    @Override
    public String typeCheck() {
	if (funEntry.getNode().getNodeType() == NodeType.PARAM_NODE) {
	    // Recupero parametri dalla dichiarazione della funzione
	    ArrayList<Node> decFunNodeParams = ((ArrowTypeNode) ((ParamNode) funEntry
		    .getNode()).getType()).getParTypes();

	    // Controllo di avere lo stesso numero di parametri
	    if (decFunNodeParams.size() == funParams.size()) {

		// Controllo ad uno ad un la compatibilità dei Parametri con la
		// loro dichiarazione
		for (int i = 0; i < funParams.size(); i++) {
		    if (!MiniFunLib.isCompatible(decFunNodeParams.get(i),
			    funParams.get(i))) {
			System.out
				.println("HigherOrderFunNode TypeCheck Error: ParamNode arrowtype params and HigherOrder funcion params are incompatible: "
					+ decFunNodeParams.get(i).typeCheck()
					+ ", "
					+ funParams.get(i).typeCheck()
					+ ".Shutdown parser");
			System.exit(0);
		    }
		}

		return ((ParamNode) funEntry.getNode()).getType().typeCheck();

	    } else {

		System.out
			.println("HigherOrderFunNode TypeCheck Error: wrong function parameter number: "
				+ decFunNodeParams.size()
				+ ", "
				+ funParams.size() + ".Shutdown parser");
		System.exit(0);
		return "";
	    }
	} else {
	    System.out
		    .println("HigherOrderFunNode TypeCheck Error: higherOrderFunction node without paramNode"
			    + ".Shutdown parser");
	    System.exit(0);
	    return "";
	}
    }

    @Override
    public String codeGen() {
	// Costruisco l'activation link

	String parCode = "";
	String lookupAL = "";

	// Codice per PUSH parametri. I parametri vengono caricati al contrario
	for (int i = funParams.size() - 1; i >= 0; i--) {
	    parCode += (funParams.get(i)).codeGen();
	}

	// Scorro access link per recuperare AL del padre sintattico della
	// funzione da chiamare
	for (int i = 0; i < diffNesting; i++)
	    lookupAL += VMCommands.LW + "\n";

	String code =
	// PUSH Control Link (Riferimento al record di attivazione del
	// Chiamante)
	VMCommands.LFP
		+ "\n"
		+

		// PUSH dei Parametri
		parCode
		+

		// Il padre sintattico contiene la chiusura <indCodFunz,AL>
		// Salto al FP del padre sintattico
		VMCommands.LFP
		+ "\n"
		+ lookupAL
		+
		// Dal FP del padre sintattico sottraggo l'offset-1 per trovare
		// AL
		VMCommands.PUSH + " " + (funEntry.getOffSet() - 1) + "\n"
		+ VMCommands.SUB + "\n" + VMCommands.LW + "\n"
		+

		// Ricavo nuovamente il FP del padre sintattico
		VMCommands.LFP + "\n"
		+ lookupAL
		+
		// Dal FP sottraggo offset parametro per recuperare indirizzo
		// della funzione a cui saltare
		VMCommands.PUSH + " " + funEntry.getOffSet() + "\n"
		+ VMCommands.SUB + "\n" +
		// Carico indirizzo della funzione ed eseguo il jump
		VMCommands.LW + "\n" + VMCommands.JS + "\n";

	return code;
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.HIGHERORDERFUN_NODE;
    }

}
