package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.SauceDemoelement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceDemoPractice {

	WebDriver driver = new ChromeDriver();

	SauceDemoelement sauce = new  SauceDemoelement(driver);


	@Given("User launch The Application")
	public void user_launch_the_application() {

		driver.get("https://www.saucedemo.com/");

	}


	@When("User Enter The Username In Username Filed")
	public void user_enter_the_username_in_username_filed() {

		sauce.user_name().sendKeys("standard_user");

	}


	@When("User Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {

		sauce.password().sendKeys("secret_sauce");

	}


	@Then("User Click On The Login and navigate to the home page.")
	public void user_click_on_the_login_and_navigate_to_the_home_page() {

		sauce.login_button().click();

	}

	






}
