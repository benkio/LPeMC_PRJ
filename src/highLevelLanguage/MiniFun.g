grammar MiniFun;

@header {
package highLevelLanguage;

import highLevelLanguage.Node.*;
import java.util.HashMap;
import java.util.ArrayList;
}

@members {
 /*     
    private int[] code = new int[ExecuteVM.CODESIZE];    
    private int i = 0;
    private HashMap<String,Integer> labelAddress = new HashMap<String,Integer>();
    private ArrayList<String> labels = new ArrayList<String>();
    private ArrayList<Integer> addresses  = new ArrayList<Integer>();
    
    public int[] createCode() throws Exception {
       assembly();
       return code;
    }
   */ 
   
   
   /*SymbleTable che � diventato un Arraylist per gestire tutti i vari possibili scoping*/
   private ArrayList<HashMap<String,STentry>> symTable = new ArrayList<HashMap<String,STentry>>();
   private int nestingLevel;	//Tiene traccia a quale livello di nesting siamo
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/
 
 prog	returns [Node ast]
 	: LET 
 	{	/*Instanziazione della prima symble table globale*/
 		 HashMap<String,STentry> hm = new HashMap<String,STentry>();	
 		 symTable.add(hm);
 	}
 	  d=declist
 	  IN e=exp SEMIC
 	{$ast = new ProgNode($d.astList,$e.ast); }  
 	;

/*
	solo exp e type hanno degli alberi associati, id � solo un token
	Inserisco anche l'offset della prima variabile (ad 1) e poi ogni volta che
	trovo una nuova variabile aggiungo un offset diverso.
	La aggiungo qui perch� quando avremo funzioni di funzioni poi l'offset diventa relativo
	alla funzione che � in esecuzione, ogni volta che parte una decList allora devo ricominciare
	con l'offset.
*/

declist returns [ArrayList<Node> astList]
	: {$astList = new ArrayList<Node>();
	   int offSet = 1;} 
	  (VAR i=ID COL t=type ASS e=exp SEMIC
	  {	
	  	DecVarNode vn = new DecVarNode($i.text ,$t.ast ,$e.ast);
	  	STentry entry = new STentry(vn,offSet++); /*Metto il puntatore a quel nodo e il suo relativo offSet*/
	  	/*
	  		Inserisco il STentry nella symbol table incui ci sar� il puntatore a quel nodo
	  		associandolo al nome dell ID.
	  		Se ci restituisce null va bene perch� ho inserito un nuovo valore
	  		Se invece � != null allora avevo gi� la variabile presente. ERRORE.
	  	*/
	  	HashMap<String,STentry> hm = symTable.get(nestingLevel);
		if (hm.put($i.text,entry) != null) //Controllo semantico [Multiple Declaration]
		{
			System.out.println("identifer "+ $i.text +" at line "+ $i.line + "already defined."); 
			System.exit(0);
		}
	  	$astList.add(vn);
	  }
	 | FUN i=ID COL t=type {
	 		    /*
		 		    Introdotto il caricamento e controllo sulla simble table principale del symble entry della funzione
		 		    creato il nodo del AST associato al nodo della funzione, ma non completamente, queste informazioni verranno
		 		    leggendo poi i singoli parametri.
	 		    */
	 		    
	 		    DecFunNode fn = new DecFunNode($i.text,$t.ast);
	 		    STentry entry = new STentry(fn,offSet++);
	 		    
	 		    HashMap<String,STentry> ParentHm = symTable.get(nestingLevel);
	 		    if (ParentHm.put($i.text,entry) != null) //Controllo semantico [Multiple Declaration]
				{
					System.out.println("identifer "+ $i.text +" at line "+ $i.line + "already defined."); 
					System.exit(0);
				}
	 		    }
	  LPAR {
	   	/*
	   		Instanziata una nuova simble table che conterr� i parametri della funzione 
	   		Aumentato il nesting level
	   	*/
	   	int parOffSet=-1;
	   	HashMap<String,STentry> FunHm = new HashMap<String,STentry>();	
           	symTable.add(FunHm);
           	nestingLevel++;
	   }
	   (p1=ID COL t1=type{
	   		/*
	   			Introdurre nella hashmap della funzione, quindi annidata, i parametri
	   			Aggiornato l'AST della funzione
	   		*/
	   			ParamNode param = new ParamNode($p1.text,$t1.ast);
	   			entry = new STentry(param,parOffSet--);
	   			FunHm.put($p1.text,entry);
	   			fn.addParam(param);
	   		}
	   (COMMA p=ID COL t=type 	{   
			   		/*
			   			Introdurre nella hashmap della funzione, quindi annidata, i parametri
			   			Aggiornato l'AST della funzione
			   		*/
	   				param = new ParamNode($p.text,$t.ast);
	   				entry = new STentry(param,parOffSet--);
	   				if (FunHm.put($p.text,entry) != null)
	   				{
	   					System.out.println("Param "+ $p.text +" at line "+ $p.line + "already defined."); 
						System.exit(0);
	   				}
	   				fn.addParam(param);
	   			}
	   )*)?  
	  RPAR
	  CLPAR
	  	e=exp 	{
	  	 	/*
	  			Introdurre nel nodo funzione il valore del nodo della expressione 
	  			Aggiungere al nodo decVarList il nodo della dichiarazione di funzione
	  		*/ 
	  		fn.addExpValue($e.ast);
	  		$astList.add(fn);
	  		}
	  CRPAR	
	  SEMIC
	  { 
	  /*
	  	Elimino l'hashmap perch� non mi serve pi� avendo finito il lifetime della funzione.
	  */
	  symTable.remove(nestingLevel--); 
	  }
	  )*;
	

exp	returns [Node ast]
	: r=term {$ast = $r.ast;}
	(EQ l=term  {$ast = new EqualNode($ast, $l.ast);} 
	|GREATEQ l=term  {$ast = new GreatEqualNode($ast, $l.ast);} 
	|LESSEQ l=term  {$ast = new LessEqualNode($ast, $l.ast);} )*
	;

value	returns [Node ast]
	: r=fatt {$ast = $r.ast;}
	(	TIMES l=fatt {$ast = new TimesNode($ast, $l.ast);}
	|	DIV l=fatt {$ast = new DivNode($ast, $l.ast);}
	|	AND l=fatt {$ast = new AndNode($ast, $l.ast);}	)* 
	;

term	returns [Node ast]
	: r=value {$ast = $r.ast;}
	(	PLUS 	l=value {$ast = new PlusNode($ast, $l.ast);}
	|	MINUS	l=value {$ast = new MinusNode($ast, $l.ast);}
	|	OR 	l=value {$ast = new OrNode($ast, $l.ast);})*;

fatt	returns [Node ast]
	: n=NAT {$ast = new NatNode(Integer.parseInt($n.text));}
	| TRUE  {$ast = new BoolNode(true);}
	| FALSE {$ast = new BoolNode(false);}
	| EMPTY {$ast = new EmptyNode();}
	| LPAR e=exp RPAR {$ast = $e.ast;}
	| i=ID {
		STentry entry = null;
		/*
			Attenzione, non bisogna accontentarsi di guardare alla hashmap corrente ma tramite un ciclo controllare 
			se la variabile � globale, solo nel caso non esistesse anche cos� allora bisogna dare errore.		
		*/
		int declNL;
		 for (declNL = nestingLevel; declNL>=0; declNL--){
		 	HashMap<String,STentry> hm = symTable.get(declNL);
			entry = hm.get($i.text);
			if (entry != null)
				break;
		 }
		 if (entry == null)	
		 	{
				System.out.println("identifer "+ $i.text +" at line "+ $i.line + "is not defined."); 
				System.exit(0);
			}
		 $ast = new VarNode(entry,nestingLevel-declNL);	 /*Il secondo parametro mi dice a che livello ho trovato la variabile*/
		}
	( LPAR 
	{
		/*
			Capisco che si tratta di una chiamata a funzione
			Controllo se effettivamente � presente una dichiarazione di funzione
			 e quindi creo una arraylist di parametri 
			da aggiungere al nodo, questa mi servir� poi per effettuare il type checking e per passare
			adeguatamente i parametri al corpo della funzione
		*/
		ArrayList<Node> params = new ArrayList<Node>();
	}
	(p1=exp
	{
		params.add($p1.ast);	
	} 
	(COMMA p=exp { params.add($p.ast); } )*)?
	 RPAR
	 {
	 	$ast = new FunNode(entry, nestingLevel-declNL, params);
	 }	
	 )?	
	| IF x=exp THEN CLPAR y=exp CRPAR 
		   ELSE CLPAR z=exp CRPAR
	  {$ast = new IfNode($x.ast,$y.ast,$z.ast);}
	| SLPAR e1=exp DOUBLECOL e2=exp SRPAR  
	  {$ast = new ListNode($e1.ast,$e2.ast);}
	| FIRST LPAR e=exp RPAR{$ast = new FirstNode($e.ast);}
	| REST LPAR e=exp RPAR{$ast = new RestNode($e.ast);}
	| PRINT  LPAR p=exp RPAR
	  {$ast = new PrintNode($p.ast);}    
	| NOT LPAR e=exp RPAR {$ast = new NotNode($e.ast);} ;
	
type	returns [Node ast]
	: INTTYPE {$ast = new IntTypeNode();}
	| BOOLTYPE{$ast = new BoolTypeNode();}
	;
	
	
	
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/
 

COMMA	 : ',';
COL	 : ':';
SEMIC	 : ';';
ASS	 : '=';
TIMES	 : '*';
DIV	 : '/';
PLUS	 : '+';
MINUS	 : '-';
LPAR	 : '(';
RPAR	 : ')';
CRPAR	 : '}';
CLPAR	 : '{';
SLPAR	 : '[';
SRPAR	 : ']';
OR	 : '||';
AND	 : '&&';
EQ	 : '==';
GREATEQ	 : '>=';
LESSEQ	 : '<=';
DOUBLECOL: '::';
IF	 : 'if';
IN	 : 'in';
LET	 : 'let';
INTTYPE	 : 'int';
VAR	 : 'var';
FUN	 : 'fun';
NOT	 : 'not';
BOOLTYPE : 'bool';	
THEN	 : 'then';
ELSE	 : 'else';
TRUE	 : 'true';
REST	 : 'rest';
PRINT	 : 'print';
EMPTY	 : 'empty';
FIRST	 : 'first';
FALSE	 : 'false';
NAT	 : '0' | ('1'..'9')('0'..'9')* ;
ID	 : ('a'..'z'|'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ; 


WHITESP  : ( '\t' | ' ' | '\r' | '\n' )+    { skip(); } ;
 
ERR   	 : . { System.out.println("Invalid char: "+$text); } ; 
 