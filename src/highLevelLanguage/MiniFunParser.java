// $ANTLR 3.5.1 /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g 2014-02-21 16:48:28

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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:37:1: declist returns [ArrayList<Node> astList] : ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID (pt= genericParamType )? COL (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* ;
	public final ArrayList<Node> declist() throws RecognitionException {
		ArrayList<Node> astList = null;


		Token i=null;
		Token fpi=null;
		Token pi=null;
		Node t =null;
		Node e =null;
		Node pt =null;
		Node rt =null;
		Node gpt =null;
		Node fpt =null;
		ArrayList<Node> dec =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:38:3: ( ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID (pt= genericParamType )? COL (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:38:4: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID (pt= genericParamType )? COL (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
			{

						astList = new ArrayList<Node>();
				   		int offSet=1;
				   	
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:43:5: ( VAR i= ID COL t= baseType ASS e= exp SEMIC | FUN i= ID (pt= genericParamType )? COL (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC )*
			loop11:
			while (true) {
				int alt11=3;
				int LA11_0 = input.LA(1);
				if ( (LA11_0==VAR) ) {
					alt11=1;
				}
				else if ( (LA11_0==FUN) ) {
					alt11=2;
				}

				switch (alt11) {
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:57:6: FUN i= ID (pt= genericParamType )? COL (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? ) RPAR CLPAR ( (dec= declist ) e= exp ) CRPAR SEMIC
					{
					match(input,FUN,FOLLOW_FUN_in_declist142); 
					i=(Token)match(input,ID,FOLLOW_ID_in_declist146); 
					DecFunNode fn = null;
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:58:6: (pt= genericParamType )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==LANPAR) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:59:7: pt= genericParamType
							{
							pushFollow(FOLLOW_genericParamType_in_declist166);
							pt=genericParamType();
							state._fsp--;


								   	 	STentry entry = new STentry(pt,-1);
								   	 	HashMap<String,STentry> hm= symTable.get(nestingLevel);
							}
							break;

					}

					match(input,COL,FOLLOW_COL_in_declist192); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:64:10: (rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )? |rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )? )
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==BOOLTYPE||LA10_0==INTTYPE) ) {
						alt10=1;
					}
					else if ( (LA10_0==LPAR) ) {
						alt10=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 10, 0, input);
						throw nvae;
					}

					switch (alt10) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:64:11: rt= baseType LPAR (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )?
							{
							pushFollow(FOLLOW_baseType_in_declist197);
							rt=baseType();
							state._fsp--;


								   		fn = new DecFunNode((i!=null?i.getText():null),rt,pt);
								    	STentry entry = new STentry(fn,offSet++);
								    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
								    	
								    	if (hm.put((i!=null?i.getText():null),entry) != null){
								    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
								      		System.exit(0);
								      	}
								  	
							match(input,LPAR,FOLLOW_LPAR_in_declist212); 

									   		
									        int parOffSet=-1;
									        hm = new HashMap<String,STentry>();
									        symTable.add(hm);
									        nestingLevel++;
									        int parCont=0;
									 	
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:84:7: (fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )* )?
							int alt5=2;
							int LA5_0 = input.LA(1);
							if ( (LA5_0==ID) ) {
								alt5=1;
							}
							switch (alt5) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:85:8: fpi= ID (gpt= genericType | COL fpt= type ) ( COMMA pi= ID (gpt= genericType | COL pt= type ) )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist241); 
									ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:86:9: (gpt= genericType | COL fpt= type )
									int alt2=2;
									int LA2_0 = input.LA(1);
									if ( (LA2_0==LANPAR) ) {
										alt2=1;
									}
									else if ( (LA2_0==COL) ) {
										alt2=2;
									}

									else {
										NoViableAltException nvae =
											new NoViableAltException("", 2, 0, input);
										throw nvae;
									}

									switch (alt2) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:87:10: gpt= genericType
											{
											pushFollow(FOLLOW_genericType_in_declist266);
											gpt=genericType();
											state._fsp--;

											pn.addGenericType(gpt);
											}
											break;
										case 2 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:88:12: COL fpt= type
											{
											match(input,COL,FOLLOW_COL_in_declist282); 
											pushFollow(FOLLOW_type_in_declist286);
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
												  	
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:106:8: ( COMMA pi= ID (gpt= genericType | COL pt= type ) )*
									loop4:
									while (true) {
										int alt4=2;
										int LA4_0 = input.LA(1);
										if ( (LA4_0==COMMA) ) {
											alt4=1;
										}

										switch (alt4) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:106:9: COMMA pi= ID (gpt= genericType | COL pt= type )
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist317); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist321); 
											pn = new ParamNode((pi!=null?pi.getText():null));
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:106:53: (gpt= genericType | COL pt= type )
											int alt3=2;
											int LA3_0 = input.LA(1);
											if ( (LA3_0==LANPAR) ) {
												alt3=1;
											}
											else if ( (LA3_0==COL) ) {
												alt3=2;
											}

											else {
												NoViableAltException nvae =
													new NoViableAltException("", 3, 0, input);
												throw nvae;
											}

											switch (alt3) {
												case 1 :
													// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:106:54: gpt= genericType
													{
													pushFollow(FOLLOW_genericType_in_declist328);
													gpt=genericType();
													state._fsp--;

													pn.addGenericType(gpt);
													}
													break;
												case 2 :
													// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:106:103: COL pt= type
													{
													match(input,COL,FOLLOW_COL_in_declist334); 
													pushFollow(FOLLOW_type_in_declist338);
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
											break loop4;
										}
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:127:10: rt= arrowType LPAR (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )?
							{
							pushFollow(FOLLOW_arrowType_in_declist373);
							rt=arrowType();
							state._fsp--;


								   		fn = new DecFunNode((i!=null?i.getText():null),rt, pt);
								   		
								    	STentry entry = new STentry(fn,offSet++);
								    	HashMap<String,STentry> hm=symTable.get(nestingLevel);
								    	
								    	if (hm.put((i!=null?i.getText():null),entry) != null){
								    		System.out.println("Identifier "+(i!=null?i.getText():null)+" at line "+(i!=null?i.getLine():0)+" already defined");
								      		System.exit(0);
								      	}
								  	
							match(input,LPAR,FOLLOW_LPAR_in_declist388); 

									   		
									        int parOffSet=-1;
									        hm = new HashMap<String,STentry>();
									        symTable.add(hm);
									        nestingLevel++;
									        int parCont=0;
									 	
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:148:7: (fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )* )?
							int alt9=2;
							int LA9_0 = input.LA(1);
							if ( (LA9_0==ID) ) {
								alt9=1;
							}
							switch (alt9) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:149:8: fpi= ID (gpt= genericType )? ( COMMA pi= ID (gpt= genericType )? )*
									{
									fpi=(Token)match(input,ID,FOLLOW_ID_in_declist417); 
									ParamNode pn = new ParamNode((fpi!=null?fpi.getText():null));
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:149:58: (gpt= genericType )?
									int alt6=2;
									int LA6_0 = input.LA(1);
									if ( (LA6_0==LANPAR) ) {
										alt6=1;
									}
									switch (alt6) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:149:59: gpt= genericType
											{
											pushFollow(FOLLOW_genericType_in_declist424);
											gpt=genericType();
											state._fsp--;

											pn.addGenericType(gpt);
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
												  	
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:166:8: ( COMMA pi= ID (gpt= genericType )? )*
									loop8:
									while (true) {
										int alt8=2;
										int LA8_0 = input.LA(1);
										if ( (LA8_0==COMMA) ) {
											alt8=1;
										}

										switch (alt8) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:166:9: COMMA pi= ID (gpt= genericType )?
											{
											match(input,COMMA,FOLLOW_COMMA_in_declist447); 
											pi=(Token)match(input,ID,FOLLOW_ID_in_declist451); 
											pn = new ParamNode((pi!=null?pi.getText():null));
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:166:53: (gpt= genericType )?
											int alt7=2;
											int LA7_0 = input.LA(1);
											if ( (LA7_0==LANPAR) ) {
												alt7=1;
											}
											switch (alt7) {
												case 1 :
													// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:166:54: gpt= genericType
													{
													pushFollow(FOLLOW_genericType_in_declist458);
													gpt=genericType();
													state._fsp--;

													pn.addGenericType(gpt);
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
											break loop8;
										}
									}

									}
									break;

							}

							}
							break;

					}

					match(input,RPAR,FOLLOW_RPAR_in_declist499); 
					match(input,CLPAR,FOLLOW_CLPAR_in_declist508); 
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:190:6: ( (dec= declist ) e= exp )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:191:7: (dec= declist ) e= exp
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:191:7: (dec= declist )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:191:8: dec= declist
					{
					pushFollow(FOLLOW_declist_in_declist527);
					dec=declist();
					state._fsp--;

					}


						    		fn.addLocalDeclarationList(dec);
						    	
					pushFollow(FOLLOW_exp_in_declist549);
					e=exp();
					state._fsp--;


						        	fn.addExpValue(e);
						       		symTable.remove(nestingLevel--);
						       		astList.add(fn);
						       	
					}

					match(input,CRPAR,FOLLOW_CRPAR_in_declist575); 
					match(input,SEMIC,FOLLOW_SEMIC_in_declist582); 
					}
					break;

				default :
					break loop11;
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:205:1: exp returns [Node ast] : f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* ;
	public final Node exp() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:206:4: (f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:206:6: f= term ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
			{
			pushFollow(FOLLOW_term_in_exp609);
			f=term();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:207:7: ( ( EQ l= term ) | ( LESSEQ l= term ) | ( GREATEREQ l= term ) )*
			loop12:
			while (true) {
				int alt12=4;
				switch ( input.LA(1) ) {
				case EQ:
					{
					alt12=1;
					}
					break;
				case LESSEQ:
					{
					alt12=2;
					}
					break;
				case GREATEREQ:
					{
					alt12=3;
					}
					break;
				}
				switch (alt12) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:207:8: ( EQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:207:8: ( EQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:208:8: EQ l= term
					{
					match(input,EQ,FOLLOW_EQ_in_exp629); 
					pushFollow(FOLLOW_term_in_exp633);
					l=term();
					state._fsp--;

					ast = new EqualNode(ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:211:9: ( LESSEQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:211:9: ( LESSEQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:212:9: LESSEQ l= term
					{
					match(input,LESSEQ,FOLLOW_LESSEQ_in_exp673); 
					pushFollow(FOLLOW_term_in_exp677);
					l=term();
					state._fsp--;

					ast = new LessEqualNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:215:9: ( GREATEREQ l= term )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:215:9: ( GREATEREQ l= term )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:215:11: GREATEREQ l= term
					{
					match(input,GREATEREQ,FOLLOW_GREATEREQ_in_exp708); 
					pushFollow(FOLLOW_term_in_exp712);
					l=term();
					state._fsp--;

					ast = new GreatEqualNode(ast,l);
					}

					}
					break;

				default :
					break loop12;
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:220:1: term returns [Node ast] : f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* ;
	public final Node term() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:221:2: (f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:221:4: f= value ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
			{
			pushFollow(FOLLOW_value_in_term757);
			f=value();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:222:6: ( ( PLUS l= value ) | ( MINUS l= value ) | ( OR l= value ) )*
			loop13:
			while (true) {
				int alt13=4;
				switch ( input.LA(1) ) {
				case PLUS:
					{
					alt13=1;
					}
					break;
				case MINUS:
					{
					alt13=2;
					}
					break;
				case OR:
					{
					alt13=3;
					}
					break;
				}
				switch (alt13) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:223:5: ( PLUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:223:5: ( PLUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:224:5: PLUS l= value
					{
					match(input,PLUS,FOLLOW_PLUS_in_term778); 
					pushFollow(FOLLOW_value_in_term782);
					l=value();
					state._fsp--;

					ast = new PlusNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:227:9: ( MINUS l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:227:9: ( MINUS l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:228:9: MINUS l= value
					{
					match(input,MINUS,FOLLOW_MINUS_in_term821); 
					pushFollow(FOLLOW_value_in_term825);
					l=value();
					state._fsp--;

					ast = new MinusNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:231:9: ( OR l= value )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:231:9: ( OR l= value )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:232:9: OR l= value
					{
					match(input,OR,FOLLOW_OR_in_term864); 
					pushFollow(FOLLOW_value_in_term868);
					l=value();
					state._fsp--;

					ast = new OrNode(ast,l);
					}

					}
					break;

				default :
					break loop13;
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:238:1: value returns [Node ast] : f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* ;
	public final Node value() throws RecognitionException {
		Node ast = null;


		Node f =null;
		Node l =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:239:3: (f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )* )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:239:5: f= fatt ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
			{
			pushFollow(FOLLOW_fatt_in_value914);
			f=fatt();
			state._fsp--;

			ast = f;
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:240:6: ( ( TIMES l= fatt ) | ( DIVIDE l= fatt ) | ( AND l= fatt ) )*
			loop14:
			while (true) {
				int alt14=4;
				switch ( input.LA(1) ) {
				case TIMES:
					{
					alt14=1;
					}
					break;
				case DIVIDE:
					{
					alt14=2;
					}
					break;
				case AND:
					{
					alt14=3;
					}
					break;
				}
				switch (alt14) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:241:7: ( TIMES l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:241:7: ( TIMES l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:242:8: TIMES l= fatt
					{
					match(input,TIMES,FOLLOW_TIMES_in_value940); 
					pushFollow(FOLLOW_fatt_in_value944);
					l=fatt();
					state._fsp--;

					ast = new TimesNode (ast,l);
					}

					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:245:9: ( DIVIDE l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:245:9: ( DIVIDE l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:246:9: DIVIDE l= fatt
					{
					match(input,DIVIDE,FOLLOW_DIVIDE_in_value984); 
					pushFollow(FOLLOW_fatt_in_value988);
					l=fatt();
					state._fsp--;

					ast = new DivNode(ast,l);
					}

					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:249:9: ( AND l= fatt )
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:249:9: ( AND l= fatt )
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:250:9: AND l= fatt
					{
					match(input,AND,FOLLOW_AND_in_value1027); 
					pushFollow(FOLLOW_fatt_in_value1031);
					l=fatt();
					state._fsp--;

					ast = new AndNode(ast,l);
					}

					}
					break;

				default :
					break loop14;
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:255:1: fatt returns [Node ast] : (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID (cgt= concreteGenericType )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR );
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
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:256:2: (n= NAT | TRUE | FALSE | EMPTY | LPAR e= exp RPAR |i= ID (cgt= concreteGenericType )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )? | IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR | SLPAR e1= exp DOUBLECOL e2= exp SRPAR | FIRST LPAR e= exp RPAR | REST LPAR e= exp RPAR | PRINT LPAR e= exp RPAR | NOT LPAR e= exp RPAR )
			int alt19=12;
			switch ( input.LA(1) ) {
			case NAT:
				{
				alt19=1;
				}
				break;
			case TRUE:
				{
				alt19=2;
				}
				break;
			case FALSE:
				{
				alt19=3;
				}
				break;
			case EMPTY:
				{
				alt19=4;
				}
				break;
			case LPAR:
				{
				alt19=5;
				}
				break;
			case ID:
				{
				alt19=6;
				}
				break;
			case IF:
				{
				alt19=7;
				}
				break;
			case SLPAR:
				{
				alt19=8;
				}
				break;
			case FIRST:
				{
				alt19=9;
				}
				break;
			case REST:
				{
				alt19=10;
				}
				break;
			case PRINT:
				{
				alt19=11;
				}
				break;
			case NOT:
				{
				alt19=12;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:256:4: n= NAT
					{
					n=(Token)match(input,NAT,FOLLOW_NAT_in_fatt1078); 
					ast = new NatNode(Integer.parseInt((n!=null?n.getText():null)));
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:258:4: TRUE
					{
					match(input,TRUE,FOLLOW_TRUE_in_fatt1094); 
					ast = new BoolNode(true);
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:260:4: FALSE
					{
					match(input,FALSE,FOLLOW_FALSE_in_fatt1109); 
					ast = new BoolNode(false);
					}
					break;
				case 4 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:262:4: EMPTY
					{
					match(input,EMPTY,FOLLOW_EMPTY_in_fatt1121); 
					ast = new EmptyNode();
					}
					break;
				case 5 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:264:4: LPAR e= exp RPAR
					{
					match(input,LPAR,FOLLOW_LPAR_in_fatt1135); 
					pushFollow(FOLLOW_exp_in_fatt1139);
					e=exp();
					state._fsp--;

					match(input,RPAR,FOLLOW_RPAR_in_fatt1141); 
					ast = e;
					}
					break;
				case 6 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:266:4: i= ID (cgt= concreteGenericType )? ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					{
					i=(Token)match(input,ID,FOLLOW_ID_in_fatt1156); 

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
						
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:291:3: (cgt= concreteGenericType )?
					int alt15=2;
					int LA15_0 = input.LA(1);
					if ( (LA15_0==LANPAR) ) {
						alt15=1;
					}
					switch (alt15) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:291:4: cgt= concreteGenericType
							{
							pushFollow(FOLLOW_concreteGenericType_in_fatt1167);
							cgt=concreteGenericType();
							state._fsp--;

							 genericType = cgt; 
							}
							break;

					}

					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:292:3: ( LPAR (fp= exp ( COMMA p= exp )* )? RPAR )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==LPAR) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:293:3: LPAR (fp= exp ( COMMA p= exp )* )? RPAR
							{
							match(input,LPAR,FOLLOW_LPAR_in_fatt1180); 
							ArrayList<Node> parList = new ArrayList<Node>();
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:296:3: (fp= exp ( COMMA p= exp )* )?
							int alt17=2;
							int LA17_0 = input.LA(1);
							if ( (LA17_0==EMPTY||(LA17_0 >= FALSE && LA17_0 <= FIRST)||(LA17_0 >= ID && LA17_0 <= IF)||LA17_0==LPAR||(LA17_0 >= NAT && LA17_0 <= NOT)||LA17_0==PRINT||LA17_0==REST||LA17_0==SLPAR||LA17_0==TRUE) ) {
								alt17=1;
							}
							switch (alt17) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:297:4: fp= exp ( COMMA p= exp )*
									{
									pushFollow(FOLLOW_exp_in_fatt1199);
									fp=exp();
									state._fsp--;

									parList.add(fp);
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:298:4: ( COMMA p= exp )*
									loop16:
									while (true) {
										int alt16=2;
										int LA16_0 = input.LA(1);
										if ( (LA16_0==COMMA) ) {
											alt16=1;
										}

										switch (alt16) {
										case 1 :
											// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:298:5: COMMA p= exp
											{
											match(input,COMMA,FOLLOW_COMMA_in_fatt1207); 
											pushFollow(FOLLOW_exp_in_fatt1211);
											p=exp();
											state._fsp--;

											parList.add(p);
											}
											break;

										default :
											break loop16;
										}
									}

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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:310:4: IF x= exp THEN CLPAR y= exp CRPAR ELSE CLPAR z= exp CRPAR
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:314:4: SLPAR e1= exp DOUBLECOL e2= exp SRPAR
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:317:4: FIRST LPAR e= exp RPAR
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:320:4: REST LPAR e= exp RPAR
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:323:4: PRINT LPAR e= exp RPAR
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
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:326:4: NOT LPAR e= exp RPAR
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
			// do for sure before leaving
		}
		return ast;
	}
	// $ANTLR end "fatt"



	// $ANTLR start "type"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:337:1: type returns [Node ast] : (bt= baseType |at= arrowType |lt= listType );
	public final Node type() throws RecognitionException {
		Node ast = null;


		Node bt =null;
		Node at =null;
		Node lt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:338:2: (bt= baseType |at= arrowType |lt= listType )
			int alt20=3;
			switch ( input.LA(1) ) {
			case BOOLTYPE:
			case INTTYPE:
				{
				alt20=1;
				}
				break;
			case LPAR:
				{
				alt20=2;
				}
				break;
			case LIST:
				{
				alt20=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}
			switch (alt20) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:338:4: bt= baseType
					{
					pushFollow(FOLLOW_baseType_in_type1416);
					bt=baseType();
					state._fsp--;

					ast = bt;
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:339:6: at= arrowType
					{
					pushFollow(FOLLOW_arrowType_in_type1427);
					at=arrowType();
					state._fsp--;

					ast = at;
					}
					break;
				case 3 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:340:4: lt= listType
					{
					pushFollow(FOLLOW_listType_in_type1436);
					lt=listType();
					state._fsp--;

					ast = lt; 
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:343:1: baseType returns [Node ast] : ( INTTYPE | BOOLTYPE );
	public final Node baseType() throws RecognitionException {
		Node ast = null;


		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:344:2: ( INTTYPE | BOOLTYPE )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0==INTTYPE) ) {
				alt21=1;
			}
			else if ( (LA21_0==BOOLTYPE) ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:344:4: INTTYPE
					{
					match(input,INTTYPE,FOLLOW_INTTYPE_in_baseType1456); 
					ast = new IntTypeNode();
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:345:6: BOOLTYPE
					{
					match(input,BOOLTYPE,FOLLOW_BOOLTYPE_in_baseType1468); 
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
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:349:1: arrowType returns [Node ast] : LPAR ( (t1= type |t1= genericType ) ( COMMA (tn= type |tn= genericType ) )* )? RPAR ARROW rt= baseType ;
	public final Node arrowType() throws RecognitionException {
		Node ast = null;


		Node t1 =null;
		Node tn =null;
		Node rt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:350:3: ( LPAR ( (t1= type |t1= genericType ) ( COMMA (tn= type |tn= genericType ) )* )? RPAR ARROW rt= baseType )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:350:6: LPAR ( (t1= type |t1= genericType ) ( COMMA (tn= type |tn= genericType ) )* )? RPAR ARROW rt= baseType
			{
			match(input,LPAR,FOLLOW_LPAR_in_arrowType1494); 
			ArrowTypeNode atn= new ArrowTypeNode();
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:351:5: ( (t1= type |t1= genericType ) ( COMMA (tn= type |tn= genericType ) )* )?
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==BOOLTYPE||(LA25_0 >= INTTYPE && LA25_0 <= LANPAR)||(LA25_0 >= LIST && LA25_0 <= LPAR)) ) {
				alt25=1;
			}
			switch (alt25) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:352:6: (t1= type |t1= genericType ) ( COMMA (tn= type |tn= genericType ) )*
					{
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:352:6: (t1= type |t1= genericType )
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==BOOLTYPE||LA22_0==INTTYPE||(LA22_0 >= LIST && LA22_0 <= LPAR)) ) {
						alt22=1;
					}
					else if ( (LA22_0==LANPAR) ) {
						alt22=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 22, 0, input);
						throw nvae;
					}

					switch (alt22) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:352:7: t1= type
							{
							pushFollow(FOLLOW_type_in_arrowType1512);
							t1=type();
							state._fsp--;

							}
							break;
						case 2 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:352:16: t1= genericType
							{
							pushFollow(FOLLOW_genericType_in_arrowType1517);
							t1=genericType();
							state._fsp--;

							}
							break;

					}

					atn.addParType(t1);
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:353:6: ( COMMA (tn= type |tn= genericType ) )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COMMA) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:354:7: COMMA (tn= type |tn= genericType )
							{
							match(input,COMMA,FOLLOW_COMMA_in_arrowType1536); 
							// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:354:13: (tn= type |tn= genericType )
							int alt23=2;
							int LA23_0 = input.LA(1);
							if ( (LA23_0==BOOLTYPE||LA23_0==INTTYPE||(LA23_0 >= LIST && LA23_0 <= LPAR)) ) {
								alt23=1;
							}
							else if ( (LA23_0==LANPAR) ) {
								alt23=2;
							}

							else {
								NoViableAltException nvae =
									new NoViableAltException("", 23, 0, input);
								throw nvae;
							}

							switch (alt23) {
								case 1 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:354:14: tn= type
									{
									pushFollow(FOLLOW_type_in_arrowType1541);
									tn=type();
									state._fsp--;

									}
									break;
								case 2 :
									// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:354:24: tn= genericType
									{
									pushFollow(FOLLOW_genericType_in_arrowType1547);
									tn=genericType();
									state._fsp--;

									}
									break;

							}

							atn.addParType(tn);
							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}

			match(input,RPAR,FOLLOW_RPAR_in_arrowType1573); 
			match(input,ARROW,FOLLOW_ARROW_in_arrowType1575); 
			pushFollow(FOLLOW_baseType_in_arrowType1579);
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



	// $ANTLR start "genericType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:363:1: genericType returns [Node ast] : (gpt= genericParamType |cgt= concreteGenericType );
	public final Node genericType() throws RecognitionException {
		Node ast = null;


		Node gpt =null;
		Node cgt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:364:3: (gpt= genericParamType |cgt= concreteGenericType )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==LANPAR) ) {
				int LA26_1 = input.LA(2);
				if ( (LA26_1==ID) ) {
					alt26=1;
				}
				else if ( (LA26_1==BOOLTYPE||LA26_1==INTTYPE) ) {
					alt26=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 26, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:364:5: gpt= genericParamType
					{
					pushFollow(FOLLOW_genericParamType_in_genericType1604);
					gpt=genericParamType();
					state._fsp--;

					 ast = gpt; 
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:365:5: cgt= concreteGenericType
					{
					pushFollow(FOLLOW_concreteGenericType_in_genericType1614);
					cgt=concreteGenericType();
					state._fsp--;

					 ast = cgt; 
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
	// $ANTLR end "genericType"



	// $ANTLR start "genericParamType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:367:1: genericParamType returns [Node ast] : LANPAR i= ID RANPAR ;
	public final Node genericParamType() throws RecognitionException {
		Node ast = null;


		Token i=null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:368:3: ( LANPAR i= ID RANPAR )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:368:5: LANPAR i= ID RANPAR
			{
			match(input,LANPAR,FOLLOW_LANPAR_in_genericParamType1630); 
			i=(Token)match(input,ID,FOLLOW_ID_in_genericParamType1634); 
			match(input,RANPAR,FOLLOW_RANPAR_in_genericParamType1636); 
			 ast = new genericTypeNode((i!=null?i.getText():null)); 
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
	// $ANTLR end "genericParamType"



	// $ANTLR start "concreteGenericType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:370:1: concreteGenericType returns [Node ast] : LANPAR bt= baseType RANPAR ;
	public final Node concreteGenericType() throws RecognitionException {
		Node ast = null;


		Node bt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:371:3: ( LANPAR bt= baseType RANPAR )
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:371:6: LANPAR bt= baseType RANPAR
			{
			match(input,LANPAR,FOLLOW_LANPAR_in_concreteGenericType1653); 
			pushFollow(FOLLOW_baseType_in_concreteGenericType1657);
			bt=baseType();
			state._fsp--;

			match(input,RANPAR,FOLLOW_RANPAR_in_concreteGenericType1659); 
			 ast = bt; 
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



	// $ANTLR start "listType"
	// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:373:1: listType returns [Node ast] : ( LIST SLPAR bt= baseType SRPAR | LIST SLPAR i= ID SRPAR );
	public final Node listType() throws RecognitionException {
		Node ast = null;


		Token i=null;
		Node bt =null;

		try {
			// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:374:2: ( LIST SLPAR bt= baseType SRPAR | LIST SLPAR i= ID SRPAR )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==LIST) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==SLPAR) ) {
					int LA27_2 = input.LA(3);
					if ( (LA27_2==ID) ) {
						alt27=2;
					}
					else if ( (LA27_2==BOOLTYPE||LA27_2==INTTYPE) ) {
						alt27=1;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 27, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:374:4: LIST SLPAR bt= baseType SRPAR
					{
					match(input,LIST,FOLLOW_LIST_in_listType1676); 
					match(input,SLPAR,FOLLOW_SLPAR_in_listType1678); 
					pushFollow(FOLLOW_baseType_in_listType1682);
					bt=baseType();
					state._fsp--;

					match(input,SRPAR,FOLLOW_SRPAR_in_listType1684); 
					 ast = new concreteListParamTypeNode(bt); 
					}
					break;
				case 2 :
					// /home/benkio/workspace/LPeMC Lab Project/src/highLevelLanguage/MiniFun.g:375:4: LIST SLPAR i= ID SRPAR
					{
					match(input,LIST,FOLLOW_LIST_in_listType1691); 
					match(input,SLPAR,FOLLOW_SLPAR_in_listType1693); 
					i=(Token)match(input,ID,FOLLOW_ID_in_listType1697); 
					match(input,SRPAR,FOLLOW_SRPAR_in_listType1699); 
					 ast = new genericListParamTypeNode((i!=null?i.getText():null));
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
	public static final BitSet FOLLOW_genericParamType_in_declist166 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COL_in_declist192 = new BitSet(new long[]{0x0000000042000080L});
	public static final BitSet FOLLOW_baseType_in_declist197 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist212 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist241 = new BitSet(new long[]{0x0000000004000200L});
	public static final BitSet FOLLOW_genericType_in_declist266 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COL_in_declist282 = new BitSet(new long[]{0x0000000062000080L});
	public static final BitSet FOLLOW_type_in_declist286 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist317 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist321 = new BitSet(new long[]{0x0000000004000200L});
	public static final BitSet FOLLOW_genericType_in_declist328 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COL_in_declist334 = new BitSet(new long[]{0x0000000062000080L});
	public static final BitSet FOLLOW_type_in_declist338 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_arrowType_in_declist373 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_declist388 = new BitSet(new long[]{0x0000008000400000L});
	public static final BitSet FOLLOW_ID_in_declist417 = new BitSet(new long[]{0x0000008004000400L});
	public static final BitSet FOLLOW_genericType_in_declist424 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_declist447 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_declist451 = new BitSet(new long[]{0x0000008004000400L});
	public static final BitSet FOLLOW_genericType_in_declist458 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_declist499 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_declist508 = new BitSet(new long[]{0x0000625340DC8000L});
	public static final BitSet FOLLOW_declist_in_declist527 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_declist549 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_declist575 = new BitSet(new long[]{0x0000010000000000L});
	public static final BitSet FOLLOW_SEMIC_in_declist582 = new BitSet(new long[]{0x0000400000100002L});
	public static final BitSet FOLLOW_term_in_exp609 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_EQ_in_exp629 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp633 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_LESSEQ_in_exp673 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp677 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_GREATEREQ_in_exp708 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_term_in_exp712 = new BitSet(new long[]{0x0000000008210002L});
	public static final BitSet FOLLOW_value_in_term757 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_PLUS_in_term778 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term782 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_MINUS_in_term821 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term825 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_OR_in_term864 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_value_in_term868 = new BitSet(new long[]{0x0000000C80000002L});
	public static final BitSet FOLLOW_fatt_in_value914 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_TIMES_in_value940 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value944 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_DIVIDE_in_value984 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value988 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_AND_in_value1027 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_fatt_in_value1031 = new BitSet(new long[]{0x0000100000001012L});
	public static final BitSet FOLLOW_NAT_in_fatt1078 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_fatt1094 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_fatt1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EMPTY_in_fatt1121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt1135 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1139 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1141 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ID_in_fatt1156 = new BitSet(new long[]{0x0000000044000002L});
	public static final BitSet FOLLOW_concreteGenericType_in_fatt1167 = new BitSet(new long[]{0x0000000040000002L});
	public static final BitSet FOLLOW_LPAR_in_fatt1180 = new BitSet(new long[]{0x000022D340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1199 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_fatt1207 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1211 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_fatt1225 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_IF_in_fatt1236 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1240 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_THEN_in_fatt1242 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt1244 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1248 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt1250 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_ELSE_in_fatt1255 = new BitSet(new long[]{0x0000000000000100L});
	public static final BitSet FOLLOW_CLPAR_in_fatt1257 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1261 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_CRPAR_in_fatt1263 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SLPAR_in_fatt1277 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1281 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_DOUBLECOL_in_fatt1283 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1287 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_fatt1289 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FIRST_in_fatt1302 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1304 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1308 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1310 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_REST_in_fatt1327 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1329 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1333 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_PRINT_in_fatt1352 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1354 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1358 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1360 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_NOT_in_fatt1377 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_LPAR_in_fatt1379 = new BitSet(new long[]{0x0000225340CC8000L});
	public static final BitSet FOLLOW_exp_in_fatt1383 = new BitSet(new long[]{0x0000008000000000L});
	public static final BitSet FOLLOW_RPAR_in_fatt1385 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_baseType_in_type1416 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_arrowType_in_type1427 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_listType_in_type1436 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTTYPE_in_baseType1456 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_BOOLTYPE_in_baseType1468 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAR_in_arrowType1494 = new BitSet(new long[]{0x0000008066000080L});
	public static final BitSet FOLLOW_type_in_arrowType1512 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_genericType_in_arrowType1517 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_COMMA_in_arrowType1536 = new BitSet(new long[]{0x0000000066000080L});
	public static final BitSet FOLLOW_type_in_arrowType1541 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_genericType_in_arrowType1547 = new BitSet(new long[]{0x0000008000000400L});
	public static final BitSet FOLLOW_RPAR_in_arrowType1573 = new BitSet(new long[]{0x0000000000000020L});
	public static final BitSet FOLLOW_ARROW_in_arrowType1575 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_arrowType1579 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_genericParamType_in_genericType1604 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_concreteGenericType_in_genericType1614 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LANPAR_in_genericParamType1630 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_genericParamType1634 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_genericParamType1636 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LANPAR_in_concreteGenericType1653 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_concreteGenericType1657 = new BitSet(new long[]{0x0000002000000000L});
	public static final BitSet FOLLOW_RANPAR_in_concreteGenericType1659 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listType1676 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SLPAR_in_listType1678 = new BitSet(new long[]{0x0000000002000080L});
	public static final BitSet FOLLOW_baseType_in_listType1682 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_listType1684 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LIST_in_listType1691 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_SLPAR_in_listType1693 = new BitSet(new long[]{0x0000000000400000L});
	public static final BitSet FOLLOW_ID_in_listType1697 = new BitSet(new long[]{0x0000040000000000L});
	public static final BitSet FOLLOW_SRPAR_in_listType1699 = new BitSet(new long[]{0x0000000000000002L});
}
