package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

import java.util.ArrayList;

public class DecArrowFunNode extends DecFunNode {

	protected ArrowTypeNode atn;
	protected int nPar;

	public DecArrowFunNode(String id, Node atn) {
		super(id);
		
		this.atn=(ArrowTypeNode)atn;
		this.nPar=0;
		
		super.funType= this.atn.getRetType();
	}

	@Override
	public NodeType getNodeType() {

		return NodeType.DECARROWFUN_NODE;
	}

	@Override
	public Node getFunType() {
		return super.getFunType();
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
		arrowTypeToPrint=atn.toPrint();

		return "<DecArrowFunNode><FunName>" + funName + "</FunName>" +arrowTypeToPrint +"<FunType>"
		+ funType.toPrint() + "</FunType>" + funParamsToPrint+funLocalVarToPrint
		+ "<FunBody>" + funBody.toPrint() + "</FunBody></DecArrowFunNode>";
	}

	@Override
	public String typeCheck() {
		if (!typeChecked) {

			if(atn.getNPar()!= this.nPar){
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

	@Override
	public String codeGen() {
		return super.codeGen();
	}

	@Override
	public void addParam(ParamNode param) {
		//param.addType(atn.getParType(nPar));
		//nPar++;
		
		super.addParam(param);
	}

	@Override
	public void addExpValue(Node e) {
		super.addExpValue(e);
	}

	@Override
	public ArrayList<ParamNode> getParams() {
		return super.getParams();
	}

	@Override
	public boolean isTypeChecked() {
		return super.isTypeChecked();
	}

	@Override
	public void addLocalDeclarationList(ArrayList<Node> dec) {
		super.addLocalDeclarationList(dec);
	}



}
