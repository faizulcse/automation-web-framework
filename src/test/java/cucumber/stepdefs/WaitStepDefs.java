package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DLExampleOnePage;
import pages.DLExampleTwoPage;
import pages.DynamicLoadingPage;

import static org.testng.Assert.assertEquals;

public class WaitStepDefs extends TestSetup {
    private DynamicLoadingPage loadingPage;
    private DLExampleOnePage exampleOnePage;
    private DLExampleTwoPage exampleTwoPage;

    @Given("^I am on the dynamic loading page$")
    public void iAmOnTheDynamicLoadingPage() {
        loadingPage = homePage.clickDynamicLoading();
    }

    @When("^I click on the example1 and start button$")
    public void iClickOnTheExample1AndStartButton() {
        exampleOnePage = loadingPage.clickExample1();
        exampleOnePage.clickStartButton();
    }

    @Then("^I should verify that \"([^\"]*)\" message is visibled")
    public void iShouldVerifyThatMessageIsVisibled(String text) {
        assertEquals(exampleOnePage.getLoadedText(), text, "Loaded text incorrect");
    }

    @When("^I click on the example2 and start button$")
    public void iClickOnTheExample2AndStartButton() {
        exampleTwoPage = loadingPage.clickExample2();
        exampleTwoPage.clickStartButton();
    }

    @Then("^I should verify that \"([^\"]*)\" message is rendered")
    public void iShouldVerifyThatMessageIsRendered(String text) {
        assertEquals(exampleTwoPage.getLoadedText(), text, "Loaded text incorrect");
    }
}
