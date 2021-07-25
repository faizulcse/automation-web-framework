package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MultipleWindowsPage;

import static org.testng.Assert.assertEquals;

public class NavigationStepDefs extends TestSetup {
    private MultipleWindowsPage windowsPage;

    @Given("^I am on the home page$")
    public void iAmOnTheHomePage() {
    }

    @When("^I am dynamic loading page and click on example1$")
    public void iAmDynamicLoadingPageAndClickOnExample() {
        homePage.clickDynamicLoading().clickExample1();
    }

    @And("^I navigate to back$")
    public void iNavigateToBack() {
        getWindowManager().goBack();
    }

    @And("^I refresh the page$")
    public void iRefreshThePage() {
        getWindowManager().refreshPage();
    }

    @And("^I navigate to Forward$")
    public void iNavigateToForward() {
        getWindowManager().goForward();
    }

    @And("^I go to url \"([^\"]*)\"$")
    public void iGoToUrl(String url) {
        getWindowManager().goTo(url);
    }

    @Then("^I verify that the page title is \"([^\"]*)\"$")
    public void iVerifyThatThePageTitleIs(String title) {
        assertEquals(getDriver().getTitle(), title, "Title is incorrect");
    }

    @When("^I navigate to multiple windows page$")
    public void iNavigateToMultipleWindowsPage() {
        windowsPage = homePage.clickMultipleWindows();
    }

    @And("^I click on click here button$")
    public void iClickOnClickHereButton() {
        windowsPage.clickHere();
    }

    @And("^I switch to tab \"([^\"]*)\"$")
    public void iSwitchToTab(String title) {
        getWindowManager().switchToTab(title);
    }
}
