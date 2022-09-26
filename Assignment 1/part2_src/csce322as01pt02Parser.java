// Generated from csce322as01pt02.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322as01pt02Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, BEGINNING_OF_SECTION=2, END_OF_SECTION=3, BOARD=4, LADDERS=5, 
		CHUTES=6, POSITIONS=7, VALUE_ASSIGNMENT=8, NUMBER=9, ROW_SEPARATOR=10, 
		BEGINNING_OF_BOARD=11, END_OF_BOARD=12, BEGINNING_OF_LIST=13, END_OF_LIST=14, 
		WS=15;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'<='", "'=>'", "'GameBoard'", "'Ladders'", "'Chutes'", 
		"'Positions'", "'<-'", "NUMBER", "'^'", "'['", "']'", "'{'", "'}'", "WS"
	};
	public static final int
		RULE_chutesNladders = 0, RULE_chutesORladders = 1, RULE_number_of_players = 2, 
		RULE_pos_tail = 3, RULE_number_of_chutes = 4, RULE_chutes_tail = 5, RULE_number_of_ladders = 6, 
		RULE_ladders_tail = 7, RULE_gameBoard_line = 8, RULE_tail = 9, RULE_start_section = 10, 
		RULE_end_section = 11, RULE_board = 12, RULE_ladders = 13, RULE_chutes = 14, 
		RULE_positions = 15, RULE_value_assignment = 16, RULE_number = 17, RULE_row_separator = 18, 
		RULE_beginning_board = 19, RULE_end_board = 20, RULE_beginning_list = 21, 
		RULE_end_list = 22, RULE_valid_token = 23;
	public static final String[] ruleNames = {
		"chutesNladders", "chutesORladders", "number_of_players", "pos_tail", 
		"number_of_chutes", "chutes_tail", "number_of_ladders", "ladders_tail", 
		"gameBoard_line", "tail", "start_section", "end_section", "board", "ladders", 
		"chutes", "positions", "value_assignment", "number", "row_separator", 
		"beginning_board", "end_board", "beginning_list", "end_list", "valid_token"
	};

	@Override
	public String getGrammarFileName() { return "csce322as01pt02.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


		int players_counter;
		int chutes_counter;
		int ladders_counter;
		int rows_counter;
		int columns_counter;
		int isValidGame = 1;
		
		 // List that stores all the semantic errors found in the input file
		java.util.List<Integer> errorRules = new java.util.ArrayList<Integer>();
		
		/*
		 * Function that prints all semantic errors found in the input file
		 */
		private void printErrRules(java.util.List list) {
			
			java.util.Collections.sort(list);
			
			for(int i = 0; i < list.size(); i++)
				System.out.println("Semantic Error: Rule " + list.get(i) + " Violated");
		}
		
		/*
		 * Function that prints one invalid token and the line in which it was found
		 */
		private void printInvalidToken(String token, int line) {
			
			System.out.println(token + " in Line "+ line + " is an Invalid Token");
		}

	public csce322as01pt02Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChutesNladdersContext extends ParserRuleContext {
		public ChutesORladdersContext chutesORladders(int i) {
			return getRuleContext(ChutesORladdersContext.class,i);
		}
		public End_boardContext end_board() {
			return getRuleContext(End_boardContext.class,0);
		}
		public End_listContext end_list() {
			return getRuleContext(End_listContext.class,0);
		}
		public List<End_sectionContext> end_section() {
			return getRuleContexts(End_sectionContext.class);
		}
		public Number_of_playersContext number_of_players() {
			return getRuleContext(Number_of_playersContext.class,0);
		}
		public Beginning_boardContext beginning_board() {
			return getRuleContext(Beginning_boardContext.class,0);
		}
		public Beginning_listContext beginning_list() {
			return getRuleContext(Beginning_listContext.class,0);
		}
		public BoardContext board() {
			return getRuleContext(BoardContext.class,0);
		}
		public List<Start_sectionContext> start_section() {
			return getRuleContexts(Start_sectionContext.class);
		}
		public List<Value_assignmentContext> value_assignment() {
			return getRuleContexts(Value_assignmentContext.class);
		}
		public TerminalNode EOF() { return getToken(csce322as01pt02Parser.EOF, 0); }
		public Start_sectionContext start_section(int i) {
			return getRuleContext(Start_sectionContext.class,i);
		}
		public List<ChutesORladdersContext> chutesORladders() {
			return getRuleContexts(ChutesORladdersContext.class);
		}
		public GameBoard_lineContext gameBoard_line() {
			return getRuleContext(GameBoard_lineContext.class,0);
		}
		public PositionsContext positions() {
			return getRuleContext(PositionsContext.class,0);
		}
		public End_sectionContext end_section(int i) {
			return getRuleContext(End_sectionContext.class,i);
		}
		public Value_assignmentContext value_assignment(int i) {
			return getRuleContext(Value_assignmentContext.class,i);
		}
		public ChutesNladdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chutesNladders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterChutesNladders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitChutesNladders(this);
		}
	}

	public final ChutesNladdersContext chutesNladders() throws RecognitionException {
		ChutesNladdersContext _localctx = new ChutesNladdersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chutesNladders);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48); start_section();
			setState(49); positions();
			setState(50); value_assignment();
			setState(51); beginning_list();
			setState(52); number_of_players();

			                    	if(!(players_counter >= 2 && players_counter <= 4)) {
			                    		errorRules.add(2);
			                    		isValidGame = 0;
			                    	}
			                    
			setState(54); end_list();
			setState(55); end_section();
			setState(56); start_section();
			setState(57); chutesORladders();
			setState(58); end_section();
			setState(59); start_section();
			setState(60); chutesORladders();
			setState(61); end_section();
			setState(62); start_section();
			setState(63); board();
			setState(64); value_assignment();
			setState(65); beginning_board();
			setState(66); gameBoard_line();

			                    	int columns = columns_counter/rows_counter;
			                    	
			                    	if(!(rows_counter > 4 && rows_counter < 20)) {
			                    		errorRules.add(5);
			                    		isValidGame = 0;
			                    	}
			                    	if(!(columns > 4 && columns < 20)) {
			                    		errorRules.add(6);
			                    		isValidGame = 0;
			                    	}
			                    
			setState(68); end_board();
			setState(69); end_section();
			setState(70); match(EOF);

			        		/*
			        		 * After checking the whole board and non-semantic error was found, 
			        		 * it's considered that the input is totally correct and the final line 
			        		 * is printed out. Otherwise, a semantic error may be printed out.
			        		 */
			        		if(isValidGame == 1)
			        			System.out.println("The board has " + chutes_counter + " chutes and " + ladders_counter + " ladders");
			        		else {
			        			if (!errorRules.isEmpty())
			        				printErrRules(errorRules);
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

	public static class ChutesORladdersContext extends ParserRuleContext {
		public TerminalNode CHUTES() { return getToken(csce322as01pt02Parser.CHUTES, 0); }
		public Value_assignmentContext value_assignment() {
			return getRuleContext(Value_assignmentContext.class,0);
		}
		public TerminalNode LADDERS() { return getToken(csce322as01pt02Parser.LADDERS, 0); }
		public End_listContext end_list() {
			return getRuleContext(End_listContext.class,0);
		}
		public Number_of_laddersContext number_of_ladders() {
			return getRuleContext(Number_of_laddersContext.class,0);
		}
		public Number_of_chutesContext number_of_chutes() {
			return getRuleContext(Number_of_chutesContext.class,0);
		}
		public Beginning_listContext beginning_list() {
			return getRuleContext(Beginning_listContext.class,0);
		}
		public ChutesORladdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chutesORladders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterChutesORladders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitChutesORladders(this);
		}
	}

	public final ChutesORladdersContext chutesORladders() throws RecognitionException {
		ChutesORladdersContext _localctx = new ChutesORladdersContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_chutesORladders);
		try {
			setState(87);
			switch (_input.LA(1)) {
			case CHUTES:
				enterOuterAlt(_localctx, 1);
				{
				setState(73); match(CHUTES);
				setState(74); value_assignment();
				setState(75); beginning_list();
				setState(76); number_of_chutes();

				                    	if(!(chutes_counter > 2 && chutes_counter < 11)) {
				                    		errorRules.add(3);
				                    		isValidGame = 0;
				                    	}
				                    
				setState(78); end_list();
				}
				break;
			case LADDERS:
				enterOuterAlt(_localctx, 2);
				{
				setState(80); match(LADDERS);
				setState(81); value_assignment();
				setState(82); beginning_list();
				setState(83); number_of_ladders();

				                    	if(!(ladders_counter > 2 && ladders_counter < 11)) {
				                    		errorRules.add(4);
				                    		isValidGame = 0;
				                    	}
				                    
				setState(85); end_list();
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

	public static class Number_of_playersContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Pos_tailContext pos_tail() {
			return getRuleContext(Pos_tailContext.class,0);
		}
		public Number_of_playersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_of_players; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterNumber_of_players(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitNumber_of_players(this);
		}
	}

	public final Number_of_playersContext number_of_players() throws RecognitionException {
		Number_of_playersContext _localctx = new Number_of_playersContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_number_of_players);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89); match(NUMBER);
			setState(90); pos_tail();
			players_counter++;
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

	public static class Pos_tailContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Pos_tailContext pos_tail() {
			return getRuleContext(Pos_tailContext.class,0);
		}
		public Pos_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pos_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterPos_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitPos_tail(this);
		}
	}

	public final Pos_tailContext pos_tail() throws RecognitionException {
		Pos_tailContext _localctx = new Pos_tailContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pos_tail);
		try {
			setState(104);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(93); match(T__0);
				setState(94); match(NUMBER);
				setState(95); pos_tail();
				players_counter++;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(98); match(T__0);
				setState(99); match(NUMBER);
				players_counter++;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(101); valid_token();
				System.exit(0);
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

	public static class Number_of_chutesContext extends ParserRuleContext {
		public Chutes_tailContext chutes_tail() {
			return getRuleContext(Chutes_tailContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Number_of_chutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_of_chutes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterNumber_of_chutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitNumber_of_chutes(this);
		}
	}

	public final Number_of_chutesContext number_of_chutes() throws RecognitionException {
		Number_of_chutesContext _localctx = new Number_of_chutesContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_number_of_chutes);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106); match(NUMBER);
			setState(107); chutes_tail();
			chutes_counter++;
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

	public static class Chutes_tailContext extends ParserRuleContext {
		public Chutes_tailContext chutes_tail() {
			return getRuleContext(Chutes_tailContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Chutes_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chutes_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterChutes_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitChutes_tail(this);
		}
	}

	public final Chutes_tailContext chutes_tail() throws RecognitionException {
		Chutes_tailContext _localctx = new Chutes_tailContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_chutes_tail);
		try {
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110); match(T__0);
				setState(111); match(NUMBER);
				setState(112); chutes_tail();
				chutes_counter++;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(115); match(T__0);
				setState(116); match(NUMBER);
				chutes_counter++;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class Number_of_laddersContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Ladders_tailContext ladders_tail() {
			return getRuleContext(Ladders_tailContext.class,0);
		}
		public Number_of_laddersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number_of_ladders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterNumber_of_ladders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitNumber_of_ladders(this);
		}
	}

	public final Number_of_laddersContext number_of_ladders() throws RecognitionException {
		Number_of_laddersContext _localctx = new Number_of_laddersContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_number_of_ladders);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121); match(NUMBER);
			setState(122); ladders_tail();
			ladders_counter++;
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

	public static class Ladders_tailContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Ladders_tailContext ladders_tail() {
			return getRuleContext(Ladders_tailContext.class,0);
		}
		public Ladders_tailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladders_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterLadders_tail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitLadders_tail(this);
		}
	}

	public final Ladders_tailContext ladders_tail() throws RecognitionException {
		Ladders_tailContext _localctx = new Ladders_tailContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_ladders_tail);
		try {
			setState(134);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125); match(T__0);
				setState(126); match(NUMBER);
				setState(127); ladders_tail();
				ladders_counter++;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(130); match(T__0);
				setState(131); match(NUMBER);
				ladders_counter++;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class GameBoard_lineContext extends ParserRuleContext {
		public TailContext tail() {
			return getRuleContext(TailContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public GameBoard_lineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gameBoard_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterGameBoard_line(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitGameBoard_line(this);
		}
	}

	public final GameBoard_lineContext gameBoard_line() throws RecognitionException {
		GameBoard_lineContext _localctx = new GameBoard_lineContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gameBoard_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136); match(NUMBER);
			columns_counter++;
			setState(138); tail();
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
		public TerminalNode ROW_SEPARATOR() { return getToken(csce322as01pt02Parser.ROW_SEPARATOR, 0); }
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public GameBoard_lineContext gameBoard_line() {
			return getRuleContext(GameBoard_lineContext.class,0);
		}
		public TailContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tail; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterTail(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitTail(this);
		}
	}

	public final TailContext tail() throws RecognitionException {
		TailContext _localctx = new TailContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tail);
		try {
			setState(153);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); match(T__0);
				setState(141); match(NUMBER);
				columns_counter++;
				setState(143); tail();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(144); match(T__0);
				setState(145); match(NUMBER);
				columns_counter++;
				setState(147); match(ROW_SEPARATOR);
				rows_counter++;
				setState(149); gameBoard_line();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(150); match(T__0);
				setState(151); match(NUMBER);
				columns_counter++; rows_counter++;
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

	public static class Start_sectionContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode BEGINNING_OF_SECTION() { return getToken(csce322as01pt02Parser.BEGINNING_OF_SECTION, 0); }
		public Start_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterStart_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitStart_section(this);
		}
	}

	public final Start_sectionContext start_section() throws RecognitionException {
		Start_sectionContext _localctx = new Start_sectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_start_section);
		try {
			setState(159);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(155); match(BEGINNING_OF_SECTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(156); valid_token();
				System.exit(0);
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

	public static class End_sectionContext extends ParserRuleContext {
		public TerminalNode END_OF_SECTION() { return getToken(csce322as01pt02Parser.END_OF_SECTION, 0); }
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public End_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterEnd_section(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitEnd_section(this);
		}
	}

	public final End_sectionContext end_section() throws RecognitionException {
		End_sectionContext _localctx = new End_sectionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_end_section);
		try {
			setState(165);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161); match(END_OF_SECTION);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162); valid_token();
				System.exit(0);
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

	public static class BoardContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode BOARD() { return getToken(csce322as01pt02Parser.BOARD, 0); }
		public BoardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterBoard(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitBoard(this);
		}
	}

	public final BoardContext board() throws RecognitionException {
		BoardContext _localctx = new BoardContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_board);
		try {
			setState(171);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167); match(BOARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(168); valid_token();
				System.exit(0);
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

	public static class LaddersContext extends ParserRuleContext {
		public TerminalNode LADDERS() { return getToken(csce322as01pt02Parser.LADDERS, 0); }
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public LaddersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ladders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterLadders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitLadders(this);
		}
	}

	public final LaddersContext ladders() throws RecognitionException {
		LaddersContext _localctx = new LaddersContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ladders);
		try {
			setState(177);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(173); match(LADDERS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(174); valid_token();
				System.exit(0);
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

	public static class ChutesContext extends ParserRuleContext {
		public TerminalNode CHUTES() { return getToken(csce322as01pt02Parser.CHUTES, 0); }
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public ChutesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chutes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterChutes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitChutes(this);
		}
	}

	public final ChutesContext chutes() throws RecognitionException {
		ChutesContext _localctx = new ChutesContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_chutes);
		try {
			setState(183);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179); match(CHUTES);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(180); valid_token();
				System.exit(0);
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

	public static class PositionsContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode POSITIONS() { return getToken(csce322as01pt02Parser.POSITIONS, 0); }
		public PositionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterPositions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitPositions(this);
		}
	}

	public final PositionsContext positions() throws RecognitionException {
		PositionsContext _localctx = new PositionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_positions);
		try {
			setState(189);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); match(POSITIONS);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); valid_token();
				System.exit(0);
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

	public static class Value_assignmentContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode VALUE_ASSIGNMENT() { return getToken(csce322as01pt02Parser.VALUE_ASSIGNMENT, 0); }
		public Value_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterValue_assignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitValue_assignment(this);
		}
	}

	public final Value_assignmentContext value_assignment() throws RecognitionException {
		Value_assignmentContext _localctx = new Value_assignmentContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_value_assignment);
		try {
			setState(195);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191); match(VALUE_ASSIGNMENT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192); valid_token();
				System.exit(0);
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

	public static class NumberContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitNumber(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_number);
		try {
			setState(201);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(197); match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(198); valid_token();
				System.exit(0);
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

	public static class Row_separatorContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode ROW_SEPARATOR() { return getToken(csce322as01pt02Parser.ROW_SEPARATOR, 0); }
		public Row_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_row_separator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterRow_separator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitRow_separator(this);
		}
	}

	public final Row_separatorContext row_separator() throws RecognitionException {
		Row_separatorContext _localctx = new Row_separatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_row_separator);
		try {
			setState(207);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(ROW_SEPARATOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); valid_token();
				System.exit(0);
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

	public static class Beginning_boardContext extends ParserRuleContext {
		public TerminalNode BEGINNING_OF_BOARD() { return getToken(csce322as01pt02Parser.BEGINNING_OF_BOARD, 0); }
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public Beginning_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginning_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterBeginning_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitBeginning_board(this);
		}
	}

	public final Beginning_boardContext beginning_board() throws RecognitionException {
		Beginning_boardContext _localctx = new Beginning_boardContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_beginning_board);
		try {
			setState(213);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(209); match(BEGINNING_OF_BOARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(210); valid_token();
				System.exit(0);
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

	public static class End_boardContext extends ParserRuleContext {
		public TerminalNode END_OF_BOARD() { return getToken(csce322as01pt02Parser.END_OF_BOARD, 0); }
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public End_boardContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_board; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterEnd_board(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitEnd_board(this);
		}
	}

	public final End_boardContext end_board() throws RecognitionException {
		End_boardContext _localctx = new End_boardContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_end_board);
		try {
			setState(219);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(215); match(END_OF_BOARD);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216); valid_token();
				System.exit(0);
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

	public static class Beginning_listContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode BEGINNING_OF_LIST() { return getToken(csce322as01pt02Parser.BEGINNING_OF_LIST, 0); }
		public Beginning_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_beginning_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterBeginning_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitBeginning_list(this);
		}
	}

	public final Beginning_listContext beginning_list() throws RecognitionException {
		Beginning_listContext _localctx = new Beginning_listContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_beginning_list);
		try {
			setState(225);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); match(BEGINNING_OF_LIST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(222); valid_token();
				System.exit(0);
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

	public static class End_listContext extends ParserRuleContext {
		public Valid_tokenContext valid_token() {
			return getRuleContext(Valid_tokenContext.class,0);
		}
		public TerminalNode END_OF_LIST() { return getToken(csce322as01pt02Parser.END_OF_LIST, 0); }
		public End_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_end_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterEnd_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitEnd_list(this);
		}
	}

	public final End_listContext end_list() throws RecognitionException {
		End_listContext _localctx = new End_listContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_end_list);
		try {
			setState(231);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(227); match(END_OF_LIST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(228); valid_token();
				System.exit(0);
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

	public static class Valid_tokenContext extends ParserRuleContext {
		public Token BEGINNING_OF_SECTION;
		public Token END_OF_SECTION;
		public Token BOARD;
		public Token LADDERS;
		public Token CHUTES;
		public Token POSITIONS;
		public Token VALUE_ASSIGNMENT;
		public Token NUMBER;
		public Token ROW_SEPARATOR;
		public Token BEGINNING_OF_BOARD;
		public Token END_OF_BOARD;
		public Token BEGINNING_OF_LIST;
		public Token END_OF_LIST;
		public TerminalNode END_OF_SECTION() { return getToken(csce322as01pt02Parser.END_OF_SECTION, 0); }
		public TerminalNode BEGINNING_OF_BOARD() { return getToken(csce322as01pt02Parser.BEGINNING_OF_BOARD, 0); }
		public TerminalNode END_OF_BOARD() { return getToken(csce322as01pt02Parser.END_OF_BOARD, 0); }
		public TerminalNode END_OF_LIST() { return getToken(csce322as01pt02Parser.END_OF_LIST, 0); }
		public TerminalNode BOARD() { return getToken(csce322as01pt02Parser.BOARD, 0); }
		public TerminalNode CHUTES() { return getToken(csce322as01pt02Parser.CHUTES, 0); }
		public TerminalNode LADDERS() { return getToken(csce322as01pt02Parser.LADDERS, 0); }
		public TerminalNode VALUE_ASSIGNMENT() { return getToken(csce322as01pt02Parser.VALUE_ASSIGNMENT, 0); }
		public TerminalNode ROW_SEPARATOR() { return getToken(csce322as01pt02Parser.ROW_SEPARATOR, 0); }
		public TerminalNode BEGINNING_OF_SECTION() { return getToken(csce322as01pt02Parser.BEGINNING_OF_SECTION, 0); }
		public TerminalNode POSITIONS() { return getToken(csce322as01pt02Parser.POSITIONS, 0); }
		public TerminalNode BEGINNING_OF_LIST() { return getToken(csce322as01pt02Parser.BEGINNING_OF_LIST, 0); }
		public TerminalNode NUMBER() { return getToken(csce322as01pt02Parser.NUMBER, 0); }
		public Valid_tokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valid_token; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).enterValid_token(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt02Listener ) ((csce322as01pt02Listener)listener).exitValid_token(this);
		}
	}

	public final Valid_tokenContext valid_token() throws RecognitionException {
		Valid_tokenContext _localctx = new Valid_tokenContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_valid_token);
		try {
			setState(259);
			switch (_input.LA(1)) {
			case BEGINNING_OF_SECTION:
				enterOuterAlt(_localctx, 1);
				{
				setState(233); ((Valid_tokenContext)_localctx).BEGINNING_OF_SECTION = match(BEGINNING_OF_SECTION);
				 printInvalidToken((((Valid_tokenContext)_localctx).BEGINNING_OF_SECTION!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_SECTION.getText():null), (((Valid_tokenContext)_localctx).BEGINNING_OF_SECTION!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_SECTION.getLine():0)); 
				}
				break;
			case END_OF_SECTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(235); ((Valid_tokenContext)_localctx).END_OF_SECTION = match(END_OF_SECTION);
				 printInvalidToken((((Valid_tokenContext)_localctx).END_OF_SECTION!=null?((Valid_tokenContext)_localctx).END_OF_SECTION.getText():null), (((Valid_tokenContext)_localctx).END_OF_SECTION!=null?((Valid_tokenContext)_localctx).END_OF_SECTION.getLine():0)); 
				}
				break;
			case BOARD:
				enterOuterAlt(_localctx, 3);
				{
				setState(237); ((Valid_tokenContext)_localctx).BOARD = match(BOARD);
				 printInvalidToken((((Valid_tokenContext)_localctx).BOARD!=null?((Valid_tokenContext)_localctx).BOARD.getText():null), (((Valid_tokenContext)_localctx).BOARD!=null?((Valid_tokenContext)_localctx).BOARD.getLine():0)); 
				}
				break;
			case LADDERS:
				enterOuterAlt(_localctx, 4);
				{
				setState(239); ((Valid_tokenContext)_localctx).LADDERS = match(LADDERS);
				 printInvalidToken((((Valid_tokenContext)_localctx).LADDERS!=null?((Valid_tokenContext)_localctx).LADDERS.getText():null), (((Valid_tokenContext)_localctx).LADDERS!=null?((Valid_tokenContext)_localctx).LADDERS.getLine():0)); 
				}
				break;
			case CHUTES:
				enterOuterAlt(_localctx, 5);
				{
				setState(241); ((Valid_tokenContext)_localctx).CHUTES = match(CHUTES);
				 printInvalidToken((((Valid_tokenContext)_localctx).CHUTES!=null?((Valid_tokenContext)_localctx).CHUTES.getText():null), (((Valid_tokenContext)_localctx).CHUTES!=null?((Valid_tokenContext)_localctx).CHUTES.getLine():0)); 
				}
				break;
			case POSITIONS:
				enterOuterAlt(_localctx, 6);
				{
				setState(243); ((Valid_tokenContext)_localctx).POSITIONS = match(POSITIONS);
				 printInvalidToken((((Valid_tokenContext)_localctx).POSITIONS!=null?((Valid_tokenContext)_localctx).POSITIONS.getText():null), (((Valid_tokenContext)_localctx).POSITIONS!=null?((Valid_tokenContext)_localctx).POSITIONS.getLine():0)); 
				}
				break;
			case VALUE_ASSIGNMENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(245); ((Valid_tokenContext)_localctx).VALUE_ASSIGNMENT = match(VALUE_ASSIGNMENT);
				 printInvalidToken((((Valid_tokenContext)_localctx).VALUE_ASSIGNMENT!=null?((Valid_tokenContext)_localctx).VALUE_ASSIGNMENT.getText():null), (((Valid_tokenContext)_localctx).VALUE_ASSIGNMENT!=null?((Valid_tokenContext)_localctx).VALUE_ASSIGNMENT.getLine():0)); 
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 8);
				{
				setState(247); ((Valid_tokenContext)_localctx).NUMBER = match(NUMBER);
				 printInvalidToken((((Valid_tokenContext)_localctx).NUMBER!=null?((Valid_tokenContext)_localctx).NUMBER.getText():null), (((Valid_tokenContext)_localctx).NUMBER!=null?((Valid_tokenContext)_localctx).NUMBER.getLine():0)); 
				}
				break;
			case ROW_SEPARATOR:
				enterOuterAlt(_localctx, 9);
				{
				setState(249); ((Valid_tokenContext)_localctx).ROW_SEPARATOR = match(ROW_SEPARATOR);
				 printInvalidToken((((Valid_tokenContext)_localctx).ROW_SEPARATOR!=null?((Valid_tokenContext)_localctx).ROW_SEPARATOR.getText():null), (((Valid_tokenContext)_localctx).ROW_SEPARATOR!=null?((Valid_tokenContext)_localctx).ROW_SEPARATOR.getLine():0)); 
				}
				break;
			case BEGINNING_OF_BOARD:
				enterOuterAlt(_localctx, 10);
				{
				setState(251); ((Valid_tokenContext)_localctx).BEGINNING_OF_BOARD = match(BEGINNING_OF_BOARD);
				 printInvalidToken((((Valid_tokenContext)_localctx).BEGINNING_OF_BOARD!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_BOARD.getText():null), (((Valid_tokenContext)_localctx).BEGINNING_OF_BOARD!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_BOARD.getLine():0)); 
				}
				break;
			case END_OF_BOARD:
				enterOuterAlt(_localctx, 11);
				{
				setState(253); ((Valid_tokenContext)_localctx).END_OF_BOARD = match(END_OF_BOARD);
				 printInvalidToken((((Valid_tokenContext)_localctx).END_OF_BOARD!=null?((Valid_tokenContext)_localctx).END_OF_BOARD.getText():null), (((Valid_tokenContext)_localctx).END_OF_BOARD!=null?((Valid_tokenContext)_localctx).END_OF_BOARD.getLine():0)); 
				}
				break;
			case BEGINNING_OF_LIST:
				enterOuterAlt(_localctx, 12);
				{
				setState(255); ((Valid_tokenContext)_localctx).BEGINNING_OF_LIST = match(BEGINNING_OF_LIST);
				 printInvalidToken((((Valid_tokenContext)_localctx).BEGINNING_OF_LIST!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_LIST.getText():null), (((Valid_tokenContext)_localctx).BEGINNING_OF_LIST!=null?((Valid_tokenContext)_localctx).BEGINNING_OF_LIST.getLine():0)); 
				}
				break;
			case END_OF_LIST:
				enterOuterAlt(_localctx, 13);
				{
				setState(257); ((Valid_tokenContext)_localctx).END_OF_LIST = match(END_OF_LIST);
				 printInvalidToken((((Valid_tokenContext)_localctx).END_OF_LIST!=null?((Valid_tokenContext)_localctx).END_OF_LIST.getText():null), (((Valid_tokenContext)_localctx).END_OF_LIST!=null?((Valid_tokenContext)_localctx).END_OF_LIST.getLine():0)); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\u0108\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5k\n\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\5\7z\n\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0089\n\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\5\13\u009c\n\13\3\f\3\f\3\f\3\f\5\f\u00a2\n"+
		"\f\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\3\16\3\16\5\16\u00ae\n\16\3"+
		"\17\3\17\3\17\3\17\5\17\u00b4\n\17\3\20\3\20\3\20\3\20\5\20\u00ba\n\20"+
		"\3\21\3\21\3\21\3\21\5\21\u00c0\n\21\3\22\3\22\3\22\3\22\5\22\u00c6\n"+
		"\22\3\23\3\23\3\23\3\23\5\23\u00cc\n\23\3\24\3\24\3\24\3\24\5\24\u00d2"+
		"\n\24\3\25\3\25\3\25\3\25\5\25\u00d8\n\25\3\26\3\26\3\26\3\26\5\26\u00de"+
		"\n\26\3\27\3\27\3\27\3\27\5\27\u00e4\n\27\3\30\3\30\3\30\3\30\5\30\u00ea"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31"+
		"\u0106\n\31\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*"+
		",.\60\2\2\u0111\2\62\3\2\2\2\4Y\3\2\2\2\6[\3\2\2\2\bj\3\2\2\2\nl\3\2\2"+
		"\2\fy\3\2\2\2\16{\3\2\2\2\20\u0088\3\2\2\2\22\u008a\3\2\2\2\24\u009b\3"+
		"\2\2\2\26\u00a1\3\2\2\2\30\u00a7\3\2\2\2\32\u00ad\3\2\2\2\34\u00b3\3\2"+
		"\2\2\36\u00b9\3\2\2\2 \u00bf\3\2\2\2\"\u00c5\3\2\2\2$\u00cb\3\2\2\2&\u00d1"+
		"\3\2\2\2(\u00d7\3\2\2\2*\u00dd\3\2\2\2,\u00e3\3\2\2\2.\u00e9\3\2\2\2\60"+
		"\u0105\3\2\2\2\62\63\5\26\f\2\63\64\5 \21\2\64\65\5\"\22\2\65\66\5,\27"+
		"\2\66\67\5\6\4\2\678\b\2\1\289\5.\30\29:\5\30\r\2:;\5\26\f\2;<\5\4\3\2"+
		"<=\5\30\r\2=>\5\26\f\2>?\5\4\3\2?@\5\30\r\2@A\5\26\f\2AB\5\32\16\2BC\5"+
		"\"\22\2CD\5(\25\2DE\5\22\n\2EF\b\2\1\2FG\5*\26\2GH\5\30\r\2HI\7\2\2\3"+
		"IJ\b\2\1\2J\3\3\2\2\2KL\7\b\2\2LM\5\"\22\2MN\5,\27\2NO\5\n\6\2OP\b\3\1"+
		"\2PQ\5.\30\2QZ\3\2\2\2RS\7\7\2\2ST\5\"\22\2TU\5,\27\2UV\5\16\b\2VW\b\3"+
		"\1\2WX\5.\30\2XZ\3\2\2\2YK\3\2\2\2YR\3\2\2\2Z\5\3\2\2\2[\\\7\13\2\2\\"+
		"]\5\b\5\2]^\b\4\1\2^\7\3\2\2\2_`\7\3\2\2`a\7\13\2\2ab\5\b\5\2bc\b\5\1"+
		"\2ck\3\2\2\2de\7\3\2\2ef\7\13\2\2fk\b\5\1\2gh\5\60\31\2hi\b\5\1\2ik\3"+
		"\2\2\2j_\3\2\2\2jd\3\2\2\2jg\3\2\2\2k\t\3\2\2\2lm\7\13\2\2mn\5\f\7\2n"+
		"o\b\6\1\2o\13\3\2\2\2pq\7\3\2\2qr\7\13\2\2rs\5\f\7\2st\b\7\1\2tz\3\2\2"+
		"\2uv\7\3\2\2vw\7\13\2\2wz\b\7\1\2xz\3\2\2\2yp\3\2\2\2yu\3\2\2\2yx\3\2"+
		"\2\2z\r\3\2\2\2{|\7\13\2\2|}\5\20\t\2}~\b\b\1\2~\17\3\2\2\2\177\u0080"+
		"\7\3\2\2\u0080\u0081\7\13\2\2\u0081\u0082\5\20\t\2\u0082\u0083\b\t\1\2"+
		"\u0083\u0089\3\2\2\2\u0084\u0085\7\3\2\2\u0085\u0086\7\13\2\2\u0086\u0089"+
		"\b\t\1\2\u0087\u0089\3\2\2\2\u0088\177\3\2\2\2\u0088\u0084\3\2\2\2\u0088"+
		"\u0087\3\2\2\2\u0089\21\3\2\2\2\u008a\u008b\7\13\2\2\u008b\u008c\b\n\1"+
		"\2\u008c\u008d\5\24\13\2\u008d\23\3\2\2\2\u008e\u008f\7\3\2\2\u008f\u0090"+
		"\7\13\2\2\u0090\u0091\b\13\1\2\u0091\u009c\5\24\13\2\u0092\u0093\7\3\2"+
		"\2\u0093\u0094\7\13\2\2\u0094\u0095\b\13\1\2\u0095\u0096\7\f\2\2\u0096"+
		"\u0097\b\13\1\2\u0097\u009c\5\22\n\2\u0098\u0099\7\3\2\2\u0099\u009a\7"+
		"\13\2\2\u009a\u009c\b\13\1\2\u009b\u008e\3\2\2\2\u009b\u0092\3\2\2\2\u009b"+
		"\u0098\3\2\2\2\u009c\25\3\2\2\2\u009d\u00a2\7\4\2\2\u009e\u009f\5\60\31"+
		"\2\u009f\u00a0\b\f\1\2\u00a0\u00a2\3\2\2\2\u00a1\u009d\3\2\2\2\u00a1\u009e"+
		"\3\2\2\2\u00a2\27\3\2\2\2\u00a3\u00a8\7\5\2\2\u00a4\u00a5\5\60\31\2\u00a5"+
		"\u00a6\b\r\1\2\u00a6\u00a8\3\2\2\2\u00a7\u00a3\3\2\2\2\u00a7\u00a4\3\2"+
		"\2\2\u00a8\31\3\2\2\2\u00a9\u00ae\7\6\2\2\u00aa\u00ab\5\60\31\2\u00ab"+
		"\u00ac\b\16\1\2\u00ac\u00ae\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00aa\3"+
		"\2\2\2\u00ae\33\3\2\2\2\u00af\u00b4\7\7\2\2\u00b0\u00b1\5\60\31\2\u00b1"+
		"\u00b2\b\17\1\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b3\u00b0\3"+
		"\2\2\2\u00b4\35\3\2\2\2\u00b5\u00ba\7\b\2\2\u00b6\u00b7\5\60\31\2\u00b7"+
		"\u00b8\b\20\1\2\u00b8\u00ba\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3"+
		"\2\2\2\u00ba\37\3\2\2\2\u00bb\u00c0\7\t\2\2\u00bc\u00bd\5\60\31\2\u00bd"+
		"\u00be\b\21\1\2\u00be\u00c0\3\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00bc\3"+
		"\2\2\2\u00c0!\3\2\2\2\u00c1\u00c6\7\n\2\2\u00c2\u00c3\5\60\31\2\u00c3"+
		"\u00c4\b\22\1\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3"+
		"\2\2\2\u00c6#\3\2\2\2\u00c7\u00cc\7\13\2\2\u00c8\u00c9\5\60\31\2\u00c9"+
		"\u00ca\b\23\1\2\u00ca\u00cc\3\2\2\2\u00cb\u00c7\3\2\2\2\u00cb\u00c8\3"+
		"\2\2\2\u00cc%\3\2\2\2\u00cd\u00d2\7\f\2\2\u00ce\u00cf\5\60\31\2\u00cf"+
		"\u00d0\b\24\1\2\u00d0\u00d2\3\2\2\2\u00d1\u00cd\3\2\2\2\u00d1\u00ce\3"+
		"\2\2\2\u00d2\'\3\2\2\2\u00d3\u00d8\7\r\2\2\u00d4\u00d5\5\60\31\2\u00d5"+
		"\u00d6\b\25\1\2\u00d6\u00d8\3\2\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3"+
		"\2\2\2\u00d8)\3\2\2\2\u00d9\u00de\7\16\2\2\u00da\u00db\5\60\31\2\u00db"+
		"\u00dc\b\26\1\2\u00dc\u00de\3\2\2\2\u00dd\u00d9\3\2\2\2\u00dd\u00da\3"+
		"\2\2\2\u00de+\3\2\2\2\u00df\u00e4\7\17\2\2\u00e0\u00e1\5\60\31\2\u00e1"+
		"\u00e2\b\27\1\2\u00e2\u00e4\3\2\2\2\u00e3\u00df\3\2\2\2\u00e3\u00e0\3"+
		"\2\2\2\u00e4-\3\2\2\2\u00e5\u00ea\7\20\2\2\u00e6\u00e7\5\60\31\2\u00e7"+
		"\u00e8\b\30\1\2\u00e8\u00ea\3\2\2\2\u00e9\u00e5\3\2\2\2\u00e9\u00e6\3"+
		"\2\2\2\u00ea/\3\2\2\2\u00eb\u00ec\7\4\2\2\u00ec\u0106\b\31\1\2\u00ed\u00ee"+
		"\7\5\2\2\u00ee\u0106\b\31\1\2\u00ef\u00f0\7\6\2\2\u00f0\u0106\b\31\1\2"+
		"\u00f1\u00f2\7\7\2\2\u00f2\u0106\b\31\1\2\u00f3\u00f4\7\b\2\2\u00f4\u0106"+
		"\b\31\1\2\u00f5\u00f6\7\t\2\2\u00f6\u0106\b\31\1\2\u00f7\u00f8\7\n\2\2"+
		"\u00f8\u0106\b\31\1\2\u00f9\u00fa\7\13\2\2\u00fa\u0106\b\31\1\2\u00fb"+
		"\u00fc\7\f\2\2\u00fc\u0106\b\31\1\2\u00fd\u00fe\7\r\2\2\u00fe\u0106\b"+
		"\31\1\2\u00ff\u0100\7\16\2\2\u0100\u0106\b\31\1\2\u0101\u0102\7\17\2\2"+
		"\u0102\u0106\b\31\1\2\u0103\u0104\7\20\2\2\u0104\u0106\b\31\1\2\u0105"+
		"\u00eb\3\2\2\2\u0105\u00ed\3\2\2\2\u0105\u00ef\3\2\2\2\u0105\u00f1\3\2"+
		"\2\2\u0105\u00f3\3\2\2\2\u0105\u00f5\3\2\2\2\u0105\u00f7\3\2\2\2\u0105"+
		"\u00f9\3\2\2\2\u0105\u00fb\3\2\2\2\u0105\u00fd\3\2\2\2\u0105\u00ff\3\2"+
		"\2\2\u0105\u0101\3\2\2\2\u0105\u0103\3\2\2\2\u0106\61\3\2\2\2\25Yjy\u0088"+
		"\u009b\u00a1\u00a7\u00ad\u00b3\u00b9\u00bf\u00c5\u00cb\u00d1\u00d7\u00dd"+
		"\u00e3\u00e9\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}