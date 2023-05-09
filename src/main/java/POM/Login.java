package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    private WebDriver driver;
    private By user = By.id("user-name");
    private By pass = By.id("password");
    private By loginbutton = By.id("login-button");

    public  Login (WebDriver driver){
     this.driver=driver;
 }

    public void setusername (String username)
    {
        driver.findElement(user).sendKeys(username);
    }
    public void setpassword (String password){
        driver.findElement(pass).sendKeys(password);
    }
    public MenuPage clickloginbutton (){
        driver.findElement(loginbutton).click();
        return new MenuPage (driver);
    }


}