Feature: Testing the login
  Scenario Outline: The user can login using different usernames
    Given The user is on the page
    When the user types the <username> and the <password>
    Then the user is able to log in
    Examples:
      |        username       |  password  |
      |standard_user          |secret_sauce|
      |locked_out_user        |secret_sauce|
      |problem_user           |secret_sauce|
      |performance_glitch_user|secret_sauce|
      |error_user             |secret_sauce|
      |visual_user            |secret_sauce|
