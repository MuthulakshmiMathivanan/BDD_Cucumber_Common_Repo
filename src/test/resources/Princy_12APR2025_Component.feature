@PrincyAll
Feature: Princy_12APR2025_Web_Component
 
  Background:
    Given the user is on the homepage
    When the user navigates to Components -> Monitors
    Then the Monitors page should be displayed with title "Monitors"

  Scenario: Change view to List
    When the user selects List view
    Then the products should be displayed in list format

  Scenario: Change view to Grid
    When the user selects Grid view
    Then the products should be displayed in grid format

 
