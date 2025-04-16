package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM.DemoBlazePom;

public class DemoBlazeLogin {
    WebDriver driver;
    POM.DemoBlazePom demoBlaze;

    @Given("I launch the website")
    public void i_launch_the_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.demoblaze.com/");
        demoBlaze = new POM.DemoBlazePom(driver); 
        System.out.println("Website launched successfully");
    }

    @Then("Click the signup button")
    public void click_the_signup_button() {
        demoBlaze.clickSignUp(); 
    }

    @When("Fill the signup details")
    public void fill_the_signup_details() {
        demoBlaze.SignUp(); 
    }

    @When("handle the alert")
    public void handle_the_alert() {
        demoBlaze.alerthandle(); 
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
