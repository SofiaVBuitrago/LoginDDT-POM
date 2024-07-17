package StepDefinitions;

import PageFactory.LoginPage_PF;
import Pages.loginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class LoginDDT_PF {
    WebDriver driver = new EdgeDriver() ;
    LoginPage_PF login;
    @Given("The user is on the page")
    public void the_user_is_on_the_page() {
        System.out.println("Im using the PAGE FACTORY");

        String EdgePath = "C:\\Users\\sofia.buitrago\\Documents\\LoginDDt\\src\\test\\resources\\Drivers\\msedgedriver.exe";
        System.setProperty("webdriver.edger.driver", EdgePath);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        String url = "https://www.saucedemo.com/";
        driver.navigate().to(url);
    }
    @When("^the user types the (.*) and the (.*)$")
    public void the_user_types_the_visual_user_and_the_secret_sauce(String username, String password) {

        login = new LoginPage_PF(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        login.clickLoginBtn();


    }
    @Then("the user is able to log in")
    public void the_user_is_able_to_log_in() {
        System.out.println("We are in ");

    }
}
