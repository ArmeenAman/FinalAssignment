package Objects;

import Basepackage.Baseclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class AboutPage extends Baseclass {

    public AboutPage(WebDriver driver){
        super(driver);
    }


    WebElement AboutTitle = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/div[1]/h1"));

    WebElement RequestDemo = driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[2]/a/button[2]"));

    WebElement SearchBarIcon = driver.findElement(By.xpath("/html/body/div[1]/header/div/div/div[3]/div/button/div/span/img"));

    WebElement SearchBar = driver.findElement(By.xpath("/html/body/div[12]/div[3]/div/div/div/div[1]/div/div/input"));

    WebElement TryItFree = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[1]/div[1]/div/div[4]/div[1]/a/button"));


    public AboutPage AboutOptionClick(){
        AboutTitle.click();
        return new AboutPage(driver);
    }

    public String AboutPageTitle(){
        return driver.getTitle();}

    public void VerifySearchBar(){
        SearchBarIcon.click();
    }
    public void VerifyTryItFree(){
        TryItFree.click();
    }

}
