@tag
Feature: Login

  @Login_01
  Scenario: User is able to login with valid credentials
    Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful 

 @CreateBulkOrder
 Scenario: Create multiple orders with different enterprise
 Given Launcg the the browser
 When User can select the business 
 Then Select the minimum products with all mandatory fields
 And Verify the orders created successfully
	
	