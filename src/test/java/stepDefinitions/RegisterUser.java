package stepDefinitions;

import io.cucumber.java.en.*;
import pom.AutomationExercise;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterUser {
    WebDriver driver;
    AutomationExercise AE;

    @Given("I want to launch the browser and navigate to the Automation Exercise website")
    public void i_want_to_launch_the_browser_and_navigate_to_the_automation_exercise_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com");
        AE = new AutomationExercise(driver);
    }

    @Given("I verify that the home page is visible successfully")
    public void i_verify_that_the_home_page_is_visible_successfully() {
        AE.verifyHome();
    }

    @When("I click on the Signup\\/Login button")
    public void i_click_on_the_signup_login_button() {
        AE.clickSignupLogin();
    }

    @When("I verify that the New User Signup option is available")
    public void i_verify_that_the_new_user_signup_option_is_available() {
        AE.verifyNewUserSignupVisible();
    }

    @When("I enter the name and email address")
    public void i_enter_the_name_and_email_address() {
        AE.enterNameAndEmail("YugiTest", "yugi" + System.currentTimeMillis() + "@testmail.com");
    }

    @When("I click the Signup button")
    public void i_click_the_signup_button() {
        AE.clickSignupButton();
    }

    @Then("I verify that {string} section is displayed")
    public void i_verify_that_section_is_displayed(String section) {
        AE.verifyTextVisible(section);
    }

    @Then("I fill in all the required details")
    public void i_fill_in_all_the_required_details() {
        AE.fillAccountInfo("Test@123", "10", "May", "1995", "Yugi", "Moto", "DuelCorp", 
                            "Duelist Kingdom", "New York", "Brooklyn", "11201", "9876543210");
    }

    @Then("I click the Create Account button")
    public void i_click_the_create_account_button() {
        AE.clickCreateAccount();
    }

    @Then("I verify that the account creation confirmation message is displayed")
    public void i_verify_that_the_account_creation_confirmation_message_is_displayed() {
        AE.verifyAccountCreated();
    }

    @Then("I click the Continue button")
    public void i_click_the_continue_button() {
        AE.clickContinue();
    }

    @Then("I verify that I am logged in as the registered username")
    public void i_verify_that_i_am_logged_in_as_the_registered_username() {
        AE.verifyLoggedInUsernameVisible();
    }

    @Then("I click the Delete Account button")
    public void i_click_the_delete_account_button() {
        AE.clickDeleteAccount();
    }

    @Then("I verify that the {string} message is shown and I click the Continue button")
    public void i_verify_that_the_message_is_shown_and_i_click_the_continue_button(String message) {
        AE.verifyAccountDeleted();
        AE.clickContinue();
        
        // Close the browser
        driver.quit();
    }
}
