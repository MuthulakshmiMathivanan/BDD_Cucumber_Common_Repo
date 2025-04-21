@Muthu
Feature: Muthu_16APR2025_Web_DBReg
 
Scenario: Test the banking operations in customer Registration
    Given I enter the url of Registraion domain
    When I enter customer Registration Details
    Then I can able to Registration successfully

Scenario: Test the banking operations in customer CompDBlogin
    Given I enter the url of domain CompDBlogin
    When I enter customer credentials of CompDBlogin
    Then I can login domain of CompDBlogin successfully

Scenario: Test the Search  ComputerDatabase
    Given I enter the Search url of ComputerDatabase
    When I enter the ComputerDatabase name 
    Then I can able to Search ComputerDatabase

Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase
