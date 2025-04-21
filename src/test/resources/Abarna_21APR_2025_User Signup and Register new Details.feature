@Abar
Feature: User Should able to signup
Scenario: User should be able to sign up and register new user
    Given Launch browser and navigate to AutomationTester url
    When Click on Signup button
    And Enter name and email address
    And Click 'Signup' button
    And Fill details: Title, Name, Email, Password, Date of birth
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
    And Click 'Create Account button'
    And Finally i close the browserrr