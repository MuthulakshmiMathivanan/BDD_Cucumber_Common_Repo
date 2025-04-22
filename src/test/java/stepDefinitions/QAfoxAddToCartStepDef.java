package stepDefinitions;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QAfoxAddToCartStepDef {

    WebDriver driver = new ChromeDriver();

    @Given("I am on the Swag Labs inventory page")
    public void i_am_on_the_swag_labs_inventory_page() {
    	 WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Ensure you're on the inventory page
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("inventory"));
    }

    @When("I click the \"Add to cart\" button for \"Sauce Labs Backpack\"")
    public void i_click_add_to_cart_for_sauce_labs_backpack() {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
    }

    @Then("the cart badge should display \"1\"")
    public void the_cart_badge_should_display_1() {
        WebElement cartBadge = driver.findElement(By.className("shopping_cart_badge"));
        assertEquals("1", cartBadge.getText());
    }

    
}
