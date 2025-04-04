package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenWindow {
    WebDriver driver= new ChromeDriver();

@Given("I enter into the Academy Domain of Rahul")
public void i_enter_into_the_academy_domain_of_rahul() {
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();  
    driver.getTitle();
}

@When("I have chosen the option for community poll")
public void i_have_choosen_the_option_for_community_poll() {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement PollText = wait.until(ExpectedConditions.elementToBeClickable(By.id("pollanswers-1")));
    PollText.click();
}
@Then("I navigated to that window")
public void i_navigated_to_that_window() {
    driver.quit();
}
}
