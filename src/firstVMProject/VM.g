grammar VM;

@header {
import java.util.HashMap;
import java.util.ArrayList;
}

@members {
      
    private int[] code = new int[ExecuteVM.CODESIZE];    
    private int i = 0;
    private HashMap<String,Integer> labelAddress = new HashMap<String,Integer>();
    private ArrayList<String> labels = new ArrayList<String>();
    private ArrayList<Integer> addresses  = new ArrayList<Integer>();
    
    public int[] createCode() throws Exception {
       assembly();
       return code;
    }
    
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

assembly: ( PUSH e=NUMBER   {code[i++] = PUSH; 
			     code[i++] = Integer.parseInt($e.text);}
			     /*Added By me :D 
			     	idea: same of the branch. with the post-label scanning 
			     	the right addess is inserted in the code array.
			     	After in the VM this address will be pushed in the stack.
			       */
	  | PUSH l=LABEL    {code[i++] = PUSH; 
	  		     labels.add($l.text);
	  		     addresses.add(new Integer(i)); 
	  		     code[i++] = 0;}
	  		     
	  | POP		    {code[i++] = POP;}	
	  | ADD		    {code[i++] = ADD;}
	  | SUB		    {code[i++] = SUB;}
	  | MULT	    {code[i++] = MULT;}
	  | DIV		    {code[i++] = DIV;}
	  
	  		    /*Added By me :D*/
	  | SW		    {code[i++] = SW;}
	  | LW		    {code[i++] = LW;}
	  | BRANCHEQUAL	l=LABEL   
	  		    {code[i++] = BRANCHEQUAL;
	  		     labels.add($l.text);
	  		     addresses.add(new Integer(i)); 
	  		     code[i++] = 0;}
	  | JS		    {code[i++] = JS;}
	  /*Register <-> stack operations */
	  | LRA		    {code[i++] = LRA;}
	  | SRA		    {code[i++] = SRA;}
	  | LRV		    {code[i++] = LRV;}
  	  | SRV		    {code[i++] = SRV;}
	  | LHP		    {code[i++] = LHP;}
	  | SHP		    {code[i++] = SHP;}
	  | LFP		    {code[i++] = LFP;}
	  | SFP		    {code[i++] = SFP;}
	  | CFP		    {code[i++] = CFP;}
	  	  
	  | e=LABEL COL     {labelAddress.put($e.text,new Integer(i));}
	  | BRANCH e=LABEL  {code[i++] = BRANCH;
	  		     labels.add($e.text);
	  		     addresses.add(new Integer(i)); 
	  		     code[i++] = 0;}
	  | BRANCHLESS e=LABEL 
	                    {code[i++] = BRANCHLESS;
	  	  	     labels.add($e.text);
	  		     addresses.add(new Integer(i)); 
	  		     code[i++] = 0;}
	  | BRANCHGREAT e=LABEL
	  		    {code[i++] = BRANCHGREAT;
	  	  	     labels.add($e.text);
	  		     addresses.add(new Integer(i)); 
	  		     code[i++] = 0;}
	  | PRINT           {code[i++] = PRINT;}
	  | HALT            {code[i++] = HALT;}
	  )* {  for (int ind=0; ind<labels.size(); ind++) {
        	  Integer t = labelAddress.get(labels.get(ind));
        	  Integer a = addresses.get(ind);
		  code[a.intValue()]=t.intValue(); 
                }
              }
 ;
 	 
/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

PUSH  	 : 'push' ; 	// constant in the stack
POP	 : 'pop' ; 	// removes top of stack
ADD	 : 'add' ;  	// add two values from the stack
SUB	 : 'sub' ;	// add two values from the stack
MULT	 : 'mult' ;  	// add two values from the stack
DIV	 : 'div' ;	// add two values from the stack
BRANCH	 : 'b' ;	// jump to label
BRANCHLESS:'bless' ;	// jump to label if top <= next
PRINT	 : 'print' ;	// print top of stack
HALT	 : 'halt' ;	// stop executions

//Token Added by Benkio
SW	 : 'sw';	// Push in the address at the top of the stack the value under the top of the stack.
LW	 : 'lw';	// Push in the stack the value of the cell with the address of the top of the stack.
BRANCHEQUAL:'beq';	// Jump to label if top = next
JS	 : 'js';	// Save in ra register the current istruction pointer value and jump to the instruction address in the top of the stack
LRA	 : 'lra';	// Push the value of ra register at the top of the stack
SRA	 : 'sra';	// Set the ra register with the top of the stack
LRV	 : 'lrv';	// Push the rv register at the top of the stack
SRV	 : 'srv';	// Set the rv register with the top of the stack
LHP	 : 'lhp';	// Push the hp register at the top of the stack
SHP	 : 'shp';	// Set the hp register with the top of the stack
LFP	 : 'lfp';	// Push the fp register at the top of the stack
SFP	 : 'sfp';	// Set the fp register with the top of the stack
CFP	 : 'cfp';	// Copy the stack pointer value in the fp register
BRANCHGREAT
	: 'bgreat';

COL	 : ':' ;
LABEL	 : ('a'..'z'|'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9')* ;
NUMBER	 : '0' | ('-')?(('1'..'9')('0'..'9')*) ;

WHITESP  : ( '\t' | ' ' | '\r' | '\n' )+    { skip(); } ;
 
ERR   	 : . { System.out.println("Invalid char: "+$text); } ; 

