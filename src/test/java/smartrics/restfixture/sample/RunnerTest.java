package smartrics.restfixture.sample;

import java.io.File;
import org.junit.Before;
import org.junit.Test;

import fitnesse.junit.JUnitHelper;

public class RunnerTest {

    private JUnitHelper helper;

    @Before
    public void prepare() {
        helper = new JUnitHelper("src/main/resources", new File("target", "fitnesse-junit").getAbsolutePath());
        helper.setPort(9090);
    }

    @Test
    public void restFixtureTests() throws Exception {
        helper.assertSuitePasses("MyTest.MyTest1");
    }
}