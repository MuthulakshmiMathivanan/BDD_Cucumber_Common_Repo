package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceDemoelement {

	public static WebDriver driver;

	@FindBy (id = "user-name")

	private WebElement user_name;

	@FindBy (id = "password")

	private WebElement password;

	@FindBy (id = "login-button")

	private WebElement login_button;


	public WebDriver getDriver() {
		return driver;
	}

	public WebElement user_name() {
		return user_name;
	}

	public WebElement password() {
		return password;
	}

	public WebElement login_button() {
		return login_button;
	}


	public  SauceDemoelement(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}



}
