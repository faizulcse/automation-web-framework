package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.FileUploadPage;
import utils.User;

import static org.testng.Assert.assertEquals;

public class FileUploadStepDefs extends TestSetup {
    private FileUploadPage fileUploadPage;

    @Given("^I am on the file upload page$")
    public void iAmOnTheFileUploadPage() {
        fileUploadPage = homePage.clickFileUpload();
    }


    @When("^I choose a file and click on upload button$")
    public void iHaveUploadedAFile() {
        fileUploadPage.uploadFile(User.USER_DIR + "/images/natural.jpeg");
    }

    @Then("^I should see the uploaded file name is displayed$")
    public void iShouldSeeTheUploadedFileNameIsDisplayed() {
        assertEquals(fileUploadPage.getUploadFiles(), "natural.jpeg", "Uploaded fail.");
    }
}
