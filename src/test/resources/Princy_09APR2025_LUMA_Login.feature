#@princy
Feature: Princy_09APR2025_LUMA_Login
  I want to Test Valid and Invalid credentials 

  
  Scenario: Successful Login with Valid Credential
    Given User be in login page
    When User enter username "princyp6@gmail.com" and password "Princy@119"
    And Click on Sign In button
    Then User should navigate to "Home Page"
   