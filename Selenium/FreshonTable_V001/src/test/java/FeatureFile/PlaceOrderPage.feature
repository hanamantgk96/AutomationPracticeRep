
@tag
Feature: Order Module
  I want to use this template for my feature file

 Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful

  @placeorder
  Scenario Outline: Validating with all Negative Test Cases are Working
    Given Navigate to place order page
    When Validate if the products are selected by clicking the Review order button and valiadte the error message
    Then Validate if shipping date is provided by clicking the Review orders button and validate the error message
    Then Validate if the Lpo number is provided by clicking the Review order button and validate the popup message
    Then Validate if a payment method is selected by clicking the Review order button and capture the message
    And Validate the if a billing address by clicking the Review order button and validate the popup message
     
    
