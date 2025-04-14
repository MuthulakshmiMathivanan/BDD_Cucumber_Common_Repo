package stepDefinitions;

import java.time.Duration;
import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class QAAddAdresssStepDef {
	
	WebDriver driver = new ChromeDriver();

	@Given("I am logged in to my account")
	public void i_am_logged_in_to_my_account() throws InterruptedException {
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
		 driver.findElement(By.xpath("//input[@type='submit' and @value='Login']")).click();
	    
	}
	
	@Given("I navigate to the Address Book section")
	public void i_navigate_to_the_address_book_section() {
	   
		WebElement myAccount = driver.findElement(By.xpath("//span[text() = 'My Account']/parent::a"));
		Actions action = new Actions(driver);
		action.moveToElement(myAccount).perform();
		myAccount.click();
		
	}
	@When("I click on the Add Address button")
	public void i_click_on_the_button_add_address() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement addressBook = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Address Book']")));
		addressBook.click();
	    //driver.findElement(By.xpath("//a[text()='Address Book']")).click();
	    driver.findElement(By.xpath("//div//a[text() = 'New Address']")).click();
	}
	@When("I enter the following shipping address details:")
	public void i_enter_the_following_shipping_address_details(DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    // For other transformations you can register a DataTableType.
		Map<String, String> data = dataTable.asMap(String.class, String.class);
		driver.findElement(By.id("input-firstname")).sendKeys(data.get("First Name"));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get("Last Name"));
		driver.findElement(By.id("input-company")).sendKeys(data.get("Company"));
		driver.findElement(By.id("input-address-1")).sendKeys(data.get("Address 1"));
	    driver.findElement(By.id("input-address-2")).sendKeys(data.get("Address 2"));
	    driver.findElement(By.id("input-city")).sendKeys(data.get("City"));
	    driver.findElement(By.id("input-postcode")).sendKeys(data.get("Post Code"));
	   	}
	@When("I select country and region from dropdown")
	public void i_select_country_from_dropdown() {
		//explicit wait 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='input-country']")));
		//WebElement country = driver.findElement(By.xpath("//select[@id = 'input-country']"));
	    Select countrtList = new Select(country);
	    countrtList.selectByIndex(5);
	    
	   	WebElement zone = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='zone_id']")));
	    Select region = new Select(zone);
	    region.selectByIndex(1);	    
	}
	@When("I choose  Default Address")
	public void i_choose_default_address() {
		
		driver.findElement(By.xpath("//input[@name = 'default' and @value = '1']")).click();
	}
	
	@When("I click the Continue button")
	public void i_click_the_continue_button() {
	    driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	@Then("the new shipping address should be successfully added to my address book")
	public void the_new_shipping_address_should_be_successfully_added_to_my_address_book() {
	    
		@Nullable
		String pageTtile = driver.getTitle();
		System.out.println(pageTtile);
	}
	@Then("I should see a success message indicating the address has been added")
	public void i_should_see_a_success_message_indicating_the_address_has_been_added() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String succuessMsg = driver.findElement(By.xpath("//div[contains(text(), 'Your address has')]")).getText();
		System.out.println("succuessMsg");
	}
	@Then("the newly added address should be marked as the default address in my address book")
	public void the_newly_added_address_should_be_marked_as_the_default_address_in_my_address_book() {
		System.out.println("Done");
	    
	}
}
