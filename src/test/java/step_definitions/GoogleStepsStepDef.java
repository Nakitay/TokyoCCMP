package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.GoogleSearchPage;
import utilities.Driver;

import java.time.Duration;
import java.util.List;

public class GoogleStepsStepDef {

    GoogleSearchPage GooglePage = new GoogleSearchPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));


    @Given("user is on the google page")
    public void userIsOnTheGooglePage() {
        // Driver.getDriver().get(ConfigurationReader.getProperty("env2"));
        Driver.getDriver().get("https://www.google.com/ncr");

        // wait for search box to exist
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
    }

    @When("user types apple in the google search box and click enter")
    public void userTypesAppleInTheGoogleSearchBoxAndClickEnter() {
        GooglePage.searchBox.sendKeys("apple" + Keys.ENTER);
    }

    @Then("user sees apple in the page title")
    public void userSeesAppleInThePageTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("apple"));
    }

    @When("user types orange in the google search box and click enter")
    public void userTypesOrangeInTheGoogleSearchBoxAndClickEnter() {
        GooglePage.searchBox.sendKeys("orange" + Keys.ENTER);

    }

    @Then("user sees orange in the page title")
    public void userSeesOrangeInThePageTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("orange"));

    }

    @When("user types Nargiza Umali in the google search box and click enter")
    public void userTypesNargizaUmaliInTheGoogleSearchBoxAndClickEnter() {
        GooglePage.searchBox.sendKeys("NargizaUmali" + Keys.ENTER);


    }

    @Then("user sees Nargiza Umali in the page title")
    public void userSeesNargizaUmaliInThePageTitle() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("NargizaUmali"));

    }

    @When("user types {string} in the google search box and click enter")
    public void user_types_in_the_google_search_box_and_click_enter(String string) {
        GooglePage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("user sees {string} in the page title")
    public void user_sees_in_the_page_title(String string) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(string));


    }

    @When("users searches for {string} capital")
    public void usersSearchesForCapital(String country) {
        GooglePage.searchBox.sendKeys("capital of " + country + Keys.ENTER);
    }

    @Then("user should see {string} in the result")
    public void userShouldSeeInTheResult(String capital) {
//I have to add Assertions

    }

//    @Then("user should be able to search for following:")
//    public void user_should_be_able_to_search_for_following(List<String> searchKeyword) {
//
//
//        for (String eachKeyword : searchKeyword) {
//            GooglePage.searchBox.clear();
//            GooglePage.searchBox.sendKeys(eachKeyword+Keys.ENTER);


    @Then("user should be able to search for following:")
    public void user_should_be_able_to_search_for_following(List<String> searchKeyword) throws InterruptedException {

        for (String eachKeyword : searchKeyword) {

            // go back to Google home each time
            Driver.getDriver().get("https://www.google.com");

            WebElement searchBox = Driver.getDriver().findElement(By.name("q"));
            searchBox.sendKeys(eachKeyword + Keys.ENTER);

            Thread.sleep(1500);
        }


    }
}

