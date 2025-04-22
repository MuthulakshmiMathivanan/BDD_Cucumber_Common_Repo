@Abar

Feature: User Should able to signup

  Scenario: User should be able to sign up 
    Given Launch browser and navigate to AutomationTester url
    Then Verify that home page is visible successfully
    When Click on Signup button
    Then Verify new sign up is visible
    And Enter name and email address
    And Click 'Signup' button
    And Finally i close the browserrr