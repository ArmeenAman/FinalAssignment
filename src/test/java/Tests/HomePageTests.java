package Tests;

import Basepackage.Basetest;
import Objects.LoginPage;
import Objects.AboutPage;
import Objects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTests extends Basetest{
    LoginPage SaucelabLoginPage;
    HomePage homePage;
    AboutPage aboutPage;

    @BeforeMethod
    public void setUp() {

        driver.get("https://www.saucedemo.com/");
        SaucelabLoginPage = new LoginPage(driver);
        SaucelabLoginPage.LoginDetails("standard_user", "secret_sauce");
        SaucelabLoginPage.LoginButton();
        homePage = new HomePage(driver);


    }
    @Test(priority = 1)
    public void verifyItemAdded() {
        homePage.AddedToCart();

    }
    @Test (priority = 2)
    public void verifyItemRemoved(){
        homePage.RemoveFromCart();
    }

    @Test (priority = 3)
    public void verifySidePane(){
        homePage.VerifyOpenMenu();

    }
//    @Test (priority = 4)
//    public void verifyLogout(){
//        homePage.LoggingOut();
//    }

}
