package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;
import highLevelLanguage.utils.VMCommands;

import java.util.ArrayList;

public class DecFunNode extends Node {

    protected String funName;
    protected Node funType;
    protected ArrayList<ParamNode> funParams;
    protected ArrayList<Node> funLocalVariables;
    protected Node funBody;
    protected boolean typeChecked;
    protected String typeString = MiniFunLib.EMPTY;

    protected boolean hasGeneric;
    protected ArrayList<GenericTypeNode> generics;

    protected boolean genericInst;

    /**
     * Costruttore del nodo contenente la dichiarazione di una funzione
     * 
     * @param id
     *            ID della Funzione
     * @param t
     *            Nodo contenete o il tipo di ritorno o il tipo freccia
     */
    public DecFunNode(String id, Node type) {
	this(id);
	funType = type;
	this.generics = new ArrayList<GenericTypeNode>();
	this.genericInst = false;
    }

    protected DecFunNode(String id) {
	funName = id;
	funParams = new ArrayList<ParamNode>();
	typeChecked = false;
	typeString = "";
	funLocalVariables = new ArrayList<Node>();
    }

    /**
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

	String funLocalVarToPrint = "<FunLocalVar>";
	for (Node p : funLocalVariables) {
	    funLocalVarToPrint += p.toPrint();
	}
	funLocalVarToPrint += "</FunLocalVar>";

	String funGenericsToPrint = "<FunGenerics>";
	for (Node p : generics) {
	    funGenericsToPrint += p.toPrint();
	}
	funGenericsToPrint += "</FunGenerics>";

	return "<"
		+ this.getClass().getName()
		+ "><FunName>"
		+ funName
		+ "</FunName>"
		+ (hasGeneric ? "<FunGenericType>" + funGenericsToPrint
			+ "</FunGenericType>" : "") + "<FunType>"
		+ funType.toPrint() + "</FunType>" + funParamsToPrint
		+ funLocalVarToPrint + "<FunBody>" + funBody.toPrint()
		+ "</FunBody></" + this.getClass().getName() + ">";
    }

    @Override
    public String typeCheck() {

	if (!typeChecked && (!hasGeneric || (hasGeneric && genericInst))) {

	    // Controllo che se è un caso in cui la dichiarazione che come tipo
	    // ha un arrow type node
	    // Allora il numero di parametri nel tipo corrisponda con quello nei
	    // parametri della dichiarazioene.
	    if (funType.getNodeType() == NodeType.ARROWTYPE_NODE) {
		if (((ArrowTypeNode) funType).getParTypes().size() != funParams
			.size()) {
		    System.out
			    .println(this.getClass().getName()
				    + " TypeCheck Error: Number of arrowType params are wrong");
		    System.exit(0);
		}
	    }

	    if (hasGeneric) {
		for (int cont = 0; cont < this.funParams.size(); cont++) {
		    if (funParams.get(cont).getType().getNodeType() == NodeType.GENERICTYPE_NODE) {
			boolean notfound = true;
			for (int cont2 = 0; cont2 < this.generics.size(); cont2++) {
			    if (((GenericTypeNode) funParams.get(cont)
				    .getType()).getId().equals(
				    generics.get(cont2).getId())) {
				notfound = false;
			    }
			    if (notfound) {
				System.out
					.println(this.getClass().getName()
						+ " TypeCheck Error: Generic Type ID not found ");
				System.exit(0);

			    }
			}
		    }
		}
	    }

	    for (Node localVariable : funLocalVariables)
		localVariable.typeCheck();

	    if (MiniFunLib.isCompatible(funType, funBody)) {
		typeString = funBody.typeCheck();
		typeChecked = true;
	    } else {
		System.out
			.println(this.getClass().getName()
				+ " TypeCheck Error: funtype and funBody are incompatible: "
				+ funType.typeCheck() + ", "
				+ funBody.typeCheck() + ".Shutdown parser");
		System.exit(0);
	    }

	}

	return typeString;
    }

    public boolean isGeneric() {
	return hasGeneric;
    }

    public void setGenericInst(boolean genericInst) {
	this.genericInst = genericInst;
    }

    public ArrayList<GenericTypeNode> getFunGenerics() {
	return this.generics;
    }

    public void addFunGenerics(ArrayList<GenericTypeNode> gtn) {

	if (gtn != null) {
	    this.generics = gtn;
	    this.hasGeneric = true;
	}
    }

    /**
     * Il Codegen del DecFunNode prevede tutte le operazioni da effettuare una
     * volta che una funzione viene chiamarta
     */
    @Override
    public String codeGen() {

	String labelFun = "labelFun" + MiniFunLib.getLabIndex();
	String popParSequence = "";
	String popLocalVariable = "";
	String localVariableCodeGen = "";

	for (int i = 0; i < funParams.size(); i++) {
	    NodeType nt = this.funParams.get(i).getType().getNodeType();

	    if (nt == NodeType.ARROWTYPE_NODE)
		popParSequence += VMCommands.POP + "\n" + VMCommands.POP + "\n";
	    else
		popParSequence += VMCommands.POP + "\n";
	}

	for (int i = 0; i < funLocalVariables.size(); i++) {
	    localVariableCodeGen += funLocalVariables.get(i).codeGen();
	    popLocalVariable += VMCommands.POP + "\n";
	}

	String code = labelFun + " :\n" +
	// Preparo parte bassa dell'activation Record

		// Il registro FP punterà al nuovo Activation Record
		VMCommands.CFP + "\n"

		// PUSH dei dati Locali
		+ localVariableCodeGen +

		// PUSH return address del chiamante
		VMCommands.LRA + "\n"

		// Corpo della funzione
		+ funBody.codeGen() +

		// POP RV e salvo nel registro
		VMCommands.SRV + "\n" +

		// POP RA e salvo nel registro
		VMCommands.SRA + "\n" +

		// Rimuovo variabili locali
		popLocalVariable +
		// Rimuovo Access Link
		VMCommands.POP + "\n" +
		// Rimuovo Pametri
		popParSequence +

		// Ripristino il Registro FP che punterà all'Activation Record
		// del chiamante
		VMCommands.SFP + "\n" +

		// PUSH valore di ritorno
		VMCommands.LRV + "\n" +
		// PUSH indirizzo di ritorno
		VMCommands.LRA + "\n" +

		// Salto al Chiamante
		VMCommands.JS + "\n";

	MiniFunLib.addFunctionCode(code);

	return VMCommands.PUSH + " " + labelFun + "\n";
    }

    public void addParam(ParamNode param) {
	funParams.add(param);
    }

    public void addExpValue(Node e) {
	funBody = e;
    }

    public ArrayList<ParamNode> getParams() {
	return funParams;
    }

    public boolean isTypeChecked() {
	return typeChecked;
    }

    public void addLocalDeclarationList(ArrayList<Node> dec) {
	this.funLocalVariables = dec;
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.DECFUN_NODE;
    }
}
