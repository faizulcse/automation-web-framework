package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameStepDefs extends TestSetup {
    private WysiwygEditorPage wysiwygEditor;

    @Given("^I am on the Wysiwyg Editor page$")
    public void iAmOnTheWysiwygEditorPage() {
        wysiwygEditor = homePage.clickWysiwygEditor();
    }

    @When("^I clear the Wysiwyg Editor text area$")
    public void iClearTheWysiwygEditorTextArea() {
        wysiwygEditor.clearTextArea();
    }

    @And("^I input \"([^\"]*)\" in the text area$")
    public void iInputInTheTextArea(String text) {
        wysiwygEditor.setTextArea(text);
    }

    @And("^I increase the text identition$")
    public void iIncreaseTheTextIdentition() {
        wysiwygEditor.increaseIdention();
    }

    @And("^I decrease the text identition$")
    public void iDecreaseTheTextIdentition() {
        wysiwygEditor.decreaseIdention();
    }

    @Then("^I should see the that the editor text is \"([^\"]*)\"$")
    public void iShouldSeeTheThatTheEditorTextIs(String expectedText) {
        assertEquals(wysiwygEditor.getTextFromEditor(), expectedText, "Text from editor is incorrect");
    }
}
