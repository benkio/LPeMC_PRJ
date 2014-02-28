// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-02-28 17:55:32

package highLevelLanguage;

import highLevelLanguage.Node.*;
import java.util.HashMap;
import java.util.ArrayList;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class MiniFunParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "AND", "ARROW", "ASS", "BOOLTYPE", 
		"CLPAR", "COL", "COMMA", "CRPAR", "DIVIDE", "DOUBLECOL", "ELSE", "EMPTY", 
		"EQ", "ERR", "FALSE", "FIRST", "FUN", "GREATEREQ", "ID", "IF", "IN", "INTTYPE", 
		"LANPAR", "LESSEQ", "LET", "LIST", "LPAR", "MINUS", "NAT", "NOT", "OR", 
		"PLUS", "PRINT", "RANPAR", "REST", "RPAR", "SEMIC", "SLPAR", "SRPAR", 
		"THEN", "TIMES", "TRUE", "VAR", "WHITESP"
	};
	public static final int EOF=-1;
	public static final int AND=4;
	public static final int ARROW=5;
	public static final int ASS=6;
	public static final int BOOLTYPE=7;
	public static final int CLPAR=8;
	public static final int COL=9;
	public static final int COMMA=10;
	public static final int CRPAR=11;
	public static final int DIVIDE=12;
	public static final int DOUBLECOL=13;
	public static final int ELSE=14;
	public static final int EMPTY=15;
	public static final int EQ=16;
	public static final int ERR=17;
	public static final int FALSE=18;
	public static final int FIRST=19;
	public static final int FUN=20;
	public static final int GREATEREQ=21;
	public static final int ID=22;
	public static final int IF=23;
	public static final int IN=24;
	public static final int INTTYPE=25;
	public static final int LANPAR=26;
	public static final int LESSEQ=27;
	public static final int LET=28;
	public static final int LIST=29;
	public static final int LPAR=30;
	public static final int MINUS=31;
	public static final int NAT=32;
	public static final int NOT=33;
	public static final int OR=34;
	public static final int PLUS=35;
	public static final int PRINT=36;
	public static final int RANPAR=37;
	public static final int REST=38;
	public static final int RPAR=39;
	public static final int SEMIC=40;
	public static final int SLPAR=41;
	public static final int SRPAR=42;
	public static final int THEN=43;
	public static final int TIMES=44;
	public static final int TRUE=45;
	public static final int VAR=46;
	public static final int WHITESP=47;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public MiniFunParser(TokenStream input) {
		this(input, new RecognizerSharedState());
	}
	public MiniFunParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	@Override public String[] getTokenNames() { return MiniFunParser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g"; }


	    private ArrayList<HashMap<String,STentry>> symTable = new ArrayList<HashMap<String,STentry>>();    
	    private int nestingLevel=0;             



	// $ANTLR start "prog"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:24:1: prog returns [Node ast] : LET d= declist IN e= exp SEMIC ;
	public final Node prog() throws RecognitionException {
		Node ast = null;


		ArrayList<Node> d =null;
		Node e =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:25:2: ( LET d= declist IN e= exp SEMIC )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:25:4: LET d= declist IN e= exp SEMIC
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "prog"



	// $ANTLR start "declist"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
	public final ArrayList<Node> declist() throws RecognitionException {
		ArrayList<Node> astList = null;


		Token i=null;
		Token fpi=null;
		Token pi=null;
		Node t =null;
		Node e =null;
		ArrayList<GenericTypeNode> gt =null;
		Node rt =null;
		ParserRuleReturnScope fpt =null;
		ParserRuleReturnScope pt =null;
		ArrayList<Node> dec =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:38:2: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:39:2: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
			{

					astList = new ArrayList<Node>();
			   		int offSet=1;
			   	
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:43:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
			loop7:
			while (true) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:43:5: VAR i= ID COL t= baseType ASS e= exp SEMIC
					{
					match(input,VAR,FOLLOW_VAR_in_declist99); 
					i=(Token)match(input,ID,FOLLOW_ID_in_declist103); 
					match(input,COL,FOLLOW_COL_in_declist105); 
					pushFollow(FOLLOW_baseType_in_declist109);
					t=baseType();
					state._fsp--;

					match(input,ASS,FOLLOW_ASS_in_declist111); 
					pushFollow(FOLLOW_exp_in_declist115);
					e=exp();
					state._fsp--;

					match(input,SEMIC,FOLLOW_SEMIC_in_declist117); 

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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:56:6: FUN i= ID ( LANPAR gt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
					{
					match(input,FUN,FOLLOW_FUN_in_declist130); 
					i=(Token)match(input,ID,FOLLOW_ID_in_declist134); 

					   		DecFunNode fn = null;
					   		ArrayList<GenericTypeNode> generics=null;
					   	
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:61:5: ( LANPAR gt= genericType RANPAR )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==LANPAR) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:61:7: LANPAR gt= genericType RANPAR
							{
							match(input,LANPAR,FOLLOW_LANPAR_in_declist148); 
							pushFollow(FOLLOW_genericType_in_declist152);
							gt=genericType();
							state._fsp--;


							   		generics=gt;
							   	
							match(input,RANPAR,FOLLOW_RANPAR_in_declist166); 
							}
							break;

					}

					match(input,COL,FOLLOW_COL_in_declist170); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:65:18: (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? )
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0==BOOLTYPE||LA6_0==INTTYPE) ) {
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
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:65:19: rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
							{
							pushFollow(FOLLOW_baseType_in_declist175);
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
							  	
							match(input,LPAR,FOLLOW_LPAR_in_declist188); 
							   		
								        int parOffSet=-1;
								        hm = new HashMap<String,STentry>();
								        symTable.add(hm);
								        nestingLevel++;
								        
								        if (generics !=null)
								        {
								        	for (int j = 0; j<generics.size() ; j++){
								        		STentry genericEntry = new STentry(generics.get(j),0);
								        		if (hm.put(generics.get(j).getId(),genericEntry) != null){
								 		    		System.out.println("Identifier "+generics.get(j).getId() +" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
								 		      		System.exit(0);
								 		      	}
								        	}
								        }
								        
								
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:96:2: (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==ID) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:96:4: fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist200); 

											ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
										
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:100:2: ( COL fpt= type )
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:100:4: COL fpt= type
									{
									match(input,COL,FOLLOW_COL_in_declist209); 
									pushFollow(FOLLOW_type_in_declist213);
									fpt=type();
									state._fsp--;


											if((fpt!=null?((MiniFunParser.type_return)fpt).ast:null).getNodeType() == NodeType.ARROWTYPE_NODE){
												parOffSet-=1;
											}
											if((fpt!=null?((MiniFunParser.type_return)fpt).ast:null).getNodeType() == NodeType.GENERICTYPE_NODE) {
												if (hm.get( ( (GenericTypeNode)  (fpt!=null?((MiniFunParser.type_return)fpt).ast:null)).getId()) != null)
													pn.addType( hm.get( ( (GenericTypeNode) (fpt!=null?((MiniFunParser.type_return)fpt).ast:null)).getId()).getNode() );	
												else{
													System.out.println("Identifier "+ (fpi!=null?fpi.getText():null) +" at line "+(fpi!=null?fpi.getLine():0)+" Not recognized, generic type ID match");
													System.exit(0);
												}
											}
											else
												pn.addType( (fpt!=null?((MiniFunParser.type_return)fpt).ast:null) );
										
									}


											entry = new STentry(pn,parOffSet--);
											hm.put((fpt!=null?input.toString(fpt.start,fpt.stop):null),entry);
											fn.addParam(pn);
										
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:122:2: ( COMMA pi= ID ( COL pt= type ) )*
									loop2:
									while (true) {
										int alt2=2;
										int LA2_0 = input.LA(1);
										if ( (LA2_0==COMMA) ) {
											alt2=1;
										}

										switch (alt2) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:122:3: COMMA pi= ID ( COL pt= type )
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist226); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist230); 

													pn = new ParamNode((pi!=null?pi.getText():null));
												
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:126:2: ( COL pt= type )
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:126:4: COL pt= type
											{
											match(input,COL,FOLLOW_COL_in_declist240); 
											pushFollow(FOLLOW_type_in_declist244);
											pt=type();
											state._fsp--;


													if((pt!=null?((MiniFunParser.type_return)pt).ast:null).getNodeType() == NodeType.ARROWTYPE_NODE){
														parOffSet-=1;
													}
													if((pt!=null?((MiniFunParser.type_return)pt).ast:null).getNodeType() == NodeType.GENERICTYPE_NODE){
														if (hm.get( ( (GenericTypeNode) (pt!=null?((MiniFunParser.type_return)pt).ast:null)).getId()) != null)
															pn.addType( hm.get( ( (GenericTypeNode) (pt!=null?((MiniFunParser.type_return)pt).ast:null)).getId()).getNode() );
														else{
															System.out.println("Identifier "+ (pt!=null?input.toString(pt.start,pt.stop):null) +" at line "+(pi!=null?pi.getLine():0)+" Not recognized, generic type ID match");
															System.exit(0);
														}
													}
													else
														pn.addType( (pt!=null?((MiniFunParser.type_return)pt).ast:null) );
												
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
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:151:9: rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )?
							{
							pushFollow(FOLLOW_arrowType_in_declist265);
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
							  	
							match(input,LPAR,FOLLOW_LPAR_in_declist278); 
									   		
								        int parOffSet=-1;
								        hm = new HashMap<String,STentry>();
								        symTable.add(hm);
								        nestingLevel++;
								        int parCont=0;
								        
								        if (generics !=null)
								        {
								        	for (int j = 0; j<generics.size() ; j++){
								        		STentry genericEntry = new STentry(generics.get(j),0);
								        		if (hm.put(generics.get(j).getId(),genericEntry) != null){
										    		System.out.println("Identifier "+ generics.get(j).getId() +" at line "+(i!=null?i.getLine():0)+" already defined, generic type ID match");
										      		System.exit(0);
										      	}
								        	}
								        }
								
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:181:2: (fpi= ID ( COMMA pi= ID )* )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ID) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:181:3: fpi= ID ( COMMA pi= ID )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist289); 

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
										
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:195:2: ( COMMA pi= ID )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==COMMA) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:195:3: COMMA pi= ID
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist297); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist301); 

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
									}

									}
									break;

							}

							}
							break;

					}

					match(input,RPAR,FOLLOW_RPAR_in_declist315); 
					match(input,CLPAR,FOLLOW_CLPAR_in_declist317); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:21: ( (dec= declist ) e= exp )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:23: (dec= declist ) e= exp
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:23: (dec= declist )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:24: dec= declist
					{
					pushFollow(FOLLOW_declist_in_declist324);
					dec=declist();
					state._fsp--;

					}


					    		fn.addLocalDeclarationList(dec);
					    	
					pushFollow(FOLLOW_exp_in_declist344);
					e=exp();
					state._fsp--;


					        	fn.addExpValue(e);
					       		symTable.remove(nestingLevel--);
					       		astList.add(fn);
					       	
					}

					match(input,CRPAR,FOLLOW_CRPAR_in_declist364); 
					match(input,SEMIC,FOLLOW_SEMIC_in_declist366); 
					}
					break;

				default :
					break loop7;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return astList;
	}
	// $ANTLR end "declist"



	// $ANTLR start "exp"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:224:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
	public final Node exp() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:225:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:225:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
			{
			pushFollow(FOLLOW_term_in_exp393);
			f=term();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:226:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
			loop8:
			while (true) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:226:8: ( EQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:226:8: ( EQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:227:8: EQ l= term
					{
					match(input,EQ,FOLLOW_EQ_in_exp413); 
					pushFollow(FOLLOW_term_in_exp417);
					l=term();
					state._fsp--;

					ast = new EqualNode(ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:230:9: ( LESSEQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:230:9: ( LESSEQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:231:9: LESSEQ l= term
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_exp457); 
					pushFollow(FOLLOW_term_in_exp461);
					l=term();
					state._fsp--;

					ast = new LessEqualNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:234:9: ( GREATEREQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:234:9: ( GREATEREQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:234:11: GREATEREQ l= term
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp492); 
					pushFollow(FOLLOW_term_in_exp496);
					l=term();
					state._fsp--;

					ast = new GreatEqualNode(ast,l);
					}

					}
					break;

				default :
					break loop8;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "exp"



	// $ANTLR start "term"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:239:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
	public final Node term() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:240:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:240:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
			{
			pushFollow(FOLLOW_value_in_term541);
			f=value();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:241:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
			loop9:
			while (true) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:242:5: ( PLUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:242:5: ( PLUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:243:5: PLUS l= value
					{
					match(input,PLUS,FOLLOW_PLUS_in_term562); 
					pushFollow(FOLLOW_value_in_term566);
					l=value();
					state._fsp--;

					ast = new PlusNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:246:9: ( MINUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:246:9: ( MINUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:247:9: MINUS l= value
					{
					match(input,MINUS,FOLLOW_MINUS_in_term605); 
					pushFollow(FOLLOW_value_in_term609);
					l=value();
					state._fsp--;

					ast = new MinusNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:250:9: ( OR l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:250:9: ( OR l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:251:9: OR l= value
					{
					match(input,OR,FOLLOW_OR_in_term648); 
					pushFollow(FOLLOW_value_in_term652);
					l=value();
					state._fsp--;

					ast = new OrNode(ast,l);
					}

					}
					break;

				default :
					break loop9;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "term"



	// $ANTLR start "value"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:257:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
	public final Node value() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:258:2: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:258:4: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
			{
			pushFollow(FOLLOW_fatt_in_value697);
			f=fatt();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:259:2: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
			loop10:
			while (true) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:259:4: ( TIMES l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:259:4: ( TIMES l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:259:6: TIMES l= fatt
					{
					match(input,TIMES,FOLLOW_TIMES_in_value706); 
					pushFollow(FOLLOW_fatt_in_value710);
					l=fatt();
					state._fsp--;

					ast = new TimesNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:4: ( DIVIDE l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:4: ( DIVIDE l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:6: DIVIDE l= fatt
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_value721); 
					pushFollow(FOLLOW_fatt_in_value725);
					l=fatt();
					state._fsp--;

					ast = new DivNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:261:4: ( AND l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:261:4: ( AND l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:261:6: AND l= fatt
					{
					match(input,AND,FOLLOW_AND_in_value736); 
					pushFollow(FOLLOW_fatt_in_value740);
					l=fatt();
					state._fsp--;

					ast = new AndNode(ast,l);
					}

					}
					break;

				default :
					break loop10;
				}
			}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "value"



	// $ANTLR start "fatt"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:263:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LANPAR (cgt= concreteGenericType |gi= linkedGenericType ) RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
	public final Node fatt() throws RecognitionException {
		Node ast = null;


		Token n=null;
		Token i=null;
		Node e =null;
		ArrayList<Node> cgt =null;
		ArrayList <Node> gi =null;
		Node fp =null;
		Node p =null;
		Node x =null;
		Node y =null;
		Node z =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:264:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LANPAR (cgt= concreteGenericType |gi= linkedGenericType ) RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
			int alt16=12;
			switch ( input.LA(1) ) {
			case NAT:
				{
				alt16=1;
				}
				break;
			case TRUE:
				{
				alt16=2;
				}
				break;
			case FALSE:
				{
				alt16=3;
				}
				break;
			case EMPTY:
				{
				alt16=4;
				}
				break;
			case LPAR:
				{
				alt16=5;
				}
				break;
			case ID:
				{
				alt16=6;
				}
				break;
			case IF:
				{
				alt16=7;
				}
				break;
			case SLPAR:
				{
				alt16=8;
				}
				break;
			case FIRST:
				{
				alt16=9;
				}
				break;
			case REST:
				{
				alt16=10;
				}
				break;
			case PRINT:
				{
				alt16=11;
				}
				break;
			case NOT:
				{
				alt16=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 16, 0, input);
				throw nvae;
			}
			switch (alt16) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:264:4: n= NAT
					{
					n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt767); 
					ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:265:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_fatt776); 
					ast = new BoolNode(true);
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:266:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_fatt785); 
					ast = new BoolNode(false);
					}
					break;
				case 4 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:267:4: EMPTY
					{
					match(input,EMPTY,FOLLOW_EMPTY_in_fatt793); 
					ast = new EmptyNode();
					}
					break;
				case 5 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:268:4: LPAR e= exp RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_fatt803); 
					pushFollow(FOLLOW_exp_in_fatt807);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt809); 
					ast = e;
					}
					break;
				case 6 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:269:4: i= ID ( LANPAR (cgt= concreteGenericType |gi= linkedGenericType ) RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_fatt820); 

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
						
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:292:2: ( LANPAR (cgt= concreteGenericType |gi= linkedGenericType ) RANPAR )?
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==LANPAR) ) {
						alt12=1;
					}
					switch (alt12) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:292:4: LANPAR (cgt= concreteGenericType |gi= linkedGenericType ) RANPAR
							{
							match(input,LANPAR,FOLLOW_LANPAR_in_fatt829); 
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:292:11: (cgt= concreteGenericType |gi= linkedGenericType )
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==BOOLTYPE||LA11_0==INTTYPE) ) {
								alt11=1;
							}
							else if ( (LA11_0==ID) ) {
								alt11=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 11, 0, input);
								throw nvae;
							}

							switch (alt11) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:292:12: cgt= concreteGenericType
									{
									pushFollow(FOLLOW_concreteGenericType_in_fatt834);
									cgt=concreteGenericType();
									state._fsp--;

									 
											genericType = cgt; 
										
									}
									break;
								case 2 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:296:4: gi= linkedGenericType
									{
									pushFollow(FOLLOW_linkedGenericType_in_fatt846);
									gi=linkedGenericType();
									state._fsp--;

											
											genericType = gi;	
										
									}
									break;

							}

							match(input,RANPAR,FOLLOW_RANPAR_in_fatt853); 
							}
							break;

					}

					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:301:2: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==LPAR) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:301:4: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
							{
							match(input,LPAR,FOLLOW_LPAR_in_fatt862); 
							ArrayList<Node> parList = new ArrayList<Node>();
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:302:2: (fp= exp ( COMMA p= exp )* )?
							int alt14=2;
							int LA14_0 = input.LA(1);
							if ( (LA14_0==EMPTY||(LA14_0 >= FALSE && LA14_0 <= FIRST)||(LA14_0 >= ID && LA14_0 <= IF)||LA14_0==LPAR||(LA14_0 >= NAT && LA14_0 <= NOT)||LA14_0==PRINT||LA14_0==REST||LA14_0==SLPAR||LA14_0==TRUE) ) {
								alt14=1;
							}
							switch (alt14) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:302:4: fp= exp ( COMMA p= exp )*
									{
									pushFollow(FOLLOW_exp_in_fatt871);
									fp=exp();
									state._fsp--;

									parList.add(fp);
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:303:2: ( COMMA p= exp )*
									loop13:
									while (true) {
										int alt13=2;
										int LA13_0 = input.LA(1);
										if ( (LA13_0==COMMA) ) {
											alt13=1;
										}

										switch (alt13) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:303:4: COMMA p= exp
											{
											match(input,COMMA,FOLLOW_COMMA_in_fatt878); 
											pushFollow(FOLLOW_exp_in_fatt882);
											p=exp();
											state._fsp--;

											parList.add(p);
											}
											break;

										default :
											break loop13;
										}
									}

									}
									break;

							}

							match(input,RPAR,FOLLOW_RPAR_in_fatt892); 

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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:313:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
					{
					match(input,IF,FOLLOW_IF_in_fatt906); 
					pushFollow(FOLLOW_exp_in_fatt910);
					x=exp();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_fatt912); 
					match(input,CLPAR,FOLLOW_CLPAR_in_fatt914); 
					pushFollow(FOLLOW_exp_in_fatt918);
					y=exp();
					state._fsp--;

					match(input,CRPAR,FOLLOW_CRPAR_in_fatt920); 
					match(input,ELSE,FOLLOW_ELSE_in_fatt922); 
					match(input,CLPAR,FOLLOW_CLPAR_in_fatt924); 
					pushFollow(FOLLOW_exp_in_fatt928);
					z=exp();
					state._fsp--;

					match(input,CRPAR,FOLLOW_CRPAR_in_fatt930); 
					ast = new IfNode(x,y,z);
					}
					break;
				case 8 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:314:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
					{
					match(input,SLPAR,FOLLOW_SLPAR_in_fatt938); 
					pushFollow(FOLLOW_exp_in_fatt942);
					e1=exp();
					state._fsp--;

					match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt944); 
					pushFollow(FOLLOW_exp_in_fatt948);
					e2=exp();
					state._fsp--;

					match(input,SRPAR,FOLLOW_SRPAR_in_fatt950); 
					ast = new ListNode(e1,e2);
					}
					break;
				case 9 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:315:4: FIRST LPAR e= exp RPAR
					{
					match(input,FIRST,FOLLOW_FIRST_in_fatt957); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt959); 
					pushFollow(FOLLOW_exp_in_fatt963);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt965); 
					ast = new FirstNode(e);
					}
					break;
				case 10 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:316:4: REST LPAR e= exp RPAR
					{
					match(input,REST,FOLLOW_REST_in_fatt972); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt974); 
					pushFollow(FOLLOW_exp_in_fatt978);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt980); 
					ast = new RestNode(e);
					}
					break;
				case 11 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:317:4: PRINT LPAR e= exp RPAR
					{
					match(input,PRINT,FOLLOW_PRINT_in_fatt987); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt989); 
					pushFollow(FOLLOW_exp_in_fatt993);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt995); 
					ast = new PrintNode(e);
					}
					break;
				case 12 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:318:4: NOT LPAR e= exp RPAR
					{
					match(input,NOT,FOLLOW_NOT_in_fatt1002); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt1004); 
					pushFollow(FOLLOW_exp_in_fatt1008);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1010); 
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "fatt"


	public static class type_return extends ParserRuleReturnScope {
		public Node ast;
	};


	// $ANTLR start "type"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:321:1: type returns [Node ast] : (bt= baseType |at= arrowType |lt= listType |i= ID );
	public final MiniFunParser.type_return type() throws RecognitionException {
		MiniFunParser.type_return retval = new MiniFunParser.type_return();
		retval.start = input.LT(1);

		Token i=null;
		Node bt =null;
		Node at =null;
		Node lt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:322:2: (bt= baseType |at= arrowType |lt= listType |i= ID )
			int alt17=4;
			switch ( input.LA(1) ) {
			case BOOLTYPE:
			case INTTYPE:
				{
				alt17=1;
				}
				break;
			case LPAR:
				{
				alt17=2;
				}
				break;
			case LIST:
				{
				alt17=3;
				}
				break;
			case ID:
				{
				alt17=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 17, 0, input);
				throw nvae;
			}
			switch (alt17) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:322:4: bt= baseType
					{
					pushFollow(FOLLOW_baseType_in_type1034);
					bt=baseType();
					state._fsp--;

					retval.ast = bt;
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:323:6: at= arrowType
					{
					pushFollow(FOLLOW_arrowType_in_type1045);
					at=arrowType();
					state._fsp--;

					retval.ast = at;
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:324:4: lt= listType
					{
					pushFollow(FOLLOW_listType_in_type1054);
					lt=listType();
					state._fsp--;

					retval.ast = lt; 
					}
					break;
				case 4 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:325:4: i= ID
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_type1063); 
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
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "type"



	// $ANTLR start "baseType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:328:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
	public final Node baseType() throws RecognitionException {
		Node ast = null;


		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:329:2: ( INTTYPE | BOOLTYPE )
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==INTTYPE) ) {
				alt18=1;
			}
			else if ( (LA18_0==BOOLTYPE) ) {
				alt18=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 18, 0, input);
				throw nvae;
			}

			switch (alt18) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:329:4: INTTYPE
					{
					match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1083); 
					ast = new IntTypeNode();
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:330:6: BOOLTYPE
					{
					match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1095); 
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "baseType"



	// $ANTLR start "arrowType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:334:1: arrowType returns [Node ast] : LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType ;
	public final Node arrowType() throws RecognitionException {
		Node ast = null;


		ParserRuleReturnScope t1 =null;
		ParserRuleReturnScope tn =null;
		Node rt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:335:3: ( LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:335:5: LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType
			{
			match(input,LPAR,FOLLOW_LPAR_in_arrowType1120); 

			 		ArrowTypeNode atn= new ArrowTypeNode();
			 		HashMap<String,STentry> hm= symTable.get(nestingLevel);
			 	
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:340:3: ( (t1= type ) ( COMMA (tn= type ) )* )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==BOOLTYPE||LA20_0==ID||LA20_0==INTTYPE||(LA20_0 >= LIST && LA20_0 <= LPAR)) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:340:4: (t1= type ) ( COMMA (tn= type ) )*
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:340:4: (t1= type )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:340:5: t1= type
					{
					pushFollow(FOLLOW_type_in_arrowType1133);
					t1=type();
					state._fsp--;

					}

					 				
					 		if((t1!=null?((MiniFunParser.type_return)t1).ast:null).getNodeType() == NodeType.GENERICTYPE_NODE) {
								if (hm.get( ( (GenericTypeNode)  (t1!=null?((MiniFunParser.type_return)t1).ast:null)).getId()) != null) atn.addParType( hm.get( ( (GenericTypeNode) (t1!=null?((MiniFunParser.type_return)t1).ast:null)).getId()).getNode() );
							    	else {
								    	System.out.println("Identifier "+ (t1!=null?input.toString(t1.start,t1.stop):null) +" Not recognized in arrowType, generic type ID match");
							      		System.exit(0);
							      	}
						    	}
							else atn.addParType((t1!=null?((MiniFunParser.type_return)t1).ast:null));
					 	
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:351:3: ( COMMA (tn= type ) )*
					loop19:
					while (true) {
						int alt19=2;
						int LA19_0 = input.LA(1);
						if ( (LA19_0==COMMA) ) {
							alt19=1;
						}

						switch (alt19) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:351:5: COMMA (tn= type )
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrowType1145); 
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:351:11: (tn= type )
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:351:12: tn= type
							{
							pushFollow(FOLLOW_type_in_arrowType1150);
							tn=type();
							state._fsp--;

							}


									if((tn!=null?((MiniFunParser.type_return)tn).ast:null).getNodeType() == NodeType.GENERICTYPE_NODE) {
										if (hm.get( ( (GenericTypeNode) (tn!=null?((MiniFunParser.type_return)tn).ast:null)).getId()) != null) atn.addParType( hm.get( ( (GenericTypeNode) (tn!=null?((MiniFunParser.type_return)tn).ast:null)).getId()).getNode() );
										else{
											System.out.println("Identifier "+ (tn!=null?input.toString(tn.start,tn.stop):null) +" Not recognized in arrowType, generic type ID match");
											System.exit(0);
										}
									}
									else atn.addParType((tn!=null?((MiniFunParser.type_return)tn).ast:null));
							 	
							}
							break;

						default :
							break loop19;
						}
					}

					}
					break;

			}

			match(input,RPAR,FOLLOW_RPAR_in_arrowType1169); 
			match(input,ARROW,FOLLOW_ARROW_in_arrowType1171); 
			pushFollow(FOLLOW_baseType_in_arrowType1175);
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "arrowType"



	// $ANTLR start "concreteGenericType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:369:1: concreteGenericType returns [ArrayList<Node> ast] : bt= baseType ( COMMA bt1= baseType )* ;
	public final ArrayList<Node> concreteGenericType() throws RecognitionException {
		ArrayList<Node> ast = null;


		Node bt =null;
		Node bt1 =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:370:2: (bt= baseType ( COMMA bt1= baseType )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:371:2: bt= baseType ( COMMA bt1= baseType )*
			{
			pushFollow(FOLLOW_baseType_in_concreteGenericType1199);
			bt=baseType();
			state._fsp--;

			 ArrayList<Node> generic = new ArrayList<Node>(); generic.add(bt); 
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:372:2: ( COMMA bt1= baseType )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:372:3: COMMA bt1= baseType
					{
					match(input,COMMA,FOLLOW_COMMA_in_concreteGenericType1205); 
					pushFollow(FOLLOW_baseType_in_concreteGenericType1209);
					bt1=baseType();
					state._fsp--;

					 generic.add(bt1); 
					}
					break;

				default :
					break loop21;
				}
			}

			 ast = generic; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "concreteGenericType"



	// $ANTLR start "genericType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:375:1: genericType returns [ArrayList<GenericTypeNode> ast] :i= ID ( COMMA f= ID )* ;
	public final ArrayList<GenericTypeNode> genericType() throws RecognitionException {
		ArrayList<GenericTypeNode> ast = null;


		Token i=null;
		Token f=null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:376:2: (i= ID ( COMMA f= ID )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:376:3: i= ID ( COMMA f= ID )*
			{
			 ArrayList<GenericTypeNode> generics = new ArrayList<GenericTypeNode>(); 
			i=(Token)match(input,ID,FOLLOW_ID_in_genericType1236); 
			 generics.add(new GenericTypeNode( (i!=null?i.getText():null) )); 
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:378:2: ( COMMA f= ID )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:378:4: COMMA f= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_genericType1243); 
					f=(Token)match(input,ID,FOLLOW_ID_in_genericType1247); 
					 generics.add(new GenericTypeNode( (f!=null?f.getText():null) )); 
					}
					break;

				default :
					break loop22;
				}
			}

			 ast = generics; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "genericType"



	// $ANTLR start "linkedGenericType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:381:1: linkedGenericType returns [ArrayList <Node> ast] :i= ID ( COMMA f= ID )* ;
	public final ArrayList <Node> linkedGenericType() throws RecognitionException {
		ArrayList <Node> ast = null;


		Token i=null;
		Token f=null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:382:2: (i= ID ( COMMA f= ID )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:383:2: i= ID ( COMMA f= ID )*
			{
			 
					ArrayList<Node> generics = new ArrayList<Node>(); 
					HashMap<String,STentry> hm = symTable.get(nestingLevel);
				
			i=(Token)match(input,ID,FOLLOW_ID_in_linkedGenericType1276); 
			 
				
					if ( hm.get((i!=null?i.getText():null)) != null){ 
						if ( hm.get((i!=null?i.getText():null)).getNode().getNodeType() == NodeType.GENERICTYPE_NODE){
							generics.add( hm.get((i!=null?i.getText():null)).getNode());
						}
						else {
							System.out.println("Invalid Object used as a generic, " + (i!=null?i.getText():null) );
						}
					}
					else {
						System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" is not defined");
						System.exit(0);
					}
				
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:403:2: ( COMMA f= ID )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:403:4: COMMA f= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_linkedGenericType1285); 
					f=(Token)match(input,ID,FOLLOW_ID_in_linkedGenericType1289); 

							if ( hm.get((f!=null?f.getText():null)) != null){ 
								if ( hm.get((f!=null?f.getText():null)).getNode().getNodeType() == NodeType.GENERICTYPE_NODE){
									generics.add( hm.get((f!=null?f.getText():null)).getNode());
								}
								else {
									System.out.println("Invalid Object used as a generic, " + (f!=null?f.getText():null) );
								}
							}
							else {
								System.out.println("Identifier "+(f!=null?f.getText():null)+" at line "+(f!=null?f.getLine():0)+" is not defined");
								System.exit(0);
							}
						
					}
					break;

				default :
					break loop23;
				}
			}

			 ast = generics; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "linkedGenericType"



	// $ANTLR start "listType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:420:1: listType returns [Node ast] : LIST SLPAR (bt= baseType |i= ID ) SRPAR ;
	public final Node listType() throws RecognitionException {
		Node ast = null;


		Token i=null;
		Node bt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:421:2: ( LIST SLPAR (bt= baseType |i= ID ) SRPAR )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:421:4: LIST SLPAR (bt= baseType |i= ID ) SRPAR
			{
			match(input,LIST,FOLLOW_LIST_in_listType1314); 
			match(input,SLPAR,FOLLOW_SLPAR_in_listType1316); 
			 Node generic = null; 
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:422:2: (bt= baseType |i= ID )
			int alt24=2;
			int LA24_0 = input.LA(1);
			if ( (LA24_0==BOOLTYPE||LA24_0==INTTYPE) ) {
				alt24=1;
			}
			else if ( (LA24_0==ID) ) {
				alt24=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}

			switch (alt24) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:422:4: bt= baseType
					{
					pushFollow(FOLLOW_baseType_in_listType1326);
					bt=baseType();
					state._fsp--;

						generic = new ConcreteListParamTypeNode(bt); 
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:423:4: i= ID
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_listType1335); 

							HashMap<String,STentry> hm= symTable.get(nestingLevel);
							if (hm.get((i!=null?i.getText():null)) != null)
								generic = new GenericListParamTypeNode(hm.get((i!=null?i.getText():null)).getNode());
							else{
								System.out.println("Identifier "+ (i!=null?i.getText():null) +" Not recognized "+ (i!=null?i.getLine():0) +", generic type ID match");
								System.exit(0);
							}
						
					}
					break;

			}

			match(input,SRPAR,FOLLOW_SRPAR_in_listType1343); 
			 ast = generic; 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "listType"

	// Delegated rules



	public static final BitSet FOLLOW_LET_in_prog43 = new BitSet(new long[]{0x0000400001100000L});
	public static final BitSet FOLLOW_declist_in_prog65 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_IN_in_prog68 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_prog72 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_prog74 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VAR_in_declist99 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist103 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist105 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_declist109 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASS_in_declist111 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_declist115 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_declist117 = new BitSet(new long[]{0x0000400000100002L});
	public static final BitSet FOLLOW_FUN_in_declist130 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist134 = new BitSet(new long[]{0x0000000004000200L});
	public static final BitSet FOLLOW_LANPAR_in_declist148 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_genericType_in_declist152 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_declist166 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist170 = new BitSet(new long[]{0x0000000042000080L});
	public static final BitSet FOLLOW_baseType_in_declist175 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist188 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist200 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist209 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_declist213 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist226 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist230 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist240 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_declist244 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_arrowType_in_declist265 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist278 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist289 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist297 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist301 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_declist315 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_declist317 = new BitSet(new long[]{0x0000625340DC8000L});
	public static final BitSet FOLLOW_declist_in_declist324 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_declist344 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_declist364 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_declist366 = new BitSet(new long[]{0x0000400000100002L});
	public static final BitSet FOLLOW_term_in_exp393 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_EQ_in_exp413 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp417 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_LESSEQ_in_exp457 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp461 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_GREATEREQ_in_exp492 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp496 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_value_in_term541 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_PLUS_in_term562 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term566 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_MINUS_in_term605 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term609 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_OR_in_term648 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term652 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_fatt_in_value697 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_TIMES_in_value706 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value710 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_DIVIDE_in_value721 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value725 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_AND_in_value736 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value740 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_NAT_in_fatt767 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_fatt776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_fatt785 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTY_in_fatt793 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt803 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt807 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt809 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fatt820 = new BitSet(new long[]{0x0000000044000002L});
	public static final BitSet FOLLOW_LANPAR_in_fatt829 = new BitSet(new long[]{0x0000000002400080L});
	public static final BitSet FOLLOW_concreteGenericType_in_fatt834 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_linkedGenericType_in_fatt846 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_fatt853 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt862 = new BitSet(new long[]{0x000022D340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt871 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_fatt878 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt882 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_fatt892 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_fatt906 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt910 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_fatt912 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt914 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt918 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt920 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_fatt922 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt924 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt928 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt930 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLPAR_in_fatt938 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt942 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOUBLECOL_in_fatt944 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt948 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_fatt950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fatt957 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt959 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt963 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt965 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REST_in_fatt972 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt974 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt978 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt980 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_fatt987 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt989 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt993 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt995 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_fatt1002 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1004 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1008 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1010 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseType_in_type1034 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrowType_in_type1045 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listType_in_type1054 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1063 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTTYPE_in_baseType1083 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLTYPE_in_baseType1095 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_arrowType1120 = new BitSet(new long[]{0x0000008062400080L});
	public static final BitSet FOLLOW_type_in_arrowType1133 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_arrowType1145 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_arrowType1150 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_arrowType1169 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARROW_in_arrowType1171 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_arrowType1175 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseType_in_concreteGenericType1199 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_concreteGenericType1205 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_concreteGenericType1209 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ID_in_genericType1236 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_genericType1243 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_genericType1247 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ID_in_linkedGenericType1276 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_linkedGenericType1285 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_linkedGenericType1289 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LIST_in_listType1314 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SLPAR_in_listType1316 = new BitSet(new long[]{0x0000000002400080L});
	public static final BitSet FOLLOW_baseType_in_listType1326 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_ID_in_listType1335 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_listType1343 = new BitSet(new long[]{0x0000000000000002L});
}
