package stepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticePage {


 
	WebDriver driver; 

	POM.PracticePage practice; 

	@Given("user lauch the automation practice")
	public void user_lauch_the_automation_practice() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		practice = new POM.PracticePage(driver);
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

	}

	@When("User select the radio button")
	public void user_select_the_radio_button() {

		practice.checbox().click();

	}


	@When("User send the country details")
	public void user_send_the_country_details() {

		practice.input_country().sendKeys("India");

	}
	@When("User select the drop down box")
	public void user_select_the_drop_down_box() {

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));

		Select select = new Select(dropdown);

		for (WebElement option : select.getOptions()) {
		    if (option.getText().contains("Option3")) {
		        option.click();
		        break;
		    }

		WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@value,'option1')]"));
		WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@value,'option2')]"));
		WebElement checkbox3 = driver.findElement(By.xpath("//input[contains(@value,'option3')]"));

		if(checkbox1.isEnabled()){
			checkbox1.click();
			checkbox2.click();
			checkbox3.click();
		}}

	}
	@When("User navigate to the child window")
	public void user_navigate_to_the_child_window() {

		String defaultwindow= driver.getWindowHandle();

		WebElement openwindow=	driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));

		openwindow.click();	

		Set<String> allwindows= driver.getWindowHandles();

		for (String childwindow : allwindows) {

			driver.switchTo().window(defaultwindow);

		}

	}
	@When("User navigate to the default window")

	public void user_navigate_to_the_default_window() {

		String childwindow= driver.getWindowHandle();

		WebElement opentab= driver.findElement(By.xpath("//*[@id=\"opentab\"]"));

		opentab.click();

		Set<String> multiplewindows= driver.getWindowHandles();

		for (String childwindow1 : multiplewindows) {

			driver.switchTo().window(childwindow);

		}

	}
	@Then("user send the input value")
	public void user_send_the_input_value() {

		WebElement enteryourname= driver.findElement(By.xpath("//*[@id=\"name\"]"));

		enteryourname.sendKeys("raj");
		
		driver.quit();

	}


}
