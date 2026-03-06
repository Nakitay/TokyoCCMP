package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)    //@RunWith comes fromJUNIT
    @CucumberOptions(
            features = "@target/rerun.txt",
            glue = "step_definitions" ,
       tags = ""
    )
    public class FailedTestRunners {


}
