@Abar
Feature: Abarna_22APR_2025Contact Us Form

  Scenario: Submit contact form with message and file upload
    Given Launch browser and navigate to AutomationTester url
   Then Verify that home page is visible successfully
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
        And Finally i close the browserrr