// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/Json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface JsonListener extends ParseTreeListener {
	void enterPair(JsonParser.PairContext ctx);
	void exitPair(JsonParser.PairContext ctx);

	void enterJson(JsonParser.JsonContext ctx);
	void exitJson(JsonParser.JsonContext ctx);

	void enterValue(JsonParser.ValueContext ctx);
	void exitValue(JsonParser.ValueContext ctx);

	void enterObject(JsonParser.ObjectContext ctx);
	void exitObject(JsonParser.ObjectContext ctx);

	void enterArray(JsonParser.ArrayContext ctx);
	void exitArray(JsonParser.ArrayContext ctx);
}