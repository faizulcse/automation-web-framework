package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage extends BasePage {
    private By inputField = By.id("target");
    private By resultText = By.id("result");

    KeyPressesPage(WebDriver driver) {
        super(driver);
    }

    public void enterText(String text) {
        driver.findElement(inputField).sendKeys(text);
    }

    public void enterPi() {
        enterText(Keys.chord(Keys.ALT, "p") + "=3.14");
    }

    public String getResult() {
        return driver.findElement(resultText).getText();
    }
}
