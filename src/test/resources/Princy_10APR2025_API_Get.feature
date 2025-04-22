@PrincyAll
Feature: Princy_10APR2025_API_Get

  Scenario: Get all activities and validate the first one
    Given The API is up and running
    When I send a GET requests to "/api/v1/Activities"
    Then The responses status code should be 200
    And The first activity should have id 1 and title "Activity 1"