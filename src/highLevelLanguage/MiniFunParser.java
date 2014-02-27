// $ANTLR 3.2 Sep 23, 2009 12:02:23 /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g 2014-02-27 17:22:03

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
    public String getGrammarFileName() { return "/Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g"; }


        private ArrayList<HashMap<String,STentry>> symTable = new ArrayList<HashMap<String,STentry>>();    
        private int nestingLevel=0;             



    // $ANTLR start "prog"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:24:1: prog returns [Node ast] : LET d= declist IN e= exp SEMIC ;
    public final Node prog() throws RecognitionException {
        Node ast = null;

        ArrayList<Node> d = null;

        Node e = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:25:2: ( LET d= declist IN e= exp SEMIC )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:25:4: LET d= declist IN e= exp SEMIC
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
    public final ArrayList<Node> declist() throws RecognitionException {
        ArrayList<Node> astList = null;

        Token i=null;
        Token fpi=null;
        Token pi=null;
        Node t = null;

        Node e = null;

        ArrayList<GenericTypeNode> gt = null;

        Node rt = null;

        MiniFunParser.type_return fpt = null;

        MiniFunParser.type_return pt = null;

        ArrayList<Node> dec = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:38:3: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:38:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
            {

            			astList = new ArrayList<Node>();
            	   		int offSet=1;
            	   	
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:43:5: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:43:6: VAR i= ID COL t= baseType ASS e= exp SEMIC
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:57:6: FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
            	    {
            	    match(input,FUN,FOLLOW_FUN_in_declist142); 
            	    i=(Token)match(input,ID,FOLLOW_ID_in_declist146); 

            	    	   		DecFunNode fn = null;
            	    	   		ArrayList<GenericTypeNode> generics=null;
            	    	   	
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:61:6: ( LANPAR gt= genericType RANPAR )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==LANPAR) ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:61:8: LANPAR gt= genericType RANPAR
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


            	    	  	 	HashMap<String,STentry> hm=symTable.get(nestingLevel);    
            	    	  	 	if (generics !=null)
            	    	        {
            	    	        	for (int j = 0; j<generics.size() ; j++){
            	    	        		STentry genericEntry = new STentry(generics.get(j),0);
            	    	        		if (hm.put(generics.get(j).getGenericTypeID(),genericEntry) != null){
            	    			    		System.out.println("Identifier "+generics.get(j).getGenericTypeID() +" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
            	    			      		System.exit(0);
            	    			      	}
            	    	        	}
            	    	        }
            	    		
            	    match(input,COL,FOLLOW_COL_in_declist204); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:78:10: (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? | rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? )
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
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:78:11: rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
            	            {
            	            pushFollow(FOLLOW_baseType_in_declist209);
            	            rt=baseType();

            	            state._fsp--;


            	            	   		fn = new DecFunNode((i!=null?i.getText():null),rt);
            	            	   		fn.addFunGenerics(generics);
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	  	
            	            match(input,LPAR,FOLLOW_LPAR_in_declist224); 

            	            		   		
            	            		        int parOffSet=-1;
            	            		        hm = new HashMap<String,STentry>();
            	            		        symTable.add(hm);
            	            		        nestingLevel++;
            	            		        		        
            	            		 	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:98:8: (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
            	            int alt3=2;
            	            int LA3_0 = input.LA(1);

            	            if ( (LA3_0==ID) ) {
            	                alt3=1;
            	            }
            	            switch (alt3) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:99:8: fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist254); 
            	                    ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:100:9: ( COL fpt= type )
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:101:10: COL fpt= type
            	                    {
            	                    match(input,COL,FOLLOW_COL_in_declist277); 
            	                    pushFollow(FOLLOW_type_in_declist281);
            	                    fpt=type();

            	                    state._fsp--;


            	                    			    	 if((fpt!=null?fpt.ast:null).getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}
            	                    			    	 if((fpt!=null?fpt.ast:null).getNodeType() == NodeType.GENERICTYPE_NODE)
            	                    			    	 {
            	                    			    	 	if (hm.get(  ( (GenericTypeNode) (fpt!=null?fpt.ast:null)).getGenericTypeID()) != null)
            	                    				    	 	pn.addType( hm.get( ((GenericTypeNode) (fpt!=null?fpt.ast:null)).getGenericTypeID()).getNode() );
            	                    				    	else{
            	                    					    	 System.out.println("Identifier "+ (fpi!=null?fpi.getText():null) +" at line "+(fpi!=null?fpi.getLine():0)+" Not recognized, generic type ID match");
            	                    				      		System.exit(0);
            	                    				      		}
            	                    			    	 }
            	                    			    	 else
            	                    			    	 	pn.addType( (fpt!=null?fpt.ast:null) );
            	                    			    	 

            	                    }


            	                    			       	entry = new STentry(pn,parOffSet--);
            	                    			        hm.put((fpt!=null?input.toString(fpt.start,fpt.stop):null),entry);
            	                    			        fn.addParam(pn);
            	                       			    
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:121:8: ( COMMA pi= ID ( COL pt= type ) )*
            	                    loop2:
            	                    do {
            	                        int alt2=2;
            	                        int LA2_0 = input.LA(1);

            	                        if ( (LA2_0==COMMA) ) {
            	                            alt2=1;
            	                        }


            	                        switch (alt2) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:121:9: COMMA pi= ID ( COL pt= type )
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist312); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist316); 
            	                    	    pn = new ParamNode((pi!=null?pi.getText():null));
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:122:8: ( COL pt= type )
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:123:10: COL pt= type
            	                    	    {
            	                    	    match(input,COL,FOLLOW_COL_in_declist339); 
            	                    	    pushFollow(FOLLOW_type_in_declist343);
            	                    	    pt=type();

            	                    	    state._fsp--;


            	                    	    			    	 if((pt!=null?pt.ast:null).getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}
            	                    	    			    	 if((pt!=null?pt.ast:null).getNodeType() == NodeType.GENERICTYPE_NODE)
            	                    	    			    	 {
            	                    	    			    	 	if (hm.get(  ( (GenericTypeNode) (fpt!=null?fpt.ast:null)).getGenericTypeID()) != null)
            	                    	    				    	 	pn.addType( hm.get( ((GenericTypeNode) (fpt!=null?fpt.ast:null)).getGenericTypeID()).getNode() );
            	                    	    				    	else{
            	                    	    					    	 System.out.println("Identifier "+ (pt!=null?input.toString(pt.start,pt.stop):null) +" at line "+(pi!=null?pi.getLine():0)+" Not recognized, generic type ID match");
            	                    	    				      		System.exit(0);
            	                    	    				      		}
            	                    	    			    	 }
            	                    	    			    	 else
            	                    	    			    	 	pn.addType( (pt!=null?pt.ast:null) );
            	                    	    			    	 

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
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:147:5: rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )?
            	            {
            	            pushFollow(FOLLOW_arrowType_in_declist383);
            	            rt=arrowType();

            	            state._fsp--;


            	            	   	fn = new DecFunNode((i!=null?i.getText():null),rt);
            	            	   	fn.addFunGenerics(generics);
            	            	   		
            	            	    	STentry entry = new STentry(fn,offSet++);
            	            	    	//HashMap<String,STentry> hm=symTable.get(nestingLevel);
            	            	    	
            	            	    	if (hm.put((i!=null?i.getText():null),entry) != null){
            	            	    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
            	            	      		System.exit(0);
            	            	      	}
            	            	  	
            	            match(input,LPAR,FOLLOW_LPAR_in_declist398); 

            	            		   		
            	            		        int parOffSet=-1;
            	            		        hm = new HashMap<String,STentry>();
            	            		        symTable.add(hm);
            	            		        nestingLevel++;
            	            		        int parCont=0;
            	            		        
            	            		        /*if (generics !=null)
            	            		        {
            	            		        	for (int j = 0; j<generics.size() ; j++){
            	            		        		STentry genericEntry = new STentry(generics.get(j),0);
            	            		        		if (hm.put(generics.get(j).getGenericTypeID(),genericEntry) != null){
            	            				    		System.out.println("Identifier "+generics.get(j).getGenericTypeID() +" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
            	            				      		System.exit(0);
            	            				      	}
            	            		        	}
            	            		        }*/
            	            		        
            	            		 	
            	            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:181:7: (fpi= ID ( COMMA pi= ID )* )?
            	            int alt5=2;
            	            int LA5_0 = input.LA(1);

            	            if ( (LA5_0==ID) ) {
            	                alt5=1;
            	            }
            	            switch (alt5) {
            	                case 1 :
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:182:8: fpi= ID ( COMMA pi= ID )*
            	                    {
            	                    fpi=(Token)match(input,ID,FOLLOW_ID_in_declist427); 
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
            	                    			  	
            	                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:199:8: ( COMMA pi= ID )*
            	                    loop4:
            	                    do {
            	                        int alt4=2;
            	                        int LA4_0 = input.LA(1);

            	                        if ( (LA4_0==COMMA) ) {
            	                            alt4=1;
            	                        }


            	                        switch (alt4) {
            	                    	case 1 :
            	                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:199:9: COMMA pi= ID
            	                    	    {
            	                    	    match(input,COMMA,FOLLOW_COMMA_in_declist449); 
            	                    	    pi=(Token)match(input,ID,FOLLOW_ID_in_declist453); 
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
            	                    	    			        	System.out.println("Identifier "+(pi!=null?pi.getText():null)+" at line "+(pi!=null?pi.getLine():0) +" already defined");
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

            	    match(input,RPAR,FOLLOW_RPAR_in_declist491); 
            	    match(input,CLPAR,FOLLOW_CLPAR_in_declist500); 
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:222:6: ( (dec= declist ) e= exp )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:223:7: (dec= declist ) e= exp
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:223:7: (dec= declist )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:223:8: dec= declist
            	    {
            	    pushFollow(FOLLOW_declist_in_declist519);
            	    dec=declist();

            	    state._fsp--;


            	    }


            	    	    		fn.addLocalDeclarationList(dec);
            	    	    	
            	    pushFollow(FOLLOW_exp_in_declist541);
            	    e=exp();

            	    state._fsp--;


            	    	        	fn.addExpValue(e);
            	    	       		symTable.remove(nestingLevel--);
            	    	       		astList.add(fn);
            	    	       	

            	    }

            	    match(input,CRPAR,FOLLOW_CRPAR_in_declist567); 
            	    match(input,SEMIC,FOLLOW_SEMIC_in_declist574); 

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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:237:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
    public final Node exp() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:238:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:238:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
            {
            pushFollow(FOLLOW_term_in_exp601);
            f=term();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:239:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:239:8: ( EQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:239:8: ( EQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:240:8: EQ l= term
            	    {
            	    match(input,EQ,FOLLOW_EQ_in_exp621); 
            	    pushFollow(FOLLOW_term_in_exp625);
            	    l=term();

            	    state._fsp--;

            	    ast = new EqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:243:9: ( LESSEQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:243:9: ( LESSEQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:244:9: LESSEQ l= term
            	    {
            	    match(input,LESSEQ,FOLLOW_LESSEQ_in_exp665); 
            	    pushFollow(FOLLOW_term_in_exp669);
            	    l=term();

            	    state._fsp--;

            	    ast = new LessEqualNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:247:9: ( GREATEREQ l= term )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:247:9: ( GREATEREQ l= term )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:247:11: GREATEREQ l= term
            	    {
            	    match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp700); 
            	    pushFollow(FOLLOW_term_in_exp704);
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:252:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
    public final Node term() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:253:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:253:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
            {
            pushFollow(FOLLOW_value_in_term749);
            f=value();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:254:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:255:5: ( PLUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:255:5: ( PLUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:256:5: PLUS l= value
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_term770); 
            	    pushFollow(FOLLOW_value_in_term774);
            	    l=value();

            	    state._fsp--;

            	    ast = new PlusNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:259:9: ( MINUS l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:259:9: ( MINUS l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:260:9: MINUS l= value
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_term813); 
            	    pushFollow(FOLLOW_value_in_term817);
            	    l=value();

            	    state._fsp--;

            	    ast = new MinusNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:263:9: ( OR l= value )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:263:9: ( OR l= value )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:264:9: OR l= value
            	    {
            	    match(input,OR,FOLLOW_OR_in_term856); 
            	    pushFollow(FOLLOW_value_in_term860);
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:270:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
    public final Node value() throws RecognitionException {
        Node ast = null;

        Node f = null;

        Node l = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:271:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:271:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
            {
            pushFollow(FOLLOW_fatt_in_value906);
            f=fatt();

            state._fsp--;

            ast = f;
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:272:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
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
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:273:7: ( TIMES l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:273:7: ( TIMES l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:274:8: TIMES l= fatt
            	    {
            	    match(input,TIMES,FOLLOW_TIMES_in_value932); 
            	    pushFollow(FOLLOW_fatt_in_value936);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new TimesNode (ast,l);

            	    }


            	    }
            	    break;
            	case 2 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:277:9: ( DIVIDE l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:277:9: ( DIVIDE l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:278:9: DIVIDE l= fatt
            	    {
            	    match(input,DIVIDE,FOLLOW_DIVIDE_in_value976); 
            	    pushFollow(FOLLOW_fatt_in_value980);
            	    l=fatt();

            	    state._fsp--;

            	    ast = new DivNode(ast,l);

            	    }


            	    }
            	    break;
            	case 3 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:281:9: ( AND l= fatt )
            	    {
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:281:9: ( AND l= fatt )
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:282:9: AND l= fatt
            	    {
            	    match(input,AND,FOLLOW_AND_in_value1019); 
            	    pushFollow(FOLLOW_fatt_in_value1023);
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:287:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
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
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:288:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR | i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:288:4: n= NAT
                    {
                    n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt1070); 
                    ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:290:4: TRUE
                    {
                    match(input,TRUE,FOLLOW_TRUE_in_fatt1086); 
                    ast = new BoolNode(true);

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:292:4: FALSE
                    {
                    match(input,FALSE,FOLLOW_FALSE_in_fatt1101); 
                    ast = new BoolNode(false);

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:294:4: EMPTY
                    {
                    match(input,EMPTY,FOLLOW_EMPTY_in_fatt1113); 
                    ast = new EmptyNode();

                    }
                    break;
                case 5 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:296:4: LPAR e= exp RPAR
                    {
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1127); 
                    pushFollow(FOLLOW_exp_in_fatt1131);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1133); 
                    ast = e;

                    }
                    break;
                case 6 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:298:4: i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_fatt1148); 

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
                    	
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:323:4: ( LANPAR cgt= concreteGenericType RANPAR )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LANPAR) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:323:5: LANPAR cgt= concreteGenericType RANPAR
                            {
                            match(input,LANPAR,FOLLOW_LANPAR_in_fatt1158); 
                            pushFollow(FOLLOW_concreteGenericType_in_fatt1164);
                            cgt=concreteGenericType();

                            state._fsp--;

                             genericType = cgt; 
                            match(input,RANPAR,FOLLOW_RANPAR_in_fatt1169); 

                            }
                            break;

                    }

                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:324:3: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==LPAR) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:325:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
                            {
                            match(input,LPAR,FOLLOW_LPAR_in_fatt1180); 
                            ArrayList<Node> parList = new ArrayList<Node>();
                            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:328:3: (fp= exp ( COMMA p= exp )* )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==ID||LA13_0==LPAR||(LA13_0>=NAT && LA13_0<=IF)||LA13_0==SLPAR||(LA13_0>=FIRST && LA13_0<=NOT)) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:329:4: fp= exp ( COMMA p= exp )*
                                    {
                                    pushFollow(FOLLOW_exp_in_fatt1199);
                                    fp=exp();

                                    state._fsp--;

                                    parList.add(fp);
                                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:330:4: ( COMMA p= exp )*
                                    loop12:
                                    do {
                                        int alt12=2;
                                        int LA12_0 = input.LA(1);

                                        if ( (LA12_0==COMMA) ) {
                                            alt12=1;
                                        }


                                        switch (alt12) {
                                    	case 1 :
                                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:330:5: COMMA p= exp
                                    	    {
                                    	    match(input,COMMA,FOLLOW_COMMA_in_fatt1207); 
                                    	    pushFollow(FOLLOW_exp_in_fatt1211);
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

                            match(input,RPAR,FOLLOW_RPAR_in_fatt1225); 

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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:342:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
                    {
                    match(input,IF,FOLLOW_IF_in_fatt1236); 
                    pushFollow(FOLLOW_exp_in_fatt1240);
                    x=exp();

                    state._fsp--;

                    match(input,THEN,FOLLOW_THEN_in_fatt1242); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1244); 
                    pushFollow(FOLLOW_exp_in_fatt1248);
                    y=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1250); 
                    match(input,ELSE,FOLLOW_ELSE_in_fatt1255); 
                    match(input,CLPAR,FOLLOW_CLPAR_in_fatt1257); 
                    pushFollow(FOLLOW_exp_in_fatt1261);
                    z=exp();

                    state._fsp--;

                    match(input,CRPAR,FOLLOW_CRPAR_in_fatt1263); 
                    ast = new IfNode(x,y,z);

                    }
                    break;
                case 8 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:346:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
                    {
                    match(input,SLPAR,FOLLOW_SLPAR_in_fatt1277); 
                    pushFollow(FOLLOW_exp_in_fatt1281);
                    e1=exp();

                    state._fsp--;

                    match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt1283); 
                    pushFollow(FOLLOW_exp_in_fatt1287);
                    e2=exp();

                    state._fsp--;

                    match(input,SRPAR,FOLLOW_SRPAR_in_fatt1289); 
                    ast = new ListNode(e1,e2);

                    }
                    break;
                case 9 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:349:4: FIRST LPAR e= exp RPAR
                    {
                    match(input,FIRST,FOLLOW_FIRST_in_fatt1302); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1304); 
                    pushFollow(FOLLOW_exp_in_fatt1308);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1310); 
                    ast = new FirstNode(e);

                    }
                    break;
                case 10 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:352:4: REST LPAR e= exp RPAR
                    {
                    match(input,REST,FOLLOW_REST_in_fatt1327); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1329); 
                    pushFollow(FOLLOW_exp_in_fatt1333);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1335); 
                    ast = new RestNode(e);

                    }
                    break;
                case 11 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:355:4: PRINT LPAR e= exp RPAR
                    {
                    match(input,PRINT,FOLLOW_PRINT_in_fatt1352); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1354); 
                    pushFollow(FOLLOW_exp_in_fatt1358);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1360); 
                    ast = new PrintNode(e);

                    }
                    break;
                case 12 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:358:4: NOT LPAR e= exp RPAR
                    {
                    match(input,NOT,FOLLOW_NOT_in_fatt1377); 
                    match(input,LPAR,FOLLOW_LPAR_in_fatt1379); 
                    pushFollow(FOLLOW_exp_in_fatt1383);
                    e=exp();

                    state._fsp--;

                    match(input,RPAR,FOLLOW_RPAR_in_fatt1385); 
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

    public static class type_return extends ParserRuleReturnScope {
        public Node ast;
    };

    // $ANTLR start "type"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:369:1: type returns [Node ast] : (bt= baseType | at= arrowType | lt= listType | i= ID );
    public final MiniFunParser.type_return type() throws RecognitionException {
        MiniFunParser.type_return retval = new MiniFunParser.type_return();
        retval.start = input.LT(1);

        Token i=null;
        Node bt = null;

        Node at = null;

        Node lt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:370:2: (bt= baseType | at= arrowType | lt= listType | i= ID )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:370:4: bt= baseType
                    {
                    pushFollow(FOLLOW_baseType_in_type1416);
                    bt=baseType();

                    state._fsp--;

                    retval.ast = bt;

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:371:6: at= arrowType
                    {
                    pushFollow(FOLLOW_arrowType_in_type1427);
                    at=arrowType();

                    state._fsp--;

                    retval.ast = at;

                    }
                    break;
                case 3 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:372:4: lt= listType
                    {
                    pushFollow(FOLLOW_listType_in_type1436);
                    lt=listType();

                    state._fsp--;

                    retval.ast = lt; 

                    }
                    break;
                case 4 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:373:4: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_type1445); 
                     retval.ast = new GenericTypeNode((i!=null?i.getText():null)); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"


    // $ANTLR start "baseType"
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:376:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
    public final Node baseType() throws RecognitionException {
        Node ast = null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:377:2: ( INTTYPE | BOOLTYPE )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:377:4: INTTYPE
                    {
                    match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1465); 
                    ast = new IntTypeNode();

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:378:6: BOOLTYPE
                    {
                    match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1477); 
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:382:1: arrowType returns [Node ast] : LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType ;
    public final Node arrowType() throws RecognitionException {
        Node ast = null;

        MiniFunParser.type_return t1 = null;

        MiniFunParser.type_return tn = null;

        Node rt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:383:3: ( LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:383:6: LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType
            {
            match(input,LPAR,FOLLOW_LPAR_in_arrowType1503); 

             				ArrowTypeNode atn= new ArrowTypeNode();
             				HashMap<String,STentry> hm= symTable.get(nestingLevel);
             			
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:387:5: ( (t1= type ) ( COMMA (tn= type ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ID||LA19_0==LPAR||(LA19_0>=INTTYPE && LA19_0<=BOOLTYPE)||LA19_0==LIST) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:388:6: (t1= type ) ( COMMA (tn= type ) )*
                    {
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:388:6: (t1= type )
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:388:7: t1= type
                    {
                    pushFollow(FOLLOW_type_in_arrowType1521);
                    t1=type();

                    state._fsp--;


                    }


                     				
                     				if((t1!=null?t1.ast:null).getNodeType() == NodeType.GENERICTYPE_NODE)
                    			    	 {
                    			    	 	if (hm.get( ( ( GenericTypeNode )  (t1!=null?t1.ast:null)).getGenericTypeID()) != null)
                    				    	 	atn.addParType( hm.get(( ( GenericTypeNode )  (t1!=null?t1.ast:null)).getGenericTypeID()).getNode() );
                    				    	else{
                    					    	System.out.println("Identifier "+ (t1!=null?input.toString(t1.start,t1.stop):null) +" Not recognized, generic type ID match");
                    				      		System.exit(0);
                    				      		}
                    			    	 }
                    			    	 else
                    				    	 atn.addParType((t1!=null?t1.ast:null));
                     				
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:402:6: ( COMMA (tn= type ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==COMMA) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:403:7: COMMA (tn= type )
                    	    {
                    	    match(input,COMMA,FOLLOW_COMMA_in_arrowType1540); 
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:403:13: (tn= type )
                    	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:403:14: tn= type
                    	    {
                    	    pushFollow(FOLLOW_type_in_arrowType1545);
                    	    tn=type();

                    	    state._fsp--;


                    	    }


                    	    						
                    	    						if((tn!=null?tn.ast:null).getNodeType() == NodeType.GENERICTYPE_NODE)
                    	    						{
                    	    						if (hm.get( ( ( GenericTypeNode )  (tn!=null?tn.ast:null)).getGenericTypeID()) != null)
                    	    				    	 	atn.addParType( hm.get(( ( GenericTypeNode )  (tn!=null?tn.ast:null)).getGenericTypeID()).getNode() );
                    	    				    	else{
                    	    							System.out.println("Identifier "+ (tn!=null?input.toString(tn.start,tn.stop):null) +" Not recognized, generic type ID match");
                    	    							System.exit(0);
                    	    							}
                    	    						}
                    	    						else
                    	    							atn.addParType((tn!=null?tn.ast:null));
                    	     					

                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,RPAR,FOLLOW_RPAR_in_arrowType1570); 
            match(input,ARROW,FOLLOW_ARROW_in_arrowType1572); 
            pushFollow(FOLLOW_baseType_in_arrowType1576);
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:425:1: concreteGenericType returns [ArrayList<Node> ast] : bt= baseType ( COMMA bt1= baseType )* ;
    public final ArrayList<Node> concreteGenericType() throws RecognitionException {
        ArrayList<Node> ast = null;

        Node bt = null;

        Node bt1 = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:426:2: (bt= baseType ( COMMA bt1= baseType )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:427:3: bt= baseType ( COMMA bt1= baseType )*
            {
            pushFollow(FOLLOW_baseType_in_concreteGenericType1602);
            bt=baseType();

            state._fsp--;

            ArrayList<Node> generic = new ArrayList<Node>(); generic.add(bt);
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:428:3: ( COMMA bt1= baseType )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==COMMA) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:428:4: COMMA bt1= baseType
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_concreteGenericType1609); 
            	    pushFollow(FOLLOW_baseType_in_concreteGenericType1613);
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:431:1: genericType returns [ArrayList<GenericTypeNode> ast] : i= ID ( COMMA f= ID )* ;
    public final ArrayList<GenericTypeNode> genericType() throws RecognitionException {
        ArrayList<GenericTypeNode> ast = null;

        Token i=null;
        Token f=null;

        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:432:2: (i= ID ( COMMA f= ID )* )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:432:4: i= ID ( COMMA f= ID )*
            {
            ArrayList<GenericTypeNode> generics = new ArrayList<GenericTypeNode>();
            i=(Token)match(input,ID,FOLLOW_ID_in_genericType1644); 
              generics.add(new GenericTypeNode( (i!=null?i.getText():null) ));  
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:435:3: ( COMMA f= ID )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==COMMA) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:435:5: COMMA f= ID
            	    {
            	    match(input,COMMA,FOLLOW_COMMA_in_genericType1652); 
            	    f=(Token)match(input,ID,FOLLOW_ID_in_genericType1656); 
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
    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:438:1: listType returns [Node ast] : LIST SLPAR (bt= baseType | i= ID ) SRPAR ;
    public final Node listType() throws RecognitionException {
        Node ast = null;

        Token i=null;
        Node bt = null;


        try {
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:439:2: ( LIST SLPAR (bt= baseType | i= ID ) SRPAR )
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:439:4: LIST SLPAR (bt= baseType | i= ID ) SRPAR
            {
            match(input,LIST,FOLLOW_LIST_in_listType1681); 
            match(input,SLPAR,FOLLOW_SLPAR_in_listType1683); 
             Node generic = null; 
            // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:440:2: (bt= baseType | i= ID )
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
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:441:2: bt= baseType
                    {
                    pushFollow(FOLLOW_baseType_in_listType1694);
                    bt=baseType();

                    state._fsp--;

                     generic = new ConcreteListParamTypeNode(bt); 

                    }
                    break;
                case 2 :
                    // /Users/Thomas/Dropbox/Universita/Magistrale/Primo Anno/LPeMC/Esercitazioni/Minifun/LPeMC_PRJ/LPeMC_Prj/bin/highLevelLanguage/MiniFun.g:442:4: i= ID
                    {
                    i=(Token)match(input,ID,FOLLOW_ID_in_listType1703); 
                    generic = new GenericListParamTypeNode(new GenericTypeNode( (i!=null?i.getText():null) )); 

                    }
                    break;

            }

            match(input,SRPAR,FOLLOW_SRPAR_in_listType1710); 
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
    public static final BitSet FOLLOW_COL_in_declist204 = new BitSet(new long[]{0x00000C0000004000L});
    public static final BitSet FOLLOW_baseType_in_declist209 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_declist224 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_ID_in_declist254 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist277 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_declist281 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_declist312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist316 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COL_in_declist339 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_declist343 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_arrowType_in_declist383 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_declist398 = new BitSet(new long[]{0x0000000000010100L});
    public static final BitSet FOLLOW_ID_in_declist427 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_declist449 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_declist453 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_declist491 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_declist500 = new BitSet(new long[]{0x000003C9F0004980L});
    public static final BitSet FOLLOW_declist_in_declist519 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_declist541 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_declist567 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_SEMIC_in_declist574 = new BitSet(new long[]{0x0000000000000882L});
    public static final BitSet FOLLOW_term_in_exp601 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_EQ_in_exp621 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp625 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_LESSEQ_in_exp665 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp669 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_GREATEREQ_in_exp700 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_term_in_exp704 = new BitSet(new long[]{0x0000000000380002L});
    public static final BitSet FOLLOW_value_in_term749 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_PLUS_in_term770 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term774 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_MINUS_in_term813 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term817 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_OR_in_term856 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_value_in_term860 = new BitSet(new long[]{0x0000000001C00002L});
    public static final BitSet FOLLOW_fatt_in_value906 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_TIMES_in_value932 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value936 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_DIVIDE_in_value976 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value980 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_AND_in_value1019 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_fatt_in_value1023 = new BitSet(new long[]{0x000000000E000002L});
    public static final BitSet FOLLOW_NAT_in_fatt1070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_fatt1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_fatt1101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EMPTY_in_fatt1113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1127 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1131 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_fatt1148 = new BitSet(new long[]{0x0000000000005002L});
    public static final BitSet FOLLOW_LANPAR_in_fatt1158 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_concreteGenericType_in_fatt1164 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RANPAR_in_fatt1169 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_LPAR_in_fatt1180 = new BitSet(new long[]{0x000003C9F0014100L});
    public static final BitSet FOLLOW_exp_in_fatt1199 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_fatt1207 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1211 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_fatt1236 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1240 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_THEN_in_fatt1242 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1244 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1248 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1250 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ELSE_in_fatt1255 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_CLPAR_in_fatt1257 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1261 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_CRPAR_in_fatt1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SLPAR_in_fatt1277 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1281 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_DOUBLECOL_in_fatt1283 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1287 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SRPAR_in_fatt1289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FIRST_in_fatt1302 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1304 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1308 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REST_in_fatt1327 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1329 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1333 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PRINT_in_fatt1352 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1354 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1358 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1360 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_in_fatt1377 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_LPAR_in_fatt1379 = new BitSet(new long[]{0x000003C9F0004100L});
    public static final BitSet FOLLOW_exp_in_fatt1383 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_RPAR_in_fatt1385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_type1416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrowType_in_type1427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_listType_in_type1436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type1445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTTYPE_in_baseType1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLTYPE_in_baseType1477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAR_in_arrowType1503 = new BitSet(new long[]{0x00002C0000014100L});
    public static final BitSet FOLLOW_type_in_arrowType1521 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_COMMA_in_arrowType1540 = new BitSet(new long[]{0x00002C0000004100L});
    public static final BitSet FOLLOW_type_in_arrowType1545 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_RPAR_in_arrowType1570 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_ARROW_in_arrowType1572 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_baseType_in_arrowType1576 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_baseType_in_concreteGenericType1602 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_concreteGenericType1609 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_baseType_in_concreteGenericType1613 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_ID_in_genericType1644 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_COMMA_in_genericType1652 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ID_in_genericType1656 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_LIST_in_listType1681 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_SLPAR_in_listType1683 = new BitSet(new long[]{0x00000C0000000100L});
    public static final BitSet FOLLOW_baseType_in_listType1694 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_listType1703 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_SRPAR_in_listType1710 = new BitSet(new long[]{0x0000000000000002L});

}