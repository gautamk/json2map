// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class jsonBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements jsonVisitor<T> {
	@Override public T visitPair(jsonParser.PairContext ctx) { return visitChildren(ctx); }

	@Override public T visitJson(jsonParser.JsonContext ctx) { return visitChildren(ctx); }

	@Override public T visitValue(jsonParser.ValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitObject(jsonParser.ObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitArray(jsonParser.ArrayContext ctx) { return visitChildren(ctx); }
}