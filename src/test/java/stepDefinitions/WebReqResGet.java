package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WebReqResGet {
    WebDriver driver = new ChromeDriver(); 
@Given("The postman url should be loaded properly")
public void the_postman_url_should_be_loaded_properly() {
    RestAssured.baseURI = "https://reqres.in/api";
}
@When("I navigated to the get url of first link")
public void i_navigated_to_the_get_url_of_first_link() {
    // RequestSpecification reqSpec = RestAssured.given();
    // response = reqSpec.queryParam("page", 1).get("/users");
    System.out.println("Get request is sent");
}
@Then("I can able to take the request")
public void i_can_able_to_take_the_request() {
    //Assert.assertEquals((int) statusCode, response.getStatusCode());
}

}
