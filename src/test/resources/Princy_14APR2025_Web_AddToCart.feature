@PrincyCart
Feature: Login and add a product to cart
  I want to add product to cart
 
  Scenario: Add a single product to the cart 
    Given I am on the Swag Labs inventory page
    When I click the "Add to cart" button for "Sauce Labs Backpack"
    Then the cart badge should display "1"  