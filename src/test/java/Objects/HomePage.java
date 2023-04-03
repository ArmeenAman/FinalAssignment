package Objects;

import Basepackage.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends Baseclass{

    public HomePage(WebDriver driver) {

        super(driver);
    }

    WebElement addtocartbtn = driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[2]/button"));
    WebElement title = driver.findElement(By.xpath(" /html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));
    WebElement remove = driver.findElement(By.xpath(" /html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div"));

    WebElement openmenu = driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[1]/div/button"));
    WebElement logout = driver.findElement(By.xpath(" //*[@id=\"logout_sidebar_link\"]"));

    WebElement about = driver.findElement(By.xpath("//a[@id='about_sidebar_link']"));

    public String getitemname() {
        return title.getText();

    }
    public void AddedToCart(){
        addtocartbtn.click();
    }
    //Remove method
    public void RemoveFromCart() {
        remove.click();
    }

    public void VerifyOpenMenu(){

        openmenu.click();
        this.wait.until(ExpectedConditions.visibilityOfElementLocated(new By.ByXPath("//a[@id='about_sidebar_link']"))).click();
    }

    public void LoggingOut(){
        logout.click();
    }


}
