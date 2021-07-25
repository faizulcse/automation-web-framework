package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class AlertStepDefs extends TestSetup {
    private AlertsPage alertsPage;

    @Given("^I am on the JS alert page$")
    public void iAmOnTheJSAlertPage() {
        alertsPage = homePage.clickJavaScriptAlerts();
    }

    @When("^I click on the JS alert button$")
    public void iClickOnTheJSAlertButton() {
        alertsPage.triggerAlert();
    }

    @And("^I click on the JS alert accept button$")
    public void iClickOnTheJSAlertAcceptButton() {
        alertsPage.alert_clickToAccept();
    }

    @Then("^I should see the message \"([^\"]*)\"$")
    public void iShouldSeeTheMessage(String text) {
        assertEquals(alertsPage.getResult(), text, "Results test is incorrect.");
    }

    @When("^I click on the JS confirm button$")
    public void iClickOnTheJSConfirmButton() {
        alertsPage.triggerConfirm();
    }

    @And("^I click on the JS dismiss button$")
    public void iClickOnTheJSDismissButton() {
        alertsPage.alert_clickToDismiss();
    }

    @Then("^I should see the alert text message is \"([^\"]*)\"$")
    public void iShouldSeeTheAlertTextMessageIs(String text) {
        assertEquals(text, "I am a JS Confirm", "Alert text incorrect.");
    }

    @When("^I click on the JS prompt button$")
    public void iClickOnTheJSPromptButton() {
        alertsPage.triggerPrompt();
    }

    @And("^I insert \"([^\"]*)\" text on the JS input field$")
    public void iInsertTextOnTheJSInputField(String input) {
        alertsPage.alert_setInput(input);
    }

    @And("^I click on the JS alert OK button$")
    public void iClickOnTheJSAlertOKButton() {
        alertsPage.alert_clickToAccept();
    }

    @Then("^I should see the message \"([^\"]*)\" is displayed$")
    public void iShouldSeeTheMessageIsDisplayed(String text) {
        assertEquals(alertsPage.getResult(), text, "Results text is incorrect");
    }
}
