package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.LoginPage;
import pages.SecureAreaPage;

import static org.testng.Assert.assertTrue;

public class LoginStepDefs extends TestSetup {
    private LoginPage loginPage;
    private SecureAreaPage secureAreaPage;

    @Given("^I am on the login page$")
    public void iAmOnTheLoginPage() {
        loginPage = homePage.clickFormAuthentication();
    }

    @When("^I input my username \"([^\"]*)\"$")
    public void iInputMyUsername(String username) {
        loginPage.setUsername(username);
    }

    @And("^I input my password \"([^\"]*)\"$")
    public void iInputMyPassword(String password) {
        loginPage.setPassword(password);
    }

    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
        secureAreaPage = loginPage.clickLoginButton();
    }

    @Then("^I should see a successful message that \"([^\"]*)\"$")
    public void iShouldSeeASuccessfulMessageThat(String text) {
        assertTrue(secureAreaPage.getAlertText().contains(text));
    }
}
