Feature: Web table app login functionality
  User story: User should be able to login with valid credentials

  @webTableLogin1
  Scenario: Valid login
    Given user is on the web table app login page
    When user enters correct username
    And user enters correct password
    And clicks login button
    Then user should see order word in the URL

  @webTableLogin2
  Scenario: Valid login
    Given user is on the web table app login page
    When user enters "Test" username and "Tester" password
    And clicks login button
    Then user should see order word in the URL

  @webTableLogin3
  Scenario: Valid login
    Given user is on the web table app login page
    When user enters below correct credentials
      | username | Test   |
      | password | Tester |
    And clicks login button
    Then user should see order word in the URL