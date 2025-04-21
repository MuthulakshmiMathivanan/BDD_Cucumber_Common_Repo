package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LetCodeButton {

    WebDriver driver = new ChromeDriver();

    @Given("user lauch the letcode button automation page")
public void user_lauch_the_letcode_button_automation_page() {
    	 WebDriverManager.chromedriver().setup();
    driver.get("https://letcode.in/button");
    
}
@When("User get the location of the button")
public void user_get_the_location_of_the_button() {

    		WebElement Cordinates= driver.findElement(By.xpath("//*[@id=\"position\"]"));

		org.openqa.selenium.Point xypoint=Cordinates.getLocation();

		int xvalue= xypoint.getX();

		int yvalue= xypoint.getY();

		System.out.println("x value is : " + xvalue +  "y value is : "+ yvalue);
    
}
@When("User get the colour of the button")
public void user_get_the_colour_of_the_button() {
    WebElement color= driver.findElement(By.id("color"));

		String colourbutton= color.getCssValue("background-color");

		System.out.println("Button colour is :" + colourbutton);

		
}
@When("User get the size of the button")
public void user_get_the_size_of_the_button() {
    WebElement size= driver.findElement(By.id("property"));

		int buttonHeight= size.getSize().getHeight();

		int buttonWidth= size.getSize().getWidth();

		System.out.println("Button height is :" + buttonHeight +"   " + "Button Width is :" + buttonWidth );
    
}
@Then("A confirmation on disable button")
public void a_confirmation_on_disable_button() {
    WebElement disabledbutton= driver.findElement(By.id("isDisabled"));

    Boolean disable= disabledbutton.isEnabled();

    System.out.println(disable);

    WebElement homebutton=driver.findElement(By.id("home"));

    homebutton.click();
    
}

}
