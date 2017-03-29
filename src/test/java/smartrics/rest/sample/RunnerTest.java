package smartrics.rest.sample;

import fitnesse.junit.JUnitHelper;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
public class RunnerTest {

    private JUnitHelper helper;

    @Before
    public void preparation() {
        helper = new JUnitHelper("C:\\", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureAndHsacSoapXmlHttpTests() throws Exception {
        helper.assertSuitePasses("MyTestSamples.MySimple1");
        helper.assertSuitePasses("MyTestSamples.MySimple2");
        helper.assertSuitePasses("MyTestSamples.MySimple3");
        helper.assertSuitePasses("MyTestSamples.MySimple4");
        helper.assertSuitePasses("MyTestSamples.MySimple6");
    }
}