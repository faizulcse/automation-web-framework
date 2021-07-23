package utils;

import org.openqa.selenium.WebDriver;

public class WindowManager {
    private WebDriver.Navigation navigate;

    /**
     * If class variable name and local variable name are same then use this keyword before class variable
     *
     * @param driver
     */
    public WindowManager(WebDriver driver) {
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
}

