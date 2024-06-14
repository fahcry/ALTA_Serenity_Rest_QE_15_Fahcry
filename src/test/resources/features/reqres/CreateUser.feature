Feature: Create user API
  @Latihan
  Scenario Outline: Create new user with json
    Given Create new user with file json "<filename>"
    When Send request post create user
    Then Status code should be 201
    And Respons body name should be "<name>" and job should be "<job>"
    And Validate json schema "create_users_json_schema.json"
    Examples:
    |filename           |name               |job            |
    |create_user.json   |Fahcry Syaputra    |QA Engineer    |
    |create_user2.json  |Fahcry Syaputra 2  |QA Engineer 2  |
