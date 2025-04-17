@Muthu
Feature: Muthu_16APR2025_Web_DBSearch
 
Scenario: Test the cancel of ComputerDatabase
    Given I enter the cancel url of ComputerDatabase
    When I enter the ComputerDatabase Info
    Then I can able to cancel ComputerDatabase

Scenario: Test the Search  ComputerDatabase
    Given I enter the Search url of ComputerDatabase
    When I enter the ComputerDatabase name 
    Then I can able to Search ComputerDatabase
