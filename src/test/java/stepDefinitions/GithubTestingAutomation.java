package stepDefinitions;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import io.restassured.response.Response;

import com.google.gson.JsonObject;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;

public class GithubTestingAutomation {

    private Response response;
    private String repoName = "bdd-github-automation";
    private final String username = "rajasekar-inbasekaran-expleo";  
    private final String token = "Bearer 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";
    @Given("I set the GitHub API base URI")
public void i_set_the_git_hub_api_base_uri() {
    RestAssured.baseURI = "https://api.github.com/";
    
}

@When("I create a GitHub repository with name {string} and description {string}")
public void i_create_a_git_hub_repository_with_name_and_description(String name, String description) {

    JsonObject payload = new JsonObject();
    payload.addProperty("name",name);
    payload.addProperty("description", description);
    payload.addProperty("is_template", true);

    response = given()
              .header("Authorization", token)
              .header("Content-Type", "application/json")
              .body(payload.toString())
              .when()
              .post("/user/repos");

}

@Then("I should get status code {int}")
public void i_should_get_status_code(int expectedStatus) {

    assertNotNull(response);
    assertEquals(expectedStatus, response.getStatusCode());
    
}

@Then("I store the repository name")
public void i_store_the_repository_name() {
    repoName = response.jsonPath().getString("name");
    assertNotNull(repoName);
}

@When("I update the repository description to {string}")
public void i_update_the_repository_description_to(String newDescription) {
    
    JsonObject payload = new JsonObject();
    payload.addProperty("name", repoName);
    payload.addProperty("description", newDescription);

    response = given()
        .header("Authorization", token)
        .header("Content-Type", "application/json")
        .body(payload.toString())
        .when()
        .patch("/repos/" + username + "/" + repoName);
}

@When("I get the repository detail")
public void i_get_the_repository_detail() {
    
    response = given()
    .header("Authorization", token)
    .header("Content-Type", "application/json")
            .when()
            .get("/repos/" + username + "/" + repoName);
}

@Then("I should see the updated description {string}")
public void i_should_see_the_updated_description(String expectedDescription) {
    String actual = response.jsonPath().getString("description");
    assertEquals(expectedDescription, actual);

}

@When("I delete the repository")
public void i_delete_the_repository() {
    response = given()
    .header("Authorization", token)
    .header("Content-Type", "application/json")
            .when()
            .delete("/repos/" + username + "/" + repoName);
}

@When("I try to get the repository again")
public void i_try_to_get_the_repository_again() {
    response = given()
    .header("Authorization", token)
    .header("Content-Type", "application/json")
    .when()
    .get("/repos/" + username + "/" + repoName);

    
}

           
}



