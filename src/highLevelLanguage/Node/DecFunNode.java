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

	public DecFunNode(String string, Node t) {
		funName = string;
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

	public Node getFunType() {
		return funType;
	}

	@Override
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
				System.out.println("TypeCheck Error: n types and  n params are different "
						+".Shutdown parser");
				System.exit(0);
			}
			
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

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub

		String labelFun = "labelFun" + MiniFunLib.getLabIndex();
		String popParSequence = "";
		String popLocalVariable = "";
		String localVariableCodeGen = "";

		for (int i = 0; i < funParams.size(); i++) {
			popParSequence += VMCommands.pop.name() + "\n";
		}

		for (int i = 0; i < funLocalVariables.size(); i++) {
			localVariableCodeGen += funLocalVariables.get(i).codeGen();
			popLocalVariable += VMCommands.pop.name() + "\n";
		}

		// Preparo la parte alta dell'activation record
		// Copio il frame pointer attuale nello stack
		// Setto il return address del chiamante
		// Aggiungo il body e lo calcolo
		// Mi salvo il return value in un registo interno rv
		// Mi salvo il return address a cui poi dovrò saltare
		// Ripulisco l'access link i parametri
		// Ripristino il return value e lo metto in cima allo stack
		// Salto al chiamante

		String code = labelFun + " :\n" + VMCommands.cfp.name() + "\n"
				+ localVariableCodeGen + VMCommands.lra.name() + "\n"
				+ funBody.codeGen() + VMCommands.srv.name() + "\n"
				+ VMCommands.sra.name() + "\n" + VMCommands.pop.name() + "\n"
				+ popParSequence + popLocalVariable + VMCommands.sfp.name()
				+ "\n" + VMCommands.lrv.name() + "\n" + VMCommands.lra.name()
				+ "\n" + VMCommands.js.name() + "\n";

		MiniFunLib.addFunctionCode(code);

		return VMCommands.push.name() + " " + labelFun + "\n";
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

		funLocalVariables = dec;
	}
}
