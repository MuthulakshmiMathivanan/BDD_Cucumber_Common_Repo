package stepDefinitions;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QACheckOutStepDef {

    WebDriver driver = new ChromeDriver();

    @Given("the user is logged in and has {string} in the cart")
    public void user_logged_in_and_has_item_in_cart(String productName) {
    	 WebDriverManager.chromedriver().setup();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        if (productName.equals("Sauce Labs Bike Light")) {
            driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
        } else {
            throw new IllegalArgumentException("Unsupported product: " + productName);
        }
    }

    @When("the user navigates to the cart page")
    public void user_navigates_to_cart_page() {
        driver.findElement(By.className("shopping_cart_link")).click();
    }

    @When("proceeds to the checkout")
    public void user_proceeds_to_checkout() {
        driver.findElement(By.id("checkout")).click();
    }

    @Then("the checkout information form should be displayed")
    public void checkout_information_form_displayed() {
        WebElement title = driver.findElement(By.className("title"));
        assertEquals("Checkout: Your Information", title.getText());
    }
}
