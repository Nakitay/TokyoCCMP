package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() {
        System.out.println("dashboard should be displayed");
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {
        System.out.println("dashboard should be displayed");
    }

    @When("user logs in as librarian")
    public void userLogsInAsLibrarian() {
        System.out.println("user logs in as librarian");
    }

    @When("user logs in as student")
    public void userLogsInAsStudent() {
        System.out.println("user logs in as student");
    }

    @When("user logs in as admin")
    public void userLogsInAsAdmin() {
        System.out.println("user logs in as admin");
    }


}
