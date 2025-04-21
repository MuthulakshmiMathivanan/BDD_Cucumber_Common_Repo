package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.BookingHotel;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import runners.RunnerTest;

public class HotelBooking {

	WebDriver driver = new ChromeDriver();

	BookingHotel booking = new BookingHotel(driver);


	@Given("user launch The Application")
	public void user_launch_the_application() {
		 WebDriverManager.chromedriver().setup();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  

	}
	@When("user Enter The Username In Username Filed")
	public void user_enter_the_username_in_username_filed() {

		//		inputValue(login.getUser_name(), "https://adactinhotelapp.com/");

		booking.getUser_name().sendKeys("rajasekari");

	}
	@When(": User Enter The Password In Password Field")
	public void user_enter_the_password_in_password_field() {

		//		inputValue(login.getPassword(), "Raje@123");

		booking.getPassword().sendKeys("Raje@123");

	}
	@Then(": User Click On The Login Button And It Navigates To Search Hotel Page")
	public void user_click_on_the_login_button_and_it_navigates_to_search_hotel_page() {

		//		clickonElement(login.getSubmit());

		booking.getSubmit().click();

	}

	@When(": user Select The Location")
	public void user_select_the_location() {

		//		singledropdown(Search.getLocation(), "index", "1");

		//		WebElement locationDropdown = booking.getLocation();
		//		
		//		Select select = new Select(booking.getLocation());
		//		
		//		select.selectByIndex(1);

		WebElement location= driver.findElement(By.xpath("//*[@id=\"location\"]"));

		Select select = new Select(location);

		select.selectByIndex(1);

   }
	
	@When(": user Select The Hotel")
	public void user_select_the_hotel() {

//		singledropdown(Search.getHotels(), "index", "1");
		
		WebElement singledropdown = booking.getHotels();
		
		Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Select The RoomType")
	public void user_select_the_room_type() {

//		singledropdown(Search.getRoomtype(), "index", "1");
		
		WebElement singledropdown = booking.getRoomtype();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);
		
		

	}
	@When(": user Select The NumberofRooms")
	public void user_select_the_numberof_rooms() {
		
		
//		singledropdown(Search.getNumberofrooms(), "index", "1");
		
		WebElement singledropdown = booking.getNumberofrooms();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Enters The CheckinDate")
	public void user_enters_the_checkin_date() {

//		inputValue(Search.getcheckinDate(), "21/03/2025");
		
		booking.getcheckinDate().sendKeys("21/06/2025");
	}
	@When(": user Enters The CheckOutDate")
	public void user_enters_the_check_out_date() {

//		inputValue(Search.getcheckoutDate(), "21/03/2025");
		
		booking.getcheckoutDate().sendKeys("21/06/2025");

	}
	@When(": user Select The AdultPerRoom")
	public void user_select_the_adult_per_room() {
//		singledropdown(Search.getadultperroom(), "index", "1");
		
       WebElement singledropdown = booking.getadultperroom();
		
        Select select = new Select(singledropdown);
		
		select.selectByIndex(1);

	}
	@When(": user Select The ChildrenPerRoom")
	public void user_select_the_children_per_room() {

//		singledropdown(Search.getchildperroom(), "index", "1");
		
		 WebElement singledropdown = booking.getchildperroom();
			
	        Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
		
		

	}
	@Then(": User Click on the Search Button And It Navigates To Select Hotel page")
	public void user_click_on_the_search_button_and_it_navigates_to_select_hotel_page() {

//		clickonElement(Search.getsearchhotel());
		
		booking.getsearchhotel().click();


	}
	
	@When(": user Select The RadioButton")
	public void user_select_the_radio_button() {
		
//		clickonElement(Select.getradiobutton());
		
		booking.getradiobutton().click();
		
		
		
	   
	}
	@When(": user Select The ContinueButton")
	public void user_select_the_continue_button() {
		
//		clickonElement(Select.getcontinuebutton());
		
		booking.getcontinuebutton().click();
	    
	}
	
	@When(": user Enters The FirstName")
	public void user_enters_the_first_name() {
		
//	inputValue(Payment.getFirstName(), "rajasekar");
	
	booking.getFirstName().sendKeys("rajasekar");
	   
	}
	
	@When(": user Enters The LastName")
	public void user_enters_the_last_name() {
		
//    inputValue(Payment.getLastName(), "inbasekaran");
    
    booking.getLastName().sendKeys("inbasekaran");
	   
	}
	
	@When(": user Enters The Address")
	public void user_enters_the_address() {
		
//	inputValue(Payment.getAddress(), "No/2/91 A Kovur Chennai");
	
	booking.getAddress().sendKeys("No/2/91 A Kovur Chennai");
	   
	}
	@When(": user Enters The CCN Number")
	public void user_enters_the_ccn_number() {
		
//	inputValue(Payment.getCCNNumber(), "1234567890123456");
	
	booking.getCCNNumber().sendKeys("1234567890123456");
	
	}
	
	@When(": user Enters The CC TYpe")
	public void user_enters_the_cc_t_ype() {
		
//	singledropdown(Payment.getCCType(), "index", "1");
		
		 WebElement singledropdown = booking.getCCType();
			
	      Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
	 
	}
	@When(": user Enters The CC Expiry Month")
	public void user_enters_the_cc_expiry_month() {
		
//	singledropdown(Payment.getCCExpiryMonth(), "index", "1");
		
		 WebElement singledropdown = booking.getCCExpiryMonth();
			
	      Select select = new Select(singledropdown);
			
			select.selectByIndex(1);
	
	}
	
	@When(": user Enters The CC Expiry Year")
	public void user_enters_the_cc_expiry_year() {
		
//	singledropdown(Payment.getCCExpiryYear(), "index", "10");
	
	 WebElement singledropdown = booking.getCCExpiryYear();
		
     Select select = new Select(singledropdown);
		
		select.selectByIndex(10);

	}
	
	@When(": user Enters The CC CVV")
	public void user_enters_the_cc_cvv() {
		
//    inputValue(Payment.getCC_CVV(), "426");
		
		booking.getCC_CVV().sendKeys("426");

	}
	
	@Then(": User Click on the BookNow Button It Navigates To Booking Cofirmation Page")
	public void user_click_on_the_book_now_button_it_navigates_to_booking_cofirmation_page() {
		
//	clickonElement(Payment.getBookNow());
		
	booking.getBookNow().click();
	
	}
	
	@When(": user Click My Itineary Button")
	public void user_click_my_itineary_button() {
		
		WebDriverWait wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.elementToBeClickable(booking.getMyItineray()));
		
//	    clickonElement(Booking.getMyItineray());
	    booking.getMyItineray().click();
	}
	
	@Then(": user Click Logout Button")
	public void user_click_logout_button() {
		
//		clickonElement(Logout.getLogout());
		
		booking.getLogout().click();


	}

}
