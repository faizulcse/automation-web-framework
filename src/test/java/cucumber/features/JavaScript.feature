Feature: Java Script infinite scroll feature

  Background:
    Given I am on the infinite scroll page

  Scenario: As a user, I can scroll to down infinitely
    When I scroll down to 50 paragraphs
    Then I should see the 50 th paragraph is displayed