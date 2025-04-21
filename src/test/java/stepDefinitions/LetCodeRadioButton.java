package stepDefinitions;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeRadioButton {

    WebDriver driver = new ChromeDriver();

@Given("user lauch the letcode radio button automation page")
public void user_lauch_the_letcode_radio_button_automation_page() {
	 WebDriverManager.chromedriver().setup();
    driver.get("https://letcode.in/radio");
    
}

@When("User get the Usernchecked button")
public void user_get_the_usernchecked_button() {
    	WebElement Unchecked= driver.findElement(By.id("foo"));

		Boolean Uncheckedresult= Unchecked.isSelected();

		System.out.println("Should be false" + " " + Uncheckedresult);
    
}

@When("User get the Checked button")
public void user_get_the_checked_button() {

    WebElement Checked= driver.findElement(By.id("notfoo"));

    Boolean CheckedResult= Checked.isSelected();

    System.out.println("Should be true" + " " + CheckedResult);
   
}

@Then("User get the Selectanyone of the button")
public void user_get_the_selectanyone_of_the_button() {

    WebElement Selectanyone= driver.findElement(By.id("no"));
		
    Selectanyone.click();
   
}

}
