Feature: Wysiwyg Editor feature

  Background:
    Given I am on the Wysiwyg Editor page

  Scenario: As a user, I want to edit, delete and modify the Wysiwyg Editor
    When I clear the Wysiwyg Editor text area
    And I input "Hello " in the text area
    And I increase the text identition
    And I input "World!" in the text area
    And I decrease the text identition
    Then I should see the that the editor text is "Hello World!"
