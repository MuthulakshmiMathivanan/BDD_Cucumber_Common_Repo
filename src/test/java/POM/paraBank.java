package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paraBank {
    WebDriver driver;

    public paraBank(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h1[contains(text(),'Signing up is easy!')]")
    private WebElement signUpText;

    @FindBy(id = "customer.firstName")
    private WebElement firstName;

    @FindBy(id = "customer.lastName")
    private WebElement lastName;

    @FindBy(id = "customer.address.street")
    private WebElement address;

    @FindBy(id = "customer.address.city")
    private WebElement city;

    @FindBy(id = "customer.address.state")
    private WebElement state;

    @FindBy(id = "customer.address.zipCode")
    private WebElement zipcode;

    @FindBy(id = "customer.phoneNumber")
    private WebElement mobile;

    @FindBy(id = "customer.username")
    private WebElement username;

    @FindBy(id = "customer.password")
    private WebElement password;

    @FindBy(id = "repeatedPassword")
    private WebElement confirmPassword;

    @FindBy(xpath = "//input[contains(@value,'Register')]")
    private WebElement registerButton;
    
    @FindBy(xpath = "//a[contains(text(),'Open New Account')]")
    private WebElement OpenNewAccount;

    public void register() {
        if (signUpText.isDisplayed()) {
            System.out.println("Website is launched successfully! Now you are in the ParaBank website.");
        }

        firstName.sendKeys("demo");
        lastName.sendKeys("test");
        address.sendKeys("Coimbatore");
        city.sendKeys("Cbe");
        state.sendKeys("TamilNadu");
        zipcode.sendKeys("900001");
        mobile.sendKeys("09887678776");
        username.sendKeys("demo");
        password.sendKeys("Test");
        confirmPassword.sendKeys("Test");
        registerButton.click();
    }
    public void login() {
    	  driver.get("https://parabank.parasoft.com/parabank/index.htm");

          driver.findElement(By.name("username")).sendKeys("demo");
          driver.findElement(By.name("password")).sendKeys("Test");
          driver.findElement(By.xpath("//input[@value='Log In']")).click();

	}
    public void LoggedIn() {
		boolean LoggedInSuccessfully = OpenNewAccount.isDisplayed();
		if (LoggedInSuccessfully) {
			System.out.println("Logged In Successfully!!");
		}

	}
    
    
}
