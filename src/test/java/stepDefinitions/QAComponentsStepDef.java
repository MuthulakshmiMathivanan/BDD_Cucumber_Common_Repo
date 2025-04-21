package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class QAComponentsStepDef {
	
	WebDriver driver = new ChromeDriver();
	@Given("the user is on the homepage")
	public void the_user_is_on_the_homepage() throws InterruptedException {
		 WebDriverManager.chromedriver().setup();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement myaccount = driver.findElement(By.xpath("//span[text()='My Account']/parent::a"));
		Actions action = new Actions(driver);
		action.moveToElement(myaccount).perform();
		myaccount.click();
		driver.findElement(By.xpath("//li//a[text()='Login']")).click();
		driver.findElement(By.xpath("//div//input[@id='input-email']")).sendKeys("princyprabha2609@gmail.com");
		driver.findElement(By.xpath("//div//input[@id='input-password']")).sendKeys("Princy@119");
		
	}
	@When("the user navigates to Components -> Monitors")
	public void the_user_navigates_to_components_monitors() {
	    Actions action = new Actions(driver);
	    WebElement component = driver.findElement(By.xpath("//a[text()='Components' and @class='dropdown-toggle']"));
	    action.moveToElement(component).perform();
	    component.click();
	}
	@Then("the Monitors page should be displayed with title {string}")
	public void the_monitors_page_should_be_displayed_with_title(String actaulTitle) {
		WebElement monitorClick = driver.findElement(By.xpath("//a[text()='Components']/following::div[@class='dropdown-menu']//a[contains(text(),'Monitors')]"));
		monitorClick.click();
		@Nullable
		String expectedTitle = driver.getTitle();
		assertEquals(expectedTitle, actaulTitle);
	}
	@When("the user selects List view")
	public void the_user_selects_list_view() {
	    driver.findElement(By.xpath("//button[@id=\"list-view\"]")).click();
	}
	@Then("the products should be displayed in list format")
	public void the_products_should_be_displayed_in_list_format() {
	   System.out.println("List displayed");
	}
	
	@When("the user selects Grid view")
	public void the_user_selects_grid_view() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//button[@id='grid-view']")).click();
	}
	@Then("the products should be displayed in grid format")
	public void the_products_should_be_displayed_in_grid_format() {
		
		System.out.println("List displayed");
	}
	
}
