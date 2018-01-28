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
		null, "'bfs'", "'{'", "'}'", "'dfs'", "'graph'", "'cost'", "'dfsStackNodeColor'", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2!\u0182\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3"+
		"\31\3\31\3\31\3\32\3\32\3\32\6\32\u0164\n\32\r\32\16\32\u0165\3\33\3\33"+
		"\3\33\3\33\3\33\3\34\3\34\3\34\3\35\6\35\u0171\n\35\r\35\16\35\u0172\3"+
		"\36\3\36\3\37\6\37\u0178\n\37\r\37\16\37\u0179\3 \6 \u017d\n \r \16 \u017e"+
		"\3 \3 \2\2!\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!\3\2\5\4\2C\\c|\3\2\62;\5\2\13\f\17\17\"\"\2\u0185\2\3"+
		"\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2"+
		"\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\3A\3\2\2\2\5E\3\2\2\2\7G\3\2\2\2\tI\3\2\2\2\13"+
		"M\3\2\2\2\rS\3\2\2\2\17X\3\2\2\2\21j\3\2\2\2\23l\3\2\2\2\25~\3\2\2\2\27"+
		"\u0092\3\2\2\2\31\u00a6\3\2\2\2\33\u00ad\3\2\2\2\35\u00bc\3\2\2\2\37\u00c7"+
		"\3\2\2\2!\u00c9\3\2\2\2#\u00dc\3\2\2\2%\u00f0\3\2\2\2\'\u0104\3\2\2\2"+
		")\u0118\3\2\2\2+\u012b\3\2\2\2-\u013f\3\2\2\2/\u0146\3\2\2\2\61\u0155"+
		"\3\2\2\2\63\u0163\3\2\2\2\65\u0167\3\2\2\2\67\u016c\3\2\2\29\u0170\3\2"+
		"\2\2;\u0174\3\2\2\2=\u0177\3\2\2\2?\u017c\3\2\2\2AB\7d\2\2BC\7h\2\2CD"+
		"\7u\2\2D\4\3\2\2\2EF\7}\2\2F\6\3\2\2\2GH\7\177\2\2H\b\3\2\2\2IJ\7f\2\2"+
		"JK\7h\2\2KL\7u\2\2L\n\3\2\2\2MN\7i\2\2NO\7t\2\2OP\7c\2\2PQ\7r\2\2QR\7"+
		"j\2\2R\f\3\2\2\2ST\7e\2\2TU\7q\2\2UV\7u\2\2VW\7v\2\2W\16\3\2\2\2XY\7f"+
		"\2\2YZ\7h\2\2Z[\7u\2\2[\\\7U\2\2\\]\7v\2\2]^\7c\2\2^_\7e\2\2_`\7m\2\2"+
		"`a\7P\2\2ab\7q\2\2bc\7f\2\2cd\7g\2\2de\7E\2\2ef\7q\2\2fg\7n\2\2gh\7q\2"+
		"\2hi\7t\2\2i\20\3\2\2\2jk\7?\2\2k\22\3\2\2\2lm\7f\2\2mn\7h\2\2no\7u\2"+
		"\2op\7U\2\2pq\7v\2\2qr\7c\2\2rs\7e\2\2st\7m\2\2tu\7P\2\2uv\7q\2\2vw\7"+
		"f\2\2wx\7g\2\2xy\7U\2\2yz\7j\2\2z{\7c\2\2{|\7r\2\2|}\7g\2\2}\24\3\2\2"+
		"\2~\177\7f\2\2\177\u0080\7h\2\2\u0080\u0081\7u\2\2\u0081\u0082\7X\2\2"+
		"\u0082\u0083\7k\2\2\u0083\u0084\7u\2\2\u0084\u0085\7k\2\2\u0085\u0086"+
		"\7v\2\2\u0086\u0087\7g\2\2\u0087\u0088\7f\2\2\u0088\u0089\7P\2\2\u0089"+
		"\u008a\7q\2\2\u008a\u008b\7f\2\2\u008b\u008c\7g\2\2\u008c\u008d\7E\2\2"+
		"\u008d\u008e\7q\2\2\u008e\u008f\7n\2\2\u008f\u0090\7q\2\2\u0090\u0091"+
		"\7t\2\2\u0091\26\3\2\2\2\u0092\u0093\7f\2\2\u0093\u0094\7h\2\2\u0094\u0095"+
		"\7u\2\2\u0095\u0096\7X\2\2\u0096\u0097\7k\2\2\u0097\u0098\7u\2\2\u0098"+
		"\u0099\7k\2\2\u0099\u009a\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c\7f\2\2"+
		"\u009c\u009d\7P\2\2\u009d\u009e\7q\2\2\u009e\u009f\7f\2\2\u009f\u00a0"+
		"\7g\2\2\u00a0\u00a1\7U\2\2\u00a1\u00a2\7j\2\2\u00a2\u00a3\7c\2\2\u00a3"+
		"\u00a4\7r\2\2\u00a4\u00a5\7g\2\2\u00a5\30\3\2\2\2\u00a6\u00a7\7f\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8\u00a9\7u\2\2\u00a9\u00aa\7F\2\2\u00aa\u00ab\7r\2\2"+
		"\u00ab\u00ac\7k\2\2\u00ac\32\3\2\2\2\u00ad\u00ae\7f\2\2\u00ae\u00af\7"+
		"h\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7Q\2\2\u00b1\u00b2\7w\2\2\u00b2\u00b3"+
		"\7v\2\2\u00b3\u00b4\7K\2\2\u00b4\u00b5\7o\2\2\u00b5\u00b6\7c\2\2\u00b6"+
		"\u00b7\7i\2\2\u00b7\u00b8\7g\2\2\u00b8\u00b9\7F\2\2\u00b9\u00ba\7k\2\2"+
		"\u00ba\u00bb\7t\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7f\2\2\u00bd\u00be\7"+
		"h\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7R\2\2\u00c0\u00c1\7r\2\2\u00c1\u00c2"+
		"\7v\2\2\u00c2\u00c3\7P\2\2\u00c3\u00c4\7c\2\2\u00c4\u00c5\7o\2\2\u00c5"+
		"\u00c6\7g\2\2\u00c6\36\3\2\2\2\u00c7\u00c8\7\60\2\2\u00c8 \3\2\2\2\u00c9"+
		"\u00ca\7d\2\2\u00ca\u00cb\7h\2\2\u00cb\u00cc\7u\2\2\u00cc\u00cd\7S\2\2"+
		"\u00cd\u00ce\7w\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1"+
		"\7g\2\2\u00d1\u00d2\7f\2\2\u00d2\u00d3\7P\2\2\u00d3\u00d4\7q\2\2\u00d4"+
		"\u00d5\7f\2\2\u00d5\u00d6\7g\2\2\u00d6\u00d7\7E\2\2\u00d7\u00d8\7q\2\2"+
		"\u00d8\u00d9\7n\2\2\u00d9\u00da\7q\2\2\u00da\u00db\7t\2\2\u00db\"\3\2"+
		"\2\2\u00dc\u00dd\7d\2\2\u00dd\u00de\7h\2\2\u00de\u00df\7u\2\2\u00df\u00e0"+
		"\7X\2\2\u00e0\u00e1\7k\2\2\u00e1\u00e2\7u\2\2\u00e2\u00e3\7k\2\2\u00e3"+
		"\u00e4\7v\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7f\2\2\u00e6\u00e7\7P\2\2"+
		"\u00e7\u00e8\7q\2\2\u00e8\u00e9\7f\2\2\u00e9\u00ea\7g\2\2\u00ea\u00eb"+
		"\7E\2\2\u00eb\u00ec\7q\2\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7q\2\2\u00ee"+
		"\u00ef\7t\2\2\u00ef$\3\2\2\2\u00f0\u00f1\7d\2\2\u00f1\u00f2\7h\2\2\u00f2"+
		"\u00f3\7u\2\2\u00f3\u00f4\7E\2\2\u00f4\u00f5\7w\2\2\u00f5\u00f6\7t\2\2"+
		"\u00f6\u00f7\7t\2\2\u00f7\u00f8\7g\2\2\u00f8\u00f9\7p\2\2\u00f9\u00fa"+
		"\7v\2\2\u00fa\u00fb\7P\2\2\u00fb\u00fc\7q\2\2\u00fc\u00fd\7f\2\2\u00fd"+
		"\u00fe\7g\2\2\u00fe\u00ff\7E\2\2\u00ff\u0100\7q\2\2\u0100\u0101\7n\2\2"+
		"\u0101\u0102\7q\2\2\u0102\u0103\7t\2\2\u0103&\3\2\2\2\u0104\u0105\7d\2"+
		"\2\u0105\u0106\7h\2\2\u0106\u0107\7u\2\2\u0107\u0108\7E\2\2\u0108\u0109"+
		"\7w\2\2\u0109\u010a\7t\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2\u010c"+
		"\u010d\7p\2\2\u010d\u010e\7v\2\2\u010e\u010f\7P\2\2\u010f\u0110\7q\2\2"+
		"\u0110\u0111\7f\2\2\u0111\u0112\7g\2\2\u0112\u0113\7U\2\2\u0113\u0114"+
		"\7j\2\2\u0114\u0115\7c\2\2\u0115\u0116\7r\2\2\u0116\u0117\7g\2\2\u0117"+
		"(\3\2\2\2\u0118\u0119\7d\2\2\u0119\u011a\7h\2\2\u011a\u011b\7u\2\2\u011b"+
		"\u011c\7S\2\2\u011c\u011d\7w\2\2\u011d\u011e\7g\2\2\u011e\u011f\7w\2\2"+
		"\u011f\u0120\7g\2\2\u0120\u0121\7f\2\2\u0121\u0122\7P\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7f\2\2\u0124\u0125\7g\2\2\u0125\u0126\7U\2\2\u0126"+
		"\u0127\7j\2\2\u0127\u0128\7c\2\2\u0128\u0129\7r\2\2\u0129\u012a\7g\2\2"+
		"\u012a*\3\2\2\2\u012b\u012c\7d\2\2\u012c\u012d\7h\2\2\u012d\u012e\7u\2"+
		"\2\u012e\u012f\7X\2\2\u012f\u0130\7k\2\2\u0130\u0131\7u\2\2\u0131\u0132"+
		"\7k\2\2\u0132\u0133\7v\2\2\u0133\u0134\7g\2\2\u0134\u0135\7f\2\2\u0135"+
		"\u0136\7P\2\2\u0136\u0137\7q\2\2\u0137\u0138\7f\2\2\u0138\u0139\7g\2\2"+
		"\u0139\u013a\7U\2\2\u013a\u013b\7j\2\2\u013b\u013c\7c\2\2\u013c\u013d"+
		"\7r\2\2\u013d\u013e\7g\2\2\u013e,\3\2\2\2\u013f\u0140\7d\2\2\u0140\u0141"+
		"\7h\2\2\u0141\u0142\7u\2\2\u0142\u0143\7F\2\2\u0143\u0144\7r\2\2\u0144"+
		"\u0145\7k\2\2\u0145.\3\2\2\2\u0146\u0147\7d\2\2\u0147\u0148\7h\2\2\u0148"+
		"\u0149\7u\2\2\u0149\u014a\7Q\2\2\u014a\u014b\7w\2\2\u014b\u014c\7v\2\2"+
		"\u014c\u014d\7K\2\2\u014d\u014e\7o\2\2\u014e\u014f\7c\2\2\u014f\u0150"+
		"\7i\2\2\u0150\u0151\7g\2\2\u0151\u0152\7F\2\2\u0152\u0153\7k\2\2\u0153"+
		"\u0154\7t\2\2\u0154\60\3\2\2\2\u0155\u0156\7d\2\2\u0156\u0157\7h\2\2\u0157"+
		"\u0158\7u\2\2\u0158\u0159\7R\2\2\u0159\u015a\7r\2\2\u015a\u015b\7v\2\2"+
		"\u015b\u015c\7P\2\2\u015c\u015d\7c\2\2\u015d\u015e\7o\2\2\u015e\u015f"+
		"\7g\2\2\u015f\62\3\2\2\2\u0160\u0161\59\35\2\u0161\u0162\7\61\2\2\u0162"+
		"\u0164\3\2\2\2\u0163\u0160\3\2\2\2\u0164\u0165\3\2\2\2\u0165\u0163\3\2"+
		"\2\2\u0165\u0166\3\2\2\2\u0166\64\3\2\2\2\u0167\u0168\7h\2\2\u0168\u0169"+
		"\7t\2\2\u0169\u016a\7q\2\2\u016a\u016b\7o\2\2\u016b\66\3\2\2\2\u016c\u016d"+
		"\7v\2\2\u016d\u016e\7q\2\2\u016e8\3\2\2\2\u016f\u0171\5;\36\2\u0170\u016f"+
		"\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		":\3\2\2\2\u0174\u0175\t\2\2\2\u0175<\3\2\2\2\u0176\u0178\t\3\2\2\u0177"+
		"\u0176\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u0177\3\2\2\2\u0179\u017a\3\2"+
		"\2\2\u017a>\3\2\2\2\u017b\u017d\t\4\2\2\u017c\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180\3\2\2\2\u0180"+
		"\u0181\b \2\2\u0181@\3\2\2\2\7\2\u0165\u0172\u0179\u017e\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}