package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class UIAction {
    WebDriver driver;

    public void sendkeyaction (String element, String txt) {
        driver.findElement(By.id(element)).sendKeys(txt);
    }
    public void clickaction (String element) {
        driver.findElement(By.id(element)).click();
    }
    public String gettextaction (String element) {
        return driver.findElement(By.id(element)).getText();
    }


    public void selectdropdownaction(By element, String option) {
        Select select = new Select(driver.findElement(element));
        select.selectByVisibleText(option);

    }

    /**  find element fun take 2 strings and return webelement + switch case
     to ignore mistakes in input use enum locator, xpath, id, name
     * import static BrowserActions.driver
     */


}

