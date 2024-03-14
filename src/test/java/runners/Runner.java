package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "./src/test/resources/e2e_features",
        glue = {"stepdefinitions", "hooks" },
        dryRun =false,
        tags = ""
)
public class Runner {
}