// Generated from C:/Users/spenc/Desktop/GitHub/Tlang/src/main/antlr/TrefoilParser.g4 by ANTLR 4.13.2

package me.spencernold.tlang.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TrefoilParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		O_PARENTHESES=1, C_PARENTHESES=2, O_C_BRACKET=3, C_C_BRACKET=4, O_BRACKET=5, 
		C_BRACKET=6, DOT=7, COMMA=8, TRUE_VALUE=9, FALSE_VALUE=10, NULL_VALUE=11, 
		INT8=12, INT16=13, INT32=14, INT64=15, UINT8=16, UINT16=17, UINT32=18, 
		UINT64=19, CHAR=20, BOOL=21, FLOAT32=22, FLOAT64=23, FUNCTION=24, VOID=25, 
		STRING=26, POINTER=27, INCLUDE=28, PRIVATE=29, PROTECTED=30, CLASS=31, 
		ENUM=32, INTERFACE=33, NEW=34, EXTENDS=35, IMPLEMENTS=36, ABSTRACT=37, 
		FINAL=38, ASSERT=39, THIS=40, RETURN=41, IF=42, ELSE=43, FOR=44, IN=45, 
		RANGE=46, WHILE=47, CONTINUE=48, BREAK=49, IS=50, ASYNC=51, FUTURE=52, 
		UNSAFE=53, DEFER=54, EXTERNAL=55, ADD_EQ_OPER=56, SUB_EQ_OPER=57, MUL_EQ_OPER=58, 
		DIV_EQ_OPER=59, MOD_EQ_OPER=60, INCR_OPER=61, DECR_OPER=62, POW_OPER=63, 
		GT_EQ_OPER=64, LT_EQ_OPER=65, BIT_SHL_OPER=66, BIT_SHR_OPER=67, EQ_OPER=68, 
		ADD_OPER=69, SUB_OPER=70, MUL_OPER=71, DIV_OPER=72, MOD_OPER=73, GT_OPER=74, 
		LT_OPER=75, BIT_AND_OPER=76, BIT_OR_OPER=77, BIT_NOT_OPER=78, BIT_XOR_OPER=79, 
		AND_OPER=80, OR_OPER=81, NOT_OPER=82, TERNARY_OPER=83, STRING_LIT=84, 
		DECIMAL=85, FLOATING_POINT=86, IDENTIFIER=87, WS=88, NEWLINE=89;
	public static final int
		RULE_file = 0, RULE_declaration = 1, RULE_functionDecl = 2, RULE_parameters = 3, 
		RULE_block = 4, RULE_instructions = 5, RULE_variable = 6, RULE_type = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"file", "declaration", "functionDecl", "parameters", "block", "instructions", 
			"variable", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "'{'", "'}'", "'['", "']'", "'.'", "','", "'true'", 
			"'false'", "'null'", "'int8'", "'int16'", "'int32'", "'int64'", "'uint8'", 
			"'uint16'", "'uint32'", "'uint64'", "'char'", "'bool'", "'float32'", 
			"'float64'", "'function'", "'void'", "'string'", "'ptr'", "'include'", 
			"'private'", "'protected'", "'class'", "'enum'", "'interface'", "'new'", 
			"'extends'", "'implements'", "'abstract'", "'final'", "'assert'", "'this'", 
			"'return'", "'if'", "'else'", "'for'", "'in'", "'range'", "'while'", 
			"'continue'", "'break'", "'is'", "'async'", "'future'", "'unsafe'", "'defer'", 
			"'external'", "'+='", "'-='", "'*='", "'/='", "'%='", "'++'", "'--'", 
			"'**'", "'>='", "'<='", "'<<'", "'>>'", "'='", "'+'", "'-'", "'*'", "'/'", 
			"'%'", "'>'", "'<'", "'&'", "'|'", "'~'", "'^'", "'and'", "'or'", "'not'", 
			"'?'", null, null, null, null, null, "'\\n'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "O_PARENTHESES", "C_PARENTHESES", "O_C_BRACKET", "C_C_BRACKET", 
			"O_BRACKET", "C_BRACKET", "DOT", "COMMA", "TRUE_VALUE", "FALSE_VALUE", 
			"NULL_VALUE", "INT8", "INT16", "INT32", "INT64", "UINT8", "UINT16", "UINT32", 
			"UINT64", "CHAR", "BOOL", "FLOAT32", "FLOAT64", "FUNCTION", "VOID", "STRING", 
			"POINTER", "INCLUDE", "PRIVATE", "PROTECTED", "CLASS", "ENUM", "INTERFACE", 
			"NEW", "EXTENDS", "IMPLEMENTS", "ABSTRACT", "FINAL", "ASSERT", "THIS", 
			"RETURN", "IF", "ELSE", "FOR", "IN", "RANGE", "WHILE", "CONTINUE", "BREAK", 
			"IS", "ASYNC", "FUTURE", "UNSAFE", "DEFER", "EXTERNAL", "ADD_EQ_OPER", 
			"SUB_EQ_OPER", "MUL_EQ_OPER", "DIV_EQ_OPER", "MOD_EQ_OPER", "INCR_OPER", 
			"DECR_OPER", "POW_OPER", "GT_EQ_OPER", "LT_EQ_OPER", "BIT_SHL_OPER", 
			"BIT_SHR_OPER", "EQ_OPER", "ADD_OPER", "SUB_OPER", "MUL_OPER", "DIV_OPER", 
			"MOD_OPER", "GT_OPER", "LT_OPER", "BIT_AND_OPER", "BIT_OR_OPER", "BIT_NOT_OPER", 
			"BIT_XOR_OPER", "AND_OPER", "OR_OPER", "NOT_OPER", "TERNARY_OPER", "STRING_LIT", 
			"DECIMAL", "FLOATING_POINT", "IDENTIFIER", "WS", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TrefoilParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TrefoilParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TrefoilParser.EOF, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitFile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitFile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 436207616L) != 0)) {
				{
				{
				setState(16);
				declaration();
				}
				}
				setState(21);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(22);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode INCLUDE() { return getToken(TrefoilParser.INCLUDE, 0); }
		public TerminalNode STRING_LIT() { return getToken(TrefoilParser.STRING_LIT, 0); }
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaration);
		try {
			setState(27);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INCLUDE:
				enterOuterAlt(_localctx, 1);
				{
				setState(24);
				match(INCLUDE);
				setState(25);
				match(STRING_LIT);
				}
				break;
			case VOID:
			case POINTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(26);
				functionDecl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionDeclContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TrefoilParser.IDENTIFIER, 0); }
		public TerminalNode O_PARENTHESES() { return getToken(TrefoilParser.O_PARENTHESES, 0); }
		public TerminalNode C_PARENTHESES() { return getToken(TrefoilParser.C_PARENTHESES, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			type();
			setState(30);
			match(IDENTIFIER);
			setState(31);
			match(O_PARENTHESES);
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID || _la==POINTER) {
				{
				setState(32);
				parameters();
				}
			}

			setState(35);
			match(C_PARENTHESES);
			setState(36);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TrefoilParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TrefoilParser.COMMA, i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			variable();
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(39);
				match(COMMA);
				setState(40);
				variable();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode O_C_BRACKET() { return getToken(TrefoilParser.O_C_BRACKET, 0); }
		public TerminalNode C_C_BRACKET() { return getToken(TrefoilParser.C_C_BRACKET, 0); }
		public InstructionsContext instructions() {
			return getRuleContext(InstructionsContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			match(O_C_BRACKET);
			setState(48);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VOID || _la==POINTER) {
				{
				setState(47);
				instructions();
				}
			}

			setState(50);
			match(C_C_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstructionsContext extends ParserRuleContext {
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public InstructionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instructions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterInstructions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitInstructions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitInstructions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionsContext instructions() throws RecognitionException {
		InstructionsContext _localctx = new InstructionsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instructions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(52);
				variable();
				}
				}
				setState(55); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==VOID || _la==POINTER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(TrefoilParser.IDENTIFIER, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			type();
			setState(58);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(TrefoilParser.VOID, 0); }
		public TerminalNode POINTER() { return getToken(TrefoilParser.POINTER, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TrefoilParserListener ) ((TrefoilParserListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TrefoilParserVisitor ) return ((TrefoilParserVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==POINTER) {
				{
				setState(60);
				match(POINTER);
				}
			}

			setState(63);
			match(VOID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001YB\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001\u0000"+
		"\u0005\u0000\u0012\b\u0000\n\u0000\f\u0000\u0015\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001c\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\"\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003*\b\u0003\n\u0003\f\u0003-\t\u0003\u0001\u0004\u0001\u0004\u0003"+
		"\u00041\b\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0004\u00056\b\u0005"+
		"\u000b\u0005\f\u00057\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007>\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0000"+
		"\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0000@\u0000\u0013\u0001"+
		"\u0000\u0000\u0000\u0002\u001b\u0001\u0000\u0000\u0000\u0004\u001d\u0001"+
		"\u0000\u0000\u0000\u0006&\u0001\u0000\u0000\u0000\b.\u0001\u0000\u0000"+
		"\u0000\n5\u0001\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000e=\u0001"+
		"\u0000\u0000\u0000\u0010\u0012\u0003\u0002\u0001\u0000\u0011\u0010\u0001"+
		"\u0000\u0000\u0000\u0012\u0015\u0001\u0000\u0000\u0000\u0013\u0011\u0001"+
		"\u0000\u0000\u0000\u0013\u0014\u0001\u0000\u0000\u0000\u0014\u0016\u0001"+
		"\u0000\u0000\u0000\u0015\u0013\u0001\u0000\u0000\u0000\u0016\u0017\u0005"+
		"\u0000\u0000\u0001\u0017\u0001\u0001\u0000\u0000\u0000\u0018\u0019\u0005"+
		"\u001c\u0000\u0000\u0019\u001c\u0005T\u0000\u0000\u001a\u001c\u0003\u0004"+
		"\u0002\u0000\u001b\u0018\u0001\u0000\u0000\u0000\u001b\u001a\u0001\u0000"+
		"\u0000\u0000\u001c\u0003\u0001\u0000\u0000\u0000\u001d\u001e\u0003\u000e"+
		"\u0007\u0000\u001e\u001f\u0005W\u0000\u0000\u001f!\u0005\u0001\u0000\u0000"+
		" \"\u0003\u0006\u0003\u0000! \u0001\u0000\u0000\u0000!\"\u0001\u0000\u0000"+
		"\u0000\"#\u0001\u0000\u0000\u0000#$\u0005\u0002\u0000\u0000$%\u0003\b"+
		"\u0004\u0000%\u0005\u0001\u0000\u0000\u0000&+\u0003\f\u0006\u0000\'(\u0005"+
		"\b\u0000\u0000(*\u0003\f\u0006\u0000)\'\u0001\u0000\u0000\u0000*-\u0001"+
		"\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000\u0000\u0000"+
		",\u0007\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000.0\u0005\u0003"+
		"\u0000\u0000/1\u0003\n\u0005\u00000/\u0001\u0000\u0000\u000001\u0001\u0000"+
		"\u0000\u000012\u0001\u0000\u0000\u000023\u0005\u0004\u0000\u00003\t\u0001"+
		"\u0000\u0000\u000046\u0003\f\u0006\u000054\u0001\u0000\u0000\u000067\u0001"+
		"\u0000\u0000\u000075\u0001\u0000\u0000\u000078\u0001\u0000\u0000\u0000"+
		"8\u000b\u0001\u0000\u0000\u00009:\u0003\u000e\u0007\u0000:;\u0005W\u0000"+
		"\u0000;\r\u0001\u0000\u0000\u0000<>\u0005\u001b\u0000\u0000=<\u0001\u0000"+
		"\u0000\u0000=>\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0005"+
		"\u0019\u0000\u0000@\u000f\u0001\u0000\u0000\u0000\u0007\u0013\u001b!+"+
		"07=";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}