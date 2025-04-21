Feature: Yugi_14APR2025_WEB_Register_a_new_user_for_the_Automation_Exercise_Website

  Scenario: Register a new user
    Given I want to launch the browser and navigate to the Automation Exercise website
    And I verify that the home page is visible successfully
    When I click on the Signup/Login button
    And I verify that the New User Signup option is available
    And I enter the name and email address
    And I click the Signup button
    Then I verify that 'ENTER ACCOUNT INFORMATION' section is displayed
    And I fill in all the required details
    And I click the Create Account button
    And I verify that the account creation confirmation message is displayed
    And I click the Continue button
    And I verify that I am logged in as the registered username
    And I click the Delete Account button
    Then I verify that the 'ACCOUNT DELETED!' message is shown and I click the Continue button
