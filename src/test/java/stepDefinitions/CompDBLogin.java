package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompDBLogin {
     WebDriver driver = new ChromeDriver();
@Given("I enter the url of domain CompDBlogin")
public void i_enter_the_url_of_domain_CompDBlogin() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://demowebshop.tricentis.com/Login");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
   }
@When("I enter customer credentials of CompDBlogin")
public void i_enter_customer_credentials_of_CompDBlogin() {
    // Write code here that turns the phrase above into concrete actions
    
        WebElement Email=driver.findElement(By.xpath("//input[@id='Email']"));
        Email.sendKeys("Sixface200490@gmail.com");
        WebElement Password=driver.findElement(By.xpath("//input[@id='Password']"));
        Password.sendKeys("Password@200490");
        WebElement Login=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        Login.click();
        
  
}
@Then("I can login domain of CompDBlogin successfully")
public void i_can_login_domain_of_CompDBlogin_successfully() {
    // Write code here that turns the phrase above into concrete actions
    //WebElement message = driver.findElement(By.id("message"));
       // message.getText();
       boolean isLoginSuccessful=driver.findElement(By.linkText("Log out")).isDisplayed();
       if(isLoginSuccessful)
       {
        System.out.println("Login successful!");
       }
       else
       {
        System.out.println("Login failed!");
       }
        driver.quit();
   
}
}
