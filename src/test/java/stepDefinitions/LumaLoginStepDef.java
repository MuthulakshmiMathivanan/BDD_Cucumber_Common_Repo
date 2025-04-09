package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.LumaLoginPage;
import io.cucumber.java.en.*;

public class LumaLoginStepDef {
	
	
	WebDriver driver = new ChromeDriver();

	LumaLoginPage login = new LumaLoginPage(driver);
	
	@Given("User be in login page")
	public void user_be_in_login_page() {
		login.clickSignInLink();
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String username, String password) {
	    login.enterEmail(username);
	    login.enterPassword(password);
		
	}
	@When("Click on Sign In button")
	public void click_on_sign_in_button() {
		login.clickSignInButton();
	    
	}
	@Then("User should navigate to {string}")
	public void user_should_navigate_to(String AcutalTitle) {
	    @Nullable
		String ExpcetedTitle = login.getTitle();
	    assertEquals(AcutalTitle, ExpcetedTitle);
		System.out.println(AcutalTitle);
	}

}
