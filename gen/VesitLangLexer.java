// Generated from /media/a/common/vesitLang/src/VesitLang.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VesitLangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		PATH=25, FROM=26, TO=27, STRING=28, CHAR=29, INT=30, WS=31;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "PATH", 
		"FROM", "TO", "STRING", "CHAR", "INT", "WS"
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


	public VesitLangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "VesitLang.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0185\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\6\32\u0167\n\32\r\32\16\32"+
		"\u0168\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u0174\n\35\r"+
		"\35\16\35\u0175\3\36\3\36\3\37\6\37\u017b\n\37\r\37\16\37\u017c\3 \6 "+
		"\u0180\n \r \16 \u0181\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17"+
		"\17\"\"\2\u0188\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2"+
		"\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\2"+
		"9\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5E\3\2\2\2\7G\3"+
		"\2\2\2\tI\3\2\2\2\13M\3\2\2\2\rS\3\2\2\2\17[\3\2\2\2\21m\3\2\2\2\23o\3"+
		"\2\2\2\25\u0081\3\2\2\2\27\u0095\3\2\2\2\31\u00a9\3\2\2\2\33\u00b0\3\2"+
		"\2\2\35\u00bf\3\2\2\2\37\u00ca\3\2\2\2!\u00cc\3\2\2\2#\u00df\3\2\2\2%"+
		"\u00f3\3\2\2\2\'\u0107\3\2\2\2)\u011b\3\2\2\2+\u012e\3\2\2\2-\u0142\3"+
		"\2\2\2/\u0149\3\2\2\2\61\u0158\3\2\2\2\63\u0166\3\2\2\2\65\u016a\3\2\2"+
		"\2\67\u016f\3\2\2\29\u0173\3\2\2\2;\u0177\3\2\2\2=\u017a\3\2\2\2?\u017f"+
		"\3\2\2\2AB\7d\2\2BC\7h\2\2CD\7u\2\2D\4\3\2\2\2EF\7}\2\2F\6\3\2\2\2GH\7"+
		"\177\2\2H\b\3\2\2\2IJ\7f\2\2JK\7h\2\2KL\7u\2\2L\n\3\2\2\2MN\7i\2\2NO\7"+
		"t\2\2OP\7c\2\2PQ\7r\2\2QR\7j\2\2R\f\3\2\2\2ST\7f\2\2TU\7k\2\2UV\7i\2\2"+
		"VW\7t\2\2WX\7c\2\2XY\7r\2\2YZ\7j\2\2Z\16\3\2\2\2[\\\7f\2\2\\]\7h\2\2]"+
		"^\7u\2\2^_\7U\2\2_`\7v\2\2`a\7c\2\2ab\7e\2\2bc\7m\2\2cd\7P\2\2de\7q\2"+
		"\2ef\7f\2\2fg\7g\2\2gh\7E\2\2hi\7q\2\2ij\7n\2\2jk\7q\2\2kl\7t\2\2l\20"+
		"\3\2\2\2mn\7?\2\2n\22\3\2\2\2op\7f\2\2pq\7h\2\2qr\7u\2\2rs\7U\2\2st\7"+
		"v\2\2tu\7c\2\2uv\7e\2\2vw\7m\2\2wx\7P\2\2xy\7q\2\2yz\7f\2\2z{\7g\2\2{"+
		"|\7U\2\2|}\7j\2\2}~\7c\2\2~\177\7r\2\2\177\u0080\7g\2\2\u0080\24\3\2\2"+
		"\2\u0081\u0082\7f\2\2\u0082\u0083\7h\2\2\u0083\u0084\7u\2\2\u0084\u0085"+
		"\7X\2\2\u0085\u0086\7k\2\2\u0086\u0087\7u\2\2\u0087\u0088\7k\2\2\u0088"+
		"\u0089\7v\2\2\u0089\u008a\7g\2\2\u008a\u008b\7f\2\2\u008b\u008c\7P\2\2"+
		"\u008c\u008d\7q\2\2\u008d\u008e\7f\2\2\u008e\u008f\7g\2\2\u008f\u0090"+
		"\7E\2\2\u0090\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\u0093\7q\2\2\u0093"+
		"\u0094\7t\2\2\u0094\26\3\2\2\2\u0095\u0096\7f\2\2\u0096\u0097\7h\2\2\u0097"+
		"\u0098\7u\2\2\u0098\u0099\7X\2\2\u0099\u009a\7k\2\2\u009a\u009b\7u\2\2"+
		"\u009b\u009c\7k\2\2\u009c\u009d\7v\2\2\u009d\u009e\7g\2\2\u009e\u009f"+
		"\7f\2\2\u009f\u00a0\7P\2\2\u00a0\u00a1\7q\2\2\u00a1\u00a2\7f\2\2\u00a2"+
		"\u00a3\7g\2\2\u00a3\u00a4\7U\2\2\u00a4\u00a5\7j\2\2\u00a5\u00a6\7c\2\2"+
		"\u00a6\u00a7\7r\2\2\u00a7\u00a8\7g\2\2\u00a8\30\3\2\2\2\u00a9\u00aa\7"+
		"f\2\2\u00aa\u00ab\7h\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7F\2\2\u00ad\u00ae"+
		"\7r\2\2\u00ae\u00af\7k\2\2\u00af\32\3\2\2\2\u00b0\u00b1\7f\2\2\u00b1\u00b2"+
		"\7h\2\2\u00b2\u00b3\7u\2\2\u00b3\u00b4\7Q\2\2\u00b4\u00b5\7w\2\2\u00b5"+
		"\u00b6\7v\2\2\u00b6\u00b7\7K\2\2\u00b7\u00b8\7o\2\2\u00b8\u00b9\7c\2\2"+
		"\u00b9\u00ba\7i\2\2\u00ba\u00bb\7g\2\2\u00bb\u00bc\7F\2\2\u00bc\u00bd"+
		"\7k\2\2\u00bd\u00be\7t\2\2\u00be\34\3\2\2\2\u00bf\u00c0\7f\2\2\u00c0\u00c1"+
		"\7h\2\2\u00c1\u00c2\7u\2\2\u00c2\u00c3\7R\2\2\u00c3\u00c4\7r\2\2\u00c4"+
		"\u00c5\7v\2\2\u00c5\u00c6\7P\2\2\u00c6\u00c7\7c\2\2\u00c7\u00c8\7o\2\2"+
		"\u00c8\u00c9\7g\2\2\u00c9\36\3\2\2\2\u00ca\u00cb\7\60\2\2\u00cb \3\2\2"+
		"\2\u00cc\u00cd\7d\2\2\u00cd\u00ce\7h\2\2\u00ce\u00cf\7u\2\2\u00cf\u00d0"+
		"\7S\2\2\u00d0\u00d1\7w\2\2\u00d1\u00d2\7g\2\2\u00d2\u00d3\7w\2\2\u00d3"+
		"\u00d4\7g\2\2\u00d4\u00d5\7f\2\2\u00d5\u00d6\7P\2\2\u00d6\u00d7\7q\2\2"+
		"\u00d7\u00d8\7f\2\2\u00d8\u00d9\7g\2\2\u00d9\u00da\7E\2\2\u00da\u00db"+
		"\7q\2\2\u00db\u00dc\7n\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\"\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7h\2\2\u00e1\u00e2\7u\2\2\u00e2"+
		"\u00e3\7X\2\2\u00e3\u00e4\7k\2\2\u00e4\u00e5\7u\2\2\u00e5\u00e6\7k\2\2"+
		"\u00e6\u00e7\7v\2\2\u00e7\u00e8\7g\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea"+
		"\7P\2\2\u00ea\u00eb\7q\2\2\u00eb\u00ec\7f\2\2\u00ec\u00ed\7g\2\2\u00ed"+
		"\u00ee\7E\2\2\u00ee\u00ef\7q\2\2\u00ef\u00f0\7n\2\2\u00f0\u00f1\7q\2\2"+
		"\u00f1\u00f2\7t\2\2\u00f2$\3\2\2\2\u00f3\u00f4\7d\2\2\u00f4\u00f5\7h\2"+
		"\2\u00f5\u00f6\7u\2\2\u00f6\u00f7\7E\2\2\u00f7\u00f8\7w\2\2\u00f8\u00f9"+
		"\7t\2\2\u00f9\u00fa\7t\2\2\u00fa\u00fb\7g\2\2\u00fb\u00fc\7p\2\2\u00fc"+
		"\u00fd\7v\2\2\u00fd\u00fe\7P\2\2\u00fe\u00ff\7q\2\2\u00ff\u0100\7f\2\2"+
		"\u0100\u0101\7g\2\2\u0101\u0102\7E\2\2\u0102\u0103\7q\2\2\u0103\u0104"+
		"\7n\2\2\u0104\u0105\7q\2\2\u0105\u0106\7t\2\2\u0106&\3\2\2\2\u0107\u0108"+
		"\7d\2\2\u0108\u0109\7h\2\2\u0109\u010a\7u\2\2\u010a\u010b\7E\2\2\u010b"+
		"\u010c\7w\2\2\u010c\u010d\7t\2\2\u010d\u010e\7t\2\2\u010e\u010f\7g\2\2"+
		"\u010f\u0110\7p\2\2\u0110\u0111\7v\2\2\u0111\u0112\7P\2\2\u0112\u0113"+
		"\7q\2\2\u0113\u0114\7f\2\2\u0114\u0115\7g\2\2\u0115\u0116\7U\2\2\u0116"+
		"\u0117\7j\2\2\u0117\u0118\7c\2\2\u0118\u0119\7r\2\2\u0119\u011a\7g\2\2"+
		"\u011a(\3\2\2\2\u011b\u011c\7d\2\2\u011c\u011d\7h\2\2\u011d\u011e\7u\2"+
		"\2\u011e\u011f\7S\2\2\u011f\u0120\7w\2\2\u0120\u0121\7g\2\2\u0121\u0122"+
		"\7w\2\2\u0122\u0123\7g\2\2\u0123\u0124\7f\2\2\u0124\u0125\7P\2\2\u0125"+
		"\u0126\7q\2\2\u0126\u0127\7f\2\2\u0127\u0128\7g\2\2\u0128\u0129\7U\2\2"+
		"\u0129\u012a\7j\2\2\u012a\u012b\7c\2\2\u012b\u012c\7r\2\2\u012c\u012d"+
		"\7g\2\2\u012d*\3\2\2\2\u012e\u012f\7d\2\2\u012f\u0130\7h\2\2\u0130\u0131"+
		"\7u\2\2\u0131\u0132\7X\2\2\u0132\u0133\7k\2\2\u0133\u0134\7u\2\2\u0134"+
		"\u0135\7k\2\2\u0135\u0136\7v\2\2\u0136\u0137\7g\2\2\u0137\u0138\7f\2\2"+
		"\u0138\u0139\7P\2\2\u0139\u013a\7q\2\2\u013a\u013b\7f\2\2\u013b\u013c"+
		"\7g\2\2\u013c\u013d\7U\2\2\u013d\u013e\7j\2\2\u013e\u013f\7c\2\2\u013f"+
		"\u0140\7r\2\2\u0140\u0141\7g\2\2\u0141,\3\2\2\2\u0142\u0143\7d\2\2\u0143"+
		"\u0144\7h\2\2\u0144\u0145\7u\2\2\u0145\u0146\7F\2\2\u0146\u0147\7r\2\2"+
		"\u0147\u0148\7k\2\2\u0148.\3\2\2\2\u0149\u014a\7d\2\2\u014a\u014b\7h\2"+
		"\2\u014b\u014c\7u\2\2\u014c\u014d\7Q\2\2\u014d\u014e\7w\2\2\u014e\u014f"+
		"\7v\2\2\u014f\u0150\7K\2\2\u0150\u0151\7o\2\2\u0151\u0152\7c\2\2\u0152"+
		"\u0153\7i\2\2\u0153\u0154\7g\2\2\u0154\u0155\7F\2\2\u0155\u0156\7k\2\2"+
		"\u0156\u0157\7t\2\2\u0157\60\3\2\2\2\u0158\u0159\7d\2\2\u0159\u015a\7"+
		"h\2\2\u015a\u015b\7u\2\2\u015b\u015c\7R\2\2\u015c\u015d\7r\2\2\u015d\u015e"+
		"\7v\2\2\u015e\u015f\7P\2\2\u015f\u0160\7c\2\2\u0160\u0161\7o\2\2\u0161"+
		"\u0162\7g\2\2\u0162\62\3\2\2\2\u0163\u0164\59\35\2\u0164\u0165\7\61\2"+
		"\2\u0165\u0167\3\2\2\2\u0166\u0163\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166"+
		"\3\2\2\2\u0168\u0169\3\2\2\2\u0169\64\3\2\2\2\u016a\u016b\7h\2\2\u016b"+
		"\u016c\7t\2\2\u016c\u016d\7q\2\2\u016d\u016e\7o\2\2\u016e\66\3\2\2\2\u016f"+
		"\u0170\7v\2\2\u0170\u0171\7q\2\2\u01718\3\2\2\2\u0172\u0174\5;\36\2\u0173"+
		"\u0172\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0176\3\2"+
		"\2\2\u0176:\3\2\2\2\u0177\u0178\t\2\2\2\u0178<\3\2\2\2\u0179\u017b\t\3"+
		"\2\2\u017a\u0179\3\2\2\2\u017b\u017c\3\2\2\2\u017c\u017a\3\2\2\2\u017c"+
		"\u017d\3\2\2\2\u017d>\3\2\2\2\u017e\u0180\t\4\2\2\u017f\u017e\3\2\2\2"+
		"\u0180\u0181\3\2\2\2\u0181\u017f\3\2\2\2\u0181\u0182\3\2\2\2\u0182\u0183"+
		"\3\2\2\2\u0183\u0184\b \2\2\u0184@\3\2\2\2\7\2\u0168\u0175\u017c\u0181"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}