@PrincyAll
Feature: Princy_16APR2025_Api_PUT
  I want to validate PUT API

  Scenario: Validate PUT API using RESTASSURED
    Given The API is works
    When I send PUT request to endpoint "api/users/2" with body
      """
      {
        "name": "morpheus",
        "job": "zion resident"
      }
      """
    Then The response with status code should be 200 seen
