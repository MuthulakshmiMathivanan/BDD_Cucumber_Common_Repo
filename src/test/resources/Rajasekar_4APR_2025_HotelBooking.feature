Feature: Rajasekar_4APR_2025_HotelBooking

Scenario:

Given user launch The Application  
When  user Enter The Username In Username Filed
And : User Enter The Password In Password Field
Then : User Click On The Login Button And It Navigates To Search Hotel Page

When : user Select The Location
When : user Select The Hotel
When : user Select The RoomType
When : user Select The NumberofRooms
When : user Enters The CheckinDate
When : user Enters The CheckOutDate
When : user Select The AdultPerRoom
When : user Select The ChildrenPerRoom
Then : User Click on the Search Button And It Navigates To Select Hotel page

When : user Select The RadioButton
When : user Select The ContinueButton

When : user Enters The FirstName
When : user Enters The LastName
When : user Enters The Address
When : user Enters The CCN Number
When : user Enters The CC TYpe
When : user Enters The CC Expiry Month
When : user Enters The CC Expiry Year
When : user Enters The CC CVV 
Then : User Click on the BookNow Button It Navigates To Booking Cofirmation Page


When : user Click My Itineary Button

Then : user Click Logout Button



