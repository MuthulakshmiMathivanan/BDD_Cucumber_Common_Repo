package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class APIMPost {

    private String baseUri;
    private Response response;
    private String requestBody;

    @Given("the base URI is {string}")
    public void setBaseUri(String uri) {
        baseUri = uri;
    }

    @When("I send a POST request to {string} with body:")
    public void sendPostRequest(String endpoint, String body) {
        requestBody = body;
        response = given()
                        .baseUri(baseUri)
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                   .when()
                        .post(endpoint);
    }

    @When("I send a PUT request to {string} with body:")
    public void sendPutRequest(String endpoint, String body) {
        requestBody = body;
        response = given()
                        .baseUri(baseUri)
                        .header("Content-Type", "application/json")
                        .body(requestBody)
                   .when()
                        .put(endpoint);
    }

    //@Then("the response status code should be {int}")
   // public void verifyStatusCode(int expectedStatusCode) {
       // response.then().statusCode(expectedStatusCode);
   // }

   // @Then("the response should contain {string} as {string}")
  //  public void verifyResponseField(String key, String value) {
     //   response.then().body(key, equalTo(value));
   // }
}