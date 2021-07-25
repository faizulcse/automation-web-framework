package testng.javascript;

import pages.InfiniteScrollPage;
import testng.base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class JavaScriptTests extends BaseTests {
    @Test
    public void testScrollToFifthParagraph() {
        InfiniteScrollPage infiniteScroll = homePage.clickInfiniteScroll();
        infiniteScroll.scrollToParagraph(50);
        assertTrue(infiniteScroll.isParagraphDislplayed(50),"Scroll is not working");
    }
}
