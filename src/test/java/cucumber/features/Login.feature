@login
Feature: Login feature

  Background:
    Given I am on the login page

  Scenario: As a user, I want to be login in my account
    When I input my username "tomsmith"
    And I input my password "SuperSecretPassword!"
    And I click on the login button
    Then I should see a successful message that "You logged into a secure area!"

