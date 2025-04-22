@Abar
Feature: Abarna_22APR_2025_Test Cases Page Verification

  Scenario: Verify user can navigate to the Test Cases page successfully
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on 'Test Cases' button
    Then Verify user is navigated to test cases page successfully
        And Finally i close the browserrr