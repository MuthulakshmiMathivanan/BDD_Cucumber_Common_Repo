package stepDefinitions;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.equalTo;

public class ActivityStepDef {

    Response response;

    @Given("The API is up and running")
    public void the_api_is_up_and_running() {
        RestAssured.baseURI = "https://fakerestapi.azurewebsites.net";
    }

    @When("I send a GET request to {string}")
    public void i_send_a_get_request_to(String endpoint) {
        response = RestAssured
                        .given()
                        .when()
                        .get(endpoint);
    }

    @Then("The response status code should be {int}")
    public void the_response_status_code_should_be(Integer expectedStatusCode) {
        assertEquals(expectedStatusCode.intValue(), response.getStatusCode());
    }

    @Then("The first activity should have id {int} and title {string}")
    public void the_first_activity_should_have_id_and_title(Integer expectedId, String expectedTitle) {
        int actualId = response.jsonPath().getInt("[0].id");
        String actualTitle = response.jsonPath().getString("[0].title");

        assertEquals(expectedId.intValue(), actualId);
        assertEquals(expectedTitle, actualTitle);
    }
}

