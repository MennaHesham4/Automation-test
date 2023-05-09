package test;

import POM.MenuPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utility.ExelDataProvider;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class MenuTest extends BaseTest {

    @Test
    public void menuselcteditems() {
        login.setusername("standard_user");
        login.setpassword("secret_sauce");
        MenuPage menu = login.clickloginbutton();
        menu.addtocart();
        assertEquals("6", menu.getbuttonstatus());

    }

    @Test
    public void dropdown() {
        login.setusername("standard_user");
        login.setpassword("secret_sauce");
        MenuPage menu = login.clickloginbutton();
        menu.selectdropdown("Price (low to high)");
        assertTrue(menu.checkPrices(), "no items selected");
    }

    @Test(dataProviderClass = ExelDataProvider.class, dataProvider = "getDataExcel")
    public void checkitemnamematchprice(String itemname, String price) {
        login.setusername("standard_user");
        login.setpassword("secret_sauce");
        MenuPage menu = login.clickloginbutton();

        assertEquals(menu.getPricebyitemname(itemname), price, "not match ");

    }
}
