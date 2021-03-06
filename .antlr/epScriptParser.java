// Generated from c:\Users\zuhan\Desktop\Programming\Practice\antlr\t2\epScriptParser.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class epScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BooleanLiterl=1, DecimalLiteral=2, HexIntegerLiteral=3, OpenBracket=4, 
		CloseBracket=5, OpenParen=6, CloseParen=7, OpenBrace=8, CloseBrace=9, 
		Dot=10, QuestionMark=11, Comma=12, Colon=13, SemiColon=14, PlusPlus=15, 
		MinusMinus=16, PlusAssign=17, MinusAssign=18, MultiplyAssign=19, LeftShiftArithmeticAssign=20, 
		RightShiftArithmeticAssign=21, BitAndAssign=22, BitXorAssign=23, BitOrAssign=24, 
		And=25, Or=26, LeftShiftArithmetic=27, RightShiftArithmetic=28, BitNot=29, 
		BitAnd=30, BitOr=31, BitXOr=32, Equals=33, LessThanEquals=34, GreaterThanEquals=35, 
		LessThan=36, MoreThan=37, NotEquals=38, Not=39, Plus=40, Minus=41, Multiply=42, 
		Divide=43, Modulus=44, Assign=45, UnitName=46, LocName=47, SwitchName=48, 
		MapString=49, StatTxt=50, VArray=51, List=52, Import=53, As=54, Var=55, 
		Const=56, Static=57, Function=58, Object=59, L2V=60, Once=61, If=62, Else=63, 
		For=64, Foreach=65, While=66, Break=67, Continue=68, Return=69, Switch=70, 
		Case=71, Default=72, This=73, Identifier=74, StringLiteral=75, WhiteSpaces=76, 
		LineTerminator=77, MultiLineComment=78, SingleLineComment=79, UnexpectedCharacter=80, 
		DoubleStringCharacter=81, SingleStringCharacter=82;
	public static final int
		RULE_program = 0, RULE_sourceElement = 1, RULE_statement = 2, RULE_block = 3, 
		RULE_statementList = 4, RULE_importStatement = 5, RULE_dottedName = 6, 
		RULE_importNamespace = 7, RULE_variableStatement = 8, RULE_variableDeclarationList = 9, 
		RULE_variableDeclaration = 10, RULE_emptyStatement = 11, RULE_assignAble = 12, 
		RULE_expressionSequence = 13, RULE_expressionStatement = 14, RULE_varModifier = 15, 
		RULE_ifStatement = 16, RULE_iterationStatement = 17, RULE_onceStatement = 18, 
		RULE_continueStatement = 19, RULE_breakStatement = 20, RULE_returnStatement = 21, 
		RULE_switchStatement = 22, RULE_caseBlock = 23, RULE_caseClauses = 24, 
		RULE_caseClause = 25, RULE_defaultClause = 26, RULE_objectDeclaration = 27, 
		RULE_objectTail = 28, RULE_objectElement = 29, RULE_objectVariableDeclaration = 30, 
		RULE_functionDeclaration = 31, RULE_formalParameterList = 32, RULE_formalParameterArg = 33, 
		RULE_lastFormalParameterArg = 34, RULE_functionBody = 35, RULE_functionDefine = 36, 
		RULE_sourceElements = 37, RULE_arrayLiteral = 38, RULE_elementList = 39, 
		RULE_arrayElement = 40, RULE_arguments = 41, RULE_argumentList = 42, RULE_argument = 43, 
		RULE_singleExpression = 44, RULE_assignmentOperator = 45, RULE_literal = 46, 
		RULE_numericLiteral = 47, RULE_identifierName = 48, RULE_identifier = 49, 
		RULE_reservedWord = 50, RULE_keyword = 51;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sourceElement", "statement", "block", "statementList", "importStatement", 
			"dottedName", "importNamespace", "variableStatement", "variableDeclarationList", 
			"variableDeclaration", "emptyStatement", "assignAble", "expressionSequence", 
			"expressionStatement", "varModifier", "ifStatement", "iterationStatement", 
			"onceStatement", "continueStatement", "breakStatement", "returnStatement", 
			"switchStatement", "caseBlock", "caseClauses", "caseClause", "defaultClause", 
			"objectDeclaration", "objectTail", "objectElement", "objectVariableDeclaration", 
			"functionDeclaration", "formalParameterList", "formalParameterArg", "lastFormalParameterArg", 
			"functionBody", "functionDefine", "sourceElements", "arrayLiteral", "elementList", 
			"arrayElement", "arguments", "argumentList", "argument", "singleExpression", 
			"assignmentOperator", "literal", "numericLiteral", "identifierName", 
			"identifier", "reservedWord", "keyword"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, "'['", "']'", "'('", "')'", "'{'", "'}'", "'.'", 
			"'?'", "','", "':'", "';'", "'++'", "'--'", "'+='", "'-='", "'*='", "'<<='", 
			"'>>='", "'&='", "'^='", "'|='", "'&&'", "'||'", "'<<'", "'>>'", "'~'", 
			"'&'", "'|'", "'^'", "'=='", "'<='", "'>='", "'<'", "'>'", "'!='", "'!'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'$U'", "'$L'", "'$S'", "'$T'", 
			"'$B'", "'VArray'", "'list'", "'import'", "'as'", "'var'", "'const'", 
			"'static'", "'function'", "'object'", "'l2v'", "'once'", "'if'", "'else'", 
			"'for'", "'foreach'", "'while'", "'break'", "'continue'", "'return'", 
			"'switch'", "'case'", "'default'", "'this'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "BooleanLiterl", "DecimalLiteral", "HexIntegerLiteral", "OpenBracket", 
			"CloseBracket", "OpenParen", "CloseParen", "OpenBrace", "CloseBrace", 
			"Dot", "QuestionMark", "Comma", "Colon", "SemiColon", "PlusPlus", "MinusMinus", 
			"PlusAssign", "MinusAssign", "MultiplyAssign", "LeftShiftArithmeticAssign", 
			"RightShiftArithmeticAssign", "BitAndAssign", "BitXorAssign", "BitOrAssign", 
			"And", "Or", "LeftShiftArithmetic", "RightShiftArithmetic", "BitNot", 
			"BitAnd", "BitOr", "BitXOr", "Equals", "LessThanEquals", "GreaterThanEquals", 
			"LessThan", "MoreThan", "NotEquals", "Not", "Plus", "Minus", "Multiply", 
			"Divide", "Modulus", "Assign", "UnitName", "LocName", "SwitchName", "MapString", 
			"StatTxt", "VArray", "List", "Import", "As", "Var", "Const", "Static", 
			"Function", "Object", "L2V", "Once", "If", "Else", "For", "Foreach", 
			"While", "Break", "Continue", "Return", "Switch", "Case", "Default", 
			"This", "Identifier", "StringLiteral", "WhiteSpaces", "LineTerminator", 
			"MultiLineComment", "SingleLineComment", "UnexpectedCharacter", "DoubleStringCharacter", 
			"SingleStringCharacter"
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
	public String getGrammarFileName() { return "epScriptParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public epScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(epScriptParser.EOF, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(104);
				sourceElements();
				}
			}

			setState(107);
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

	public static class SourceElementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public SourceElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElement; }
	}

	public final SourceElementContext sourceElement() throws RecognitionException {
		SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sourceElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			statement();
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

	public static class StatementContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ImportStatementContext importStatement() {
			return getRuleContext(ImportStatementContext.class,0);
		}
		public VariableStatementContext variableStatement() {
			return getRuleContext(VariableStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public IterationStatementContext iterationStatement() {
			return getRuleContext(IterationStatementContext.class,0);
		}
		public ExpressionStatementContext expressionStatement() {
			return getRuleContext(ExpressionStatementContext.class,0);
		}
		public OnceStatementContext onceStatement() {
			return getRuleContext(OnceStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ObjectDeclarationContext objectDeclaration() {
			return getRuleContext(ObjectDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public EmptyStatementContext emptyStatement() {
			return getRuleContext(EmptyStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(111);
				block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(112);
				importStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				variableStatement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(114);
				ifStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(115);
				iterationStatement();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(116);
				expressionStatement();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(117);
				onceStatement();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(118);
				continueStatement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(119);
				breakStatement();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(120);
				returnStatement();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(121);
				objectDeclaration();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(122);
				functionDeclaration();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(123);
				emptyStatement();
				}
				break;
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(epScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(epScriptParser.CloseBrace, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(OpenBrace);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(127);
				statementList();
				}
			}

			setState(130);
			match(CloseBrace);
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

	public static class StatementListContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementList; }
	}

	public final StatementListContext statementList() throws RecognitionException {
		StatementListContext _localctx = new StatementListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(133); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(132);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(135); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class ImportStatementContext extends ParserRuleContext {
		public TerminalNode Import() { return getToken(epScriptParser.Import, 0); }
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ImportNamespaceContext importNamespace() {
			return getRuleContext(ImportNamespaceContext.class,0);
		}
		public ImportStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importStatement; }
	}

	public final ImportStatementContext importStatement() throws RecognitionException {
		ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_importStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(Import);
			setState(138);
			dottedName(0);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==As) {
				{
				setState(139);
				importNamespace();
				}
			}

			setState(142);
			match(SemiColon);
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

	public static class DottedNameContext extends ParserRuleContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public DottedNameContext dottedName() {
			return getRuleContext(DottedNameContext.class,0);
		}
		public TerminalNode Dot() { return getToken(epScriptParser.Dot, 0); }
		public DottedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dottedName; }
	}

	public final DottedNameContext dottedName() throws RecognitionException {
		return dottedName(0);
	}

	private DottedNameContext dottedName(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		DottedNameContext _localctx = new DottedNameContext(_ctx, _parentState);
		DottedNameContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_dottedName, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(145);
			identifierName();
			}
			_ctx.stop = _input.LT(-1);
			setState(152);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new DottedNameContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_dottedName);
					setState(147);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(148);
					match(Dot);
					setState(149);
					identifierName();
					}
					} 
				}
				setState(154);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ImportNamespaceContext extends ParserRuleContext {
		public TerminalNode As() { return getToken(epScriptParser.As, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importNamespace; }
	}

	public final ImportNamespaceContext importNamespace() throws RecognitionException {
		ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_importNamespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(As);
			setState(156);
			identifierName();
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

	public static class VariableStatementContext extends ParserRuleContext {
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public VariableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableStatement; }
	}

	public final VariableStatementContext variableStatement() throws RecognitionException {
		VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			variableDeclarationList();
			setState(159);
			match(SemiColon);
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

	public static class VariableDeclarationListContext extends ParserRuleContext {
		public VarModifierContext varModifier() {
			return getRuleContext(VarModifierContext.class,0);
		}
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(epScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(epScriptParser.Comma, i);
		}
		public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationList; }
	}

	public final VariableDeclarationListContext variableDeclarationList() throws RecognitionException {
		VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variableDeclarationList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			varModifier();
			setState(162);
			variableDeclaration();
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(163);
				match(Comma);
				setState(164);
				variableDeclaration();
				}
				}
				setState(169);
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

	public static class VariableDeclarationContext extends ParserRuleContext {
		public AssignAbleContext assignAble() {
			return getRuleContext(AssignAbleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(epScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			assignAble();
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(171);
				match(Assign);
				setState(172);
				singleExpression(0);
				}
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

	public static class EmptyStatementContext extends ParserRuleContext {
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public EmptyStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emptyStatement; }
	}

	public final EmptyStatementContext emptyStatement() throws RecognitionException {
		EmptyStatementContext _localctx = new EmptyStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_emptyStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(SemiColon);
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

	public static class AssignAbleContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public AssignAbleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignAble; }
	}

	public final AssignAbleContext assignAble() throws RecognitionException {
		AssignAbleContext _localctx = new AssignAbleContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignAble);
		try {
			setState(179);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				identifier();
				}
				break;
			case OpenBracket:
				enterOuterAlt(_localctx, 2);
				{
				setState(178);
				arrayLiteral();
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

	public static class ExpressionSequenceContext extends ParserRuleContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(epScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(epScriptParser.Comma, i);
		}
		public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSequence; }
	}

	public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
		ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_expressionSequence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			singleExpression(0);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(182);
				match(Comma);
				setState(183);
				singleExpression(0);
				}
				}
				setState(188);
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

	public static class ExpressionStatementContext extends ParserRuleContext {
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionStatement; }
	}

	public final ExpressionStatementContext expressionStatement() throws RecognitionException {
		ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			expressionSequence();
			setState(190);
			match(SemiColon);
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

	public static class VarModifierContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(epScriptParser.Var, 0); }
		public TerminalNode Const() { return getToken(epScriptParser.Const, 0); }
		public VarModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varModifier; }
	}

	public final VarModifierContext varModifier() throws RecognitionException {
		VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==Var || _la==Const) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IfStatementContext extends ParserRuleContext {
		public TerminalNode If() { return getToken(epScriptParser.If, 0); }
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode Else() { return getToken(epScriptParser.Else, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_ifStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(If);
			setState(195);
			match(OpenParen);
			setState(196);
			expressionSequence();
			setState(197);
			match(CloseParen);
			setState(198);
			statement();
			setState(201);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(199);
				match(Else);
				setState(200);
				statement();
				}
				break;
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

	public static class IterationStatementContext extends ParserRuleContext {
		public TerminalNode While() { return getToken(epScriptParser.While, 0); }
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public List<ExpressionSequenceContext> expressionSequence() {
			return getRuleContexts(ExpressionSequenceContext.class);
		}
		public ExpressionSequenceContext expressionSequence(int i) {
			return getRuleContext(ExpressionSequenceContext.class,i);
		}
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode For() { return getToken(epScriptParser.For, 0); }
		public List<TerminalNode> SemiColon() { return getTokens(epScriptParser.SemiColon); }
		public TerminalNode SemiColon(int i) {
			return getToken(epScriptParser.SemiColon, i);
		}
		public VariableDeclarationListContext variableDeclarationList() {
			return getRuleContext(VariableDeclarationListContext.class,0);
		}
		public TerminalNode Foreach() { return getToken(epScriptParser.Foreach, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode Colon() { return getToken(epScriptParser.Colon, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IterationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_iterationStatement; }
	}

	public final IterationStatementContext iterationStatement() throws RecognitionException {
		IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_iterationStatement);
		int _la;
		try {
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case While:
				enterOuterAlt(_localctx, 1);
				{
				setState(203);
				match(While);
				setState(204);
				match(OpenParen);
				setState(205);
				expressionSequence();
				setState(206);
				match(CloseParen);
				setState(207);
				statement();
				}
				break;
			case For:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(For);
				setState(210);
				match(OpenParen);
				setState(215);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
				case 1:
					{
					setState(211);
					expressionSequence();
					}
					break;
				case 2:
					{
					setState(213);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==Var || _la==Const) {
						{
						setState(212);
						variableDeclarationList();
						}
					}

					}
					break;
				}
				setState(217);
				match(SemiColon);
				setState(219);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(218);
					expressionSequence();
					}
				}

				setState(221);
				match(SemiColon);
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(222);
					expressionSequence();
					}
				}

				setState(225);
				match(CloseParen);
				setState(226);
				statement();
				}
				break;
			case Foreach:
				enterOuterAlt(_localctx, 3);
				{
				setState(227);
				match(Foreach);
				setState(228);
				match(OpenParen);
				setState(229);
				identifier();
				setState(230);
				match(Colon);
				setState(231);
				singleExpression(0);
				setState(232);
				match(CloseParen);
				setState(233);
				statement();
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

	public static class OnceStatementContext extends ParserRuleContext {
		public TerminalNode Once() { return getToken(epScriptParser.Once, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public OnceStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onceStatement; }
	}

	public final OnceStatementContext onceStatement() throws RecognitionException {
		OnceStatementContext _localctx = new OnceStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_onceStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(237);
			match(Once);
			setState(238);
			statement();
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

	public static class ContinueStatementContext extends ParserRuleContext {
		public TerminalNode Continue() { return getToken(epScriptParser.Continue, 0); }
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_continueStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(Continue);
			setState(242);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(241);
				expressionSequence();
				}
			}

			setState(244);
			match(SemiColon);
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

	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode Break() { return getToken(epScriptParser.Break, 0); }
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_breakStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(Break);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(247);
				expressionSequence();
				}
			}

			setState(250);
			match(SemiColon);
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode Return() { return getToken(epScriptParser.Return, 0); }
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(Return);
			setState(254);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(253);
				expressionSequence();
				}
			}

			setState(256);
			match(SemiColon);
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

	public static class SwitchStatementContext extends ParserRuleContext {
		public TerminalNode Switch() { return getToken(epScriptParser.Switch, 0); }
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public CaseBlockContext caseBlock() {
			return getRuleContext(CaseBlockContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_switchStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			match(Switch);
			setState(259);
			match(OpenParen);
			setState(260);
			expressionSequence();
			setState(261);
			match(CloseParen);
			setState(262);
			caseBlock();
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

	public static class CaseBlockContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(epScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(epScriptParser.CloseBrace, 0); }
		public List<CaseClausesContext> caseClauses() {
			return getRuleContexts(CaseClausesContext.class);
		}
		public CaseClausesContext caseClauses(int i) {
			return getRuleContext(CaseClausesContext.class,i);
		}
		public DefaultClauseContext defaultClause() {
			return getRuleContext(DefaultClauseContext.class,0);
		}
		public CaseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseBlock; }
	}

	public final CaseBlockContext caseBlock() throws RecognitionException {
		CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_caseBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(OpenBrace);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Case) {
				{
				setState(265);
				caseClauses();
				}
			}

			setState(272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Default) {
				{
				setState(268);
				defaultClause();
				setState(270);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Case) {
					{
					setState(269);
					caseClauses();
					}
				}

				}
			}

			setState(274);
			match(CloseBrace);
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

	public static class CaseClausesContext extends ParserRuleContext {
		public List<CaseClauseContext> caseClause() {
			return getRuleContexts(CaseClauseContext.class);
		}
		public CaseClauseContext caseClause(int i) {
			return getRuleContext(CaseClauseContext.class,i);
		}
		public CaseClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClauses; }
	}

	public final CaseClausesContext caseClauses() throws RecognitionException {
		CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_caseClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				caseClause();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==Case );
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

	public static class CaseClauseContext extends ParserRuleContext {
		public TerminalNode Case() { return getToken(epScriptParser.Case, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode Colon() { return getToken(epScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public CaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseClause; }
	}

	public final CaseClauseContext caseClause() throws RecognitionException {
		CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_caseClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			match(Case);
			setState(282);
			expressionSequence();
			setState(283);
			match(Colon);
			setState(285);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(284);
				statementList();
				}
				break;
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

	public static class DefaultClauseContext extends ParserRuleContext {
		public TerminalNode Default() { return getToken(epScriptParser.Default, 0); }
		public TerminalNode Colon() { return getToken(epScriptParser.Colon, 0); }
		public StatementListContext statementList() {
			return getRuleContext(StatementListContext.class,0);
		}
		public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultClause; }
	}

	public final DefaultClauseContext defaultClause() throws RecognitionException {
		DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_defaultClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(Default);
			setState(288);
			match(Colon);
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(289);
				statementList();
				}
				break;
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

	public static class ObjectDeclarationContext extends ParserRuleContext {
		public TerminalNode Object() { return getToken(epScriptParser.Object, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ObjectTailContext objectTail() {
			return getRuleContext(ObjectTailContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ObjectDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectDeclaration; }
	}

	public final ObjectDeclarationContext objectDeclaration() throws RecognitionException {
		ObjectDeclarationContext _localctx = new ObjectDeclarationContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_objectDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(Object);
			setState(293);
			identifier();
			setState(294);
			objectTail();
			setState(295);
			match(SemiColon);
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

	public static class ObjectTailContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(epScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(epScriptParser.CloseBrace, 0); }
		public List<ObjectElementContext> objectElement() {
			return getRuleContexts(ObjectElementContext.class);
		}
		public ObjectElementContext objectElement(int i) {
			return getRuleContext(ObjectElementContext.class,i);
		}
		public ObjectTailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectTail; }
	}

	public final ObjectTailContext objectTail() throws RecognitionException {
		ObjectTailContext _localctx = new ObjectTailContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_objectTail);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(297);
			match(OpenBrace);
			setState(301);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Var || _la==Function) {
				{
				{
				setState(298);
				objectElement();
				}
				}
				setState(303);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(304);
			match(CloseBrace);
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

	public static class ObjectElementContext extends ParserRuleContext {
		public ObjectVariableDeclarationContext objectVariableDeclaration() {
			return getRuleContext(ObjectVariableDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public ObjectElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectElement; }
	}

	public final ObjectElementContext objectElement() throws RecognitionException {
		ObjectElementContext _localctx = new ObjectElementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_objectElement);
		try {
			setState(308);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Var:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				objectVariableDeclaration();
				}
				break;
			case Function:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				functionDeclaration();
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

	public static class ObjectVariableDeclarationContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(epScriptParser.Var, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public ObjectVariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectVariableDeclaration; }
	}

	public final ObjectVariableDeclarationContext objectVariableDeclaration() throws RecognitionException {
		ObjectVariableDeclarationContext _localctx = new ObjectVariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_objectVariableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(Var);
			setState(311);
			identifier();
			setState(312);
			match(SemiColon);
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

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(epScriptParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_functionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(Function);
			setState(315);
			identifier();
			setState(316);
			match(OpenParen);
			setState(318);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(317);
				formalParameterList();
				}
			}

			setState(320);
			match(CloseParen);
			setState(321);
			functionBody();
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

	public static class FormalParameterListContext extends ParserRuleContext {
		public List<FormalParameterArgContext> formalParameterArg() {
			return getRuleContexts(FormalParameterArgContext.class);
		}
		public FormalParameterArgContext formalParameterArg(int i) {
			return getRuleContext(FormalParameterArgContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(epScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(epScriptParser.Comma, i);
		}
		public LastFormalParameterArgContext lastFormalParameterArg() {
			return getRuleContext(LastFormalParameterArgContext.class,0);
		}
		public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterList; }
	}

	public final FormalParameterListContext formalParameterList() throws RecognitionException {
		FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_formalParameterList);
		int _la;
		try {
			int _alt;
			setState(336);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(323);
				formalParameterArg();
				setState(328);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(324);
						match(Comma);
						setState(325);
						formalParameterArg();
						}
						} 
					}
					setState(330);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(333);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(331);
					match(Comma);
					setState(332);
					lastFormalParameterArg();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(335);
				lastFormalParameterArg();
				}
				break;
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

	public static class FormalParameterArgContext extends ParserRuleContext {
		public AssignAbleContext assignAble() {
			return getRuleContext(AssignAbleContext.class,0);
		}
		public TerminalNode Assign() { return getToken(epScriptParser.Assign, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_formalParameterArg; }
	}

	public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
		FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_formalParameterArg);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			assignAble();
			setState(341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Assign) {
				{
				setState(339);
				match(Assign);
				setState(340);
				singleExpression(0);
				}
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

	public static class LastFormalParameterArgContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lastFormalParameterArg; }
	}

	public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
		LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_lastFormalParameterArg);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			singleExpression(0);
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

	public static class FunctionBodyContext extends ParserRuleContext {
		public TerminalNode OpenBrace() { return getToken(epScriptParser.OpenBrace, 0); }
		public TerminalNode CloseBrace() { return getToken(epScriptParser.CloseBrace, 0); }
		public SourceElementsContext sourceElements() {
			return getRuleContext(SourceElementsContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_functionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(345);
			match(OpenBrace);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(346);
				sourceElements();
				}
			}

			setState(349);
			match(CloseBrace);
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

	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode Function() { return getToken(epScriptParser.Function, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public TerminalNode SemiColon() { return getToken(epScriptParser.SemiColon, 0); }
		public FormalParameterListContext formalParameterList() {
			return getRuleContext(FormalParameterListContext.class,0);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_functionDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			match(Function);
			setState(352);
			identifier();
			setState(353);
			match(OpenParen);
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(354);
				formalParameterList();
				}
			}

			setState(357);
			match(CloseParen);
			setState(358);
			match(SemiColon);
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

	public static class SourceElementsContext extends ParserRuleContext {
		public List<SourceElementContext> sourceElement() {
			return getRuleContexts(SourceElementContext.class);
		}
		public SourceElementContext sourceElement(int i) {
			return getRuleContext(SourceElementContext.class,i);
		}
		public SourceElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceElements; }
	}

	public final SourceElementsContext sourceElements() throws RecognitionException {
		SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_sourceElements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(361); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(360);
				sourceElement();
				}
				}
				setState(363); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << OpenBrace) | (1L << SemiColon) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0) );
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

	public static class ArrayLiteralContext extends ParserRuleContext {
		public TerminalNode OpenBracket() { return getToken(epScriptParser.OpenBracket, 0); }
		public ElementListContext elementList() {
			return getRuleContext(ElementListContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(epScriptParser.CloseBracket, 0); }
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_arrayLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(365);
			match(OpenBracket);
			setState(366);
			elementList();
			setState(367);
			match(CloseBracket);
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

	public static class ElementListContext extends ParserRuleContext {
		public List<TerminalNode> Comma() { return getTokens(epScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(epScriptParser.Comma, i);
		}
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementList; }
	}

	public final ElementListContext elementList() throws RecognitionException {
		ElementListContext _localctx = new ElementListContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_elementList);
		int _la;
		try {
			int _alt;
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(372);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(369);
						match(Comma);
						}
						} 
					}
					setState(374);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
					{
					setState(375);
					arrayElement();
					}
				}

				setState(386);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(379); 
						_errHandler.sync(this);
						_la = _input.LA(1);
						do {
							{
							{
							setState(378);
							match(Comma);
							}
							}
							setState(381); 
							_errHandler.sync(this);
							_la = _input.LA(1);
						} while ( _la==Comma );
						setState(383);
						arrayElement();
						}
						} 
					}
					setState(388);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Comma) {
					{
					{
					setState(389);
					match(Comma);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
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

	public static class ArrayElementContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(398);
			singleExpression(0);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public ArgumentListContext argumentList() {
			return getRuleContext(ArgumentListContext.class,0);
		}
		public TerminalNode Comma() { return getToken(epScriptParser.Comma, 0); }
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(OpenParen);
			setState(405);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << BooleanLiterl) | (1L << DecimalLiteral) | (1L << HexIntegerLiteral) | (1L << OpenBracket) | (1L << OpenParen) | (1L << PlusPlus) | (1L << MinusMinus) | (1L << BitNot) | (1L << Not) | (1L << Plus) | (1L << Minus) | (1L << UnitName) | (1L << LocName) | (1L << SwitchName) | (1L << MapString) | (1L << StatTxt) | (1L << VArray) | (1L << List) | (1L << Import) | (1L << As) | (1L << Var) | (1L << Const) | (1L << Static) | (1L << Function) | (1L << Object) | (1L << L2V) | (1L << Once) | (1L << If) | (1L << Else))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (For - 64)) | (1L << (Foreach - 64)) | (1L << (While - 64)) | (1L << (Break - 64)) | (1L << (Continue - 64)) | (1L << (Return - 64)) | (1L << (Switch - 64)) | (1L << (Case - 64)) | (1L << (Default - 64)) | (1L << (This - 64)) | (1L << (Identifier - 64)) | (1L << (StringLiteral - 64)))) != 0)) {
				{
				setState(401);
				argumentList();
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==Comma) {
					{
					setState(402);
					match(Comma);
					}
				}

				}
			}

			setState(407);
			match(CloseParen);
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

	public static class ArgumentListContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> Comma() { return getTokens(epScriptParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(epScriptParser.Comma, i);
		}
		public ArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentList; }
	}

	public final ArgumentListContext argumentList() throws RecognitionException {
		ArgumentListContext _localctx = new ArgumentListContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_argumentList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			argument();
			setState(414);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(410);
					match(Comma);
					setState(411);
					argument();
					}
					} 
				}
				setState(416);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,43,_ctx);
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

	public static class ArgumentContext extends ParserRuleContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(epScriptParser.Identifier, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(417);
				singleExpression(0);
				}
				break;
			case 2:
				{
				setState(418);
				match(Identifier);
				}
				break;
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

	public static class SingleExpressionContext extends ParserRuleContext {
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
	 
		public SingleExpressionContext() { }
		public void copyFrom(SingleExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TernaryExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode QuestionMark() { return getToken(epScriptParser.QuestionMark, 0); }
		public TerminalNode Colon() { return getToken(epScriptParser.Colon, 0); }
		public TernaryExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode And() { return getToken(epScriptParser.And, 0); }
		public LogicalAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MultiplicateExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Multiply() { return getToken(epScriptParser.Multiply, 0); }
		public TerminalNode Divide() { return getToken(epScriptParser.Divide, 0); }
		public TerminalNode Modulus() { return getToken(epScriptParser.Modulus, 0); }
		public MultiplicateExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LogicalOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Or() { return getToken(epScriptParser.Or, 0); }
		public LogicalOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class NotExpressionContext extends SingleExpressionContext {
		public TerminalNode Not() { return getToken(epScriptParser.Not, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public NotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreDecreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode MinusMinus() { return getToken(epScriptParser.MinusMinus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ThisExpressionContext extends SingleExpressionContext {
		public TerminalNode This() { return getToken(epScriptParser.This, 0); }
		public ThisExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryMinusExpressionContext extends SingleExpressionContext {
		public TerminalNode Minus() { return getToken(epScriptParser.Minus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryMinusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostDecreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode MinusMinus() { return getToken(epScriptParser.MinusMinus, 0); }
		public PostDecreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class AddictiveExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Plus() { return getToken(epScriptParser.Plus, 0); }
		public TerminalNode Minus() { return getToken(epScriptParser.Minus, 0); }
		public AddictiveExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class UnaryPlusExpressionContext extends SingleExpressionContext {
		public TerminalNode Plus() { return getToken(epScriptParser.Plus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public UnaryPlusExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PreIncreaseExpressionContext extends SingleExpressionContext {
		public TerminalNode PlusPlus() { return getToken(epScriptParser.PlusPlus, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public PreIncreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class EqualityExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode Equals() { return getToken(epScriptParser.Equals, 0); }
		public TerminalNode NotEquals() { return getToken(epScriptParser.NotEquals, 0); }
		public EqualityExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitXOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitXOr() { return getToken(epScriptParser.BitXOr, 0); }
		public BitXOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArgumentExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public ArgumentExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitShiftExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LeftShiftArithmetic() { return getToken(epScriptParser.LeftShiftArithmetic, 0); }
		public TerminalNode RightShiftArithmetic() { return getToken(epScriptParser.RightShiftArithmetic, 0); }
		public BitShiftExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class RelationalExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode LessThan() { return getToken(epScriptParser.LessThan, 0); }
		public TerminalNode MoreThan() { return getToken(epScriptParser.MoreThan, 0); }
		public TerminalNode LessThanEquals() { return getToken(epScriptParser.LessThanEquals, 0); }
		public TerminalNode GreaterThanEquals() { return getToken(epScriptParser.GreaterThanEquals, 0); }
		public RelationalExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitNotExpressionContext extends SingleExpressionContext {
		public TerminalNode BitNot() { return getToken(epScriptParser.BitNot, 0); }
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public BitNotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class LiteralExpressionContext extends SingleExpressionContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public ArrayLiteralExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberDotExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode Dot() { return getToken(epScriptParser.Dot, 0); }
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public MemberDotExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class PostIncreaseExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode PlusPlus() { return getToken(epScriptParser.PlusPlus, 0); }
		public PostIncreaseExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class IdentifierExpressionContext extends SingleExpressionContext {
		public IdentifierNameContext identifierName() {
			return getRuleContext(IdentifierNameContext.class,0);
		}
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public IdentifierExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class MemberExpressionContext extends SingleExpressionContext {
		public SingleExpressionContext singleExpression() {
			return getRuleContext(SingleExpressionContext.class,0);
		}
		public TerminalNode OpenBracket() { return getToken(epScriptParser.OpenBracket, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseBracket() { return getToken(epScriptParser.CloseBracket, 0); }
		public MemberExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitAndExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitAnd() { return getToken(epScriptParser.BitAnd, 0); }
		public BitAndExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class ParanthesizedExpressionContext extends SingleExpressionContext {
		public TerminalNode OpenParen() { return getToken(epScriptParser.OpenParen, 0); }
		public ExpressionSequenceContext expressionSequence() {
			return getRuleContext(ExpressionSequenceContext.class,0);
		}
		public TerminalNode CloseParen() { return getToken(epScriptParser.CloseParen, 0); }
		public ParanthesizedExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class BitOrExpressionContext extends SingleExpressionContext {
		public List<SingleExpressionContext> singleExpression() {
			return getRuleContexts(SingleExpressionContext.class);
		}
		public SingleExpressionContext singleExpression(int i) {
			return getRuleContext(SingleExpressionContext.class,i);
		}
		public TerminalNode BitOr() { return getToken(epScriptParser.BitOr, 0); }
		public BitOrExpressionContext(SingleExpressionContext ctx) { copyFrom(ctx); }
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		return singleExpression(0);
	}

	private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
		SingleExpressionContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_singleExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PlusPlus:
				{
				_localctx = new PreIncreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(422);
				match(PlusPlus);
				setState(423);
				singleExpression(21);
				}
				break;
			case MinusMinus:
				{
				_localctx = new PreDecreaseExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(424);
				match(MinusMinus);
				setState(425);
				singleExpression(20);
				}
				break;
			case Plus:
				{
				_localctx = new UnaryPlusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(426);
				match(Plus);
				setState(427);
				singleExpression(19);
				}
				break;
			case Minus:
				{
				_localctx = new UnaryMinusExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(428);
				match(Minus);
				setState(429);
				singleExpression(18);
				}
				break;
			case BitNot:
				{
				_localctx = new BitNotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(430);
				match(BitNot);
				setState(431);
				singleExpression(17);
				}
				break;
			case Not:
				{
				_localctx = new NotExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(432);
				match(Not);
				setState(433);
				singleExpression(16);
				}
				break;
			case This:
				{
				_localctx = new ThisExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(434);
				match(This);
				}
				break;
			case UnitName:
			case LocName:
			case SwitchName:
			case MapString:
			case StatTxt:
			case VArray:
			case List:
			case Import:
			case As:
			case Var:
			case Const:
			case Static:
			case Function:
			case Object:
			case L2V:
			case Once:
			case If:
			case Else:
			case For:
			case Foreach:
			case While:
			case Break:
			case Continue:
			case Return:
			case Switch:
			case Case:
			case Default:
			case Identifier:
				{
				_localctx = new IdentifierExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(435);
				identifierName();
				setState(437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(436);
					singleExpression(0);
					}
					break;
				}
				}
				break;
			case BooleanLiterl:
			case DecimalLiteral:
			case HexIntegerLiteral:
			case StringLiteral:
				{
				_localctx = new LiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				literal();
				}
				break;
			case OpenBracket:
				{
				_localctx = new ArrayLiteralExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(440);
				arrayLiteral();
				}
				break;
			case OpenParen:
				{
				_localctx = new ParanthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(441);
				match(OpenParen);
				setState(442);
				expressionSequence();
				setState(443);
				match(CloseParen);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(499);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(497);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
					case 1:
						{
						_localctx = new TernaryExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(447);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(448);
						match(QuestionMark);
						setState(449);
						singleExpression(0);
						setState(450);
						match(Colon);
						setState(451);
						singleExpression(25);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicateExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(453);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(454);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Multiply) | (1L << Divide) | (1L << Modulus))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(455);
						singleExpression(16);
						}
						break;
					case 3:
						{
						_localctx = new AddictiveExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(456);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(457);
						_la = _input.LA(1);
						if ( !(_la==Plus || _la==Minus) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(458);
						singleExpression(15);
						}
						break;
					case 4:
						{
						_localctx = new BitShiftExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(459);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(460);
						_la = _input.LA(1);
						if ( !(_la==LeftShiftArithmetic || _la==RightShiftArithmetic) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(461);
						singleExpression(14);
						}
						break;
					case 5:
						{
						_localctx = new RelationalExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(462);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(463);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LessThanEquals) | (1L << GreaterThanEquals) | (1L << LessThan) | (1L << MoreThan))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(464);
						singleExpression(13);
						}
						break;
					case 6:
						{
						_localctx = new EqualityExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(465);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(466);
						_la = _input.LA(1);
						if ( !(_la==Equals || _la==NotEquals) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(467);
						singleExpression(12);
						}
						break;
					case 7:
						{
						_localctx = new BitAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(468);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(469);
						match(BitAnd);
						setState(470);
						singleExpression(11);
						}
						break;
					case 8:
						{
						_localctx = new BitXOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(471);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(472);
						match(BitXOr);
						setState(473);
						singleExpression(10);
						}
						break;
					case 9:
						{
						_localctx = new BitOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(474);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(475);
						match(BitOr);
						setState(476);
						singleExpression(9);
						}
						break;
					case 10:
						{
						_localctx = new LogicalAndExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(477);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(478);
						match(And);
						setState(479);
						singleExpression(8);
						}
						break;
					case 11:
						{
						_localctx = new LogicalOrExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(480);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(481);
						match(Or);
						setState(482);
						singleExpression(7);
						}
						break;
					case 12:
						{
						_localctx = new MemberExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(483);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(484);
						match(OpenBracket);
						setState(485);
						expressionSequence();
						setState(486);
						match(CloseBracket);
						}
						break;
					case 13:
						{
						_localctx = new MemberDotExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(488);
						if (!(precpred(_ctx, 26))) throw new FailedPredicateException(this, "precpred(_ctx, 26)");
						setState(489);
						match(Dot);
						setState(490);
						identifierName();
						}
						break;
					case 14:
						{
						_localctx = new ArgumentExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(491);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(492);
						arguments();
						}
						break;
					case 15:
						{
						_localctx = new PostIncreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(493);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(494);
						match(PlusPlus);
						}
						break;
					case 16:
						{
						_localctx = new PostDecreaseExpressionContext(new SingleExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
						setState(495);
						if (!(precpred(_ctx, 22))) throw new FailedPredicateException(this, "precpred(_ctx, 22)");
						setState(496);
						match(MinusMinus);
						}
						break;
					}
					} 
				}
				setState(501);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,48,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode MultiplyAssign() { return getToken(epScriptParser.MultiplyAssign, 0); }
		public TerminalNode PlusAssign() { return getToken(epScriptParser.PlusAssign, 0); }
		public TerminalNode BitOrAssign() { return getToken(epScriptParser.BitOrAssign, 0); }
		public TerminalNode MinusAssign() { return getToken(epScriptParser.MinusAssign, 0); }
		public TerminalNode BitAndAssign() { return getToken(epScriptParser.BitAndAssign, 0); }
		public TerminalNode BitXorAssign() { return getToken(epScriptParser.BitXorAssign, 0); }
		public TerminalNode LeftShiftArithmeticAssign() { return getToken(epScriptParser.LeftShiftArithmeticAssign, 0); }
		public TerminalNode RightShiftArithmeticAssign() { return getToken(epScriptParser.RightShiftArithmeticAssign, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PlusAssign) | (1L << MinusAssign) | (1L << MultiplyAssign) | (1L << LeftShiftArithmeticAssign) | (1L << RightShiftArithmeticAssign) | (1L << BitAndAssign) | (1L << BitXorAssign) | (1L << BitOrAssign))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiterl() { return getToken(epScriptParser.BooleanLiterl, 0); }
		public TerminalNode StringLiteral() { return getToken(epScriptParser.StringLiteral, 0); }
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_literal);
		try {
			setState(507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BooleanLiterl:
				enterOuterAlt(_localctx, 1);
				{
				setState(504);
				match(BooleanLiterl);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(505);
				match(StringLiteral);
				}
				break;
			case DecimalLiteral:
			case HexIntegerLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(506);
				numericLiteral();
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

	public static class NumericLiteralContext extends ParserRuleContext {
		public TerminalNode DecimalLiteral() { return getToken(epScriptParser.DecimalLiteral, 0); }
		public TerminalNode HexIntegerLiteral() { return getToken(epScriptParser.HexIntegerLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_numericLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(509);
			_la = _input.LA(1);
			if ( !(_la==DecimalLiteral || _la==HexIntegerLiteral) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class IdentifierNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ReservedWordContext reservedWord() {
			return getRuleContext(ReservedWordContext.class,0);
		}
		public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierName; }
	}

	public final IdentifierNameContext identifierName() throws RecognitionException {
		IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_identifierName);
		try {
			setState(513);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(511);
				identifier();
				}
				break;
			case UnitName:
			case LocName:
			case SwitchName:
			case MapString:
			case StatTxt:
			case VArray:
			case List:
			case Import:
			case As:
			case Var:
			case Const:
			case Static:
			case Function:
			case Object:
			case L2V:
			case Once:
			case If:
			case Else:
			case For:
			case Foreach:
			case While:
			case Break:
			case Continue:
			case Return:
			case Switch:
			case Case:
			case Default:
				enterOuterAlt(_localctx, 2);
				{
				setState(512);
				reservedWord();
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

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(epScriptParser.Identifier, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_identifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(515);
			match(Identifier);
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

	public static class ReservedWordContext extends ParserRuleContext {
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ReservedWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reservedWord; }
	}

	public final ReservedWordContext reservedWord() throws RecognitionException {
		ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_reservedWord);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(517);
			keyword();
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

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode UnitName() { return getToken(epScriptParser.UnitName, 0); }
		public TerminalNode LocName() { return getToken(epScriptParser.LocName, 0); }
		public TerminalNode SwitchName() { return getToken(epScriptParser.SwitchName, 0); }
		public TerminalNode MapString() { return getToken(epScriptParser.MapString, 0); }
		public TerminalNode StatTxt() { return getToken(epScriptParser.StatTxt, 0); }
		public TerminalNode VArray() { return getToken(epScriptParser.VArray, 0); }
		public TerminalNode List() { return getToken(epScriptParser.List, 0); }
		public TerminalNode Import() { return getToken(epScriptParser.Import, 0); }
		public TerminalNode As() { return getToken(epScriptParser.As, 0); }
		public TerminalNode Var() { return getToken(epScriptParser.Var, 0); }
		public TerminalNode Const() { return getToken(epScriptParser.Const, 0); }
		public TerminalNode Static() { return getToken(epScriptParser.Static, 0); }
		public TerminalNode Function() { return getToken(epScriptParser.Function, 0); }
		public TerminalNode Object() { return getToken(epScriptParser.Object, 0); }
		public TerminalNode L2V() { return getToken(epScriptParser.L2V, 0); }
		public TerminalNode Once() { return getToken(epScriptParser.Once, 0); }
		public TerminalNode If() { return getToken(epScriptParser.If, 0); }
		public TerminalNode Else() { return getToken(epScriptParser.Else, 0); }
		public TerminalNode For() { return getToken(epScriptParser.For, 0); }
		public TerminalNode Foreach() { return getToken(epScriptParser.Foreach, 0); }
		public TerminalNode While() { return getToken(epScriptParser.While, 0); }
		public TerminalNode Break() { return getToken(epScriptParser.Break, 0); }
		public TerminalNode Continue() { return getToken(epScriptParser.Continue, 0); }
		public TerminalNode Return() { return getToken(epScriptParser.Return, 0); }
		public TerminalNode Switch() { return getToken(epScriptParser.Switch, 0); }
		public TerminalNode Case() { return getToken(epScriptParser.Case, 0); }
		public TerminalNode Default() { return getToken(epScriptParser.Default, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(519);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (UnitName - 46)) | (1L << (LocName - 46)) | (1L << (SwitchName - 46)) | (1L << (MapString - 46)) | (1L << (StatTxt - 46)) | (1L << (VArray - 46)) | (1L << (List - 46)) | (1L << (Import - 46)) | (1L << (As - 46)) | (1L << (Var - 46)) | (1L << (Const - 46)) | (1L << (Static - 46)) | (1L << (Function - 46)) | (1L << (Object - 46)) | (1L << (L2V - 46)) | (1L << (Once - 46)) | (1L << (If - 46)) | (1L << (Else - 46)) | (1L << (For - 46)) | (1L << (Foreach - 46)) | (1L << (While - 46)) | (1L << (Break - 46)) | (1L << (Continue - 46)) | (1L << (Return - 46)) | (1L << (Switch - 46)) | (1L << (Case - 46)) | (1L << (Default - 46)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 6:
			return dottedName_sempred((DottedNameContext)_localctx, predIndex);
		case 44:
			return singleExpression_sempred((SingleExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean dottedName_sempred(DottedNameContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 24);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 13);
		case 5:
			return precpred(_ctx, 12);
		case 6:
			return precpred(_ctx, 11);
		case 7:
			return precpred(_ctx, 10);
		case 8:
			return precpred(_ctx, 9);
		case 9:
			return precpred(_ctx, 8);
		case 10:
			return precpred(_ctx, 7);
		case 11:
			return precpred(_ctx, 6);
		case 12:
			return precpred(_ctx, 27);
		case 13:
			return precpred(_ctx, 26);
		case 14:
			return precpred(_ctx, 25);
		case 15:
			return precpred(_ctx, 23);
		case 16:
			return precpred(_ctx, 22);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3T\u020c\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\3\2\5\2l\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\177\n\4\3\5\3\5\5\5\u0083\n\5\3\5\3\5\3\6"+
		"\6\6\u0088\n\6\r\6\16\6\u0089\3\7\3\7\3\7\5\7\u008f\n\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\7\b\u0099\n\b\f\b\16\b\u009c\13\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\13\3\13\7\13\u00a8\n\13\f\13\16\13\u00ab\13\13\3\f"+
		"\3\f\3\f\5\f\u00b0\n\f\3\r\3\r\3\16\3\16\5\16\u00b6\n\16\3\17\3\17\3\17"+
		"\7\17\u00bb\n\17\f\17\16\17\u00be\13\17\3\20\3\20\3\20\3\21\3\21\3\22"+
		"\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00cc\n\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\5\23\u00d8\n\23\5\23\u00da\n\23\3\23\3\23\5"+
		"\23\u00de\n\23\3\23\3\23\5\23\u00e2\n\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\23\5\23\u00ee\n\23\3\24\3\24\3\24\3\25\3\25\5\25\u00f5"+
		"\n\25\3\25\3\25\3\26\3\26\5\26\u00fb\n\26\3\26\3\26\3\27\3\27\5\27\u0101"+
		"\n\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\5\31\u010d\n\31"+
		"\3\31\3\31\5\31\u0111\n\31\5\31\u0113\n\31\3\31\3\31\3\32\6\32\u0118\n"+
		"\32\r\32\16\32\u0119\3\33\3\33\3\33\3\33\5\33\u0120\n\33\3\34\3\34\3\34"+
		"\5\34\u0125\n\34\3\35\3\35\3\35\3\35\3\35\3\36\3\36\7\36\u012e\n\36\f"+
		"\36\16\36\u0131\13\36\3\36\3\36\3\37\3\37\5\37\u0137\n\37\3 \3 \3 \3 "+
		"\3!\3!\3!\3!\5!\u0141\n!\3!\3!\3!\3\"\3\"\3\"\7\"\u0149\n\"\f\"\16\"\u014c"+
		"\13\"\3\"\3\"\5\"\u0150\n\"\3\"\5\"\u0153\n\"\3#\3#\3#\5#\u0158\n#\3$"+
		"\3$\3%\3%\5%\u015e\n%\3%\3%\3&\3&\3&\3&\5&\u0166\n&\3&\3&\3&\3\'\6\'\u016c"+
		"\n\'\r\'\16\'\u016d\3(\3(\3(\3(\3)\7)\u0175\n)\f)\16)\u0178\13)\3)\5)"+
		"\u017b\n)\3)\6)\u017e\n)\r)\16)\u017f\3)\7)\u0183\n)\f)\16)\u0186\13)"+
		"\3)\7)\u0189\n)\f)\16)\u018c\13)\3)\5)\u018f\n)\3*\3*\3+\3+\3+\5+\u0196"+
		"\n+\5+\u0198\n+\3+\3+\3,\3,\3,\7,\u019f\n,\f,\16,\u01a2\13,\3-\3-\5-\u01a6"+
		"\n-\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u01b8\n.\3.\3."+
		"\3.\3.\3.\3.\5.\u01c0\n.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\7.\u01f4\n.\f.\16.\u01f7\13.\3/\3"+
		"/\3\60\3\60\3\60\5\60\u01fe\n\60\3\61\3\61\3\62\3\62\5\62\u0204\n\62\3"+
		"\63\3\63\3\64\3\64\3\65\3\65\3\65\2\4\16Z\66\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfh\2\13\3\29"+
		":\3\2,.\3\2*+\3\2\35\36\3\2$\'\4\2##((\3\2\23\32\3\2\4\5\3\2\60J\2\u022e"+
		"\2k\3\2\2\2\4o\3\2\2\2\6~\3\2\2\2\b\u0080\3\2\2\2\n\u0087\3\2\2\2\f\u008b"+
		"\3\2\2\2\16\u0092\3\2\2\2\20\u009d\3\2\2\2\22\u00a0\3\2\2\2\24\u00a3\3"+
		"\2\2\2\26\u00ac\3\2\2\2\30\u00b1\3\2\2\2\32\u00b5\3\2\2\2\34\u00b7\3\2"+
		"\2\2\36\u00bf\3\2\2\2 \u00c2\3\2\2\2\"\u00c4\3\2\2\2$\u00ed\3\2\2\2&\u00ef"+
		"\3\2\2\2(\u00f2\3\2\2\2*\u00f8\3\2\2\2,\u00fe\3\2\2\2.\u0104\3\2\2\2\60"+
		"\u010a\3\2\2\2\62\u0117\3\2\2\2\64\u011b\3\2\2\2\66\u0121\3\2\2\28\u0126"+
		"\3\2\2\2:\u012b\3\2\2\2<\u0136\3\2\2\2>\u0138\3\2\2\2@\u013c\3\2\2\2B"+
		"\u0152\3\2\2\2D\u0154\3\2\2\2F\u0159\3\2\2\2H\u015b\3\2\2\2J\u0161\3\2"+
		"\2\2L\u016b\3\2\2\2N\u016f\3\2\2\2P\u018e\3\2\2\2R\u0190\3\2\2\2T\u0192"+
		"\3\2\2\2V\u019b\3\2\2\2X\u01a5\3\2\2\2Z\u01bf\3\2\2\2\\\u01f8\3\2\2\2"+
		"^\u01fd\3\2\2\2`\u01ff\3\2\2\2b\u0203\3\2\2\2d\u0205\3\2\2\2f\u0207\3"+
		"\2\2\2h\u0209\3\2\2\2jl\5L\'\2kj\3\2\2\2kl\3\2\2\2lm\3\2\2\2mn\7\2\2\3"+
		"n\3\3\2\2\2op\5\6\4\2p\5\3\2\2\2q\177\5\b\5\2r\177\5\f\7\2s\177\5\22\n"+
		"\2t\177\5\"\22\2u\177\5$\23\2v\177\5\36\20\2w\177\5&\24\2x\177\5(\25\2"+
		"y\177\5*\26\2z\177\5,\27\2{\177\58\35\2|\177\5@!\2}\177\5\30\r\2~q\3\2"+
		"\2\2~r\3\2\2\2~s\3\2\2\2~t\3\2\2\2~u\3\2\2\2~v\3\2\2\2~w\3\2\2\2~x\3\2"+
		"\2\2~y\3\2\2\2~z\3\2\2\2~{\3\2\2\2~|\3\2\2\2~}\3\2\2\2\177\7\3\2\2\2\u0080"+
		"\u0082\7\n\2\2\u0081\u0083\5\n\6\2\u0082\u0081\3\2\2\2\u0082\u0083\3\2"+
		"\2\2\u0083\u0084\3\2\2\2\u0084\u0085\7\13\2\2\u0085\t\3\2\2\2\u0086\u0088"+
		"\5\6\4\2\u0087\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u0087\3\2\2\2\u0089"+
		"\u008a\3\2\2\2\u008a\13\3\2\2\2\u008b\u008c\7\67\2\2\u008c\u008e\5\16"+
		"\b\2\u008d\u008f\5\20\t\2\u008e\u008d\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0090\3\2\2\2\u0090\u0091\7\20\2\2\u0091\r\3\2\2\2\u0092\u0093\b\b\1"+
		"\2\u0093\u0094\5b\62\2\u0094\u009a\3\2\2\2\u0095\u0096\f\4\2\2\u0096\u0097"+
		"\7\f\2\2\u0097\u0099\5b\62\2\u0098\u0095\3\2\2\2\u0099\u009c\3\2\2\2\u009a"+
		"\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\17\3\2\2\2\u009c\u009a\3\2\2"+
		"\2\u009d\u009e\78\2\2\u009e\u009f\5b\62\2\u009f\21\3\2\2\2\u00a0\u00a1"+
		"\5\24\13\2\u00a1\u00a2\7\20\2\2\u00a2\23\3\2\2\2\u00a3\u00a4\5 \21\2\u00a4"+
		"\u00a9\5\26\f\2\u00a5\u00a6\7\16\2\2\u00a6\u00a8\5\26\f\2\u00a7\u00a5"+
		"\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\25\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00af\5\32\16\2\u00ad\u00ae\7/\2"+
		"\2\u00ae\u00b0\5Z.\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\27"+
		"\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\31\3\2\2\2\u00b3\u00b6\5d\63\2\u00b4"+
		"\u00b6\5N(\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\33\3\2\2\2"+
		"\u00b7\u00bc\5Z.\2\u00b8\u00b9\7\16\2\2\u00b9\u00bb\5Z.\2\u00ba\u00b8"+
		"\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd"+
		"\35\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\5\34\17\2\u00c0\u00c1\7\20"+
		"\2\2\u00c1\37\3\2\2\2\u00c2\u00c3\t\2\2\2\u00c3!\3\2\2\2\u00c4\u00c5\7"+
		"@\2\2\u00c5\u00c6\7\b\2\2\u00c6\u00c7\5\34\17\2\u00c7\u00c8\7\t\2\2\u00c8"+
		"\u00cb\5\6\4\2\u00c9\u00ca\7A\2\2\u00ca\u00cc\5\6\4\2\u00cb\u00c9\3\2"+
		"\2\2\u00cb\u00cc\3\2\2\2\u00cc#\3\2\2\2\u00cd\u00ce\7D\2\2\u00ce\u00cf"+
		"\7\b\2\2\u00cf\u00d0\5\34\17\2\u00d0\u00d1\7\t\2\2\u00d1\u00d2\5\6\4\2"+
		"\u00d2\u00ee\3\2\2\2\u00d3\u00d4\7B\2\2\u00d4\u00d9\7\b\2\2\u00d5\u00da"+
		"\5\34\17\2\u00d6\u00d8\5\24\13\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2"+
		"\2\u00d8\u00da\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00db"+
		"\3\2\2\2\u00db\u00dd\7\20\2\2\u00dc\u00de\5\34\17\2\u00dd\u00dc\3\2\2"+
		"\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\20\2\2\u00e0"+
		"\u00e2\5\34\17\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e3\3"+
		"\2\2\2\u00e3\u00e4\7\t\2\2\u00e4\u00ee\5\6\4\2\u00e5\u00e6\7C\2\2\u00e6"+
		"\u00e7\7\b\2\2\u00e7\u00e8\5d\63\2\u00e8\u00e9\7\17\2\2\u00e9\u00ea\5"+
		"Z.\2\u00ea\u00eb\7\t\2\2\u00eb\u00ec\5\6\4\2\u00ec\u00ee\3\2\2\2\u00ed"+
		"\u00cd\3\2\2\2\u00ed\u00d3\3\2\2\2\u00ed\u00e5\3\2\2\2\u00ee%\3\2\2\2"+
		"\u00ef\u00f0\7?\2\2\u00f0\u00f1\5\6\4\2\u00f1\'\3\2\2\2\u00f2\u00f4\7"+
		"F\2\2\u00f3\u00f5\5\34\17\2\u00f4\u00f3\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\7\20\2\2\u00f7)\3\2\2\2\u00f8\u00fa\7E\2\2"+
		"\u00f9\u00fb\5\34\17\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc"+
		"\3\2\2\2\u00fc\u00fd\7\20\2\2\u00fd+\3\2\2\2\u00fe\u0100\7G\2\2\u00ff"+
		"\u0101\5\34\17\2\u0100\u00ff\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0102\3"+
		"\2\2\2\u0102\u0103\7\20\2\2\u0103-\3\2\2\2\u0104\u0105\7H\2\2\u0105\u0106"+
		"\7\b\2\2\u0106\u0107\5\34\17\2\u0107\u0108\7\t\2\2\u0108\u0109\5\60\31"+
		"\2\u0109/\3\2\2\2\u010a\u010c\7\n\2\2\u010b\u010d\5\62\32\2\u010c\u010b"+
		"\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u0112\3\2\2\2\u010e\u0110\5\66\34\2"+
		"\u010f\u0111\5\62\32\2\u0110\u010f\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113"+
		"\3\2\2\2\u0112\u010e\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0114\3\2\2\2\u0114"+
		"\u0115\7\13\2\2\u0115\61\3\2\2\2\u0116\u0118\5\64\33\2\u0117\u0116\3\2"+
		"\2\2\u0118\u0119\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\63\3\2\2\2\u011b\u011c\7I\2\2\u011c\u011d\5\34\17\2\u011d\u011f\7\17"+
		"\2\2\u011e\u0120\5\n\6\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120"+
		"\65\3\2\2\2\u0121\u0122\7J\2\2\u0122\u0124\7\17\2\2\u0123\u0125\5\n\6"+
		"\2\u0124\u0123\3\2\2\2\u0124\u0125\3\2\2\2\u0125\67\3\2\2\2\u0126\u0127"+
		"\7=\2\2\u0127\u0128\5d\63\2\u0128\u0129\5:\36\2\u0129\u012a\7\20\2\2\u012a"+
		"9\3\2\2\2\u012b\u012f\7\n\2\2\u012c\u012e\5<\37\2\u012d\u012c\3\2\2\2"+
		"\u012e\u0131\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u0130\3\2\2\2\u0130\u0132"+
		"\3\2\2\2\u0131\u012f\3\2\2\2\u0132\u0133\7\13\2\2\u0133;\3\2\2\2\u0134"+
		"\u0137\5> \2\u0135\u0137\5@!\2\u0136\u0134\3\2\2\2\u0136\u0135\3\2\2\2"+
		"\u0137=\3\2\2\2\u0138\u0139\79\2\2\u0139\u013a\5d\63\2\u013a\u013b\7\20"+
		"\2\2\u013b?\3\2\2\2\u013c\u013d\7<\2\2\u013d\u013e\5d\63\2\u013e\u0140"+
		"\7\b\2\2\u013f\u0141\5B\"\2\u0140\u013f\3\2\2\2\u0140\u0141\3\2\2\2\u0141"+
		"\u0142\3\2\2\2\u0142\u0143\7\t\2\2\u0143\u0144\5H%\2\u0144A\3\2\2\2\u0145"+
		"\u014a\5D#\2\u0146\u0147\7\16\2\2\u0147\u0149\5D#\2\u0148\u0146\3\2\2"+
		"\2\u0149\u014c\3\2\2\2\u014a\u0148\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014f"+
		"\3\2\2\2\u014c\u014a\3\2\2\2\u014d\u014e\7\16\2\2\u014e\u0150\5F$\2\u014f"+
		"\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150\u0153\3\2\2\2\u0151\u0153\5F"+
		"$\2\u0152\u0145\3\2\2\2\u0152\u0151\3\2\2\2\u0153C\3\2\2\2\u0154\u0157"+
		"\5\32\16\2\u0155\u0156\7/\2\2\u0156\u0158\5Z.\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0158\3\2\2\2\u0158E\3\2\2\2\u0159\u015a\5Z.\2\u015aG\3\2\2\2\u015b\u015d"+
		"\7\n\2\2\u015c\u015e\5L\'\2\u015d\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e"+
		"\u015f\3\2\2\2\u015f\u0160\7\13\2\2\u0160I\3\2\2\2\u0161\u0162\7<\2\2"+
		"\u0162\u0163\5d\63\2\u0163\u0165\7\b\2\2\u0164\u0166\5B\"\2\u0165\u0164"+
		"\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\7\t\2\2\u0168"+
		"\u0169\7\20\2\2\u0169K\3\2\2\2\u016a\u016c\5\4\3\2\u016b\u016a\3\2\2\2"+
		"\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016eM\3"+
		"\2\2\2\u016f\u0170\7\6\2\2\u0170\u0171\5P)\2\u0171\u0172\7\7\2\2\u0172"+
		"O\3\2\2\2\u0173\u0175\7\16\2\2\u0174\u0173\3\2\2\2\u0175\u0178\3\2\2\2"+
		"\u0176\u0174\3\2\2\2\u0176\u0177\3\2\2\2\u0177\u017a\3\2\2\2\u0178\u0176"+
		"\3\2\2\2\u0179\u017b\5R*\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u0184\3\2\2\2\u017c\u017e\7\16\2\2\u017d\u017c\3\2\2\2\u017e\u017f\3"+
		"\2\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u0183\5R*\2\u0182\u017d\3\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2"+
		"\2\u0184\u0185\3\2\2\2\u0185\u018a\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189"+
		"\7\16\2\2\u0188\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2"+
		"\u018a\u018b\3\2\2\2\u018b\u018f\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018f"+
		"\3\2\2\2\u018e\u0176\3\2\2\2\u018e\u018d\3\2\2\2\u018fQ\3\2\2\2\u0190"+
		"\u0191\5Z.\2\u0191S\3\2\2\2\u0192\u0197\7\b\2\2\u0193\u0195\5V,\2\u0194"+
		"\u0196\7\16\2\2\u0195\u0194\3\2\2\2\u0195\u0196\3\2\2\2\u0196\u0198\3"+
		"\2\2\2\u0197\u0193\3\2\2\2\u0197\u0198\3\2\2\2\u0198\u0199\3\2\2\2\u0199"+
		"\u019a\7\t\2\2\u019aU\3\2\2\2\u019b\u01a0\5X-\2\u019c\u019d\7\16\2\2\u019d"+
		"\u019f\5X-\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2"+
		"\2\u01a0\u01a1\3\2\2\2\u01a1W\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a6"+
		"\5Z.\2\u01a4\u01a6\7L\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a4\3\2\2\2\u01a6"+
		"Y\3\2\2\2\u01a7\u01a8\b.\1\2\u01a8\u01a9\7\21\2\2\u01a9\u01c0\5Z.\27\u01aa"+
		"\u01ab\7\22\2\2\u01ab\u01c0\5Z.\26\u01ac\u01ad\7*\2\2\u01ad\u01c0\5Z."+
		"\25\u01ae\u01af\7+\2\2\u01af\u01c0\5Z.\24\u01b0\u01b1\7\37\2\2\u01b1\u01c0"+
		"\5Z.\23\u01b2\u01b3\7)\2\2\u01b3\u01c0\5Z.\22\u01b4\u01c0\7K\2\2\u01b5"+
		"\u01b7\5b\62\2\u01b6\u01b8\5Z.\2\u01b7\u01b6\3\2\2\2\u01b7\u01b8\3\2\2"+
		"\2\u01b8\u01c0\3\2\2\2\u01b9\u01c0\5^\60\2\u01ba\u01c0\5N(\2\u01bb\u01bc"+
		"\7\b\2\2\u01bc\u01bd\5\34\17\2\u01bd\u01be\7\t\2\2\u01be\u01c0\3\2\2\2"+
		"\u01bf\u01a7\3\2\2\2\u01bf\u01aa\3\2\2\2\u01bf\u01ac\3\2\2\2\u01bf\u01ae"+
		"\3\2\2\2\u01bf\u01b0\3\2\2\2\u01bf\u01b2\3\2\2\2\u01bf\u01b4\3\2\2\2\u01bf"+
		"\u01b5\3\2\2\2\u01bf\u01b9\3\2\2\2\u01bf\u01ba\3\2\2\2\u01bf\u01bb\3\2"+
		"\2\2\u01c0\u01f5\3\2\2\2\u01c1\u01c2\f\32\2\2\u01c2\u01c3\7\r\2\2\u01c3"+
		"\u01c4\5Z.\2\u01c4\u01c5\7\17\2\2\u01c5\u01c6\5Z.\33\u01c6\u01f4\3\2\2"+
		"\2\u01c7\u01c8\f\21\2\2\u01c8\u01c9\t\3\2\2\u01c9\u01f4\5Z.\22\u01ca\u01cb"+
		"\f\20\2\2\u01cb\u01cc\t\4\2\2\u01cc\u01f4\5Z.\21\u01cd\u01ce\f\17\2\2"+
		"\u01ce\u01cf\t\5\2\2\u01cf\u01f4\5Z.\20\u01d0\u01d1\f\16\2\2\u01d1\u01d2"+
		"\t\6\2\2\u01d2\u01f4\5Z.\17\u01d3\u01d4\f\r\2\2\u01d4\u01d5\t\7\2\2\u01d5"+
		"\u01f4\5Z.\16\u01d6\u01d7\f\f\2\2\u01d7\u01d8\7 \2\2\u01d8\u01f4\5Z.\r"+
		"\u01d9\u01da\f\13\2\2\u01da\u01db\7\"\2\2\u01db\u01f4\5Z.\f\u01dc\u01dd"+
		"\f\n\2\2\u01dd\u01de\7!\2\2\u01de\u01f4\5Z.\13\u01df\u01e0\f\t\2\2\u01e0"+
		"\u01e1\7\33\2\2\u01e1\u01f4\5Z.\n\u01e2\u01e3\f\b\2\2\u01e3\u01e4\7\34"+
		"\2\2\u01e4\u01f4\5Z.\t\u01e5\u01e6\f\35\2\2\u01e6\u01e7\7\6\2\2\u01e7"+
		"\u01e8\5\34\17\2\u01e8\u01e9\7\7\2\2\u01e9\u01f4\3\2\2\2\u01ea\u01eb\f"+
		"\34\2\2\u01eb\u01ec\7\f\2\2\u01ec\u01f4\5b\62\2\u01ed\u01ee\f\33\2\2\u01ee"+
		"\u01f4\5T+\2\u01ef\u01f0\f\31\2\2\u01f0\u01f4\7\21\2\2\u01f1\u01f2\f\30"+
		"\2\2\u01f2\u01f4\7\22\2\2\u01f3\u01c1\3\2\2\2\u01f3\u01c7\3\2\2\2\u01f3"+
		"\u01ca\3\2\2\2\u01f3\u01cd\3\2\2\2\u01f3\u01d0\3\2\2\2\u01f3\u01d3\3\2"+
		"\2\2\u01f3\u01d6\3\2\2\2\u01f3\u01d9\3\2\2\2\u01f3\u01dc\3\2\2\2\u01f3"+
		"\u01df\3\2\2\2\u01f3\u01e2\3\2\2\2\u01f3\u01e5\3\2\2\2\u01f3\u01ea\3\2"+
		"\2\2\u01f3\u01ed\3\2\2\2\u01f3\u01ef\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f4"+
		"\u01f7\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6[\3\2\2\2"+
		"\u01f7\u01f5\3\2\2\2\u01f8\u01f9\t\b\2\2\u01f9]\3\2\2\2\u01fa\u01fe\7"+
		"\3\2\2\u01fb\u01fe\7M\2\2\u01fc\u01fe\5`\61\2\u01fd\u01fa\3\2\2\2\u01fd"+
		"\u01fb\3\2\2\2\u01fd\u01fc\3\2\2\2\u01fe_\3\2\2\2\u01ff\u0200\t\t\2\2"+
		"\u0200a\3\2\2\2\u0201\u0204\5d\63\2\u0202\u0204\5f\64\2\u0203\u0201\3"+
		"\2\2\2\u0203\u0202\3\2\2\2\u0204c\3\2\2\2\u0205\u0206\7L\2\2\u0206e\3"+
		"\2\2\2\u0207\u0208\5h\65\2\u0208g\3\2\2\2\u0209\u020a\t\n\2\2\u020ai\3"+
		"\2\2\2\65k~\u0082\u0089\u008e\u009a\u00a9\u00af\u00b5\u00bc\u00cb\u00d7"+
		"\u00d9\u00dd\u00e1\u00ed\u00f4\u00fa\u0100\u010c\u0110\u0112\u0119\u011f"+
		"\u0124\u012f\u0136\u0140\u014a\u014f\u0152\u0157\u015d\u0165\u016d\u0176"+
		"\u017a\u017f\u0184\u018a\u018e\u0195\u0197\u01a0\u01a5\u01b7\u01bf\u01f3"+
		"\u01f5\u01fd\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}