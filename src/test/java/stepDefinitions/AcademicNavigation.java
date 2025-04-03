package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AcademicNavigation {

    WebDriver driver = new ChromeDriver();
@Given("I enter into the Academy Domain")
public void i_enter_into_the_academy_domain() {
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    driver.manage().window().maximize();  
    driver.getTitle();
}
@When("I click the OpenWindow Element")
public void i_click_the_open_window_element() {
    WebElement openWindowButton = driver.findElement(By.xpath("//button[text()='Open Window']"));
    openWindowButton.click();
}
@When("I navigated to another site")
public void i_navigated_to_another_site() {
    driver.get("https://www.qaclickacademy.com/");
    driver.manage().window().maximize();  
    driver.getTitle();
}
@Then("again Back to the Main URL")
public void again_back_to_the_main_url() {
    driver.quit();
}

}
