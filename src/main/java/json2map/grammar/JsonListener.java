// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JsonListener extends ParseTreeListener {
	void enterValueArray(JsonParser.ValueArrayContext ctx);
	void exitValueArray(JsonParser.ValueArrayContext ctx);

	void enterValueNull(JsonParser.ValueNullContext ctx);
	void exitValueNull(JsonParser.ValueNullContext ctx);

	void enterValueNumber(JsonParser.ValueNumberContext ctx);
	void exitValueNumber(JsonParser.ValueNumberContext ctx);

	void enterValueObject(JsonParser.ValueObjectContext ctx);
	void exitValueObject(JsonParser.ValueObjectContext ctx);

	void enterPair(JsonParser.PairContext ctx);
	void exitPair(JsonParser.PairContext ctx);

	void enterJson(JsonParser.JsonContext ctx);
	void exitJson(JsonParser.JsonContext ctx);

	void enterValueString(JsonParser.ValueStringContext ctx);
	void exitValueString(JsonParser.ValueStringContext ctx);

	void enterObject(JsonParser.ObjectContext ctx);
	void exitObject(JsonParser.ObjectContext ctx);

	void enterValueFalse(JsonParser.ValueFalseContext ctx);
	void exitValueFalse(JsonParser.ValueFalseContext ctx);

	void enterValueTrue(JsonParser.ValueTrueContext ctx);
	void exitValueTrue(JsonParser.ValueTrueContext ctx);

	void enterArray(JsonParser.ArrayContext ctx);
	void exitArray(JsonParser.ArrayContext ctx);
}