@PrincyAll
Feature: Princy_14APR2025_Web_CartPage
  I want to check for cart page
  
Scenario: Verify product is added to the cart page
    Given I have added "Sauce Labs Backpack" to the cart
    When I click the cart icon
    Then I should be on the cart page
    And I should see "Sauce Labs Backpack" listed in the cart
