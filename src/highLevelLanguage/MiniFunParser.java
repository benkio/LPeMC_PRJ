// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g 2014-02-07 10:14:56

package highLevelLanguage;

import highLevelLanguage.Node.*;
import java.util.HashMap;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class MiniFunParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LET", "IN", "SEMIC", "VAR", "ID", "COL", "ASS", "FUN", "LPAR", "COMMA", "RPAR", "CLPAR", "CRPAR", "EQ", "LESSEQ", "GREATEREQ", "PLUS", "MINUS", "OR", "TIMES", "DIVIDE", "AND", "NAT", "TRUE", "FALSE", "EMPTY", "IF", "THEN", "ELSE", "SLPAR", "DOUBLECOL", "SRPAR", "FIRST", "REST", "PRINT", "NOT", "INTTYPE", "BOOLTYPE", "ARROW", "WHITESP", "ERR"
    };
    public static final int REST=37;
    public static final int SRPAR=35;
    public static final int CRPAR=16;
    public static final int NOT=39;
    public static final int ID=8;
    public static final int AND=25;
    public static final int NAT=26;
    public static final int EOF=-1;
    public static final int ERR=44;
    public static final int IF=30;
    public static final int DOUBLECOL=34;
    public static final int IN=5;
    public static final int THEN=31;
    public static final int LPAR=12;
    public static final int LESSEQ=18;
    public static final int COMMA=13;
    public static final int COL=9;
    public static final int PLUS=20;
    public static final int VAR=7;
    public static final int EQ=17;
    public static final int DIVIDE=24;
    public static final int GREATEREQ=19;
    public static final int BOOLTYPE=41;
    public static final int ELSE=32;
    public static final int MINUS=21;
    public static final int WHITESP=43;
    public static final int TRUE=27;
    public static final int PRINT=38;
    public static final int EMPTY=29;
    public static final int CLPAR=15;
    public static final int OR=22;
    public static final int ARROW=42;
    public static final int RPAR=14;
    public static final int ASS=10;
    public static final int SLPAR=33;
    public static final int FUN=11;
    public static final int SEMIC=6;
    public static final int TIMES=23;
    public static final int FALSE=28;
    public static final int INTTYPE=40;
    public static final int LET=4;
    public static final int FIRST=36;

    // delegates
    // delegators


        public MiniFunParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public MiniFunParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return MiniFunParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g"; }


        private ArrayList<HashMap<String,STentry>> symTable = new ArrayList<HashMap<String,STentry>>();    
        private int nestingLevel=0;             



    // $ANTLR start "prog"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:20:1: prog returns [Node ast] : LET d= declist IN e= exp SEMIC ;
    public final Node prog() throws RecognitionException {
        Node ast = null;

        ArrayList<Node> d = null;

        Node e = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:21:2: ( LET d= declist IN e= exp SEMIC )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:21:4: LET d= declist IN e= exp SEMIC
            {
            match(input,LET,FOLLOW_LET_in_prog30); 

            	  	HashMap<String,STentry> hm = new HashMap<String,STentry>();
            	   	symTable.add(hm);
            	
            pushFollow(FOLLOW_declist_in_prog52);
            d=declist();

            state._fsp--;

            match(input,IN,FOLLOW_IN_in_prog55); 
            pushFollow(FOLLOW_exp_in_prog59);
            e=exp();

            state._fsp--;

            match(input,SEMIC,FOLLOW_SEMIC_in_prog61); 

            		ast = new ProgNode(d,e);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "prog"


    // $ANTLR start "declist"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:33:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
    public final ArrayList<Node> declist() throws RecognitionException {
        ArrayList<Node> astList = null;

        Token i=null;
        Token fpi=null;
        Token pi=null;
        Node t = null;

        Node e = null;

        Node rt = null;

        Node fpt = null;

        Node pt = null;

        Node at = null;

        ArrayList<Node> dec = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:34:3: ( ( VAR i= ID COL t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:34:4: ( VAR i= ID COL t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            {

            			astList = new ArrayList<Node>();
            	   		int offSet=1;
            	   	
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:39:5: ( VAR i= ID COL t= type ASS e= exp SEMIC | FUN i= ID COL (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            loop6:
            do {
                int alt6=3;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==VAR) ) {
                    alt6=1;
                }
                else if ( (LA6_0==FUN) ) {
                    alt6=2;
                }


                switch (alt6) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:39:6: VAR i= ID COL t= type ASS e= exp SEMIC
            	    {
            	    match(input,VAR,FOLLOW_VAR_in_declist91); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist95); 
            	    match(input,COL,FOLLOW_COL_in_declist97); 
            	    pushFollow(FOLLOW_type_in_declist101);
            	    t=type();

            	    state._fsp--;

            	    match(input,ASS,FOLLOW_ASS_in_declist103); 
            	    pushFollow(FOLLOW_exp_in_declist107);
            	    e=exp();

            	    state._fsp--;

            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist109); 

            	    	   	DecVarNode vn = new DecVarNode((i!=null?i.getText():null),t,e);
            	    	    	STentry entry = new STentry(vn,offSet++);
            	    	    	HashMap<String,STentry> hm= symTable.get(nestingLevel);
            	    	    	
            	    	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	    	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	    	      		System.exit(0);
            	    	      	}
            	    	    	
            	    	    	astList.add(vn);
            	    	    

            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:53:6: FUN i= ID COL (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR ) CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
            	    {
            	    match(input,FUN,FOLLOW_FUN_in_declist129); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist133); 
            	    match(input,COL,FOLLOW_COL_in_declist135); 
            	    DecFunNode fn = null;
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:54:6: (rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR | at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR )
            	    int alt5=2;
            	    int LA5_0 = input.LA(1);

            	    if ( ((LA5_0>=INTTYPE && LA5_0<=BOOLTYPE)) ) {
            	        alt5=1;
            	    }
            	    else if ( (LA5_0==LPAR) ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:55:6: rt= type LPAR (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )? RPAR
            	            {
            	            pushFollow(FOLLOW_type_in_declist153);
            	            rt=type();

            	            state._fsp--;


            	            	   	fn = new DecFunNode((i!=null?i.getText():null),rt);
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	  	
            	            match(input,LPAR,FOLLOW_LPAR_in_declist167); 

            	            		   		
            	            		        int parOffSet=-1;
            	            		        hm = new HashMap<String,STentry>();
            	            		        symTable.add(hm);
            	            		        nestingLevel++;
            	            		 	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:74:7: (fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )* )?
            	            int alt2=2;
            	            int LA2_0 = input.LA(1);

            	            if ( (LA2_0==ID) ) {
            	                alt2=1;
            	            }
            	            switch (alt2) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:75:8: fpi= ID COL fpt= type ( COMMA pi= ID COL pt= type )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist196); 
            	                    match(input,COL,FOLLOW_COL_in_declist198); 
            	                    pushFollow(FOLLOW_type_in_declist202);
            	                    fpt=type();

            	                    state._fsp--;


            	                    			    	ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null),fpt);
            	                    			        entry = new STentry(pn,parOffSet--);
            	                    			        hm.put((fpi!=null?fpi.getText():null),entry);
            	                    			        fn.addParam(pn);
            	                    			  	
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:82:8: ( COMMA pi= ID COL pt= type )*
            	                    loop1:
            	                    do {
            	                        int alt1=2;
            	                        int LA1_0 = input.LA(1);

            	                        if ( (LA1_0==COMMA) ) {
            	                            alt1=1;
            	                        }


            	                        switch (alt1) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:82:9: COMMA pi= ID COL pt= type
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist222); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist226); 
            	                    	    match(input,COL,FOLLOW_COL_in_declist228); 
            	                    	    pushFollow(FOLLOW_type_in_declist232);
            	                    	    pt=type();

            	                    	    state._fsp--;


            	                    	    			    	pn = new ParamNode((pi!=null?pi.getText():null),pt);
            	                    	    			        entry = new STentry(pn,parOffSet--);
            	                    	    			        if (hm.put((pi!=null?pi.getText():null),entry) != null){
            	                    	    			        	System.out.println("Identifier "+(pi!=null?pi.getText():null)+" at line "+(pi!=null?pi.getLine():0)+" already defined");
            	                    	    			           	System.exit(0);}
            	                    	    			          	fn.addParam(pn);
            	                    	    			   	

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop1;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            match(input,RPAR,FOLLOW_RPAR_in_declist262); 

            	            }
            	            break;
            	        case 2 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:94:6: at= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? RPAR
            	            {
            	            pushFollow(FOLLOW_arrowType_in_declist279);
            	            at=arrowType();

            	            state._fsp--;

            	             
            	            	    	fn = new DecFunNode((i!=null?i.getText():null),at);
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	    
            	            match(input,LPAR,FOLLOW_LPAR_in_declist294); 

            	            	    	int parOffSet=-1;
            	            		    hm = new HashMap<String,STentry>();
            	            		    symTable.add(hm);
            	            		    nestingLevel++;
            	            	    	int parIndex=0;
            	            	    
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:113:6: (fpi= ID ( COMMA pi= ID )* )?
            	            int alt4=2;
            	            int LA4_0 = input.LA(1);

            	            if ( (LA4_0==ID) ) {
            	                alt4=1;
            	            }
            	            switch (alt4) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:114:7: fpi= ID ( COMMA pi= ID )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist319); 

            	                    	    		ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
            	                    			    entry = new STentry(pn,parOffSet--);
            	                    			    hm.put((fpi!=null?fpi.getText():null),entry);
            	                    			    fn.addParam(pn);
            	                    	    	
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:121:7: ( COMMA pi= ID )*
            	                    loop3:
            	                    do {
            	                        int alt3=2;
            	                        int LA3_0 = input.LA(1);

            	                        if ( (LA3_0==COMMA) ) {
            	                            alt3=1;
            	                        }


            	                        switch (alt3) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:121:8: COMMA pi= ID
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist337); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist341); 

            	                    	    	    		pn = new ParamNode((pi!=null?pi.getText():null));
            	                    	    			    entry = new STentry(pn,parOffSet--);
            	                    	    			    hm.put((pi!=null?pi.getText():null),entry);
            	                    	    			    fn.addParam(pn);
            	                    	    	    	

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop3;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            match(input,RPAR,FOLLOW_RPAR_in_declist374); 

            	            }
            	            break;

            	    }

            	    match(input,CLPAR,FOLLOW_CLPAR_in_declist389); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:133:6: ( (dec= declist ) e= exp )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:134:7: (dec= declist ) e= exp
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:134:7: (dec= declist )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:134:8: dec= declist
            	    {
            	    pushFollow(FOLLOW_declist_in_declist408);
            	    dec=declist();

            	    state._fsp--;


            	    }


            	    	    		fn.addLocalDeclarationList(dec);
            	    	    	
            	    pushFollow(FOLLOW_exp_in_declist430);
            	    e=exp();

            	    state._fsp--;


            	    	        	fn.addExpValue(e);
            	    	       		symTable.remove(nestingLevel--);
            	    	       		astList.add(fn);
            	    	       	

            	    }

            	    match(input,CRPAR,FOLLOW_CRPAR_in_declist456); 
            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist463); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return astList;
    }
    // $ANTLR end "declist"


    // $ANTLR start "exp"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:148:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
    public final Node exp() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:149:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:149:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            {
            pushFollow(FOLLOW_term_in_exp490);
            f=term();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:150:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case EQ:
                    {
                    alt7=1;
                    }
                    break;
                case LESSEQ:
                    {
                    alt7=2;
                    }
                    break;
                case GREATEREQ:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:150:8: ( EQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:150:8: ( EQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:151:8: EQ l= term
            	    {
            	    match(input,EQ,FOLLOW_EQ_in_exp510); 
            	    pushFollow(FOLLOW_term_in_exp514);
            	    l=term();

            	    state._fsp--;

            	    ast = new EqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:154:9: ( LESSEQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:154:9: ( LESSEQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:155:9: LESSEQ l= term
            	    {
            	    match(input,LESSEQ,FOLLOW_LESSEQ_in_exp554); 
            	    pushFollow(FOLLOW_term_in_exp558);
            	    l=term();

            	    state._fsp--;

            	    ast = new LessEqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:158:9: ( GREATEREQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:158:9: ( GREATEREQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:158:11: GREATEREQ l= term
            	    {
            	    match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp589); 
            	    pushFollow(FOLLOW_term_in_exp593);
            	    l=term();

            	    state._fsp--;

            	    ast = new GreatEqualNode(ast,l);

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "exp"


    // $ANTLR start "term"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:163:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
    public final Node term() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:164:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:164:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            {
            pushFollow(FOLLOW_value_in_term638);
            f=value();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:165:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt8=1;
                    }
                    break;
                case MINUS:
                    {
                    alt8=2;
                    }
                    break;
                case OR:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:166:5: ( PLUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:166:5: ( PLUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:167:5: PLUS l= value
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_term659); 
            	    pushFollow(FOLLOW_value_in_term663);
            	    l=value();

            	    state._fsp--;

            	    ast = new PlusNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:170:9: ( MINUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:170:9: ( MINUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:171:9: MINUS l= value
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_term702); 
            	    pushFollow(FOLLOW_value_in_term706);
            	    l=value();

            	    state._fsp--;

            	    ast = new MinusNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:174:9: ( OR l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:174:9: ( OR l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:175:9: OR l= value
            	    {
            	    match(input,OR,FOLLOW_OR_in_term745); 
            	    pushFollow(FOLLOW_value_in_term749);
            	    l=value();

            	    state._fsp--;

            	    ast = new OrNode(ast,l);

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "term"


    // $ANTLR start "value"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:181:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
    public final Node value() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:182:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:182:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            {
            pushFollow(FOLLOW_fatt_in_value795);
            f=fatt();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:183:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case TIMES:
                    {
                    alt9=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt9=2;
                    }
                    break;
                case AND:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:184:7: ( TIMES l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:184:7: ( TIMES l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:185:8: TIMES l= fatt
            	    {
            	    match(input,TIMES,FOLLOW_TIMES_in_value821); 
            	    pushFollow(FOLLOW_fatt_in_value825);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new TimesNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:188:9: ( DIVIDE l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:188:9: ( DIVIDE l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:189:9: DIVIDE l= fatt
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_value865); 
            	    pushFollow(FOLLOW_fatt_in_value869);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new DivNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:192:9: ( AND l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:192:9: ( AND l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:193:9: AND l= fatt
            	    {
            	    match(input,AND,FOLLOW_AND_in_value908); 
            	    pushFollow(FOLLOW_fatt_in_value912);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new AndNode(ast,l);

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "value"


    // $ANTLR start "fatt"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:198:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
    public final Node fatt() throws RecognitionException {
        Node ast = null;

        Token n=null;
        Token i=null;
        Node e = null;

        Node fp = null;

        Node p = null;

        Node x = null;

        Node y = null;

        Node z = null;

        Node e1 = null;

        Node e2 = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:199:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
            int alt13=12;
            switch ( input.LA(1) ) {
            case NAT:
                {
                alt13=1;
                }
                break;
            case TRUE:
                {
                alt13=2;
                }
                break;
            case FALSE:
                {
                alt13=3;
                }
                break;
            case EMPTY:
                {
                alt13=4;
                }
                break;
            case LPAR:
                {
                alt13=5;
                }
                break;
            case ID:
                {
                alt13=6;
                }
                break;
            case IF:
                {
                alt13=7;
                }
                break;
            case SLPAR:
                {
                alt13=8;
                }
                break;
            case FIRST:
                {
                alt13=9;
                }
                break;
            case REST:
                {
                alt13=10;
                }
                break;
            case PRINT:
                {
                alt13=11;
                }
                break;
            case NOT:
                {
                alt13=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:199:4: n= NAT
                    {
                    n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt959); 
                    ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:201:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_fatt975); 
                    ast = new BoolNode(true);

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:203:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_fatt990); 
                    ast = new BoolNode(false);

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:205:4: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_fatt1002); 
                    ast = new EmptyNode();

                    }
                    break;
                case 5 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:207:4: LPAR e= exp RPAR
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1016); 
                    pushFollow(FOLLOW_exp_in_fatt1020);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1022); 
                    ast = e;

                    }
                    break;
                case 6 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:209:4: i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_fatt1037); 

                    	  	HashMap<String,STentry> hm;
                    	   	STentry entry=null;
                    	   	int declNL;
                    	   	for(declNL=nestingLevel; declNL>=0; declNL--){
                    	   		hm = symTable.get(declNL);
                    	      	entry = hm.get((i!=null?i.getText():null));
                    	      	if (entry != null) break;
                    	   	} 
                    	   	if (entry==null) {
                    	   		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" is not defined");
                    	      	System.exit(0);
                    	    }
                    	   	ast = new VarNode(entry,nestingLevel-declNL);   
                    	
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:225:2: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==LPAR) ) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:226:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_fatt1049); 
                            ArrayList<Node> parList = new ArrayList<Node>();
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:229:3: (fp= exp ( COMMA p= exp )* )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==ID||LA11_0==LPAR||(LA11_0>=NAT && LA11_0<=IF)||LA11_0==SLPAR||(LA11_0>=FIRST && LA11_0<=NOT)) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:230:4: fp= exp ( COMMA p= exp )*
                                    {
                                    pushFollow(FOLLOW_exp_in_fatt1068);
                                    fp=exp();

                                    state._fsp--;

                                    parList.add(fp);
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:231:4: ( COMMA p= exp )*
                                    loop10:
                                    do {
                                        int alt10=2;
                                        int LA10_0 = input.LA(1);

                                        if ( (LA10_0==COMMA) ) {
                                            alt10=1;
                                        }


                                        switch (alt10) {
                                    	case 1 :
                                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:231:5: COMMA p= exp
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_fatt1076); 
                                    	    pushFollow(FOLLOW_exp_in_fatt1080);
                                    	    p=exp();

                                    	    state._fsp--;

                                    	    parList.add(p);

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop10;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_fatt1094); 
                            ast = new FunNode(entry,nestingLevel-declNL,parList);

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:235:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
                    {
                    match(input,IF,FOLLOW_IF_in_fatt1105); 
                    pushFollow(FOLLOW_exp_in_fatt1109);
                    x=exp();

                    state._fsp--;

                    match(input,THEN,FOLLOW_THEN_in_fatt1111); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1113); 
                    pushFollow(FOLLOW_exp_in_fatt1117);
                    y=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1119); 
                    match(input,ELSE,FOLLOW_ELSE_in_fatt1124); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1126); 
                    pushFollow(FOLLOW_exp_in_fatt1130);
                    z=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1132); 
                    ast = new IfNode(x,y,z);

                    }
                    break;
                case 8 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:239:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
                    {
                    match(input,SLPAR,FOLLOW_SLPAR_in_fatt1146); 
                    pushFollow(FOLLOW_exp_in_fatt1150);
                    e1=exp();

                    state._fsp--;

                    match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt1152); 
                    pushFollow(FOLLOW_exp_in_fatt1156);
                    e2=exp();

                    state._fsp--;

                    match(input,SRPAR,FOLLOW_SRPAR_in_fatt1158); 
                    ast = new ListNode(e1,e2);

                    }
                    break;
                case 9 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:242:4: FIRST LPAR e= exp RPAR
                    {
                    match(input,FIRST,FOLLOW_FIRST_in_fatt1171); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1173); 
                    pushFollow(FOLLOW_exp_in_fatt1177);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1179); 
                    ast = new FirstNode(e);

                    }
                    break;
                case 10 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:245:4: REST LPAR e= exp RPAR
                    {
                    match(input,REST,FOLLOW_REST_in_fatt1196); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1198); 
                    pushFollow(FOLLOW_exp_in_fatt1202);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1204); 
                    ast = new RestNode(e);

                    }
                    break;
                case 11 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:248:4: PRINT LPAR e= exp RPAR
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_fatt1221); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1223); 
                    pushFollow(FOLLOW_exp_in_fatt1227);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1229); 
                    ast = new PrintNode(e);

                    }
                    break;
                case 12 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:251:4: NOT LPAR e= exp RPAR
                    {
                    match(input,NOT,FOLLOW_NOT_in_fatt1246); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1248); 
                    pushFollow(FOLLOW_exp_in_fatt1252);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1254); 
                    ast = new NotNode(e);

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "fatt"


    // $ANTLR start "type"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:255:1: type returns [Node ast] : ( INTTYPE | BOOLTYPE );
    public final Node type() throws RecognitionException {
        Node ast = null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:256:2: ( INTTYPE | BOOLTYPE )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==INTTYPE) ) {
                alt14=1;
            }
            else if ( (LA14_0==BOOLTYPE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:256:4: INTTYPE
                    {
                    match(input,INTTYPE,FOLLOW_INTTYPE_in_type1279); 
                    ast = new IntTypeNode();

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:257:6: BOOLTYPE
                    {
                    match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_type1291); 
                    ast = new BoolTypeNode();

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "type"


    // $ANTLR start "arrowType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:260:1: arrowType returns [Node ast] : LPAR ( (t1= type ( COMMA tn= type )* )? | at= arrowType ) RPAR ARROW rt= type ;
    public final Node arrowType() throws RecognitionException {
        Node ast = null;

        Node t1 = null;

        Node tn = null;

        Node at = null;

        Node rt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:261:3: ( LPAR ( (t1= type ( COMMA tn= type )* )? | at= arrowType ) RPAR ARROW rt= type )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:261:6: LPAR ( (t1= type ( COMMA tn= type )* )? | at= arrowType ) RPAR ARROW rt= type
            {
            match(input,LPAR,FOLLOW_LPAR_in_arrowType1313); 
            ArrowTypeNode atn= new ArrowTypeNode();
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:5: ( (t1= type ( COMMA tn= type )* )? | at= arrowType )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RPAR||(LA17_0>=INTTYPE && LA17_0<=BOOLTYPE)) ) {
                alt17=1;
            }
            else if ( (LA17_0==LPAR) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:6: (t1= type ( COMMA tn= type )* )?
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:6: (t1= type ( COMMA tn= type )* )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( ((LA16_0>=INTTYPE && LA16_0<=BOOLTYPE)) ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:7: t1= type ( COMMA tn= type )*
                            {
                            pushFollow(FOLLOW_type_in_arrowType1325);
                            t1=type();

                            state._fsp--;

                            atn.addParType(t1); 
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:42: ( COMMA tn= type )*
                            loop15:
                            do {
                                int alt15=2;
                                int LA15_0 = input.LA(1);

                                if ( (LA15_0==COMMA) ) {
                                    alt15=1;
                                }


                                switch (alt15) {
                            	case 1 :
                            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:43: COMMA tn= type
                            	    {
                            	    match(input,COMMA,FOLLOW_COMMA_in_arrowType1329); 
                            	    pushFollow(FOLLOW_type_in_arrowType1333);
                            	    tn=type();

                            	    state._fsp--;

                            	    atn.addParType(tn);

                            	    }
                            	    break;

                            	default :
                            	    break loop15;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:262:90: at= arrowType
                    {
                    pushFollow(FOLLOW_arrowType_in_arrowType1345);
                    at=arrowType();

                    state._fsp--;


                    }
                    break;

            }

            match(input,RPAR,FOLLOW_RPAR_in_arrowType1352); 
            match(input,ARROW,FOLLOW_ARROW_in_arrowType1354); 
            pushFollow(FOLLOW_type_in_arrowType1358);
            rt=type();

            state._fsp--;

             
             			atn.addRetType(rt); 
             			ast =atn;
             		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ast;
    }
    // $ANTLR end "arrowType"

    // Delegated rules


 

    public static final BitSet FOLLOW_LET_in_prog30 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_declist_in_prog52 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IN_in_prog55 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_prog59 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_prog61 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_declist91 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist95 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist97 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_declist101 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASS_in_declist103 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_declist107 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist109 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_FUN_in_declist129 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist133 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist135 = new BitSet(new long[]{0x0000030000001000L});
    public static final BitSet FOLLOW_type_in_declist153 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_declist167 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_ID_in_declist196 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist198 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_declist202 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_declist222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist226 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist228 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_declist232 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_declist262 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_arrowType_in_declist279 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_declist294 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_ID_in_declist319 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_declist337 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist341 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_declist374 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_declist389 = new BitSet(new long[]{0x000000F27C001980L});
    public static final BitSet FOLLOW_declist_in_declist408 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_declist430 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_declist456 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist463 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_term_in_exp490 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_EQ_in_exp510 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp514 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_LESSEQ_in_exp554 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp558 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_GREATEREQ_in_exp589 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp593 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_value_in_term638 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_PLUS_in_term659 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term663 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_MINUS_in_term702 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term706 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_OR_in_term745 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term749 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_fatt_in_value795 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_TIMES_in_value821 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value825 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_DIVIDE_in_value865 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value869 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_AND_in_value908 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value912 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_NAT_in_fatt959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_fatt975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_fatt990 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_fatt1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1016 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1020 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fatt1037 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1049 = new BitSet(new long[]{0x000000F27C005100L});
    public static final BitSet FOLLOW_exp_in_fatt1068 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_fatt1076 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1080 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_fatt1105 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1109 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_in_fatt1111 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1113 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1117 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1119 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSE_in_fatt1124 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1126 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1130 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLPAR_in_fatt1146 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1150 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt1152 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1156 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SRPAR_in_fatt1158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_fatt1171 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1173 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1177 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REST_in_fatt1196 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1198 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1202 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_fatt1221 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1223 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1227 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fatt1246 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1248 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1252 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTYPE_in_type1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLTYPE_in_type1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_arrowType1313 = new BitSet(new long[]{0x0000030000005000L});
    public static final BitSet FOLLOW_type_in_arrowType1325 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_arrowType1329 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_arrowType1333 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_arrowType_in_arrowType1345 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_arrowType1352 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ARROW_in_arrowType1354 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_type_in_arrowType1358 = new BitSet(new long[]{0x0000000000000002L});

}