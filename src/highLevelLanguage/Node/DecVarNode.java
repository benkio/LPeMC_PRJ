package highLevelLanguage.Node;

import highLevelLanguage.utils.MiniFunLib;

public class DecVarNode extends Node {

	private String varName;
	private Node varType;
	private Node value;
	private boolean typeChecked;
	private String typeString;

	public DecVarNode(String varName, Node varType, Node value) {
		// TODO Auto-generated constructor stub

		this.varName = varName;
		this.varType = varType;
		this.value = value;
		this.typeChecked = false;
		this.typeString = "";
	}

	@Override
	public String toPrint() {
		// TODO Auto-generated method stub
		return "<DecVarNode>" + "<VarName>" + varName + "</VarName><VarType>"
		+ varType.toPrint() + "</VarType><VarValue>" + value.toPrint()
		+ "</VarValue>" + "</DecVarNode>";
	}

	@Override
	public String typeCheck() {
		// TODO Auto-generated method stub
		if (!typeChecked) {
			if (MiniFunLib.isCompatible(value, varType)) {
				typeChecked = true;
				typeString = varType.typeCheck();
			} else
				System.exit(0);

		}
		return typeString;
	}

	@Override
	public String codeGen() {

		/*
		 * Recupero il valore della variabile e lo metto dentro alla cella
		 * giusta. (heap) Prendo l'indirizzo di quella cella e lo metto nello
		 * stack. Mi sposto dell'offset giusto dal fp. Metto nell'idirizzo
		 * raggiunto l'indirizzo della cella dove trovo il valore della
		 * variabile
		 */

		return value.codeGen();
		/*
		 * return value.codeGen() + VMCommands.lfp.name() + "\n" +
		 * VMCommands.push.name() + " " + offSet + "\n" + VMCommands.sub.name()
		 * + "\n" + VMCommands.sw.name() + "\n";
		 */

	}

	@Override
	public NodeType getNodeType() {
		// TODO Auto-generated method stub
		return null;
	}

}
