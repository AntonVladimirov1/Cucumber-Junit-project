@DataTable
Feature: MH navbar verification

  User story:
  Customer is on the MH Home page
  Customer should see list of tabs

  Scenario: List of navbar Tabs
    When User is on the MH home page
    Then User sees list of navbar
      | HOME      |
      | ACCOUNT   |
      | RESOURCES |
      | CART      |

