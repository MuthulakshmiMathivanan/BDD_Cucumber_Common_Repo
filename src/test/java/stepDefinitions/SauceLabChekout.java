package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.SauceDemoelement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SauceLabChekout {
	
	WebDriver driver = new ChromeDriver();

	SauceDemoelement sauce = new  SauceDemoelement(driver);
	
	
	@Given("User launch The Application")
public void user_launch_the_application() {
		 WebDriverManager.chromedriver().setup();
	driver.get("https://www.saucedemo.com/");
		sauce.user_name().sendKeys("standard_user");
		sauce.password().sendKeys("secret_sauce");
		sauce.login_button().click();
		WebElement backpack= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
		  WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
	        assertEquals("1", cartBadge.getText());
	        WebElement cartclick= driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
			cartclick.click();
			WebElement chekout= driver.findElement(By.xpath("//button[contains(@id,'checkout')]"));
			chekout.click();
			
   
}

@When("User input the first name")
public void user_input_the_first_name() {
	WebElement firstname= driver.findElement(By.id("first-name"));
	firstname.sendKeys("raja");
    
}

	
	@When("User input the last name")
	public void user_input_the_last_name() {
		
		WebElement lastname= driver.findElement(By.id("last-name"));
		lastname.sendKeys("sekar");
	   
	}
	
	@When("User input the Zipcode")
	public void user_input_the_zipcode() {
		
		WebElement Zipcode = driver.findElement(By.id("postal-code"));
		Zipcode.sendKeys("109876");
	   
	}
	
	@When("User Click the continue button")
	public void user_click_the_continue_button() {
		
		WebElement cont= driver.findElement(By.id("continue"));
		cont.click();
	    
	}
	@Then("User Click finish button.")
	public void user_click_finish_button() {
		
		WebElement finish= driver.findElement(By.id("finish"));
		finish.click();
	   
	}

}
