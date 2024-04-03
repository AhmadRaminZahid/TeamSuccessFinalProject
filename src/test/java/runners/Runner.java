package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
<<<<<<< HEAD

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
        tags = "@e2e_02"
=======
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:target/failedRerun.txt",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        },
        features = "./src/test/resources/features",
        glue = {"stepdefinitions", "hooks" },
        dryRun =false,
        tags = "@us12_e2e"


>>>>>>> origin/master
)
public class Runner {

}