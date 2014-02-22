/**
 * 
 */
package highLevelLanguage.Node;

import java.util.ArrayList;

/**
 * @author benkio
 * 
 */
public class GenericTypeNode extends Node {

    private ArrayList<IDGenericTypeNode> genTypeIDs;

    public GenericTypeNode() {
	this.genTypeIDs = new ArrayList<>();
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return null;
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

    @Override
    public NodeType getNodeType() {
	// TODO Auto-generated method stub
	return null;
    }

    public void addType(String id) {
	this.genTypeIDs.add(new IDGenericTypeNode(id));

    }

    public IDGenericTypeNode getGenericTypeID(int id) {
	return genTypeIDs.get(id);
    }

    public ArrayList<IDGenericTypeNode> getGenericTypeIDs() {
	return genTypeIDs;
    }

}
