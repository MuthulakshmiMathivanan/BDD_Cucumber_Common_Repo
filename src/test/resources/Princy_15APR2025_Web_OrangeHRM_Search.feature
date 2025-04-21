@PrincyOrangeHRM
Feature: Princy_15APR2025_Web_OrangeHRM_Search
  As a user
  I want to search for modules in the sidebar and scroll the list
  
  Background:
    Given The user should be login page
    When The user enter username "Admin" and password "admin123"
    And click on the "Login" button
    Then user should be directed to Dashboard page with title "OrangeHRM"

  Scenario: Search for a module using sidebar search
    When I enter "Recruitment" in the sidebar search field
    Then I should see the "Recruitment" module visible in the sidebar
