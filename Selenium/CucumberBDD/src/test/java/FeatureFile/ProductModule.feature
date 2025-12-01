
@tag
Feature: Products
  
 Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful
    
    @productcreation
    Scenario Outline: Create new products 
    Given The user is on the "Create Product" page
    When Click submit button without filling mandatory fields and handle the popup message.
    Then fill all mandatory field which are there in products cration page
    And Add atleast one variant of the product and fill all the mandatory fields and save the details
    And Add at least one product images before and before clicking submit button.
    And Validate all the mandatory field that are filled without missing
    Then Click submit button and validate the product is created successfully.
    
    @regression
    Scenario: Change Product Status initiated to active
    Given user to click on the view products grid
    When after creating a product its in under initiated ststus
    Then select initiated status option in the status filtration
    And click change status option in more button
    And change the product status as active
    Then click submit button
    And product status changed successfully
    
    @regression
    Scenario: Edit product
    Given user to click on the view products grid
    And click Edit Product in the more button
    Then click any one of the existing variant
    And change the purchage price and selling price
    And save the changes and click submit button
    
    
    
    
    
    
    
    
    
    
    
    
    