package stepDefinitions;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static org.junit.Assert.*;

public class AddRemoveElementsSteps {

    WebDriver driver;

    @Given("I open the Add/Remove Elements page")
    public void openAddRemovePage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }

    @When("I click the {string} button {int} times")
    public void clickButtonMultipleTimes(String buttonText, int times) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        for (int i = 0; i < times; i++) {
            button.click();
        }
    }

    @Then("I should see {int} {string} buttons")
    public void verifyButtonCount(int expectedCount, String buttonText) {
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='" + buttonText + "']"));
        assertEquals("Expected number of buttons not found", expectedCount, buttons.size());
    }

    @Given("I have {int} {string} buttons on the page")
    public void ensureButtonPresence(int count, String buttonText) {
        WebElement addButton = driver.findElement(By.xpath("//button[text()='Add Element']"));
        for (int i = 0; i < count; i++) {
            addButton.click();
        }
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='" + buttonText + "']"));
        assertEquals("Setup failed: expected buttons not found", count, buttons.size());
    }

    @When("I click one {string} button")
    public void clickOneButton(String buttonText) {
        WebElement button = driver.findElement(By.xpath("//button[text()='" + buttonText + "']"));
        button.click();
    }

    @When("I delete all the {string} buttons")
    public void deleteAllButtons(String buttonText) {
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='" + buttonText + "']"));
        while (!buttons.isEmpty()) {
            buttons.get(0).click();
            buttons = driver.findElements(By.xpath("//button[text()='" + buttonText + "']"));
        }
    }

    @Then("I should see no {string} buttons")
    public void verifyNoButtons(String buttonText) {
        List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='" + buttonText + "']"));
        assertTrue("Buttons still visible", buttons.isEmpty());
    }
   
}
