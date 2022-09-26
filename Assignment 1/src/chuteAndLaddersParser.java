// Generated from chuteAndLadders.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class chuteAndLaddersParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGINNING_OF_SECTION=2, END_OF_SECTION=3, BOARD=4, LADDERS=5, 
		CHUTES=6, POSITIONS=7, VALUE_ASSIGNMENT=8, NUMBER=9, ROW_SEPARATOR=10, 
		BEGINNING_OF_BOARD=11, END_OF_BOARD=12, BEGINNING_OF_LIST=13, END_OF_LIST=14, 
		OTHER=15, WS=16;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'<='", "'=>'", "'GameBoard'", "'Ladders'", "'Chutes'", 
		"'Positions'", "'<-'", "NUMBER", "'^'", "'['", "']'", "'{'", "'}'", "OTHER", 
		"WS"
	};
	public static final int
		RULE_init = 0, RULE_row_of_numbers = 1, RULE_tail_of_numbers = 2, RULE_gameBoard_line = 3, 
		RULE_tail = 4;
	public static final String[] ruleNames = {
		"init", "row_of_numbers", "tail_of_numbers", "gameBoard_line", "tail"
	};

	@Override
	public String getGrammarFileName() { return "chuteAndLadders.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public chuteAndLaddersParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InitContext extends ParserRuleContext {
		public TerminalNode BEGINNING_OF_LIST(int i) {
			return getToken(chuteAndLaddersParser.BEGINNING_OF_LIST, i);
		}
		public TerminalNode VALUE_ASSIGNMENT(int i) {
			return getToken(chuteAndLaddersParser.VALUE_ASSIGNMENT, i);
		}
		public List<TerminalNode> END_OF_SECTION() { return getTokens(chuteAndLaddersParser.END_OF_SECTION); }
		public TerminalNode BEGINNING_OF_BOARD() { return getToken(chuteAndLaddersParser.BEGINNING_OF_BOARD, 0); }
		public TerminalNode END_OF_BOARD() { return getToken(chuteAndLaddersParser.END_OF_BOARD, 0); }
		public List<TerminalNode> END_OF_LIST() { return getTokens(chuteAndLaddersParser.END_OF_LIST); }
		public TerminalNode BOARD() { return getToken(chuteAndLaddersParser.BOARD, 0); }
		public TerminalNode END_OF_LIST(int i) {
			return getToken(chuteAndLaddersParser.END_OF_LIST, i);
		}
		public TerminalNode BEGINNING_OF_SECTION(int i) {
			return getToken(chuteAndLaddersParser.BEGINNING_OF_SECTION, i);
		}
		public List<Row_of_numbersContext> row_of_numbers() {
			return getRuleContexts(Row_of_numbersContext.class);
		}
		public TerminalNode CHUTES() { return getToken(chuteAndLaddersParser.CHUTES, 0); }
		public TerminalNode LADDERS() { return getToken(chuteAndLaddersParser.LADDERS, 0); }
		public List<TerminalNode> VALUE_ASSIGNMENT() { return getTokens(chuteAndLaddersParser.VALUE_ASSIGNMENT); }
		public TerminalNode END_OF_SECTION(int i) {
			return getToken(chuteAndLaddersParser.END_OF_SECTION, i);
		}
		public List<TerminalNode> BEGINNING_OF_SECTION() { return getTokens(chuteAndLaddersParser.BEGINNING_OF_SECTION); }
		public TerminalNode POSITIONS() { return getToken(chuteAndLaddersParser.POSITIONS, 0); }
		public List<TerminalNode> BEGINNING_OF_LIST() { return getTokens(chuteAndLaddersParser.BEGINNING_OF_LIST); }
		public GameBoard_lineContext gameBoard_line() {
			return getRuleContext(GameBoard_lineContext.class,0);
		}
		public Row_of_numbersContext row_of_numbers(int i) {
			return getRuleContext(Row_of_numbersContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		try {
			setState(68);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(10); match(BEGINNING_OF_SECTION);
				setState(11); match(POSITIONS);
				setState(12); match(VALUE_ASSIGNMENT);
				setState(13); match(BEGINNING_OF_LIST);
				setState(14); row_of_numbers();
				setState(15); match(END_OF_LIST);
				setState(16); match(END_OF_SECTION);
				setState(17); match(BEGINNING_OF_SECTION);
				setState(18); match(CHUTES);
				setState(19); match(VALUE_ASSIGNMENT);
				setState(20); match(BEGINNING_OF_LIST);
				setState(21); row_of_numbers();
				setState(22); match(END_OF_LIST);
				setState(23); match(END_OF_SECTION);
				setState(24); match(BEGINNING_OF_SECTION);
				setState(25); match(LADDERS);
				setState(26); match(VALUE_ASSIGNMENT);
				setState(27); match(BEGINNING_OF_LIST);
				setState(28); row_of_numbers();
				setState(29); match(END_OF_LIST);
				setState(30); match(END_OF_SECTION);
				setState(31); match(BEGINNING_OF_SECTION);
				setState(32); match(BOARD);
				setState(33); match(VALUE_ASSIGNMENT);
				setState(34); match(BEGINNING_OF_BOARD);
				setState(35); gameBoard_line();
				setState(36); match(END_OF_BOARD);
				setState(37); match(END_OF_SECTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(39); match(BEGINNING_OF_SECTION);
				setState(40); match(POSITIONS);
				setState(41); match(VALUE_ASSIGNMENT);
				setState(42); match(BEGINNING_OF_LIST);
				setState(43); row_of_numbers();
				setState(44); match(END_OF_LIST);
				setState(45); match(END_OF_SECTION);
				setState(46); match(BEGINNING_OF_SECTION);
				setState(47); match(LADDERS);
				setState(48); match(VALUE_ASSIGNMENT);
				setState(49); match(BEGINNING_OF_LIST);
				setState(50); row_of_numbers();
				setState(51); match(END_OF_LIST);
				setState(52); match(END_OF_SECTION);
				setState(53); match(BEGINNING_OF_SECTION);
				setState(54); match(CHUTES);
				setState(55); match(VALUE_ASSIGNMENT);
				setState(56); match(BEGINNING_OF_LIST);
				setState(57); row_of_numbers();
				setState(58); match(END_OF_LIST);
				setState(59); match(END_OF_SECTION);
				setState(60); match(BEGINNING_OF_SECTION);
				setState(61); match(BOARD);
				setState(62); match(VALUE_ASSIGNMENT);
				setState(63); match(BEGINNING_OF_BOARD);
				setState(64); gameBoard_line();
				setState(65); match(END_OF_BOARD);
				setState(66); match(END_OF_SECTION);
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

	public static class Row_of_numbersContext extends ParserRuleContext {
		public Tail_of_numbersContext tail_of_numbers() {
			return getRuleContext(Tail_of_numbersContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(chuteAndLaddersParser.NUMBER, 0); }
		public Row_of_numbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_of_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).enterRow_of_numbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).exitRow_of_numbers(this);
		}
	}

	public final Row_of_numbersContext row_of_numbers() throws RecognitionException {
		Row_of_numbersContext _localctx = new Row_of_numbersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_row_of_numbers);
		try {
			setState(73);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(70); match(NUMBER);
				setState(71); tail_of_numbers();
				}
				break;
			case END_OF_LIST:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class Tail_of_numbersContext extends ParserRuleContext {
		public Tail_of_numbersContext tail_of_numbers() {
			return getRuleContext(Tail_of_numbersContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(chuteAndLaddersParser.NUMBER, 0); }
		public Tail_of_numbersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail_of_numbers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).enterTail_of_numbers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).exitTail_of_numbers(this);
		}
	}

	public final Tail_of_numbersContext tail_of_numbers() throws RecognitionException {
		Tail_of_numbersContext _localctx = new Tail_of_numbersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tail_of_numbers);
		try {
			setState(79);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(75); match(T__0);
				setState(76); match(NUMBER);
				setState(77); tail_of_numbers();
				}
				break;
			case END_OF_LIST:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class GameBoard_lineContext extends ParserRuleContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(chuteAndLaddersParser.NUMBER, 0); }
		public GameBoard_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameBoard_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).enterGameBoard_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).exitGameBoard_line(this);
		}
	}

	public final GameBoard_lineContext gameBoard_line() throws RecognitionException {
		GameBoard_lineContext _localctx = new GameBoard_lineContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_gameBoard_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); match(NUMBER);
			setState(82); tail();
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

	public static class TailContext extends ParserRuleContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TerminalNode ROW_SEPARATOR() { return getToken(chuteAndLaddersParser.ROW_SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(chuteAndLaddersParser.NUMBER, 0); }
		public GameBoard_lineContext gameBoard_line() {
			return getRuleContext(GameBoard_lineContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof chuteAndLaddersListener ) ((chuteAndLaddersListener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tail);
		try {
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(84); match(T__0);
				setState(85); match(NUMBER);
				setState(86); tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(87); match(T__0);
				setState(88); match(NUMBER);
				setState(89); match(ROW_SEPARATOR);
				setState(90); gameBoard_line();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(91); match(T__0);
				setState(92); match(NUMBER);
				System.out.println("End of File");
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\22c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2G\n\2\3\3\3\3\3\3"+
		"\5\3L\n\3\3\4\3\4\3\4\3\4\5\4R\n\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\5\6a\n\6\3\6\2\2\7\2\4\6\b\n\2\2b\2F\3\2\2\2\4K\3\2\2"+
		"\2\6Q\3\2\2\2\bS\3\2\2\2\n`\3\2\2\2\f\r\7\4\2\2\r\16\7\t\2\2\16\17\7\n"+
		"\2\2\17\20\7\17\2\2\20\21\5\4\3\2\21\22\7\20\2\2\22\23\7\5\2\2\23\24\7"+
		"\4\2\2\24\25\7\b\2\2\25\26\7\n\2\2\26\27\7\17\2\2\27\30\5\4\3\2\30\31"+
		"\7\20\2\2\31\32\7\5\2\2\32\33\7\4\2\2\33\34\7\7\2\2\34\35\7\n\2\2\35\36"+
		"\7\17\2\2\36\37\5\4\3\2\37 \7\20\2\2 !\7\5\2\2!\"\7\4\2\2\"#\7\6\2\2#"+
		"$\7\n\2\2$%\7\r\2\2%&\5\b\5\2&\'\7\16\2\2\'(\7\5\2\2(G\3\2\2\2)*\7\4\2"+
		"\2*+\7\t\2\2+,\7\n\2\2,-\7\17\2\2-.\5\4\3\2./\7\20\2\2/\60\7\5\2\2\60"+
		"\61\7\4\2\2\61\62\7\7\2\2\62\63\7\n\2\2\63\64\7\17\2\2\64\65\5\4\3\2\65"+
		"\66\7\20\2\2\66\67\7\5\2\2\678\7\4\2\289\7\b\2\29:\7\n\2\2:;\7\17\2\2"+
		";<\5\4\3\2<=\7\20\2\2=>\7\5\2\2>?\7\4\2\2?@\7\6\2\2@A\7\n\2\2AB\7\r\2"+
		"\2BC\5\b\5\2CD\7\16\2\2DE\7\5\2\2EG\3\2\2\2F\f\3\2\2\2F)\3\2\2\2G\3\3"+
		"\2\2\2HI\7\13\2\2IL\5\6\4\2JL\3\2\2\2KH\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2M"+
		"N\7\3\2\2NO\7\13\2\2OR\5\6\4\2PR\3\2\2\2QM\3\2\2\2QP\3\2\2\2R\7\3\2\2"+
		"\2ST\7\13\2\2TU\5\n\6\2U\t\3\2\2\2VW\7\3\2\2WX\7\13\2\2Xa\5\n\6\2YZ\7"+
		"\3\2\2Z[\7\13\2\2[\\\7\f\2\2\\a\5\b\5\2]^\7\3\2\2^_\7\13\2\2_a\b\6\1\2"+
		"`V\3\2\2\2`Y\3\2\2\2`]\3\2\2\2a\13\3\2\2\2\6FKQ`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}