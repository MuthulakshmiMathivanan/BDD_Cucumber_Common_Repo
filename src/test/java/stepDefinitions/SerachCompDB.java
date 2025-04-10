package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SerachCompDB {
    WebDriver driver=new ChromeDriver();
    @Given("I enter the Search url of ComputerDatabase")
public void i_enter_the_search_url_of_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://computer-database.gatling.io/computers?f=SA");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
    
}
@When("I enter the ComputerDatabase name")
public void i_enter_the_computer_database_name() {
    // Write code here that turns the phrase above into concrete actions
     WebElement compname=driver.findElement(By.id("searchbox"));
    compname.sendKeys("");
    WebElement searchcompdb=driver.findElement(By.id("searchsubmit"));
    searchcompdb.click();
    
}
@Then("I can able to Search ComputerDatabase")
public void i_can_able_to_search_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    
}
}
