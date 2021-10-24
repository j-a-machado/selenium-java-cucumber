Feature: Test Login Functionality
	
	@test
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
