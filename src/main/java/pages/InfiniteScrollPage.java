package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage extends BasePage {
    private By textBlocks = By.className("jscroll-added");

    InfiniteScrollPage(WebDriver driver) {
        super(driver);
    }

    public void scrollToParagraph(int index) {
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        JavascriptExecutor js = (JavascriptExecutor) driver;
        while (getNumberOfParagrapsPresent() < index) {
            js.executeScript(script);
        }
    }

    private int getNumberOfParagrapsPresent() {
        return driver.findElements(textBlocks).size();
    }
}
