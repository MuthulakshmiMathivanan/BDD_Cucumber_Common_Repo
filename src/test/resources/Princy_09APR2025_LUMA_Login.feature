#@princy
Feature: Validation of Login credentials
  I want to Test Valid and Invalid credentials 

  
  Scenario: Successful Login with Valid Credentials
    Given User be in login page
    When User enter username "princyp6@gmail.com" and password "Princy@119"
    And Click on Sign In button 
    Then User should navigate to "Home Page" 
   