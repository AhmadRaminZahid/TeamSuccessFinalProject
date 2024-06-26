package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        plugin = {
//                "pretty",
//                "html:target/cucumber-reports.html",
//                "json:target/json-reports/cucumber.json",
//                "junit:target/xml-reports/cucumber.xml",
//                "rerun:target/failedRerun.txt",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks" },
        dryRun =false,
        tags = "@e2e_01"

)
public class Runner {

}