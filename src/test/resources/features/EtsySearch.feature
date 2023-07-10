  @q
Feature: Etsy search functionality

  Background:
    Given user is on the etsy site
  @woodenSpoon1
  Scenario: Etsy title verification
    Then user sees expected title
    #expectedTitle: Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone

  @woodenSpoon2
  Scenario: Etsy search functionality title verification
    When  user types Wooden Spoon in the search box
    And  user clicks search button
    Then  user sees Wooden Spoon is in the title

  @woodenSpoon3
  Scenario: Etsy search functionality title verification (parameterized)
    When  user types in the search box "Wooden spoon"
    And  user clicks search button
    Then  user sees "Wooden spoon" is in the title