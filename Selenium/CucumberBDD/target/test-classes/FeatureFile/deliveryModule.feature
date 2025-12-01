
@tag
Feature: Delivery Schedule

  Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful
    
    @delivery 
  Scenario: Creating delivery schedule
    Given Navigate to delivery module  
    When validate the one components atleast on home page
    Then if user wants to create delivery schedule then they need to click "create deleivery schedule" button
    And check order id and enterprise name search field working/not
    And if users wants to change the drivers need to double click on the driver name so that they will get dropdown for driver list
    Then save the changes and do the drag and drop so orders are rearranging based on drivers
    And select the orders with respect to dreiveres and go to the next step
    Then 2nd step select the departure time and vehicle
    And check all the selected orders are visible in this step and click submit.
    And check the delivery schedule created successfully.  