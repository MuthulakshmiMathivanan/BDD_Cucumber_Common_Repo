@Abar
Feature: Abarna_22APR_2025_FileUpload for conctact us message

  Scenario: Submit contact form with message and file upload
    Given Launch browser and navigate to AutomationTester url
   Then Verify that home page is visible successfully
    When Click on 'Contact Us' button
    Then Verify 'GET IN TOUCH' is visible
    And Enter name, email, subject and message
    And Click the 'Submit' button
    And Click OK button
    Then Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully
        And Finally i close the browserrr