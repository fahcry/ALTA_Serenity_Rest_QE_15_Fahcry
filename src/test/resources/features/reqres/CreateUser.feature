Feature: Create user API
  @Latihan
  Scenario: Create new user with json
    Given Create new user with file json "create_user.json"
    When Send request post create user
    Then Status code should be 201