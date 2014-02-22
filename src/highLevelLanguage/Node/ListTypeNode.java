package highLevelLanguage.Node;

public abstract class ListTypeNode extends Node {

    @Override
    abstract public String toPrint();

    @Override
    abstract public String typeCheck();

    @Override
    abstract public String codeGen();

    @Override
    abstract public NodeType getNodeType();

}
