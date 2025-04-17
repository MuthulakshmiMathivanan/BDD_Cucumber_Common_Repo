package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OHR_AddEmployeeStepDef {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
  
    @Given("The user should be login page")
    public void the_user_should_be_login_page() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("The user enter username {string} and password {string}")
    public void the_user_enter_username_and_password(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }

    @When("click on the {string} button")
    public void click_on_the_button(String buttonText) {
        wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//button[contains(@class, 'orangehrm-login-button')]"))).click();
    }

    @Then("user should be directed to Dashboard page with title {string}")
    public void user_should_be_directed_to_dashboard_page_with_title(String expectedTitle) {
        //wait.until(ExpectedConditions.titleIs(expectedTitle));
        String actualTitle = driver.getTitle();
        System.out.println("Dashboard Title: " + actualTitle);
        assertTrue(actualTitle.contains("OrangeHRM"));
    }
    
    @When("I navigate to the {string} page")
    public void i_navigate_to_the_page(String pageName) {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[contains(@class, 'oxd-button')])[3]"))).click();
    }

    @When("I enter employee full name with first name {string}, middle name {string}, and last name {string}")
    public void i_enter_employee_full_name(String firstName, String middleName, String lastName) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))).sendKeys(firstName);
        driver.findElement(By.name("middleName")).sendKeys(middleName);
        driver.findElement(By.name("lastName")).sendKeys(lastName);
    }

    @When("I enter employee ID as {string}")
    public void i_enter_employee_id_as(String empId) {
        WebElement empIdField = driver.findElement(By.xpath("//label[text()='Employee Id']/../following-sibling::div/input"));
        empIdField.clear();
        empIdField.sendKeys(empId);
    }

    @When("I enable {string}")
    public void i_enable_create_login_details(String label) {
        WebElement toggle = wait.until(ExpectedConditions.elementToBeClickable(
            By.xpath("//span[contains(@class, 'oxd-switch-input')]")));
        toggle.click();
    }

    @When("I enter login username as {string}")
    public void i_enter_login_username_as(String username) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[text()='Username']/../following-sibling::div/input"))).sendKeys(username);
    }

    @When("I enter password as {string} and confirm password as {string}")
    public void i_enter_password_and_confirm_password(String pwd, String confPwd) {
        driver.findElement(By.xpath("//label[text()='Password']/../following-sibling::div/input")).sendKeys(pwd);
        driver.findElement(By.xpath("//label[text()='Confirm Password']/../following-sibling::div/input")).sendKeys(confPwd);
    }

    @When("I select status as {string}")
    public void i_select_status_as(String status) {
        if (status.equalsIgnoreCase("Enabled")) {
            driver.findElement(By.xpath("//label[text()='Enabled']")).click();
        } else {
            driver.findElement(By.xpath("//label[text()='Disabled']")).click();
        }
    }

    @When("I click on the {string} button")
    public void i_click_on_the_button(String btnText) {
        driver.findElement(By.xpath("//button[normalize-space()='" + btnText + "']")).click();
    }

    @Then("the employee should be added successfully")
    public void the_employee_should_be_added_successfully() {
        
        WebElement personalDetailsHeader = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Personal Details']")));
        assertTrue(personalDetailsHeader.isDisplayed());
        //driver.quit();
    }
}
