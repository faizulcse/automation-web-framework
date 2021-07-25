package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.InfiniteScrollPage;

import static org.testng.Assert.assertTrue;

public class JavaScriptStepDefs extends TestSetup {
    private InfiniteScrollPage infiniteScroll;

    @Given("^I am on the infinite scroll page$")
    public void iAmOnTheInfiniteScrollPage() {
        infiniteScroll = homePage.clickInfiniteScroll();
    }

    @When("^I scroll down to (\\d+) paragraphs$")
    public void iScrollDownToParagraphs(int index) {
        infiniteScroll.scrollToParagraph(index);
    }

    @Then("^I should see the (\\d+) th paragraph is displayed$")
    public void iShouldSeeTheThParagraphIsDisplayed(int index) {
        assertTrue(infiniteScroll.isParagraphDislplayed(50), "Scroll is not working");
    }
}
