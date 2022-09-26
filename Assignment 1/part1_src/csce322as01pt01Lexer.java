// Generated from csce322as01pt01.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322as01pt01Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINNING_OF_SECTION=1, END_OF_SECTION=2, BOARD=3, LADDERS=4, CHUTES=5, 
		POSITIONS=6, VALUE_ASSIGNMENT=7, NUMBER=8, ROW_SEPARATOR=9, BEGINNING_OF_BOARD=10, 
		END_OF_BOARD=11, BEGINNING_OF_LIST=12, END_OF_LIST=13, INVALID=14, Whitespace=15;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'"
	};
	public static final String[] ruleNames = {
		"BEGINNING_OF_SECTION", "END_OF_SECTION", "BOARD", "LADDERS", "CHUTES", 
		"POSITIONS", "VALUE_ASSIGNMENT", "NUMBER", "ROW_SEPARATOR", "BEGINNING_OF_BOARD", 
		"END_OF_BOARD", "BEGINNING_OF_LIST", "END_OF_LIST", "INVALID", "Whitespace"
	};


	public csce322as01pt01Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "csce322as01pt01.g4"; }

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
		case 0: BEGINNING_OF_SECTION_action((RuleContext)_localctx, actionIndex); break;
		case 1: END_OF_SECTION_action((RuleContext)_localctx, actionIndex); break;
		case 2: BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 3: LADDERS_action((RuleContext)_localctx, actionIndex); break;
		case 4: CHUTES_action((RuleContext)_localctx, actionIndex); break;
		case 5: POSITIONS_action((RuleContext)_localctx, actionIndex); break;
		case 6: VALUE_ASSIGNMENT_action((RuleContext)_localctx, actionIndex); break;
		case 7: NUMBER_action((RuleContext)_localctx, actionIndex); break;
		case 8: ROW_SEPARATOR_action((RuleContext)_localctx, actionIndex); break;
		case 9: BEGINNING_OF_BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 10: END_OF_BOARD_action((RuleContext)_localctx, actionIndex); break;
		case 11: BEGINNING_OF_LIST_action((RuleContext)_localctx, actionIndex); break;
		case 12: END_OF_LIST_action((RuleContext)_localctx, actionIndex); break;
		case 13: INVALID_action((RuleContext)_localctx, actionIndex); break;
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
	private void INVALID_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 13: System.out.println(this.getText() + " in Line " + this.getLine() + " is Not a Recognized Token"); System.exit(0); break;
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\21\u0081\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\3\2\3\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\6\t]\n\t\r\t\16\t^\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\6\17t\n\17\r\17\16\17u\3\17"+
		"\5\17y\n\17\3\20\6\20|\n\20\r\20\16\20}\3\20\3\20\3u\2\21\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21\3\2\4"+
		"\3\2\62;\6\2\13\f\17\17\"\"..\u0084\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\3!\3\2\2\2\5&\3\2\2\2\7+\3\2\2\2\t\67\3\2\2\2\13A\3"+
		"\2\2\2\rJ\3\2\2\2\17V\3\2\2\2\21\\\3\2\2\2\23b\3\2\2\2\25e\3\2\2\2\27"+
		"h\3\2\2\2\31k\3\2\2\2\33n\3\2\2\2\35x\3\2\2\2\37{\3\2\2\2!\"\7>\2\2\""+
		"#\7?\2\2#$\3\2\2\2$%\b\2\2\2%\4\3\2\2\2&\'\7?\2\2\'(\7@\2\2()\3\2\2\2"+
		")*\b\3\3\2*\6\3\2\2\2+,\7I\2\2,-\7c\2\2-.\7o\2\2./\7g\2\2/\60\7D\2\2\60"+
		"\61\7q\2\2\61\62\7c\2\2\62\63\7t\2\2\63\64\7f\2\2\64\65\3\2\2\2\65\66"+
		"\b\4\4\2\66\b\3\2\2\2\678\7N\2\289\7c\2\29:\7f\2\2:;\7f\2\2;<\7g\2\2<"+
		"=\7t\2\2=>\7u\2\2>?\3\2\2\2?@\b\5\5\2@\n\3\2\2\2AB\7E\2\2BC\7j\2\2CD\7"+
		"w\2\2DE\7v\2\2EF\7g\2\2FG\7u\2\2GH\3\2\2\2HI\b\6\6\2I\f\3\2\2\2JK\7R\2"+
		"\2KL\7q\2\2LM\7u\2\2MN\7k\2\2NO\7v\2\2OP\7k\2\2PQ\7q\2\2QR\7p\2\2RS\7"+
		"u\2\2ST\3\2\2\2TU\b\7\7\2U\16\3\2\2\2VW\7>\2\2WX\7/\2\2XY\3\2\2\2YZ\b"+
		"\b\b\2Z\20\3\2\2\2[]\t\2\2\2\\[\3\2\2\2]^\3\2\2\2^\\\3\2\2\2^_\3\2\2\2"+
		"_`\3\2\2\2`a\b\t\t\2a\22\3\2\2\2bc\7`\2\2cd\b\n\n\2d\24\3\2\2\2ef\7]\2"+
		"\2fg\b\13\13\2g\26\3\2\2\2hi\7_\2\2ij\b\f\f\2j\30\3\2\2\2kl\7}\2\2lm\b"+
		"\r\r\2m\32\3\2\2\2no\7\177\2\2op\b\16\16\2p\34\3\2\2\2qy\5\37\20\2rt\13"+
		"\2\2\2sr\3\2\2\2tu\3\2\2\2uv\3\2\2\2us\3\2\2\2vw\3\2\2\2wy\b\17\17\2x"+
		"q\3\2\2\2xs\3\2\2\2y\36\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\20\20\2\u0080 \3\2\2\2\7\2^ux}\21"+
		"\3\2\2\3\3\3\3\4\4\3\5\5\3\6\6\3\7\7\3\b\b\3\t\t\3\n\n\3\13\13\3\f\f\3"+
		"\r\r\3\16\16\3\17\17\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}