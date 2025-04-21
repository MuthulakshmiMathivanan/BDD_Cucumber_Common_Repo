@MuthuAPI
Feature: Muthu_17APR2025_API_GetURL
 
  Scenario: Get user detail
    Given the API's availability check 
    When I sends a GET request to "/api/users/2" 
    Then the response's status code is 200 
    And validate the response should contain user detail