package stepDefinitions;
import java.io.File;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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
   	        driver.findElement(By.xpath("//input[@data-qa='login-password']")).sendKeys("Abar");
   	    }

   	    @And("Clicks 'login' button")
   	    public void clicks_login_button() {
   	        WebElement loginBtn = driver.findElement(By.xpath("//button[@data-qa='login-button']"));
   	        Assert.assertTrue(loginBtn.isDisplayed());
   	        loginBtn.click();
   	    }
   	  
   	    @Then("Verify 'New User Signup!' is visible")
   	    public void verify_new_user_signup_visible() {
   	        WebElement signupHeader = driver.findElement(By.xpath("//h2[text()='New User Signup!']"));
   	        Assert.assertTrue(signupHeader.isDisplayed());
   	    }

   	    @And("Enter name and already registered email address")
   	    public void enter_name_and_existing_email() {
   	        driver.findElement(By.xpath("//input[@data-qa='signup-name']")).sendKeys("Test User");
   	        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("existinguser@example.com"); // Replace with actual registered email
   	    }

   	    @And("Click the 'Signup' button")
   	    public void click_the_signup_button() {
   	        WebElement signupButton = driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
   	        Assert.assertTrue(signupButton.isDisplayed());
   	        signupButton.click();
   	    }

   	    @Then("Verify error 'Email Address already exist!' is visible")
   	    public void verify_email_already_exists_error() {
   	        WebElement errorMsg = driver.findElement(By.xpath("//p[text()='Email Address already exist!']"));
   	        Assert.assertTrue(errorMsg.isDisplayed());

   	        // Optional: close browser
   	        driver.quit();
   }
   	    
   	    @Then("Verify that 'Logged in as username' is visible")
   	    public void verify_logged_in_as_username() {
   	        WebElement loggedInText = driver.findElement(By.xpath("//a[contains(text(),'Logged in as')]"));
   	        Assert.assertTrue(loggedInText.isDisplayed());
   	    }

   	    @When("Click the 'Logout' button")
   	    public void click_logout_button() {
   	        WebElement logoutLink = driver.findElement(By.linkText("Logout"));
   	        Assert.assertTrue(logoutLink.isDisplayed());
   	        logoutLink.click();
   	    }

   	    @Then("Verify that user is navigated to login page")
   	    public void verify_navigated_to_login_page() {
   	        String currentUrl = driver.getCurrentUrl();
   	        Assert.assertTrue(currentUrl.contains("/login"));
   	        
   	        // Optional: Check the login form is visible again
   	        WebElement loginHeader = driver.findElement(By.xpath("//h2[text()='Login to your account']"));
   	        Assert.assertTrue(loginHeader.isDisplayed());

   	        driver.quit();
   	    }
   	    
   	    @When("Click on 'Contact Us' button")
   	    public void click_contact_us() {
   	        driver.findElement(By.linkText("Contact us")).click();
   	    }

   	    @Then("Verify 'GET IN TOUCH' is visible")
   	    public void verify_get_in_touch() {
   	        WebElement getInTouch = driver.findElement(By.xpath("//h2[text()='Get In Touch']"));
   	        Assert.assertTrue(getInTouch.isDisplayed());
   	    }

   	    @And("Enter name, email, subject and message")
   	    public void enter_contact_details() {
   	        driver.findElement(By.name("name")).sendKeys("Test User");
   	        driver.findElement(By.name("email")).sendKeys("test@example.com");
   	        driver.findElement(By.name("subject")).sendKeys("Automation Testing");
   	        driver.findElement(By.id("message")).sendKeys("This is a sample message for testing.");
   	    }
   	    @And("Click OK button")
   	    public void click_ok_button() {
   	        try {
   	            Alert alert = driver.switchTo().alert();
   	            alert.accept();
   	        } catch (NoAlertPresentException e) {
   	            System.out.println("No alert was present.");
   	        }}
   	       

   	        @And("Upload file")
   	        public void upload_file() {
   	            WebElement uploadInput = driver.findElement(By.name("upload_file"));
   	            File file = new File("src/test/resources/testData/This is a sample message for testin.txt");
   	            uploadInput.sendKeys(file.getAbsolutePath());
   	        }
   	    @Then("Verify success message 'Success! Your details have been submitted successfully.' is visible")
   	    public void verify_success_message() {
   	        WebElement successMsg = driver.findElement(By.xpath("//div[@class='status alert alert-success']"));
   	        Assert.assertTrue(successMsg.isDisplayed());
   	        Assert.assertEquals("Success! Your details have been submitted successfully.", successMsg.getText());
   	    }

   	    @And("Click 'Home' button and verify that landed to home page successfully")
   	    public void click_home_and_verify_landing() {
   	        driver.findElement(By.xpath("//a[contains(text(),'Home')]")).click();
   	        WebElement logo = driver.findElement(By.xpath("//img[@alt='Website for automation practice']"));
   	        Assert.assertTrue("Not redirected to home page", logo.isDisplayed());

   	       
   	    }
   	    @And("Click the 'Submit' button")
   	    public void click_the_submit_button() {
   	        driver.findElement(By.name("submit")).click();
   	    }
   	    @When("Click on 'Test Cases' button")
   	    public void click_on_test_cases_button() {
   	        WebElement testCasesBtn = driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]"));
   	        Assert.assertTrue(testCasesBtn.isDisplayed());
   	        testCasesBtn.click();
   	    }

   	    @Then("Verify user is navigated to test cases page successfully")
   	    public void verify_test_cases_page() {
   	        // Wait a bit if needed: Thread.sleep(2000) or use WebDriverWait
   	        String currentUrl = driver.getCurrentUrl();
   	        Assert.assertTrue("URL does not contain 'test_cases'", currentUrl.contains("test_cases"));

   	        WebElement header = driver.findElement(By.xpath("//b[contains(text(),'Test Cases')]"));
   	        Assert.assertTrue("Test Cases header is not displayed", header.isDisplayed());
   	    }


   
}