package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CompDBCancel {
    
    WebDriver driver=new ChromeDriver();
    
    @Given("I enter the cancel url of ComputerDatabase")
public void i_enter_the_cancel_url_of_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    driver.get("https://computer-database.gatling.io/computers?f=mas");
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  
    driver.getTitle();
    }
@When("I enter the ComputerDatabase Info")
public void i_enter_the_computer_database_info() {
    // Write code here that turns the phrase above into concrete actions
    WebElement addnewComputer=driver.findElement(By.id("add"));
    addnewComputer.click();
    WebElement compname=driver.findElement(By.id("name"));
    compname.sendKeys("Acer202678");
    WebElement cancelcomdb=driver.findElement(By.xpath("//a[@href='/computers']"));
    cancelcomdb.click();
}
@Then("I can able to cancel ComputerDatabase")
public void i_can_able_to_cancel_computer_database() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Cancel Successfuly for ComputerDatabase");
}
}
