package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver;
    private static final int TIMEOUT = 10;

    BasePage(WebDriver driver) {
        this.driver = driver;
    }

    protected void waitForVisibility(By by) {
        isLocatorVisible(by, TIMEOUT);
    }

    protected void waitForVisibility(By by, int seconds) {
        isLocatorVisible(by, seconds);
    }

    protected void waitForInvisibility(By by) {
        isLocatorInvisible(by, TIMEOUT);
    }

    protected void waitForInvisibility(By by, int seconds) {
        isLocatorInvisible(by, seconds);
    }

    private void isLocatorVisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    private void isLocatorInvisible(By by, int seconds) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    protected void sleep(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
