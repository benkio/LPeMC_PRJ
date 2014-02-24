// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-02-24 17:20:19

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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR pt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
	public final ArrayList<Node> declist() throws RecognitionException {
		ArrayList<Node> astList = null;


		Token i=null;
		Token fpi=null;
		Token pi=null;
		Node t =null;
		Node e =null;
		Node pt =null;
		Node rt =null;
		Node fpt =null;
		ArrayList<Node> dec =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:38:3: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR pt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:38:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR pt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
			{

						astList = new ArrayList<Node>();
				   		int offSet=1;
				   	
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:43:5: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID ( LANPAR pt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:43:6: VAR i= ID COL t= baseType ASS e= exp SEMIC
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:57:6: FUN i= ID ( LANPAR pt= genericType RANPAR )? COL (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
					{
					match(input,FUN,FOLLOW_FUN_in_declist142); 
					i=(Token)match(input,ID,FOLLOW_ID_in_declist146); 

						   		DecFunNode fn = null;
						   		GenericTypeNode genericType = null;
						   	
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:61:6: ( LANPAR pt= genericType RANPAR )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==LANPAR) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:61:8: LANPAR pt= genericType RANPAR
							{
							match(input,LANPAR,FOLLOW_LANPAR_in_declist158); 
							pushFollow(FOLLOW_genericType_in_declist176);
							pt=genericType();
							state._fsp--;

							 genericType = (GenericTypeNode) pt; 
							match(input,RANPAR,FOLLOW_RANPAR_in_declist194); 
							}
							break;

					}

					match(input,COL,FOLLOW_COL_in_declist203); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:66:10: (rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )? )
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
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:66:11: rt= baseType LPAR (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
							{
							pushFollow(FOLLOW_baseType_in_declist208);
							rt=baseType();
							state._fsp--;


								   		fn = new DecFunNode((i!=null?i.getText():null),rt,genericType);
								    	STentry entry = new STentry(fn,offSet++);
								    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
								    	
								    	if (hm.put((i!=null?i.getText():null),entry) != null){
								    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
								      		System.exit(0);
								      	}
								  	
							match(input,LPAR,FOLLOW_LPAR_in_declist223); 

									   		
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
									        
									 	
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:98:8: (fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )* )?
							int alt3=2;
							int LA3_0 = input.LA(1);
							if ( (LA3_0==ID) ) {
								alt3=1;
							}
							switch (alt3) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:99:8: fpi= ID ( COL fpt= type ) ( COMMA pi= ID ( COL pt= type ) )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist253); 
									ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:100:9: ( COL fpt= type )
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:101:10: COL fpt= type
									{
									match(input,COL,FOLLOW_COL_in_declist276); 
									pushFollow(FOLLOW_type_in_declist280);
									fpt=type();
									state._fsp--;

									pn.addType(fpt); if(fpt.getNodeType() == NodeType.ARROWTYPE_NODE){parOffSet-=1;}
									}


												       	entry = new STentry(pn,parOffSet--);
												        hm.put((fpi!=null?fpi.getText():null),entry);
												        fn.addParam(pn);
									   			    
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:108:8: ( COMMA pi= ID ( COL pt= type ) )*
									loop2:
									while (true) {
										int alt2=2;
										int LA2_0 = input.LA(1);
										if ( (LA2_0==COMMA) ) {
											alt2=1;
										}

										switch (alt2) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:108:9: COMMA pi= ID ( COL pt= type )
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist311); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist315); 
											pn = new ParamNode((pi!=null?pi.getText():null));
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:109:8: ( COL pt= type )
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:110:10: COL pt= type
											{
											match(input,COL,FOLLOW_COL_in_declist338); 
											pushFollow(FOLLOW_type_in_declist342);
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
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:120:5: rt= arrowType LPAR (fpi= ID ( COMMA pi= ID )* )?
							{
							pushFollow(FOLLOW_arrowType_in_declist372);
							rt=arrowType();
							state._fsp--;


								   	fn = new DecFunNode((i!=null?i.getText():null),rt, genericType);
								   		
								    	STentry entry = new STentry(fn,offSet++);
								    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
								    	
								    	if (hm.put((i!=null?i.getText():null),entry) != null){
								    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
								      		System.exit(0);
								      	}
								  	
							match(input,LPAR,FOLLOW_LPAR_in_declist387); 

									   		
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
									 	
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:153:7: (fpi= ID ( COMMA pi= ID )* )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ID) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:154:8: fpi= ID ( COMMA pi= ID )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist416); 
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
												  	
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:171:8: ( COMMA pi= ID )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==COMMA) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:171:9: COMMA pi= ID
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist438); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist442); 
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
									}

									}
									break;

							}

							}
							break;

					}

					match(input,RPAR,FOLLOW_RPAR_in_declist480); 
					match(input,CLPAR,FOLLOW_CLPAR_in_declist489); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:194:6: ( (dec= declist ) e= exp )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:195:7: (dec= declist ) e= exp
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:195:7: (dec= declist )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:195:8: dec= declist
					{
					pushFollow(FOLLOW_declist_in_declist508);
					dec=declist();
					state._fsp--;

					}


						    		fn.addLocalDeclarationList(dec);
						    	
					pushFollow(FOLLOW_exp_in_declist530);
					e=exp();
					state._fsp--;


						        	fn.addExpValue(e);
						       		symTable.remove(nestingLevel--);
						       		astList.add(fn);
						       	
					}

					match(input,CRPAR,FOLLOW_CRPAR_in_declist556); 
					match(input,SEMIC,FOLLOW_SEMIC_in_declist563); 
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:209:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
	public final Node exp() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:210:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:210:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
			{
			pushFollow(FOLLOW_term_in_exp590);
			f=term();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:211:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:211:8: ( EQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:211:8: ( EQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:8: EQ l= term
					{
					match(input,EQ,FOLLOW_EQ_in_exp610); 
					pushFollow(FOLLOW_term_in_exp614);
					l=term();
					state._fsp--;

					ast = new EqualNode(ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:215:9: ( LESSEQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:215:9: ( LESSEQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:216:9: LESSEQ l= term
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_exp654); 
					pushFollow(FOLLOW_term_in_exp658);
					l=term();
					state._fsp--;

					ast = new LessEqualNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:219:9: ( GREATEREQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:219:9: ( GREATEREQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:219:11: GREATEREQ l= term
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp689); 
					pushFollow(FOLLOW_term_in_exp693);
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:224:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
	public final Node term() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:225:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:225:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
			{
			pushFollow(FOLLOW_value_in_term738);
			f=value();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:226:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:227:5: ( PLUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:227:5: ( PLUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:228:5: PLUS l= value
					{
					match(input,PLUS,FOLLOW_PLUS_in_term759); 
					pushFollow(FOLLOW_value_in_term763);
					l=value();
					state._fsp--;

					ast = new PlusNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:231:9: ( MINUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:231:9: ( MINUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:232:9: MINUS l= value
					{
					match(input,MINUS,FOLLOW_MINUS_in_term802); 
					pushFollow(FOLLOW_value_in_term806);
					l=value();
					state._fsp--;

					ast = new MinusNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:235:9: ( OR l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:235:9: ( OR l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:236:9: OR l= value
					{
					match(input,OR,FOLLOW_OR_in_term845); 
					pushFollow(FOLLOW_value_in_term849);
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:242:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
	public final Node value() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:243:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:243:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
			{
			pushFollow(FOLLOW_fatt_in_value895);
			f=fatt();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:244:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:245:7: ( TIMES l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:245:7: ( TIMES l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:246:8: TIMES l= fatt
					{
					match(input,TIMES,FOLLOW_TIMES_in_value921); 
					pushFollow(FOLLOW_fatt_in_value925);
					l=fatt();
					state._fsp--;

					ast = new TimesNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:249:9: ( DIVIDE l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:249:9: ( DIVIDE l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:250:9: DIVIDE l= fatt
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_value965); 
					pushFollow(FOLLOW_fatt_in_value969);
					l=fatt();
					state._fsp--;

					ast = new DivNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:253:9: ( AND l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:253:9: ( AND l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:254:9: AND l= fatt
					{
					match(input,AND,FOLLOW_AND_in_value1008); 
					pushFollow(FOLLOW_fatt_in_value1012);
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:259:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
	public final Node fatt() throws RecognitionException {
		Node ast = null;


		Token n=null;
		Token i=null;
		Node e =null;
		Node cgt =null;
		Node fp =null;
		Node p =null;
		Node x =null;
		Node y =null;
		Node z =null;
		Node e1 =null;
		Node e2 =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:4: n= NAT
					{
					n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt1059); 
					ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:262:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_fatt1075); 
					ast = new BoolNode(true);
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:264:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_fatt1090); 
					ast = new BoolNode(false);
					}
					break;
				case 4 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:266:4: EMPTY
					{
					match(input,EMPTY,FOLLOW_EMPTY_in_fatt1102); 
					ast = new EmptyNode();
					}
					break;
				case 5 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:268:4: LPAR e= exp RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_fatt1116); 
					pushFollow(FOLLOW_exp_in_fatt1120);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1122); 
					ast = e;
					}
					break;
				case 6 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:270:4: i= ID ( LANPAR cgt= concreteGenericType RANPAR )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_fatt1137); 

						  	HashMap<String,STentry> hm;
						   	STentry entry=null;
						   	Node genericType = null;
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
						
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:295:4: ( LANPAR cgt= concreteGenericType RANPAR )?
					int alt11=2;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==LANPAR) ) {
						alt11=1;
					}
					switch (alt11) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:295:5: LANPAR cgt= concreteGenericType RANPAR
							{
							match(input,LANPAR,FOLLOW_LANPAR_in_fatt1147); 
							pushFollow(FOLLOW_concreteGenericType_in_fatt1153);
							cgt=concreteGenericType();
							state._fsp--;

							 genericType = cgt; 
							match(input,RANPAR,FOLLOW_RANPAR_in_fatt1158); 
							}
							break;

					}

					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:296:3: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					int alt14=2;
					int LA14_0 = input.LA(1);
					if ( (LA14_0==LPAR) ) {
						alt14=1;
					}
					switch (alt14) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:297:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
							{
							match(input,LPAR,FOLLOW_LPAR_in_fatt1169); 
							ArrayList<Node> parList = new ArrayList<Node>();
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:300:3: (fp= exp ( COMMA p= exp )* )?
							int alt13=2;
							int LA13_0 = input.LA(1);
							if ( (LA13_0==EMPTY||(LA13_0 >= FALSE && LA13_0 <= FIRST)||(LA13_0 >= ID && LA13_0 <= IF)||LA13_0==LPAR||(LA13_0 >= NAT && LA13_0 <= NOT)||LA13_0==PRINT||LA13_0==REST||LA13_0==SLPAR||LA13_0==TRUE) ) {
								alt13=1;
							}
							switch (alt13) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:301:4: fp= exp ( COMMA p= exp )*
									{
									pushFollow(FOLLOW_exp_in_fatt1188);
									fp=exp();
									state._fsp--;

									parList.add(fp);
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:302:4: ( COMMA p= exp )*
									loop12:
									while (true) {
										int alt12=2;
										int LA12_0 = input.LA(1);
										if ( (LA12_0==COMMA) ) {
											alt12=1;
										}

										switch (alt12) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:302:5: COMMA p= exp
											{
											match(input,COMMA,FOLLOW_COMMA_in_fatt1196); 
											pushFollow(FOLLOW_exp_in_fatt1200);
											p=exp();
											state._fsp--;

											parList.add(p);
											}
											break;

										default :
											break loop12;
										}
									}

									}
									break;

							}

							match(input,RPAR,FOLLOW_RPAR_in_fatt1214); 

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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:314:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
					{
					match(input,IF,FOLLOW_IF_in_fatt1225); 
					pushFollow(FOLLOW_exp_in_fatt1229);
					x=exp();
					state._fsp--;

					match(input,THEN,FOLLOW_THEN_in_fatt1231); 
					match(input,CLPAR,FOLLOW_CLPAR_in_fatt1233); 
					pushFollow(FOLLOW_exp_in_fatt1237);
					y=exp();
					state._fsp--;

					match(input,CRPAR,FOLLOW_CRPAR_in_fatt1239); 
					match(input,ELSE,FOLLOW_ELSE_in_fatt1244); 
					match(input,CLPAR,FOLLOW_CLPAR_in_fatt1246); 
					pushFollow(FOLLOW_exp_in_fatt1250);
					z=exp();
					state._fsp--;

					match(input,CRPAR,FOLLOW_CRPAR_in_fatt1252); 
					ast = new IfNode(x,y,z);
					}
					break;
				case 8 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:318:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
					{
					match(input,SLPAR,FOLLOW_SLPAR_in_fatt1266); 
					pushFollow(FOLLOW_exp_in_fatt1270);
					e1=exp();
					state._fsp--;

					match(input,DOUBLECOL,FOLLOW_DOUBLECOL_in_fatt1272); 
					pushFollow(FOLLOW_exp_in_fatt1276);
					e2=exp();
					state._fsp--;

					match(input,SRPAR,FOLLOW_SRPAR_in_fatt1278); 
					ast = new ListNode(e1,e2);
					}
					break;
				case 9 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:321:4: FIRST LPAR e= exp RPAR
					{
					match(input,FIRST,FOLLOW_FIRST_in_fatt1291); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt1293); 
					pushFollow(FOLLOW_exp_in_fatt1297);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1299); 
					ast = new FirstNode(e);
					}
					break;
				case 10 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:324:4: REST LPAR e= exp RPAR
					{
					match(input,REST,FOLLOW_REST_in_fatt1316); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt1318); 
					pushFollow(FOLLOW_exp_in_fatt1322);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1324); 
					ast = new RestNode(e);
					}
					break;
				case 11 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:327:4: PRINT LPAR e= exp RPAR
					{
					match(input,PRINT,FOLLOW_PRINT_in_fatt1341); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt1343); 
					pushFollow(FOLLOW_exp_in_fatt1347);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1349); 
					ast = new PrintNode(e);
					}
					break;
				case 12 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:330:4: NOT LPAR e= exp RPAR
					{
					match(input,NOT,FOLLOW_NOT_in_fatt1366); 
					match(input,LPAR,FOLLOW_LPAR_in_fatt1368); 
					pushFollow(FOLLOW_exp_in_fatt1372);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1374); 
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



	// $ANTLR start "type"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:341:1: type returns [Node ast] : (bt= baseType |at= arrowType |lt= listType |i= ID );
	public final Node type() throws RecognitionException {
		Node ast = null;


		Token i=null;
		Node bt =null;
		Node at =null;
		Node lt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:342:2: (bt= baseType |at= arrowType |lt= listType |i= ID )
			int alt16=4;
			switch ( input.LA(1) ) {
			case BOOLTYPE:
			case INTTYPE:
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:342:4: bt= baseType
					{
					pushFollow(FOLLOW_baseType_in_type1405);
					bt=baseType();
					state._fsp--;

					ast = bt;
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:343:6: at= arrowType
					{
					pushFollow(FOLLOW_arrowType_in_type1416);
					at=arrowType();
					state._fsp--;

					ast = at;
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:344:4: lt= listType
					{
					pushFollow(FOLLOW_listType_in_type1425);
					lt=listType();
					state._fsp--;

					ast = lt; 
					}
					break;
				case 4 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:345:4: i= ID
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_type1434); 
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "type"



	// $ANTLR start "baseType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:348:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
	public final Node baseType() throws RecognitionException {
		Node ast = null;


		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:349:2: ( INTTYPE | BOOLTYPE )
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:349:4: INTTYPE
					{
					match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1454); 
					ast = new IntTypeNode();
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:350:6: BOOLTYPE
					{
					match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1466); 
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:354:1: arrowType returns [Node ast] : LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType ;
	public final Node arrowType() throws RecognitionException {
		Node ast = null;


		Node t1 =null;
		Node tn =null;
		Node rt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:355:3: ( LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:355:6: LPAR ( (t1= type ) ( COMMA (tn= type ) )* )? RPAR ARROW rt= baseType
			{
			match(input,LPAR,FOLLOW_LPAR_in_arrowType1492); 
			ArrowTypeNode atn= new ArrowTypeNode();
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:356:5: ( (t1= type ) ( COMMA (tn= type ) )* )?
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0==BOOLTYPE||LA19_0==ID||LA19_0==INTTYPE||(LA19_0 >= LIST && LA19_0 <= LPAR)) ) {
				alt19=1;
			}
			switch (alt19) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:357:6: (t1= type ) ( COMMA (tn= type ) )*
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:357:6: (t1= type )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:357:7: t1= type
					{
					pushFollow(FOLLOW_type_in_arrowType1510);
					t1=type();
					state._fsp--;

					}

					atn.addParType(t1);
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:358:6: ( COMMA (tn= type ) )*
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( (LA18_0==COMMA) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:359:7: COMMA (tn= type )
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrowType1529); 
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:359:13: (tn= type )
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:359:14: tn= type
							{
							pushFollow(FOLLOW_type_in_arrowType1534);
							tn=type();
							state._fsp--;

							}

							atn.addParType(tn);
							}
							break;

						default :
							break loop18;
						}
					}

					}
					break;

			}

			match(input,RPAR,FOLLOW_RPAR_in_arrowType1559); 
			match(input,ARROW,FOLLOW_ARROW_in_arrowType1561); 
			pushFollow(FOLLOW_baseType_in_arrowType1565);
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:368:1: concreteGenericType returns [Node ast] : bt= baseType ( COMMA bt1= baseType )* ;
	public final Node concreteGenericType() throws RecognitionException {
		Node ast = null;


		Node bt =null;
		Node bt1 =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:369:2: (bt= baseType ( COMMA bt1= baseType )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:369:4: bt= baseType ( COMMA bt1= baseType )*
			{
			pushFollow(FOLLOW_baseType_in_concreteGenericType1588);
			bt=baseType();
			state._fsp--;

			ConcreteGenericTypeNode generic = new ConcreteGenericTypeNode(bt);
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:370:3: ( COMMA bt1= baseType )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:370:4: COMMA bt1= baseType
					{
					match(input,COMMA,FOLLOW_COMMA_in_concreteGenericType1595); 
					pushFollow(FOLLOW_baseType_in_concreteGenericType1599);
					bt1=baseType();
					state._fsp--;

					 generic.addType(bt1); 
					}
					break;

				default :
					break loop20;
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:373:1: genericType returns [Node ast] : i= ID ( COMMA f= ID )* ;
	public final Node genericType() throws RecognitionException {
		Node ast = null;


		Token i=null;
		Token f=null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:374:2: (i= ID ( COMMA f= ID )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:374:4: i= ID ( COMMA f= ID )*
			{
			i=(Token)match(input,ID,FOLLOW_ID_in_genericType1622); 
			 GenericTypeNode generic = new GenericTypeNode( (i!=null?i.getText():null) );  
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:375:3: ( COMMA f= ID )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:375:5: COMMA f= ID
					{
					match(input,COMMA,FOLLOW_COMMA_in_genericType1630); 
					f=(Token)match(input,ID,FOLLOW_ID_in_genericType1634); 
					 generic.addType( (f!=null?f.getText():null) ); 
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
	// $ANTLR end "genericType"



	// $ANTLR start "listType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:378:1: listType returns [Node ast] : LIST SLPAR (bt= concreteGenericType |i= genericType ) SRPAR ;
	public final Node listType() throws RecognitionException {
		Node ast = null;


		Node bt =null;
		Node i =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:379:2: ( LIST SLPAR (bt= concreteGenericType |i= genericType ) SRPAR )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:379:4: LIST SLPAR (bt= concreteGenericType |i= genericType ) SRPAR
			{
			match(input,LIST,FOLLOW_LIST_in_listType1659); 
			match(input,SLPAR,FOLLOW_SLPAR_in_listType1661); 
			 Node generic = null; 
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:379:40: (bt= concreteGenericType |i= genericType )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0==BOOLTYPE||LA22_0==INTTYPE) ) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:380:3: bt= concreteGenericType
					{
					pushFollow(FOLLOW_concreteGenericType_in_listType1671);
					bt=concreteGenericType();
					state._fsp--;

					 generic = new ConcreteListParamTypeNode(bt); 
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:381:5: i= genericType
					{
					pushFollow(FOLLOW_genericType_in_listType1681);
					i=genericType();
					state._fsp--;

					generic = new GenericListParamTypeNode(i); 
					}
					break;

			}

			match(input,SRPAR,FOLLOW_SRPAR_in_listType1689); 
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
	public static final BitSet FOLLOW_VAR_in_declist104 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist108 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist110 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_declist114 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_ASS_in_declist116 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_declist120 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_declist122 = new BitSet(new long[]{0x0000400000100002L});
	public static final BitSet FOLLOW_FUN_in_declist142 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist146 = new BitSet(new long[]{0x0000000004000200L});
	public static final BitSet FOLLOW_LANPAR_in_declist158 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_genericType_in_declist176 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_declist194 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist203 = new BitSet(new long[]{0x0000000042000080L});
	public static final BitSet FOLLOW_baseType_in_declist208 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist223 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist253 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist276 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_declist280 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist311 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist315 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist338 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_declist342 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_arrowType_in_declist372 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist387 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist416 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist438 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist442 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_declist480 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_declist489 = new BitSet(new long[]{0x0000625340DC8000L});
	public static final BitSet FOLLOW_declist_in_declist508 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_declist530 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_declist556 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_declist563 = new BitSet(new long[]{0x0000400000100002L});
	public static final BitSet FOLLOW_term_in_exp590 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_EQ_in_exp610 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp614 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_LESSEQ_in_exp654 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp658 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_GREATEREQ_in_exp689 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp693 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_value_in_term738 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_PLUS_in_term759 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term763 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_MINUS_in_term802 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term806 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_OR_in_term845 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term849 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_fatt_in_value895 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_TIMES_in_value921 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value925 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_DIVIDE_in_value965 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value969 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_AND_in_value1008 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value1012 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_NAT_in_fatt1059 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_fatt1075 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_fatt1090 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTY_in_fatt1102 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt1116 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1120 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1122 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fatt1137 = new BitSet(new long[]{0x0000000044000002L});
	public static final BitSet FOLLOW_LANPAR_in_fatt1147 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_concreteGenericType_in_fatt1153 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_fatt1158 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt1169 = new BitSet(new long[]{0x000022D340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1188 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_fatt1196 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1200 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_fatt1214 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_fatt1225 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1229 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_fatt1231 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt1233 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1237 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt1239 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_fatt1244 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt1246 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1250 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt1252 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLPAR_in_fatt1266 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1270 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOUBLECOL_in_fatt1272 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1276 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_fatt1278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fatt1291 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1293 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1297 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1299 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REST_in_fatt1316 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1318 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1322 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1324 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_fatt1341 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1343 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1347 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1349 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_fatt1366 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1368 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1372 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1374 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseType_in_type1405 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrowType_in_type1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listType_in_type1425 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_type1434 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTTYPE_in_baseType1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLTYPE_in_baseType1466 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_arrowType1492 = new BitSet(new long[]{0x0000008062400080L});
	public static final BitSet FOLLOW_type_in_arrowType1510 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_arrowType1529 = new BitSet(new long[]{0x0000000062400080L});
	public static final BitSet FOLLOW_type_in_arrowType1534 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_arrowType1559 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARROW_in_arrowType1561 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_arrowType1565 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseType_in_concreteGenericType1588 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_concreteGenericType1595 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_concreteGenericType1599 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_ID_in_genericType1622 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_COMMA_in_genericType1630 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_genericType1634 = new BitSet(new long[]{0x0000000000000402L});
	public static final BitSet FOLLOW_LIST_in_listType1659 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SLPAR_in_listType1661 = new BitSet(new long[]{0x0000000002400080L});
	public static final BitSet FOLLOW_concreteGenericType_in_listType1671 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_genericType_in_listType1681 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_listType1689 = new BitSet(new long[]{0x0000000000000002L});
}
