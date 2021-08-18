// Generated from c:\Users\zuhan\Desktop\Programming\Practice\antlr\t2\epScriptLexer.g4 by ANTLR 4.8
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class epScriptLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"BooleanLiterl", "DecimalLiteral", "HexIntegerLiteral", "OpenBracket", 
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
			"SingleStringCharacter", "EscapeSequence", "UnicodeEscapeSequence", "DecimicalDigit", 
			"HexDigit", "IdentifierPart", "IdentifierStart"
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


	public epScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "epScriptLexer.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2T\u0226\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"\u00bd\n\2\3\3\6\3\u00c0\n\3\r\3\16\3\u00c1\3\4\3\4\3\4\6\4\u00c7\n\4"+
		"\r\4\16\4\u00c8\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3"+
		"\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3\'\3("+
		"\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\64\3"+
		"\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3:\3:\3:\3;\3;\3;\3"+
		";\3;\3;\3;\3;\3;\3<\3<\3<\3<\3<\3<\3<\3=\3=\3=\3=\3>\3>\3>\3>\3>\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3B\3B\3C\3C\3C\3C\3"+
		"C\3C\3D\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3"+
		"F\3G\3G\3G\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3"+
		"J\3J\3J\3K\3K\7K\u01cd\nK\fK\16K\u01d0\13K\3L\3L\7L\u01d4\nL\fL\16L\u01d7"+
		"\13L\3L\3L\3L\7L\u01dc\nL\fL\16L\u01df\13L\3L\5L\u01e2\nL\3M\6M\u01e5"+
		"\nM\rM\16M\u01e6\3M\3M\3N\3N\3N\3N\3O\3O\3O\3O\7O\u01f3\nO\fO\16O\u01f6"+
		"\13O\3O\3O\3O\3O\3O\3P\3P\3P\3P\7P\u0201\nP\fP\16P\u0204\13P\3P\3P\3Q"+
		"\3Q\3R\3R\3R\5R\u020d\nR\3S\3S\3S\5S\u0212\nS\3T\3T\3U\3U\3U\3U\3V\3V"+
		"\3W\3W\3X\3X\5X\u0220\nX\3Y\3Y\3Y\5Y\u0225\nY\3\u01f4\2Z\3\3\5\4\7\5\t"+
		"\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7\2\u00a9\2\u00ab\2\u00ad\2\u00af\2\u00b1\2\3\2\t\4\2ZZzz\6\2\13"+
		"\13\r\16\"\"\u00a2\u00a2\5\2\f\f\17\17\u202a\u202b\6\2\f\f\17\17$$^^\6"+
		"\2\f\f\17\17))^^\3\2\62;\5\2\62;CHch\4\u016a\2\62\2;\2a\2a\2\u0302\2\u0371"+
		"\2\u0485\2\u0489\2\u0593\2\u05bf\2\u05c1\2\u05c1\2\u05c3\2\u05c4\2\u05c6"+
		"\2\u05c7\2\u05c9\2\u05c9\2\u0612\2\u061c\2\u064d\2\u066b\2\u0672\2\u0672"+
		"\2\u06d8\2\u06de\2\u06e1\2\u06e6\2\u06e9\2\u06ea\2\u06ec\2\u06ef\2\u06f2"+
		"\2\u06fb\2\u0713\2\u0713\2\u0732\2\u074c\2\u07a8\2\u07b2\2\u07c2\2\u07cb"+
		"\2\u07ed\2\u07f5\2\u0818\2\u081b\2\u081d\2\u0825\2\u0827\2\u0829\2\u082b"+
		"\2\u082f\2\u085b\2\u085d\2\u08d6\2\u08e3\2\u08e5\2\u0904\2\u093c\2\u093c"+
		"\2\u093e\2\u093e\2\u0943\2\u094a\2\u094f\2\u094f\2\u0953\2\u0959\2\u0964"+
		"\2\u0965\2\u0968\2\u0971\2\u0983\2\u0983\2\u09be\2\u09be\2\u09c3\2\u09c6"+
		"\2\u09cf\2\u09cf\2\u09e4\2\u09e5\2\u09e8\2\u09f1\2\u0a03\2\u0a04\2\u0a3e"+
		"\2\u0a3e\2\u0a43\2\u0a44\2\u0a49\2\u0a4a\2\u0a4d\2\u0a4f\2\u0a53\2\u0a53"+
		"\2\u0a68\2\u0a73\2\u0a77\2\u0a77\2\u0a83\2\u0a84\2\u0abe\2\u0abe\2\u0ac3"+
		"\2\u0ac7\2\u0ac9\2\u0aca\2\u0acf\2\u0acf\2\u0ae4\2\u0ae5\2\u0ae8\2\u0af1"+
		"\2\u0afc\2\u0b01\2\u0b03\2\u0b03\2\u0b3e\2\u0b3e\2\u0b41\2\u0b41\2\u0b43"+
		"\2\u0b46\2\u0b4f\2\u0b4f\2\u0b58\2\u0b58\2\u0b64\2\u0b65\2\u0b68\2\u0b71"+
		"\2\u0b84\2\u0b84\2\u0bc2\2\u0bc2\2\u0bcf\2\u0bcf\2\u0be8\2\u0bf1\2\u0c02"+
		"\2\u0c02\2\u0c40\2\u0c42\2\u0c48\2\u0c4a\2\u0c4c\2\u0c4f\2\u0c57\2\u0c58"+
		"\2\u0c64\2\u0c65\2\u0c68\2\u0c71\2\u0c83\2\u0c83\2\u0cbe\2\u0cbe\2\u0cc1"+
		"\2\u0cc1\2\u0cc8\2\u0cc8\2\u0cce\2\u0ccf\2\u0ce4\2\u0ce5\2\u0ce8\2\u0cf1"+
		"\2\u0d02\2\u0d03\2\u0d3d\2\u0d3e\2\u0d43\2\u0d46\2\u0d4f\2\u0d4f\2\u0d64"+
		"\2\u0d65\2\u0d68\2\u0d71\2\u0dcc\2\u0dcc\2\u0dd4\2\u0dd6\2\u0dd8\2\u0dd8"+
		"\2\u0de8\2\u0df1\2\u0e33\2\u0e33\2\u0e36\2\u0e3c\2\u0e49\2\u0e50\2\u0e52"+
		"\2\u0e5b\2\u0eb3\2\u0eb3\2\u0eb6\2\u0ebb\2\u0ebd\2\u0ebe\2\u0eca\2\u0ecf"+
		"\2\u0ed2\2\u0edb\2\u0f1a\2\u0f1b\2\u0f22\2\u0f2b\2\u0f37\2\u0f37\2\u0f39"+
		"\2\u0f39\2\u0f3b\2\u0f3b\2\u0f73\2\u0f80\2\u0f82\2\u0f86\2\u0f88\2\u0f89"+
		"\2\u0f8f\2\u0f99\2\u0f9b\2\u0fbe\2\u0fc8\2\u0fc8\2\u102f\2\u1032\2\u1034"+
		"\2\u1039\2\u103b\2\u103c\2\u103f\2\u1040\2\u1042\2\u104b\2\u105a\2\u105b"+
		"\2\u1060\2\u1062\2\u1073\2\u1076\2\u1084\2\u1084\2\u1087\2\u1088\2\u108f"+
		"\2\u108f\2\u1092\2\u109b\2\u109f\2\u109f\2\u135f\2\u1361\2\u1714\2\u1716"+
		"\2\u1734\2\u1736\2\u1754\2\u1755\2\u1774\2\u1775\2\u17b6\2\u17b7\2\u17b9"+
		"\2\u17bf\2\u17c8\2\u17c8\2\u17cb\2\u17d5\2\u17df\2\u17df\2\u17e2\2\u17eb"+
		"\2\u180d\2\u180f\2\u1812\2\u181b\2\u1887\2\u1888\2\u18ab\2\u18ab\2\u1922"+
		"\2\u1924\2\u1929\2\u192a\2\u1934\2\u1934\2\u193b\2\u193d\2\u1948\2\u1951"+
		"\2\u19d2\2\u19db\2\u1a19\2\u1a1a\2\u1a1d\2\u1a1d\2\u1a58\2\u1a58\2\u1a5a"+
		"\2\u1a60\2\u1a62\2\u1a62\2\u1a64\2\u1a64\2\u1a67\2\u1a6e\2\u1a75\2\u1a7e"+
		"\2\u1a81\2\u1a8b\2\u1a92\2\u1a9b\2\u1ab2\2\u1abf\2\u1b02\2\u1b05\2\u1b36"+
		"\2\u1b36\2\u1b38\2\u1b3c\2\u1b3e\2\u1b3e\2\u1b44\2\u1b44\2\u1b52\2\u1b5b"+
		"\2\u1b6d\2\u1b75\2\u1b82\2\u1b83\2\u1ba4\2\u1ba7\2\u1baa\2\u1bab\2\u1bad"+
		"\2\u1baf\2\u1bb2\2\u1bbb\2\u1be8\2\u1be8\2\u1bea\2\u1beb\2\u1bef\2\u1bef"+
		"\2\u1bf1\2\u1bf3\2\u1c2e\2\u1c35\2\u1c38\2\u1c39\2\u1c42\2\u1c4b\2\u1c52"+
		"\2\u1c5b\2\u1cd2\2\u1cd4\2\u1cd6\2\u1ce2\2\u1ce4\2\u1cea\2\u1cef\2\u1cef"+
		"\2\u1cf6\2\u1cf6\2\u1cfa\2\u1cfb\2\u1dc2\2\u1dfb\2\u1dfd\2\u1e01\2\u200e"+
		"\2\u200f\2\u2041\2\u2042\2\u2056\2\u2056\2\u20d2\2\u20de\2\u20e3\2\u20e3"+
		"\2\u20e7\2\u20f2\2\u2cf1\2\u2cf3\2\u2d81\2\u2d81\2\u2de2\2\u2e01\2\u302c"+
		"\2\u302f\2\u309b\2\u309c\2\ua622\2\ua62b\2\ua671\2\ua671\2\ua676\2\ua67f"+
		"\2\ua6a0\2\ua6a1\2\ua6f2\2\ua6f3\2\ua804\2\ua804\2\ua808\2\ua808\2\ua80d"+
		"\2\ua80d\2\ua827\2\ua828\2\ua8c6\2\ua8c7\2\ua8d2\2\ua8db\2\ua8e2\2\ua8f3"+
		"\2\ua902\2\ua90b\2\ua928\2\ua92f\2\ua949\2\ua953\2\ua982\2\ua984\2\ua9b5"+
		"\2\ua9b5\2\ua9b8\2\ua9bb\2\ua9be\2\ua9be\2\ua9d2\2\ua9db\2\ua9e7\2\ua9e7"+
		"\2\ua9f2\2\ua9fb\2\uaa2b\2\uaa30\2\uaa33\2\uaa34\2\uaa37\2\uaa38\2\uaa45"+
		"\2\uaa45\2\uaa4e\2\uaa4e\2\uaa52\2\uaa5b\2\uaa7e\2\uaa7e\2\uaab2\2\uaab2"+
		"\2\uaab4\2\uaab6\2\uaab9\2\uaaba\2\uaac0\2\uaac1\2\uaac3\2\uaac3\2\uaaee"+
		"\2\uaaef\2\uaaf8\2\uaaf8\2\uabe7\2\uabe7\2\uabea\2\uabea\2\uabef\2\uabef"+
		"\2\uabf2\2\uabfb\2\ufb20\2\ufb20\2\ufe02\2\ufe11\2\ufe22\2\ufe31\2\ufe35"+
		"\2\ufe36\2\ufe4f\2\ufe51\2\uff12\2\uff1b\2\uff41\2\uff41\2\u01ff\3\u01ff"+
		"\3\u02e2\3\u02e2\3\u0378\3\u037c\3\u04a2\3\u04ab\3\u0a03\3\u0a05\3\u0a07"+
		"\3\u0a08\3\u0a0e\3\u0a11\3\u0a3a\3\u0a3c\3\u0a41\3\u0a41\3\u0ae7\3\u0ae8"+
		"\3\u1003\3\u1003\3\u103a\3\u1048\3\u1068\3\u1071\3\u1081\3\u1083\3\u10b5"+
		"\3\u10b8\3\u10bb\3\u10bc\3\u10f2\3\u10fb\3\u1102\3\u1104\3\u1129\3\u112d"+
		"\3\u112f\3\u1136\3\u1138\3\u1141\3\u1175\3\u1175\3\u1182\3\u1183\3\u11b8"+
		"\3\u11c0\3\u11cc\3\u11ce\3\u11d2\3\u11db\3\u1231\3\u1233\3\u1236\3\u1236"+
		"\3\u1238\3\u1239\3\u1240\3\u1240\3\u12e1\3\u12e1\3\u12e5\3\u12ec\3\u12f2"+
		"\3\u12fb\3\u1302\3\u1303\3\u133e\3\u133e\3\u1342\3\u1342\3\u1368\3\u136e"+
		"\3\u1372\3\u1376\3\u143a\3\u1441\3\u1444\3\u1446\3\u1448\3\u1448\3\u1452"+
		"\3\u145b\3\u14b5\3\u14ba\3\u14bc\3\u14bc\3\u14c1\3\u14c2\3\u14c4\3\u14c5"+
		"\3\u14d2\3\u14db\3\u15b4\3\u15b7\3\u15be\3\u15bf\3\u15c1\3\u15c2\3\u15de"+
		"\3\u15df\3\u1635\3\u163c\3\u163f\3\u163f\3\u1641\3\u1642\3\u1652\3\u165b"+
		"\3\u16ad\3\u16ad\3\u16af\3\u16af\3\u16b2\3\u16b7\3\u16b9\3\u16b9\3\u16c2"+
		"\3\u16cb\3\u171f\3\u1721\3\u1724\3\u1727\3\u1729\3\u172d\3\u1732\3\u173b"+
		"\3\u18e2\3\u18eb\3\u1a03\3\u1a08\3\u1a0b\3\u1a0c\3\u1a35\3\u1a3a\3\u1a3d"+
		"\3\u1a40\3\u1a49\3\u1a49\3\u1a53\3\u1a58\3\u1a5b\3\u1a5d\3\u1a8c\3\u1a98"+
		"\3\u1a9a\3\u1a9b\3\u1c32\3\u1c38\3\u1c3a\3\u1c3f\3\u1c41\3\u1c41\3\u1c52"+
		"\3\u1c5b\3\u1c94\3\u1ca9\3\u1cac\3\u1cb2\3\u1cb4\3\u1cb5\3\u1cb7\3\u1cb8"+
		"\3\u1d33\3\u1d38\3\u1d3c\3\u1d3c\3\u1d3e\3\u1d3f\3\u1d41\3\u1d47\3\u1d49"+
		"\3\u1d49\3\u1d52\3\u1d5b\3\u6a62\3\u6a6b\3\u6af2\3\u6af6\3\u6b32\3\u6b38"+
		"\3\u6b52\3\u6b5b\3\u6f91\3\u6f94\3\ubc9f\3\ubca0\3\ud169\3\ud16b\3\ud17d"+
		"\3\ud184\3\ud187\3\ud18d\3\ud1ac\3\ud1af\3\ud244\3\ud246\3\ud7d0\3\ud801"+
		"\3\uda02\3\uda38\3\uda3d\3\uda6e\3\uda77\3\uda77\3\uda86\3\uda86\3\uda9d"+
		"\3\udaa1\3\udaa3\3\udab1\3\ue002\3\ue008\3\ue00a\3\ue01a\3\ue01d\3\ue023"+
		"\3\ue025\3\ue026\3\ue028\3\ue02c\3\ue8d2\3\ue8d8\3\ue946\3\ue94c\3\ue952"+
		"\3\ue95b\3\u0102\20\u01f1\20\u024d\2&\2&\2C\2\\\2a\2a\2c\2|\2\u00ac\2"+
		"\u00ac\2\u00b7\2\u00b7\2\u00bc\2\u00bc\2\u00c2\2\u00d8\2\u00da\2\u00f8"+
		"\2\u00fa\2\u02c3\2\u02c8\2\u02d3\2\u02e2\2\u02e6\2\u02ee\2\u02ee\2\u02f0"+
		"\2\u02f0\2\u0372\2\u0376\2\u0378\2\u0379\2\u037c\2\u037f\2\u0381\2\u0381"+
		"\2\u0388\2\u0388\2\u038a\2\u038c\2\u038e\2\u038e\2\u0390\2\u03a3\2\u03a5"+
		"\2\u03f7\2\u03f9\2\u0483\2\u048c\2\u0531\2\u0533\2\u0558\2\u055b\2\u055b"+
		"\2\u0563\2\u0589\2\u05d2\2\u05ec\2\u05f2\2\u05f4\2\u0622\2\u064c\2\u0670"+
		"\2\u0671\2\u0673\2\u06d5\2\u06d7\2\u06d7\2\u06e7\2\u06e8\2\u06f0\2\u06f1"+
		"\2\u06fc\2\u06fe\2\u0701\2\u0701\2\u0712\2\u0712\2\u0714\2\u0731\2\u074f"+
		"\2\u07a7\2\u07b3\2\u07b3\2\u07cc\2\u07ec\2\u07f6\2\u07f7\2\u07fc\2\u07fc"+
		"\2\u0802\2\u0817\2\u081c\2\u081c\2\u0826\2\u0826\2\u082a\2\u082a\2\u0842"+
		"\2\u085a\2\u0862\2\u086c\2\u08a2\2\u08b6\2\u08b8\2\u08bf\2\u0906\2\u093b"+
		"\2\u093f\2\u093f\2\u0952\2\u0952\2\u095a\2\u0963\2\u0973\2\u0982\2\u0987"+
		"\2\u098e\2\u0991\2\u0992\2\u0995\2\u09aa\2\u09ac\2\u09b2\2\u09b4\2\u09b4"+
		"\2\u09b8\2\u09bb\2\u09bf\2\u09bf\2\u09d0\2\u09d0\2\u09de\2\u09df\2\u09e1"+
		"\2\u09e3\2\u09f2\2\u09f3\2\u09fe\2\u09fe\2\u0a07\2\u0a0c\2\u0a11\2\u0a12"+
		"\2\u0a15\2\u0a2a\2\u0a2c\2\u0a32\2\u0a34\2\u0a35\2\u0a37\2\u0a38\2\u0a3a"+
		"\2\u0a3b\2\u0a5b\2\u0a5e\2\u0a60\2\u0a60\2\u0a74\2\u0a76\2\u0a87\2\u0a8f"+
		"\2\u0a91\2\u0a93\2\u0a95\2\u0aaa\2\u0aac\2\u0ab2\2\u0ab4\2\u0ab5\2\u0ab7"+
		"\2\u0abb\2\u0abf\2\u0abf\2\u0ad2\2\u0ad2\2\u0ae2\2\u0ae3\2\u0afb\2\u0afb"+
		"\2\u0b07\2\u0b0e\2\u0b11\2\u0b12\2\u0b15\2\u0b2a\2\u0b2c\2\u0b32\2\u0b34"+
		"\2\u0b35\2\u0b37\2\u0b3b\2\u0b3f\2\u0b3f\2\u0b5e\2\u0b5f\2\u0b61\2\u0b63"+
		"\2\u0b73\2\u0b73\2\u0b85\2\u0b85\2\u0b87\2\u0b8c\2\u0b90\2\u0b92\2\u0b94"+
		"\2\u0b97\2\u0b9b\2\u0b9c\2\u0b9e\2\u0b9e\2\u0ba0\2\u0ba1\2\u0ba5\2\u0ba6"+
		"\2\u0baa\2\u0bac\2\u0bb0\2\u0bbb\2\u0bd2\2\u0bd2\2\u0c07\2\u0c0e\2\u0c10"+
		"\2\u0c12\2\u0c14\2\u0c2a\2\u0c2c\2\u0c3b\2\u0c3f\2\u0c3f\2\u0c5a\2\u0c5c"+
		"\2\u0c62\2\u0c63\2\u0c82\2\u0c82\2\u0c87\2\u0c8e\2\u0c90\2\u0c92\2\u0c94"+
		"\2\u0caa\2\u0cac\2\u0cb5\2\u0cb7\2\u0cbb\2\u0cbf\2\u0cbf\2\u0ce0\2\u0ce0"+
		"\2\u0ce2\2\u0ce3\2\u0cf3\2\u0cf4\2\u0d07\2\u0d0e\2\u0d10\2\u0d12\2\u0d14"+
		"\2\u0d3c\2\u0d3f\2\u0d3f\2\u0d50\2\u0d50\2\u0d56\2\u0d58\2\u0d61\2\u0d63"+
		"\2\u0d7c\2\u0d81\2\u0d87\2\u0d98\2\u0d9c\2\u0db3\2\u0db5\2\u0dbd\2\u0dbf"+
		"\2\u0dbf\2\u0dc2\2\u0dc8\2\u0e03\2\u0e32\2\u0e34\2\u0e35\2\u0e42\2\u0e48"+
		"\2\u0e83\2\u0e84\2\u0e86\2\u0e86\2\u0e89\2\u0e8a\2\u0e8c\2\u0e8c\2\u0e8f"+
		"\2\u0e8f\2\u0e96\2\u0e99\2\u0e9b\2\u0ea1\2\u0ea3\2\u0ea5\2\u0ea7\2\u0ea7"+
		"\2\u0ea9\2\u0ea9\2\u0eac\2\u0ead\2\u0eaf\2\u0eb2\2\u0eb4\2\u0eb5\2\u0ebf"+
		"\2\u0ebf\2\u0ec2\2\u0ec6\2\u0ec8\2\u0ec8\2\u0ede\2\u0ee1\2\u0f02\2\u0f02"+
		"\2\u0f42\2\u0f49\2\u0f4b\2\u0f6e\2\u0f8a\2\u0f8e\2\u1002\2\u102c\2\u1041"+
		"\2\u1041\2\u1052\2\u1057\2\u105c\2\u105f\2\u1063\2\u1063\2\u1067\2\u1068"+
		"\2\u1070\2\u1072\2\u1077\2\u1083\2\u1090\2\u1090\2\u10a2\2\u10c7\2\u10c9"+
		"\2\u10c9\2\u10cf\2\u10cf\2\u10d2\2\u10fc\2\u10fe\2\u124a\2\u124c\2\u124f"+
		"\2\u1252\2\u1258\2\u125a\2\u125a\2\u125c\2\u125f\2\u1262\2\u128a\2\u128c"+
		"\2\u128f\2\u1292\2\u12b2\2\u12b4\2\u12b7\2\u12ba\2\u12c0\2\u12c2\2\u12c2"+
		"\2\u12c4\2\u12c7\2\u12ca\2\u12d8\2\u12da\2\u1312\2\u1314\2\u1317\2\u131a"+
		"\2\u135c\2\u1382\2\u1391\2\u13a2\2\u13f7\2\u13fa\2\u13ff\2\u1403\2\u166e"+
		"\2\u1671\2\u1681\2\u1683\2\u169c\2\u16a2\2\u16ec\2\u16f3\2\u16fa\2\u1702"+
		"\2\u170e\2\u1710\2\u1713\2\u1722\2\u1733\2\u1742\2\u1753\2\u1762\2\u176e"+
		"\2\u1770\2\u1772\2\u1782\2\u17b5\2\u17d9\2\u17d9\2\u17de\2\u17de\2\u1822"+
		"\2\u1879\2\u1882\2\u1886\2\u1889\2\u18aa\2\u18ac\2\u18ac\2\u18b2\2\u18f7"+
		"\2\u1902\2\u1920\2\u1952\2\u196f\2\u1972\2\u1976\2\u1982\2\u19ad\2\u19b2"+
		"\2\u19cb\2\u1a02\2\u1a18\2\u1a22\2\u1a56\2\u1aa9\2\u1aa9\2\u1b07\2\u1b35"+
		"\2\u1b47\2\u1b4d\2\u1b85\2\u1ba2\2\u1bb0\2\u1bb1\2\u1bbc\2\u1be7\2\u1c02"+
		"\2\u1c25\2\u1c4f\2\u1c51\2\u1c5c\2\u1c7f\2\u1c82\2\u1c8a\2\u1ceb\2\u1cee"+
		"\2\u1cf0\2\u1cf3\2\u1cf7\2\u1cf8\2\u1d02\2\u1dc1\2\u1e02\2\u1f17\2\u1f1a"+
		"\2\u1f1f\2\u1f22\2\u1f47\2\u1f4a\2\u1f4f\2\u1f52\2\u1f59\2\u1f5b\2\u1f5b"+
		"\2\u1f5d\2\u1f5d\2\u1f5f\2\u1f5f\2\u1f61\2\u1f7f\2\u1f82\2\u1fb6\2\u1fb8"+
		"\2\u1fbe\2\u1fc0\2\u1fc0\2\u1fc4\2\u1fc6\2\u1fc8\2\u1fce\2\u1fd2\2\u1fd5"+
		"\2\u1fd8\2\u1fdd\2\u1fe2\2\u1fee\2\u1ff4\2\u1ff6\2\u1ff8\2\u1ffe\2\u2073"+
		"\2\u2073\2\u2081\2\u2081\2\u2092\2\u209e\2\u2104\2\u2104\2\u2109\2\u2109"+
		"\2\u210c\2\u2115\2\u2117\2\u2117\2\u211b\2\u211f\2\u2126\2\u2126\2\u2128"+
		"\2\u2128\2\u212a\2\u212a\2\u212c\2\u212f\2\u2131\2\u213b\2\u213e\2\u2141"+
		"\2\u2147\2\u214b\2\u2150\2\u2150\2\u2185\2\u2186\2\u2c02\2\u2c30\2\u2c32"+
		"\2\u2c60\2\u2c62\2\u2ce6\2\u2ced\2\u2cf0\2\u2cf4\2\u2cf5\2\u2d02\2\u2d27"+
		"\2\u2d29\2\u2d29\2\u2d2f\2\u2d2f\2\u2d32\2\u2d69\2\u2d71\2\u2d71\2\u2d82"+
		"\2\u2d98\2\u2da2\2\u2da8\2\u2daa\2\u2db0\2\u2db2\2\u2db8\2\u2dba\2\u2dc0"+
		"\2\u2dc2\2\u2dc8\2\u2dca\2\u2dd0\2\u2dd2\2\u2dd8\2\u2dda\2\u2de0\2\u2e31"+
		"\2\u2e31\2\u3007\2\u3008\2\u3033\2\u3037\2\u303d\2\u303e\2\u3043\2\u3098"+
		"\2\u309f\2\u30a1\2\u30a3\2\u30fc\2\u30fe\2\u3101\2\u3107\2\u3130\2\u3133"+
		"\2\u3190\2\u31a2\2\u31bc\2\u31f2\2\u3201\2\u3402\2\u4db7\2\u4e02\2\u9fec"+
		"\2\ua002\2\ua48e\2\ua4d2\2\ua4ff\2\ua502\2\ua60e\2\ua612\2\ua621\2\ua62c"+
		"\2\ua62d\2\ua642\2\ua670\2\ua681\2\ua69f\2\ua6a2\2\ua6e7\2\ua719\2\ua721"+
		"\2\ua724\2\ua78a\2\ua78d\2\ua7b0\2\ua7b2\2\ua7b9\2\ua7f9\2\ua803\2\ua805"+
		"\2\ua807\2\ua809\2\ua80c\2\ua80e\2\ua824\2\ua842\2\ua875\2\ua884\2\ua8b5"+
		"\2\ua8f4\2\ua8f9\2\ua8fd\2\ua8fd\2\ua8ff\2\ua8ff\2\ua90c\2\ua927\2\ua932"+
		"\2\ua948\2\ua962\2\ua97e\2\ua986\2\ua9b4\2\ua9d1\2\ua9d1\2\ua9e2\2\ua9e6"+
		"\2\ua9e8\2\ua9f1\2\ua9fc\2\uaa00\2\uaa02\2\uaa2a\2\uaa42\2\uaa44\2\uaa46"+
		"\2\uaa4d\2\uaa62\2\uaa78\2\uaa7c\2\uaa7c\2\uaa80\2\uaab1\2\uaab3\2\uaab3"+
		"\2\uaab7\2\uaab8\2\uaabb\2\uaabf\2\uaac2\2\uaac2\2\uaac4\2\uaac4\2\uaadd"+
		"\2\uaadf\2\uaae2\2\uaaec\2\uaaf4\2\uaaf6\2\uab03\2\uab08\2\uab0b\2\uab10"+
		"\2\uab13\2\uab18\2\uab22\2\uab28\2\uab2a\2\uab30\2\uab32\2\uab5c\2\uab5e"+
		"\2\uab67\2\uab72\2\uabe4\2\uac02\2\ud7a5\2\ud7b2\2\ud7c8\2\ud7cd\2\ud7fd"+
		"\2\uf902\2\ufa6f\2\ufa72\2\ufadb\2\ufb02\2\ufb08\2\ufb15\2\ufb19\2\ufb1f"+
		"\2\ufb1f\2\ufb21\2\ufb2a\2\ufb2c\2\ufb38\2\ufb3a\2\ufb3e\2\ufb40\2\ufb40"+
		"\2\ufb42\2\ufb43\2\ufb45\2\ufb46\2\ufb48\2\ufbb3\2\ufbd5\2\ufd3f\2\ufd52"+
		"\2\ufd91\2\ufd94\2\ufdc9\2\ufdf2\2\ufdfd\2\ufe72\2\ufe76\2\ufe78\2\ufefe"+
		"\2\uff23\2\uff3c\2\uff43\2\uff5c\2\uff68\2\uffc0\2\uffc4\2\uffc9\2\uffcc"+
		"\2\uffd1\2\uffd4\2\uffd9\2\uffdc\2\uffde\2\2\3\r\3\17\3(\3*\3<\3>\3?\3"+
		"A\3O\3R\3_\3\u0082\3\u00fc\3\u0282\3\u029e\3\u02a2\3\u02d2\3\u0302\3\u0321"+
		"\3\u032f\3\u0342\3\u0344\3\u034b\3\u0352\3\u0377\3\u0382\3\u039f\3\u03a2"+
		"\3\u03c5\3\u03ca\3\u03d1\3\u0402\3\u049f\3\u04b2\3\u04d5\3\u04da\3\u04fd"+
		"\3\u0502\3\u0529\3\u0532\3\u0565\3\u0602\3\u0738\3\u0742\3\u0757\3\u0762"+
		"\3\u0769\3\u0802\3\u0807\3\u080a\3\u080a\3\u080c\3\u0837\3\u0839\3\u083a"+
		"\3\u083e\3\u083e\3\u0841\3\u0857\3\u0862\3\u0878\3\u0882\3\u08a0\3\u08e2"+
		"\3\u08f4\3\u08f6\3\u08f7\3\u0902\3\u0917\3\u0922\3\u093b\3\u0982\3\u09b9"+
		"\3\u09c0\3\u09c1\3\u0a02\3\u0a02\3\u0a12\3\u0a15\3\u0a17\3\u0a19\3\u0a1b"+
		"\3\u0a35\3\u0a62\3\u0a7e\3\u0a82\3\u0a9e\3\u0ac2\3\u0ac9\3\u0acb\3\u0ae6"+
		"\3\u0b02\3\u0b37\3\u0b42\3\u0b57\3\u0b62\3\u0b74\3\u0b82\3\u0b93\3\u0c02"+
		"\3\u0c4a\3\u0c82\3\u0cb4\3\u0cc2\3\u0cf4\3\u1005\3\u1039\3\u1085\3\u10b1"+
		"\3\u10d2\3\u10ea\3\u1105\3\u1128\3\u1152\3\u1174\3\u1178\3\u1178\3\u1185"+
		"\3\u11b4\3\u11c3\3\u11c6\3\u11dc\3\u11dc\3\u11de\3\u11de\3\u1202\3\u1213"+
		"\3\u1215\3\u122d\3\u1282\3\u1288\3\u128a\3\u128a\3\u128c\3\u128f\3\u1291"+
		"\3\u129f\3\u12a1\3\u12aa\3\u12b2\3\u12e0\3\u1307\3\u130e\3\u1311\3\u1312"+
		"\3\u1315\3\u132a\3\u132c\3\u1332\3\u1334\3\u1335\3\u1337\3\u133b\3\u133f"+
		"\3\u133f\3\u1352\3\u1352\3\u135f\3\u1363\3\u1402\3\u1436\3\u1449\3\u144c"+
		"\3\u1482\3\u14b1\3\u14c6\3\u14c7\3\u14c9\3\u14c9\3\u1582\3\u15b0\3\u15da"+
		"\3\u15dd\3\u1602\3\u1631\3\u1646\3\u1646\3\u1682\3\u16ac\3\u1702\3\u171b"+
		"\3\u18a2\3\u18e1\3\u1901\3\u1901\3\u1a02\3\u1a02\3\u1a0d\3\u1a34\3\u1a3c"+
		"\3\u1a3c\3\u1a52\3\u1a52\3\u1a5e\3\u1a85\3\u1a88\3\u1a8b\3\u1ac2\3\u1afa"+
		"\3\u1c02\3\u1c0a\3\u1c0c\3\u1c30\3\u1c42\3\u1c42\3\u1c74\3\u1c91\3\u1d02"+
		"\3\u1d08\3\u1d0a\3\u1d0b\3\u1d0d\3\u1d32\3\u1d48\3\u1d48\3\u2002\3\u239b"+
		"\3\u2482\3\u2545\3\u3002\3\u3430\3\u4402\3\u4648\3\u6802\3\u6a3a\3\u6a42"+
		"\3\u6a60\3\u6ad2\3\u6aef\3\u6b02\3\u6b31\3\u6b42\3\u6b45\3\u6b65\3\u6b79"+
		"\3\u6b7f\3\u6b91\3\u6f02\3\u6f46\3\u6f52\3\u6f52\3\u6f95\3\u6fa1\3\u6fe2"+
		"\3\u6fe3\3\u7002\3\u87ee\3\u8802\3\u8af4\3\ub002\3\ub120\3\ub172\3\ub2fd"+
		"\3\ubc02\3\ubc6c\3\ubc72\3\ubc7e\3\ubc82\3\ubc8a\3\ubc92\3\ubc9b\3\ud402"+
		"\3\ud456\3\ud458\3\ud49e\3\ud4a0\3\ud4a1\3\ud4a4\3\ud4a4\3\ud4a7\3\ud4a8"+
		"\3\ud4ab\3\ud4ae\3\ud4b0\3\ud4bb\3\ud4bd\3\ud4bd\3\ud4bf\3\ud4c5\3\ud4c7"+
		"\3\ud507\3\ud509\3\ud50c\3\ud50f\3\ud516\3\ud518\3\ud51e\3\ud520\3\ud53b"+
		"\3\ud53d\3\ud540\3\ud542\3\ud546\3\ud548\3\ud548\3\ud54c\3\ud552\3\ud554"+
		"\3\ud6a7\3\ud6aa\3\ud6c2\3\ud6c4\3\ud6dc\3\ud6de\3\ud6fc\3\ud6fe\3\ud716"+
		"\3\ud718\3\ud736\3\ud738\3\ud750\3\ud752\3\ud770\3\ud772\3\ud78a\3\ud78c"+
		"\3\ud7aa\3\ud7ac\3\ud7c4\3\ud7c6\3\ud7cd\3\ue802\3\ue8c6\3\ue902\3\ue945"+
		"\3\uee02\3\uee05\3\uee07\3\uee21\3\uee23\3\uee24\3\uee26\3\uee26\3\uee29"+
		"\3\uee29\3\uee2b\3\uee34\3\uee36\3\uee39\3\uee3b\3\uee3b\3\uee3d\3\uee3d"+
		"\3\uee44\3\uee44\3\uee49\3\uee49\3\uee4b\3\uee4b\3\uee4d\3\uee4d\3\uee4f"+
		"\3\uee51\3\uee53\3\uee54\3\uee56\3\uee56\3\uee59\3\uee59\3\uee5b\3\uee5b"+
		"\3\uee5d\3\uee5d\3\uee5f\3\uee5f\3\uee61\3\uee61\3\uee63\3\uee64\3\uee66"+
		"\3\uee66\3\uee69\3\uee6c\3\uee6e\3\uee74\3\uee76\3\uee79\3\uee7b\3\uee7e"+
		"\3\uee80\3\uee80\3\uee82\3\uee8b\3\uee8d\3\uee9d\3\ueea3\3\ueea5\3\ueea7"+
		"\3\ueeab\3\ueead\3\ueebd\3\2\4\ua6d8\4\ua702\4\ub736\4\ub742\4\ub81f\4"+
		"\ub822\4\ucea3\4\uceb2\4\uebe2\4\uf802\4\ufa1f\4\u022d\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2"+
		"\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q"+
		"\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2"+
		"\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087"+
		"\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2"+
		"\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\3\u00bc\3\2\2\2\5\u00bf\3\2\2\2\7\u00c3"+
		"\3\2\2\2\t\u00ca\3\2\2\2\13\u00cc\3\2\2\2\r\u00ce\3\2\2\2\17\u00d0\3\2"+
		"\2\2\21\u00d2\3\2\2\2\23\u00d4\3\2\2\2\25\u00d6\3\2\2\2\27\u00d8\3\2\2"+
		"\2\31\u00da\3\2\2\2\33\u00dc\3\2\2\2\35\u00de\3\2\2\2\37\u00e0\3\2\2\2"+
		"!\u00e3\3\2\2\2#\u00e6\3\2\2\2%\u00e9\3\2\2\2\'\u00ec\3\2\2\2)\u00ef\3"+
		"\2\2\2+\u00f3\3\2\2\2-\u00f7\3\2\2\2/\u00fa\3\2\2\2\61\u00fd\3\2\2\2\63"+
		"\u0100\3\2\2\2\65\u0103\3\2\2\2\67\u0106\3\2\2\29\u0109\3\2\2\2;\u010c"+
		"\3\2\2\2=\u010e\3\2\2\2?\u0110\3\2\2\2A\u0112\3\2\2\2C\u0114\3\2\2\2E"+
		"\u0117\3\2\2\2G\u011a\3\2\2\2I\u011d\3\2\2\2K\u011f\3\2\2\2M\u0121\3\2"+
		"\2\2O\u0124\3\2\2\2Q\u0126\3\2\2\2S\u0128\3\2\2\2U\u012a\3\2\2\2W\u012c"+
		"\3\2\2\2Y\u012e\3\2\2\2[\u0130\3\2\2\2]\u0132\3\2\2\2_\u0135\3\2\2\2a"+
		"\u0138\3\2\2\2c\u013b\3\2\2\2e\u013e\3\2\2\2g\u0141\3\2\2\2i\u0148\3\2"+
		"\2\2k\u014d\3\2\2\2m\u0154\3\2\2\2o\u0157\3\2\2\2q\u015b\3\2\2\2s\u0161"+
		"\3\2\2\2u\u0168\3\2\2\2w\u0171\3\2\2\2y\u0178\3\2\2\2{\u017c\3\2\2\2}"+
		"\u0181\3\2\2\2\177\u0184\3\2\2\2\u0081\u0189\3\2\2\2\u0083\u018d\3\2\2"+
		"\2\u0085\u0195\3\2\2\2\u0087\u019b\3\2\2\2\u0089\u01a1\3\2\2\2\u008b\u01aa"+
		"\3\2\2\2\u008d\u01b1\3\2\2\2\u008f\u01b8\3\2\2\2\u0091\u01bd\3\2\2\2\u0093"+
		"\u01c5\3\2\2\2\u0095\u01ca\3\2\2\2\u0097\u01e1\3\2\2\2\u0099\u01e4\3\2"+
		"\2\2\u009b\u01ea\3\2\2\2\u009d\u01ee\3\2\2\2\u009f\u01fc\3\2\2\2\u00a1"+
		"\u0207\3\2\2\2\u00a3\u020c\3\2\2\2\u00a5\u0211\3\2\2\2\u00a7\u0213\3\2"+
		"\2\2\u00a9\u0215\3\2\2\2\u00ab\u0219\3\2\2\2\u00ad\u021b\3\2\2\2\u00af"+
		"\u021f\3\2\2\2\u00b1\u0224\3\2\2\2\u00b3\u00b4\7v\2\2\u00b4\u00b5\7t\2"+
		"\2\u00b5\u00b6\7w\2\2\u00b6\u00bd\7g\2\2\u00b7\u00b8\7h\2\2\u00b8\u00b9"+
		"\7c\2\2\u00b9\u00ba\7n\2\2\u00ba\u00bb\7u\2\2\u00bb\u00bd\7g\2\2\u00bc"+
		"\u00b3\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bd\4\3\2\2\2\u00be\u00c0\5\u00ab"+
		"V\2\u00bf\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\6\3\2\2\2\u00c3\u00c4\7\62\2\2\u00c4\u00c6\t\2\2"+
		"\2\u00c5\u00c7\5\u00adW\2\u00c6\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\b\3\2\2\2\u00ca\u00cb\7]\2\2"+
		"\u00cb\n\3\2\2\2\u00cc\u00cd\7_\2\2\u00cd\f\3\2\2\2\u00ce\u00cf\7*\2\2"+
		"\u00cf\16\3\2\2\2\u00d0\u00d1\7+\2\2\u00d1\20\3\2\2\2\u00d2\u00d3\7}\2"+
		"\2\u00d3\22\3\2\2\2\u00d4\u00d5\7\177\2\2\u00d5\24\3\2\2\2\u00d6\u00d7"+
		"\7\60\2\2\u00d7\26\3\2\2\2\u00d8\u00d9\7A\2\2\u00d9\30\3\2\2\2\u00da\u00db"+
		"\7.\2\2\u00db\32\3\2\2\2\u00dc\u00dd\7<\2\2\u00dd\34\3\2\2\2\u00de\u00df"+
		"\7=\2\2\u00df\36\3\2\2\2\u00e0\u00e1\7-\2\2\u00e1\u00e2\7-\2\2\u00e2 "+
		"\3\2\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7/\2\2\u00e5\"\3\2\2\2\u00e6\u00e7"+
		"\7-\2\2\u00e7\u00e8\7?\2\2\u00e8$\3\2\2\2\u00e9\u00ea\7/\2\2\u00ea\u00eb"+
		"\7?\2\2\u00eb&\3\2\2\2\u00ec\u00ed\7,\2\2\u00ed\u00ee\7?\2\2\u00ee(\3"+
		"\2\2\2\u00ef\u00f0\7>\2\2\u00f0\u00f1\7>\2\2\u00f1\u00f2\7?\2\2\u00f2"+
		"*\3\2\2\2\u00f3\u00f4\7@\2\2\u00f4\u00f5\7@\2\2\u00f5\u00f6\7?\2\2\u00f6"+
		",\3\2\2\2\u00f7\u00f8\7(\2\2\u00f8\u00f9\7?\2\2\u00f9.\3\2\2\2\u00fa\u00fb"+
		"\7`\2\2\u00fb\u00fc\7?\2\2\u00fc\60\3\2\2\2\u00fd\u00fe\7~\2\2\u00fe\u00ff"+
		"\7?\2\2\u00ff\62\3\2\2\2\u0100\u0101\7(\2\2\u0101\u0102\7(\2\2\u0102\64"+
		"\3\2\2\2\u0103\u0104\7~\2\2\u0104\u0105\7~\2\2\u0105\66\3\2\2\2\u0106"+
		"\u0107\7>\2\2\u0107\u0108\7>\2\2\u01088\3\2\2\2\u0109\u010a\7@\2\2\u010a"+
		"\u010b\7@\2\2\u010b:\3\2\2\2\u010c\u010d\7\u0080\2\2\u010d<\3\2\2\2\u010e"+
		"\u010f\7(\2\2\u010f>\3\2\2\2\u0110\u0111\7~\2\2\u0111@\3\2\2\2\u0112\u0113"+
		"\7`\2\2\u0113B\3\2\2\2\u0114\u0115\7?\2\2\u0115\u0116\7?\2\2\u0116D\3"+
		"\2\2\2\u0117\u0118\7>\2\2\u0118\u0119\7?\2\2\u0119F\3\2\2\2\u011a\u011b"+
		"\7@\2\2\u011b\u011c\7?\2\2\u011cH\3\2\2\2\u011d\u011e\7>\2\2\u011eJ\3"+
		"\2\2\2\u011f\u0120\7@\2\2\u0120L\3\2\2\2\u0121\u0122\7#\2\2\u0122\u0123"+
		"\7?\2\2\u0123N\3\2\2\2\u0124\u0125\7#\2\2\u0125P\3\2\2\2\u0126\u0127\7"+
		"-\2\2\u0127R\3\2\2\2\u0128\u0129\7/\2\2\u0129T\3\2\2\2\u012a\u012b\7,"+
		"\2\2\u012bV\3\2\2\2\u012c\u012d\7\61\2\2\u012dX\3\2\2\2\u012e\u012f\7"+
		"\'\2\2\u012fZ\3\2\2\2\u0130\u0131\7?\2\2\u0131\\\3\2\2\2\u0132\u0133\7"+
		"&\2\2\u0133\u0134\7W\2\2\u0134^\3\2\2\2\u0135\u0136\7&\2\2\u0136\u0137"+
		"\7N\2\2\u0137`\3\2\2\2\u0138\u0139\7&\2\2\u0139\u013a\7U\2\2\u013ab\3"+
		"\2\2\2\u013b\u013c\7&\2\2\u013c\u013d\7V\2\2\u013dd\3\2\2\2\u013e\u013f"+
		"\7&\2\2\u013f\u0140\7D\2\2\u0140f\3\2\2\2\u0141\u0142\7X\2\2\u0142\u0143"+
		"\7C\2\2\u0143\u0144\7t\2\2\u0144\u0145\7t\2\2\u0145\u0146\7c\2\2\u0146"+
		"\u0147\7{\2\2\u0147h\3\2\2\2\u0148\u0149\7n\2\2\u0149\u014a\7k\2\2\u014a"+
		"\u014b\7u\2\2\u014b\u014c\7v\2\2\u014cj\3\2\2\2\u014d\u014e\7k\2\2\u014e"+
		"\u014f\7o\2\2\u014f\u0150\7r\2\2\u0150\u0151\7q\2\2\u0151\u0152\7t\2\2"+
		"\u0152\u0153\7v\2\2\u0153l\3\2\2\2\u0154\u0155\7c\2\2\u0155\u0156\7u\2"+
		"\2\u0156n\3\2\2\2\u0157\u0158\7x\2\2\u0158\u0159\7c\2\2\u0159\u015a\7"+
		"t\2\2\u015ap\3\2\2\2\u015b\u015c\7e\2\2\u015c\u015d\7q\2\2\u015d\u015e"+
		"\7p\2\2\u015e\u015f\7u\2\2\u015f\u0160\7v\2\2\u0160r\3\2\2\2\u0161\u0162"+
		"\7u\2\2\u0162\u0163\7v\2\2\u0163\u0164\7c\2\2\u0164\u0165\7v\2\2\u0165"+
		"\u0166\7k\2\2\u0166\u0167\7e\2\2\u0167t\3\2\2\2\u0168\u0169\7h\2\2\u0169"+
		"\u016a\7w\2\2\u016a\u016b\7p\2\2\u016b\u016c\7e\2\2\u016c\u016d\7v\2\2"+
		"\u016d\u016e\7k\2\2\u016e\u016f\7q\2\2\u016f\u0170\7p\2\2\u0170v\3\2\2"+
		"\2\u0171\u0172\7q\2\2\u0172\u0173\7d\2\2\u0173\u0174\7l\2\2\u0174\u0175"+
		"\7g\2\2\u0175\u0176\7e\2\2\u0176\u0177\7v\2\2\u0177x\3\2\2\2\u0178\u0179"+
		"\7n\2\2\u0179\u017a\7\64\2\2\u017a\u017b\7x\2\2\u017bz\3\2\2\2\u017c\u017d"+
		"\7q\2\2\u017d\u017e\7p\2\2\u017e\u017f\7e\2\2\u017f\u0180\7g\2\2\u0180"+
		"|\3\2\2\2\u0181\u0182\7k\2\2\u0182\u0183\7h\2\2\u0183~\3\2\2\2\u0184\u0185"+
		"\7g\2\2\u0185\u0186\7n\2\2\u0186\u0187\7u\2\2\u0187\u0188\7g\2\2\u0188"+
		"\u0080\3\2\2\2\u0189\u018a\7h\2\2\u018a\u018b\7q\2\2\u018b\u018c\7t\2"+
		"\2\u018c\u0082\3\2\2\2\u018d\u018e\7h\2\2\u018e\u018f\7q\2\2\u018f\u0190"+
		"\7t\2\2\u0190\u0191\7g\2\2\u0191\u0192\7c\2\2\u0192\u0193\7e\2\2\u0193"+
		"\u0194\7j\2\2\u0194\u0084\3\2\2\2\u0195\u0196\7y\2\2\u0196\u0197\7j\2"+
		"\2\u0197\u0198\7k\2\2\u0198\u0199\7n\2\2\u0199\u019a\7g\2\2\u019a\u0086"+
		"\3\2\2\2\u019b\u019c\7d\2\2\u019c\u019d\7t\2\2\u019d\u019e\7g\2\2\u019e"+
		"\u019f\7c\2\2\u019f\u01a0\7m\2\2\u01a0\u0088\3\2\2\2\u01a1\u01a2\7e\2"+
		"\2\u01a2\u01a3\7q\2\2\u01a3\u01a4\7p\2\2\u01a4\u01a5\7v\2\2\u01a5\u01a6"+
		"\7k\2\2\u01a6\u01a7\7p\2\2\u01a7\u01a8\7w\2\2\u01a8\u01a9\7g\2\2\u01a9"+
		"\u008a\3\2\2\2\u01aa\u01ab\7t\2\2\u01ab\u01ac\7g\2\2\u01ac\u01ad\7v\2"+
		"\2\u01ad\u01ae\7w\2\2\u01ae\u01af\7t\2\2\u01af\u01b0\7p\2\2\u01b0\u008c"+
		"\3\2\2\2\u01b1\u01b2\7u\2\2\u01b2\u01b3\7y\2\2\u01b3\u01b4\7k\2\2\u01b4"+
		"\u01b5\7v\2\2\u01b5\u01b6\7e\2\2\u01b6\u01b7\7j\2\2\u01b7\u008e\3\2\2"+
		"\2\u01b8\u01b9\7e\2\2\u01b9\u01ba\7c\2\2\u01ba\u01bb\7u\2\2\u01bb\u01bc"+
		"\7g\2\2\u01bc\u0090\3\2\2\2\u01bd\u01be\7f\2\2\u01be\u01bf\7g\2\2\u01bf"+
		"\u01c0\7h\2\2\u01c0\u01c1\7c\2\2\u01c1\u01c2\7w\2\2\u01c2\u01c3\7n\2\2"+
		"\u01c3\u01c4\7v\2\2\u01c4\u0092\3\2\2\2\u01c5\u01c6\7v\2\2\u01c6\u01c7"+
		"\7j\2\2\u01c7\u01c8\7k\2\2\u01c8\u01c9\7u\2\2\u01c9\u0094\3\2\2\2\u01ca"+
		"\u01ce\5\u00b1Y\2\u01cb\u01cd\5\u00afX\2\u01cc\u01cb\3\2\2\2\u01cd\u01d0"+
		"\3\2\2\2\u01ce\u01cc\3\2\2\2\u01ce\u01cf\3\2\2\2\u01cf\u0096\3\2\2\2\u01d0"+
		"\u01ce\3\2\2\2\u01d1\u01d5\7$\2\2\u01d2\u01d4\5\u00a3R\2\u01d3\u01d2\3"+
		"\2\2\2\u01d4\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d8\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01e2\7$\2\2\u01d9\u01dd\7)\2"+
		"\2\u01da\u01dc\5\u00a5S\2\u01db\u01da\3\2\2\2\u01dc\u01df\3\2\2\2\u01dd"+
		"\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01e0\3\2\2\2\u01df\u01dd\3\2"+
		"\2\2\u01e0\u01e2\7)\2\2\u01e1\u01d1\3\2\2\2\u01e1\u01d9\3\2\2\2\u01e2"+
		"\u0098\3\2\2\2\u01e3\u01e5\t\3\2\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2"+
		"\2\2\u01e6\u01e4\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8"+
		"\u01e9\bM\2\2\u01e9\u009a\3\2\2\2\u01ea\u01eb\t\4\2\2\u01eb\u01ec\3\2"+
		"\2\2\u01ec\u01ed\bN\2\2\u01ed\u009c\3\2\2\2\u01ee\u01ef\7\61\2\2\u01ef"+
		"\u01f0\7,\2\2\u01f0\u01f4\3\2\2\2\u01f1\u01f3\13\2\2\2\u01f2\u01f1\3\2"+
		"\2\2\u01f3\u01f6\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f4\u01f2\3\2\2\2\u01f5"+
		"\u01f7\3\2\2\2\u01f6\u01f4\3\2\2\2\u01f7\u01f8\7,\2\2\u01f8\u01f9\7\61"+
		"\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01fb\bO\2\2\u01fb\u009e\3\2\2\2\u01fc"+
		"\u01fd\7\61\2\2\u01fd\u01fe\7\61\2\2\u01fe\u0202\3\2\2\2\u01ff\u0201\n"+
		"\4\2\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200\3\2\2\2\u0202"+
		"\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205\u0206\bP"+
		"\2\2\u0206\u00a0\3\2\2\2\u0207\u0208\13\2\2\2\u0208\u00a2\3\2\2\2\u0209"+
		"\u020d\n\5\2\2\u020a\u020b\7^\2\2\u020b\u020d\5\u00a7T\2\u020c\u0209\3"+
		"\2\2\2\u020c\u020a\3\2\2\2\u020d\u00a4\3\2\2\2\u020e\u0212\n\6\2\2\u020f"+
		"\u0210\7^\2\2\u0210\u0212\5\u00a7T\2\u0211\u020e\3\2\2\2\u0211\u020f\3"+
		"\2\2\2\u0212\u00a6\3\2\2\2\u0213\u0214\5\u00a9U\2\u0214\u00a8\3\2\2\2"+
		"\u0215\u0216\7z\2\2\u0216\u0217\5\u00adW\2\u0217\u0218\5\u00adW\2\u0218"+
		"\u00aa\3\2\2\2\u0219\u021a\t\7\2\2\u021a\u00ac\3\2\2\2\u021b\u021c\t\b"+
		"\2\2\u021c\u00ae\3\2\2\2\u021d\u0220\5\u00b1Y\2\u021e\u0220\t\t\2\2\u021f"+
		"\u021d\3\2\2\2\u021f\u021e\3\2\2\2\u0220\u00b0\3\2\2\2\u0221\u0225\t\n"+
		"\2\2\u0222\u0223\7^\2\2\u0223\u0225\5\u00a9U\2\u0224\u0221\3\2\2\2\u0224"+
		"\u0222\3\2\2\2\u0225\u00b2\3\2\2\2\21\2\u00bc\u00c1\u00c8\u01ce\u01d5"+
		"\u01dd\u01e1\u01e6\u01f4\u0202\u020c\u0211\u021f\u0224\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}