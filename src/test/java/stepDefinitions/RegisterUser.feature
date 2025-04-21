Feature: Yugi_16APR2025_Web_Register_new_user 

  Scenario: Register and delete a user account
    Given I want to launch the browser and navigate to the Automation Exercise website
    Given I verify that the home page is visible successfully
    When I click on the Signup/Login button
    When I verify that the New User Signup option is available
    When I enter the name and email address
    When I click the Signup button
    Then I verify that 'ENTER ACCOUNT INFORMATION' section is displayed
    Then I fill in all the required details
    Then I click the Create Account button
    Then I verify that the account creation confirmation message is displayed
    Then I click the Continue button
    Then I verify that I am logged in as the registered username
    
