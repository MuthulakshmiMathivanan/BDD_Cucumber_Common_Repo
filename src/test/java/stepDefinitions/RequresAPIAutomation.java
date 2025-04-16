package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RequresAPIAutomation {

	RequestSpecification reqspec;
    Response response;
   
    @Given("The API is running")
    public void the_api_is_running() {
        // base URI
        RestAssured.baseURI = "https://reqres.in/";
        // to perform get
       
       
       
    }
    @When("I send GET request with end ponit {string}")
    public void i_send_get_request_with_end_ponit(String endPonit) {
       
        reqspec =   RestAssured.given();
        response = reqspec.get(endPonit);
       
       
    }
    @Then("The response status code should be {int}")
    public void the_response_status_code_should_be(Integer statusCode) {
       
        assertEquals((int) statusCode, response.getStatusCode());
        response.then().log().all();
    }







}
