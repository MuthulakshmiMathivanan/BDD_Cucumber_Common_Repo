package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.AutomationExercise;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTestcases {
	WebDriver driver;
	 POM.AutomationExercise AE;
	
	@Given("I want to launch the automation website")
	public void i_want_to_launch_the_automation_website() {
		  // Set up WebDriver and AutomationExercise
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
        driver.get("https://automationexercise.com");
	}

	@Given("i want to check the home page")
	public void i_want_to_check_the_home_page() {
		AE.verifyHome();
	}

	@When("I click on the testcases page")
	public void i_click_on_the_testcases_page() {
	    AE.clickontestcase();
	}

	@When("verify if we are on the testcases page")
	public void verify_if_we_are_on_the_testcases_page() {
	    AE.verifytestcase();
	}

	@Then("I validate if the testcases are present")
	public void i_validate_if_the_testcases_are_present() {
	    AE.verifytestcase1();
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    driver.quit();
	}



}
