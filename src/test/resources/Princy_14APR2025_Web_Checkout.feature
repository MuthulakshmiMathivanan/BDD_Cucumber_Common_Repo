@PrincyAll
Feature: Princy_14APR2025_Web_Checkout

  Scenario: Proceed to checkout with an item in the cart
    Given the user is logged in and has "Sauce Labs Bike Light" in the cart
    When the user navigates to the cart page
    And proceeds to the checkout
    Then the checkout information form should be displayed