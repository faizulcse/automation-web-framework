package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownStepDefs extends TestSetup {
    private DropdownPage dropdownPage;
    private List<String> selectedOptions;

    @Given("^I am on the dropdown page$")
    public void iAmOnTheDropdownPage() {
        dropdownPage = homePage.clickDropdownLink();
    }

    @When("^I select \"([^\"]*)\" from the drop down$")
    public void iSelectFromTheDropDown(String option) {
        dropdownPage.selectFromDropDown(option);
    }

    @Then("^I should verify that selected options size is (\\d+)$")
    public void iShouldVerifyThatSelectedOptionsSizeIs(int size) {
        selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), size, "Incorrect number of selections");
    }

    @And("^I should verify that selected options contains \"([^\"]*)\"$")
    public void iShouldVerifyThatSelectedOptionsContains(String option) {
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
