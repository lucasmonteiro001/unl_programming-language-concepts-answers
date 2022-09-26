// Generated from chuteAndLadders.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chuteAndLaddersLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGINNING_OF_SECTION=2, END_OF_SECTION=3, BOARD=4, LADDERS=5, 
		CHUTES=6, POSITIONS=7, VALUE_ASSIGNMENT=8, NUMBER=9, ROW_SEPARATOR=10, 
		BEGINNING_OF_BOARD=11, END_OF_BOARD=12, BEGINNING_OF_LIST=13, END_OF_LIST=14, 
		OTHER=15, WS=16;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'"
	};
	public static final String[] ruleNames = {
		"T__0", "BEGINNING_OF_SECTION", "END_OF_SECTION", "BOARD", "LADDERS", 
		"CHUTES", "POSITIONS", "VALUE_ASSIGNMENT", "NUMBER", "ROW_SEPARATOR", 
		"BEGINNING_OF_BOARD", "END_OF_BOARD", "BEGINNING_OF_LIST", "END_OF_LIST", 
		"OTHER", "WS"
	};


	public chuteAndLaddersLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "chuteAndLadders.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 1: BEGINNING_OF_SECTION_action((RuleContext)_localctx, actionIndex); break;
		case 2: END_OF_SECTION_action((RuleContext)_localctx, actionIndex); break;
		case 3: BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 4: LADDERS_action((RuleContext)_localctx, actionIndex); break;
		case 5: CHUTES_action((RuleContext)_localctx, actionIndex); break;
		case 6: POSITIONS_action((RuleContext)_localctx, actionIndex); break;
		case 7: VALUE_ASSIGNMENT_action((RuleContext)_localctx, actionIndex); break;
		case 8: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		case 9: ROW_SEPARATOR_action((RuleContext)_localctx, actionIndex); break;
		case 10: BEGINNING_OF_BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 11: END_OF_BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 12: BEGINNING_OF_LIST_action((RuleContext)_localctx, actionIndex); break;
		case 13: END_OF_LIST_action((RuleContext)_localctx, actionIndex); break;
		case 14: OTHER_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void BOARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: System.out.println("Name of Section: GameBoard"); break;
		}
	}
	private void CHUTES_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 4: System.out.println("Name of Section: Chutes"); break;
		}
	}
	private void NUMBER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 7: System.out.println("Chute/Ladder/Space: " + this.getText()); break;
		}
	}
	private void ROW_SEPARATOR_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 8: System.out.println("End of Row: ^"); break;
		}
	}
	private void BEGINNING_OF_LIST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 11: System.out.println("Start of List: {"); break;
		}
	}
	private void END_OF_BOARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 10: System.out.println("End of Board: ]"); break;
		}
	}
	private void END_OF_SECTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: System.out.println("End of Section: =>"); break;
		}
	}
	private void BEGINNING_OF_SECTION_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: System.out.println("Start of Section: <="); break;
		}
	}
	private void OTHER_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println( this.getText() + " in Line " + this.getLine() + " is Not a Recognized Token"); System.exit(0); break;
		}
	}
	private void POSITIONS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 5: System.out.println("Name of Section: Positions"); break;
		}
	}
	private void LADDERS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 3: System.out.println("Name of Section: Ladders"); break;
		}
	}
	private void BEGINNING_OF_BOARD_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 9: System.out.println("Start of Board: ["); break;
		}
	}
	private void END_OF_LIST_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 12: System.out.println("End of List: }"); break;
		}
	}
	private void VALUE_ASSIGNMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 6: System.out.println("Assignment of Value: <-"); break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\22\u0083\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\n\6\na\n\n\r\n\16\nb\3\n\3\n\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\6\20w\n\20"+
		"\r\20\16\20x\3\20\3\20\3\21\6\21~\n\21\r\21\16\21\177\3\21\3\21\3x\2\22"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22\3\2\4\3\2\62;\5\2\13\f\17\17\"\"\u0085\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\3#\3\2\2\2\5%\3\2\2\2\7*\3\2"+
		"\2\2\t/\3\2\2\2\13;\3\2\2\2\rE\3\2\2\2\17N\3\2\2\2\21Z\3\2\2\2\23`\3\2"+
		"\2\2\25f\3\2\2\2\27i\3\2\2\2\31l\3\2\2\2\33o\3\2\2\2\35r\3\2\2\2\37v\3"+
		"\2\2\2!}\3\2\2\2#$\7.\2\2$\4\3\2\2\2%&\7>\2\2&\'\7?\2\2\'(\3\2\2\2()\b"+
		"\3\2\2)\6\3\2\2\2*+\7?\2\2+,\7@\2\2,-\3\2\2\2-.\b\4\3\2.\b\3\2\2\2/\60"+
		"\7I\2\2\60\61\7c\2\2\61\62\7o\2\2\62\63\7g\2\2\63\64\7D\2\2\64\65\7q\2"+
		"\2\65\66\7c\2\2\66\67\7t\2\2\678\7f\2\289\3\2\2\29:\b\5\4\2:\n\3\2\2\2"+
		";<\7N\2\2<=\7c\2\2=>\7f\2\2>?\7f\2\2?@\7g\2\2@A\7t\2\2AB\7u\2\2BC\3\2"+
		"\2\2CD\b\6\5\2D\f\3\2\2\2EF\7E\2\2FG\7j\2\2GH\7w\2\2HI\7v\2\2IJ\7g\2\2"+
		"JK\7u\2\2KL\3\2\2\2LM\b\7\6\2M\16\3\2\2\2NO\7R\2\2OP\7q\2\2PQ\7u\2\2Q"+
		"R\7k\2\2RS\7v\2\2ST\7k\2\2TU\7q\2\2UV\7p\2\2VW\7u\2\2WX\3\2\2\2XY\b\b"+
		"\7\2Y\20\3\2\2\2Z[\7>\2\2[\\\7/\2\2\\]\3\2\2\2]^\b\t\b\2^\22\3\2\2\2_"+
		"a\t\2\2\2`_\3\2\2\2ab\3\2\2\2b`\3\2\2\2bc\3\2\2\2cd\3\2\2\2de\b\n\t\2"+
		"e\24\3\2\2\2fg\7`\2\2gh\b\13\n\2h\26\3\2\2\2ij\7]\2\2jk\b\f\13\2k\30\3"+
		"\2\2\2lm\7_\2\2mn\b\r\f\2n\32\3\2\2\2op\7}\2\2pq\b\16\r\2q\34\3\2\2\2"+
		"rs\7\177\2\2st\b\17\16\2t\36\3\2\2\2uw\13\2\2\2vu\3\2\2\2wx\3\2\2\2xy"+
		"\3\2\2\2xv\3\2\2\2yz\3\2\2\2z{\b\20\17\2{ \3\2\2\2|~\t\3\2\2}|\3\2\2\2"+
		"~\177\3\2\2\2\177}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081"+
		"\u0082\b\21\20\2\u0082\"\3\2\2\2\6\2bx\177\21\3\3\2\3\4\3\3\5\4\3\6\5"+
		"\3\7\6\3\b\7\3\t\b\3\n\t\3\13\n\3\f\13\3\r\f\3\16\r\3\17\16\3\20\17\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}