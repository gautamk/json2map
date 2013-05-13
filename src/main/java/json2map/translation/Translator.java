package json2map.translation;

import json2map.grammar.JsonBaseVisitor;
import json2map.grammar.JsonLexer;
import json2map.grammar.JsonParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: gautam
 * Date: 12/5/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Translator extends JsonBaseVisitor {
    private static final String O = "O";
    private final StringBuilder buffer;
    private JSON_TYPE rootType;

    public Translator() {
        this.buffer = new StringBuilder();


    }

    private static CommonTokenStream lex(ANTLRInputStream stream) {
        final JsonLexer jsonLexer = new JsonLexer(stream);
        return new CommonTokenStream(jsonLexer);
    }

    private static JsonParser.JsonContext parse(TokenStream tokenStream) {
        final JsonParser jsonParser = new JsonParser(tokenStream);
        final JsonParser.JsonContext json = jsonParser.json();
        return json;
    }

    @Override
    public Object visitPair(JsonParser.PairContext ctx) {
        String key = ctx.key.getText();
        buffer.append("put( "+ key );
        visitValue(ctx.val);
        return buffer;
    }

    @Override
    public Object visitJson(JsonParser.JsonContext ctx) {
        Object result;
        if(ctx.obj != null){
            rootType = JSON_TYPE.OBJECT;
            result = visitObject(ctx.obj);
        } else  {
            rootType = JSON_TYPE.ARRAY;
            result = visitArray(ctx.arr);
        }
        return result;
    }



    @Override
    public Object visitObject(JsonParser.ObjectContext ctx) {
        for (JsonParser.PairContext pair : ctx.pair()) {
            visitPair(pair);
        }
        return buffer;
    }

    @Override
    public Object visitValueArray(JsonParser.ValueArrayContext ctx) {
        buffer.append("new ArrayList<Object>(){{\n");
        visitArray(ctx.arr);
        buffer.append("}}");
        return buffer ;
    }


    @Override
    public Object visitValueObject(JsonParser.ValueObjectContext ctx) {
        buffer.append("new HashMap<String,Object>{{\n");
        visitObject(ctx.obj);
        buffer.append("}}");
        return buffer;
    }



    private Object visitValue(JsonParser.ValueContext ctx){
        if(rootType == JSON_TYPE.ARRAY){
            buffer.append("add( ");
        } else {
            buffer.append(",");
        }

        if(ctx instanceof JsonParser.ValueArrayContext){
            visitValueArray((JsonParser.ValueArrayContext) ctx);
        } else
        if(ctx instanceof JsonParser.ValueObjectContext){
            visitValueObject((JsonParser.ValueObjectContext) ctx);
        } else {
            buffer.append(ctx.getText());
        }
        buffer.append(" );\n");
        return buffer;
    }

    @Override
    public Object visitArray(JsonParser.ArrayContext ctx) {
        for (JsonParser.ValueContext value: ctx.value()) {
            visitValue(value);
        }
        return buffer;
    }

    public String translate(String json) throws IOException {
        return translate(new ByteArrayInputStream(json.getBytes("UTF-8")));
    }

    public String translate(InputStream stream) throws IOException {
        return translate(new ANTLRInputStream(stream));
    }

    public String translate(ANTLRInputStream stream) {
        final CommonTokenStream lex = lex(stream);
        visitJson(parse(lex));
        return buffer.toString();
    }

    private static enum JSON_TYPE {
        ARRAY,
        OBJECT
    }
}
