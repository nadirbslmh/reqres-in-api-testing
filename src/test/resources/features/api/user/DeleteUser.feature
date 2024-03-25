Feature: Delete user
  As a admin
  I cn delete user
  So that the user is removed from the system

  Scenario: As a admin I can delete user
    Given I set API endpoint for delete user
    When I send a request to delete a user
    Then I receive status code 204