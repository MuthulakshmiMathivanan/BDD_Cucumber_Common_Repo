
@tag
Feature: Yugi_17APR2025_Web_SignUpWithExistingEmail
  I want to check if the error message pops up when i try to signup with already existing email

  @tag1
  Scenario: Sign up with existing email 
    Given I want to launch the Automation Exercise website
    And I verify I landed on the home page
    And I want to click on signup button
    When I enter the already existing email and name
    And click on signup button
    Then I should see error popup stating Email already exists
   

  