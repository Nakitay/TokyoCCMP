package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.BingSearchPage;
import utilities.ConfigurationReader;
import utilities.Driver;

public class MyStepdefs {
    BingSearchPage bingSearch = new BingSearchPage();

    @Given("user is on the bing page")
    public void userIsOnTheBingPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user types orange in the bing search box and click enter")
    public void userTypesOrangeInTheBingSearchBoxAndClickEnter() {
        bingSearch.searchBox.sendKeys("orange" + Keys.ENTER);


    }


    @Then("user will see  orange in the page title")
    public void userWillSeeOrangeInThePageTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("orange"));


    }
}
/*
We use a FailedTestRunner to rerun only the scenarios that
failed in the previous run instead of running the whole suite again.

Why it exists

Save time
If 200 tests ran and 3 failed, we don’t rerun all 200 — only the 3.

Handle flaky tests
Sometimes tests fail due to environment or timing.
Rerun helps confirm if it’s a real bug or just flaky.

CI/CD pipelines
In Jenkins, failed tests are rerun automatically to verify failures.
 */