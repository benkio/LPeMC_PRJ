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

    private ArrayList<String> genTypeIDs;

    public GenericTypeNode(String id) {
	this.genTypeIDs = new ArrayList<String>();
	genTypeIDs.add(id);
    }

    @Override
    public String toPrint() {
	String genTypeIDsToPrint = "";
	for (int i = 0; i < genTypeIDs.size(); i++) {
	    genTypeIDsToPrint += "<GenericTypeID>" + genTypeIDs.get(i)
		    + "</GenericTypeID>";
	}

	return "<GenericTypeNode>" + genTypeIDsToPrint + "</GenericTypeNode>";
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
	return NodeType.GENERICTYPE_NODE;
    }

    public void addType(String id) {

	for (int i = 0; i < genTypeIDs.size(); i++)
	    if (genTypeIDs.get(i).equals(id)) {
		System.out.print("Generic Template already defined");
	    }

	this.genTypeIDs.add(id);
    }

    public String getGenericTypeID(int id) {
	return genTypeIDs.get(id);
    }

    public ArrayList<String> getGenericTypeIDs() {
	return genTypeIDs;
    }

}
