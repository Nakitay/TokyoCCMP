package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before

    public void setUpScenarios() {
        Driver.getDriver();

        System.out.println("It comes from @Before annotation");  //comes from cucumber
    }

    @Before(value = "@db")

    public void setUpDBScenarios() {

        System.out.println("It comes from @Before annotation for data base Testing ");  //comes from cucumber


    }


    @After
    public void Teardown(Scenario scenario) {
        //System.out.println("It comes from @After annotation");
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
            Driver.closeDriver();

        }
    }


//    @BeforeStep
//    public void teardownSteps(){
//        System.out.println("It comes from @AfterStep annotation");
//    }
//}
/*
Hooks classes are used to run setup or cleanup code before or after tests.
They help avoid duplicate code and keep test cases clean by
centralizing configurations like base URL, authentication,
or environment settings.

Hooks are used for:
Base URL setup
Authentication tokens
Database connections
Browser setup (Selenium)
Test data preparation

Example in API testing:
 */