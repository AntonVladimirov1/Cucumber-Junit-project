@devMHlogin
  Feature: MH login functionality

    User story:
    Customer is on the MH login page.
    Customer should be able to login to account with valid credentials - successfully.
    Customer should be redirected to the "Current Jobs" page.
    Title should match - "Current Jobs".

    Background:
      Given user is on the login page of the MH application

    Scenario: Login as MH customer

      When user enters customer username, password and submit
      Then user should see current jobs page