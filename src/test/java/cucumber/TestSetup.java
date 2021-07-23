package cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import pages.HomePage;
import utils.EventReported;
import utils.Links;
import utils.User;
import utils.WindowManager;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class TestSetup {

    private static EventFiringWebDriver driver;
    protected static HomePage homePage;

    /**
     * Open the Chrome browser and navigate to the application home page
     */
    public static void launchApplication() {
        setChromeDriverProperty();
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReported());
        driver.get(Links.HOME);
        homePage = new HomePage(driver);
    }

    /**
     * This method closes the browser and ends the session
     */
    public static void closeBrowser() {
        driver.quit();
    }

    /**
     * This method return the current Chrome WebDriver
     *
     * @return webDriver
     */
    protected static WebDriver getDriver() {
        return driver;
    }


    public WindowManager getWindowManager() {
        return new WindowManager(driver);
    }

    /**
     * set chrome driver property
     */
    private static void setChromeDriverProperty() {
        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, User.CHROME_DRIVER_PATH);
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
    }

    /**
     * @return Chrome driver options
     */
    private static ChromeOptions getChromeOptions() {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-notifications");
        options.addArguments("--ignore-certificate-errors");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return options;
    }
}
