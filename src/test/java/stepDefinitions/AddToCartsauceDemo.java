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

public class AddToCartsauceDemo {
	
	WebDriver driver = new ChromeDriver();

	SauceDemoelement sauce = new  SauceDemoelement(driver);
	
	@Given("user launch the application with credentilas")
	public void user_launch_the_application_with_credentilas() {
		driver.get("https://www.saucedemo.com/");
		sauce.user_name().sendKeys("standard_user");
		sauce.password().sendKeys("secret_sauce");
		sauce.login_button().click();
	    
	}
	
	
	@When("user click add to cart button for sauce labs BackPack")
	public void user_click_add_to_cart_button_for_sauce_labs_back_pack() {
		
		WebElement backpack= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		backpack.click();
	    
	}
	
	
	@Then("user click the cart icon and navigates to Swag labs")
	public void user_click_the_cart_icon_and_navigates_to_swag_labs() {
		
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        assertEquals("1", cartBadge.getText());
        WebElement cartclick= driver.findElement(By.xpath("//*[@id='shopping_cart_container']"));
		cartclick.click();

	}

}
