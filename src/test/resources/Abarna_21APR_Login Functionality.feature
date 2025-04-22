@Abar
Feature: Login Functionality

  Scenario: Login user with incorrect email and password
 Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    And Finally i close the browserrr