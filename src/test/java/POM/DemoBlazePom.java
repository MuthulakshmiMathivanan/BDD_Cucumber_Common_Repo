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

    @FindBy(xpath = "//a[@id='nava']")
    private WebElement ProductStore;

    @FindBy(xpath = "//a[@id='signin2']")
    private WebElement SignIn;

    @FindBy(xpath = "//input[@id='sign-username']")
    private WebElement SUsername;

    @FindBy(xpath = "//input[@id='sign-password']")
    private WebElement SPassword;

    @FindBy(xpath = "//button[@onclick='register()']")
    private WebElement SignUpButton;

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
}
