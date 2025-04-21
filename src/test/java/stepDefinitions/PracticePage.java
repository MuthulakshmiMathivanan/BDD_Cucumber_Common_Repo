package stepDefinitions;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.Before;
import io.cucumber.java.After;

public class PracticePage {

    WebDriver driver;
    POM.PracticePage practice;

    @Before
    public void setUp() {
        // Initialize WebDriver and PracticePage
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        practice = new POM.PracticePage(driver);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Given("user launches the automation practice")
    public void user_lauch_the_automation_practice() {
        System.out.println("Opening the Automation Practice page...");
    }

    @When("User selects the radio button")
    public void user_select_the_radio_button() {
        practice.checbox().click();
    }

    @When("User sends the country details")
    public void user_send_the_country_details() {
        practice.input_country().sendKeys("India");
    }

    @When("User selects the drop down box")
    public void user_select_the_drop_down_box() {
        WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
        Select select = new Select(dropdown);
        select.selectByVisibleText("Option3");
    }

    @When("User clicks on checkboxes if enabled")
    public void user_click_checkboxes_if_enabled() {
        WebElement checkbox1 = driver.findElement(By.xpath("//input[contains(@value,'option1')]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[contains(@value,'option2')]"));
        WebElement checkbox3 = driver.findElement(By.xpath("//input[contains(@value,'option3')]"));

        if (checkbox1.isEnabled()) {
            checkbox1.click();
        }
        if (checkbox2.isEnabled()) {
            checkbox2.click();
        }
        if (checkbox3.isEnabled()) {
            checkbox3.click();
        }
    }

    @When("User navigates to the child window")
    public void user_navigate_to_the_child_window() {
        String defaultWindow = driver.getWindowHandle();
        WebElement openWindowButton = driver.findElement(By.xpath("//*[@id=\"openwindow\"]"));
        openWindowButton.click();

        Set<String> allWindows = driver.getWindowHandles();
        for (String windowHandle : allWindows) {
            if (!windowHandle.equals(defaultWindow)) {
                driver.switchTo().window(windowHandle);  // Switch to the child window
                break;
            }
        }
    }

    @When("User navigates to the default window")
    public void user_navigate_to_the_default_window() {
        String childWindow = driver.getWindowHandle();
        WebElement openTabButton = driver.findElement(By.xpath("//*[@id=\"opentab\"]"));
        openTabButton.click();

        Set<String> multipleWindows = driver.getWindowHandles();
        for (String windowHandle : multipleWindows) {
            if (!windowHandle.equals(childWindow)) {
                driver.switchTo().window(windowHandle);  // Switch to the default window
                break;
            }
        }
    }

    @Then("User sends the input value")
    public void user_send_the_input_value() {
        WebElement enterYourName = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        enterYourName.sendKeys("Raj");
        System.out.println("Entered name: Raj");
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            System.out.println("Browser closed");
        }
    }
}
