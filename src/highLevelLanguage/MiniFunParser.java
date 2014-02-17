// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g 2014-02-17 15:56:30

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LET", "IN", "SEMIC", "VAR", "ID", "COL", "ASS", "FUN", "LPAR", "COMMA", "RPAR", "CLPAR", "CRPAR", "EQ", "LESSEQ", "GREATEREQ", "PLUS", "MINUS", "OR", "TIMES", "DIVIDE", "AND", "NAT", "TRUE", "FALSE", "EMPTY", "IF", "THEN", "ELSE", "SLPAR", "DOUBLECOL", "SRPAR", "FIRST", "REST", "PRINT", "NOT", "INTTYPE", "BOOLTYPE", "ARROW", "GENERICTYPE", "WHITESP", "ERR"
    };
    public static final int REST=37;
    public static final int SRPAR=35;
    public static final int CRPAR=16;
    public static final int NOT=39;
    public static final int ID=8;
    public static final int AND=25;
    public static final int NAT=26;
    public static final int EOF=-1;
    public static final int ERR=45;
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
    public static final int WHITESP=44;
    public static final int TRUE=27;
    public static final int PRINT=38;
    public static final int EMPTY=29;
    public static final int GENERICTYPE=43;
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:24:1: prog returns [Node ast] : LET d= declist IN e= exp SEMIC ;
    public final Node prog() throws RecognitionException {
        Node ast = null;

        ArrayList<Node> d = null;

        Node e = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:25:2: ( LET d= declist IN e= exp SEMIC )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:25:4: LET d= declist IN e= exp SEMIC
            {
            match(input,LET,FOLLOW_LET_in_prog43); 

            	  	HashMap<String,STentry> hm = new HashMap<String,STentry>();
            	   	symTable.add(hm);
            	
            pushFollow(FOLLOW_declist_in_prog65);
            d=declist();

            state._fsp--;

            match(input,IN,FOLLOW_IN_in_prog68); 
            pushFollow(FOLLOW_exp_in_prog72);
            e=exp();

            state._fsp--;

            match(input,SEMIC,FOLLOW_SEMIC_in_prog74); 

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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID COL rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
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

        ArrayList<Node> dec = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:38:3: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID COL rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:38:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID COL rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            {

            			astList = new ArrayList<Node>();
            	   		int offSet=1;
            	   	
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:43:5: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID COL rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==VAR) ) {
                    alt5=1;
                }
                else if ( (LA5_0==FUN) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:43:6: VAR i= ID COL t= baseType ASS e= exp SEMIC
            	    {
            	    match(input,VAR,FOLLOW_VAR_in_declist104); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist108); 
            	    match(input,COL,FOLLOW_COL_in_declist110); 
            	    pushFollow(FOLLOW_baseType_in_declist114);
            	    t=baseType();

            	    state._fsp--;

            	    match(input,ASS,FOLLOW_ASS_in_declist116); 
            	    pushFollow(FOLLOW_exp_in_declist120);
            	    e=exp();

            	    state._fsp--;

            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist122); 

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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:57:6: FUN i= ID COL rt= type LPAR (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )? RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
            	    {
            	    match(input,FUN,FOLLOW_FUN_in_declist142); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist146); 
            	    DecFunNode fn = null;
            	    match(input,COL,FOLLOW_COL_in_declist150); 
            	    pushFollow(FOLLOW_type_in_declist154);
            	    rt=type();

            	    state._fsp--;


            	    	   		if(rt.getNodeType()==NodeType.ARROWTYPE_NODE){
            	    	   			fn = new DecArrowFunNode((i!=null?i.getText():null),rt);}
            	    	   		else{
            	    		   		fn = new DecFunNode((i!=null?i.getText():null),rt);
            	    	   		}
            	    	    	STentry entry = new STentry(fn,offSet++);
            	    	    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	    	    	
            	    	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	    	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	    	      		System.exit(0);
            	    	      	}
            	    	  	
            	    match(input,LPAR,FOLLOW_LPAR_in_declist169); 

            	    		   		
            	    		        int parOffSet=-1;
            	    		        hm = new HashMap<String,STentry>();
            	    		        symTable.add(hm);
            	    		        nestingLevel++;
            	    		        int parCont=0;
            	    		 	
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:81:7: (fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )* )?
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==ID) ) {
            	        alt4=1;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:82:8: fpi= ID ( COL fpt= type )? ( COMMA pi= ID ( COL pt= type )? )*
            	            {
            	            fpi=(Token)match(input,ID,FOLLOW_ID_in_declist198); 
            	            ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:82:58: ( COL fpt= type )?
            	            int alt1=2;
            	            int LA1_0 = input.LA(1);

            	            if ( (LA1_0==COL) ) {
            	                alt1=1;
            	            }
            	            switch (alt1) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:82:59: COL fpt= type
            	                    {
            	                    match(input,COL,FOLLOW_COL_in_declist203); 
            	                    pushFollow(FOLLOW_type_in_declist207);
            	                    fpt=type();

            	                    state._fsp--;

            	                    pn.addType(fpt); if(fpt.getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}

            	                    }
            	                    break;

            	            }


            	            			    	if(rt.getNodeType() == NodeType.ARROWTYPE_NODE){
            	            			    		Node tp = ((ArrowTypeNode)rt).getParType(parCont);
            	            			    		
            	            			    		
            	            			    		if( tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
            	            			    			parOffSet-=1;
            	            			    		}
            	            			    		System.out.println(parOffSet);
            	            			    		pn.addType(tp);
            	            			    	}
            	            			       	entry = new STentry(pn,parOffSet--);
            	            			        hm.put((fpi!=null?fpi.getText():null),entry);
            	            			        fn.addParam(pn);
            	            			        parCont++;
            	            			  	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:99:8: ( COMMA pi= ID ( COL pt= type )? )*
            	            loop3:
            	            do {
            	                int alt3=2;
            	                int LA3_0 = input.LA(1);

            	                if ( (LA3_0==COMMA) ) {
            	                    alt3=1;
            	                }


            	                switch (alt3) {
            	            	case 1 :
            	            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:99:9: COMMA pi= ID ( COL pt= type )?
            	            	    {
            	            	    match(input,COMMA,FOLLOW_COMMA_in_declist231); 
            	            	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist235); 
            	            	    pn = new ParamNode((pi!=null?pi.getText():null));
            	            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:99:54: ( COL pt= type )?
            	            	    int alt2=2;
            	            	    int LA2_0 = input.LA(1);

            	            	    if ( (LA2_0==COL) ) {
            	            	        alt2=1;
            	            	    }
            	            	    switch (alt2) {
            	            	        case 1 :
            	            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:99:55: COL pt= type
            	            	            {
            	            	            match(input,COL,FOLLOW_COL_in_declist241); 
            	            	            pushFollow(FOLLOW_type_in_declist245);
            	            	            pt=type();

            	            	            state._fsp--;

            	            	            pn.addType(pt); if(pt.getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}

            	            	            }
            	            	            break;

            	            	    }


            	            	    			    	if(rt.getNodeType() == NodeType.ARROWTYPE_NODE){
            	            	    			    		Node tp =((ArrowTypeNode) rt).getParType(parCont);
            	            	    			    		
            	            	    			    		if(tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
            	            	    			    			parOffSet-=1;
            	            	    			    		}
            	            	    			    		System.out.println(parOffSet);
            	            	    			    		pn.addType(tp);
            	            	    			    		parCont++;
            	            	    			    	}
            	            	    			    	
            	            	    			        entry = new STentry(pn,parOffSet--);
            	            	    			        if (hm.put((pi!=null?pi.getText():null),entry) != null){
            	            	    			        	System.out.println("Identifier "+(pi!=null?pi.getText():null)+" at line "+(pi!=null?pi.getLine():0)+" already defined");
            	            	    			           	System.exit(0);
            	            	    			        }
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

            	    match(input,RPAR,FOLLOW_RPAR_in_declist278); 
            	    match(input,CLPAR,FOLLOW_CLPAR_in_declist287); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:122:6: ( (dec= declist ) e= exp )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:123:7: (dec= declist ) e= exp
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:123:7: (dec= declist )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:123:8: dec= declist
            	    {
            	    pushFollow(FOLLOW_declist_in_declist306);
            	    dec=declist();

            	    state._fsp--;


            	    }


            	    	    		fn.addLocalDeclarationList(dec);
            	    	    	
            	    pushFollow(FOLLOW_exp_in_declist328);
            	    e=exp();

            	    state._fsp--;


            	    	        	fn.addExpValue(e);
            	    	       		symTable.remove(nestingLevel--);
            	    	       		astList.add(fn);
            	    	       	

            	    }

            	    match(input,CRPAR,FOLLOW_CRPAR_in_declist354); 
            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist361); 

            	    }
            	    break;

            	default :
            	    break loop5;
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:137:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
    public final Node exp() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:138:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:138:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            {
            pushFollow(FOLLOW_term_in_exp388);
            f=term();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:139:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            loop6:
            do {
                int alt6=4;
                switch ( input.LA(1) ) {
                case EQ:
                    {
                    alt6=1;
                    }
                    break;
                case LESSEQ:
                    {
                    alt6=2;
                    }
                    break;
                case GREATEREQ:
                    {
                    alt6=3;
                    }
                    break;

                }

                switch (alt6) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:139:8: ( EQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:139:8: ( EQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:140:8: EQ l= term
            	    {
            	    match(input,EQ,FOLLOW_EQ_in_exp408); 
            	    pushFollow(FOLLOW_term_in_exp412);
            	    l=term();

            	    state._fsp--;

            	    ast = new EqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:143:9: ( LESSEQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:143:9: ( LESSEQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:144:9: LESSEQ l= term
            	    {
            	    match(input,LESSEQ,FOLLOW_LESSEQ_in_exp452); 
            	    pushFollow(FOLLOW_term_in_exp456);
            	    l=term();

            	    state._fsp--;

            	    ast = new LessEqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:147:9: ( GREATEREQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:147:9: ( GREATEREQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:147:11: GREATEREQ l= term
            	    {
            	    match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp487); 
            	    pushFollow(FOLLOW_term_in_exp491);
            	    l=term();

            	    state._fsp--;

            	    ast = new GreatEqualNode(ast,l);

            	    }


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
        return ast;
    }
    // $ANTLR end "exp"


    // $ANTLR start "term"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:152:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
    public final Node term() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:153:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:153:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            {
            pushFollow(FOLLOW_value_in_term536);
            f=value();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:154:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            loop7:
            do {
                int alt7=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt7=1;
                    }
                    break;
                case MINUS:
                    {
                    alt7=2;
                    }
                    break;
                case OR:
                    {
                    alt7=3;
                    }
                    break;

                }

                switch (alt7) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:155:5: ( PLUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:155:5: ( PLUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:156:5: PLUS l= value
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_term557); 
            	    pushFollow(FOLLOW_value_in_term561);
            	    l=value();

            	    state._fsp--;

            	    ast = new PlusNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:159:9: ( MINUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:159:9: ( MINUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:160:9: MINUS l= value
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_term600); 
            	    pushFollow(FOLLOW_value_in_term604);
            	    l=value();

            	    state._fsp--;

            	    ast = new MinusNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:163:9: ( OR l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:163:9: ( OR l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:164:9: OR l= value
            	    {
            	    match(input,OR,FOLLOW_OR_in_term643); 
            	    pushFollow(FOLLOW_value_in_term647);
            	    l=value();

            	    state._fsp--;

            	    ast = new OrNode(ast,l);

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
    // $ANTLR end "term"


    // $ANTLR start "value"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:170:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
    public final Node value() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:171:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:171:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            {
            pushFollow(FOLLOW_fatt_in_value693);
            f=fatt();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:172:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case TIMES:
                    {
                    alt8=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt8=2;
                    }
                    break;
                case AND:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:173:7: ( TIMES l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:173:7: ( TIMES l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:174:8: TIMES l= fatt
            	    {
            	    match(input,TIMES,FOLLOW_TIMES_in_value719); 
            	    pushFollow(FOLLOW_fatt_in_value723);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new TimesNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:177:9: ( DIVIDE l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:177:9: ( DIVIDE l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:178:9: DIVIDE l= fatt
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_value763); 
            	    pushFollow(FOLLOW_fatt_in_value767);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new DivNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:181:9: ( AND l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:181:9: ( AND l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:182:9: AND l= fatt
            	    {
            	    match(input,AND,FOLLOW_AND_in_value806); 
            	    pushFollow(FOLLOW_fatt_in_value810);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new AndNode(ast,l);

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
    // $ANTLR end "value"


    // $ANTLR start "fatt"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:187:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:188:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
            int alt12=12;
            switch ( input.LA(1) ) {
            case NAT:
                {
                alt12=1;
                }
                break;
            case TRUE:
                {
                alt12=2;
                }
                break;
            case FALSE:
                {
                alt12=3;
                }
                break;
            case EMPTY:
                {
                alt12=4;
                }
                break;
            case LPAR:
                {
                alt12=5;
                }
                break;
            case ID:
                {
                alt12=6;
                }
                break;
            case IF:
                {
                alt12=7;
                }
                break;
            case SLPAR:
                {
                alt12=8;
                }
                break;
            case FIRST:
                {
                alt12=9;
                }
                break;
            case REST:
                {
                alt12=10;
                }
                break;
            case PRINT:
                {
                alt12=11;
                }
                break;
            case NOT:
                {
                alt12=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:188:4: n= NAT
                    {
                    n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt857); 
                    ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:190:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_fatt873); 
                    ast = new BoolNode(true);

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:192:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_fatt888); 
                    ast = new BoolNode(false);

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:194:4: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_fatt900); 
                    ast = new EmptyNode();

                    }
                    break;
                case 5 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:196:4: LPAR e= exp RPAR
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_fatt914); 
                    pushFollow(FOLLOW_exp_in_fatt918);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt920); 
                    ast = e;

                    }
                    break;
                case 6 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:198:4: i= ID ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_fatt935); 

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

                    		NodeType nt= entry.getNode().getNodeType();
                    		
                    		if((nt == NodeType.DECFUN_NODE)||(nt==NodeType.DECARROWFUN_NODE)){
                    			ast = new FunParNode(entry,nestingLevel-declNL);
                    	   	}
                    	   	else {
                    	   		ast = new VarNode(entry,nestingLevel-declNL); 
                    	   	}
                    	
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:222:2: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LPAR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:223:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_fatt947); 
                            ArrayList<Node> parList = new ArrayList<Node>();
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:226:3: (fp= exp ( COMMA p= exp )* )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==ID||LA10_0==LPAR||(LA10_0>=NAT && LA10_0<=IF)||LA10_0==SLPAR||(LA10_0>=FIRST && LA10_0<=NOT)) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:227:4: fp= exp ( COMMA p= exp )*
                                    {
                                    pushFollow(FOLLOW_exp_in_fatt966);
                                    fp=exp();

                                    state._fsp--;

                                    parList.add(fp);
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:228:4: ( COMMA p= exp )*
                                    loop9:
                                    do {
                                        int alt9=2;
                                        int LA9_0 = input.LA(1);

                                        if ( (LA9_0==COMMA) ) {
                                            alt9=1;
                                        }


                                        switch (alt9) {
                                    	case 1 :
                                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:228:5: COMMA p= exp
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_fatt974); 
                                    	    pushFollow(FOLLOW_exp_in_fatt978);
                                    	    p=exp();

                                    	    state._fsp--;

                                    	    parList.add(p);

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop9;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_fatt992); 

                            			if(entry.getNode().getNodeType()==NodeType.PARAM_NODE){
                            				ast = new HigherOrderFunNode(entry,nestingLevel-declNL,parList);
                            			}
                            			else{
                            				ast = new FunNode(entry,nestingLevel-declNL,parList);
                            			}
                            		

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:239:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
                    {
                    match(input,IF,FOLLOW_IF_in_fatt1003); 
                    pushFollow(FOLLOW_exp_in_fatt1007);
                    x=exp();

                    state._fsp--;

                    match(input,THEN,FOLLOW_THEN_in_fatt1009); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1011); 
                    pushFollow(FOLLOW_exp_in_fatt1015);
                    y=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1017); 
                    match(input,ELSE,FOLLOW_ELSE_in_fatt1022); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1024); 
                    pushFollow(FOLLOW_exp_in_fatt1028);
                    z=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1030); 
                    ast = new IfNode(x,y,z);

                    }
                    break;
                case 8 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:243:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
                    {
                    match(input,SLPAR,FOLLOW_SLPAR_in_fatt1044); 
                    pushFollow(FOLLOW_exp_in_fatt1048);
                    e1=exp();

                    state._fsp--;

                    match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt1050); 
                    pushFollow(FOLLOW_exp_in_fatt1054);
                    e2=exp();

                    state._fsp--;

                    match(input,SRPAR,FOLLOW_SRPAR_in_fatt1056); 
                    ast = new ListNode(e1,e2);

                    }
                    break;
                case 9 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:246:4: FIRST LPAR e= exp RPAR
                    {
                    match(input,FIRST,FOLLOW_FIRST_in_fatt1069); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1071); 
                    pushFollow(FOLLOW_exp_in_fatt1075);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1077); 
                    ast = new FirstNode(e);

                    }
                    break;
                case 10 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:249:4: REST LPAR e= exp RPAR
                    {
                    match(input,REST,FOLLOW_REST_in_fatt1094); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1096); 
                    pushFollow(FOLLOW_exp_in_fatt1100);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1102); 
                    ast = new RestNode(e);

                    }
                    break;
                case 11 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:252:4: PRINT LPAR e= exp RPAR
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_fatt1119); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1121); 
                    pushFollow(FOLLOW_exp_in_fatt1125);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1127); 
                    ast = new PrintNode(e);

                    }
                    break;
                case 12 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:255:4: NOT LPAR e= exp RPAR
                    {
                    match(input,NOT,FOLLOW_NOT_in_fatt1144); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1146); 
                    pushFollow(FOLLOW_exp_in_fatt1150);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1152); 
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:259:1: type returns [Node ast] : (bt= baseType | at= arrowType );
    public final Node type() throws RecognitionException {
        Node ast = null;

        Node bt = null;

        Node at = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:260:2: (bt= baseType | at= arrowType )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=INTTYPE && LA13_0<=BOOLTYPE)) ) {
                alt13=1;
            }
            else if ( (LA13_0==LPAR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:260:4: bt= baseType
                    {
                    pushFollow(FOLLOW_baseType_in_type1179);
                    bt=baseType();

                    state._fsp--;

                    ast = bt;

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:261:6: at= arrowType
                    {
                    pushFollow(FOLLOW_arrowType_in_type1190);
                    at=arrowType();

                    state._fsp--;

                    ast = at;

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


    // $ANTLR start "baseType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:264:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
    public final Node baseType() throws RecognitionException {
        Node ast = null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:265:2: ( INTTYPE | BOOLTYPE )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:265:4: INTTYPE
                    {
                    match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1210); 
                    ast = new IntTypeNode();

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:266:7: BOOLTYPE
                    {
                    match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1223); 
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
    // $ANTLR end "baseType"


    // $ANTLR start "arrowType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:270:1: arrowType returns [Node ast] : LPAR (t1= type ( COMMA tn= type )* )? RPAR ARROW rt= baseType ;
    public final Node arrowType() throws RecognitionException {
        Node ast = null;

        Node t1 = null;

        Node tn = null;

        Node rt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:271:3: ( LPAR (t1= type ( COMMA tn= type )* )? RPAR ARROW rt= baseType )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:271:6: LPAR (t1= type ( COMMA tn= type )* )? RPAR ARROW rt= baseType
            {
            match(input,LPAR,FOLLOW_LPAR_in_arrowType1249); 
            ArrowTypeNode atn= new ArrowTypeNode();
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:272:5: (t1= type ( COMMA tn= type )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==LPAR||(LA16_0>=INTTYPE && LA16_0<=BOOLTYPE)) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:273:6: t1= type ( COMMA tn= type )*
                    {
                    pushFollow(FOLLOW_type_in_arrowType1266);
                    t1=type();

                    state._fsp--;

                    atn.addParType(t1);
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:274:6: ( COMMA tn= type )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==COMMA) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:275:7: COMMA tn= type
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrowType1282); 
                    	    pushFollow(FOLLOW_type_in_arrowType1286);
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

            match(input,RPAR,FOLLOW_RPAR_in_arrowType1309); 
            match(input,ARROW,FOLLOW_ARROW_in_arrowType1311); 
            pushFollow(FOLLOW_baseType_in_arrowType1315);
            rt=baseType();

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


    // $ANTLR start "genericType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:284:2: genericType returns [Node ast] : GENERICTYPE ;
    public final Node genericType() throws RecognitionException {
        Node ast = null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:285:3: ( GENERICTYPE )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:285:5: GENERICTYPE
            {
            match(input,GENERICTYPE,FOLLOW_GENERICTYPE_in_genericType1335); 

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
    // $ANTLR end "genericType"

    // Delegated rules


 

    public static final BitSet FOLLOW_LET_in_prog43 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_declist_in_prog65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IN_in_prog68 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_prog72 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_prog74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_declist104 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist110 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_baseType_in_declist114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASS_in_declist116 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_declist120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist122 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_FUN_in_declist142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist146 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist150 = new BitSet(new long[]{0x0000030000001000L});
    public static final BitSet FOLLOW_type_in_declist154 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_declist169 = new BitSet(new long[]{0x0000000000004100L});
    public static final BitSet FOLLOW_ID_in_declist198 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_COL_in_declist203 = new BitSet(new long[]{0x0000030000001000L});
    public static final BitSet FOLLOW_type_in_declist207 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_declist231 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist235 = new BitSet(new long[]{0x0000000000006200L});
    public static final BitSet FOLLOW_COL_in_declist241 = new BitSet(new long[]{0x0000030000001000L});
    public static final BitSet FOLLOW_type_in_declist245 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_declist278 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_declist287 = new BitSet(new long[]{0x000000F27C001980L});
    public static final BitSet FOLLOW_declist_in_declist306 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_declist328 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_declist354 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist361 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_term_in_exp388 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_EQ_in_exp408 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp412 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_LESSEQ_in_exp452 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp456 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_GREATEREQ_in_exp487 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_term_in_exp491 = new BitSet(new long[]{0x00000000000E0002L});
    public static final BitSet FOLLOW_value_in_term536 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_PLUS_in_term557 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term561 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_MINUS_in_term600 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term604 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_OR_in_term643 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_value_in_term647 = new BitSet(new long[]{0x0000000000700002L});
    public static final BitSet FOLLOW_fatt_in_value693 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_TIMES_in_value719 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value723 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_DIVIDE_in_value763 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value767 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_AND_in_value806 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_fatt_in_value810 = new BitSet(new long[]{0x0000000003800002L});
    public static final BitSet FOLLOW_NAT_in_fatt857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_fatt873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_fatt888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_fatt900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_fatt914 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt918 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fatt935 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_LPAR_in_fatt947 = new BitSet(new long[]{0x000000F27C005100L});
    public static final BitSet FOLLOW_exp_in_fatt966 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_fatt974 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt978 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_fatt992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_fatt1003 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1007 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_THEN_in_fatt1009 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1011 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1015 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1017 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ELSE_in_fatt1022 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1024 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1028 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLPAR_in_fatt1044 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1048 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt1050 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1054 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SRPAR_in_fatt1056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_fatt1069 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1071 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1075 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REST_in_fatt1094 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1096 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1100 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_fatt1119 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1121 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1125 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fatt1144 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1146 = new BitSet(new long[]{0x000000F27C001100L});
    public static final BitSet FOLLOW_exp_in_fatt1150 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_type1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrowType_in_type1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTYPE_in_baseType1210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLTYPE_in_baseType1223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_arrowType1249 = new BitSet(new long[]{0x0000030000005000L});
    public static final BitSet FOLLOW_type_in_arrowType1266 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_COMMA_in_arrowType1282 = new BitSet(new long[]{0x0000030000001000L});
    public static final BitSet FOLLOW_type_in_arrowType1286 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_RPAR_in_arrowType1309 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ARROW_in_arrowType1311 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_baseType_in_arrowType1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GENERICTYPE_in_genericType1335 = new BitSet(new long[]{0x0000000000000002L});

}