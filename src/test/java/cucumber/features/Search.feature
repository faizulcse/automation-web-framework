Feature: Search for Products

  Scenario: Click search result
    Given there is a product named Apple TV
    And I search for the product
    When I click the product
    Then I should be taken to the product page