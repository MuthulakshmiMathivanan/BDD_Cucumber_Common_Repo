@PrincyAll
Feature: Princy_15APR2025_Web_OrangeHRM_AddEmp
   As an HR Admin
  I want to add a new employee
  
  Background:
    Given The user should be login page
    When The user enter username "Admin" and password "admin123"
    And click on the "Login" button
    Then user should be directed to Dashboard page with title "OrangeHRM"

  Scenario: Add a new employee with login credentials
    When I navigate to the "Add Employee" page
    And I enter employee full name with first name "Princy", middle name "P", and last name "Prabha"
    And I enter employee ID as "0388"
    And I enable "Create Login Details"
    And I enter login username as "Pri.P123"
    And I enter password as "Password@123" and confirm password as "Password@123"
    And I select status as "Enabled"
    And I click on the "Save" button
    Then the employee should be added successfully
  