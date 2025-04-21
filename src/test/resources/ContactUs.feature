@tag
Feature: Yugi_18APR2025_Web_ContactUsForm
  I want to fill up the details of the contact us form

  @tag1
  Scenario: To fill up the contact us form on the website
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on the contact us form
    And I enter the relevant details
    And I click on the submit button
    Then I have to handle the alert
    And I check the success message
