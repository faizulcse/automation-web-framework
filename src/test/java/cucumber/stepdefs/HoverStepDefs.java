package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverStepDefs extends TestSetup {
    private HoversPage hoversPage;
    private HoversPage.FigureCaption figureCaption;

    @Given("^I am on the hover over page$")
    public void iAmOnTheHoverOverPage() {
        hoversPage = homePage.clickHovers();
    }

    @When("^I hover over icon on the (.*)$")
    public void iHoverOverIconOnTheFigure(int index) {
        figureCaption = hoversPage.hoverOverFigure(index);
    }

    @Then("^I should verify figure (.*) and link (.*)$")
    public void iShouldVerifyFigureTitleAndLinkText(String title, String text) {
        assertTrue(figureCaption.isCaptionDisplayed(), "Caption not displayed");
        assertEquals(figureCaption.getTitle(), title, "Caption title incorrect");
        assertEquals(figureCaption.getLinkText(), text, "Caption link text incorrect");
    }
}
