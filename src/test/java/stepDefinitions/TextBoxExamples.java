package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TextBoxExamples {

    WebDriver driver = new ChromeDriver();

@Given("user lauch the letcode edit page")
public void user_lauch_the_letcode_edit_page() {

    driver.get("https://letcode.in/edit");
    
}


@When("User enter the fullname")
public void user_enter_the_fullname() {

    	WebElement fullname =driver.findElement(By.id("fullName"));

		fullname.sendKeys("raj");
    
}


@When("User append the text")
public void user_append_the_text() {

    WebElement appendtext =driver.findElement(By.xpath("//*[@id=\"join\"]"));

	appendtext.sendKeys(" raj",Keys.TAB);
   
}
@When("User get the text box value")
public void user_get_the_text_box_value() {

    WebElement gettextbox = driver.findElement(By.id("getMe"));

    String value= gettextbox.getDomAttribute("value");

    System.out.println(value);

}


@When("User clear the text")
public void user_clear_the_text() {

    WebElement clearbox= driver.findElement(By.id("clearMe"));

	clearbox.clear();
    
}


@When("User check the box is disabled")
public void user_check_the_box_is_disabled() {
    WebElement disabledbox= driver.findElement(By.id("noEdit"));

    boolean enabled= disabledbox.isEnabled();

    System.out.println(enabled);
}
@Then("User check is readonly")
public void user_check_is_readonly() {

    WebElement readonly =driver.findElement(By.id("dontwrite"));

    String values= readonly.getDomAttribute("readonly");

    System.out.println(values);

    driver.quit();
    
}


}
