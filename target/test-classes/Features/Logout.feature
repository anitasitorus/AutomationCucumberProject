Feature: Test logout functionality

  Scenario Outline: Check lgout is successfull 
    Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user are navigated to the homepage
    And user click side navigation menu
    And user click logout   
    
    Then user close browser

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |
