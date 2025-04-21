package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PS03_PutApiStepDef {

    RequestSpecification reqspec;
    Response response;

    @Given("The API is works")
    public void the_api_is_running() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("I send PUT request to endpoint {string} with body")
    public void i_send_put_request_to_endpoint_with_body(String endpoint, String body) {
        reqspec = RestAssured
                    .given()
                    .header("Content-Type", "application/json")
                    .body(body);

        response = reqspec.put(endpoint);
    }

    @Then("The response with status code should be {int} seen")
    public void the_response_with_status_code_should_be_seen(Integer statusCode) {
        assertEquals((int) statusCode, response.getStatusCode());
        response.then().log().all();
    }
}
