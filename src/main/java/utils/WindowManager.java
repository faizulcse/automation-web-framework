package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;
    private WebDriver.Navigation navigate;

    /**
     * If class variable name and local variable name are same then use this keyword before class variable
     *
     * @param driver
     */
    public WindowManager(WebDriver driver) {
        this.driver = driver;
        navigate = driver.navigate();
    }

    public void goBack() {
        navigate.back();
    }

    public void goForward() {
        navigate.forward();
    }

    public void refreshPage() {
        navigate.refresh();
    }

    public void goTo(String url) {
        navigate.to(url);
    }

    public void switchToTab(String tabTitle) {
        Set<String> windows = driver.getWindowHandles();
//        windows.forEach(System.out::println);
        for (String window : windows) {
            driver.switchTo().window(window);
            if (tabTitle.equals(driver.getTitle())) {
                break;
            }
        }
    }
}

