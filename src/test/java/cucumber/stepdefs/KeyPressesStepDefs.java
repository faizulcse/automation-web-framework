package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Keys;
import pages.KeyPressesPage;

import static org.testng.Assert.assertEquals;

public class KeyPressesStepDefs extends TestSetup {
    private KeyPressesPage keyPressesPage;

    @Given("^I am on the key presses page$")
    public void iAmOnTheKeyPressesPage() {
        keyPressesPage = homePage.clickKeyPresses();
    }

    @When("^I enter text with BACK_SPACE key$")
    public void iEnterTextWithBACK_SPACEKey() {
        keyPressesPage.enterText("A+" + Keys.BACK_SPACE);
    }

    @Then("^I should see that \"([^\"]*)\" message is displayed$")
    public void iShouldSeeThatMessageIsDisplayed(String text) {
        assertEquals(keyPressesPage.getResult(), text);
    }

    @When("^I enter pi key with pi value$")
    public void iEnterPiKeyWithPiValue() {
        keyPressesPage.enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }
}
