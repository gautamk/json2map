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

/**
 * Created with IntelliJ IDEA.
 * User: gautam
 * Date: 12/5/13
 * Time: 10:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class Translator extends JsonBaseVisitor {


    public Translator() {


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
    public String visitPair(JsonParser.PairContext ctx) {
        String key = ctx.key.getText();
        String value = visitValue(ctx.val);
        return key + "," + value;
    }

    @Override
    public String visitJson(JsonParser.JsonContext ctx) {
        return (ctx.obj != null ? visitObject(ctx.obj) : visitArray(ctx.arr)) + ";";
    }

    @Override
    public String visitObject(JsonParser.ObjectContext ctx) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("new HashMap<String,Object>() {{ \n");
        for (JsonParser.PairContext pair : ctx.pair()) {
            buffer.append("put(" + visitPair(pair) + ");\n");
        }
        buffer.append("}}\n");
        return buffer.toString();
    }

    @Override
    public String visitArray(JsonParser.ArrayContext ctx) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("new ArrayList<Object>(){{ \n");
        for (JsonParser.ValueContext value : ctx.value()) {
            buffer.append("add(" + visitValue(value) + ");\n");
        }
        buffer.append("}}\n");
        return buffer.toString();
    }

    @Override
    public String visitValueArray(JsonParser.ValueArrayContext ctx) {
        return visitArray(ctx.arr);
    }

    @Override
    public String visitValueObject(JsonParser.ValueObjectContext ctx) {
        return visitObject(ctx.obj);
    }

    private String visitValue(JsonParser.ValueContext ctx) {
        StringBuilder buffer = new StringBuilder();
        if (ctx instanceof JsonParser.ValueArrayContext) {
            buffer.append(visitValueArray((JsonParser.ValueArrayContext) ctx));
        } else if (ctx instanceof JsonParser.ValueObjectContext) {
            buffer.append(visitValueObject((JsonParser.ValueObjectContext) ctx));
        } else {
            buffer.append(ctx.getText());
        }
        return buffer.toString();
    }

    public String translate(String json) throws IOException {
        return translate(new ByteArrayInputStream(json.getBytes("UTF-8")));
    }

    public String translate(InputStream stream) throws IOException {
        return translate(new ANTLRInputStream(stream));
    }

    public String translate(ANTLRInputStream stream) {
        final CommonTokenStream lex = lex(stream);
        return visitJson(parse(lex));
    }


}
