package actions;

import org.openqa.selenium.WebDriver;

public class BrowserAction {
 private WebDriver driver;
    public BrowserAction(WebDriver driver) {
        this.driver = driver;
    }

    public void goback() {
        driver.navigate().back();
    }

    public void forward() {
        driver.navigate().forward();
    }

    public void refresh() {
        driver.navigate().refresh();
    }

    public void gotourl (String url) {
        driver.navigate().to(url);
    }
/**
 * add static driver after define browser types
 */
}


