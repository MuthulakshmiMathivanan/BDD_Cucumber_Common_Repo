package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.After;
import io.cucumber.java.en.*;

public class QALoginStepDef {
	
WebDriver driver = new ChromeDriver();

	@Given("the user should be in login page")
	public void the_user_should_be_in_login_page() throws InterruptedException {

		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement myaccount = driver.findElement(By.xpath("//span[text()='My Account']/parent::a"));
		Actions action = new Actions(driver);
		action.moveToElement(myaccount).perform();
		myaccount.click();
		driver.findElement(By.xpath("//li//a[text()='Login']")).click();
	}
	@When("the user enter the username {string} and password {string}")
	public void the_user_enter_the_username_and_password(String username, String password) {
	  	driver.findElement(By.xpath("//div//input[@id='input-email']")).sendKeys(username);
		driver.findElement(By.xpath("//div//input[@id='input-password']")).sendKeys(password);
	}
	@When("the user press the login button")
	public void the_user_press_the_login_button() {
	    driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	}
	@Then("it should be redirected to homepage with title {string}")
	public void it_should_be_redirected_to_homepage_with_title(String expectedTitle) {
	    String actualTitle = driver.getTitle();
	    assertEquals(expectedTitle, actualTitle);
	    driver.close();
	}

	@When("the user enters the invalid username {string} and password {string}")
	public void the_user_enters_the_invalid_username_and_password(String uName, String pWord) {
		
		driver.findElement(By.xpath("//div//input[@id='input-email']")).sendKeys(uName);
		driver.findElement(By.xpath("//div//input[@id='input-password']")).sendKeys(pWord);
	}

	@When("the user clicks on login button")
	public void the_user_clicks_on_login_button() {
		driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();	    
	}

	@Then("the user should get error message {string}")
	public void the_user_should_get_error_message(String expectedErrorMsg) {
	    String actualErrorMsg = driver.findElement(By.xpath("//div[contains(text(), 'Warning: No match')]")).getText();
	    assertEquals(expectedErrorMsg, actualErrorMsg);
	}


}
