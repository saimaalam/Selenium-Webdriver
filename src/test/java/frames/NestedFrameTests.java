package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class NestedFrameTests extends BaseTests {
    @Test
    public void testFrameText() {
        var nestedFramesPage = homePage.clickFramesPage().clickNestedFrames();
        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Left frame text incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Bottom frame text incorrect");
    }
}
