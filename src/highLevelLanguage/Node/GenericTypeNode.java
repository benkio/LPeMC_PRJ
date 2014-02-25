/**
 * 
 */
package highLevelLanguage.Node;

/**
 * @author benkio
 * 
 */
public class GenericTypeNode extends Node {

    // private ArrayList<String> genTypeIDs;

    private String id;
    private Node type;

    public GenericTypeNode(String id) {
	this.id = id;
	this.type = new EmptyNode();
    }

    @Override
    public String toPrint() {
	return "<GenericTypeNode>" + this.id.toUpperCase()
		+ "</GenericTypeNode>";
    }

    @Override
    public String typeCheck() {
	return this.type.typeCheck();
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
	return "";
    }

    @Override
    public NodeType getNodeType() {
	return NodeType.GENERICTYPE_NODE;
    }

    public String getGenericTypeID() {
	return this.id;
    }

}
