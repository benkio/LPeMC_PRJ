package test;

import highLevelLanguage.MiniFunLexer;
import highLevelLanguage.MiniFunParser;
import highLevelLanguage.Node.Node;
import highLevelLanguage.utils.XmlFormatter;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;

public class Test {
    public static void main(String[] args) throws Exception {

	// First VM exercitation lexer/parser
	/*
	 * ANTLRFileStream input = new ANTLRFileStream(args[0]);
	 * 
	 * VMLexer lexer = new VMLexer(input); CommonTokenStream tokens = new
	 * CommonTokenStream(lexer); VMParser parser = new VMParser(tokens);
	 * 
	 * ExecuteVM vm = new ExecuteVM(parser.createCode()); vm.cpu();
	 */

	ANTLRFileStream input = new ANTLRFileStream(args[0]);
	MiniFunLexer lexer = new MiniFunLexer(input);
	CommonTokenStream tokens = new CommonTokenStream(lexer);
	MiniFunParser parser = new MiniFunParser(tokens);

	Node ast = parser.prog();

	System.out.println(new XmlFormatter().format(ast.toPrint()));

	// System.out.println(ast.typeCheck());
	//
	// String asm = ast.codeGen();
	//
	// FileWriter fstream = new FileWriter(args[0] + ".asm");
	// BufferedWriter out = new BufferedWriter(fstream);
	// out.write(asm);
	// out.close();
	//
	// VMLexer lex = new VMLexer(new ANTLRFileStream(args[0] + ".asm"));
	// CommonTokenStream tokensVM = new CommonTokenStream(lex);
	// VMParser parserVM = new VMParser(tokensVM);
	//
	// ExecuteVM vm = new ExecuteVM(parserVM.createCode());
	// vm.cpu();

    }
}
