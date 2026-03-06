package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html" ,
                "rerun:target/rerun.txt"

        },
        features = "src/test/resources/features",
        glue = "step_definitions",
        dryRun = false,   //we do true to get snippets
        tags = "" //will run only @smoke annotation scenario
)

public class CukesRunner {

}
