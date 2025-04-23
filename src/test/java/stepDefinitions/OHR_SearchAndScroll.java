package stepDefinitions;

import static org.junit.Assert.assertTrue;


import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.After;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.en.*;

public class OHR_SearchAndScroll {

    WebDriver driver;
    WebDriverWait wait;

    
    @Given("The user should be logged in")
    public void the_user_should_be_login_page() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");;
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[contains(@class, 'orangehrm-login-button')]")).click();
    }

    
    @When("I enter {string} in the sidebar search field")
    public void i_enter_in_the_sidebar_search_field(String moduleR) {
        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(moduleR);
        // WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
        //     By.xpath("//input[@placeholder='Search']")));

        // searchBox.clear();

        // searchBox.clear();

        // searchBox.sendKeys(moduleR);
    }

    @Then("I should see the {string} module visible in the sidebar")
    public void i_should_see_module_visible(String module) {

        WebElement item = driver.findElement(By.xpath("//span[text()='Recruitment']"));
        assertTrue(item.isDisplayed());
    }

}
