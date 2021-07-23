package testng.alerts;

import testng.base.BaseTests;
import org.testng.annotations.Test;
import pages.FileUploadPage;
import utils.User;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile(User.USER_DIR + "/images/natural.jpeg");
        assertEquals(fileUploadPage.getUploadFiles(), "natural.jpeg", "Uploaded fail.");
    }
}
