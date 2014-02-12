package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class DecFunNode extends Node {

	private String funName;
	private ArrowTypeNode atn;
	private Node funType;
	private ArrayList<Node> funParams;
	private ArrayList<Node> funLocalVariables;
	private Node funBody;
	private boolean typeChecked;
	private String typeString;
	private boolean isArrowType;
	private int nPar;

	/**
	 * Costruttore del nodo contenente la dichiarazione di una funzione
	 * @param id ID della Funzione
	 * @param t Nodo contenete o il tipo di ritorno o il tipo freccia
	 */
	public DecFunNode(String id, Node t) {
		funName = id;
		funParams = new ArrayList<Node>();
		nPar=0;

		this.typeChecked = false;
		this.typeString = "";
		funLocalVariables = new ArrayList<Node>();
		isArrowType=false;

		if(!(t instanceof ArrowTypeNode)){
			funType = t;

		}
		else{
			isArrowType=true;
			atn= (ArrowTypeNode)t;
			funType= atn.getRetType();
		}
	}

	/**
	 * Getter per tipo ritorno della funzione
	 * @return Node contenente tipo di ritorno della funzione
	 */
	public Node getFunType() {
		return funType;
	}

	@Override
	/**
	 * Stampa AST del DecFunNode
	 */
	public String toPrint() {

		String funParamsToPrint = "<FunParams>";
		for (Node p : funParams) {
			funParamsToPrint += p.toPrint();
		}
		funParamsToPrint += "</FunParams>";

		String funLocalVarToPrint="<FunLocalVar>";
		for (Node p : funLocalVariables) {
			funLocalVarToPrint += p.toPrint();
		}
		funLocalVarToPrint += "</FunLocalVar>";

		String arrowTypeToPrint="";
		if(isArrowType) arrowTypeToPrint=atn.toPrint();

		return "<DecFunNode><FunName>" + funName + "</FunName>" +arrowTypeToPrint +"<FunType>"
		+ funType.toPrint() + "</FunType>" + funParamsToPrint+funLocalVarToPrint
		+ "<FunBody>" + funBody.toPrint() + "</FunBody></DecFunNode>";
	}

	@Override
	public String typeCheck() {

		if (!typeChecked) {

			if(isArrowType && atn.getNPar()!= this.nPar){
				System.out.println("TypeCheck Error: types and params are different. Shutdown parser");
				System.exit(0);
			}

			//TODO Controllare 
			for (Node localVariable : funLocalVariables)
				localVariable.typeCheck();

			if (MiniFunLib.isCompatible(funType, funBody)) {
				typeString = funBody.typeCheck();
				typeChecked = true;
			} else {
				System.out
				.println("TypeCheck Error: funtype and funBody are incompatible: "
						+ funType.typeCheck()
						+ ", "
						+ funBody.typeCheck() + ".Shutdown parser");
				System.exit(0);
			}


		}

		return typeString;
	}


	/**
	 * Il Codegen del DecFunNode prevede tutte le operazioni da effettuare una volta che una funzione viene chiamarta
	 */
	@Override
	public String codeGen() {

		String labelFun = "labelFun" + MiniFunLib.getLabIndex();
		String popParSequence = "";
		String popLocalVariable = "";
		String localVariableCodeGen = "";

		for (int i = 0; i < funParams.size(); i++) {
			if(((ParamNode)this.funParams.get(i)).getType() instanceof ArrowTypeNode)
				popParSequence += VMCommands.POP +"\n"+ VMCommands.POP + "\n";
			else 
				popParSequence += VMCommands.POP + "\n";
		}

		for (int i = 0; i < funLocalVariables.size(); i++) {
			localVariableCodeGen += funLocalVariables.get(i).codeGen();
			popLocalVariable += VMCommands.POP + "\n";
		}

		String code = labelFun + " :\n" + 
				//Preparo parte bassa dell'activation Record

				//Il registro FP punterà al nuovo Activation Record
				VMCommands.CFP + "\n"

				//PUSH dei dati Locali
				+ localVariableCodeGen +

				//PUSH return address del chiamante
				VMCommands.LRA + "\n"

				//Corpo della funzione
				+ funBody.codeGen() + 

				//POP RV e salvo nel registro
				VMCommands.SRV + "\n" + 

				//POP RA e salvo nel registro
				VMCommands.SRA + "\n" + 

				//Rimuovo variabili locali
				popLocalVariable+
				//Rimuovo Access Link
				VMCommands.POP + "\n"+ 
				//Rimuovo Pametri
				popParSequence + 

				//Ripristino il Registro FP che punterà all'Activation Record del chiamante
				VMCommands.SFP + "\n" + 

				//PUSH valore di ritorno 
				VMCommands.LRV + "\n" + 
				//PUSH indirizzo di ritorno
				VMCommands.LRA + "\n" + 

				//Salto al Chiamante
				VMCommands.JS + "\n";

		MiniFunLib.addFunctionCode(code);

		return VMCommands.PUSH + " " + labelFun + "\n";
	}


	public void addParam(Node param) {

		if(isArrowType){
			((ParamNode)param).addType(atn.getParType(nPar));
			nPar++;
		}
		funParams.add(param);
	}

	public void addExpValue(Node e) {

		funBody = e;
	}

	public ArrayList<Node> getParams() {

		return funParams;
	}

	public boolean isTypeChecked() {
		return typeChecked;
	}

	public void addLocalDeclarationList(ArrayList<Node> dec) {

		this.funLocalVariables = dec;
	}
}
