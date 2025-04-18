package stepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LetcodeDropDown {

    WebDriver driver = new ChromeDriver();

@Given("user lauch the letcode dropdown button automation page")
public void user_lauch_the_letcode_dropdown_button_automation_page() {

    driver.get("https://letcode.in/dropdowns");
   
}

@When("User get the dropdown button")
public void user_get_the_dropdown_button() {
    WebElement dropdown =driver.findElement(By.id("fruits"));
		
		Select select= new Select(dropdown);
		
		select.selectByIndex(1);
		
		//Thread.sleep(3000);
		
		select.selectByValue("2");
		
		//Thread.sleep(3000);
		
		select.selectByVisibleText("Banana");
		
		List<WebElement> listofoptions = select.getOptions();
		
		Integer size= listofoptions.size();
		
		System.out.println("Number of emlemts:" + size);
		
		dropdown.sendKeys("Pine");
  
}

@Then("User get multiselect")
public void user_get_multiselect() {

    WebElement multiselect = driver.findElement(By.id("superheros"));
		
		Select multiselectbox = new Select(multiselect);
		
		multiselectbox.selectByIndex(2);
		
		multiselectbox.selectByIndex(3);
		
		multiselectbox.selectByIndex(4);
  
}

}
