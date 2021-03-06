package testng.frames;

import testng.base.BaseTests;
import org.testng.annotations.Test;
import pages.WysiwygEditorPage;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg() {
        WysiwygEditorPage editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();

        String text1 = "Hello ";
        String text2 = "World";
        editorPage.setTextArea(text1);
        editorPage.increaseIdention();
        editorPage.setTextArea(text2);
        editorPage.decreaseIdention();
        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text from editor is incorrect");
    }
}
