Feature: Test the functionality of domain login
 
  Scenario: Test the web shop operations in customer login
    Given I enter the registration url of domain
    When I enter new customer credentials
    Then I can register domain successfully