package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
   features = "src\\main\\resources\\features",
   glue = "stepDefinitions",
   tags = "@regression",
        plugin = {"pretty",
                "html:target/asd.html",
                "json:target/asd.json",
                "junit:target/asd.xml",
                "rerun:target/asd.txt"
        }
)
public class TestRunner {
}
