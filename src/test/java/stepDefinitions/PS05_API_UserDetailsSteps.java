package stepDefinitions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class PS05_API_UserDetailsSteps {

    private Response response;

    @Given("The User API is available")
    public void the_user_api_is_available() {
        RestAssured.baseURI = "https://reqres.in";
    }

    @When("I send GET requests {string} with path parameter id as {int}")
    public void i_send_get_request_with_path_parameter(String endpoint, int id) {
        response = given()
                      .pathParam("id", id)
                   .when()
                      .get(endpoint + "/{id}");
    }

    @Then("The API response status code should be {int}")
    public void the_api_response_status_code_should_be(int expectedStatusCode) {
        response.then().statusCode(expectedStatusCode);
    }

    @And("The response should contain user data")
    public void the_response_should_contain_user_data() {
        response.then().body("data", notNullValue())
                       .body("data.id", greaterThan(0))
                       .body("data.email", containsString("@"));
    }
}
