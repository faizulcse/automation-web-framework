@hover
Feature: Hover feature

  Background:
    Given I am on the hover over page

  Scenario Outline: As a user, I can hover over icon on the figure
    When I hover over icon on the <figure>
    Then I should verify figure <title> and link <text>
    Examples:
      | figure | title       | text         |
      | 1      | name: user1 | View profile |
      | 2      | name: user2 | View profile |
      | 3      | name: user3 | View profile |