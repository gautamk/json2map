// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JsonVisitor<T> extends ParseTreeVisitor<T> {
	T visitValueArray(JsonParser.ValueArrayContext ctx);

	T visitValueNull(JsonParser.ValueNullContext ctx);

	T visitValueNumber(JsonParser.ValueNumberContext ctx);

	T visitValueObject(JsonParser.ValueObjectContext ctx);

	T visitPair(JsonParser.PairContext ctx);

	T visitJson(JsonParser.JsonContext ctx);

	T visitValueString(JsonParser.ValueStringContext ctx);

	T visitObject(JsonParser.ObjectContext ctx);

	T visitValueFalse(JsonParser.ValueFalseContext ctx);

	T visitValueTrue(JsonParser.ValueTrueContext ctx);

	T visitArray(JsonParser.ArrayContext ctx);
}