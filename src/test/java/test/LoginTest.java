package test;

import POM.MenuPage;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {
    @Test
    public void testsuccesslogin (){

        login.setusername("standard_user");
        login.setpassword("secret_sauce");
       MenuPage menu =  login.clickloginbutton();

         assertTrue(menu.gettext().contains("Sauce Labs Backpack"),"login fail");
    }
}
