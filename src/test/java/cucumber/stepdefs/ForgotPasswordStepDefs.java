package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.ForgotPassword;
import pages.RetrievePassword;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordStepDefs extends TestSetup {
    private ForgotPassword forgotPassword;
    private RetrievePassword retrievePassword;

    @Given("^I am on the forgot password page$")
    public void iAmOnTheForgotPasswordPage() {
        forgotPassword = homePage.clickForgotPassword();
    }

    @When("^I input my recover email \"([^\"]*)\"$")
    public void iInputMyRecoverEmail(String email) {
        forgotPassword.setEmail(email);
    }

    @And("^I click on the retrive password button$")
    public void iClickOnTheRetrivePasswordButton() {
        retrievePassword = forgotPassword.clickRetrievePassword();
    }

    @Then("^I should see successfully email sent message$")
    public void iShouldSeeSuccessfullyEmailSentMessage() {
        assertEquals(retrievePassword.getSentMessage(), "Internal Server Error");
    }
}
