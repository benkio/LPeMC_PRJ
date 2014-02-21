package highLevelLanguage.Node;

public abstract class Node {

    abstract public String toPrint();

    abstract public String typeCheck();

    abstract public String codeGen();

    abstract public NodeType getNodeType();

}
