package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CMSLoginStepDefs {

    @When("User enters username {string} and password {string} combination")
    public void userEntersValidUsernameAndPasswordCombination(String username, String password) {
        System.out.println("username is: " + username + ", and password is " + password);
    }

    @Then("I should see CMS landing on Welcome page")
    public void iShouldSeeCMSLandingOnWelcomePage() {
        System.out.println("Landing on Welcome page");
    }

    @Then("I should see CMS stays on log in page")
    public void iShouldSeeCMSStaysOnLogInPage() {
        System.out.println("CMS stays on login page");
    }

    @And("error message displayed")
    public void errorMessageDisplayed() {
        System.out.println("error message");
    }

    @And("invalid username and password input cleared out")
    public void invalidUsernameAndPasswordInputClearedOut() {
        System.out.println("input cleared out");
    }

}
