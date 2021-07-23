package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDefs extends TestSetup {

    @Given("^there is a product named Apple TV$")
    public void thereIsAProductNamedAppleTV() {
        System.out.println(homePage.getTitleText());
    }

    @And("^I search for the product$")
    public void iSearchForTheProduct() {
        homePage.clickCheckBoxes();
    }

    @When("^I click the product$")
    public void iClickTheProduct() {
    }

    @Then("^I should be taken to the product page$")
    public void iShouldBeTakenToTheProductPage() {
    }
}
