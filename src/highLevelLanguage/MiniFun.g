grammar MiniFun;

@lexer::header{
package highLevelLanguage;

}
@parser::header {
package highLevelLanguage;

import highLevelLanguage.Node.*;
import java.util.HashMap;
import java.util.ArrayList;
}

@parser::members {
    private ArrayList<HashMap<String,STentry>> symTable = new ArrayList<HashMap<String,STentry>>();    
    private int nestingLevel=0;             
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

prog	returns [Node ast]
	: LET 
	{
	  	HashMap<String,STentry> hm = new HashMap<String,STentry>();
	   	symTable.add(hm);
	} 
          
 	d=declist
	IN e=exp SEMIC	
	{
		$ast= new ProgNode($d.astList,$e.ast);
	};
	
declist returns [ArrayList<Node> astList]
	:
	{
		$astList= new ArrayList<Node>();
   		int offSet=1;
   	}
  	(VAR i=ID COL t=baseType ASS e=exp SEMIC
   	{
   	 	DecVarNode vn = new DecVarNode($i.text,$t.ast,$e.ast);
	    	STentry entry = new STentry(vn,offSet++);
	    	HashMap<String,STentry> hm= symTable.get(nestingLevel);
	    	
	    	if (hm.put($i.text,entry) != null){
	    		System.out.println("Identifier "+$i.text+" at line "+$i.line+" already defined");
	      		System.exit(0);
	      	}
	    	
	    	$astList.add(vn);
    	}
  	| FUN i=ID
  	{
   		DecFunNode fn = null;
   		ArrayList<GenericTypeNode> generics=null;
   		HashMap<String,STentry> hmNew = new HashMap<String,STentry>(); 
   		HashMap<String,STentry> hm = symTable.get(nestingLevel);
   		nestingLevel++;
   		symTable.add(hmNew);
   	} 
   	( LANPAR gt=genericType 
   	{
   		generics=$gt.ast;
   		
   	} 
   	RANPAR)?
   	{
   		if (generics !=null)
	        {
	        	for (int j = 0; j<generics.size() ; j++){
	        		STentry genericEntry = new STentry(generics.get(j),0);
	        		if (hmNew.put(generics.get(j).getId(),genericEntry) != null){
	 		    		System.out.println("Identifier "+generics.get(j).getId() +" at line "+$i.line+" already defined, generic type ID match");
	 		      		System.exit(0);
	 		      	}
	        	}
	        }
   	}
   	COL ( (rt=baseType 
   	{
   		fn = new DecFunNode($i.text,$rt.ast); 
   	} 
   	| grt=ID 
   	{ 
		if (hmNew.get( $grt.text) != null)
			fn = new DecFunNode($i.text,hmNew.get( $grt.text ).getNode() );
		else{
			System.out.println("Identifier "+ $grt.text +" Not recognized in arrowType, generic type ID match");
			System.exit(0);
		}
   	}
   	)
   	{
	   	fn.addFunGenerics(generics);
	    	STentry entry = new STentry(fn,offSet++);
	    	if (hm.put($i.text,entry) != null){
	    		System.out.println("Identifier "+$i.text+" at line "+$i.line+" already defined");
	      		System.exit(0);
	      	}
  	}
  	LPAR 
	{   		
	        int parOffSet=-1;
	} 
	( fpi=ID 
	{
		ParamNode pn = new ParamNode($fpi.text);
	}
	( COL fpt=type
	{
		if($fpt.ast.getNodeType() == NodeType.ARROWTYPE_NODE){
			parOffSet-=1;
		}
		if($fpt.ast.getNodeType() == NodeType.GENERICTYPE_NODE) {
			if (hmNew.get( ( (GenericTypeNode)  $fpt.ast).getId()) != null)
				pn.addType( hmNew.get( ( (GenericTypeNode) $fpt.ast).getId()).getNode() );	
			else{
				System.out.println("Identifier "+ $fpi.text +" at line "+$fpi.line+" Not recognized, generic type ID match");
				System.exit(0);
			}
		}
		else
			pn.addType( $fpt.ast );
	}
	)
	{
		entry = new STentry(pn,parOffSet--);
		hmNew.put($fpt.text,entry);
		fn.addParam(pn);
	}
	(COMMA pi=ID 
	{
		pn = new ParamNode($pi.text);
	} 
	( COL pt=type
	{
		if($pt.ast.getNodeType() == NodeType.ARROWTYPE_NODE){
			parOffSet-=1;
		}
		if($pt.ast.getNodeType() == NodeType.GENERICTYPE_NODE){
			if (hmNew.get( ( (GenericTypeNode) $pt.ast).getId()) != null)
				pn.addType( hm.get( ( (GenericTypeNode) $pt.ast).getId()).getNode() );
			else{
				System.out.println("Identifier "+ $pt.text +" at line "+$pi.line+" Not recognized, generic type ID match");
				System.exit(0);
			}
		}
		else
			pn.addType( $pt.ast );
	}
	)
	{
	        entry = new STentry(pn,parOffSet--);
	        if (hmNew.put($pi.text,entry) != null){
	        	System.out.println("Identifier "+$pi.text+" at line "+$pi.line+" already defined");
	           	System.exit(0);
	        }
	        fn.addParam(pn);
	}
	)*)? | rt=arrowType 	
   	{
	   	fn = new DecFunNode($i.text,$rt.ast);
	   	fn.addFunGenerics(generics);
	    	STentry entry = new STentry(fn,offSet++);    	
	    	if (hm.put($i.text,entry) != null){
	    		System.out.println("Identifier "+$i.text+" at line "+$i.line+" already defined");
	      		System.exit(0);
	      	}
  	}
  	LPAR 
	{		   		
	        int parOffSet=-1;
	        int parCont=0;
	} 
	(fpi=ID 
	{
		ParamNode pn = new ParamNode($fpi.text);
		Node tp = ((ArrowTypeNode)$rt.ast).getParType(parCont);    		
    		if( tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
    			parOffSet-=1;
    		}
    		System.out.println(parOffSet);	    		
		pn.addType(tp);
	       	entry = new STentry(pn,parOffSet--);
	        hmNew.put($fpi.text,entry);
	        fn.addParam(pn);
	        parCont++;
	}
	(COMMA pi=ID
	{
		pn = new ParamNode($pi.text);
    		tp =((ArrowTypeNode) $rt.ast).getParType(parCont);   		
    		if(tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
    			parOffSet-=1;
    		}
    		System.out.println(parOffSet);
    		pn.addType(tp);
    		parCont++;
	        entry = new STentry(pn,parOffSet--);
	        if (hmNew.put($pi.text,entry) != null){
	        	System.out.println("Identifier "+$pi.text+" at line "+$pi.line +" already defined");
	           	System.exit(0);
	        }
	        fn.addParam(pn);
	}
	)* )? ) RPAR CLPAR ( (dec=declist)
    	{
    		fn.addLocalDeclarationList($dec.astList);
    	}
       	e=exp
        {
        	fn.addExpValue($e.ast);
       		symTable.remove(nestingLevel--);
       		$astList.add(fn);
       	} 
    	) CRPAR SEMIC)*;	    	
 	
exp	returns [Node ast]
 		: f=term {$ast= $f.ast;}
 	    ((
 	    	EQ l=term
 	     	{$ast= new EqualNode($ast,$l.ast);}
 	     )
 	     |( 
 	     	LESSEQ l=term
 	     	{$ast= new LessEqualNode($ast,$l.ast);}
 	     )
 	     |( GREATEREQ l=term
 	     	{$ast = new GreatEqualNode($ast,$l.ast);}
 	     )
 	    )*;
 	
term	returns [Node ast]
	: f=value {$ast= $f.ast;}
	    (
	 		(
	 		PLUS l=value
	     		{$ast= new PlusNode ($ast,$l.ast);}
	     	)
	     	|(
	     		MINUS l=value
	     		{$ast = new MinusNode($ast,$l.ast);}
	     	)
	     	|(
	     		OR l=value
	     		{$ast = new OrNode($ast,$l.ast);}
	     	)
	    )*
	;
	
value	returns [Node ast]
	: f=fatt {$ast= $f.ast;}
	( ( TIMES l=fatt {$ast= new TimesNode ($ast,$l.ast);} )
	| ( DIVIDE l=fatt {$ast = new DivNode($ast,$l.ast);} )
	| ( AND l=fatt {$ast= new AndNode($ast,$l.ast);} ) )*;	 	
 	
fatt	returns [Node ast]
	: n=NAT {$ast= new NatNode(Integer.parseInt($n.text));}  
	| TRUE {$ast= new BoolNode(true);}  
	| FALSE	{$ast= new BoolNode(false);} 
	| EMPTY	{$ast= new EmptyNode();}   
	| LPAR e=exp RPAR {$ast= $e.ast;}  
	| i=ID
	{
		HashMap<String,STentry> hm;
	 	STentry entry=null;
	 	ArrayList<Node> genericType = null;
	 	int declNL;
	 	for(declNL=nestingLevel; declNL>=0; declNL--){
	 		hm = symTable.get(declNL);
	    		entry = hm.get($i.text);
	    		if (entry != null) break;
	 	} 
	 	if (entry==null) {
	 		System.out.println("Identifier "+$i.text+" at line "+$i.line+" is not defined");
	    		System.exit(0);
	  	}
		NodeType nt= entry.getNode().getNodeType();
		if(nt == NodeType.DECFUN_NODE){
			$ast = new FunParNode(entry,nestingLevel-declNL);
	 	}
	 	else {
	 		$ast = new VarNode(entry,nestingLevel-declNL); 
	 	}
	} 
	( LANPAR (cgt=concreteGenericType 
	{ 
		genericType = $cgt.ast; 
	} 
	| gi=linkedGenericType
	{		
		genericType = $gi.ast;	
	}
	)RANPAR )? 
	( LPAR {ArrayList<Node> parList = new ArrayList<Node>();}
	( fp=exp {parList.add($fp.ast);}
	( COMMA p=exp {parList.add($p.ast);} )* )? RPAR 
	{
		if(entry.getNode().getNodeType()==NodeType.PARAM_NODE){
			$ast = new HigherOrderFunNode(entry,nestingLevel-declNL,parList, genericType );
		}
		else{
			$ast = new FunNode(entry,nestingLevel-declNL,parList, genericType);
		}
	}
	)? 
	| IF x=exp THEN CLPAR y=exp CRPAR ELSE CLPAR z=exp CRPAR {$ast= new IfNode($x.ast,$y.ast,$z.ast);}	
	| SLPAR e1=exp DOUBLECOL e2=exp SRPAR {$ast= new ListNode($e1.ast,$e2.ast);}
	| FIRST LPAR e=exp RPAR	{$ast= new FirstNode($e.ast);}
	| REST LPAR e=exp RPAR {$ast= new RestNode($e.ast);}
	| PRINT LPAR e=exp RPAR	{$ast= new PrintNode($e.ast);}
	| NOT LPAR e=exp RPAR {$ast= new NotNode($e.ast);}  	
 	; 

type	returns [Node ast]
	: bt=baseType {$ast = $bt.ast;}
  	| at=arrowType {$ast = $at.ast;}
	| lt=listType {$ast = $lt.ast; }
	| i=ID { $ast = new GenericTypeNode($i.text); }
  	;
 
baseType returns [Node ast]
	: INTTYPE  {$ast= new IntTypeNode();}  
  	| BOOLTYPE {$ast= new BoolTypeNode();}
  	;
  	
 
arrowType returns [Node ast]
 	: LPAR
 	{
 		ArrowTypeNode atn= new ArrowTypeNode();
 		HashMap<String,STentry> hm= symTable.get(nestingLevel);
 	} 
 	((t1=type )
 	{ 				
 		if($t1.ast.getNodeType() == NodeType.GENERICTYPE_NODE) {
			if (hm.get( ( (GenericTypeNode)  $t1.ast).getId()) != null) atn.addParType( hm.get( ( (GenericTypeNode) $t1.ast).getId()).getNode() );
		    	else {
			    	System.out.println("Identifier "+ $t1.text +" Not recognized in arrowType, generic type ID match");
		      		System.exit(0);
		      	}
	    	}
		else atn.addParType($t1.ast);
 	}
 	( COMMA (tn=type)
 	{
		if($tn.ast.getNodeType() == NodeType.GENERICTYPE_NODE) {
			if (hm.get( ( (GenericTypeNode) $tn.ast).getId()) != null) atn.addParType( hm.get( ( (GenericTypeNode) $tn.ast).getId()).getNode() );
			else{
				System.out.println("Identifier "+ $tn.text +" Not recognized in arrowType, generic type ID match");
				System.exit(0);
			}
		}
		else atn.addParType($tn.ast);
 	} 
 	)* )? 
 	RPAR ARROW rt=type
 	{ 
 	
 		if($rt.ast.getNodeType() == NodeType.GENERICTYPE_NODE) {
			if (hm.get( ( (GenericTypeNode) $rt.ast).getId()) != null)
			 atn.addRetType( hm.get( ( (GenericTypeNode) $rt.ast).getId()).getNode() );
			else{
				System.out.println("Identifier "+ $rt.text +" Not recognized in arrowType, generic type ID match");
				System.exit(0);
			}
		}
		else atn.addRetType($rt.ast);
		$ast=atn;
 	};
 		
concreteGenericType returns [ArrayList<Node> ast]
	:	
	bt=baseType { ArrayList<Node> generic = new ArrayList<Node>(); generic.add($bt.ast); }
	(COMMA bt1=baseType { generic.add($bt1.ast); } 
	)* { $ast = generic; };

genericType returns [ArrayList<GenericTypeNode> ast]
	:{ ArrayList<GenericTypeNode> generics = new ArrayList<GenericTypeNode>(); }	
	i=ID { generics.add(new GenericTypeNode( $i.text )); }
	( COMMA f=ID { generics.add(new GenericTypeNode( $f.text )); }
	)* { $ast = generics; };
	
linkedGenericType returns [ArrayList <Node> ast]
	:
	{ 
		ArrayList<Node> generics = new ArrayList<Node>(); 
		HashMap<String,STentry> hm = symTable.get(nestingLevel);
	}	
	i=ID 
	{ 
	
		if ( hm.get($i.text) != null){ 
			if ( hm.get($i.text).getNode().getNodeType() == NodeType.GENERICTYPE_NODE){
				generics.add( hm.get($i.text).getNode());
			}
			else {
				System.out.println("Invalid Object used as a generic, " + $i.text );
			}
		}
		else {
			System.out.println("Identifier "+$i.text+" at line "+$i.line+" is not defined");
			System.exit(0);
		}
	}
	( COMMA f=ID 
	{
		if ( hm.get($f.text) != null){ 
			if ( hm.get($f.text).getNode().getNodeType() == NodeType.GENERICTYPE_NODE){
				generics.add( hm.get($f.text).getNode());
			}
			else {
				System.out.println("Invalid Object used as a generic, " + $f.text );
			}
		}
		else {
			System.out.println("Identifier "+$f.text+" at line "+$f.line+" is not defined");
			System.exit(0);
		}
	}
	)* { $ast = generics; };
		
listType returns [Node ast]
	: LIST SLPAR { Node generic = new EmptyNode(); } 
	( bt=baseType {	generic = $bt.ast; }
	| i=ID
	{
		HashMap<String,STentry> hm= symTable.get(nestingLevel);
		if (hm.get($i.text) != null)
			generic = hm.get($i.text).getNode();
		else{
			System.out.println("Identifier "+ $i.text +" Not recognized "+ $i.line +", generic type ID match");
			System.exit(0);
		}
	}
	) SRPAR { $ast = generic; };
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

LET 		: 'let' ;
IN		: 'in' ;
SEMIC		: ';' ;
COL		: ':' ;
DOUBLECOL	: '::' ;
COMMA		: ',' ;
ASS		: '=' ;
EQ		: '==' ;
LANPAR		: '<';
RANPAR		: '>';
LESSEQ 		: '<=';
GREATEREQ	: '>=';		 
PLUS		: '+' ;
MINUS		: '-';
ARROW		: '->';
OR		: '||';
TIMES		: '*' ;
DIVIDE		: '/';
AND		: '&&';
NAT		: (('1'..'9')('0'..'9')*) | '0';
TRUE		: 'true' ;
FALSE		: 'false' ;
EMPTY   	: 'empty' ;
NOT		: 'not';
VAR 		: 'var' ;
FUN 		: 'fun' ;
LPAR 		: '(' ;
RPAR		: ')' ;
CLPAR 		: '{' ;
CRPAR		: '}' ;
SLPAR 		: '[' ;
SRPAR		: ']' ;
IF 		: 'if' ;
THEN 		: 'then' ;
ELSE 		: 'else' ;
PRINT		: 'print' ;
FIRST   	: 'first' ; 
REST    	: 'rest' ; 
INTTYPE 	: 'int' ;
BOOLTYPE	: 'bool';
LIST		: 'list';

ID 		: ('a'..'z'|'A'..'Z')('a'..'z'|'A'..'Z'|'0'..'9')* ;

WHITESP  	: ( '\t' | ' ' | '\r' | '\n' )+    { skip(); } ;
 
ERR   	 	: . { System.out.println("Invalid char: "+$text); } ; 

