@alerts
Feature: Alerts feature

  Background:
    Given I am on the JS alert page

  Scenario: As a user, I want to click on alert OK button
    When I click on the JS alert button
    And I click on the JS alert accept button
    Then I should see the message "You successfully clicked an alert"

  Scenario: As a user, I want to click on alert CANCEL button
    When I click on the JS confirm button
    And I click on the JS dismiss button
    Then I should see the alert text message is "I am a JS Confirm"

  Scenario: As a user, I want to insert text on alert input field
    When I click on the JS prompt button
    And I insert "TAU rocks!" text on the JS input field
    And I click on the JS alert OK button
    Then I should see the message "You entered: TAU rocks!" is displayed
