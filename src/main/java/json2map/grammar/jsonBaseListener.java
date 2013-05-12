// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/json.g4 by ANTLR 4.0

         package json2map.grammar;
         

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class jsonBaseListener implements jsonListener {
	@Override public void enterPair(jsonParser.PairContext ctx) { }
	@Override public void exitPair(jsonParser.PairContext ctx) { }

	@Override public void enterJson(jsonParser.JsonContext ctx) { }
	@Override public void exitJson(jsonParser.JsonContext ctx) { }

	@Override public void enterValue(jsonParser.ValueContext ctx) { }
	@Override public void exitValue(jsonParser.ValueContext ctx) { }

	@Override public void enterObject(jsonParser.ObjectContext ctx) { }
	@Override public void exitObject(jsonParser.ObjectContext ctx) { }

	@Override public void enterArray(jsonParser.ArrayContext ctx) { }
	@Override public void exitArray(jsonParser.ArrayContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}