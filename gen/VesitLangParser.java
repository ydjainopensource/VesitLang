// Generated from /media/a/common/vesitLang/src/VesitLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VesitLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		PATH=25, FROM=26, TO=27, STRING=28, CHAR=29, INT=30, WS=31;
	public static final int
		RULE_bfs = 0, RULE_dfs = 1, RULE_graph = 2, RULE_digraph = 3, RULE_bfsproperties = 4, 
		RULE_dfsproperties = 5, RULE_edges = 6, RULE_edge = 7, RULE_from = 8, 
		RULE_to = 9, RULE_dfsStackNodeColor = 10, RULE_dfsStackNodeShape = 11, 
		RULE_dfsVisitedNodeColor = 12, RULE_dfsVisitedNodeShape = 13, RULE_dfsDpi = 14, 
		RULE_dfsOutImageDir = 15, RULE_dfsPptName = 16, RULE_bfsQueuedNodeColor = 17, 
		RULE_bfsVisitedNodeColor = 18, RULE_bfsCurrentNodeColor = 19, RULE_bfsCurrentNodeShape = 20, 
		RULE_bfsQueuedNodeShape = 21, RULE_bfsVisitedNodeShape = 22, RULE_bfsDpi = 23, 
		RULE_bfsOutImageDir = 24, RULE_bfsPptName = 25;
	public static final String[] ruleNames = {
		"bfs", "dfs", "graph", "digraph", "bfsproperties", "dfsproperties", "edges", 
		"edge", "from", "to", "dfsStackNodeColor", "dfsStackNodeShape", "dfsVisitedNodeColor", 
		"dfsVisitedNodeShape", "dfsDpi", "dfsOutImageDir", "dfsPptName", "bfsQueuedNodeColor", 
		"bfsVisitedNodeColor", "bfsCurrentNodeColor", "bfsCurrentNodeShape", "bfsQueuedNodeShape", 
		"bfsVisitedNodeShape", "bfsDpi", "bfsOutImageDir", "bfsPptName"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'bfs'", "'{'", "'}'", "'dfs'", "'graph'", "'digraph'", "'dfsStackNodeColor'", 
		"'='", "'dfsStackNodeShape'", "'dfsVisitedNodeColor'", "'dfsVisitedNodeShape'", 
		"'dfsDpi'", "'dfsOutImageDir'", "'dfsPptName'", "'.'", "'bfsQueuedNodeColor'", 
		"'bfsVisitedNodeColor'", "'bfsCurrentNodeColor'", "'bfsCurrentNodeShape'", 
		"'bfsQueuedNodeShape'", "'bfsVisitedNodeShape'", "'bfsDpi'", "'bfsOutImageDir'", 
		"'bfsPptName'", null, "'from'", "'to'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "PATH", "FROM", "TO", "STRING", "CHAR", "INT", "WS"
	};
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
	public String getGrammarFileName() { return "VesitLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VesitLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BfsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public List<BfspropertiesContext> bfsproperties() {
			return getRuleContexts(BfspropertiesContext.class);
		}
		public BfspropertiesContext bfsproperties(int i) {
			return getRuleContext(BfspropertiesContext.class,i);
		}
		public BfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsContext bfs() throws RecognitionException {
		BfsContext _localctx = new BfsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bfs);
		int _la;
		try {
			setState(64);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(T__0);
				setState(53);
				match(STRING);
				setState(54);
				match(T__1);
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23))) != 0)) {
					{
					{
					setState(55);
					bfsproperties();
					}
					}
					setState(60);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(61);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(62);
				match(T__0);
				setState(63);
				match(STRING);
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

	public static class DfsContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public List<DfspropertiesContext> dfsproperties() {
			return getRuleContexts(DfspropertiesContext.class);
		}
		public DfspropertiesContext dfsproperties(int i) {
			return getRuleContext(DfspropertiesContext.class,i);
		}
		public DfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsContext dfs() throws RecognitionException {
		DfsContext _localctx = new DfsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dfs);
		int _la;
		try {
			setState(78);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(66);
				match(T__3);
				setState(67);
				match(STRING);
				setState(68);
				match(T__1);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13))) != 0)) {
					{
					{
					setState(69);
					dfsproperties();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(76);
				match(T__3);
				setState(77);
				match(STRING);
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

	public static class GraphContext extends ParserRuleContext {
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public BfsContext bfs() {
			return getRuleContext(BfsContext.class,0);
		}
		public DfsContext dfs() {
			return getRuleContext(DfsContext.class,0);
		}
		public GraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_graph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterGraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitGraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitGraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_graph);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				match(T__4);
				setState(81);
				match(T__1);
				setState(82);
				edges();
				setState(83);
				match(T__2);
				setState(84);
				bfs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(T__4);
				setState(87);
				match(T__1);
				setState(88);
				edges();
				setState(89);
				match(T__2);
				setState(90);
				dfs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(T__4);
				setState(93);
				match(T__1);
				setState(94);
				edges();
				setState(95);
				match(T__2);
				setState(96);
				bfs();
				setState(97);
				dfs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(99);
				match(T__4);
				setState(100);
				match(T__1);
				setState(101);
				edges();
				setState(102);
				match(T__2);
				setState(103);
				dfs();
				setState(104);
				bfs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(106);
				match(T__4);
				setState(107);
				match(T__1);
				setState(108);
				edges();
				setState(109);
				match(T__2);
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

	public static class DigraphContext extends ParserRuleContext {
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public BfsContext bfs() {
			return getRuleContext(BfsContext.class,0);
		}
		public DfsContext dfs() {
			return getRuleContext(DfsContext.class,0);
		}
		public DigraphContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_digraph; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDigraph(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDigraph(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDigraph(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DigraphContext digraph() throws RecognitionException {
		DigraphContext _localctx = new DigraphContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_digraph);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				match(T__5);
				setState(114);
				match(T__1);
				setState(115);
				edges();
				setState(116);
				match(T__2);
				setState(117);
				bfs();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__5);
				setState(120);
				match(T__1);
				setState(121);
				edges();
				setState(122);
				match(T__2);
				setState(123);
				dfs();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				match(T__5);
				setState(126);
				match(T__1);
				setState(127);
				edges();
				setState(128);
				match(T__2);
				setState(129);
				bfs();
				setState(130);
				dfs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__5);
				setState(133);
				match(T__1);
				setState(134);
				edges();
				setState(135);
				match(T__2);
				setState(136);
				dfs();
				setState(137);
				bfs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				match(T__5);
				setState(140);
				match(T__1);
				setState(141);
				edges();
				setState(142);
				match(T__2);
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

	public static class BfspropertiesContext extends ParserRuleContext {
		public BfsQueuedNodeColorContext bfsQueuedNodeColor() {
			return getRuleContext(BfsQueuedNodeColorContext.class,0);
		}
		public BfsVisitedNodeColorContext bfsVisitedNodeColor() {
			return getRuleContext(BfsVisitedNodeColorContext.class,0);
		}
		public BfsCurrentNodeColorContext bfsCurrentNodeColor() {
			return getRuleContext(BfsCurrentNodeColorContext.class,0);
		}
		public BfsCurrentNodeShapeContext bfsCurrentNodeShape() {
			return getRuleContext(BfsCurrentNodeShapeContext.class,0);
		}
		public BfsQueuedNodeShapeContext bfsQueuedNodeShape() {
			return getRuleContext(BfsQueuedNodeShapeContext.class,0);
		}
		public BfsVisitedNodeShapeContext bfsVisitedNodeShape() {
			return getRuleContext(BfsVisitedNodeShapeContext.class,0);
		}
		public BfsDpiContext bfsDpi() {
			return getRuleContext(BfsDpiContext.class,0);
		}
		public BfsOutImageDirContext bfsOutImageDir() {
			return getRuleContext(BfsOutImageDirContext.class,0);
		}
		public BfsPptNameContext bfsPptName() {
			return getRuleContext(BfsPptNameContext.class,0);
		}
		public BfspropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsproperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsproperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfspropertiesContext bfsproperties() throws RecognitionException {
		BfspropertiesContext _localctx = new BfspropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bfsproperties);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				bfsQueuedNodeColor();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(147);
				bfsVisitedNodeColor();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				bfsCurrentNodeColor();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(149);
				bfsCurrentNodeShape();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(150);
				bfsQueuedNodeShape();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 6);
				{
				setState(151);
				bfsVisitedNodeShape();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 7);
				{
				setState(152);
				bfsDpi();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 8);
				{
				setState(153);
				bfsOutImageDir();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				bfsPptName();
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

	public static class DfspropertiesContext extends ParserRuleContext {
		public DfsStackNodeColorContext dfsStackNodeColor() {
			return getRuleContext(DfsStackNodeColorContext.class,0);
		}
		public DfsStackNodeShapeContext dfsStackNodeShape() {
			return getRuleContext(DfsStackNodeShapeContext.class,0);
		}
		public DfsVisitedNodeColorContext dfsVisitedNodeColor() {
			return getRuleContext(DfsVisitedNodeColorContext.class,0);
		}
		public DfsVisitedNodeShapeContext dfsVisitedNodeShape() {
			return getRuleContext(DfsVisitedNodeShapeContext.class,0);
		}
		public DfsDpiContext dfsDpi() {
			return getRuleContext(DfsDpiContext.class,0);
		}
		public DfsOutImageDirContext dfsOutImageDir() {
			return getRuleContext(DfsOutImageDirContext.class,0);
		}
		public DfsPptNameContext dfsPptName() {
			return getRuleContext(DfsPptNameContext.class,0);
		}
		public DfspropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsproperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsproperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfspropertiesContext dfsproperties() throws RecognitionException {
		DfspropertiesContext _localctx = new DfspropertiesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dfsproperties);
		try {
			setState(164);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				dfsStackNodeColor();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				dfsStackNodeShape();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(159);
				dfsVisitedNodeColor();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(160);
				dfsVisitedNodeShape();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(161);
				dfsDpi();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(162);
				dfsOutImageDir();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(163);
				dfsPptName();
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

	public static class EdgesContext extends ParserRuleContext {
		public List<EdgeContext> edge() {
			return getRuleContexts(EdgeContext.class);
		}
		public EdgeContext edge(int i) {
			return getRuleContext(EdgeContext.class,i);
		}
		public EdgesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitEdges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitEdges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgesContext edges() throws RecognitionException {
		EdgesContext _localctx = new EdgesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(166);
				edge();
				}
				}
				setState(169); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FROM );
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

	public static class EdgeContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(VesitLangParser.FROM, 0); }
		public FromContext from() {
			return getRuleContext(FromContext.class,0);
		}
		public TerminalNode TO() { return getToken(VesitLangParser.TO, 0); }
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public EdgeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edge; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterEdge(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitEdge(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitEdge(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_edge);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(FROM);
			setState(172);
			from();
			setState(173);
			match(TO);
			setState(174);
			to();
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

	public static class FromContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public FromContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitFrom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(STRING);
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

	public static class ToContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitTo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(STRING);
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

	public static class DfsStackNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public DfsStackNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsStackNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsStackNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsStackNodeColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsStackNodeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsStackNodeColorContext dfsStackNodeColor() throws RecognitionException {
		DfsStackNodeColorContext _localctx = new DfsStackNodeColorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dfsStackNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(T__6);
			setState(181);
			match(T__7);
			setState(182);
			match(STRING);
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

	public static class DfsStackNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public DfsStackNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsStackNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsStackNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsStackNodeShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsStackNodeShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsStackNodeShapeContext dfsStackNodeShape() throws RecognitionException {
		DfsStackNodeShapeContext _localctx = new DfsStackNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_dfsStackNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(T__8);
			setState(185);
			match(T__7);
			setState(186);
			match(STRING);
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

	public static class DfsVisitedNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public DfsVisitedNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsVisitedNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsVisitedNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsVisitedNodeColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsVisitedNodeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsVisitedNodeColorContext dfsVisitedNodeColor() throws RecognitionException {
		DfsVisitedNodeColorContext _localctx = new DfsVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_dfsVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__9);
			setState(189);
			match(T__7);
			setState(190);
			match(STRING);
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

	public static class DfsVisitedNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public DfsVisitedNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsVisitedNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsVisitedNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsVisitedNodeShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsVisitedNodeShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsVisitedNodeShapeContext dfsVisitedNodeShape() throws RecognitionException {
		DfsVisitedNodeShapeContext _localctx = new DfsVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_dfsVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__10);
			setState(193);
			match(T__7);
			setState(194);
			match(STRING);
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

	public static class DfsDpiContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public DfsDpiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsDpi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsDpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsDpi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsDpi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsDpiContext dfsDpi() throws RecognitionException {
		DfsDpiContext _localctx = new DfsDpiContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_dfsDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(T__11);
			setState(197);
			match(T__7);
			setState(198);
			match(STRING);
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

	public static class DfsOutImageDirContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(VesitLangParser.PATH, 0); }
		public DfsOutImageDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsOutImageDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsOutImageDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsOutImageDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsOutImageDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsOutImageDirContext dfsOutImageDir() throws RecognitionException {
		DfsOutImageDirContext _localctx = new DfsOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dfsOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			match(T__12);
			setState(201);
			match(T__7);
			setState(202);
			match(PATH);
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

	public static class DfsPptNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VesitLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VesitLangParser.STRING, i);
		}
		public DfsPptNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dfsPptName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterDfsPptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitDfsPptName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitDfsPptName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DfsPptNameContext dfsPptName() throws RecognitionException {
		DfsPptNameContext _localctx = new DfsPptNameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dfsPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(T__13);
			setState(205);
			match(T__7);
			setState(206);
			match(STRING);
			setState(207);
			match(T__14);
			setState(208);
			match(STRING);
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

	public static class BfsQueuedNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsQueuedNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsQueuedNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsQueuedNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsQueuedNodeColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsQueuedNodeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsQueuedNodeColorContext bfsQueuedNodeColor() throws RecognitionException {
		BfsQueuedNodeColorContext _localctx = new BfsQueuedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_bfsQueuedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			match(T__15);
			setState(211);
			match(T__7);
			setState(212);
			match(STRING);
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

	public static class BfsVisitedNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsVisitedNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsVisitedNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsVisitedNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsVisitedNodeColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsVisitedNodeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsVisitedNodeColorContext bfsVisitedNodeColor() throws RecognitionException {
		BfsVisitedNodeColorContext _localctx = new BfsVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_bfsVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__16);
			setState(215);
			match(T__7);
			setState(216);
			match(STRING);
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

	public static class BfsCurrentNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsCurrentNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsCurrentNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsCurrentNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsCurrentNodeColor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsCurrentNodeColor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsCurrentNodeColorContext bfsCurrentNodeColor() throws RecognitionException {
		BfsCurrentNodeColorContext _localctx = new BfsCurrentNodeColorContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_bfsCurrentNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__17);
			setState(219);
			match(T__7);
			setState(220);
			match(STRING);
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

	public static class BfsCurrentNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsCurrentNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsCurrentNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsCurrentNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsCurrentNodeShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsCurrentNodeShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsCurrentNodeShapeContext bfsCurrentNodeShape() throws RecognitionException {
		BfsCurrentNodeShapeContext _localctx = new BfsCurrentNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bfsCurrentNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__18);
			setState(223);
			match(T__7);
			setState(224);
			match(STRING);
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

	public static class BfsQueuedNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsQueuedNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsQueuedNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsQueuedNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsQueuedNodeShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsQueuedNodeShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsQueuedNodeShapeContext bfsQueuedNodeShape() throws RecognitionException {
		BfsQueuedNodeShapeContext _localctx = new BfsQueuedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_bfsQueuedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__19);
			setState(227);
			match(T__7);
			setState(228);
			match(STRING);
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

	public static class BfsVisitedNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsVisitedNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsVisitedNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsVisitedNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsVisitedNodeShape(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsVisitedNodeShape(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsVisitedNodeShapeContext bfsVisitedNodeShape() throws RecognitionException {
		BfsVisitedNodeShapeContext _localctx = new BfsVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bfsVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(T__20);
			setState(231);
			match(T__7);
			setState(232);
			match(STRING);
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

	public static class BfsDpiContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public BfsDpiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsDpi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsDpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsDpi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsDpi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsDpiContext bfsDpi() throws RecognitionException {
		BfsDpiContext _localctx = new BfsDpiContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bfsDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(T__21);
			setState(235);
			match(T__7);
			setState(236);
			match(STRING);
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

	public static class BfsOutImageDirContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(VesitLangParser.PATH, 0); }
		public BfsOutImageDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsOutImageDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsOutImageDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsOutImageDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsOutImageDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsOutImageDirContext bfsOutImageDir() throws RecognitionException {
		BfsOutImageDirContext _localctx = new BfsOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bfsOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__22);
			setState(239);
			match(T__7);
			setState(240);
			match(PATH);
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

	public static class BfsPptNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VesitLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VesitLangParser.STRING, i);
		}
		public BfsPptNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bfsPptName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterBfsPptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitBfsPptName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof VesitLangVisitor ) return ((VesitLangVisitor<? extends T>)visitor).visitBfsPptName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BfsPptNameContext bfsPptName() throws RecognitionException {
		BfsPptNameContext _localctx = new BfsPptNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bfsPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__23);
			setState(243);
			match(T__7);
			setState(244);
			match(STRING);
			setState(245);
			match(T__14);
			setState(246);
			match(STRING);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00fb\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\3\2\3\2\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\2\3\2\3"+
		"\2\5\2C\n\2\3\3\3\3\3\3\3\3\7\3I\n\3\f\3\16\3L\13\3\3\3\3\3\3\3\5\3Q\n"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4r\n\4\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0093\n\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u009e\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\5\7\u00a7\n\7\3\b\6\b\u00aa\n\b\r\b\16\b\u00ab\3\t\3\t\3\t\3\t\3\t"+
		"\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\2\2\34\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64"+
		"\2\2\2\u00fb\2B\3\2\2\2\4P\3\2\2\2\6q\3\2\2\2\b\u0092\3\2\2\2\n\u009d"+
		"\3\2\2\2\f\u00a6\3\2\2\2\16\u00a9\3\2\2\2\20\u00ad\3\2\2\2\22\u00b2\3"+
		"\2\2\2\24\u00b4\3\2\2\2\26\u00b6\3\2\2\2\30\u00ba\3\2\2\2\32\u00be\3\2"+
		"\2\2\34\u00c2\3\2\2\2\36\u00c6\3\2\2\2 \u00ca\3\2\2\2\"\u00ce\3\2\2\2"+
		"$\u00d4\3\2\2\2&\u00d8\3\2\2\2(\u00dc\3\2\2\2*\u00e0\3\2\2\2,\u00e4\3"+
		"\2\2\2.\u00e8\3\2\2\2\60\u00ec\3\2\2\2\62\u00f0\3\2\2\2\64\u00f4\3\2\2"+
		"\2\66\67\7\3\2\2\678\7\36\2\28<\7\4\2\29;\5\n\6\2:9\3\2\2\2;>\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?C\7\5\2\2@A\7\3\2\2AC\7\36\2"+
		"\2B\66\3\2\2\2B@\3\2\2\2C\3\3\2\2\2DE\7\6\2\2EF\7\36\2\2FJ\7\4\2\2GI\5"+
		"\f\7\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KM\3\2\2\2LJ\3\2\2\2MQ\7"+
		"\5\2\2NO\7\6\2\2OQ\7\36\2\2PD\3\2\2\2PN\3\2\2\2Q\5\3\2\2\2RS\7\7\2\2S"+
		"T\7\4\2\2TU\5\16\b\2UV\7\5\2\2VW\5\2\2\2Wr\3\2\2\2XY\7\7\2\2YZ\7\4\2\2"+
		"Z[\5\16\b\2[\\\7\5\2\2\\]\5\4\3\2]r\3\2\2\2^_\7\7\2\2_`\7\4\2\2`a\5\16"+
		"\b\2ab\7\5\2\2bc\5\2\2\2cd\5\4\3\2dr\3\2\2\2ef\7\7\2\2fg\7\4\2\2gh\5\16"+
		"\b\2hi\7\5\2\2ij\5\4\3\2jk\5\2\2\2kr\3\2\2\2lm\7\7\2\2mn\7\4\2\2no\5\16"+
		"\b\2op\7\5\2\2pr\3\2\2\2qR\3\2\2\2qX\3\2\2\2q^\3\2\2\2qe\3\2\2\2ql\3\2"+
		"\2\2r\7\3\2\2\2st\7\b\2\2tu\7\4\2\2uv\5\16\b\2vw\7\5\2\2wx\5\2\2\2x\u0093"+
		"\3\2\2\2yz\7\b\2\2z{\7\4\2\2{|\5\16\b\2|}\7\5\2\2}~\5\4\3\2~\u0093\3\2"+
		"\2\2\177\u0080\7\b\2\2\u0080\u0081\7\4\2\2\u0081\u0082\5\16\b\2\u0082"+
		"\u0083\7\5\2\2\u0083\u0084\5\2\2\2\u0084\u0085\5\4\3\2\u0085\u0093\3\2"+
		"\2\2\u0086\u0087\7\b\2\2\u0087\u0088\7\4\2\2\u0088\u0089\5\16\b\2\u0089"+
		"\u008a\7\5\2\2\u008a\u008b\5\4\3\2\u008b\u008c\5\2\2\2\u008c\u0093\3\2"+
		"\2\2\u008d\u008e\7\b\2\2\u008e\u008f\7\4\2\2\u008f\u0090\5\16\b\2\u0090"+
		"\u0091\7\5\2\2\u0091\u0093\3\2\2\2\u0092s\3\2\2\2\u0092y\3\2\2\2\u0092"+
		"\177\3\2\2\2\u0092\u0086\3\2\2\2\u0092\u008d\3\2\2\2\u0093\t\3\2\2\2\u0094"+
		"\u009e\5$\23\2\u0095\u009e\5&\24\2\u0096\u009e\5(\25\2\u0097\u009e\5*"+
		"\26\2\u0098\u009e\5,\27\2\u0099\u009e\5.\30\2\u009a\u009e\5\60\31\2\u009b"+
		"\u009e\5\62\32\2\u009c\u009e\5\64\33\2\u009d\u0094\3\2\2\2\u009d\u0095"+
		"\3\2\2\2\u009d\u0096\3\2\2\2\u009d\u0097\3\2\2\2\u009d\u0098\3\2\2\2\u009d"+
		"\u0099\3\2\2\2\u009d\u009a\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009c\3\2"+
		"\2\2\u009e\13\3\2\2\2\u009f\u00a7\5\26\f\2\u00a0\u00a7\5\30\r\2\u00a1"+
		"\u00a7\5\32\16\2\u00a2\u00a7\5\34\17\2\u00a3\u00a7\5\36\20\2\u00a4\u00a7"+
		"\5 \21\2\u00a5\u00a7\5\"\22\2\u00a6\u009f\3\2\2\2\u00a6\u00a0\3\2\2\2"+
		"\u00a6\u00a1\3\2\2\2\u00a6\u00a2\3\2\2\2\u00a6\u00a3\3\2\2\2\u00a6\u00a4"+
		"\3\2\2\2\u00a6\u00a5\3\2\2\2\u00a7\r\3\2\2\2\u00a8\u00aa\5\20\t\2\u00a9"+
		"\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2"+
		"\2\2\u00ac\17\3\2\2\2\u00ad\u00ae\7\34\2\2\u00ae\u00af\5\22\n\2\u00af"+
		"\u00b0\7\35\2\2\u00b0\u00b1\5\24\13\2\u00b1\21\3\2\2\2\u00b2\u00b3\7\36"+
		"\2\2\u00b3\23\3\2\2\2\u00b4\u00b5\7\36\2\2\u00b5\25\3\2\2\2\u00b6\u00b7"+
		"\7\t\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00b9\7\36\2\2\u00b9\27\3\2\2\2\u00ba"+
		"\u00bb\7\13\2\2\u00bb\u00bc\7\n\2\2\u00bc\u00bd\7\36\2\2\u00bd\31\3\2"+
		"\2\2\u00be\u00bf\7\f\2\2\u00bf\u00c0\7\n\2\2\u00c0\u00c1\7\36\2\2\u00c1"+
		"\33\3\2\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\7\36\2"+
		"\2\u00c5\35\3\2\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\7\n\2\2\u00c8\u00c9"+
		"\7\36\2\2\u00c9\37\3\2\2\2\u00ca\u00cb\7\17\2\2\u00cb\u00cc\7\n\2\2\u00cc"+
		"\u00cd\7\33\2\2\u00cd!\3\2\2\2\u00ce\u00cf\7\20\2\2\u00cf\u00d0\7\n\2"+
		"\2\u00d0\u00d1\7\36\2\2\u00d1\u00d2\7\21\2\2\u00d2\u00d3\7\36\2\2\u00d3"+
		"#\3\2\2\2\u00d4\u00d5\7\22\2\2\u00d5\u00d6\7\n\2\2\u00d6\u00d7\7\36\2"+
		"\2\u00d7%\3\2\2\2\u00d8\u00d9\7\23\2\2\u00d9\u00da\7\n\2\2\u00da\u00db"+
		"\7\36\2\2\u00db\'\3\2\2\2\u00dc\u00dd\7\24\2\2\u00dd\u00de\7\n\2\2\u00de"+
		"\u00df\7\36\2\2\u00df)\3\2\2\2\u00e0\u00e1\7\25\2\2\u00e1\u00e2\7\n\2"+
		"\2\u00e2\u00e3\7\36\2\2\u00e3+\3\2\2\2\u00e4\u00e5\7\26\2\2\u00e5\u00e6"+
		"\7\n\2\2\u00e6\u00e7\7\36\2\2\u00e7-\3\2\2\2\u00e8\u00e9\7\27\2\2\u00e9"+
		"\u00ea\7\n\2\2\u00ea\u00eb\7\36\2\2\u00eb/\3\2\2\2\u00ec\u00ed\7\30\2"+
		"\2\u00ed\u00ee\7\n\2\2\u00ee\u00ef\7\36\2\2\u00ef\61\3\2\2\2\u00f0\u00f1"+
		"\7\31\2\2\u00f1\u00f2\7\n\2\2\u00f2\u00f3\7\33\2\2\u00f3\63\3\2\2\2\u00f4"+
		"\u00f5\7\32\2\2\u00f5\u00f6\7\n\2\2\u00f6\u00f7\7\36\2\2\u00f7\u00f8\7"+
		"\21\2\2\u00f8\u00f9\7\36\2\2\u00f9\65\3\2\2\2\13<BJPq\u0092\u009d\u00a6"+
		"\u00ab";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}