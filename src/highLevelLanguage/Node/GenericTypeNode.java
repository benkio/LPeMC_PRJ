/**
 * 
 */
package highLevelLanguage.Node;

/**
 * @author benkio
 * 
 */
public class GenericTypeNode extends Node {

	//private ArrayList<String> genTypeIDs;
	
	private String id;
	private Node type;
	
	public GenericTypeNode(String id) {
		this.id=id;
	}

	@Override
	public String toPrint() {
		return "<GenericTypeNode>"+this.id.toUpperCase()+"</GenericTypeNode>";
	}

	@Override
	public String typeCheck() {
		if(this.type!= null){
			return this.type.typeCheck();
		}
		//TODO
		return"";
	}

	public Node getType() {
		return type;
	}

	public String getId() {
		return id;
	}

	public void setType(Node type) {
		this.type = type;
	}

	@Override
	public String codeGen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public NodeType getNodeType() {
		return NodeType.GENERICTYPE_NODE;
	}



	public String getGenericTypeID() {
		return this.id;
	}

}
