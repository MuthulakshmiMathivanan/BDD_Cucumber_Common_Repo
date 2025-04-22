@PrincyAll
Feature: Princy_17APR2025_Api_PathParameter
  
  Scenario: Validate GET API using RESTASSURED with path parameter
    Given The API is up
    When I send GET request to "/api/users" with path parameter id as 2
    Then The response status code should will be 200