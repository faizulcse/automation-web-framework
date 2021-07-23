package testng.forgotpassword;

import testng.base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPassword;
import pages.RetrievePassword;

import static org.testng.Assert.assertEquals;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() {
        ForgotPassword forgotPassword = homePage.clickForgotPassword();
        forgotPassword.setEmail("tau@gmail.com");
        RetrievePassword retrievePassword = forgotPassword.clickRetrievePassword();
        assertEquals(retrievePassword.getSentMessage(), "Internal Server Error");
    }
}
