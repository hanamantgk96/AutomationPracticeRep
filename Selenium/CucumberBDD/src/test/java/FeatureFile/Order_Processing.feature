
@tag
Feature: Title of your feature
  I want to use this template for my feature file
  
  
  Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful

  @UOMConversion
  Scenario: doing UOM conversion within the same seller
    Given Navigate the order processing module
    And Select the UOM Conversion option in the dropdown
    When select the delivery hub and product subcatagory
    And select the product which has two uom
    And select the seller which is having two UOM within the same seller 
    Then select the uom to conver which uom they want
    And Once conversion is done the order status will go to the draft status 
    Then After that we need to edit/update and change it to order created
    And once update completed successfully conversion is done

