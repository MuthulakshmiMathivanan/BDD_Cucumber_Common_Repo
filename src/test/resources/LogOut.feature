
@tag
Feature: Yugi_18APR2025_Web_logout_feature 
  I want to check if the logout button is working correctly

  @tag1
  Scenario: Logout feature
    Given I want to launch the website
    And verfiy if the home page is visible
    When I click on login button
    And Enter the correct credentials
    And I click on the login button
    Then I will check if the login is done successfully
    And i will now check if the logout button is available
    And I will click the logout button
    And I will check if the logout is correctly happened


