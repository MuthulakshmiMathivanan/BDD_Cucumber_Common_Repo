Feature: Muthu_09APR2025_API_ReqResGet

Scenario: To Get the user details from the API
    Given The postman url should be loaded properly
    When I navigated to the get url "/api/users/2"
    Then I can able to validate the response code as 200
    And the json response should contain data

   
 