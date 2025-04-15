package stepDefinitions;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.*;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class RequresAPIAutomation {

	RequestSpecification request;

	Response response;


	@Given("The Base URI is {string}")
	public void the_base_uri_is(String baseURI) {

		RestAssured.baseURI=baseURI;
		request= RestAssured.given().log().all();

	}


	@When("I send GET request to {string} with query parameter {string}")
	public void i_send_get_request_to_with_query_parameter(String endpoint, String queryParam) {

		response = request.get(endpoint + "?" + queryParam).then().log().all().extract().response();

	}


	@Then("The Respose Code Should be {int}")
	public void the_respose_code_should_be(Integer statusCode) {

		assertEquals(statusCode.intValue(),response.getStatusCode());

	}


	@Then("The ID of the First User Name Should Be {int}")
	public void the_id_of_the_first_user_name_should_be(Integer expectedId) {

		int actualId = response.jsonPath().getInt("data[0].id");
		assertEquals(expectedId.intValue(), actualId);

		System.out.println("Console is working");
		//	String res= response.prettyPrint();
		//	System.out.println(res);



	}








}
