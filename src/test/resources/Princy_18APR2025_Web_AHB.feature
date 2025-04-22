@PrincyAll
Feature: Princy_18APR2025_Web_AHB

   Scenario Outline: Validation of Login Credentials
    Given User is on the Adactin Login page
    When User enters the valid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then User should be redirected to Adactin Homepage

    Examples: 
      | Username      | Password |
      | PrincyPrabha | Princy@119 |

   Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg

    Examples: 
      | Username      | Password |
      | TestingPrincy | Test@12  |
      | Testing       | Test@123 |

   Scenario Outline: Validation of invalid Login Credentials
    Given User is on the Adactin Login page
    When User enters the invalid "<Username>" and "<Password>" for the Adactin site
    And User clicks the login button
    Then It should show the error msg as Enter Username or Enter password

    Examples: 
      | Username      | Password |
      | TestingSuthir |          |
      |               | Test@123 |
      |               |          |
