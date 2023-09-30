Feature: Test Checkout functionality

  Scenario Outline: Validate can add item to cart
    Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user are navigated to the homepage
    Then user click image product
    Then user navigated to detail product
    And user click button Add To Cart
    Then user click cart
    Then user close browser

Scenario Outline: Validate can remove item
 		Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user are navigated to the homepage
    And user click button Add To Cart
    Then user click cart
    Given user on cart page
    And user click button remove
    Then user click button Continue Shopping
    Then user are navigated to the homepage
    Then user close browser

  Scenario Outline: Validate can checkout item
  	Given browser is open
    And user in on login page
    When user enters <username> and <password>
    And user clicks on login
    Then user are navigated to the homepage
    Then user click image product
    Then user navigated to detail product
    And user click button Add To Cart
    Then user click cart
    And user click button Checkout
    Then user input <Firstname> and <Lastname> and <ZIP>
    And user click button Continue
    And user click button finish
    Then user navigated to checkout complete page
    And user click button Back To Home
    Then user close browser

    Examples: 
      | username      | password     | Firstname | Lastname | ZIP    |
      | standard_user | secret_sauce | Yaya      | Guruh    | 220231 |
