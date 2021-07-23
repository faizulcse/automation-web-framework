package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    private By inputField = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void clickUploadButton() {
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String abslutePathOfFile) {
        driver.findElement(inputField).sendKeys(abslutePathOfFile);
        clickUploadButton();
    }

    public String getUploadFiles() {
        return driver.findElement(uploadedFiles).getText();
    }
}
