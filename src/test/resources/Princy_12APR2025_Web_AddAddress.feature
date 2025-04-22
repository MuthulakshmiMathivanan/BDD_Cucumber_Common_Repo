@PrincyAll
Feature: Princy_11APR2025_Web_MyAccount_Add Address
  
  As a registered user
  I want to be able to add new addresses to my address book in my account
  So that I can use these addresses for shipping and billing during checkout.

  Scenario: Adding a new valid shipping address
    Given I am logged in to my account
    And I navigate to the Address Book section
    When I click on the Add Address button
    And I enter the following shipping address details:
      | First Name | Princy         |
      | Last Name  | PS             |
      | Company    | Exp Inc        |
      | Address 1  | 123 Main St    |
      | Address 2  | Apt 4B         |
      | City       | Chennai        |
      | Post Code  |          12345 |
    And I select country and region from dropdown
    And I choose  Default Address
    And I click the Continue button to proceed
    Then the new shipping address should be successfully added to my address book
    And I should see a success message indicating the address has been added
    And the newly added address should be marked as the default address in my address book
