
@smokeTitle
Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page I should be able to search anything and see relevant results.

  @antonio1
  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google

  @antonio2
  Scenario: Search result title verification
    Given  user is on the Google search page
    When  user searches for apple
    Then user should see apple in the title

  @antonio3
  Scenario: Search result title verification2
    Given user is on the Google search page
    When user searches for a orange
    Then user should see the orange in the title

  @antonio4
  Scenario: Search result title verification2
    Given user is on the Google search page
    When user searches for the "cucumber"
    Then user should see a "cucumber" in the title