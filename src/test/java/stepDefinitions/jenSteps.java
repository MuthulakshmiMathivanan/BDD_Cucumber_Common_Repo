package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class jenSteps {
    WebDriver driver = new ChromeDriver();
   


    @Given("I enter the shops login url of domain")
public void i_enter_the_shops_login_url_of_domain() {
    driver.get("https://demowebshop.tricentis.com/login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
}
@When("I enter customer login credential")
public void i_enter_customer_login_credential() {
   WebElement emailLogin = driver.findElement(By.id("Email"));
    WebElement pswLogin = driver.findElement(By.id("Password"));
    emailLogin.sendKeys("test@gamsil.com");
    pswLogin.sendKeys("test123");
    WebElement loginButton = driver.findElement(By.cssSelector(".button-1.login-button"));
    loginButton.click();
    System.out.println("Login Successfully");
}
@Then("I can login shops successfully")
public void i_can_login_shops_successfully() {
    driver.quit();
}
    
}
