package cucumber.stepdefs;

import cucumber.TestSetup;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends TestSetup {
    /**
     * This method start the Application
     *
     * @param scenario Test case scenario
     */
    @Before
    public static void setUp(Scenario scenario) {
        TestSetup.launchApplication();
    }

    /**
     * This method stop the Application
     *
     * @param scenario Test case scenario
     */
    @After
    public static void tearDown(Scenario scenario) {
        TestSetup.closeBrowser();
    }
}
