package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage extends BasePage {
    private By clickHereLink = By.linkText("Click Here");

    MultipleWindowsPage(WebDriver driver) {
        super(driver);
    }

    public void clickHere() {
        sleep(2);
        driver.findElement(clickHereLink).click();
    }
}
