// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class JsonParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__8=1, T__7=2, T__6=3, T__5=4, T__4=5, T__3=6, T__2=7, T__1=8, T__0=9, 
		STRING=10, NUMBER=11, WS=12;
	public static final String[] tokenNames = {
		"<INVALID>", "']'", "'{'", "'null'", "','", "'['", "':'", "'false'", "'}'", 
		"'true'", "STRING", "NUMBER", "WS"
	};
	public static final int
		RULE_json = 0, RULE_object = 1, RULE_pair = 2, RULE_array = 3, RULE_value = 4;
	public static final String[] ruleNames = {
		"json", "object", "pair", "array", "value"
	};

	@Override
	public String getGrammarFileName() { return "Json.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public JsonParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class JsonContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_json);
		try {
			setState(12);
			switch (_input.LA(1)) {
			case 2:
				enterOuterAlt(_localctx, 1);
				{
				setState(10); object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 2);
				{
				setState(11); array();
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

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_object);
		int _la;
		try {
			setState(27);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(14); match(2);
				setState(15); pair();
				setState(20);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(16); match(4);
					setState(17); pair();
					}
					}
					setState(22);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(23); match(8);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(25); match(2);
				setState(26); match(8);
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

	public static class PairContext extends ParserRuleContext {
		public Token key;
		public ValueContext val;
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JsonParser.STRING, 0); }
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29); ((PairContext)_localctx).key = match(STRING);
			setState(30); match(6);
			setState(31); ((PairContext)_localctx).val = value();
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

	public static class ArrayContext extends ParserRuleContext {
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array);
		int _la;
		try {
			setState(46);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(33); match(5);
				setState(34); value();
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==4) {
					{
					{
					setState(35); match(4);
					setState(36); value();
					}
					}
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42); match(1);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44); match(5);
				setState(45); match(1);
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

	public static class ValueContext extends ParserRuleContext {
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public TerminalNode STRING() { return getToken(JsonParser.STRING, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public TerminalNode NUMBER() { return getToken(JsonParser.NUMBER, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof JsonListener ) ((JsonListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof JsonVisitor ) return ((JsonVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_value);
		try {
			setState(55);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(48); match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 3);
				{
				setState(50); object();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 4);
				{
				setState(51); array();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 5);
				{
				setState(52); match(9);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 6);
				{
				setState(53); match(7);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 7);
				{
				setState(54); match(3);
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
		"\2\3\16<\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\5\2\17\n\2\3"+
		"\3\3\3\3\3\3\3\7\3\25\n\3\f\3\16\3\30\13\3\3\3\3\3\3\3\3\3\5\3\36\n\3"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5(\n\5\f\5\16\5+\13\5\3\5\3\5\3\5\3"+
		"\5\5\5\61\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6:\n\6\3\6\2\7\2\4\6\b\n\2"+
		"\2A\2\16\3\2\2\2\4\35\3\2\2\2\6\37\3\2\2\2\b\60\3\2\2\2\n9\3\2\2\2\f\17"+
		"\5\4\3\2\r\17\5\b\5\2\16\f\3\2\2\2\16\r\3\2\2\2\17\3\3\2\2\2\20\21\7\4"+
		"\2\2\21\26\5\6\4\2\22\23\7\6\2\2\23\25\5\6\4\2\24\22\3\2\2\2\25\30\3\2"+
		"\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32\7\n"+
		"\2\2\32\36\3\2\2\2\33\34\7\4\2\2\34\36\7\n\2\2\35\20\3\2\2\2\35\33\3\2"+
		"\2\2\36\5\3\2\2\2\37 \7\f\2\2 !\7\b\2\2!\"\5\n\6\2\"\7\3\2\2\2#$\7\7\2"+
		"\2$)\5\n\6\2%&\7\6\2\2&(\5\n\6\2\'%\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2"+
		"\2\2*,\3\2\2\2+)\3\2\2\2,-\7\3\2\2-\61\3\2\2\2./\7\7\2\2/\61\7\3\2\2\60"+
		"#\3\2\2\2\60.\3\2\2\2\61\t\3\2\2\2\62:\7\f\2\2\63:\7\r\2\2\64:\5\4\3\2"+
		"\65:\5\b\5\2\66:\7\13\2\2\67:\7\t\2\28:\7\5\2\29\62\3\2\2\29\63\3\2\2"+
		"\29\64\3\2\2\29\65\3\2\2\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\13\3\2\2"+
		"\2\b\16\26\35)\609";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}