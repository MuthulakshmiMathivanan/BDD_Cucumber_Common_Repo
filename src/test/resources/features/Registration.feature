
 Feature: User Registration and Login in ParaBank

  Scenario: Register and login to ParaBank
    Given I launch the ParaBank website
    When I register a new user
    When I log in with the registered credentials
    Then I should be successfully logged in


    
