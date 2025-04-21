@MuthuAPI
Feature: Muthu_17APR2025_API_PUTURL
Scenario: Update a user using PUT
    Given the base URI is "https://reqres.in"
    When I send a PUT request to "/api/users/2" with body:
      """
      {
        "name": "Jane",
        "job": "manager"
      }
      """
    Then the response status code should be 200
    And the response should contain "job" as "manager"