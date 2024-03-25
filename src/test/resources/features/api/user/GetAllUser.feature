Feature: Get all user
  As a admin
  I want to get all user
  So that I can view list of user

  Scenario: As a user I can get all user
    Given I set API endpoint for get all user
    When I send a request to get all user
    Then I receive status code 200
    And I receive valid data for all user