package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.AutomationExercise;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUpWithExistingEmail {
	
	WebDriver driver;
	POM.AutomationExercise AE;
	
	@Given("I want to launch the Automation Exercise website")
	public void i_want_to_launch_the_automation_exercise_website() {
		 // Set up WebDriver and AutomationExercise
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
        driver.get("https://automationexercise.com");
	}

	@Given("I verify I landed on the home page")
	public void i_verify_i_landed_on_the_home_page() {
	    AE.verifyHome();
	}

	@Given("I want to click on signup button")
	public void i_want_to_click_on_signup_button() {
		AE.clickSignupLogin();
		 System.out.println("Entering the correct email and password...");
	}

	@When("I enter the already existing email and name")
	public void i_enter_the_already_existing_email_and_name() {
	    WebElement email = driver.findElement(By.xpath("//input[@name='name']"));
	    email.sendKeys("Test");
	    WebElement pass = driver.findElement(By.xpath("(//input[@name='email'])[2]"));
	    pass.sendKeys("demo@test.yu");
	}

	@When("click on signup button")
	public void click_on_signup_button() {
		 WebElement Signup = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
	        Signup.click();
	        
	}

	@Then("I should see error popup stating Email already exists")
	public void i_should_see_error_popup_stating_email_already_exists() {
	    WebElement errormsg =  driver.findElement(By.xpath("//p[contains(text(),'Email Address already exist!')]"));
	    boolean error = errormsg.isDisplayed();
	    if (error) {
			System.out.println("Error message is shown");
		}
	}



}
