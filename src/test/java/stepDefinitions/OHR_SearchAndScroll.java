package stepDefinitions;

import static org.junit.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class OHR_SearchAndScroll {

    WebDriver driver;
    WebDriverWait wait;

    
    @When("I enter {string} in the sidebar search field")
    public void i_enter_in_the_sidebar_search_field(String module) {
        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//input[@placeholder='Search']")));
        //searchBox.clear();
        searchBox.sendKeys(module);
    }

    @Then("I should see the {string} module visible in the sidebar")
    public void i_should_see_module_visible(String module) {
        WebElement item = wait.until(ExpectedConditions.visibilityOfElementLocated(
            By.xpath("//span[text()='Recruitment']")));
        assertTrue(item.isDisplayed());
    }

}
