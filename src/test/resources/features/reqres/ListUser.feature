Feature: Get list Users API
  @Latihan
  Scenario Outline: Get list users withh valid parameter page
     #kalo string pakai "<>"
    Given Get list users with parameter page <page>
    When Send request get list users
    Then Status code should be 200
  Examples:
    |page|
    |1   |
    |2   |
