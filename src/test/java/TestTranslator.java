import json2map.translation.Translator;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: gautam
 * Date: 13/5/13
 * Time: 6:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestTranslator {

    private Translator translator;

    @Before
    public void setup() throws IOException {
        this.translator = new Translator();

        new HashMap<String, Object>() {{
            put("key", new ArrayList<Object>() {{
                add("Val");
            }}
            );
            put("key2", new HashMap<String, Object>() {{
                put("k", new ArrayList<Object>() {{
                    add("SomeOne");
                }}
                );
            }}
            );
        }};

    }

    @Test
    public void test() throws IOException {
        final String translated = this.translator.translate("{" +
                "\"key\":[\"Val\"]," +
                "\"key2\":{ \"k\" : [\"SomeOne\"] }" +
                "}");
        System.out.println(translated);
    }

}
