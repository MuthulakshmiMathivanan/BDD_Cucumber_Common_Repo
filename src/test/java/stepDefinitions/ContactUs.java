package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactUs {

    WebDriver driver = new ChromeDriver();

    @When("I click on the contact us form")
    public void i_click_on_the_contact_us_form() {
        // Locate the contact us form link/button and click on it
        WebElement contactUsForm = driver.findElement(By.linkText("Contact Us"));
        contactUsForm.click();
    }

    @When("I enter the relevant details")
    public void i_enter_the_relevant_details() {
        // Fill in the form fields (Example: Name, Email, etc.)
        WebElement nameField = driver.findElement(By.id("name"));
        nameField.sendKeys("John Doe");

        WebElement emailField = driver.findElement(By.id("email"));
        emailField.sendKeys("johndoe@example.com");

        WebElement messageField = driver.findElement(By.id("message"));
        messageField.sendKeys("I have an inquiry about your services.");
    }

    @When("I click on the submit button")
    public void i_click_on_the_submit_button() {
        // Click the submit button on the contact form
        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }

    @Then("I check the success message")
    public void i_check_the_success_message() {
        // Check for the success message after form submission
        WebElement successMessage = driver.findElement(By.id("successMessage"));
        String message = successMessage.getText();
        if (message.contains("Thank you for contacting us")) {
            System.out.println("Success message displayed: " + message);
        } else {
            System.out.println("Success message not found.");
        }
    }
}
