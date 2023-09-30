Feature: Test login functionality

  Scenario Outline: Check login is successfull with valid credential
    Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user are navigated to the homepage
    Then user close browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
