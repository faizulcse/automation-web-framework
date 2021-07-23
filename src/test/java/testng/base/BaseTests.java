package testng.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utils.EventReported;
import utils.Links;
import utils.User;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

public class BaseTests {

    private static EventFiringWebDriver driver;
    protected static HomePage homePage;

    @BeforeClass
    public static void setUp() {
        setChromeDriverProperty();
        driver = new EventFiringWebDriver(new ChromeDriver(getChromeOptions()));
        driver.register(new EventReported());
        goHome();
        homePage = new HomePage(driver);
    }

    @BeforeMethod
    public static void goHome() {
        driver.get(Links.HOME);
    }

    /**
     * Take fail test screenshot
     *
     * @param result
     */
    @AfterMethod
    public void recordFailure(ITestResult result) {
        if (ITestResult.FAILURE == result.getStatus()) {
            TakesScreenshot camera = driver;
            File screenshot = camera.getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshot, new File(User.SCREENSHOT_FOLDER + result.getName() + ".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

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
        options.addArguments("--disable-notifications");
        options.addArguments("--ignore-certificate-errors");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        return options;
    }
}
