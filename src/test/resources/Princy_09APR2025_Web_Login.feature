@Princy
Feature: Validation of Login credentials
  I want to Test Valid and Invalid credentials

  Background: 
    Given User be in login page
    

  Scenario: Successful Login with Valid Credential
    When User enter username "princyp6@gmail.com" and password "Princy@119"
    And Click on Sign In button
    Then User should navigate to "Home Page"

  Scenario Outline: Login with InValid Credential
    When User enter username "<username>" and "<password>"
    And Click on Sign In button
    Then User should see error message

    Examples: 
      | username            | password     | 
      | princy@gmail.com    | Samiksha@26  | 
      | princyp6@gmail.com  | WrongPass123 | 
      | wronguser@gmail.com | Princy@119   | 
      |                     | Princy@119   | 
      | princyp6@gmail.com  |              | 
      | princy6gmail.com    | Princy@119   | 