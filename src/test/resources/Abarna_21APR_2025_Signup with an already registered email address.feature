@Abar

Feature: Abarna_21APR_2025_Signup with an already registered email address
 Scenario: Signup with an already registered email address
   Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    And Enter name and already registered email address
    And Click the 'Signup' button
    Then Verify error 'Email Address already exist!' is visible
    And Finally i close the browserrr