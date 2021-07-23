package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DLExampleOnePage extends BasePage {
    private By startButton = By.cssSelector("#start button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.id("finish");

    DLExampleOnePage(WebDriver driver) {
        super(driver);
    }

    public void clickStartButton() {
        /**
         *  This explicit wait work for this method only and this type of wait need a condition
         *  WebDriverWait wait = new WebDriverWait(driver, 5);
         *  wait.until(ExpectedConditions.invisibilityOf(driver.findElement(loadingIndicator)));
         */

        driver.findElement(startButton).click();
        waitForInvisibility(loadingIndicator);
    }

    public String getLoadedText() {
        return driver.findElement(loadedText).getText();
    }
}
