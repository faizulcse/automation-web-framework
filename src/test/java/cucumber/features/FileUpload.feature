@fileupload
Feature: File upload feature

  Background:
    Given I am on the file upload page

  Scenario: As a user, I want to upload a file
    When I choose a file and click on upload button
    Then I should see the uploaded file name is displayed