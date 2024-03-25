Feature: Update user
  As a admin
  I can update user data
  So that the user data is updated

  Scenario: As a admin I can update user
    Given I set API endpoint for update user
    When I send a request to update user
    Then I receive status code 200
    And I receive valid data for updated user