package highLevelLanguage.Node;

import highLevelLanguage.STentry;
import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class FunNode extends Node {

	private STentry funEntry;
	private int diffNesting;
	private ArrayList<Node> funParams;
	
	private boolean higherOrderFunction;

	public FunNode(STentry entry, int diffNesting, ArrayList<Node> params) {
		this.higherOrderFunction= false;
		funEntry = entry;
		funParams = params;
		this.diffNesting = diffNesting;
		
		if(this.funEntry.getNode() instanceof ParamNode){
			this.higherOrderFunction=true;
		}
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

		String code= 	//PUSH Control Link (Riferimento al record di attivazione del Chiamante)
				VMCommands.LFP + "\n" + 
				
				//PUSH dei Parametri
				parCode;
		
		if(!this.higherOrderFunction){
				// PUSH Access Link del padre sintattico (Riferimento per localizzare dati richiesti dalla procedura corr ma situati altrove)
				code += VMCommands.LFP + "\n"+ 
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
			}
		else{
			code += 
					VMCommands.LFP+"\n"+
					lookupAL+
					//Dal FP del padre sintattico sottraggo l'offset del parametro -1 per trovare AL
					VMCommands.PUSH + " " + funEntry.getOffSet() + "\n"+ 
					VMCommands.SUB + "\n" + 
					
					//Dal Fp del padre sintattico estraggo indirizzo della funzione
					VMCommands.LFP+"\n"+
					lookupAL+
					VMCommands.PUSH + " " + (funEntry.getOffSet()-1) + "\n"+ 
					VMCommands.SUB + "\n" + 
					//Carico indirizzo della funzione ed eseguo il jump
					VMCommands.LW + "\n"+
					VMCommands.JS + "\n";		
		}
		
		return code;
	}
}
