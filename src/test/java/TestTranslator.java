import json2map.translation.Translator;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;

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
    public void setup () throws IOException {
        this.translator = new Translator();

    }

    @Test
    public void test() throws IOException {
        final String translated = this.translator.translate("{" +
                "\"key\":[\"Val\"]," +
                "\"key2\":{ \"k\" : \"v\" }"+
                "}");
        System.out.println(translated);
    }

}
