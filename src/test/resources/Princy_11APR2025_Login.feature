@PrincyAll
Feature: Princy_11APR_2025_Web_Login_Functionality
    As a user i want to login the page using the given credentials

  Scenario: Validation of login using valid credentials
    Given the user should be in login page
    When the user enter the username "princyprabha2609@gmail.com" and password "Princy@119"
    And the user press the login button
    Then it should be redirected to homepage with title "My Account"

  Scenario Outline: Validation of login using invaild credentials
    Given the user should be in login page
    When the user enters the invalid username "<username>" and password "<password>"
    And the user clicks on login button
    Then the user should get error message "<errorMessage>"

    Examples: 
      | username                   | password   | errorMessage                                          |
      | princyprabha2609@gmail.com | Chinnu@211 | Warning: No match for E-Mail Address and/or Password. |
      | princyp6@gmail.com         | Princy@211 | Warning: No match for E-Mail Address and/or Password. |
      | princyprabha2609@gmail.com | Chinnu@211 | Warning: No match for E-Mail Address and/or Password. |
