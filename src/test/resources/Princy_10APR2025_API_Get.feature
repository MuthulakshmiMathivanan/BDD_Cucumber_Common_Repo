
@api
Feature: Validate Activity API

  Scenario: Get all activities and validate the first one
    Given The API is up and running
    When I send a GET request to "/api/v1/Activities"
    Then The response status code should be 200
    And The first activity should have id 1 and title "Activity 1"