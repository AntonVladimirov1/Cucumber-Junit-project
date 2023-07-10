@wiki
Feature: Wiki Search functionality

  User story:
  As a user, when I am on the Wikipedia search page, I should be able to search by different request

  Background: For all scenario user is on Wikipedia home page
    Given user is on the Wikipedia home page
    When user types "Steve Jobs" in the search box
    And user clicks Wiki search button

  Scenario: search page Steve Jobs verification
    Then user sees "Steve Jobs" is in the wiki title
    Then user sees "Steve Jobs" is in the main header
    Then user sees "Steve Jobs" is in the image header
#=========================================================================================================
  @scenarioOutline
  Scenario Outline: Wiki search functionality with Scenario Outline
    Given user is on the Wikipedia home page
    When user types "<searchValue>" in the search box
    And user clicks Wiki search button
    Then user sees "<expTitle>" is in the wiki title
    Then user sees "<expMainHeader>" is in the main header
    Then user sees "<expImageHeader>" is in the image header
    @people
    Examples: search values we are going to be using in this scenario outline
      | searchValue | expTitle   | expMainHeader | expImageHeader |
      | Steve Jobs  | Steve Jobs | Steve Jobs    | Steve Jobs     |
      | Mary Barra  | Mary Barra | Mary Barra    | Mary Barra     |
    @scientist
    Examples:
      | searchValue     | expTitle        | expMainHeader   | expImageHeader  |
      | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer | Rosalind Brewer |
      | Nikola Tesla    | Nikola Tesla    | Nikola Tesla    | Nikola Tesla    |
