

@tag
Feature: Yugi_16APR2025_Web_LoginWithIncorrectCredentials
  I want to check whether the website throws error in case anyone logs in with incorrect credentails

  @tag1
  Scenario: LoginWithIncorrectCredentials
    Given I want to launch the Automation Website
    And Verfiy if the home page is available
    When I try to enter incorrect credentials
    And click on login button
    Then Error message should popup