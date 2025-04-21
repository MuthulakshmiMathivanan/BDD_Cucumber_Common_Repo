package stepDefinitions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class PS04_PathparamApiStepDef {

    private Response response;

    @Given("The API is up")
    public void the_api_is_up() {
        // Set base URI - Update if needed
        RestAssured.baseURI = "https://reqres.in";
    }

    @When("I send GET request to {string} with path parameter id as {int}")
    public void i_send_get_request_with_path_param(String endpoint, int id) {
        response = given()
                      .pathParam("id", id)
                   .when()
                      .get(endpoint + "/{id}");
    }

    @Then("The response status code should will be {int}")
    public void the_response_status_code_should_be(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }
}
