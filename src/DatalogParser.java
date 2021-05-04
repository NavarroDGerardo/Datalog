// Generated from E:/Octavo_Semestre/Compiladores/Datalog/src\Datalog.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_fact = 1, RULE_literalList = 2, RULE_facts = 3, 
		RULE_rulen = 4, RULE_rules = 5, RULE_query = 6, RULE_atom = 7, RULE_otro = 8, 
		RULE_atoms = 9, RULE_variableOrLiteral = 10, RULE_variableOrLiterals = 11, 
		RULE_aggregateVariable = 12, RULE_relOp = 13, RULE_aggregateOp = 14, RULE_variable = 15, 
		RULE_predicate = 16, RULE_literal = 17;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "fact", "literalList", "facts", "rulen", "rules", "query", 
			"atom", "otro", "atoms", "variableOrLiteral", "variableOrLiterals", "aggregateVariable", 
			"relOp", "aggregateOp", "variable", "predicate", "literal"
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

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public DatalogParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public FactsContext facts() {
			return getRuleContext(FactsContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public RulesContext rules() {
			return getRuleContext(RulesContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			setState(44);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				facts();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(37);
					facts();
					}
					break;
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT || _la==Predicate) {
					{
					setState(40);
					rules();
					}
				}

				setState(43);
				query();
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

	public static class FactContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(DatalogParser.OPEN, 0); }
		public LiteralListContext literalList() {
			return getRuleContext(LiteralListContext.class,0);
		}
		public TerminalNode CLOSE() { return getToken(DatalogParser.CLOSE, 0); }
		public TerminalNode DOT() { return getToken(DatalogParser.DOT, 0); }
		public FactContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fact; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFact(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFact(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFact(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactContext fact() throws RecognitionException {
		FactContext _localctx = new FactContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_fact);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			predicate();
			setState(47);
			match(OPEN);
			setState(48);
			literalList();
			setState(49);
			match(CLOSE);
			setState(50);
			match(DOT);
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

	public static class LiteralListContext extends ParserRuleContext {
		public List<LiteralContext> literal() {
			return getRuleContexts(LiteralContext.class);
		}
		public LiteralContext literal(int i) {
			return getRuleContext(LiteralContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DatalogParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DatalogParser.COMA, i);
		}
		public LiteralListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteralList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteralList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLiteralList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralListContext literalList() throws RecognitionException {
		LiteralListContext _localctx = new LiteralListContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literalList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			literal();
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(53);
				match(COMA);
				setState(54);
				literal();
				}
				}
				setState(59);
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

	public static class FactsContext extends ParserRuleContext {
		public List<FactContext> fact() {
			return getRuleContexts(FactContext.class);
		}
		public FactContext fact(int i) {
			return getRuleContext(FactContext.class,i);
		}
		public FactsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_facts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterFacts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitFacts(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitFacts(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactsContext facts() throws RecognitionException {
		FactsContext _localctx = new FactsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_facts);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(60);
					fact();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(63); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class RulenContext extends ParserRuleContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode RULENINIT() { return getToken(DatalogParser.RULENINIT, 0); }
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DatalogParser.DOT, 0); }
		public RulenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rulen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRulen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRulen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitRulen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulenContext rulen() throws RecognitionException {
		RulenContext _localctx = new RulenContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_rulen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			atom();
			setState(66);
			match(RULENINIT);
			setState(67);
			atoms();
			setState(68);
			match(DOT);
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

	public static class RulesContext extends ParserRuleContext {
		public List<RulenContext> rulen() {
			return getRuleContexts(RulenContext.class);
		}
		public RulenContext rulen(int i) {
			return getRuleContext(RulenContext.class,i);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRules(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitRules(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_rules);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(70);
				rulen();
				}
				}
				setState(73); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==NOT || _la==Predicate );
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode QUERYINIT() { return getToken(DatalogParser.QUERYINIT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode RULENINIT() { return getToken(DatalogParser.RULENINIT, 0); }
		public AtomsContext atoms() {
			return getRuleContext(AtomsContext.class,0);
		}
		public TerminalNode DOT() { return getToken(DatalogParser.DOT, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(QUERYINIT);
			setState(76);
			atom();
			setState(77);
			match(RULENINIT);
			setState(78);
			atoms();
			setState(79);
			match(DOT);
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

	public static class AtomContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public OtroContext otro() {
			return getRuleContext(OtroContext.class,0);
		}
		public TerminalNode NOT() { return getToken(DatalogParser.NOT, 0); }
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Predicate:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				predicate();
				setState(82);
				otro();
				}
				break;
			case NOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(NOT);
				setState(85);
				atom();
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

	public static class OtroContext extends ParserRuleContext {
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public VariableOrLiteralsContext variableOrLiterals() {
			return getRuleContext(VariableOrLiteralsContext.class,0);
		}
		public TerminalNode OPEN() { return getToken(DatalogParser.OPEN, 0); }
		public TerminalNode CLOSE() { return getToken(DatalogParser.CLOSE, 0); }
		public OtroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_otro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterOtro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitOtro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitOtro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OtroContext otro() throws RecognitionException {
		OtroContext _localctx = new OtroContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_otro);
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
			case GT:
			case ELT:
			case EGT:
			case EQ:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				relOp();
				setState(89);
				variableOrLiterals();
				}
				break;
			case OPEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(OPEN);
				setState(92);
				variableOrLiterals();
				setState(93);
				match(CLOSE);
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

	public static class AtomsContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DatalogParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DatalogParser.COMA, i);
		}
		public AtomsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atoms; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAtoms(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAtoms(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAtoms(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomsContext atoms() throws RecognitionException {
		AtomsContext _localctx = new AtomsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atoms);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			atom();
			setState(102);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(98);
				match(COMA);
				setState(99);
				atom();
				}
				}
				setState(104);
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

	public static class VariableOrLiteralContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public AggregateVariableContext aggregateVariable() {
			return getRuleContext(AggregateVariableContext.class,0);
		}
		public VariableOrLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableOrLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableOrLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariableOrLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralContext variableOrLiteral() throws RecognitionException {
		VariableOrLiteralContext _localctx = new VariableOrLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_variableOrLiteral);
		try {
			setState(108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				variable();
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case GUION:
				enterOuterAlt(_localctx, 2);
				{
				setState(106);
				literal();
				}
				break;
			case COUNT:
			case AVG:
			case SUM:
			case MIN:
			case MAX:
				enterOuterAlt(_localctx, 3);
				{
				setState(107);
				aggregateVariable();
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

	public static class VariableOrLiteralsContext extends ParserRuleContext {
		public List<VariableOrLiteralContext> variableOrLiteral() {
			return getRuleContexts(VariableOrLiteralContext.class);
		}
		public VariableOrLiteralContext variableOrLiteral(int i) {
			return getRuleContext(VariableOrLiteralContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(DatalogParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(DatalogParser.COMA, i);
		}
		public VariableOrLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableOrLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariableOrLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariableOrLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariableOrLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableOrLiteralsContext variableOrLiterals() throws RecognitionException {
		VariableOrLiteralsContext _localctx = new VariableOrLiteralsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_variableOrLiterals);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			variableOrLiteral();
			setState(115);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(111);
					match(COMA);
					setState(112);
					variableOrLiteral();
					}
					} 
				}
				setState(117);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class AggregateVariableContext extends ParserRuleContext {
		public AggregateOpContext aggregateOp() {
			return getRuleContext(AggregateOpContext.class,0);
		}
		public TerminalNode LT() { return getToken(DatalogParser.LT, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode GT() { return getToken(DatalogParser.GT, 0); }
		public AggregateVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAggregateVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateVariableContext aggregateVariable() throws RecognitionException {
		AggregateVariableContext _localctx = new AggregateVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aggregateVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			aggregateOp();
			setState(119);
			match(LT);
			setState(120);
			variable();
			setState(121);
			match(GT);
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

	public static class RelOpContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(DatalogParser.LT, 0); }
		public TerminalNode GT() { return getToken(DatalogParser.GT, 0); }
		public TerminalNode ELT() { return getToken(DatalogParser.ELT, 0); }
		public TerminalNode EGT() { return getToken(DatalogParser.EGT, 0); }
		public TerminalNode EQ() { return getToken(DatalogParser.EQ, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterRelOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitRelOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitRelOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_relOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << ELT) | (1L << EGT) | (1L << EQ))) != 0)) ) {
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

	public static class AggregateOpContext extends ParserRuleContext {
		public TerminalNode COUNT() { return getToken(DatalogParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(DatalogParser.AVG, 0); }
		public TerminalNode SUM() { return getToken(DatalogParser.SUM, 0); }
		public TerminalNode MIN() { return getToken(DatalogParser.MIN, 0); }
		public TerminalNode MAX() { return getToken(DatalogParser.MAX, 0); }
		public AggregateOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregateOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterAggregateOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitAggregateOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitAggregateOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregateOpContext aggregateOp() throws RecognitionException {
		AggregateOpContext _localctx = new AggregateOpContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_aggregateOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COUNT) | (1L << AVG) | (1L << SUM) | (1L << MIN) | (1L << MAX))) != 0)) ) {
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

	public static class VariableContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(DatalogParser.Identifier, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
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

	public static class PredicateContext extends ParserRuleContext {
		public TerminalNode Predicate() { return getToken(DatalogParser.Predicate, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_predicate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(Predicate);
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
		public TerminalNode IntegerLiteral() { return getToken(DatalogParser.IntegerLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(DatalogParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(DatalogParser.BooleanLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(DatalogParser.CharacterLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(DatalogParser.StringLiteral, 0); }
		public TerminalNode GUION() { return getToken(DatalogParser.GUION, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DatalogListener ) ((DatalogListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof DatalogVisitor ) return ((DatalogVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << GUION))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0088\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\3\2\5\2)\n\2\3\2\5\2,\n\2\3\2\5\2/\n\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\5\6\5@\n\5\r\5\16\5A\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\6\7J\n\7\r\7\16\7K\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\5\tY\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\13\3"+
		"\13\3\13\7\13g\n\13\f\13\16\13j\13\13\3\f\3\f\3\f\5\fo\n\f\3\r\3\r\3\r"+
		"\7\rt\n\r\f\r\16\rw\13\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$\2\5\3\2\17\23\3\2\n\16\4\2\3\7\35\35\2\u0081\2.\3\2\2"+
		"\2\4\60\3\2\2\2\6\66\3\2\2\2\b?\3\2\2\2\nC\3\2\2\2\fI\3\2\2\2\16M\3\2"+
		"\2\2\20X\3\2\2\2\22a\3\2\2\2\24c\3\2\2\2\26n\3\2\2\2\30p\3\2\2\2\32x\3"+
		"\2\2\2\34}\3\2\2\2\36\177\3\2\2\2 \u0081\3\2\2\2\"\u0083\3\2\2\2$\u0085"+
		"\3\2\2\2&/\5\b\5\2\')\5\b\5\2(\'\3\2\2\2()\3\2\2\2)+\3\2\2\2*,\5\f\7\2"+
		"+*\3\2\2\2+,\3\2\2\2,-\3\2\2\2-/\5\16\b\2.&\3\2\2\2.(\3\2\2\2/\3\3\2\2"+
		"\2\60\61\5\"\22\2\61\62\7\36\2\2\62\63\5\6\4\2\63\64\7\37\2\2\64\65\7"+
		"\33\2\2\65\5\3\2\2\2\66;\5$\23\2\678\7\34\2\28:\5$\23\29\67\3\2\2\2:="+
		"\3\2\2\2;9\3\2\2\2;<\3\2\2\2<\7\3\2\2\2=;\3\2\2\2>@\5\4\3\2?>\3\2\2\2"+
		"@A\3\2\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CD\5\20\t\2DE\7!\2\2EF\5\24\13"+
		"\2FG\7\33\2\2G\13\3\2\2\2HJ\5\n\6\2IH\3\2\2\2JK\3\2\2\2KI\3\2\2\2KL\3"+
		"\2\2\2L\r\3\2\2\2MN\7 \2\2NO\5\20\t\2OP\7!\2\2PQ\5\24\13\2QR\7\33\2\2"+
		"R\17\3\2\2\2ST\5\"\22\2TU\5\22\n\2UY\3\2\2\2VW\7\t\2\2WY\5\20\t\2XS\3"+
		"\2\2\2XV\3\2\2\2Y\21\3\2\2\2Z[\5\34\17\2[\\\5\30\r\2\\b\3\2\2\2]^\7\36"+
		"\2\2^_\5\30\r\2_`\7\37\2\2`b\3\2\2\2aZ\3\2\2\2a]\3\2\2\2b\23\3\2\2\2c"+
		"h\5\20\t\2de\7\34\2\2eg\5\20\t\2fd\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2i\25\3\2\2\2jh\3\2\2\2ko\5 \21\2lo\5$\23\2mo\5\32\16\2nk\3\2\2\2nl\3"+
		"\2\2\2nm\3\2\2\2o\27\3\2\2\2pu\5\26\f\2qr\7\34\2\2rt\5\26\f\2sq\3\2\2"+
		"\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2v\31\3\2\2\2wu\3\2\2\2xy\5\36\20\2yz\7"+
		"\17\2\2z{\5 \21\2{|\7\20\2\2|\33\3\2\2\2}~\t\2\2\2~\35\3\2\2\2\177\u0080"+
		"\t\3\2\2\u0080\37\3\2\2\2\u0081\u0082\7\b\2\2\u0082!\3\2\2\2\u0083\u0084"+
		"\7\'\2\2\u0084#\3\2\2\2\u0085\u0086\t\4\2\2\u0086%\3\2\2\2\r(+.;AKXah"+
		"nu";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}