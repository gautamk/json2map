// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	T visitPair(JsonParser.PairContext ctx);

	T visitJson(JsonParser.JsonContext ctx);

	T visitValue(JsonParser.ValueContext ctx);

	T visitObject(JsonParser.ObjectContext ctx);

	T visitArray(JsonParser.ArrayContext ctx);
}