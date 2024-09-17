package keys;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.KeyPressesPage;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests {

    @Test
    public void testBackspace(){
       KeyPressesPage keyPressesPage= homePage.clickKeyPresses();
       keyPressesPage.enterText("A" + Keys.BACK_SPACE);
       assertEquals(keyPressesPage.getResult(),"You entered: BACK_SPACE");
    }
    @Test
    public void testPi(){
        KeyPressesPage keyPressesPage= homePage.clickKeyPresses();
        keyPressesPage.enterPi();
        assertEquals(keyPressesPage.getResult(),"You entered: 6","Correct value is not showing");
    }

}
