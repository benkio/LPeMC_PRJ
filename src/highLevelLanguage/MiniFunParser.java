// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g 2014-02-25 17:11:08

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "LET", "IN", "SEMIC", "VAR", "ID", "COL", "ASS", "FUN", "LANPAR", "RANPAR", "LPAR", "COMMA", "RPAR", "CLPAR", "CRPAR", "EQ", "LESSEQ", "GREATEREQ", "PLUS", "MINUS", "OR", "TIMES", "DIVIDE", "AND", "NAT", "TRUE", "FALSE", "EMPTY", "IF", "THEN", "ELSE", "SLPAR", "DOUBLECOL", "SRPAR", "FIRST", "REST", "PRINT", "NOT", "INTTYPE", "BOOLTYPE", "ARROW", "LIST", "WHITESP", "ERR"
    };
    public static final int LANPAR=12;
    public static final int REST=39;
    public static final int SRPAR=37;
    public static final int CRPAR=18;
    public static final int NOT=41;
    public static final int ID=8;
    public static final int AND=27;
    public static final int NAT=28;
    public static final int EOF=-1;
    public static final int ERR=47;
    public static final int IF=32;
    public static final int DOUBLECOL=36;
    public static final int IN=5;
    public static final int THEN=33;
    public static final int LPAR=14;
    public static final int LESSEQ=20;
    public static final int COMMA=15;
    public static final int COL=9;
    public static final int PLUS=22;
    public static final int VAR=7;
    public static final int EQ=19;
    public static final int DIVIDE=26;
    public static final int RANPAR=13;
    public static final int GREATEREQ=21;
    public static final int BOOLTYPE=43;
    public static final int ELSE=34;
    public static final int MINUS=23;
    public static final int WHITESP=46;
    public static final int LIST=45;
    public static final int TRUE=29;
    public static final int PRINT=40;
    public static final int EMPTY=31;
    public static final int CLPAR=17;
    public static final int OR=24;
    public static final int ARROW=44;
    public static final int RPAR=16;
    public static final int ASS=10;
    public static final int SLPAR=35;
    public static final int FUN=11;
    public static final int SEMIC=6;
    public static final int TIMES=25;
    public static final int FALSE=30;
    public static final int INTTYPE=42;
    public static final int LET=4;
    public static final int FIRST=38;

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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
    public final ArrayList<Node> declist() throws RecognitionException {
        ArrayList<Node> astList = null;

        Token i=null;
        Token fpi=null;
        Token pi=null;
        Node t = null;

        Node e = null;

        ArrayList<GenericTypeNode> gt = null;

        Node rt = null;

        Node fpt = null;

        Node pt = null;

        ArrayList<Node> dec = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:38:3: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:38:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            {

            			astList = new ArrayList<Node>();
            	   		int offSet=1;
            	   	
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:43:5: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            loop7:
            do {
                int alt7=3;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==VAR) ) {
                    alt7=1;
                }
                else if ( (LA7_0==FUN) ) {
                    alt7=2;
                }


                switch (alt7) {
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:57:6: FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
            	    {
            	    match(input,FUN,FOLLOW_FUN_in_declist142); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist146); 

            	    	   		DecFunNode fn = null;
            	    	   		ArrayList<GenericTypeNode> generics=null;
            	    	   	
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:61:6: ( LANPAR gt= genericType RANPAR )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==LANPAR) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:61:8: LANPAR gt= genericType RANPAR
            	            {
            	            match(input,LANPAR,FOLLOW_LANPAR_in_declist158); 
            	            pushFollow(FOLLOW_genericType_in_declist169);
            	            gt=genericType();

            	            state._fsp--;

            	             generics=gt; 
            	            match(input,RANPAR,FOLLOW_RANPAR_in_declist187); 

            	            }
            	            break;

            	    }

            	    match(input,COL,FOLLOW_COL_in_declist196); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:65:10: (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( ((LA6_0>=INTTYPE && LA6_0<=BOOLTYPE)) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==LPAR) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:65:11: rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
            	            {
            	            pushFollow(FOLLOW_baseType_in_declist201);
            	            rt=baseType();

            	            state._fsp--;


            	            	   		fn = new DecFunNode((i!=null?i.getText():null),rt);
            	            	   		fn.addFunGenerics(generics);
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	  	
            	            match(input,LPAR,FOLLOW_LPAR_in_declist216); 

            	            		   		
            	            		        int parOffSet=-1;
            	            		        hm = new HashMap<String,STentry>();
            	            		        symTable.add(hm);
            	            		        nestingLevel++;
            	            		        /*
            	            		        if (genericType !=null)
            	            		        {
            	            		        	for (int j = 0; j<genericType.getGenericTypeIDs().size() ; j++){
            	            		        		STentry genericEntry = new STentry(genericType.getGenericTypeID(j),0);
            	            		        		if (hm.put(genericType.getGenericTypeID(j).getID(),genericEntry) != null){
            	            				    		System.out.println("Identifier "+genericType.getGenericTypeID(j).getID() +" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
            	            				      		System.exit(0);
            	            				      	}
            	            		        	}
            	            		        }
            	            		        */
            	            		        
            	            		 	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:98:8: (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
            	            int alt3=2;
            	            int LA3_0 = input.LA(1);

            	            if ( (LA3_0==ID) ) {
            	                alt3=1;
            	            }
            	            switch (alt3) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:99:8: fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist246); 
            	                    ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:100:9: ( COL fpt= type )
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:101:10: COL fpt= type
            	                    {
            	                    match(input,COL,FOLLOW_COL_in_declist269); 
            	                    pushFollow(FOLLOW_type_in_declist273);
            	                    fpt=type();

            	                    state._fsp--;

            	                    pn.addType(fpt); if(fpt.getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}

            	                    }


            	                    			       	entry = new STentry(pn,parOffSet--);
            	                    			        hm.put((fpi!=null?fpi.getText():null),entry);
            	                    			        fn.addParam(pn);
            	                       			    
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:108:8: ( COMMA pi= ID ( COL pt= type ) )*
            	                    loop2:
            	                    do {
            	                        int alt2=2;
            	                        int LA2_0 = input.LA(1);

            	                        if ( (LA2_0==COMMA) ) {
            	                            alt2=1;
            	                        }


            	                        switch (alt2) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:108:9: COMMA pi= ID ( COL pt= type )
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist304); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist308); 
            	                    	    pn = new ParamNode((pi!=null?pi.getText():null));
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:109:8: ( COL pt= type )
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:110:10: COL pt= type
            	                    	    {
            	                    	    match(input,COL,FOLLOW_COL_in_declist331); 
            	                    	    pushFollow(FOLLOW_type_in_declist335);
            	                    	    pt=type();

            	                    	    state._fsp--;

            	                    	    pn.addType(pt); if(pt.getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}

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
            	                    	    break loop2;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:120:5: rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )?
            	            {
            	            pushFollow(FOLLOW_arrowType_in_declist365);
            	            rt=arrowType();

            	            state._fsp--;


            	            	   	fn = new DecFunNode((i!=null?i.getText():null),rt);
            	            	   	fn.addFunGenerics(generics);
            	            	   		
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	  	
            	            match(input,LPAR,FOLLOW_LPAR_in_declist380); 

            	            		   		
            	            		        int parOffSet=-1;
            	            		        hm = new HashMap<String,STentry>();
            	            		        symTable.add(hm);
            	            		        nestingLevel++;
            	            		        int parCont=0;
            	            		        /*
            	            		        if (genericType !=null)
            	            		        {
            	            		        	for (int j = 0; j<genericType.getGenericTypeIDs().size() ; j++){
            	            		        		STentry genericEntry = new STentry(genericType.getGenericTypeID(j),0);
            	            		        		if (hm.put(genericType.getGenericTypeID(j).getID(),genericEntry) != null){
            	            				    		System.out.println("Identifier "+genericType.getGenericTypeID(j).getID()+" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
            	            				      		System.exit(0);
            	            				      	}
            	            		        	}
            	            		        }
            	            		        */
            	            		 	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:154:7: (fpi= ID ( COMMA pi= ID )* )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==ID) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:155:8: fpi= ID ( COMMA pi= ID )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist409); 
            	                    ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));

            	                    		    		Node tp = ((ArrowTypeNode)rt).getParType(parCont);
            	                    		    		
            	                    		    		
            	                    		    		if( tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
            	                    		    			parOffSet-=1;
            	                    		    		}
            	                    		    		System.out.println(parOffSet);
            	                    		    		
            	                    				pn.addType(tp);

            	                    			       	entry = new STentry(pn,parOffSet--);
            	                    			        hm.put((fpi!=null?fpi.getText():null),entry);
            	                    			        fn.addParam(pn);
            	                    			        parCont++;
            	                    			  	
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:172:8: ( COMMA pi= ID )*
            	                    loop4:
            	                    do {
            	                        int alt4=2;
            	                        int LA4_0 = input.LA(1);

            	                        if ( (LA4_0==COMMA) ) {
            	                            alt4=1;
            	                        }


            	                        switch (alt4) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:172:9: COMMA pi= ID
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist431); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist435); 
            	                    	    pn = new ParamNode((pi!=null?pi.getText():null));


            	                    	    		    		tp =((ArrowTypeNode) rt).getParType(parCont);
            	                    	    		    		
            	                    	    		    		if(tp!=null && tp.getNodeType() == NodeType.ARROWTYPE_NODE){
            	                    	    		    			parOffSet-=1;
            	                    	    		    		}
            	                    	    		    		System.out.println(parOffSet);
            	                    	    		    		pn.addType(tp);
            	                    	    		    		parCont++;
            	                    	    		    	
            	                    	    			        entry = new STentry(pn,parOffSet--);
            	                    	    			        if (hm.put((pi!=null?pi.getText():null),entry) != null){
            	                    	    			        	System.out.println("Identifier "+(pi!=null?pi.getText():null)+" at line "+(pi!=null?pi.getLine():0)+" already defined");
            	                    	    			           	System.exit(0);
            	                    	    			        }
            	                    	    			        fn.addParam(pn);
            	                    	    			   	

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop4;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    match(input,RPAR,FOLLOW_RPAR_in_declist473); 
            	    match(input,CLPAR,FOLLOW_CLPAR_in_declist482); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:195:6: ( (dec= declist ) e= exp )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:196:7: (dec= declist ) e= exp
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:196:7: (dec= declist )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:196:8: dec= declist
            	    {
            	    pushFollow(FOLLOW_declist_in_declist501);
            	    dec=declist();

            	    state._fsp--;


            	    }


            	    	    		fn.addLocalDeclarationList(dec);
            	    	    	
            	    pushFollow(FOLLOW_exp_in_declist523);
            	    e=exp();

            	    state._fsp--;


            	    	        	fn.addExpValue(e);
            	    	       		symTable.remove(nestingLevel--);
            	    	       		astList.add(fn);
            	    	       	

            	    }

            	    match(input,CRPAR,FOLLOW_CRPAR_in_declist549); 
            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist556); 

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
        return astList;
    }
    // $ANTLR end "declist"


    // $ANTLR start "exp"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:210:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
    public final Node exp() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:211:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:211:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            {
            pushFollow(FOLLOW_term_in_exp583);
            f=term();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:212:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            loop8:
            do {
                int alt8=4;
                switch ( input.LA(1) ) {
                case EQ:
                    {
                    alt8=1;
                    }
                    break;
                case LESSEQ:
                    {
                    alt8=2;
                    }
                    break;
                case GREATEREQ:
                    {
                    alt8=3;
                    }
                    break;

                }

                switch (alt8) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:212:8: ( EQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:212:8: ( EQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:213:8: EQ l= term
            	    {
            	    match(input,EQ,FOLLOW_EQ_in_exp603); 
            	    pushFollow(FOLLOW_term_in_exp607);
            	    l=term();

            	    state._fsp--;

            	    ast = new EqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:216:9: ( LESSEQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:216:9: ( LESSEQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:217:9: LESSEQ l= term
            	    {
            	    match(input,LESSEQ,FOLLOW_LESSEQ_in_exp647); 
            	    pushFollow(FOLLOW_term_in_exp651);
            	    l=term();

            	    state._fsp--;

            	    ast = new LessEqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:220:9: ( GREATEREQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:220:9: ( GREATEREQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:220:11: GREATEREQ l= term
            	    {
            	    match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp682); 
            	    pushFollow(FOLLOW_term_in_exp686);
            	    l=term();

            	    state._fsp--;

            	    ast = new GreatEqualNode(ast,l);

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
    // $ANTLR end "exp"


    // $ANTLR start "term"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:225:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
    public final Node term() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:226:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:226:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            {
            pushFollow(FOLLOW_value_in_term731);
            f=value();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:227:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            loop9:
            do {
                int alt9=4;
                switch ( input.LA(1) ) {
                case PLUS:
                    {
                    alt9=1;
                    }
                    break;
                case MINUS:
                    {
                    alt9=2;
                    }
                    break;
                case OR:
                    {
                    alt9=3;
                    }
                    break;

                }

                switch (alt9) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:228:5: ( PLUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:228:5: ( PLUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:229:5: PLUS l= value
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_term752); 
            	    pushFollow(FOLLOW_value_in_term756);
            	    l=value();

            	    state._fsp--;

            	    ast = new PlusNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:232:9: ( MINUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:232:9: ( MINUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:233:9: MINUS l= value
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_term795); 
            	    pushFollow(FOLLOW_value_in_term799);
            	    l=value();

            	    state._fsp--;

            	    ast = new MinusNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:236:9: ( OR l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:236:9: ( OR l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:237:9: OR l= value
            	    {
            	    match(input,OR,FOLLOW_OR_in_term838); 
            	    pushFollow(FOLLOW_value_in_term842);
            	    l=value();

            	    state._fsp--;

            	    ast = new OrNode(ast,l);

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
    // $ANTLR end "term"


    // $ANTLR start "value"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:243:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
    public final Node value() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:244:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:244:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            {
            pushFollow(FOLLOW_fatt_in_value888);
            f=fatt();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:245:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            loop10:
            do {
                int alt10=4;
                switch ( input.LA(1) ) {
                case TIMES:
                    {
                    alt10=1;
                    }
                    break;
                case DIVIDE:
                    {
                    alt10=2;
                    }
                    break;
                case AND:
                    {
                    alt10=3;
                    }
                    break;

                }

                switch (alt10) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:246:7: ( TIMES l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:246:7: ( TIMES l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:247:8: TIMES l= fatt
            	    {
            	    match(input,TIMES,FOLLOW_TIMES_in_value914); 
            	    pushFollow(FOLLOW_fatt_in_value918);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new TimesNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:250:9: ( DIVIDE l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:250:9: ( DIVIDE l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:251:9: DIVIDE l= fatt
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_value958); 
            	    pushFollow(FOLLOW_fatt_in_value962);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new DivNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:254:9: ( AND l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:254:9: ( AND l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:255:9: AND l= fatt
            	    {
            	    match(input,AND,FOLLOW_AND_in_value1001); 
            	    pushFollow(FOLLOW_fatt_in_value1005);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new AndNode(ast,l);

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:260:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
    public final Node fatt() throws RecognitionException {
        Node ast = null;

        Token n=null;
        Token i=null;
        Node e = null;

        ArrayList<Node> cgt = null;

        Node fp = null;

        Node p = null;

        Node x = null;

        Node y = null;

        Node z = null;

        Node e1 = null;

        Node e2 = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:261:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
            int alt15=12;
            switch ( input.LA(1) ) {
            case NAT:
                {
                alt15=1;
                }
                break;
            case TRUE:
                {
                alt15=2;
                }
                break;
            case FALSE:
                {
                alt15=3;
                }
                break;
            case EMPTY:
                {
                alt15=4;
                }
                break;
            case LPAR:
                {
                alt15=5;
                }
                break;
            case ID:
                {
                alt15=6;
                }
                break;
            case IF:
                {
                alt15=7;
                }
                break;
            case SLPAR:
                {
                alt15=8;
                }
                break;
            case FIRST:
                {
                alt15=9;
                }
                break;
            case REST:
                {
                alt15=10;
                }
                break;
            case PRINT:
                {
                alt15=11;
                }
                break;
            case NOT:
                {
                alt15=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:261:4: n= NAT
                    {
                    n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt1052); 
                    ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:263:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_fatt1068); 
                    ast = new BoolNode(true);

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:265:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_fatt1083); 
                    ast = new BoolNode(false);

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:267:4: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_fatt1095); 
                    ast = new EmptyNode();

                    }
                    break;
                case 5 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:269:4: LPAR e= exp RPAR
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1109); 
                    pushFollow(FOLLOW_exp_in_fatt1113);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1115); 
                    ast = e;

                    }
                    break;
                case 6 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:271:4: i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_fatt1130); 

                    	  	HashMap<String,STentry> hm;
                    	   	STentry entry=null;
                    	   	ArrayList<Node> genericType = null;
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
                    		
                    		if(nt == NodeType.DECFUN_NODE){
                    			ast = new FunParNode(entry,nestingLevel-declNL);
                    	   	}
                    	   	else {
                    	   		ast = new VarNode(entry,nestingLevel-declNL); 
                    	   	}
                    	
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:296:4: ( LANPAR cgt= concreteGenericType RANPAR )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LANPAR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:296:5: LANPAR cgt= concreteGenericType RANPAR
                            {
                            match(input,LANPAR,FOLLOW_LANPAR_in_fatt1140); 
                            pushFollow(FOLLOW_concreteGenericType_in_fatt1146);
                            cgt=concreteGenericType();

                            state._fsp--;

                             genericType = cgt; 
                            match(input,RANPAR,FOLLOW_RANPAR_in_fatt1151); 

                            }
                            break;

                    }

                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:297:3: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==LPAR) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:298:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_fatt1162); 
                            ArrayList<Node> parList = new ArrayList<Node>();
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:301:3: (fp= exp ( COMMA p= exp )* )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==ID||LA13_0==LPAR||(LA13_0>=NAT && LA13_0<=IF)||LA13_0==SLPAR||(LA13_0>=FIRST && LA13_0<=NOT)) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:302:4: fp= exp ( COMMA p= exp )*
                                    {
                                    pushFollow(FOLLOW_exp_in_fatt1181);
                                    fp=exp();

                                    state._fsp--;

                                    parList.add(fp);
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:303:4: ( COMMA p= exp )*
                                    loop12:
                                    do {
                                        int alt12=2;
                                        int LA12_0 = input.LA(1);

                                        if ( (LA12_0==COMMA) ) {
                                            alt12=1;
                                        }


                                        switch (alt12) {
                                    	case 1 :
                                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:303:5: COMMA p= exp
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_fatt1189); 
                                    	    pushFollow(FOLLOW_exp_in_fatt1193);
                                    	    p=exp();

                                    	    state._fsp--;

                                    	    parList.add(p);

                                    	    }
                                    	    break;

                                    	default :
                                    	    break loop12;
                                        }
                                    } while (true);


                                    }
                                    break;

                            }

                            match(input,RPAR,FOLLOW_RPAR_in_fatt1207); 

                            			if(entry.getNode().getNodeType()==NodeType.PARAM_NODE){
                            				ast = new HigherOrderFunNode(entry,nestingLevel-declNL,parList, genericType );
                            			}
                            			else{
                            				ast = new FunNode(entry,nestingLevel-declNL,parList, genericType);
                            			}

                            		

                            }
                            break;

                    }


                    }
                    break;
                case 7 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:315:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
                    {
                    match(input,IF,FOLLOW_IF_in_fatt1218); 
                    pushFollow(FOLLOW_exp_in_fatt1222);
                    x=exp();

                    state._fsp--;

                    match(input,THEN,FOLLOW_THEN_in_fatt1224); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1226); 
                    pushFollow(FOLLOW_exp_in_fatt1230);
                    y=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1232); 
                    match(input,ELSE,FOLLOW_ELSE_in_fatt1237); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1239); 
                    pushFollow(FOLLOW_exp_in_fatt1243);
                    z=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1245); 
                    ast = new IfNode(x,y,z);

                    }
                    break;
                case 8 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:319:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
                    {
                    match(input,SLPAR,FOLLOW_SLPAR_in_fatt1259); 
                    pushFollow(FOLLOW_exp_in_fatt1263);
                    e1=exp();

                    state._fsp--;

                    match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt1265); 
                    pushFollow(FOLLOW_exp_in_fatt1269);
                    e2=exp();

                    state._fsp--;

                    match(input,SRPAR,FOLLOW_SRPAR_in_fatt1271); 
                    ast = new ListNode(e1,e2);

                    }
                    break;
                case 9 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:322:4: FIRST LPAR e= exp RPAR
                    {
                    match(input,FIRST,FOLLOW_FIRST_in_fatt1284); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1286); 
                    pushFollow(FOLLOW_exp_in_fatt1290);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1292); 
                    ast = new FirstNode(e);

                    }
                    break;
                case 10 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:325:4: REST LPAR e= exp RPAR
                    {
                    match(input,REST,FOLLOW_REST_in_fatt1309); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1311); 
                    pushFollow(FOLLOW_exp_in_fatt1315);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1317); 
                    ast = new RestNode(e);

                    }
                    break;
                case 11 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:328:4: PRINT LPAR e= exp RPAR
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_fatt1334); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1336); 
                    pushFollow(FOLLOW_exp_in_fatt1340);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1342); 
                    ast = new PrintNode(e);

                    }
                    break;
                case 12 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:331:4: NOT LPAR e= exp RPAR
                    {
                    match(input,NOT,FOLLOW_NOT_in_fatt1359); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1361); 
                    pushFollow(FOLLOW_exp_in_fatt1365);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1367); 
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:342:1: type returns [Node ast] : (bt= baseType | at= arrowType | lt= listType | i= ID );
    public final Node type() throws RecognitionException {
        Node ast = null;

        Token i=null;
        Node bt = null;

        Node at = null;

        Node lt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:343:2: (bt= baseType | at= arrowType | lt= listType | i= ID )
            int alt16=4;
            switch ( input.LA(1) ) {
            case INTTYPE:
            case BOOLTYPE:
                {
                alt16=1;
                }
                break;
            case LPAR:
                {
                alt16=2;
                }
                break;
            case LIST:
                {
                alt16=3;
                }
                break;
            case ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:343:4: bt= baseType
                    {
                    pushFollow(FOLLOW_baseType_in_type1398);
                    bt=baseType();

                    state._fsp--;

                    ast = bt;

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:344:6: at= arrowType
                    {
                    pushFollow(FOLLOW_arrowType_in_type1409);
                    at=arrowType();

                    state._fsp--;

                    ast = at;

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:345:4: lt= listType
                    {
                    pushFollow(FOLLOW_listType_in_type1418);
                    lt=listType();

                    state._fsp--;

                    ast = lt; 

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:346:4: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_type1427); 
                     ast = new GenericTypeNode((i!=null?i.getText():null)); 

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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:349:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
    public final Node baseType() throws RecognitionException {
        Node ast = null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:350:2: ( INTTYPE | BOOLTYPE )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==INTTYPE) ) {
                alt17=1;
            }
            else if ( (LA17_0==BOOLTYPE) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:350:4: INTTYPE
                    {
                    match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1447); 
                    ast = new IntTypeNode();

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:351:6: BOOLTYPE
                    {
                    match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1459); 
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:355:1: arrowType returns [Node ast] : LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType ;
    public final Node arrowType() throws RecognitionException {
        Node ast = null;

        Node t1 = null;

        Node tn = null;

        Node rt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:356:3: ( LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:356:6: LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType
            {
            match(input,LPAR,FOLLOW_LPAR_in_arrowType1485); 
            ArrowTypeNode atn= new ArrowTypeNode();
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:357:5: ( (t1= type ) ( COMMA (tn= type ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==LPAR||(LA19_0>=INTTYPE && LA19_0<=BOOLTYPE)||LA19_0==LIST) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:358:6: (t1= type ) ( COMMA (tn= type ) )*
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:358:6: (t1= type )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:358:7: t1= type
                    {
                    pushFollow(FOLLOW_type_in_arrowType1503);
                    t1=type();

                    state._fsp--;


                    }

                    atn.addParType(t1);
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:359:6: ( COMMA (tn= type ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:360:7: COMMA (tn= type )
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrowType1522); 
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:360:13: (tn= type )
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:360:14: tn= type
                    	    {
                    	    pushFollow(FOLLOW_type_in_arrowType1527);
                    	    tn=type();

                    	    state._fsp--;


                    	    }

                    	    atn.addParType(tn);

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAR,FOLLOW_RPAR_in_arrowType1552); 
            match(input,ARROW,FOLLOW_ARROW_in_arrowType1554); 
            pushFollow(FOLLOW_baseType_in_arrowType1558);
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


    // $ANTLR start "concreteGenericType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:369:1: concreteGenericType returns [ArrayList<Node> ast] : bt= baseType ( COMMA bt1= baseType )* ;
    public final ArrayList<Node> concreteGenericType() throws RecognitionException {
        ArrayList<Node> ast = null;

        Node bt = null;

        Node bt1 = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:370:2: (bt= baseType ( COMMA bt1= baseType )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:371:3: bt= baseType ( COMMA bt1= baseType )*
            {
            pushFollow(FOLLOW_baseType_in_concreteGenericType1584);
            bt=baseType();

            state._fsp--;

            ArrayList<Node> generic = new ArrayList<Node>(); generic.add(bt);
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:372:3: ( COMMA bt1= baseType )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:372:4: COMMA bt1= baseType
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concreteGenericType1591); 
            	    pushFollow(FOLLOW_baseType_in_concreteGenericType1595);
            	    bt1=baseType();

            	    state._fsp--;

            	    generic.add(bt1);

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             ast = generic; 

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
    // $ANTLR end "concreteGenericType"


    // $ANTLR start "genericType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:375:1: genericType returns [ArrayList<GenericTypeNode> ast] : i= ID ( COMMA f= ID )* ;
    public final ArrayList<GenericTypeNode> genericType() throws RecognitionException {
        ArrayList<GenericTypeNode> ast = null;

        Token i=null;
        Token f=null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:376:2: (i= ID ( COMMA f= ID )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:376:4: i= ID ( COMMA f= ID )*
            {
            ArrayList<GenericTypeNode> generics = new ArrayList<GenericTypeNode>();
            i=(Token)match(input,ID,FOLLOW_ID_in_genericType1626); 
              generics.add(new GenericTypeNode( (i!=null?i.getText():null) ));  
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:379:3: ( COMMA f= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:379:5: COMMA f= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_genericType1634); 
            	    f=(Token)match(input,ID,FOLLOW_ID_in_genericType1638); 
            	     generics.add(new GenericTypeNode( (f!=null?f.getText():null) )); 

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             ast = generics;  

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


    // $ANTLR start "listType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:382:1: listType returns [Node ast] : LIST SLPAR (bt= baseType | i= ID ) SRPAR ;
    public final Node listType() throws RecognitionException {
        Node ast = null;

        Token i=null;
        Node bt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:383:2: ( LIST SLPAR (bt= baseType | i= ID ) SRPAR )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:383:4: LIST SLPAR (bt= baseType | i= ID ) SRPAR
            {
            match(input,LIST,FOLLOW_LIST_in_listType1663); 
            match(input,SLPAR,FOLLOW_SLPAR_in_listType1665); 
             Node generic = null; 
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:384:2: (bt= baseType | i= ID )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=INTTYPE && LA22_0<=BOOLTYPE)) ) {
                alt22=1;
            }
            else if ( (LA22_0==ID) ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }
            switch (alt22) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:385:2: bt= baseType
                    {
                    pushFollow(FOLLOW_baseType_in_listType1676);
                    bt=baseType();

                    state._fsp--;

                     generic = new ConcreteListParamTypeNode(bt); 

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/src/highLevelLanguage/MiniFun.g:386:4: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_listType1685); 
                    generic = new GenericListParamTypeNode(new GenericTypeNode( (i!=null?i.getText():null) )); 

                    }
                    break;

            }

            match(input,SRPAR,FOLLOW_SRPAR_in_listType1692); 
             ast = generic; 

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
    // $ANTLR end "listType"

    // Delegated rules


 

    public static final BitSet FOLLOW_LET_in_prog43 = new BitSet(new long[]{0x00000000000008A0L});
    public static final BitSet FOLLOW_declist_in_prog65 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_IN_in_prog68 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_prog72 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_prog74 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_declist104 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist108 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist110 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_baseType_in_declist114 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_ASS_in_declist116 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_declist120 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist122 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_FUN_in_declist142 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist146 = new BitSet(new long[]{0x0000000000001200L});
    public static final BitSet FOLLOW_LANPAR_in_declist158 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_genericType_in_declist169 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANPAR_in_declist187 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist196 = new BitSet(new long[]{0x00000C0000004000L});
    public static final BitSet FOLLOW_baseType_in_declist201 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_declist216 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_ID_in_declist246 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist269 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_declist273 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_declist304 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist308 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist331 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_declist335 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_arrowType_in_declist365 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_declist380 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_ID_in_declist409 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_declist431 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist435 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_declist473 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_declist482 = new BitSet(new long[]{0x000003C9F0004980L});
    public static final BitSet FOLLOW_declist_in_declist501 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_declist523 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_declist549 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist556 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_term_in_exp583 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_EQ_in_exp603 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp607 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_LESSEQ_in_exp647 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp651 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_GREATEREQ_in_exp682 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp686 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_value_in_term731 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_PLUS_in_term752 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term756 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_MINUS_in_term795 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term799 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_OR_in_term838 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term842 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_fatt_in_value888 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TIMES_in_value914 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value918 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_DIVIDE_in_value958 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value962 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_AND_in_value1001 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value1005 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_NAT_in_fatt1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_fatt1068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_fatt1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_fatt1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1109 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1113 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fatt1130 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_LANPAR_in_fatt1140 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_concreteGenericType_in_fatt1146 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANPAR_in_fatt1151 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1162 = new BitSet(new long[]{0x000003C9F0014100L});
    public static final BitSet FOLLOW_exp_in_fatt1181 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_fatt1189 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1193 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_fatt1218 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1222 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THEN_in_fatt1224 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1226 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1230 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ELSE_in_fatt1237 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1239 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1243 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLPAR_in_fatt1259 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1263 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt1265 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1269 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SRPAR_in_fatt1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_fatt1284 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1286 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1290 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REST_in_fatt1309 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1311 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_fatt1334 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1336 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1340 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fatt1359 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1361 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1365 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_type1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrowType_in_type1409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listType_in_type1418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTYPE_in_baseType1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLTYPE_in_baseType1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_arrowType1485 = new BitSet(new long[]{0x00002C0000014100L});
    public static final BitSet FOLLOW_type_in_arrowType1503 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_arrowType1522 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_arrowType1527 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_arrowType1552 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ARROW_in_arrowType1554 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_baseType_in_arrowType1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_concreteGenericType1584 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_concreteGenericType1591 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_baseType_in_concreteGenericType1595 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_genericType1626 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_genericType1634 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_genericType1638 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LIST_in_listType1663 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SLPAR_in_listType1665 = new BitSet(new long[]{0x00000C0000000100L});
    public static final BitSet FOLLOW_baseType_in_listType1676 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_listType1685 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SRPAR_in_listType1692 = new BitSet(new long[]{0x0000000000000002L});

}