package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
        "pretty",
        "html:target/cucumber-reports.html",
        "json:target/json-reports/cucumber.json",
        "junit:target/xml-reports/cucumber.xml",
        "rerun:target/failedRerun.txt",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
},
       // monochrome = true, //makes the console reports more readable
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks" },
        dryRun =false,
        tags = "@us_04"
)
public class Runner {
}