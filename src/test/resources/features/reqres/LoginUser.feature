Feature: Create login user
@Tugas
Scenario: Create login user with valid data
Given Create new login user with file json "login_valid.json"
When Send request post create user login
Then Status code should be 200
And Respons body name should be "QpwL5tke4Pnpja7X4"
And Validate json schema "login_valid_json_schema.json"
@Tugas
  Scenario: Create login user with invalid data
    Given Create new login user with file json "login_invalid.json"
    When Send request post create user login
    Then Status code should be 400
    And Respons body error name should be "Missing password"
    And Validate json schema "login_invalid_json_schema.json"