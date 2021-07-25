@keypress
Feature: Key Presses feature

  Background:
    Given I am on the key presses page

  Scenario: As a user, I want to press backspace key
    When I enter text with BACK_SPACE key
    Then I should see that "You entered: BACK_SPACE" message is displayed

  Scenario: As a user, I want to press pi key
    When I enter pi key with pi value
    Then I should see that "You entered: 4" message is displayed