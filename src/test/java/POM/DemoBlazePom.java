package POM;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class DemoBlazePom {
    WebDriver driver;

    // Constructor to initialize driver
    public DemoBlazePom(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@id='nava']") // ProductStore link
    private WebElement ProductStore;

    @FindBy(xpath = "//a[@id='signin2']") // SignIn link
    private WebElement SignIn;

    @FindBy(xpath = "//input[@id='sign-username']") // Username input
    private WebElement SUsername;

    @FindBy(xpath = "//input[@id='sign-password']") // Password input
    private WebElement SPassword;

    @FindBy(xpath = "//button[@onclick='register()']") // SignUp button
    private WebElement SignUpButton;

    @FindBy(xpath = "//button[contains(text(),'Continue')]") // Continue button
    private WebElement ContinueButton;

    @FindBy(id = "loginusername") // Logged-in username
    private WebElement LoggedInUsername;

    @FindBy(xpath = "//button[contains(text(),'Delete Account')]") // Delete Account button
    private WebElement DeleteAccountButton;

    // New method to verify if a specific message is visible
    public boolean verifyMessage(String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {
            // Check if any element contains the specific message text
            WebElement messageElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), '" + message + "')]")));
            return messageElement.isDisplayed();
        } catch (Exception e) {
            return false; // Return false if the message is not found or visible
        }
    }

    // Click Sign Up Button
    public void clickSignUp() {
        if (ProductStore.isDisplayed()) {
            System.out.println("Page is launched");
        }
        SignIn.click();
    }

    // Enter Sign Up Details
    public void SignUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(SUsername)).sendKeys("demo");
        wait.until(ExpectedConditions.visibilityOf(SPassword)).sendKeys("test");
        wait.until(ExpectedConditions.elementToBeClickable(SignUpButton)).click();
    }

    // Handle Alert
    public void alerthandle() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Message: " + alert.getText());
        alert.accept();
    }

    // Method to click the Continue button
    public void clickContinue() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(ContinueButton)).click();
    }

    // Method to verify if the logged-in username is displayed
    public boolean verifyLoggedInUser() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(LoggedInUsername)).isDisplayed();
    }

    // Method to click the Delete Account button
    public void clickDeleteAccount() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(DeleteAccountButton)).click();
    }
}
