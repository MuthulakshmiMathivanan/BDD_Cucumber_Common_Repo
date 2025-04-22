@PrincyAll
Feature: Princy_16APR2025_Api_GET
  I want to vaildate get APi
 
  Scenario: Validate GET api using RESTASSURED
    Given The API is running
    When I send GET request with end ponit "api/users?page=2"
    Then The response status code should be 200
    