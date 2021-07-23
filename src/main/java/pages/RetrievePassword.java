package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RetrievePassword extends BasePage {
    private By sentMessage = By.cssSelector("h1");

    RetrievePassword(WebDriver driver) {
        super(driver);
    }

    public String getSentMessage() {
        return driver.findElement(sentMessage).getText();
    }
}
