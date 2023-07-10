@DataTables
Feature: data tables (List and Map)
  @DataTables1
  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane       |
      | surname | Doe        |
      | age     | 26         |
      | state   | CA         |
      | zipcode | 123456     |
      | phone   | 1234567890 |
  @DataTables2
  Scenario: User should be able to see all 12 months in months dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |