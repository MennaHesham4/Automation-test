package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class MenuPage {
    private WebDriver driver;

    private By buttons = By.cssSelector(".inventory_item_price ~ button");
    private By dropdown = By.className("product_sort_container");
    private By prices = By.className("inventory_item_price");
    String sectionName;


    private By tesst = By.id("item_4_title_link");



    public MenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addtocart() {

        List<WebElement> buttons = driver.findElements(By.cssSelector(".inventory_item_price ~ button"));
        for (WebElement i : buttons) {
            i.click();
        }

    }

    public String getbuttonstatus() {
        return driver.findElement(By.cssSelector(".shopping_cart_badge")).getText();
    }


    public String gettext() {
        return driver.findElement(tesst).getText();
    }


    public void selectdropdown(String option) {
        Select select = new Select(driver.findElement(dropdown));
        select.selectByVisibleText(option);

    }

    public boolean checkPrices(){
        double[] myArray = new double[6];
        List <WebElement> element=driver.findElements(prices);
        for(int i=0;i<element.size();i++){
            myArray[i]=Double.parseDouble(element.get(i).getText().replace("$",""));
        }
        for(int i=0;i<myArray.length-1;i++){
            if(myArray[i]>myArray[i+1]){
                return false;
            }
        }
        return true;

    }
    public String getPricebyitemname(String sectionName) {
         By pricebyitemname = By.xpath(String.format("//div[text()=\"%s\"]/ancestor::div[@class=\"inventory_item_description\"]//div[@class=\"inventory_item_price\"] " ,sectionName)) ;
        return   driver.findElement(pricebyitemname).getText();
        }
/**
 * use constructor to set item name values at element locator
 * so we create independant obj every time we run the test
 */
}







