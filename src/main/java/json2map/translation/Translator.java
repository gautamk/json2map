package json2map.translation;

import json2map.grammar.JsonBaseVisitor;
import json2map.grammar.JsonLexer;
import json2map.grammar.JsonParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

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
    public Object visitPair(JsonParser.PairContext ctx) {
        return super.visitPair(ctx);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public Object visitJson(JsonParser.JsonContext ctx) {
        return super.visitJson(ctx);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public Object visitValue(JsonParser.ValueContext ctx) {
        return super.visitValue(ctx);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public Object visitObject(JsonParser.ObjectContext ctx) {
        return super.visitObject(ctx);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public Object visitArray(JsonParser.ArrayContext ctx) {
        return super.visitArray(ctx);    //To change body of overridden methods use File | Settings | File Templates.
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
        return "";
    }
}
