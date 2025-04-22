@PrincyAll
Feature: Princy_15APR2025_Web_OrangeHRM_Search
  As a user
  I want to search for modules in the sidebar and scroll the list    
    
  Scenario: Search for a module using sidebar search
    Given The user should be logged in
    When I enter "Recruitment" in the sidebar search field
    Then I should see the "Recruitment" module visible in the sidebar
