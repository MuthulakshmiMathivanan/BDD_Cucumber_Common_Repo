package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;
import static org.junit.Assert.*;


public class PostRestFullbooker {

    RequestSpecification request;
    Response response;

    @Given("I set the base URI")
    public void i_set_base_uri() {
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
    }

    @When("I send POST request to \\/auth with valid credentials")
    public void i_send_post_request_to_auth() {
        JsonObject payload = new JsonObject();
        payload.addProperty("username", "admin");
        payload.addProperty("password", "password123");

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
        assertNotNull("Token should not be null", token);
        System.out.println("Generated Token: " + token);
    }
}
