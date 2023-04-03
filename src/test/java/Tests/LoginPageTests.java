package Tests;

import Basepackage.Basetest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Objects.LoginPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginPageTests extends Basetest{

    LoginPage SaucelabLoginPage;


 @BeforeMethod
 public void setUp() {
     SaucelabLoginPage = new LoginPage(driver);

}

    @Test (priority = 1)
    public void ValidRedirection() {
        SaucelabLoginPage.SauceLabUrl();
        SaucelabLoginPage.LoginDetails("standard_user", "secret_sauce");
        SaucelabLoginPage.LoginButton();

        // Verify if user is redirected to correct URL
        assertEquals("https://www.saucedemo.com/inventory.html", driver.getCurrentUrl());

    }

    @Test (priority = 2)
    public void IncorrectCredentials() {
        SaucelabLoginPage.SauceLabUrl();

        driver.findElement(By.id("user-name")).sendKeys("abc_user");
        driver.findElement(By.id("password")).sendKeys("abc");

        SaucelabLoginPage.LoginButton();

        // Verify that the error message is displayed
        assertTrue(driver.findElement(By.cssSelector("[data-test='error']")).isDisplayed());

    }

    @Test (priority = 3)
    public void LoginPageElements(){
        SaucelabLoginPage.SauceLabUrl();

        // Verify that the login page elements are present
        assertTrue(driver.findElement(By.id("user-name")).isDisplayed());
        assertTrue(driver.findElement(By.id("password")).isDisplayed());
        assertTrue(driver.findElement(By.id("login-button")).isDisplayed());

    }

}
