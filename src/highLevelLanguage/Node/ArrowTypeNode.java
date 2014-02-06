package highLevelLanguage.Node;

import java.util.ArrayList;

public class ArrowTypeNode extends Node {

	private Node returnType;
	private ArrayList<Node> parTypes;
	
	public ArrowTypeNode(){
		this.parTypes= new ArrayList<Node>();
	}

	@Override
	public String toPrint() {
		String parString="";
		
		for (int cont=0; cont<parTypes.size();cont++)
			parString+="<ParType>"+parTypes.get(cont).toPrint()+"</ParType>";
		return "<ArrowTypeNode>"+parString+"<ReturnType>"+returnType.toPrint()+"</ReturnType>"+"</ArrowTypeNode>";
	}

	@Override
	public String typeCheck() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getRetType(){
		return this.returnType;
	}

	public Node getParType(int index){
		if(index>=parTypes.size()) return null;

		return parTypes.get(index);
	}

	public void addParType(Node t){
		this.parTypes.add(t);
	}

	public void addRetType(Node t){
		this.returnType= t;
	}

}
