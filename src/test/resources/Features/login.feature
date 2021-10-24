Feature: Test Login Functionality

  Scenario: Login succed with valid credentials
    Given browser is open
    And user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page
    And browser is closed

  # With Scenario Outline I can run the same scenario multiple times
  Scenario Outline: Login succed with valid credentials
    Given browser is open
    And user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page
    And browser is closed

    Examples: 
      | username | password |
      | User1    | pass1    |
      | User2    | pass2    |

  @testThis
  Scenario: Validate Google searching is working
    Given browser is open
    And user is on Google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
    
  @testThis
  Scenario: Another Google Searching
  	Given user is on Juliana's search page
    When user clear the search box
    And user enters another text in search box
    And hits enter
    Then user is navigated to search results
    And browser is closed
