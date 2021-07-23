package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DLExampleTwoPage extends BasePage {
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    DLExampleTwoPage(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        driver.findElement(startButton).click();
        waitForInvisibility(loadingIndicator);
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
