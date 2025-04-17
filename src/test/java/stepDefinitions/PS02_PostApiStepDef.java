package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PS02_PostApiStepDef {

    RequestSpecification reqspec;
    Response response;

    @Given("The API is working")
    public void the_api_is_running() {
        RestAssured.baseURI = "https://reqres.in/";
    }

    @When("I send POST request to endpoint {string} with body")
    public void i_send_post_request_to_endpoint_with_body(String endpoint, String body) {
        reqspec = RestAssured
                    .given()
                    .header("Content-Type", "application/json")
                    .body(body);

        response = reqspec.post(endpoint);
    }

    @Then("The response code should be {int}")
    public void the_response_code_should_be(Integer statusCode) {
        assertEquals((int) statusCode, response.getStatusCode());
        response.then().log().all();
    }
}
