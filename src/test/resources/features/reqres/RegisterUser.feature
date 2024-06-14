Feature: Register User
  @Tugas
  Scenario: Register user with valid data
    Given Create register user with file json "register_valid.json"
    When Send request post register user
    Then Status code should be 200
    And Respons body id should be 4 and token "QpwL5tke4Pnpja7X4"
    And Validate json schema "register_valid_json_schema.json"