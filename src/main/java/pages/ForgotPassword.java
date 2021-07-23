package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPassword extends BasePage {
    private By emailField = By.id("email");
    private By retrievePasswordButton = By.id("form_submit");

    ForgotPassword(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public RetrievePassword clickRetrievePassword() {
        driver.findElement(retrievePasswordButton).click();
        return new RetrievePassword(driver);
    }
}
