package stepDefinitions;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class AutomationTesterSighup {
   
    WebDriver driver = null;
    @Given("Launch browser and navigate to AutomationTester url")
public void launch_browser_and_navigate() {
    System.setProperty("webDriver.chrome.driver", "C:/Users/10669/OneDrive - Expleo France/Desktop/SampleTest/src/test/resources/drivers/chromedriver_proxy.exe");
    driver= new ChromeDriver();
    //driver = new EdgeDriver();
    //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    driver.manage().window().maximize();
    driver.get("https://automationexercise.com/");

}
@Then("Verify that home page is visible successfully")
public void verify_that_home_page_is_visible_successfully() {
  //  Assert.assertTrue(driver.getTitle().contains("Automation Exercise"));
 WebElement homePageLogo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']")); // Or any visible element unique to homepage
    Assert.assertTrue(homePageLogo.isDisplayed());
}
@When("Click on Signup button")
public void click_on_signup_button() {
        driver.findElement(By.linkText("Signup / Login")).click();

}
@Then("Verify new sign up is visible")
public void verify_new_sign_up_is_visible() {
    WebElement newUserSignupText = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
    Assert.assertTrue(newUserSignupText.isDisplayed());
}
@Then("Enter name and email address")
public void enter_name_and_email_address() {
    driver.findElement(By.name("name")).sendKeys("TestUser");
    driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("test" + System.currentTimeMillis() + "@mail.com");
}
@Then("Click {string} button")
public void click_button(String string) {
    driver.findElement(By.xpath("//button[@data-qa='signup-button']")).click();

}


@And("Fill details: Title, Name, Email, Password, Date of birth")
public void fill_account_info() {
    driver.findElement(By.id("id_gender1")).click(); 
    driver.findElement(By.id("password")).sendKeys("TestPass123");

    new Select(driver.findElement(By.id("days"))).selectByValue("5");
    new Select(driver.findElement(By.id("months"))).selectByValue("6");
    new Select(driver.findElement(By.id("years"))).selectByValue("1990");
}

@And("Select checkbox 'Sign up for our newsletter!'")
public void select_newsletter_checkbox() {
    driver.findElement(By.id("newsletter")).click();
}

@And("Select checkbox 'Receive special offers from our partners!'")
public void select_offers_checkbox() {
    driver.findElement(By.id("optin")).click();
}

@And("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
public void fill_address_info() {
    driver.findElement(By.id("first_name")).sendKeys("John");
    driver.findElement(By.id("last_name")).sendKeys("Doee");
    driver.findElement(By.id("company")).sendKeys("AutomationCo");
    driver.findElement(By.id("address1")).sendKeys("123 Testing Blvd");
    driver.findElement(By.id("address2")).sendKeys("Suite 456");

    new Select(driver.findElement(By.id("country"))).selectByVisibleText("India");

    driver.findElement(By.id("state")).sendKeys("Delhi");
    driver.findElement(By.id("city")).sendKeys("New Delhi");
    driver.findElement(By.id("zipcode")).sendKeys("110001");
    driver.findElement(By.id("mobile_number")).sendKeys("9999999999");
}

@And("Click 'Create Account button'")
public void click_create_account_button() {
    driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
}



@When("Click 'Continue' button")
public void click_continue_button() {
   
    driver.findElement(By.xpath("//a[@data-qa='continue-button']")).click();

}

@When("Click 'Delete Account' button")
public void click_delete_account() {
    driver.findElement(By.linkText("Delete Account")).click();
}

	
@Then("Finally i close the browserrr")
	public void finally_i_close_the_browser() {
	   driver.quit();
	}
    @Then("Verify 'Login to your account' is visible")
    public void verify_login_to_account_visible() {
        WebElement loginText = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
        Assert.assertTrue(loginText.isDisplayed());
    }

    @And("Enter correct email address and password")
    public void enter_correct_email_and_password() {
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("youremail@example.com");
        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("YourPassword123");
    }

    @And("Clicks 'login' button")
    public void clicks_login_button() {
        WebElement loginBtn = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
        Assert.assertTrue(loginBtn.isDisplayed());
        loginBtn.click();
    }

   
}