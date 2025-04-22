@Abar

Feature: Abarna_21APR_2025_Logout User

  Scenario: Logout user successfully
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
   Then Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Clicks 'login' button
    Then Verify that 'Logged in as username' is visible
    When Click the 'Logout' button
    Then Verify that user is navigated to login page