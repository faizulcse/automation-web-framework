@wait
Feature: Selenium wait feature

  Background:
    Given I am on the dynamic loading page

  Scenario: As a user, I wait until hidden element is visible
    When I click on the example1 and start button
    Then I should verify that "Hello World!" message is visibled

  Scenario: As a user, I wait until hidden element is rendered
    When I click on the example2 and start button
    Then I should verify that "Hello World!" message is rendered