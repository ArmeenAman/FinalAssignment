package Tests;

import Basepackage.Basetest;
import Objects.HomePage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Objects.LoginPage;
import Objects.AboutPage;




public class AboutPageTests extends Basetest {

    LoginPage SaucelabLoginPage;
    HomePage homePage;
    AboutPage aboutPage;
    @BeforeMethod
    public void setUp() {
        SaucelabLoginPage = new LoginPage(driver);
        LoginPage SaucelabLoginPage = new LoginPage(driver);
        SaucelabLoginPage.LoginDetails("standard_user", "secret_sauce");
        SaucelabLoginPage.LoginButton();
        aboutPage = new AboutPage(driver);
        homePage.VerifyOpenMenu();

    }

    @Test (priority = 1)
    public void VerifyTitleOfAboutPage(){
        aboutPage = aboutPage.AboutOptionClick();
        String title = aboutPage.AboutPageTitle();
        Assert.assertEquals(title , "Sauce Labs: Cross Browser Testing, Selenium Testing & Mobile Testing");
    }

    @Test (priority = 2)
    public void VerifyTryItFreeButton(){
        aboutPage = aboutPage.AboutOptionClick();
        aboutPage.VerifyTryItFree();
        Assert.assertEquals(driver.getCurrentUrl(),"https://saucelabs.com/sign-up");
        System.out.println(driver.getCurrentUrl() + " is the enterprise URL");
    }

    @Test (priority = 3)
    public void VerifySearch(){
        aboutPage = aboutPage.AboutOptionClick();
        aboutPage.VerifySearchBar();
        //searchPage = aboutPage.VerifySearchBar("Testing");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}






