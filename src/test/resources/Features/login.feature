Feature: Test Login Functionality

  Scenario: Login succed with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the home page

  # With Scenario Outline I can run the same scenario multiple times
  Scenario Outline: Login succed with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    Examples: 
      | username | password |
      | User1    | pass1    |
      | User2    | pass2    |

  @test
  Scenario: Validate Google searching is working
    Given browser is open
    And user is on Google search page
    When user enters a text in search box
    And hits enter
    Then user is navigated to search results
