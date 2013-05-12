// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class JsonBaseListener implements JsonListener {
	@Override public void enterPair(JsonParser.PairContext ctx) { }
	@Override public void exitPair(JsonParser.PairContext ctx) { }

	@Override public void enterJson(JsonParser.JsonContext ctx) { }
	@Override public void exitJson(JsonParser.JsonContext ctx) { }

	@Override public void enterValue(JsonParser.ValueContext ctx) { }
	@Override public void exitValue(JsonParser.ValueContext ctx) { }

	@Override public void enterObject(JsonParser.ObjectContext ctx) { }
	@Override public void exitObject(JsonParser.ObjectContext ctx) { }

	@Override public void enterArray(JsonParser.ArrayContext ctx) { }
	@Override public void exitArray(JsonParser.ArrayContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}