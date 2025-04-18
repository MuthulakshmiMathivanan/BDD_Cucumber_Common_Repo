
package stepDefinitions;

import static io.restassured.RestAssured.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class APIMGet {

    private Response response;

    @Given("the API's availability check")
    public void the_api_s_availability_check() {
        baseURI = "https://reqres.in";
    }

    @When("I sends a GET request to {string}")
    public void i_sends_a_get_request_to(String endpoint) {
        response = given().when().get(endpoint);
    }

    @Then("the response's status code is {int}")
    public void the_response_s_status_code_is(Integer int1) {
        response.then().statusCode(int1);
    }

    @Then("validate the response should contain user detail")
    public void validate_the_response_should_contain_user_detail() {
        response.prettyPrint();
    }
}
