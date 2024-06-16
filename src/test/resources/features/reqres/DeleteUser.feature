Feature: Delete a user
  @Tugas
  Scenario: Delete user with paramater id
    Given Delete user with id 2
    When Send request delete user
    Then Status code should be 204


