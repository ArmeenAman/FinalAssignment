package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import Basepackage.Baseclass;

import java.util.concurrent.TimeUnit;

public class LoginPage extends Baseclass{

public LoginPage(WebDriver driver){

    super(driver);
}
    public void SauceLabUrl(){

        driver.get("https://www.saucedemo.com/");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void LoginDetails(String username, String password) {

        WebElement email = driver.findElement(By.id("user-name"));
        email.sendKeys(username);
        WebElement pw = driver.findElement(By.id("password"));
        pw.sendKeys(password);
    }

    public void LoginButton(){

        WebElement LgnBtn = driver.findElement(By.id("login-button"));
        LgnBtn.click();
    }
}
