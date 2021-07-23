package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage extends BasePage {
    private String linkXpath_Format = "//a[contains(text(), '%s')]";
    private By linkExample1 = By.xpath(String.format(linkXpath_Format, "Example 1"));
    private By linkExample2 = By.xpath(String.format(linkXpath_Format, "Example 2"));

    DynamicLoadingPage(WebDriver driver) {
        super(driver);
    }

    public DLExampleOnePage clickExample1() {
        driver.findElement(linkExample1).click();
        return new DLExampleOnePage(driver);
    }

    public DLExampleTwoPage clickExample2() {
        driver.findElement(linkExample2).click();
        return new DLExampleTwoPage(driver);
    }
}
