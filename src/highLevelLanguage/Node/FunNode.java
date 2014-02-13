package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class FunNode extends Node {

	protected STentry funEntry;
	protected int diffNesting;
	protected ArrayList<Node> funParams;

	public FunNode(STentry entry, int diffNesting, ArrayList<Node> params) {
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

		// ATTENZIONE SI POTREBBE ANDARE IN LOOP!!!! FUNZIONE CHE CHIAMA SE
		// STESSA E QUINDI NON SI FINISCE? PER QUESTO INSERISCO L'OFFSET E NON
		// RICHIAMO LA FUNZIONE.
		return "<FunNode><FunDiffNesting>" + diffNesting + "</FunDiffNesting>"
		+ "<FunSTEntryOffset>" + funEntry.getOffSet()
		+ "</FunSTEntryOffset>" + funParamsToPrint + "</FunNode>";
	}

	@Override
	public String typeCheck() {

		if (funEntry.getNode().getNodeType() == NodeType.DECFUN_NODE) {
			//Recupero parametri dalla dichiarazione della funzione
			ArrayList<ParamNode> decFunNodeParams = ((DecFunNode) funEntry.getNode()).getParams();

			//Controllo di avere lo stesso numero di parametri 
			if (decFunNodeParams.size() == funParams.size()) {

				//Controllo ad uno ad un la compatibilità dei Parametri con la loro dichiarazione
				for (int i = 0; i < funParams.size(); i++){
					if (!MiniFunLib.isCompatible(decFunNodeParams.get(i),funParams.get(i))) {
						System.out.println("TypeCheck Error: decFunNodeParam and funParam are incompatible: "
								+ decFunNodeParams.get(i).typeCheck()
								+ ", "
								+ funParams.get(i).typeCheck()
								+ ".Shutdown parser");
						System.exit(0);
					}
				}
				// Per evitare che si abbia l'ricorsione infinita della funzione.
				if (((DecFunNode) funEntry.getNode()).isTypeChecked())
					return funEntry.getNode().typeCheck();
				else
					return ((DecFunNode) funEntry.getNode()).getFunType().typeCheck();
			}
			else{

				System.out.println("TypeCheck Error: wrong function parameter number: "
						+ decFunNodeParams.size()
						+ ", "
						+ funParams.size()
						+ ".Shutdown parser");
				System.exit(0);
				return "";
			}
		} 
		else if (funEntry.getNode().getNodeType() == NodeType.PARAM_NODE){
			
			ArrowTypeNode pType = ((ArrowTypeNode)((ParamNode)funEntry.getNode()).getType());
			
			return pType.getRetType().typeCheck();
		}
		else{
			System.out.println("TypeCheck Error: Function node without DecFunNode"
					+ ".Shutdown parser");
			System.exit(0);
			return "";
		}
	}

	@Override
	/**
	 * Il codeGen del FunNode Prevede la costruzione dell'activation Record per la chiamata di una funzione
	 */
	public String codeGen() {
		// Costruisco l'activation link

		String parCode = "";
		String lookupAL = "";

		//Codice per PUSH parametri. I parametri vengono caricati al contrario
		for (int i = funParams.size() - 1; i >= 0; i--) {
			parCode += (funParams.get(i)).codeGen();
		}

		// Scorro access link per recuperare AL del padre sintattico della funzione da chiamare
		for (int i = 0; i < diffNesting; i++)
			lookupAL += VMCommands.LW + "\n";

		String code= 	
				//PUSH Control Link (Riferimento al record di attivazione del Chiamante)
				VMCommands.LFP + "\n" + 

				//PUSH dei Parametri
				parCode+

				VMCommands.LFP + "\n"+ 
				lookupAL+ // Cerca l'activation Record del padre sintattico della funzione.

				// Ora devo cercare la locazione di memoria su cui fare il jump per eseguire il corpo della funzione

				// Scorro Access link fino ad arrivare all Activation Record del padre sintattico dove è definita la funzione da chiamare
				VMCommands.LFP + "\n" + 
				lookupAL +

				//Dal FP del padre sintattico sottraggo l'offset della funzione per trovare l'indirizzo
				VMCommands.PUSH + " " + funEntry.getOffSet() + "\n"+ 
				VMCommands.SUB + "\n" + 

				//Carico indirizzo della funzione ed eseguo il jump
				VMCommands.LW + "\n"+ 
				VMCommands.JS + "\n";


		return code;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.FUN_NODE;
	}
}
