@PrincyAll
Feature: Princy_15Apr2025_Web_OrangeHRM_Admin

  As an Admin
  I want login to view dashboard
  
  Scenario: Login as Admin with credentials 
    Given The user should be login page
    When The user enter username "Admin" and password "admin123"
    And click on the "Login" button
    Then user should be directed to Dashboard page with title "OrangeHRM"
    