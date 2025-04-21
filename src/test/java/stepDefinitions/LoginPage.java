package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import POM.AutomationExercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class LoginPage {
    WebDriver driver;
    POM.AutomationExercise AE;

    @Before
    public void setUp() {
        // Set up WebDriver and AutomationExercise
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        AE = new AutomationExercise(driver);  // Initialize AE with WebDriver
        driver.get("https://automationexercise.com");
    }

    @Given("I want to launch the automation exercise website")
    public void i_want_to_launch_the_automation_exercise_website() {
        System.out.println("Opening the automation exercise website...");
    }

    @Given("I verify that the home page is visible")
    public void i_verify_that_the_home_page_is_visible() {
        System.out.println("Verifying that the home page is visible...");
        AE.verifyHome();  // Now AE is properly initialized
    }

    @When("I click on the signup\\/login button")
    public void i_click_on_the_signup_login_button() {
        System.out.println("Clicking on the signup/login button...");
        AE.clickSignupLogin();  // Now AE is properly initialized
    }

    @When("I verify that the {string} section is visible")
    public void i_verify_that_the_section_is_visible(String section) {
        System.out.println("Verifying that the '" + section + "' section is visible...");
        AE.verifyNewUserSignupVisible();  // Now AE is properly initialized
    }

    @When("I enter the correct email address and password")
    public void i_enter_the_correct_email_address_and_password() {
        System.out.println("Entering the correct email and password...");
        AE.signupEmail.sendKeys("demo@test.yu");
        AE.password.sendKeys("YuTest");
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        WebElement login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
        login.click();
        System.out.println("Clicking the login button...");
    }

    @Then("I verify that the username is displayed as logged in")
    public void i_verify_that_the_username_is_displayed_as_logged_in() {
        AE.verifyLoggedInUsernameVisible();  // Now AE is properly initialized
        System.out.println("Verifying that the username is displayed as logged in...");
    }

    @Then("I check if the delete account button is visible")
    public void i_check_if_the_delete_account_button_is_visible() {
        AE.checkDeleteAccount();  // Now AE is properly initialized
        System.out.println("Checking if the delete account button is visible...");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
