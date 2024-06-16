Feature: Get list Users API
  @Latihan
  Scenario Outline: Get list users withh valid parameter page
     #kalo string pakai "<>"
    Given Get list users with parameter page <page>
    When Send request get list users
    Then Status code should be 200
    And Response body page should be <page>
    And Validate json schema "list_users_json_schema.json"
  Examples:
    |page|
    |1   |
    |2   |

    @Tugas
      #negative tapi kok 200?
    Scenario: Get list users with invalid paramete page
      Given Get list users with parameter page "#"
      When Send request get list users
      Then Status code should be 400

