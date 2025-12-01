
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful

  @Login_02
	Scenario: Create LPO without edit quantity with Awaiting Approval status
	Given User navigates the Lpo page
	When Select the products which is already approved
	Then go to next page and check the all selected products are came 
	And Move to third page and confirm the data and click the submit button
	And Verify the LPO is created successfully
	
	
	
	