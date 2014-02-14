package highLevelLanguage.Node;

import java.util.ArrayList;

public class DecArrowFunNode extends DecFunNode {

    public DecArrowFunNode(String id, Node atn) {
	super(id, atn);
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
	return super.toPrint();
	// String funParamsToPrint = "<FunParams>";
	// for (Node p : funParams) {
	// funParamsToPrint += p.toPrint();
	// }
	// funParamsToPrint += "</FunParams>";
	//
	// String funLocalVarToPrint = "<FunLocalVar>";
	// for (Node p : funLocalVariables) {
	// funLocalVarToPrint += p.toPrint();
	// }
	// funLocalVarToPrint += "</FunLocalVar>";
	//
	// return "<DecArrowFunNode><FunName>" + funName + "</FunName><FunType>"
	// + funType.toPrint() + "</FunType>" + funParamsToPrint
	// + funLocalVarToPrint + "<FunBody>" + funBody.toPrint()
	// + "</FunBody></DecArrowFunNode>";
    }

    @Override
    public String typeCheck() {
	return super.typeCheck();
	// if (!typeChecked) {

	// // TODO cancellare solamente se sei sicuro che qui non c'è bisogno
	// // di fare altro per
	// // Considerare l'arrowtype
	// for (Node localVariable : funLocalVariables)
	// localVariable.typeCheck();
	//
	// if (MiniFunLib.isCompatible(funType, funBody)) {
	// typeString = funBody.typeCheck();
	// typeChecked = true;
	// } else {
	// System.out
	// .println("TypeCheck Error: funtype and funBody are incompatible: "
	// + funType.typeCheck()
	// + ", "
	// + funBody.typeCheck() + ".Shutdown parser");
	// System.exit(0);
	// }
	// }
	//
	// return typeString;
    }

    @Override
    public String codeGen() {
	return super.codeGen();
    }

    @Override
    public void addParam(ParamNode param) {
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
