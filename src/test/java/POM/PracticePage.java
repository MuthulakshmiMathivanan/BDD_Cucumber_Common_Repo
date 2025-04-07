package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PracticePage {
	
	public static WebDriver driver;

	@FindBy (xpath="//*[@value='radio3']")

	private WebElement radio_button;

	@FindBy(xpath = "//input[@placeholder='Type to Select Countries']")

	private WebElement input_country;

	@FindBy(xpath = "//select[@id='dropdown-class-example']")

	private WebElement dropdown;
	
	@FindBy(xpath = "//input[contains(@value,'option3')]")
	
	private WebElement checkbox;
	
	@FindBy(xpath = "//*[@id=\"openwindow\"]")
	
	private WebElement windowhandel;
	
	@FindBy(xpath = "\"//*[@id=\\\"opentab\\\"]\"")
	
	private WebElement swithtab;
	
	@FindBy(xpath = "\"//*[@id=\\\"name\\\"]\"")
	
	private WebElement enteryourname;
	
	
	
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement radio_button() {
		return radio_button;
	}

	public WebElement input_country() {
		return input_country;
	}

	public WebElement dropdown() {
		return dropdown;
	}
	
	public WebElement checbox() {
		return checkbox;
	}
	
	public WebElement windowhandel() {
		return windowhandel;
	}
	
	public WebElement swithtab() {
		return swithtab;
	}
	
	public WebElement enteryourname() {
		return enteryourname;
	}
	
	public  PracticePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
