// Generated from /home/gautam/personal/projects/json2map/src/main/java/json2map/grammar/json.g4 by ANTLR 4.0

         package json2map.grammar;
         
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface jsonListener extends ParseTreeListener {
	void enterPair(jsonParser.PairContext ctx);
	void exitPair(jsonParser.PairContext ctx);

	void enterJson(jsonParser.JsonContext ctx);
	void exitJson(jsonParser.JsonContext ctx);

	void enterValue(jsonParser.ValueContext ctx);
	void exitValue(jsonParser.ValueContext ctx);

	void enterObject(jsonParser.ObjectContext ctx);
	void exitObject(jsonParser.ObjectContext ctx);

	void enterArray(jsonParser.ArrayContext ctx);
	void exitArray(jsonParser.ArrayContext ctx);
}