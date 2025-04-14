package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginPageQA {

	WebDriver driver = new ChromeDriver();
	

//Web Elements Capture

private By myAccount = By.xpath("//a[@title='My Account']");

private By loginButton = By.xpath("(//li//a[text()='Login'])[1]");
private By userName = By.xpath("//input[@id='input-email']");
private By passWord = By.xpath("//input[@id='input-password']");
private By loginClick = By.xpath("//input[@type='submit']");
private By errorMessage = By.xpath("//div[contains(text(), 'Warning: No match')]");


public LoginPageQA(WebDriver driver2) {
	// TODO Auto-generated constructor stub
}

public void navigateToMyAccount() {

// Actions action = new Actions (driver);
// action.moveToElement(driver.findElement(myAccount)).build().perform();

driver.findElement(myAccount).click();
}

 public void clickOnLoginButton() {

driver.findElement(loginButton).click();
}

 public void enterUserName(String username) {

driver.findElement(userName).sendKeys(username);
}

public void enterPassword(String password) {

driver.findElement(passWord).sendKeys(password);

}

public void loginAction() {

driver.findElement(loginClick).click();

}
public String getErrorMessage() {

try {

return driver.findElement(errorMessage).getText();
}

catch (Exception e) {

return null;
}

}

}
