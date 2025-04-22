@PrincyAll
Feature: Princy_17APR2025_UserDetailsById
Scenario: Validate GET API to fetch user details using path parameter
    Given The User API is available
    When I send GET requests "/api/users" with path parameter 7
    Then The API response status code will be 200
    And The response should contain user data