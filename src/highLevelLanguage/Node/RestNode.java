package highLevelLanguage.Node;

import highLevelLanguage.utils.VMCommands;

public class RestNode extends Node {

    private static Node restBody;

    public RestNode(Node e) {
	// TODO Auto-generated constructor stub
	restBody = e;
    }

    @Override
    public String toPrint() {
	// TODO Auto-generated method stub
	return "<RestBody>" + restBody.toPrint() + "</RestBody>";
    }

    @Override
    public String typeCheck() {
	// TODO Auto-generated method stub
	return restBody.typeCheck();
    }

    @Override
    public String codeGen() {
	// TODO Auto-generated method stub
	return restBody.codeGen() + VMCommands.push.name() + " 1 \n"
		+ VMCommands.add.name() + "\n" + VMCommands.lw.name() + "\n";
    }

}
