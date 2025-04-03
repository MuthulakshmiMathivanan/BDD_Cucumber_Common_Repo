
@tag
Feature: Register and login to the bank website
 

  @tag1
  Scenario: Register a new user in ParaBank Website
    Given I want to Register a new user in ParaBank Website
    When I log in with the registered credentials
    Then I should be successfully logged in

    
