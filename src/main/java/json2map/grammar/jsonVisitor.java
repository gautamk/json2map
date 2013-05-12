// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface jsonVisitor<T> extends ParseTreeVisitor<T> {
	T visitPair(jsonParser.PairContext ctx);

	T visitJson(jsonParser.JsonContext ctx);

	T visitValue(jsonParser.ValueContext ctx);

	T visitObject(jsonParser.ObjectContext ctx);

	T visitArray(jsonParser.ArrayContext ctx);
}