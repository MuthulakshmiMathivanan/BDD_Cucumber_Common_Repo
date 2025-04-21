
Feature: Yugi_15APR2025_Web_LoginwithCorrectCredentials
  I want to login to the automation website using the correct credentials

  @tag1
  Scenario: I want to login to the automation website using the correct credentials
    Given I want to launch the automation exercise website
    And I verify that the home page is visible
    When I click on the signup/login button
    And I verify that the "Login to your account" section is visible
    And I enter the correct email address and password
    And I click the login button
    Then I verify that the username is displayed as logged in
    And I check if the delete account button is visible

   
 