package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingHotel {
	
	 public static WebDriver driver;
	
	@FindBy(xpath = "//*[@id='username']")

	private WebElement user_name;

	@FindBy(xpath = "//*[@id=\'password\']")

	private WebElement password;

	@FindBy(xpath = "//*[@id=\"login\"]")

	private WebElement submit;
	
	@FindBy(xpath = "//*[@id=\"location\"]")

	private WebElement Location;

	@FindBy(xpath = "//*[@id=\"hotels\"]")

	private WebElement Hotels;

	@FindBy(xpath = "//*[@id=\"room_type\"]")

	private WebElement RoomType;


	@FindBy(xpath = "//*[@id=\"room_nos\"]")

	private WebElement NumberofRooms;

	@FindBy(xpath = "//*[@id=\"datepick_in\"]")

	private WebElement Checkindate;

	@FindBy(xpath = "//*[@id=\"datepick_out\"]")

	private WebElement Checkoutdate;

	@FindBy(xpath = "//*[@id=\"adult_room\"]")

	private WebElement AdultPerRoom;

	@FindBy(xpath = "//*[@id=\"child_room\"]")

	private WebElement Childrenperroom;
	
	@FindBy(xpath = "//*[@id=\"Submit\"]")

	private WebElement searchhotel;
	
	@FindBy(xpath = "//*[@id=\"radiobutton_0\"]")

	private WebElement SelectRadioButton;

	@FindBy(xpath = "//*[@id=\"continue\"]")
	
	private WebElement ContinueButton;
	
	@FindBy(xpath = "//*[@id=\"first_name\"]")

	private WebElement FirstName;

	@FindBy(xpath = "//*[@id=\"last_name\"]")

	private WebElement LastName;

	@FindBy(xpath = "//*[@id=\"address\"]")

	private WebElement Address;
	
	@FindBy(xpath = "//*[@name='my_itinerary']")

	private WebElement ClickMyItineray;


	@FindBy(xpath = "//*[@id=\"cc_num\"]")

	private WebElement CCN_Number;
	
	@FindBy(xpath = "//*[@id=\"cc_type\"]")

	private WebElement CC_Type;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_month\"]")

	private WebElement CC_ExpiryMonth;
	
	@FindBy(xpath = "//*[@id=\"cc_exp_year\"]")

	private WebElement CC_ExpiryYear;
	
	@FindBy(xpath = "//*[@id=\"cc_cvv\"]")

	private WebElement CC_CVV;
	
	@FindBy(xpath = "//*[@id=\"book_now\"]")

	private WebElement BookNow;
	
	@FindBy(xpath = "//*[@id=\"logout\"]")

	private WebElement Logout;
	
	public WebDriver getDriver() {
		return driver;
	}
	public WebElement getUser_name() {
		return user_name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	public WebElement getLocation() {
		return Location;
	}

	public WebElement getHotels() {
		return Hotels;
	}

	public WebElement getRoomtype() {
		return RoomType;
	}
	
	public WebElement getNumberofrooms() {
		return NumberofRooms;
	}

	public WebElement getcheckinDate() {
		return Checkindate;
	}

	public WebElement getcheckoutDate() {
		return Checkoutdate;
	}
	
	public WebElement getadultperroom() {
		return AdultPerRoom;
	}
	
	public WebElement getchildperroom() {
		return Childrenperroom;
	}
	
	public WebElement getsearchhotel() {
		return searchhotel;
	}
	
	public WebElement getMyItineray() {
		return ClickMyItineray;
	}
	
	public WebElement getradiobutton() {
		return SelectRadioButton;
	}
	
	public WebElement getcontinuebutton() {
		return ContinueButton;
	}
	
	public WebElement getFirstName() {
		return FirstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getAddress() {
		return Address;
	}
	
	public WebElement getCCNNumber() {
		return CCN_Number;
	}
	
	public WebElement getCCType() {
		return CC_Type;
	}
	
	public WebElement getCCExpiryMonth() {
		return CC_ExpiryMonth;
	}
	
	public WebElement getCCExpiryYear() {
		return CC_ExpiryYear;
	}
	
	public WebElement getCC_CVV() {
		return CC_CVV;
	}
	
	public WebElement getBookNow() {
		return BookNow;
	}
	
	public WebElement getLogout() {
		
		return Logout;
	}
	
	
	
	public  BookingHotel(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


}
