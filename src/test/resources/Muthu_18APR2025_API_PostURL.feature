@MuthuAPI
Feature: Muthu_17APR2025_API_PostURL

  Scenario: Create a new user using POST
    Given the base URI is "https://reqres.in"
    When I send a POST request to "/api/users" with body:
      """
      {
        "name": "John",
        "job": "developer"
      }
      """
    Then the response status code should be 201
    And the response should contain "name" as "John"