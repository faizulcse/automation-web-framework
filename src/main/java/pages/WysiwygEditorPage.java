package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WysiwygEditorPage extends BasePage {

    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By decreaseIdentButton = By.xpath("//button[@title='Decrease indent']");
    private By increaseIdentButton = By.xpath("//button[@title='Increase indent']");

    WysiwygEditorPage(WebDriver driver) {
        super(driver);
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        switchToMainArea();
    }

    public void decreaseIdention() {
        driver.findElement(decreaseIdentButton).click();
    }

    public void increaseIdention() {
        driver.findElement(increaseIdentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }

    public void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    public void switchToMainArea() {
        driver.switchTo().parentFrame();
    }
}
