@forgotpassword
Feature: Forgot password feature

  Background:
    Given I am on the forgot password page

  Scenario: As a user, I can recover my forgot password
    When I input my recover email "tau@gmail.com"
    And I click on the retrive password button
    Then I should see successfully email sent message
