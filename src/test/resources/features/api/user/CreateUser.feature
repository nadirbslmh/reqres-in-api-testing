Feature: Create a user
  As a admin
  I want to create a user
  So that the user data is stored

  Scenario: As a admin I can create a user
    Given I set API endpoint for create a user
    When I send a request to create a user
    Then I receive status code 201
    And I receive valid data for created user