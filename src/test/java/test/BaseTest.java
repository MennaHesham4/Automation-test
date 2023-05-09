package test;

import POM.Login;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
    private WebDriver driver;
    protected  Login login;

@BeforeClass
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qa-challenge.codesubmit.io/inventory.html");
        //driver.quit();
     login=new Login(driver);
    }
}
