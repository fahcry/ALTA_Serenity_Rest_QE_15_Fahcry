Feature: Put Update User API
  @Latihan
  Scenario: Update user with parameter id and valid json
    Given Update user with parameter id 2 and valid json "update_user.json"
    When Send request put update user
    Then Status code should be 200
    And Respons body name should be "Fahcry Syaputra Edit" and job should be "QA Engineer Edit"
    And Validate json schema "update_users_json_schema.json"


  # untuk bebrapa
    #Feature: Put Update User API
    #  @Latihan
    #  Scenario Outline: Update user with parameter id and valid json
    #    Given Update user with parameter id 2 and valid json "<fileJson>"
    #    When Send request put update user
    #    Then Status code should be 200
    #    Examples:
    #    |id |fileJson|
    #    |3  |update_user1.json|
    #    |4  |update_user2.json|