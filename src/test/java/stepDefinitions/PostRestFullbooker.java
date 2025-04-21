package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;

import org.json.JSONObject;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.google.gson.JsonObject;

public class PostRestFullbooker {

   RequestSpecification request;
    Response response;

    @Given("I set the base URI")
    public void i_set_base_uri() {
        baseURI = "https://restful-booker.herokuapp.com";
    }

    @When("I send POST request to \\/auth with valid credentials")
    public void i_send_post_request_to_auth() {
        JSONObject payload = new JSONObject();
        payload.put("username", "admin");
        payload.put("password", "password123");

        request = given()
                    .header("Content-Type", "application/json")
                    .body(payload.toString());

        response = request.post("/auth");
        response.then().log().all();
    }

    @Then("I should get 200 OK response")
    public void i_should_get_200_ok_response() {
        assertEquals(200, response.getStatusCode());
    }

    @And("I should receive a token in response")
    public void i_should_receive_token() {
        String token = response.jsonPath().getString("token");
        assertNotNull(token);
        System.out.println("Generated Token: " + token);
        response.then().log().all();
    }




   
}


