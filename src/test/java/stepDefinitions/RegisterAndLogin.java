package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterAndLogin {
	WebDriver driver;
	
	@Given("I want to Register a new user in ParaBank Website")
	public void i_want_to_register_a_new_user_in_para_bank_website() {
		 WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://parabank.parasoft.com/parabank/register.htm");
	        
	}

	@When("I log in with the registered credentials")
	public void i_log_in_with_the_registered_credentials() {
	   
	}

	@Then("I should be successfully logged in")
	public void i_should_be_successfully_logged_in() {
	   
	}




}
