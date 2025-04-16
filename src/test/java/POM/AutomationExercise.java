package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class AutomationExercise {

    WebDriver driver;

    public AutomationExercise(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Home and Signup/Login
    @FindBy(xpath = "//*[contains(text(),' Home')]")
    public WebElement homeButton;

    @FindBy(xpath = "//*[contains(text(),' Signup / Login')]")
    public WebElement signUpAndLoginButton;

    @FindBy(xpath = "//input[@data-qa='signup-name']")
    public WebElement signupName;

    @FindBy(xpath = "//input[@data-qa='signup-email']")
    public WebElement signupEmail;

    @FindBy(xpath = "//button[@data-qa='signup-button']")
    public WebElement signupButton;

    @FindBy(xpath = "//b[normalize-space()='Enter Account Information']")
    public WebElement enterAccountInfoText;

    @FindBy(id = "id_gender1")
    public WebElement genderMr;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "days")
    public WebElement daysDropdown;

    @FindBy(id = "months")
    public WebElement monthsDropdown;

    @FindBy(id = "years")
    public WebElement yearsDropdown;

    @FindBy(id = "newsletter")
    public WebElement newsletterCheckbox;

    @FindBy(id = "optin")
    public WebElement specialOffersCheckbox;

    @FindBy(id = "first_name")
    public WebElement firstName;

    @FindBy(id = "last_name")
    public WebElement lastName;

    @FindBy(id = "company")
    public WebElement company;

    @FindBy(id = "address1")
    public WebElement address;

    @FindBy(id = "state")
    public WebElement state;

    @FindBy(id = "city")
    public WebElement city;

    @FindBy(id = "zipcode")
    public WebElement zipCode;

    @FindBy(id = "mobile_number")
    public WebElement mobileNumber;

    @FindBy(xpath = "//button[contains(text(),'Create Account')]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    public WebElement accountCreatedText;

    @FindBy(xpath = "//a[@data-qa='continue-button']")
    public WebElement continueButton;
    
    @FindBy(xpath = "//h2[contains(text(),'Login to your account')]")
    public WebElement logintoyouAccount;
    

    @FindBy(xpath = "//a[contains(text(),' Logged in as ')]")
    public WebElement loggedInText;

    @FindBy(xpath = "//a[contains(text(),'Delete Account')]")
    public WebElement deleteAccountButton;

    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    public WebElement accountDeletedText;

    // New User Signup Verification method
    @FindBy(xpath = "//h2[contains(text(), 'New User Signup!')]") // Correct XPath for New User Signup section
    public WebElement newUserSignupSection;

    // Methods for actions

    public void waitForElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void verifyHome() {
        waitForElementToBeVisible(homeButton);
        if (homeButton.isDisplayed()) {
            System.out.println("✅ Home page is visible.");
        } else {
            throw new AssertionError("❌ Home page is NOT visible.");
        }
    }

    public void clickSignupLogin() {
        waitForElementToBeVisible(signUpAndLoginButton);
        signUpAndLoginButton.click();
    }

    public void enterNameAndEmail(String name, String email) {
        waitForElementToBeVisible(signupName);
        signupName.sendKeys(name);
        signupEmail.sendKeys(email);
    }

    public void clickSignupButton() {
        waitForElementToBeVisible(signupButton);
        signupButton.click();
    }

    public void verifyEnterAccountInfoVisible() {
        waitForElementToBeVisible(enterAccountInfoText);
        if (!enterAccountInfoText.isDisplayed()) {
            throw new AssertionError("❌ 'ENTER ACCOUNT INFORMATION' is not visible");
        }
    }

    public void fillAccountInfo(String pass, String day, String month, String year,
                                String fName, String lName, String comp, String addr,
                                String stateVal, String cityVal, String zip, String mobile) {
        waitForElementToBeVisible(genderMr);
        genderMr.click();
        password.sendKeys(pass);

        new Select(daysDropdown).selectByVisibleText(day);
        new Select(monthsDropdown).selectByVisibleText(month);
        new Select(yearsDropdown).selectByVisibleText(year);

        newsletterCheckbox.click();
        specialOffersCheckbox.click();

        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        company.sendKeys(comp);
        address.sendKeys(addr);
        state.sendKeys(stateVal);
        city.sendKeys(cityVal);
        zipCode.sendKeys(zip);
        mobileNumber.sendKeys(mobile);
    }

    public void clickCreateAccount() {
        waitForElementToBeVisible(createAccountButton);
        createAccountButton.click();
    }

    public void verifyAccountCreated() {
        waitForElementToBeVisible(accountCreatedText);
        if (!accountCreatedText.isDisplayed()) {
            throw new AssertionError("❌ Account not created successfully.");
        }
    }

    public void clickContinue() {
        waitForElementToBeVisible(continueButton);
        continueButton.click();
    }

    public void verifyLoggedInUsernameVisible() {
        waitForElementToBeVisible(loggedInText);
        if (!loggedInText.isDisplayed()) {
            throw new AssertionError("❌ Logged in username is not visible.");
        }
    }

    public void clickDeleteAccount() {
        waitForElementToBeVisible(deleteAccountButton);
        deleteAccountButton.click();
    }
    public void checkDeleteAccount() {
        waitForElementToBeVisible(deleteAccountButton);
        boolean s = deleteAccountButton.isDisplayed();
        if (s) {
			System.out.println("Delete button is displayed");
		}
    }

    public void verifyAccountDeleted() {
        waitForElementToBeVisible(accountDeletedText);
        if (!accountDeletedText.isDisplayed()) {
            throw new AssertionError("❌ Account not deleted.");
        }
    }

    public void verifyNewUserSignupVisible() {
        waitForElementToBeVisible(newUserSignupSection);
        boolean isVisible = newUserSignupSection.isDisplayed();
        if (isVisible) {
            System.out.println("✅ New User Signup section is visible.");
        } else {
            throw new AssertionError("❌ New User Signup section is NOT visible.");
        }
    }

    // Method for verifying if specific text is visible on the page
    public void verifyTextVisible(String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement textElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Enter Account Information')]")));
        if (!textElement.isDisplayed()) {
            throw new AssertionError("❌ Text '" + text + "' is not visible.");
        }
    }
}
