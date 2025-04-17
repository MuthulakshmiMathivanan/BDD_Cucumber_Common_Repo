package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.*;
import java.time.Duration;

import static org.junit.Assert.*;

public class OHR_AdminLoginStepDef {

//    WebDriver driver = new ChromeDriver();
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
//
//    @Given("The user should be login page")
//    public void the_user_should_be_login_page() {
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//    }
//
//    @When("The user enter username {string} and password {string}")
//    public void the_user_enter_username_and_password(String username, String password) {
//        WebElement usernameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
//        usernameField.sendKeys(username);
//
//        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
//        passwordField.sendKeys(password);
//    }
//
//    @When("click on the {string} button")
//    public void click_on_the_button(String buttonText) {
//        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class, 'orangehrm-login-button')]")));
//        loginBtn.click();
//    }
//
//    @Then("user should be directed to Dashboard page with title {string}")
//    public void user_should_be_directed_to_dashboard_page_with_title(String expectedTitle) {
//        
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h6[text()='Dashboard']")));
//        
//        String actualTitle = driver.getTitle();
//        System.out.println("Page Title: " + actualTitle);
//        assertEquals(expectedTitle, actualTitle);
//        driver.quit();
//    }
}
