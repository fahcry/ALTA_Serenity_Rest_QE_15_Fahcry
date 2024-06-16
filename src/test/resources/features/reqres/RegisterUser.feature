Feature: Register User
  @Tugas
  Scenario: Register user with valid data
    Given Create register user with file json "register_valid.json"
    When Send request post register user
    Then Status code should be 200
    And Respons body id should be 4 and token "QpwL5tke4Pnpja7X4"
    And Validate json schema "register_valid_json_schema.json"

    @Tugas
  Scenario: Register user with invalid data
    Given Create register user with file json "register_invalid.json"
    When Send request post register user
    Then Status code should be 400
    And Respons body id should be error "Missing password"
    And Validate json schema "register_invalid_json_schema.json"