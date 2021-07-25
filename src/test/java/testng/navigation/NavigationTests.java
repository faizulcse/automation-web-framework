package testng.navigation;

import org.testng.annotations.Test;
import testng.base.BaseTests;

import static org.testng.Assert.assertEquals;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator() {
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().refreshPage();
        getWindowManager().goForward();
        getWindowManager().goTo("https://google.com/");
        assertEquals(getDriver().getTitle(), "Google", "Title is incorrect");
    }

    @Test
    public void testSwitchTab() {
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab("New Window");
        assertEquals(getDriver().getTitle(), "New Window", "Title is incorrect");
    }
}
