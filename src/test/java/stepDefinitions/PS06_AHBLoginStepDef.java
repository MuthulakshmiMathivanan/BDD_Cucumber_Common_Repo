package stepDefinitions;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.*;

public class PS06_AHBLoginStepDef {
    
    WebDriver driver = new ChromeDriver();
    
	@Given("User is on the Adactin Login page")
	public void user_is_on_the_adactin_login_page() {
        driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
        driver.manage().window().maximize();
		System.out.println("User is on the Login page");
	}

	@When("User enters the valid {string} and {string} for the Adactin site")
	public void user_enters_the_valid_and_for_the_adactin_site(String username, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}

	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
	}

	@Then("User should be redirected to Adactin Homepage")
	public void user_should_be_redirected_to_adactin_homepage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement welcome = driver.findElement(By.xpath("//td[@class='welcome_menu']"));
		String text = welcome.getText();
		System.out.println(text);
	}

	@When("User enters the invalid {string} and {string} for the Adactin site")
	public void userEntersTheInvalidAndForTheAdactinSite(String username, String password) {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	@Then("It should show the error msg")
	public void itShouldShowTheErrorMsg() {
		WebElement errorMessage = driver.findElement(By.xpath("//div[@class='auth_error']/b"));
		String actualMessage = errorMessage.getText();
        System.out.println(actualMessage);
	}
	
	@Then("It should show the error msg as Enter Username or Enter password")
	public void itShouldShowTheErrorMsgAsEnterUsernameOrEnterPassword() {
		//xpath must be string so creating this way, storing xpath in string and use in find element
		String usernameErrorXPath = "//span[@id='username_span' and contains(@class, 'login_error')]";
		String passwordErrorXPath = "//span[@id='password_span' and contains(@class, 'login_error')]";

		try {
		    WebElement usernameError = driver.findElement(By.xpath(usernameErrorXPath));
		    System.out.println("Username Error: " + usernameError.getText());
		} catch (NoSuchElementException e) {
		    System.out.println("Username error not found.");
		}

		try {
		    WebElement passwordError = driver.findElement(By.xpath(passwordErrorXPath));
		    System.out.println("Password Error: " + passwordError.getText());
		} catch (NoSuchElementException e) {
		    System.out.println("Password error not found.");
		}
        driver.quit();
	}
    

}