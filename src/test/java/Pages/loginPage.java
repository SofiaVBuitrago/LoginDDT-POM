package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class loginPage {

    WebDriver driver;

    private By txt_username = By.id("user-name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login-button");

    private By txt_appLogo = By.xpath("//div[@class='app_logo']");

    public loginPage(WebDriver driver){

       this.driver = driver;

    }

    public void enterUsername (String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword (String password){
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLoginBtn (){
        driver.findElement(btn_login).click();
    }

    public void checkAppLogoIsDisplayed(){
        driver.findElement(txt_appLogo).isDisplayed();
    }

   /* public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }*/
}
