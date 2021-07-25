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
        while (getNumberOfParagraphsPresent() < index) {
            js.executeScript(script);
        }
    }

    private int getNumberOfParagraphsPresent() {
        return driver.findElements(textBlocks).size();
    }

    public boolean isParagraphDislplayed(int index) {
        return driver.findElements(textBlocks).get(index - 1).isDisplayed();
    }
}
