package utils;

public class User {
    public static final String USER_DIR = System.getProperty("user.dir");
    public static final String LOG_FOLDER = "logs/";
    public static final String SCREENSHOT_FOLDER = "screenshots/";
    public static final String JSON_DIR_PATH = "src/main/java/api/json/";
    public static final String CHROME_DRIVER_PATH = System.getProperty("os.name").contains("Windows") ?
            "driver/chromedriver.exe" : "driver/chromedriver";

    public static final String API_KEY = System.getenv("API_KEY");
}
