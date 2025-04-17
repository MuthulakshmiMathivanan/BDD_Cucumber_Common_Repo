package stepDefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThreeTypeOfAlerts {
    WebDriver driver = new ChromeDriver();

    @Given("user lauch the letcode automation page")
public void user_lauch_the_letcode_automation_page() {

    driver.get("https://letcode.in/alert");
}
@When("User click the simple alert")
public void user_click_the_simple_alert() {
    	WebElement simpleAlert= driver.findElement(By.id("accept"));
		
		simpleAlert.click();
		 
		//Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		
		String text= alert.getText();
		
		System.out.println("Alert text is " + text);
		 
		alert.accept();
    
}
@When("User click confirm alert")
public void user_click_confirm_alert() {
    WebElement confirmAlert= driver.findElement(By.id("confirm"));
		
    confirmAlert.click();
    
    Alert alert2 = driver.switchTo().alert();
    
    String text2= alert2.getText();
    
    System.out.println("Confirm alert text is " + text2);
    
    //Thread.sleep(3000);
    
    alert2.dismiss();
}
@Then("A confirmation popup should appear")
public void a_confirmation_popup_should_appear() {

    WebElement promptAlert= driver.findElement(By.id("prompt"));
    promptAlert.click();
		
    Alert alert3= driver.switchTo().alert();
    
    alert3.sendKeys("raj");
    
    alert3.accept();

    driver.close();
   
}

}
