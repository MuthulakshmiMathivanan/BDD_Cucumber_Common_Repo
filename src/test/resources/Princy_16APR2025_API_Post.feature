@PrincyAll
Feature: Princy_16APR2025_Api_POST
  I want to validate POST API

  Scenario: Validate POST API using RESTASSURED
    Given The API is working
    When I send POST request to endpoint "api/users" with body
      """
      {
        "name": "morpheus",
        "job": "leader"
      }
      """
    Then The response code should be 201
