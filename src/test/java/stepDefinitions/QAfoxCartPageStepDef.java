package stepDefinitions;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QAfoxCartPageStepDef {

    WebDriver driver = new ChromeDriver();

    @Given("I have added {string} to the cart")
    public void i_have_added_item_to_the_cart(String productName) {
    	 WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();      
        if (productName.equals("Sauce Labs Backpack")) {
            driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
        } else {
            throw new IllegalArgumentException("Product not handled in step: " + productName);
        }
    }

    @When("I click the cart icon")
    public void i_click_the_cart_icon() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @Then("I should be on the cart page")
    public void i_should_be_on_the_cart_page() {
        String currentUrl = driver.getCurrentUrl();
        assertTrue("Not on cart page", currentUrl.contains("/cart"));
    }

    @Then("I should see {string} listed in the cart")
    public void i_should_see_product_listed_in_the_cart(String productName) {
        WebElement item = driver.findElement(By.className("inventory_item_name"));
        assertEquals(productName, item.getText());
    }
}
