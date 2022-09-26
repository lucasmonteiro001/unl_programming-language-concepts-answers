// Generated from csce322as01pt01.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class csce322as01pt01Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		BEGINNING_OF_SECTION=1, END_OF_SECTION=2, BOARD=3, LADDERS=4, CHUTES=5, 
		POSITIONS=6, VALUE_ASSIGNMENT=7, NUMBER=8, ROW_SEPARATOR=9, BEGINNING_OF_BOARD=10, 
		END_OF_BOARD=11, BEGINNING_OF_LIST=12, END_OF_LIST=13, INVALID=14, Whitespace=15;
	public static final String[] tokenNames = {
		"<INVALID>", "'<='", "'=>'", "'GameBoard'", "'Ladders'", "'Chutes'", "'Positions'", 
		"'<-'", "NUMBER", "'^'", "'['", "']'", "'{'", "'}'", "INVALID", "Whitespace"
	};
	public static final int
		RULE_chutesNladders = 0;
	public static final String[] ruleNames = {
		"chutesNladders"
	};

	@Override
	public String getGrammarFileName() { return "csce322as01pt01.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public csce322as01pt01Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ChutesNladdersContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(csce322as01pt01Parser.EOF, 0); }
		public ChutesNladdersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_chutesNladders; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt01Listener ) ((csce322as01pt01Listener)listener).enterChutesNladders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof csce322as01pt01Listener ) ((csce322as01pt01Listener)listener).exitChutesNladders(this);
		}
	}

	public final ChutesNladdersContext chutesNladders() throws RecognitionException {
		ChutesNladdersContext _localctx = new ChutesNladdersContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_chutesNladders);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(5);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(2);
					matchWildcard();
					}
					} 
				}
				setState(7);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(8); match(EOF);
			System.out.println("End of File");
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\21\16\4\2\t\2\3\2"+
		"\7\2\6\n\2\f\2\16\2\t\13\2\3\2\3\2\3\2\3\2\3\7\2\3\2\2\2\r\2\7\3\2\2\2"+
		"\4\6\13\2\2\2\5\4\3\2\2\2\6\t\3\2\2\2\7\b\3\2\2\2\7\5\3\2\2\2\b\n\3\2"+
		"\2\2\t\7\3\2\2\2\n\13\7\2\2\3\13\f\b\2\1\2\f\3\3\2\2\2\3\7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}