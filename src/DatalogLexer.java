// Generated from E:/Octavo_Semestre/Compiladores/Datalog/src\Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IntegerLiteral=1, FloatingPointLiteral=2, BooleanLiteral=3, CharacterLiteral=4, 
		StringLiteral=5, Identifier=6, NOT=7, COUNT=8, AVG=9, SUM=10, MIN=11, 
		MAX=12, LT=13, GT=14, ELT=15, EGT=16, EQ=17, TRUE=18, FALSE=19, ESCAPE=20, 
		IDE=21, COMILLA=22, ESCAPECHAR=23, ZERO=24, DOT=25, COMA=26, GUION=27, 
		OPEN=28, CLOSE=29, QUERYINIT=30, RULENINIT=31, ALFA=32, ALFANUM=33, WS=34, 
		COMMENT=35, MULTILINE_COMMENT=36, Predicate=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
			"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
			"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
			"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
			"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", 
			"OctalDigitsAndUnderscores", "OctalDigitOrUnderscore", "BinaryNumeral", 
			"BinaryDigits", "BinaryDigit", "BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", 
			"FloatingPointLiteral", "DecimalFloatingPointLiteral", "ExponentPart", 
			"ExponentIndicator", "SignedInteger", "Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", 
			"HexSignificand", "BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", 
			"CharacterLiteral", "SingleCharacter", "StringLiteral", "StringCharacters", 
			"StringCharacter", "EscapeSequence", "OctalEscape", "ZeroToThree", "Identifier", 
			"IdentifierLetter", "IdentifierLetterOrDigit", "NOT", "COUNT", "AVG", 
			"SUM", "MIN", "MAX", "LT", "GT", "ELT", "EGT", "EQ", "TRUE", "FALSE", 
			"ESCAPE", "IDE", "COMILLA", "ESCAPECHAR", "ZERO", "DOT", "COMA", "GUION", 
			"OPEN", "CLOSE", "QUERYINIT", "RULENINIT", "ALFA", "ALFANUM", "WS", "COMMENT", 
			"MULTILINE_COMMENT", "Predicate"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, "'not'", "'count'", "'avg'", 
			"'sum'", "'min'", "'max'", "'<'", "'>'", "'<='", "'>='", "'='", "'true'", 
			"'false'", "'\\'", "'?'", "'\"'", "'''", "'0'", "'.'", "','", "'_'", 
			"'('", "')'", "'?-'", "':-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
			"StringLiteral", "Identifier", "NOT", "COUNT", "AVG", "SUM", "MIN", "MAX", 
			"LT", "GT", "ELT", "EGT", "EQ", "TRUE", "FALSE", "ESCAPE", "IDE", "COMILLA", 
			"ESCAPECHAR", "ZERO", "DOT", "COMA", "GUION", "OPEN", "CLOSE", "QUERYINIT", 
			"RULENINIT", "ALFA", "ALFANUM", "WS", "COMMENT", "MULTILINE_COMMENT", 
			"Predicate"
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u022c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\3\2\3"+
		"\2\3\2\3\2\5\2\u00ac\n\2\3\3\3\3\5\3\u00b0\n\3\3\4\3\4\5\4\u00b4\n\4\3"+
		"\5\3\5\5\5\u00b8\n\5\3\6\3\6\5\6\u00bc\n\6\3\7\3\7\3\b\3\b\3\b\5\b\u00c3"+
		"\n\b\3\b\3\b\3\b\5\b\u00c8\n\b\5\b\u00ca\n\b\3\t\3\t\5\t\u00ce\n\t\3\t"+
		"\5\t\u00d1\n\t\3\n\3\n\5\n\u00d5\n\n\3\13\3\13\3\f\6\f\u00da\n\f\r\f\16"+
		"\f\u00db\3\r\3\r\5\r\u00e0\n\r\3\16\6\16\u00e3\n\16\r\16\16\16\u00e4\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\5\20\u00ed\n\20\3\20\5\20\u00f0\n\20\3\21"+
		"\3\21\3\22\6\22\u00f5\n\22\r\22\16\22\u00f6\3\23\3\23\5\23\u00fb\n\23"+
		"\3\24\3\24\5\24\u00ff\n\24\3\24\3\24\3\25\3\25\5\25\u0105\n\25\3\25\5"+
		"\25\u0108\n\25\3\26\3\26\3\27\6\27\u010d\n\27\r\27\16\27\u010e\3\30\3"+
		"\30\5\30\u0113\n\30\3\31\3\31\3\31\3\31\3\32\3\32\5\32\u011b\n\32\3\32"+
		"\5\32\u011e\n\32\3\33\3\33\3\34\6\34\u0123\n\34\r\34\16\34\u0124\3\35"+
		"\3\35\5\35\u0129\n\35\3\36\3\36\5\36\u012d\n\36\3\37\3\37\3\37\5\37\u0132"+
		"\n\37\3\37\5\37\u0135\n\37\3\37\5\37\u0138\n\37\3\37\3\37\3\37\5\37\u013d"+
		"\n\37\3\37\5\37\u0140\n\37\3\37\3\37\3\37\5\37\u0145\n\37\3\37\3\37\3"+
		"\37\5\37\u014a\n\37\3 \3 \3 \3!\3!\3\"\5\"\u0152\n\"\3\"\3\"\3#\3#\3$"+
		"\3$\3%\3%\3%\5%\u015d\n%\3&\3&\5&\u0161\n&\3&\3&\3&\5&\u0166\n&\3&\3&"+
		"\3&\5&\u016b\n&\3\'\3\'\3\'\3(\3(\3)\3)\5)\u0174\n)\3*\3*\3*\3*\3*\3*"+
		"\3*\3*\5*\u017e\n*\3+\3+\3,\3,\5,\u0184\n,\3,\3,\3-\6-\u0189\n-\r-\16"+
		"-\u018a\3.\3.\5.\u018f\n.\3/\3/\3/\3/\5/\u0195\n/\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\5\60\u01a3\n\60\3\61\3\61\3\62"+
		"\3\62\3\62\7\62\u01aa\n\62\f\62\16\62\u01ad\13\62\3\63\3\63\3\64\3\64"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3;\3;\3<\3<\3=\3=\3=\3>\3>\3>\3?"+
		"\3?\3@\3@\3@\3@\3@\3A\3A\3A\3A\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G"+
		"\3G\3H\3H\3I\3I\3J\3J\3K\3K\3L\3L\3L\3M\3M\3M\3N\3N\3O\3O\3P\6P\u0203"+
		"\nP\rP\16P\u0204\3P\3P\3Q\3Q\7Q\u020b\nQ\fQ\16Q\u020e\13Q\3Q\5Q\u0211"+
		"\nQ\3Q\3Q\3R\3R\3R\3R\3R\7R\u021a\nR\fR\16R\u021d\13R\3R\3R\3R\5R\u0222"+
		"\nR\3R\3R\3S\3S\7S\u0228\nS\fS\16S\u022b\13S\3\u021b\2T\3\3\5\2\7\2\t"+
		"\2\13\2\r\2\17\2\21\2\23\2\25\2\27\2\31\2\33\2\35\2\37\2!\2#\2%\2\'\2"+
		")\2+\2-\2/\2\61\2\63\2\65\2\67\29\2;\4=\2?\2A\2C\2E\2G\2I\2K\2M\2O\2Q"+
		"\5S\6U\2W\7Y\2[\2]\2_\2a\2c\be\2g\2i\tk\nm\13o\fq\rs\16u\17w\20y\21{\22"+
		"}\23\177\24\u0081\25\u0083\26\u0085\27\u0087\30\u0089\31\u008b\32\u008d"+
		"\33\u008f\34\u0091\35\u0093\36\u0095\37\u0097 \u0099!\u009b\"\u009d#\u009f"+
		"$\u00a1%\u00a3&\u00a5\'\3\2\26\4\2NNnn\3\2\63;\4\2ZZzz\5\2\62;CHch\3\2"+
		"\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRrr\6\2\f\f\17"+
		"\17))^^\6\2\f\f\17\17$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\4\2C\\c|\6\2\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\4\3\f\f\17\17\2\u0239\2\3\3"+
		"\2\2\2\2;\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2W\3\2\2\2\2c\3\2\2\2\2i\3\2\2"+
		"\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2"+
		"w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2"+
		"\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b"+
		"\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2"+
		"\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d"+
		"\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2"+
		"\2\3\u00ab\3\2\2\2\5\u00ad\3\2\2\2\7\u00b1\3\2\2\2\t\u00b5\3\2\2\2\13"+
		"\u00b9\3\2\2\2\r\u00bd\3\2\2\2\17\u00c9\3\2\2\2\21\u00cb\3\2\2\2\23\u00d4"+
		"\3\2\2\2\25\u00d6\3\2\2\2\27\u00d9\3\2\2\2\31\u00df\3\2\2\2\33\u00e2\3"+
		"\2\2\2\35\u00e6\3\2\2\2\37\u00ea\3\2\2\2!\u00f1\3\2\2\2#\u00f4\3\2\2\2"+
		"%\u00fa\3\2\2\2\'\u00fc\3\2\2\2)\u0102\3\2\2\2+\u0109\3\2\2\2-\u010c\3"+
		"\2\2\2/\u0112\3\2\2\2\61\u0114\3\2\2\2\63\u0118\3\2\2\2\65\u011f\3\2\2"+
		"\2\67\u0122\3\2\2\29\u0128\3\2\2\2;\u012c\3\2\2\2=\u0149\3\2\2\2?\u014b"+
		"\3\2\2\2A\u014e\3\2\2\2C\u0151\3\2\2\2E\u0155\3\2\2\2G\u0157\3\2\2\2I"+
		"\u0159\3\2\2\2K\u016a\3\2\2\2M\u016c\3\2\2\2O\u016f\3\2\2\2Q\u0173\3\2"+
		"\2\2S\u017d\3\2\2\2U\u017f\3\2\2\2W\u0181\3\2\2\2Y\u0188\3\2\2\2[\u018e"+
		"\3\2\2\2]\u0194\3\2\2\2_\u01a2\3\2\2\2a\u01a4\3\2\2\2c\u01a6\3\2\2\2e"+
		"\u01ae\3\2\2\2g\u01b0\3\2\2\2i\u01b2\3\2\2\2k\u01b6\3\2\2\2m\u01bc\3\2"+
		"\2\2o\u01c0\3\2\2\2q\u01c4\3\2\2\2s\u01c8\3\2\2\2u\u01cc\3\2\2\2w\u01ce"+
		"\3\2\2\2y\u01d0\3\2\2\2{\u01d3\3\2\2\2}\u01d6\3\2\2\2\177\u01d8\3\2\2"+
		"\2\u0081\u01dd\3\2\2\2\u0083\u01e3\3\2\2\2\u0085\u01e5\3\2\2\2\u0087\u01e7"+
		"\3\2\2\2\u0089\u01e9\3\2\2\2\u008b\u01eb\3\2\2\2\u008d\u01ed\3\2\2\2\u008f"+
		"\u01ef\3\2\2\2\u0091\u01f1\3\2\2\2\u0093\u01f3\3\2\2\2\u0095\u01f5\3\2"+
		"\2\2\u0097\u01f7\3\2\2\2\u0099\u01fa\3\2\2\2\u009b\u01fd\3\2\2\2\u009d"+
		"\u01ff\3\2\2\2\u009f\u0202\3\2\2\2\u00a1\u0208\3\2\2\2\u00a3\u0214\3\2"+
		"\2\2\u00a5\u0225\3\2\2\2\u00a7\u00ac\5\5\3\2\u00a8\u00ac\5\7\4\2\u00a9"+
		"\u00ac\5\t\5\2\u00aa\u00ac\5\13\6\2\u00ab\u00a7\3\2\2\2\u00ab\u00a8\3"+
		"\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00aa\3\2\2\2\u00ac\4\3\2\2\2\u00ad\u00af"+
		"\5\17\b\2\u00ae\u00b0\5\r\7\2\u00af\u00ae\3\2\2\2\u00af\u00b0\3\2\2\2"+
		"\u00b0\6\3\2\2\2\u00b1\u00b3\5\35\17\2\u00b2\u00b4\5\r\7\2\u00b3\u00b2"+
		"\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\b\3\2\2\2\u00b5\u00b7\5\'\24\2\u00b6"+
		"\u00b8\5\r\7\2\u00b7\u00b6\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\n\3\2\2\2"+
		"\u00b9\u00bb\5\61\31\2\u00ba\u00bc\5\r\7\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\f\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\16\3\2\2\2\u00bf\u00ca"+
		"\5\u008bF\2\u00c0\u00c7\5\25\13\2\u00c1\u00c3\5\21\t\2\u00c2\u00c1\3\2"+
		"\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c8\3\2\2\2\u00c4\u00c5\5\33\16\2\u00c5"+
		"\u00c6\5\21\t\2\u00c6\u00c8\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c7\u00c4\3"+
		"\2\2\2\u00c8\u00ca\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9\u00c0\3\2\2\2\u00ca"+
		"\20\3\2\2\2\u00cb\u00d0\5\23\n\2\u00cc\u00ce\5\27\f\2\u00cd\u00cc\3\2"+
		"\2\2\u00cd\u00ce\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d1\5\23\n\2\u00d0"+
		"\u00cd\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\22\3\2\2\2\u00d2\u00d5\5\u008b"+
		"F\2\u00d3\u00d5\5\25\13\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5"+
		"\24\3\2\2\2\u00d6\u00d7\t\3\2\2\u00d7\26\3\2\2\2\u00d8\u00da\5\31\r\2"+
		"\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00d9\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\30\3\2\2\2\u00dd\u00e0\5\23\n\2\u00de\u00e0\5\u0091I\2"+
		"\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\32\3\2\2\2\u00e1\u00e3"+
		"\5\u0091I\2\u00e2\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e2\3\2\2"+
		"\2\u00e4\u00e5\3\2\2\2\u00e5\34\3\2\2\2\u00e6\u00e7\5\u008bF\2\u00e7\u00e8"+
		"\t\4\2\2\u00e8\u00e9\5\37\20\2\u00e9\36\3\2\2\2\u00ea\u00ef\5!\21\2\u00eb"+
		"\u00ed\5#\22\2\u00ec\u00eb\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed\u00ee\3\2"+
		"\2\2\u00ee\u00f0\5!\21\2\u00ef\u00ec\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0"+
		" \3\2\2\2\u00f1\u00f2\t\5\2\2\u00f2\"\3\2\2\2\u00f3\u00f5\5%\23\2\u00f4"+
		"\u00f3\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2"+
		"\2\2\u00f7$\3\2\2\2\u00f8\u00fb\5!\21\2\u00f9\u00fb\5\u0091I\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00f9\3\2\2\2\u00fb&\3\2\2\2\u00fc\u00fe\5\u008bF\2\u00fd"+
		"\u00ff\5\33\16\2\u00fe\u00fd\3\2\2\2\u00fe\u00ff\3\2\2\2\u00ff\u0100\3"+
		"\2\2\2\u0100\u0101\5)\25\2\u0101(\3\2\2\2\u0102\u0107\5+\26\2\u0103\u0105"+
		"\5-\27\2\u0104\u0103\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106\3\2\2\2\u0106"+
		"\u0108\5+\26\2\u0107\u0104\3\2\2\2\u0107\u0108\3\2\2\2\u0108*\3\2\2\2"+
		"\u0109\u010a\t\6\2\2\u010a,\3\2\2\2\u010b\u010d\5/\30\2\u010c\u010b\3"+
		"\2\2\2\u010d\u010e\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010f"+
		".\3\2\2\2\u0110\u0113\5+\26\2\u0111\u0113\5\u0091I\2\u0112\u0110\3\2\2"+
		"\2\u0112\u0111\3\2\2\2\u0113\60\3\2\2\2\u0114\u0115\5\u008bF\2\u0115\u0116"+
		"\t\7\2\2\u0116\u0117\5\63\32\2\u0117\62\3\2\2\2\u0118\u011d\5\65\33\2"+
		"\u0119\u011b\5\67\34\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c"+
		"\3\2\2\2\u011c\u011e\5\65\33\2\u011d\u011a\3\2\2\2\u011d\u011e\3\2\2\2"+
		"\u011e\64\3\2\2\2\u011f\u0120\t\b\2\2\u0120\66\3\2\2\2\u0121\u0123\59"+
		"\35\2\u0122\u0121\3\2\2\2\u0123\u0124\3\2\2\2\u0124\u0122\3\2\2\2\u0124"+
		"\u0125\3\2\2\2\u01258\3\2\2\2\u0126\u0129\5\65\33\2\u0127\u0129\5\u0091"+
		"I\2\u0128\u0126\3\2\2\2\u0128\u0127\3\2\2\2\u0129:\3\2\2\2\u012a\u012d"+
		"\5=\37\2\u012b\u012d\5I%\2\u012c\u012a\3\2\2\2\u012c\u012b\3\2\2\2\u012d"+
		"<\3\2\2\2\u012e\u012f\5\21\t\2\u012f\u0131\5\u008dG\2\u0130\u0132\5\21"+
		"\t\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133"+
		"\u0135\5? \2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u0137\3\2\2"+
		"\2\u0136\u0138\5G$\2\u0137\u0136\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u014a"+
		"\3\2\2\2\u0139\u013a\5\u008dG\2\u013a\u013c\5\21\t\2\u013b\u013d\5? \2"+
		"\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013f\3\2\2\2\u013e\u0140"+
		"\5G$\2\u013f\u013e\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u014a\3\2\2\2\u0141"+
		"\u0142\5\21\t\2\u0142\u0144\5? \2\u0143\u0145\5G$\2\u0144\u0143\3\2\2"+
		"\2\u0144\u0145\3\2\2\2\u0145\u014a\3\2\2\2\u0146\u0147\5\21\t\2\u0147"+
		"\u0148\5G$\2\u0148\u014a\3\2\2\2\u0149\u012e\3\2\2\2\u0149\u0139\3\2\2"+
		"\2\u0149\u0141\3\2\2\2\u0149\u0146\3\2\2\2\u014a>\3\2\2\2\u014b\u014c"+
		"\5A!\2\u014c\u014d\5C\"\2\u014d@\3\2\2\2\u014e\u014f\t\t\2\2\u014fB\3"+
		"\2\2\2\u0150\u0152\5E#\2\u0151\u0150\3\2\2\2\u0151\u0152\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\u0154\5\21\t\2\u0154D\3\2\2\2\u0155\u0156\t\n\2\2"+
		"\u0156F\3\2\2\2\u0157\u0158\t\13\2\2\u0158H\3\2\2\2\u0159\u015a\5K&\2"+
		"\u015a\u015c\5M\'\2\u015b\u015d\5G$\2\u015c\u015b\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015dJ\3\2\2\2\u015e\u0160\5\35\17\2\u015f\u0161\5\u008dG\2\u0160"+
		"\u015f\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u016b\3\2\2\2\u0162\u0163\5\u008b"+
		"F\2\u0163\u0165\t\4\2\2\u0164\u0166\5\37\20\2\u0165\u0164\3\2\2\2\u0165"+
		"\u0166\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\5\u008dG\2\u0168\u0169"+
		"\5\37\20\2\u0169\u016b\3\2\2\2\u016a\u015e\3\2\2\2\u016a\u0162\3\2\2\2"+
		"\u016bL\3\2\2\2\u016c\u016d\5O(\2\u016d\u016e\5C\"\2\u016eN\3\2\2\2\u016f"+
		"\u0170\t\f\2\2\u0170P\3\2\2\2\u0171\u0174\5\177@\2\u0172\u0174\5\u0081"+
		"A\2\u0173\u0171\3\2\2\2\u0173\u0172\3\2\2\2\u0174R\3\2\2\2\u0175\u0176"+
		"\5\u0089E\2\u0176\u0177\5U+\2\u0177\u0178\5\u0089E\2\u0178\u017e\3\2\2"+
		"\2\u0179\u017a\5\u0089E\2\u017a\u017b\5]/\2\u017b\u017c\5\u0089E\2\u017c"+
		"\u017e\3\2\2\2\u017d\u0175\3\2\2\2\u017d\u0179\3\2\2\2\u017eT\3\2\2\2"+
		"\u017f\u0180\n\r\2\2\u0180V\3\2\2\2\u0181\u0183\5\u0087D\2\u0182\u0184"+
		"\5Y-\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u0186\5\u0087D\2\u0186X\3\2\2\2\u0187\u0189\5[.\2\u0188\u0187\3\2\2\2"+
		"\u0189\u018a\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018bZ\3"+
		"\2\2\2\u018c\u018f\n\16\2\2\u018d\u018f\5]/\2\u018e\u018c\3\2\2\2\u018e"+
		"\u018d\3\2\2\2\u018f\\\3\2\2\2\u0190\u0191\5\u0083B\2\u0191\u0192\t\17"+
		"\2\2\u0192\u0195\3\2\2\2\u0193\u0195\5_\60\2\u0194\u0190\3\2\2\2\u0194"+
		"\u0193\3\2\2\2\u0195^\3\2\2\2\u0196\u0197\5\u0083B\2\u0197\u0198\5+\26"+
		"\2\u0198\u01a3\3\2\2\2\u0199\u019a\5\u0083B\2\u019a\u019b\5+\26\2\u019b"+
		"\u019c\5+\26\2\u019c\u01a3\3\2\2\2\u019d\u019e\5\u0083B\2\u019e\u019f"+
		"\5a\61\2\u019f\u01a0\5+\26\2\u01a0\u01a1\5+\26\2\u01a1\u01a3\3\2\2\2\u01a2"+
		"\u0196\3\2\2\2\u01a2\u0199\3\2\2\2\u01a2\u019d\3\2\2\2\u01a3`\3\2\2\2"+
		"\u01a4\u01a5\t\20\2\2\u01a5b\3\2\2\2\u01a6\u01a7\5\u0085C\2\u01a7\u01ab"+
		"\5e\63\2\u01a8\u01aa\5g\64\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab"+
		"\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01acd\3\2\2\2\u01ad\u01ab\3\2\2\2"+
		"\u01ae\u01af\5\u009bN\2\u01aff\3\2\2\2\u01b0\u01b1\5\u009dO\2\u01b1h\3"+
		"\2\2\2\u01b2\u01b3\7p\2\2\u01b3\u01b4\7q\2\2\u01b4\u01b5\7v\2\2\u01b5"+
		"j\3\2\2\2\u01b6\u01b7\7e\2\2\u01b7\u01b8\7q\2\2\u01b8\u01b9\7w\2\2\u01b9"+
		"\u01ba\7p\2\2\u01ba\u01bb\7v\2\2\u01bbl\3\2\2\2\u01bc\u01bd\7c\2\2\u01bd"+
		"\u01be\7x\2\2\u01be\u01bf\7i\2\2\u01bfn\3\2\2\2\u01c0\u01c1\7u\2\2\u01c1"+
		"\u01c2\7w\2\2\u01c2\u01c3\7o\2\2\u01c3p\3\2\2\2\u01c4\u01c5\7o\2\2\u01c5"+
		"\u01c6\7k\2\2\u01c6\u01c7\7p\2\2\u01c7r\3\2\2\2\u01c8\u01c9\7o\2\2\u01c9"+
		"\u01ca\7c\2\2\u01ca\u01cb\7z\2\2\u01cbt\3\2\2\2\u01cc\u01cd\7>\2\2\u01cd"+
		"v\3\2\2\2\u01ce\u01cf\7@\2\2\u01cfx\3\2\2\2\u01d0\u01d1\7>\2\2\u01d1\u01d2"+
		"\7?\2\2\u01d2z\3\2\2\2\u01d3\u01d4\7@\2\2\u01d4\u01d5\7?\2\2\u01d5|\3"+
		"\2\2\2\u01d6\u01d7\7?\2\2\u01d7~\3\2\2\2\u01d8\u01d9\7v\2\2\u01d9\u01da"+
		"\7t\2\2\u01da\u01db\7w\2\2\u01db\u01dc\7g\2\2\u01dc\u0080\3\2\2\2\u01dd"+
		"\u01de\7h\2\2\u01de\u01df\7c\2\2\u01df\u01e0\7n\2\2\u01e0\u01e1\7u\2\2"+
		"\u01e1\u01e2\7g\2\2\u01e2\u0082\3\2\2\2\u01e3\u01e4\7^\2\2\u01e4\u0084"+
		"\3\2\2\2\u01e5\u01e6\7A\2\2\u01e6\u0086\3\2\2\2\u01e7\u01e8\7$\2\2\u01e8"+
		"\u0088\3\2\2\2\u01e9\u01ea\7)\2\2\u01ea\u008a\3\2\2\2\u01eb\u01ec\7\62"+
		"\2\2\u01ec\u008c\3\2\2\2\u01ed\u01ee\7\60\2\2\u01ee\u008e\3\2\2\2\u01ef"+
		"\u01f0\7.\2\2\u01f0\u0090\3\2\2\2\u01f1\u01f2\7a\2\2\u01f2\u0092\3\2\2"+
		"\2\u01f3\u01f4\7*\2\2\u01f4\u0094\3\2\2\2\u01f5\u01f6\7+\2\2\u01f6\u0096"+
		"\3\2\2\2\u01f7\u01f8\7A\2\2\u01f8\u01f9\7/\2\2\u01f9\u0098\3\2\2\2\u01fa"+
		"\u01fb\7<\2\2\u01fb\u01fc\7/\2\2\u01fc\u009a\3\2\2\2\u01fd\u01fe\t\21"+
		"\2\2\u01fe\u009c\3\2\2\2\u01ff\u0200\t\22\2\2\u0200\u009e\3\2\2\2\u0201"+
		"\u0203\t\23\2\2\u0202\u0201\3\2\2\2\u0203\u0204\3\2\2\2\u0204\u0202\3"+
		"\2\2\2\u0204\u0205\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\bP\2\2\u0207"+
		"\u00a0\3\2\2\2\u0208\u020c\7\'\2\2\u0209\u020b\n\24\2\2\u020a\u0209\3"+
		"\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d\3\2\2\2\u020d"+
		"\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0211\t\25\2\2\u0210\u020f\3"+
		"\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\bQ\2\2\u0213\u00a2\3\2\2\2\u0214"+
		"\u0215\7\61\2\2\u0215\u0216\7,\2\2\u0216\u021b\3\2\2\2\u0217\u021a\5\u00a3"+
		"R\2\u0218\u021a\13\2\2\2\u0219\u0217\3\2\2\2\u0219\u0218\3\2\2\2\u021a"+
		"\u021d\3\2\2\2\u021b\u021c\3\2\2\2\u021b\u0219\3\2\2\2\u021c\u0221\3\2"+
		"\2\2\u021d\u021b\3\2\2\2\u021e\u021f\7,\2\2\u021f\u0222\7\61\2\2\u0220"+
		"\u0222\7\2\2\3\u0221\u021e\3\2\2\2\u0221\u0220\3\2\2\2\u0222\u0223\3\2"+
		"\2\2\u0223\u0224\bR\2\2\u0224\u00a4\3\2\2\2\u0225\u0229\5e\63\2\u0226"+
		"\u0228\5g\64\2\u0227\u0226\3\2\2\2\u0228\u022b\3\2\2\2\u0229\u0227\3\2"+
		"\2\2\u0229\u022a\3\2\2\2\u022a\u00a6\3\2\2\2\u022b\u0229\3\2\2\2:\2\u00ab"+
		"\u00af\u00b3\u00b7\u00bb\u00c2\u00c7\u00c9\u00cd\u00d0\u00d4\u00db\u00df"+
		"\u00e4\u00ec\u00ef\u00f6\u00fa\u00fe\u0104\u0107\u010e\u0112\u011a\u011d"+
		"\u0124\u0128\u012c\u0131\u0134\u0137\u013c\u013f\u0144\u0149\u0151\u015c"+
		"\u0160\u0165\u016a\u0173\u017d\u0183\u018a\u018e\u0194\u01a2\u01ab\u0204"+
		"\u020c\u0210\u0219\u021b\u0221\u0229\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}