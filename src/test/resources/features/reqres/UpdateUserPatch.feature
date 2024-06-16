Feature: Patch Update User API
  @Tugas
  Scenario: Update user with parameter id and valid json
    Given Update user with patch and parameter id 2 and valid json "update_user_patch.json"
    When Send request patch update user
    Then Status code should be 200
    And Respons body name should be "morpheus" and job should be "zion resident"
    And Validate json schema "update_users_patch_json_schema.json"

  #negative case with invalid id and body name int, job String
  @Tugas
  Scenario: Update user with parameter invalid id and invalid json
    Given Update user with parameter id "#" and valid json "update_user.json"
    When Send request patch update user
    Then Status code should be 400

