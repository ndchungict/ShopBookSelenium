package chungnd.demo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:target/report.html"},
        glue="chungnd.demo.steps",
        features = "src/test/java/chungnd/demo/feature"
)
public class RunTestSuite {
}
