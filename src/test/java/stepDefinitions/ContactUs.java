package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.AutomationExercise;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {
	WebDriver driver;
	POM.AutomationExercise AE;
	
	
	@Given("I want to launch the website to check the contact form")
	public void i_want_to_launch_the_website_to_check_the_contact_form() {
		  // Set up WebDriver and AutomationExercise
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
        driver.get("https://automationexercise.com");
	}
	
	@Given("I want to verify if we are on the home page")
	public void i_want_to_verify_if_we_are_on_the_home_page() {
	    AE.verifyHome();
	}

	@When("I click on contact us form")
	public void i_click_on_contact_us_form() {
	    AE.clickContactUs();
	}

	@When("Enter the relevant contents")
	public void enter_the_relevant_contents() {
	   WebElement contactName =  driver.findElement(By.xpath("//input[@name='name']"));
	   contactName.sendKeys("Test");
	   WebElement contactEmail =  driver.findElement(By.xpath("//input[@name='email']"));
	   contactEmail.sendKeys("Test@test.com");
	   WebElement contactSubject =  driver.findElement(By.xpath("//input[@name='subject']"));
	   contactSubject.sendKeys("For testing functions");
	 
	   
	}

	@When("click on the submit button")
	public void click_on_the_submit_button() {
		  WebElement SubmitButton =  driver.findElement(By.xpath("//input[@name='submit']"));
		   SubmitButton.sendKeys("For testing functions");
	}

	@Then("I have to handle the alert")
	public void i_have_to_handle_the_alert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());

		// Switch to the alert
		Alert alert = driver.switchTo().alert();

		// Print alert text
		System.out.println("Alert text: " + alert.getText());

		// Accept the alert
		alert.accept();
	}

	@Then("check the success message")
	public void check_the_success_message() {
	   WebElement SuccessMessage =  driver.findElement(By.xpath("(//div[contains(text(),'Success! Your details have been submitted successfully.')])[1]"));
	  boolean s =  SuccessMessage.isDisplayed();
	  if (s) {
		System.out.println("The success message is shown!");
	}
	
	}



}
