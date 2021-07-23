package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    private By formAuthenticationLink = By.linkText("Form Authentication");
    private By dropdownLink = By.linkText("Dropdown");
    private By dynamicLoading = By.linkText("Dynamic Loading");
    private By forgotPasswordLink = By.linkText("Forgot Password");
    private By infiniteScrollLink = By.linkText("Infinite Scroll");
    private By keyPressesLink = By.linkText("Key Presses");
    private By fileUploadLink = By.linkText("File Upload");
    private By javascriptAlertLink = By.linkText("JavaScript Alerts");
    private By hoversLink = By.linkText("Hovers");
    private By wysiwygEditorLink = By.linkText("WYSIWYG Editor");
    private By multipleWindowsLink = By.linkText("Multiple Windows");
    private By checkboxLink = By.xpath("//a[@href='/checkboxes']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public LoginPage clickFormAuthentication() {
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }

    public DropdownPage clickDropdownLink() {
        driver.findElement(dropdownLink).click();
        return new DropdownPage(driver);
    }

    public ForgotPassword clickForgotPassword() {
        driver.findElement(forgotPasswordLink).click();
        return new ForgotPassword(driver);
    }

    public DynamicLoadingPage clickDynamicLoading() {
        driver.findElement(dynamicLoading).click();
        return new DynamicLoadingPage(driver);
    }

    public InfiniteScrollPage clickInfiniteScroll() {
        driver.findElement(infiniteScrollLink).click();
        return new InfiniteScrollPage(driver);
    }

    public KeyPressesPage clickKeyPresses() {
        driver.findElement(keyPressesLink).click();
        return new KeyPressesPage(driver);
    }

    public FileUploadPage clickFileUpload() {
        driver.findElement(fileUploadLink).click();
        return new FileUploadPage(driver);
    }

    public AlertsPage clickJavaScriptAlerts() {
        driver.findElement(javascriptAlertLink).click();
        return new AlertsPage(driver);
    }

    public HoversPage clickHovers() {
        driver.findElement(hoversLink).click();
        return new HoversPage(driver);
    }

    public WysiwygEditorPage clickWysiwygEditor() {
        driver.findElement(wysiwygEditorLink).click();
        return new WysiwygEditorPage(driver);
    }

    public MultipleWindowsPage clickMultipleWindows() {
        driver.findElement(multipleWindowsLink).click();
        return new MultipleWindowsPage(driver);
    }

    public void clickCheckBoxes() {
        driver.findElement(checkboxLink).click();
    }

    public String getTitleText() {
        return driver.getTitle();
    }
}
