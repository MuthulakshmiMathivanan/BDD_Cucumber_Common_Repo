
@tag
Feature: Yugi_18APR2025_Web_ContactUsForm
  I want to fill up the detials of contactUs form

  @tag1
  Scenario: To fill up the contact us form in the website
    Given I want to launch the website to check the contact form
    And I want to verify if we are on the home page
    When I click on contact us form
    And Enter the relevant contents
    And click on the submit button
    Then I have to handle the alert
    And check the success message

 
