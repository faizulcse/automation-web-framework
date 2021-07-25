@dropdown
Feature: Dropdown feature

  Background:
    Given I am on the dropdown page

  Scenario: As a user, I can select option from dropdown options
    When I select "Option 1" from the drop down
    Then I should verify that selected options size is 1
    And I should verify that selected options contains "Option 1"