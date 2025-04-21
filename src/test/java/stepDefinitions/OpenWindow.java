package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenWindow {
    WebDriver driver= new ChromeDriver();

@Given("I enter into the Academy Domain of Rahul")
public void i_enter_into_the_academy_domain_of_rahul() {
	 WebDriverManager.chromedriver().setup();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize(); 
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   
    driver.getTitle();
}
@When("I click the OpenWindow button")
public void i_click_the_open_window_button() {
    WebElement openWindowButton = driver.findElement(By.xpath("//button[text()='Open Window']"));
    openWindowButton.click();
}
@Then("I navigated to that window")
public void i_navigated_to_that_window() {
    driver.quit();
}
}
