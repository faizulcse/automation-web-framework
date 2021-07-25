@navigation
Feature: Selenium navigation feature

  Background:
    Given I am on the home page

  Scenario: As a user, I can navigate different page
    When I am dynamic loading page and click on example1
    And I navigate to back
    And I refresh the page
    And I navigate to Forward
    And I go to url "https://google.com/"
    Then I verify that the page title is "Google"

  Scenario: As a user, I can navigate different page
    When I navigate to multiple windows page
    And I click on click here button
    And I switch to tab "New Window"
    Then I verify that the page title is "New Window"