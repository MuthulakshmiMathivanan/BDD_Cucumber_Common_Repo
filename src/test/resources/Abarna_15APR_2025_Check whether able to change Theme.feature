@TestAbar
Feature: Abarna_BBD_16APR_2025_Check whether able to change Theme
 Scenario:  Check whether able to change Theme
    Given user is on login page
    When user enterusername and password
    And I logged into the Homepage
    Then I select the "Dashboard" field
    Then I click to change theme into "Dark"
    And I change the theme into "light"   
    And Finally i close the browser
    