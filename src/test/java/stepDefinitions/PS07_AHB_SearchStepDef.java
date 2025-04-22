package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.cucumber.java.en.*;

public class PS07_AHB_SearchStepDef {

    WebDriver driver = new ChromeDriver();

    @Given("User should be in Adactin Hotel Home page")
    public void userShouldBeInAdactinHotelHomePage() {
        driver.get("https://adactinhotelapp.com/HotelAppBuild2/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("PrincyPrabha");
        driver.findElement(By.id("password")).sendKeys("Princy@119");
        driver.findElement(By.name("login")).click();

        WebElement welcome = driver.findElement(By.xpath("//td[@class='welcome_menu']"));
        System.out.println("Logged in as: " + welcome.getText());
    }

    @When("User select the Location, Hotels, RoomType, NoOfRooms,")
    public void userSelectTheLocationHotelsRoomTypeNoOfRooms() {
        new Select(driver.findElement(By.name("location"))).selectByValue("London");
        new Select(driver.findElement(By.name("hotels"))).selectByValue("Hotel Sunshine");
        new Select(driver.findElement(By.id("room_type"))).selectByIndex(1);
        new Select(driver.findElement(By.name("room_nos"))).selectByIndex(1);
    }

    @When("User Enters the checkIn and checkOut Date")
    public void userEntersTheCheckInAndCheckOutDate() {
        WebElement checkIn = driver.findElement(By.id("datepick_in"));
        WebElement checkOut = driver.findElement(By.id("datepick_out"));
        checkIn.clear();
        checkIn.sendKeys("23/04/2025");
        checkOut.clear();
        checkOut.sendKeys("25/04/2025");
    }

    @Then("User select AdultsPerRoom, ChildrenPerRoom and Clicks the search button")
    public void userSelectAdultsPerRoomChildrenPerRoomAndClicksTheSearchButton() {
        new Select(driver.findElement(By.id("adult_room"))).selectByValue("2");
        new Select(driver.findElement(By.id("child_room"))).selectByIndex(0);
        driver.findElement(By.id("Submit")).click();
    }

    @Then("It should be redirected to Hotel booking page")
    public void itShouldBeRedirectedToHotelBookingPage() {
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current Page URL: " + currentUrl);
    }

    @Then("User select the hotel and continue for the payment")
    public void userSelectTheHotelAndContinueForThePayment() {
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
    }

    @When("User should enter the {string}, {string}, {string}, {string}, {string}, {string}, {string}, {string}")
    public void userShouldEnterThe(
        String firstName, String lastName, String billingAddress,
        String ccNumber, String ccType, String expiryMonth,
        String expiryYear, String cvv) {

        driver.findElement(By.name("first_name")).sendKeys(firstName);
        driver.findElement(By.name("last_name")).sendKeys(lastName);
        driver.findElement(By.className("txtarea")).sendKeys(billingAddress);
        driver.findElement(By.name("cc_num")).sendKeys(ccNumber);
        new Select(driver.findElement(By.name("cc_type"))).selectByVisibleText(ccType);
        new Select(driver.findElement(By.name("cc_exp_month"))).selectByVisibleText(expiryMonth);
        new Select(driver.findElement(By.name("cc_exp_year"))).selectByVisibleText(expiryYear);
        driver.findElement(By.id("cc_cvv")).sendKeys(cvv);
    }

    @Then("User click the bookNow")
    public void userClickTheBookNow() {
        driver.findElement(By.name("book_now")).click();
    }

    @Then("it should show the Order Number")
    public void itShouldShowTheOrderNumber() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement orderNumber = wait.until(
            ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id, 'order_no')]"))
        );
        String orderId = orderNumber.getAttribute("value");
        System.out.println("Order ID: " + orderId);
        driver.quit();
    }
}
