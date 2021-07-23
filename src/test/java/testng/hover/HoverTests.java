package testng.hover;

import testng.base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        HoversPage hoversPage = homePage.clickHovers();
        for (int i = 1; i < 4; i++) {
            HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(i);
            assertTrue(figureCaption.isCaptionDisplayed(), "Caption not displayed");
            assertEquals(figureCaption.getTitle(), "name: user" + i, "Caption title incorrect");
            assertEquals(figureCaption.getLinkText(), "View profile", "Caption link text incorrect");
        }
    }
}
