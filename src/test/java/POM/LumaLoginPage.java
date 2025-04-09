package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LumaLoginPage {
	WebDriver driver;

    // Constructor
    public LumaLoginPage(WebDriver driver) {
        this.driver = driver;
    }
   
    By signInLink = By.xpath("(//a[contains(text(), 'Sign In')])[1]");
    By emailField = By.id("email");
    By passwordField = By.id("pass");
    By signInButton = By.id("send2");

   
    public void clickSignInLink() {
    	driver.get("https://magento.softwaretestingboard.com/");
    	driver.manage().window().maximize();
        driver.findElement(signInLink).click();
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInButton() {
        driver.findElement(signInButton).click();
    }

    public String getTitle() {
        return driver.getTitle();
    }
}


