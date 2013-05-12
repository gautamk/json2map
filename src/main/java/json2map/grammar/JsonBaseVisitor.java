// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class JsonBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements JsonVisitor<T> {
	@Override public T visitPair(JsonParser.PairContext ctx) { return visitChildren(ctx); }

	@Override public T visitJson(JsonParser.JsonContext ctx) { return visitChildren(ctx); }

	@Override public T visitValue(JsonParser.ValueContext ctx) { return visitChildren(ctx); }

	@Override public T visitObject(JsonParser.ObjectContext ctx) { return visitChildren(ctx); }

	@Override public T visitArray(JsonParser.ArrayContext ctx) { return visitChildren(ctx); }
}