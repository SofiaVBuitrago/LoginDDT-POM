package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginDDT {
    WebDriver driver = new EdgeDriver();
    @Given("The user is on the page")
    public void the_user_is_on_the_page() {

        String EdgePath = "C:\\Users\\sofia.buitrago\\Documents\\LoginDDt\\src\\test\\resources\\Drivers\\msedgedriver.exe";
        System.setProperty("webdriver.edger.driver", EdgePath);
        String url = "https://www.saucedemo.com/";
        driver.navigate().to(url);
    }
    @When("^the user types the (.*) and the (.*)$")
    public void the_user_types_the_visual_user_and_the_secret_sauce(String username, String password) {
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

    }
    @Then("the user is able to log in")
    public void the_user_is_able_to_log_in() {
        System.out.println("We are in ");
    }
}
