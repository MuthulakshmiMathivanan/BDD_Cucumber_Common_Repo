Feature: Test the functionality of domain login
 
  Scenario: Test the banking operations in customer login
    Given I enter the url of banking domains
    When I enter customer banking credentials
    Then I can login banking domain successfully