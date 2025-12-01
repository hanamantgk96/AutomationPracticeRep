@sanity
Feature: New Account Creation in ParaBanking

  Background: 
    Given user loads the parabanking website in the browser
    And user enters the username in field as "sktest5678"
    And user enters the password in field as "Test@1234"
    When user clicks on the submit button of parabanking

  Scenario: Create a New Savings bank account
    And user clicks on the link of Open New Account
    And user selects the account type as Savings
    And user clicks on Open new Account
    Then user captures the Account Number
   # And user validates the message displayed by the browser
    And user closes the browser after execution
