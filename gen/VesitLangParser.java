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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, GRAPH=44, DIGRAPH=45, 
		BFS=46, DFS=47, KRUSKAL=48, PRIM=49, PATH=50, FROM=51, TO=52, STRING=53, 
		CHAR=54, INT=55, WS=56;
	public static final int
		RULE_bfs = 0, RULE_dfs = 1, RULE_kruskal = 2, RULE_prim = 3, RULE_bfsproperties = 4, 
		RULE_kruskalproperties = 5, RULE_primproperties = 6, RULE_dfsproperties = 7, 
		RULE_edges = 8, RULE_edge = 9, RULE_from = 10, RULE_to = 11, RULE_graph = 12, 
		RULE_action_list = 13, RULE_action = 14, RULE_dfsStackNodeColor = 15, 
		RULE_dfsStackNodeShape = 16, RULE_dfsVisitedNodeColor = 17, RULE_dfsVisitedNodeShape = 18, 
		RULE_dfsDpi = 19, RULE_dfsOutImageDir = 20, RULE_dfsPptName = 21, RULE_bfsQueuedNodeColor = 22, 
		RULE_bfsVisitedNodeColor = 23, RULE_bfsCurrentNodeColor = 24, RULE_bfsCurrentNodeShape = 25, 
		RULE_bfsQueuedNodeShape = 26, RULE_bfsVisitedNodeShape = 27, RULE_bfsDpi = 28, 
		RULE_bfsOutImageDir = 29, RULE_bfsPptName = 30, RULE_kruskalVisitedNodeColor = 31, 
		RULE_kruskalCurrentNodeColor = 32, RULE_kruskalCurrentNodeShape = 33, 
		RULE_kruskalVisitedNodeShape = 34, RULE_kruskalDpi = 35, RULE_kruskalOutImageDir = 36, 
		RULE_kruskalPptName = 37, RULE_kruskalCurrentEdgeColor = 38, RULE_kruskalCurrentEdgeWidth = 39, 
		RULE_kruskalVisitedEdgeWidth = 40, RULE_kruskalVisitedEdgeColor = 41, 
		RULE_primVisitedNodeColor = 42, RULE_primCurrentNodeColor = 43, RULE_primCurrentNodeShape = 44, 
		RULE_primVisitedNodeShape = 45, RULE_primDpi = 46, RULE_primOutImageDir = 47, 
		RULE_primPptName = 48, RULE_primCurrentEdgeColor = 49, RULE_primCurrentEdgeWidth = 50, 
		RULE_primVisitedEdgeWidth = 51, RULE_primVisitedEdgeColor = 52;
	public static final String[] ruleNames = {
		"bfs", "dfs", "kruskal", "prim", "bfsproperties", "kruskalproperties", 
		"primproperties", "dfsproperties", "edges", "edge", "from", "to", "graph", 
		"action_list", "action", "dfsStackNodeColor", "dfsStackNodeShape", "dfsVisitedNodeColor", 
		"dfsVisitedNodeShape", "dfsDpi", "dfsOutImageDir", "dfsPptName", "bfsQueuedNodeColor", 
		"bfsVisitedNodeColor", "bfsCurrentNodeColor", "bfsCurrentNodeShape", "bfsQueuedNodeShape", 
		"bfsVisitedNodeShape", "bfsDpi", "bfsOutImageDir", "bfsPptName", "kruskalVisitedNodeColor", 
		"kruskalCurrentNodeColor", "kruskalCurrentNodeShape", "kruskalVisitedNodeShape", 
		"kruskalDpi", "kruskalOutImageDir", "kruskalPptName", "kruskalCurrentEdgeColor", 
		"kruskalCurrentEdgeWidth", "kruskalVisitedEdgeWidth", "kruskalVisitedEdgeColor", 
		"primVisitedNodeColor", "primCurrentNodeColor", "primCurrentNodeShape", 
		"primVisitedNodeShape", "primDpi", "primOutImageDir", "primPptName", "primCurrentEdgeColor", 
		"primCurrentEdgeWidth", "primVisitedEdgeWidth", "primVisitedEdgeColor"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'cost'", "'dfsStackNodeColor'", "'='", "'dfsStackNodeShape'", 
		"'dfsVisitedNodeColor'", "'dfsVisitedNodeShape'", "'dfsDpi'", "'dfsOutImageDir'", 
		"'dfsPptName'", "'.'", "'bfsQueuedNodeColor'", "'bfsVisitedNodeColor'", 
		"'bfsCurrentNodeColor'", "'bfsCurrentNodeShape'", "'bfsQueuedNodeShape'", 
		"'bfsVisitedNodeShape'", "'bfsDpi'", "'bfsOutImageDir'", "'bfsPptName'", 
		"'kruskalVisitedNodeColor'", "'kruskalCurrentNodeColor'", "'kruskalCurrentNodeShape'", 
		"'kruskalVisitedNodeShape'", "'kruskalDpi'", "'kruskalOutImageDir'", "'kruskalPptName'", 
		"'kruskalCurrentEdgeColor'", "'kruskalCurrentEdgeWidth'", "'kruskalVisitedEdgeWidth'", 
		"'kruskalVisitedEdgeColor'", "'primVisitedNodeColor'", "'primCurrentNodeColor'", 
		"'primCurrentNodeShape'", "'primVisitedNodeShape'", "'primDpi'", "'primOutImageDir'", 
		"'primPptName'", "'primCurrentEdgeColor'", "'primCurrentEdgeWidth'", "'primVisitedEdgeWidth'", 
		"'primVisitedEdgeColor'", "'graph'", "'digraph'", "'bfs'", "'dfs'", "'kruskal'", 
		"'prim'", null, "'from'", "'to'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, "GRAPH", "DIGRAPH", "BFS", 
		"DFS", "KRUSKAL", "PRIM", "PATH", "FROM", "TO", "STRING", "CHAR", "INT", 
		"WS"
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
		public TerminalNode BFS() { return getToken(VesitLangParser.BFS, 0); }
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
	}

	public final BfsContext bfs() throws RecognitionException {
		BfsContext _localctx = new BfsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_bfs);
		int _la;
		try {
			setState(118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(106);
				match(BFS);
				setState(107);
				match(STRING);
				setState(108);
				match(T__0);
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20))) != 0)) {
					{
					{
					setState(109);
					bfsproperties();
					}
					}
					setState(114);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(115);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(BFS);
				setState(117);
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
		public TerminalNode DFS() { return getToken(VesitLangParser.DFS, 0); }
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
	}

	public final DfsContext dfs() throws RecognitionException {
		DfsContext _localctx = new DfsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_dfs);
		int _la;
		try {
			setState(132);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(DFS);
				setState(121);
				match(STRING);
				setState(122);
				match(T__0);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10))) != 0)) {
					{
					{
					setState(123);
					dfsproperties();
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				match(DFS);
				setState(131);
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

	public static class KruskalContext extends ParserRuleContext {
		public TerminalNode KRUSKAL() { return getToken(VesitLangParser.KRUSKAL, 0); }
		public List<KruskalpropertiesContext> kruskalproperties() {
			return getRuleContexts(KruskalpropertiesContext.class);
		}
		public KruskalpropertiesContext kruskalproperties(int i) {
			return getRuleContext(KruskalpropertiesContext.class,i);
		}
		public KruskalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskal(this);
		}
	}

	public final KruskalContext kruskal() throws RecognitionException {
		KruskalContext _localctx = new KruskalContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_kruskal);
		int _la;
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(134);
				match(KRUSKAL);
				setState(135);
				match(T__0);
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30) | (1L << T__31))) != 0)) {
					{
					{
					setState(136);
					kruskalproperties();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(142);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(KRUSKAL);
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

	public static class PrimContext extends ParserRuleContext {
		public TerminalNode PRIM() { return getToken(VesitLangParser.PRIM, 0); }
		public PrimpropertiesContext primproperties() {
			return getRuleContext(PrimpropertiesContext.class,0);
		}
		public PrimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrim(this);
		}
	}

	public final PrimContext prim() throws RecognitionException {
		PrimContext _localctx = new PrimContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_prim);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(PRIM);
				setState(147);
				match(T__0);
				setState(148);
				primproperties();
				setState(149);
				match(T__1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(151);
				match(PRIM);
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
	}

	public final BfspropertiesContext bfsproperties() throws RecognitionException {
		BfspropertiesContext _localctx = new BfspropertiesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_bfsproperties);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				bfsQueuedNodeColor();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				bfsVisitedNodeColor();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(156);
				bfsCurrentNodeColor();
				}
				break;
			case T__15:
				enterOuterAlt(_localctx, 4);
				{
				setState(157);
				bfsCurrentNodeShape();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(158);
				bfsQueuedNodeShape();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 6);
				{
				setState(159);
				bfsVisitedNodeShape();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 7);
				{
				setState(160);
				bfsDpi();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 8);
				{
				setState(161);
				bfsOutImageDir();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 9);
				{
				setState(162);
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

	public static class KruskalpropertiesContext extends ParserRuleContext {
		public KruskalVisitedNodeColorContext kruskalVisitedNodeColor() {
			return getRuleContext(KruskalVisitedNodeColorContext.class,0);
		}
		public KruskalCurrentNodeColorContext kruskalCurrentNodeColor() {
			return getRuleContext(KruskalCurrentNodeColorContext.class,0);
		}
		public KruskalCurrentNodeShapeContext kruskalCurrentNodeShape() {
			return getRuleContext(KruskalCurrentNodeShapeContext.class,0);
		}
		public KruskalVisitedNodeShapeContext kruskalVisitedNodeShape() {
			return getRuleContext(KruskalVisitedNodeShapeContext.class,0);
		}
		public KruskalDpiContext kruskalDpi() {
			return getRuleContext(KruskalDpiContext.class,0);
		}
		public KruskalOutImageDirContext kruskalOutImageDir() {
			return getRuleContext(KruskalOutImageDirContext.class,0);
		}
		public KruskalPptNameContext kruskalPptName() {
			return getRuleContext(KruskalPptNameContext.class,0);
		}
		public KruskalCurrentEdgeColorContext kruskalCurrentEdgeColor() {
			return getRuleContext(KruskalCurrentEdgeColorContext.class,0);
		}
		public KruskalCurrentEdgeWidthContext kruskalCurrentEdgeWidth() {
			return getRuleContext(KruskalCurrentEdgeWidthContext.class,0);
		}
		public KruskalVisitedEdgeWidthContext kruskalVisitedEdgeWidth() {
			return getRuleContext(KruskalVisitedEdgeWidthContext.class,0);
		}
		public KruskalVisitedEdgeColorContext kruskalVisitedEdgeColor() {
			return getRuleContext(KruskalVisitedEdgeColorContext.class,0);
		}
		public KruskalpropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalproperties(this);
		}
	}

	public final KruskalpropertiesContext kruskalproperties() throws RecognitionException {
		KruskalpropertiesContext _localctx = new KruskalpropertiesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_kruskalproperties);
		try {
			setState(176);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__21:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				kruskalVisitedNodeColor();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 2);
				{
				setState(166);
				kruskalCurrentNodeColor();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 3);
				{
				setState(167);
				kruskalCurrentNodeShape();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 4);
				{
				setState(168);
				kruskalVisitedNodeShape();
				}
				break;
			case T__25:
				enterOuterAlt(_localctx, 5);
				{
				setState(169);
				kruskalDpi();
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 6);
				{
				setState(170);
				kruskalOutImageDir();
				}
				break;
			case T__27:
				enterOuterAlt(_localctx, 7);
				{
				setState(171);
				kruskalPptName();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 8);
				{
				setState(172);
				kruskalCurrentEdgeColor();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 9);
				{
				setState(173);
				kruskalCurrentEdgeWidth();
				}
				break;
			case T__30:
				enterOuterAlt(_localctx, 10);
				{
				setState(174);
				kruskalVisitedEdgeWidth();
				}
				break;
			case T__31:
				enterOuterAlt(_localctx, 11);
				{
				setState(175);
				kruskalVisitedEdgeColor();
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

	public static class PrimpropertiesContext extends ParserRuleContext {
		public PrimVisitedNodeColorContext primVisitedNodeColor() {
			return getRuleContext(PrimVisitedNodeColorContext.class,0);
		}
		public PrimCurrentNodeColorContext primCurrentNodeColor() {
			return getRuleContext(PrimCurrentNodeColorContext.class,0);
		}
		public PrimCurrentNodeShapeContext primCurrentNodeShape() {
			return getRuleContext(PrimCurrentNodeShapeContext.class,0);
		}
		public PrimVisitedNodeShapeContext primVisitedNodeShape() {
			return getRuleContext(PrimVisitedNodeShapeContext.class,0);
		}
		public PrimDpiContext primDpi() {
			return getRuleContext(PrimDpiContext.class,0);
		}
		public PrimOutImageDirContext primOutImageDir() {
			return getRuleContext(PrimOutImageDirContext.class,0);
		}
		public PrimPptNameContext primPptName() {
			return getRuleContext(PrimPptNameContext.class,0);
		}
		public PrimCurrentEdgeColorContext primCurrentEdgeColor() {
			return getRuleContext(PrimCurrentEdgeColorContext.class,0);
		}
		public PrimCurrentEdgeWidthContext primCurrentEdgeWidth() {
			return getRuleContext(PrimCurrentEdgeWidthContext.class,0);
		}
		public PrimVisitedEdgeWidthContext primVisitedEdgeWidth() {
			return getRuleContext(PrimVisitedEdgeWidthContext.class,0);
		}
		public PrimVisitedEdgeColorContext primVisitedEdgeColor() {
			return getRuleContext(PrimVisitedEdgeColorContext.class,0);
		}
		public PrimpropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primproperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimproperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimproperties(this);
		}
	}

	public final PrimpropertiesContext primproperties() throws RecognitionException {
		PrimpropertiesContext _localctx = new PrimpropertiesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_primproperties);
		try {
			setState(189);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__32:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				primVisitedNodeColor();
				}
				break;
			case T__33:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				primCurrentNodeColor();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				primCurrentNodeShape();
				}
				break;
			case T__35:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				primVisitedNodeShape();
				}
				break;
			case T__36:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				primDpi();
				}
				break;
			case T__37:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				primOutImageDir();
				}
				break;
			case T__38:
				enterOuterAlt(_localctx, 7);
				{
				setState(184);
				primPptName();
				}
				break;
			case T__39:
				enterOuterAlt(_localctx, 8);
				{
				setState(185);
				primCurrentEdgeColor();
				}
				break;
			case T__40:
				enterOuterAlt(_localctx, 9);
				{
				setState(186);
				primCurrentEdgeWidth();
				}
				break;
			case T__41:
				enterOuterAlt(_localctx, 10);
				{
				setState(187);
				primVisitedEdgeWidth();
				}
				break;
			case T__42:
				enterOuterAlt(_localctx, 11);
				{
				setState(188);
				primVisitedEdgeColor();
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
	}

	public final DfspropertiesContext dfsproperties() throws RecognitionException {
		DfspropertiesContext _localctx = new DfspropertiesContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_dfsproperties);
		try {
			setState(198);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				dfsStackNodeColor();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				dfsStackNodeShape();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				dfsVisitedNodeColor();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 4);
				{
				setState(194);
				dfsVisitedNodeShape();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 5);
				{
				setState(195);
				dfsDpi();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(196);
				dfsOutImageDir();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 7);
				{
				setState(197);
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
	}

	public final EdgesContext edges() throws RecognitionException {
		EdgesContext _localctx = new EdgesContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(200);
				edge();
				}
				}
				setState(203); 
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
		public TerminalNode INT() { return getToken(VesitLangParser.INT, 0); }
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
	}

	public final EdgeContext edge() throws RecognitionException {
		EdgeContext _localctx = new EdgeContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_edge);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(205);
				match(FROM);
				setState(206);
				from();
				setState(207);
				match(TO);
				setState(208);
				to();
				setState(209);
				match(T__2);
				setState(210);
				match(INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(FROM);
				setState(213);
				from();
				setState(214);
				match(TO);
				setState(215);
				to();
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
	}

	public final FromContext from() throws RecognitionException {
		FromContext _localctx = new FromContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_from);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
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
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_to);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
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

	public static class GraphContext extends ParserRuleContext {
		public TerminalNode GRAPH() { return getToken(VesitLangParser.GRAPH, 0); }
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public Action_listContext action_list() {
			return getRuleContext(Action_listContext.class,0);
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
	}

	public final GraphContext graph() throws RecognitionException {
		GraphContext _localctx = new GraphContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_graph);
		try {
			setState(234);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(GRAPH);
				setState(224);
				match(T__0);
				setState(225);
				edges();
				setState(226);
				match(T__1);
				setState(227);
				action_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				match(GRAPH);
				setState(230);
				match(T__0);
				setState(231);
				edges();
				setState(232);
				match(T__1);
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

	public static class Action_listContext extends ParserRuleContext {
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public Action_listContext action_list() {
			return getRuleContext(Action_listContext.class,0);
		}
		public Action_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterAction_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitAction_list(this);
		}
	}

	public final Action_listContext action_list() throws RecognitionException {
		Action_listContext _localctx = new Action_listContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_action_list);
		try {
			setState(240);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				action();
				setState(237);
				action_list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(239);
				action();
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

	public static class ActionContext extends ParserRuleContext {
		public BfsContext bfs() {
			return getRuleContext(BfsContext.class,0);
		}
		public DfsContext dfs() {
			return getRuleContext(DfsContext.class,0);
		}
		public KruskalContext kruskal() {
			return getRuleContext(KruskalContext.class,0);
		}
		public PrimContext prim() {
			return getRuleContext(PrimContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_action);
		try {
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BFS:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				bfs();
				}
				break;
			case DFS:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				dfs();
				}
				break;
			case KRUSKAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				kruskal();
				}
				break;
			case PRIM:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				prim();
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
	}

	public final DfsStackNodeColorContext dfsStackNodeColor() throws RecognitionException {
		DfsStackNodeColorContext _localctx = new DfsStackNodeColorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_dfsStackNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__3);
			setState(249);
			match(T__4);
			setState(250);
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
	}

	public final DfsStackNodeShapeContext dfsStackNodeShape() throws RecognitionException {
		DfsStackNodeShapeContext _localctx = new DfsStackNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_dfsStackNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__5);
			setState(253);
			match(T__4);
			setState(254);
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
	}

	public final DfsVisitedNodeColorContext dfsVisitedNodeColor() throws RecognitionException {
		DfsVisitedNodeColorContext _localctx = new DfsVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_dfsVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			match(T__6);
			setState(257);
			match(T__4);
			setState(258);
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
	}

	public final DfsVisitedNodeShapeContext dfsVisitedNodeShape() throws RecognitionException {
		DfsVisitedNodeShapeContext _localctx = new DfsVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dfsVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			match(T__7);
			setState(261);
			match(T__4);
			setState(262);
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
		public TerminalNode INT() { return getToken(VesitLangParser.INT, 0); }
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
	}

	public final DfsDpiContext dfsDpi() throws RecognitionException {
		DfsDpiContext _localctx = new DfsDpiContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dfsDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			match(T__8);
			setState(265);
			match(T__4);
			setState(266);
			match(INT);
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
	}

	public final DfsOutImageDirContext dfsOutImageDir() throws RecognitionException {
		DfsOutImageDirContext _localctx = new DfsOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_dfsOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__9);
			setState(269);
			match(T__4);
			setState(270);
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
	}

	public final DfsPptNameContext dfsPptName() throws RecognitionException {
		DfsPptNameContext _localctx = new DfsPptNameContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_dfsPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(T__10);
			setState(273);
			match(T__4);
			setState(274);
			match(STRING);
			setState(275);
			match(T__11);
			setState(276);
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
	}

	public final BfsQueuedNodeColorContext bfsQueuedNodeColor() throws RecognitionException {
		BfsQueuedNodeColorContext _localctx = new BfsQueuedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_bfsQueuedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__12);
			setState(279);
			match(T__4);
			setState(280);
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
	}

	public final BfsVisitedNodeColorContext bfsVisitedNodeColor() throws RecognitionException {
		BfsVisitedNodeColorContext _localctx = new BfsVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_bfsVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(T__13);
			setState(283);
			match(T__4);
			setState(284);
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
	}

	public final BfsCurrentNodeColorContext bfsCurrentNodeColor() throws RecognitionException {
		BfsCurrentNodeColorContext _localctx = new BfsCurrentNodeColorContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_bfsCurrentNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			match(T__14);
			setState(287);
			match(T__4);
			setState(288);
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
	}

	public final BfsCurrentNodeShapeContext bfsCurrentNodeShape() throws RecognitionException {
		BfsCurrentNodeShapeContext _localctx = new BfsCurrentNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_bfsCurrentNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(T__15);
			setState(291);
			match(T__4);
			setState(292);
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
	}

	public final BfsQueuedNodeShapeContext bfsQueuedNodeShape() throws RecognitionException {
		BfsQueuedNodeShapeContext _localctx = new BfsQueuedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_bfsQueuedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(T__16);
			setState(295);
			match(T__4);
			setState(296);
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
	}

	public final BfsVisitedNodeShapeContext bfsVisitedNodeShape() throws RecognitionException {
		BfsVisitedNodeShapeContext _localctx = new BfsVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_bfsVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(T__17);
			setState(299);
			match(T__4);
			setState(300);
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
		public TerminalNode INT() { return getToken(VesitLangParser.INT, 0); }
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
	}

	public final BfsDpiContext bfsDpi() throws RecognitionException {
		BfsDpiContext _localctx = new BfsDpiContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_bfsDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			match(T__18);
			setState(303);
			match(T__4);
			setState(304);
			match(INT);
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
	}

	public final BfsOutImageDirContext bfsOutImageDir() throws RecognitionException {
		BfsOutImageDirContext _localctx = new BfsOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bfsOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__19);
			setState(307);
			match(T__4);
			setState(308);
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
	}

	public final BfsPptNameContext bfsPptName() throws RecognitionException {
		BfsPptNameContext _localctx = new BfsPptNameContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_bfsPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(T__20);
			setState(311);
			match(T__4);
			setState(312);
			match(STRING);
			setState(313);
			match(T__11);
			setState(314);
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

	public static class KruskalVisitedNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalVisitedNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalVisitedNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalVisitedNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalVisitedNodeColor(this);
		}
	}

	public final KruskalVisitedNodeColorContext kruskalVisitedNodeColor() throws RecognitionException {
		KruskalVisitedNodeColorContext _localctx = new KruskalVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_kruskalVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__21);
			setState(317);
			match(T__4);
			setState(318);
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

	public static class KruskalCurrentNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalCurrentNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalCurrentNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalCurrentNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalCurrentNodeColor(this);
		}
	}

	public final KruskalCurrentNodeColorContext kruskalCurrentNodeColor() throws RecognitionException {
		KruskalCurrentNodeColorContext _localctx = new KruskalCurrentNodeColorContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_kruskalCurrentNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			match(T__22);
			setState(321);
			match(T__4);
			setState(322);
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

	public static class KruskalCurrentNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalCurrentNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalCurrentNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalCurrentNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalCurrentNodeShape(this);
		}
	}

	public final KruskalCurrentNodeShapeContext kruskalCurrentNodeShape() throws RecognitionException {
		KruskalCurrentNodeShapeContext _localctx = new KruskalCurrentNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_kruskalCurrentNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(T__23);
			setState(325);
			match(T__4);
			setState(326);
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

	public static class KruskalVisitedNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalVisitedNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalVisitedNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalVisitedNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalVisitedNodeShape(this);
		}
	}

	public final KruskalVisitedNodeShapeContext kruskalVisitedNodeShape() throws RecognitionException {
		KruskalVisitedNodeShapeContext _localctx = new KruskalVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_kruskalVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__24);
			setState(329);
			match(T__4);
			setState(330);
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

	public static class KruskalDpiContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VesitLangParser.INT, 0); }
		public KruskalDpiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalDpi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalDpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalDpi(this);
		}
	}

	public final KruskalDpiContext kruskalDpi() throws RecognitionException {
		KruskalDpiContext _localctx = new KruskalDpiContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_kruskalDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(332);
			match(T__25);
			setState(333);
			match(T__4);
			setState(334);
			match(INT);
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

	public static class KruskalOutImageDirContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(VesitLangParser.PATH, 0); }
		public KruskalOutImageDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalOutImageDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalOutImageDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalOutImageDir(this);
		}
	}

	public final KruskalOutImageDirContext kruskalOutImageDir() throws RecognitionException {
		KruskalOutImageDirContext _localctx = new KruskalOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_kruskalOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(336);
			match(T__26);
			setState(337);
			match(T__4);
			setState(338);
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

	public static class KruskalPptNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VesitLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VesitLangParser.STRING, i);
		}
		public KruskalPptNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalPptName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalPptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalPptName(this);
		}
	}

	public final KruskalPptNameContext kruskalPptName() throws RecognitionException {
		KruskalPptNameContext _localctx = new KruskalPptNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_kruskalPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(340);
			match(T__27);
			setState(341);
			match(T__4);
			setState(342);
			match(STRING);
			setState(343);
			match(T__11);
			setState(344);
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

	public static class KruskalCurrentEdgeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalCurrentEdgeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalCurrentEdgeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalCurrentEdgeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalCurrentEdgeColor(this);
		}
	}

	public final KruskalCurrentEdgeColorContext kruskalCurrentEdgeColor() throws RecognitionException {
		KruskalCurrentEdgeColorContext _localctx = new KruskalCurrentEdgeColorContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_kruskalCurrentEdgeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(T__28);
			setState(347);
			match(T__4);
			setState(348);
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

	public static class KruskalCurrentEdgeWidthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalCurrentEdgeWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalCurrentEdgeWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalCurrentEdgeWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalCurrentEdgeWidth(this);
		}
	}

	public final KruskalCurrentEdgeWidthContext kruskalCurrentEdgeWidth() throws RecognitionException {
		KruskalCurrentEdgeWidthContext _localctx = new KruskalCurrentEdgeWidthContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_kruskalCurrentEdgeWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(350);
			match(T__29);
			setState(351);
			match(T__4);
			setState(352);
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

	public static class KruskalVisitedEdgeWidthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalVisitedEdgeWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalVisitedEdgeWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalVisitedEdgeWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalVisitedEdgeWidth(this);
		}
	}

	public final KruskalVisitedEdgeWidthContext kruskalVisitedEdgeWidth() throws RecognitionException {
		KruskalVisitedEdgeWidthContext _localctx = new KruskalVisitedEdgeWidthContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_kruskalVisitedEdgeWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			match(T__30);
			setState(355);
			match(T__4);
			setState(356);
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

	public static class KruskalVisitedEdgeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public KruskalVisitedEdgeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_kruskalVisitedEdgeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterKruskalVisitedEdgeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitKruskalVisitedEdgeColor(this);
		}
	}

	public final KruskalVisitedEdgeColorContext kruskalVisitedEdgeColor() throws RecognitionException {
		KruskalVisitedEdgeColorContext _localctx = new KruskalVisitedEdgeColorContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_kruskalVisitedEdgeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(T__31);
			setState(359);
			match(T__4);
			setState(360);
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

	public static class PrimVisitedNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimVisitedNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primVisitedNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimVisitedNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimVisitedNodeColor(this);
		}
	}

	public final PrimVisitedNodeColorContext primVisitedNodeColor() throws RecognitionException {
		PrimVisitedNodeColorContext _localctx = new PrimVisitedNodeColorContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_primVisitedNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			match(T__32);
			setState(363);
			match(T__4);
			setState(364);
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

	public static class PrimCurrentNodeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimCurrentNodeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primCurrentNodeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimCurrentNodeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimCurrentNodeColor(this);
		}
	}

	public final PrimCurrentNodeColorContext primCurrentNodeColor() throws RecognitionException {
		PrimCurrentNodeColorContext _localctx = new PrimCurrentNodeColorContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_primCurrentNodeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(366);
			match(T__33);
			setState(367);
			match(T__4);
			setState(368);
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

	public static class PrimCurrentNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimCurrentNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primCurrentNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimCurrentNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimCurrentNodeShape(this);
		}
	}

	public final PrimCurrentNodeShapeContext primCurrentNodeShape() throws RecognitionException {
		PrimCurrentNodeShapeContext _localctx = new PrimCurrentNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_primCurrentNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(T__34);
			setState(371);
			match(T__4);
			setState(372);
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

	public static class PrimVisitedNodeShapeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimVisitedNodeShapeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primVisitedNodeShape; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimVisitedNodeShape(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimVisitedNodeShape(this);
		}
	}

	public final PrimVisitedNodeShapeContext primVisitedNodeShape() throws RecognitionException {
		PrimVisitedNodeShapeContext _localctx = new PrimVisitedNodeShapeContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_primVisitedNodeShape);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			match(T__35);
			setState(375);
			match(T__4);
			setState(376);
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

	public static class PrimDpiContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(VesitLangParser.INT, 0); }
		public PrimDpiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primDpi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimDpi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimDpi(this);
		}
	}

	public final PrimDpiContext primDpi() throws RecognitionException {
		PrimDpiContext _localctx = new PrimDpiContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_primDpi);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(378);
			match(T__36);
			setState(379);
			match(T__4);
			setState(380);
			match(INT);
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

	public static class PrimOutImageDirContext extends ParserRuleContext {
		public TerminalNode PATH() { return getToken(VesitLangParser.PATH, 0); }
		public PrimOutImageDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primOutImageDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimOutImageDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimOutImageDir(this);
		}
	}

	public final PrimOutImageDirContext primOutImageDir() throws RecognitionException {
		PrimOutImageDirContext _localctx = new PrimOutImageDirContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_primOutImageDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(382);
			match(T__37);
			setState(383);
			match(T__4);
			setState(384);
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

	public static class PrimPptNameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(VesitLangParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VesitLangParser.STRING, i);
		}
		public PrimPptNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primPptName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimPptName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimPptName(this);
		}
	}

	public final PrimPptNameContext primPptName() throws RecognitionException {
		PrimPptNameContext _localctx = new PrimPptNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_primPptName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(T__38);
			setState(387);
			match(T__4);
			setState(388);
			match(STRING);
			setState(389);
			match(T__11);
			setState(390);
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

	public static class PrimCurrentEdgeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimCurrentEdgeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primCurrentEdgeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimCurrentEdgeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimCurrentEdgeColor(this);
		}
	}

	public final PrimCurrentEdgeColorContext primCurrentEdgeColor() throws RecognitionException {
		PrimCurrentEdgeColorContext _localctx = new PrimCurrentEdgeColorContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_primCurrentEdgeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			match(T__39);
			setState(393);
			match(T__4);
			setState(394);
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

	public static class PrimCurrentEdgeWidthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimCurrentEdgeWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primCurrentEdgeWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimCurrentEdgeWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimCurrentEdgeWidth(this);
		}
	}

	public final PrimCurrentEdgeWidthContext primCurrentEdgeWidth() throws RecognitionException {
		PrimCurrentEdgeWidthContext _localctx = new PrimCurrentEdgeWidthContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_primCurrentEdgeWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(T__40);
			setState(397);
			match(T__4);
			setState(398);
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

	public static class PrimVisitedEdgeWidthContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimVisitedEdgeWidthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primVisitedEdgeWidth; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimVisitedEdgeWidth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimVisitedEdgeWidth(this);
		}
	}

	public final PrimVisitedEdgeWidthContext primVisitedEdgeWidth() throws RecognitionException {
		PrimVisitedEdgeWidthContext _localctx = new PrimVisitedEdgeWidthContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_primVisitedEdgeWidth);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(400);
			match(T__41);
			setState(401);
			match(T__4);
			setState(402);
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

	public static class PrimVisitedEdgeColorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VesitLangParser.STRING, 0); }
		public PrimVisitedEdgeColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primVisitedEdgeColor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).enterPrimVisitedEdgeColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VesitLangListener ) ((VesitLangListener)listener).exitPrimVisitedEdgeColor(this);
		}
	}

	public final PrimVisitedEdgeColorContext primVisitedEdgeColor() throws RecognitionException {
		PrimVisitedEdgeColorContext _localctx = new PrimVisitedEdgeColorContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_primVisitedEdgeColor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(404);
			match(T__42);
			setState(405);
			match(T__4);
			setState(406);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u019b\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\3\2\3\2\3\2\3\2\7\2q\n\2\f\2\16\2t\13\2\3\2\3"+
		"\2\3\2\5\2y\n\2\3\3\3\3\3\3\3\3\7\3\177\n\3\f\3\16\3\u0082\13\3\3\3\3"+
		"\3\3\3\5\3\u0087\n\3\3\4\3\4\3\4\7\4\u008c\n\4\f\4\16\4\u008f\13\4\3\4"+
		"\3\4\5\4\u0093\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u009b\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6\u00a6\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\5\7\u00b3\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5"+
		"\b\u00c0\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00c9\n\t\3\n\6\n\u00cc\n"+
		"\n\r\n\16\n\u00cd\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00dc\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\5\16\u00ed\n\16\3\17\3\17\3\17\3\17\5\17\u00f3"+
		"\n\17\3\20\3\20\3\20\3\20\5\20\u00f9\n\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\37\3\37\3\37\3\37"+
		"\3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3%\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3)\3)\3"+
		")\3)\3*\3*\3*\3*\3+\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3-\3.\3.\3.\3.\3/\3"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3"+
		"\66\3\66\3\66\3\66\3\66\2\2\67\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhj\2\2\2\u0195\2x\3\2\2"+
		"\2\4\u0086\3\2\2\2\6\u0092\3\2\2\2\b\u009a\3\2\2\2\n\u00a5\3\2\2\2\f\u00b2"+
		"\3\2\2\2\16\u00bf\3\2\2\2\20\u00c8\3\2\2\2\22\u00cb\3\2\2\2\24\u00db\3"+
		"\2\2\2\26\u00dd\3\2\2\2\30\u00df\3\2\2\2\32\u00ec\3\2\2\2\34\u00f2\3\2"+
		"\2\2\36\u00f8\3\2\2\2 \u00fa\3\2\2\2\"\u00fe\3\2\2\2$\u0102\3\2\2\2&\u0106"+
		"\3\2\2\2(\u010a\3\2\2\2*\u010e\3\2\2\2,\u0112\3\2\2\2.\u0118\3\2\2\2\60"+
		"\u011c\3\2\2\2\62\u0120\3\2\2\2\64\u0124\3\2\2\2\66\u0128\3\2\2\28\u012c"+
		"\3\2\2\2:\u0130\3\2\2\2<\u0134\3\2\2\2>\u0138\3\2\2\2@\u013e\3\2\2\2B"+
		"\u0142\3\2\2\2D\u0146\3\2\2\2F\u014a\3\2\2\2H\u014e\3\2\2\2J\u0152\3\2"+
		"\2\2L\u0156\3\2\2\2N\u015c\3\2\2\2P\u0160\3\2\2\2R\u0164\3\2\2\2T\u0168"+
		"\3\2\2\2V\u016c\3\2\2\2X\u0170\3\2\2\2Z\u0174\3\2\2\2\\\u0178\3\2\2\2"+
		"^\u017c\3\2\2\2`\u0180\3\2\2\2b\u0184\3\2\2\2d\u018a\3\2\2\2f\u018e\3"+
		"\2\2\2h\u0192\3\2\2\2j\u0196\3\2\2\2lm\7\60\2\2mn\7\67\2\2nr\7\3\2\2o"+
		"q\5\n\6\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2"+
		"uy\7\4\2\2vw\7\60\2\2wy\7\67\2\2xl\3\2\2\2xv\3\2\2\2y\3\3\2\2\2z{\7\61"+
		"\2\2{|\7\67\2\2|\u0080\7\3\2\2}\177\5\20\t\2~}\3\2\2\2\177\u0082\3\2\2"+
		"\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0087\7\4\2\2\u0084\u0085\7\61\2\2\u0085\u0087\7\67\2\2"+
		"\u0086z\3\2\2\2\u0086\u0084\3\2\2\2\u0087\5\3\2\2\2\u0088\u0089\7\62\2"+
		"\2\u0089\u008d\7\3\2\2\u008a\u008c\5\f\7\2\u008b\u008a\3\2\2\2\u008c\u008f"+
		"\3\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0093\7\4\2\2\u0091\u0093\7\62\2\2\u0092\u0088\3"+
		"\2\2\2\u0092\u0091\3\2\2\2\u0093\7\3\2\2\2\u0094\u0095\7\63\2\2\u0095"+
		"\u0096\7\3\2\2\u0096\u0097\5\16\b\2\u0097\u0098\7\4\2\2\u0098\u009b\3"+
		"\2\2\2\u0099\u009b\7\63\2\2\u009a\u0094\3\2\2\2\u009a\u0099\3\2\2\2\u009b"+
		"\t\3\2\2\2\u009c\u00a6\5.\30\2\u009d\u00a6\5\60\31\2\u009e\u00a6\5\62"+
		"\32\2\u009f\u00a6\5\64\33\2\u00a0\u00a6\5\66\34\2\u00a1\u00a6\58\35\2"+
		"\u00a2\u00a6\5:\36\2\u00a3\u00a6\5<\37\2\u00a4\u00a6\5> \2\u00a5\u009c"+
		"\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a5\u009f\3\2\2\2\u00a5"+
		"\u00a0\3\2\2\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5\u00a3\3\2"+
		"\2\2\u00a5\u00a4\3\2\2\2\u00a6\13\3\2\2\2\u00a7\u00b3\5@!\2\u00a8\u00b3"+
		"\5B\"\2\u00a9\u00b3\5D#\2\u00aa\u00b3\5F$\2\u00ab\u00b3\5H%\2\u00ac\u00b3"+
		"\5J&\2\u00ad\u00b3\5L\'\2\u00ae\u00b3\5N(\2\u00af\u00b3\5P)\2\u00b0\u00b3"+
		"\5R*\2\u00b1\u00b3\5T+\2\u00b2\u00a7\3\2\2\2\u00b2\u00a8\3\2\2\2\u00b2"+
		"\u00a9\3\2\2\2\u00b2\u00aa\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b2\u00ac\3\2"+
		"\2\2\u00b2\u00ad\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b2\u00af\3\2\2\2\u00b2"+
		"\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\r\3\2\2\2\u00b4\u00c0\5V,\2\u00b5"+
		"\u00c0\5X-\2\u00b6\u00c0\5Z.\2\u00b7\u00c0\5\\/\2\u00b8\u00c0\5^\60\2"+
		"\u00b9\u00c0\5`\61\2\u00ba\u00c0\5b\62\2\u00bb\u00c0\5d\63\2\u00bc\u00c0"+
		"\5f\64\2\u00bd\u00c0\5h\65\2\u00be\u00c0\5j\66\2\u00bf\u00b4\3\2\2\2\u00bf"+
		"\u00b5\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00b7\3\2\2\2\u00bf\u00b8\3\2"+
		"\2\2\u00bf\u00b9\3\2\2\2\u00bf\u00ba\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf"+
		"\u00bc\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00be\3\2\2\2\u00c0\17\3\2\2"+
		"\2\u00c1\u00c9\5 \21\2\u00c2\u00c9\5\"\22\2\u00c3\u00c9\5$\23\2\u00c4"+
		"\u00c9\5&\24\2\u00c5\u00c9\5(\25\2\u00c6\u00c9\5*\26\2\u00c7\u00c9\5,"+
		"\27\2\u00c8\u00c1\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8\u00c3\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c8\u00c5\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c8\u00c7\3\2"+
		"\2\2\u00c9\21\3\2\2\2\u00ca\u00cc\5\24\13\2\u00cb\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd\u00ce\3\2\2\2\u00ce\23\3\2\2"+
		"\2\u00cf\u00d0\7\65\2\2\u00d0\u00d1\5\26\f\2\u00d1\u00d2\7\66\2\2\u00d2"+
		"\u00d3\5\30\r\2\u00d3\u00d4\7\5\2\2\u00d4\u00d5\79\2\2\u00d5\u00dc\3\2"+
		"\2\2\u00d6\u00d7\7\65\2\2\u00d7\u00d8\5\26\f\2\u00d8\u00d9\7\66\2\2\u00d9"+
		"\u00da\5\30\r\2\u00da\u00dc\3\2\2\2\u00db\u00cf\3\2\2\2\u00db\u00d6\3"+
		"\2\2\2\u00dc\25\3\2\2\2\u00dd\u00de\7\67\2\2\u00de\27\3\2\2\2\u00df\u00e0"+
		"\7\67\2\2\u00e0\31\3\2\2\2\u00e1\u00e2\7.\2\2\u00e2\u00e3\7\3\2\2\u00e3"+
		"\u00e4\5\22\n\2\u00e4\u00e5\7\4\2\2\u00e5\u00e6\5\34\17\2\u00e6\u00ed"+
		"\3\2\2\2\u00e7\u00e8\7.\2\2\u00e8\u00e9\7\3\2\2\u00e9\u00ea\5\22\n\2\u00ea"+
		"\u00eb\7\4\2\2\u00eb\u00ed\3\2\2\2\u00ec\u00e1\3\2\2\2\u00ec\u00e7\3\2"+
		"\2\2\u00ed\33\3\2\2\2\u00ee\u00ef\5\36\20\2\u00ef\u00f0\5\34\17\2\u00f0"+
		"\u00f3\3\2\2\2\u00f1\u00f3\5\36\20\2\u00f2\u00ee\3\2\2\2\u00f2\u00f1\3"+
		"\2\2\2\u00f3\35\3\2\2\2\u00f4\u00f9\5\2\2\2\u00f5\u00f9\5\4\3\2\u00f6"+
		"\u00f9\5\6\4\2\u00f7\u00f9\5\b\5\2\u00f8\u00f4\3\2\2\2\u00f8\u00f5\3\2"+
		"\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\37\3\2\2\2\u00fa\u00fb"+
		"\7\6\2\2\u00fb\u00fc\7\7\2\2\u00fc\u00fd\7\67\2\2\u00fd!\3\2\2\2\u00fe"+
		"\u00ff\7\b\2\2\u00ff\u0100\7\7\2\2\u0100\u0101\7\67\2\2\u0101#\3\2\2\2"+
		"\u0102\u0103\7\t\2\2\u0103\u0104\7\7\2\2\u0104\u0105\7\67\2\2\u0105%\3"+
		"\2\2\2\u0106\u0107\7\n\2\2\u0107\u0108\7\7\2\2\u0108\u0109\7\67\2\2\u0109"+
		"\'\3\2\2\2\u010a\u010b\7\13\2\2\u010b\u010c\7\7\2\2\u010c\u010d\79\2\2"+
		"\u010d)\3\2\2\2\u010e\u010f\7\f\2\2\u010f\u0110\7\7\2\2\u0110\u0111\7"+
		"\64\2\2\u0111+\3\2\2\2\u0112\u0113\7\r\2\2\u0113\u0114\7\7\2\2\u0114\u0115"+
		"\7\67\2\2\u0115\u0116\7\16\2\2\u0116\u0117\7\67\2\2\u0117-\3\2\2\2\u0118"+
		"\u0119\7\17\2\2\u0119\u011a\7\7\2\2\u011a\u011b\7\67\2\2\u011b/\3\2\2"+
		"\2\u011c\u011d\7\20\2\2\u011d\u011e\7\7\2\2\u011e\u011f\7\67\2\2\u011f"+
		"\61\3\2\2\2\u0120\u0121\7\21\2\2\u0121\u0122\7\7\2\2\u0122\u0123\7\67"+
		"\2\2\u0123\63\3\2\2\2\u0124\u0125\7\22\2\2\u0125\u0126\7\7\2\2\u0126\u0127"+
		"\7\67\2\2\u0127\65\3\2\2\2\u0128\u0129\7\23\2\2\u0129\u012a\7\7\2\2\u012a"+
		"\u012b\7\67\2\2\u012b\67\3\2\2\2\u012c\u012d\7\24\2\2\u012d\u012e\7\7"+
		"\2\2\u012e\u012f\7\67\2\2\u012f9\3\2\2\2\u0130\u0131\7\25\2\2\u0131\u0132"+
		"\7\7\2\2\u0132\u0133\79\2\2\u0133;\3\2\2\2\u0134\u0135\7\26\2\2\u0135"+
		"\u0136\7\7\2\2\u0136\u0137\7\64\2\2\u0137=\3\2\2\2\u0138\u0139\7\27\2"+
		"\2\u0139\u013a\7\7\2\2\u013a\u013b\7\67\2\2\u013b\u013c\7\16\2\2\u013c"+
		"\u013d\7\67\2\2\u013d?\3\2\2\2\u013e\u013f\7\30\2\2\u013f\u0140\7\7\2"+
		"\2\u0140\u0141\7\67\2\2\u0141A\3\2\2\2\u0142\u0143\7\31\2\2\u0143\u0144"+
		"\7\7\2\2\u0144\u0145\7\67\2\2\u0145C\3\2\2\2\u0146\u0147\7\32\2\2\u0147"+
		"\u0148\7\7\2\2\u0148\u0149\7\67\2\2\u0149E\3\2\2\2\u014a\u014b\7\33\2"+
		"\2\u014b\u014c\7\7\2\2\u014c\u014d\7\67\2\2\u014dG\3\2\2\2\u014e\u014f"+
		"\7\34\2\2\u014f\u0150\7\7\2\2\u0150\u0151\79\2\2\u0151I\3\2\2\2\u0152"+
		"\u0153\7\35\2\2\u0153\u0154\7\7\2\2\u0154\u0155\7\64\2\2\u0155K\3\2\2"+
		"\2\u0156\u0157\7\36\2\2\u0157\u0158\7\7\2\2\u0158\u0159\7\67\2\2\u0159"+
		"\u015a\7\16\2\2\u015a\u015b\7\67\2\2\u015bM\3\2\2\2\u015c\u015d\7\37\2"+
		"\2\u015d\u015e\7\7\2\2\u015e\u015f\7\67\2\2\u015fO\3\2\2\2\u0160\u0161"+
		"\7 \2\2\u0161\u0162\7\7\2\2\u0162\u0163\7\67\2\2\u0163Q\3\2\2\2\u0164"+
		"\u0165\7!\2\2\u0165\u0166\7\7\2\2\u0166\u0167\7\67\2\2\u0167S\3\2\2\2"+
		"\u0168\u0169\7\"\2\2\u0169\u016a\7\7\2\2\u016a\u016b\7\67\2\2\u016bU\3"+
		"\2\2\2\u016c\u016d\7#\2\2\u016d\u016e\7\7\2\2\u016e\u016f\7\67\2\2\u016f"+
		"W\3\2\2\2\u0170\u0171\7$\2\2\u0171\u0172\7\7\2\2\u0172\u0173\7\67\2\2"+
		"\u0173Y\3\2\2\2\u0174\u0175\7%\2\2\u0175\u0176\7\7\2\2\u0176\u0177\7\67"+
		"\2\2\u0177[\3\2\2\2\u0178\u0179\7&\2\2\u0179\u017a\7\7\2\2\u017a\u017b"+
		"\7\67\2\2\u017b]\3\2\2\2\u017c\u017d\7\'\2\2\u017d\u017e\7\7\2\2\u017e"+
		"\u017f\79\2\2\u017f_\3\2\2\2\u0180\u0181\7(\2\2\u0181\u0182\7\7\2\2\u0182"+
		"\u0183\7\64\2\2\u0183a\3\2\2\2\u0184\u0185\7)\2\2\u0185\u0186\7\7\2\2"+
		"\u0186\u0187\7\67\2\2\u0187\u0188\7\16\2\2\u0188\u0189\7\67\2\2\u0189"+
		"c\3\2\2\2\u018a\u018b\7*\2\2\u018b\u018c\7\7\2\2\u018c\u018d\7\67\2\2"+
		"\u018de\3\2\2\2\u018e\u018f\7+\2\2\u018f\u0190\7\7\2\2\u0190\u0191\7\67"+
		"\2\2\u0191g\3\2\2\2\u0192\u0193\7,\2\2\u0193\u0194\7\7\2\2\u0194\u0195"+
		"\7\67\2\2\u0195i\3\2\2\2\u0196\u0197\7-\2\2\u0197\u0198\7\7\2\2\u0198"+
		"\u0199\7\67\2\2\u0199k\3\2\2\2\22rx\u0080\u0086\u008d\u0092\u009a\u00a5"+
		"\u00b2\u00bf\u00c8\u00cd\u00db\u00ec\u00f2\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}