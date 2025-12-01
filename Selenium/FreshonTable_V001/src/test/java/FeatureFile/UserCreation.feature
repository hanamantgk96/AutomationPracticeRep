
@tag
Feature: User Creation


  Background:
	  Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful
    
    @BusinessAccount
    Scenario: creating a Business Account
    Given Navigate the organisation page
    And Clicks on the "Create Organization" option
    Then user provoid an organization name and select organizationType from the dropdown(Business,Seller,Consumer)
    And Selects "Business" as the organization type 
    And Fills in all mandatory fields for Organization Profile
    Then Fills in all mandatory fields for Organization Admin Details
    And Fills address Details information
    And Enables communication channels radio button and skip if enabled
    And Uploads all mandatory documents
    And Fill Additional Information if required
    
   @SellerAccount
    Scenario: creating a Supplier Account
    Given Navigate the organisation page
    And Clicks on the "Create Organization" option
    Then user provoid an organization name and select organizationType from the dropdown(Business,Seller,Consumer)
    And Selects "Seller" as the organization type1 
    And Fills in all mandatory fields for Organization Profile1
    Then Fills in all mandatory fields for Organization Admin Details
    And Fills address Details information
    And Enables communication channels radio button and skip if enabled
    And Fill Additional Information if required1
    
    @ConsumerAccount
    Scenario: creating a Consumer Account
    Given Navigate the organisation page
    And Clicks on the "Create Organization" option
    Then user provoid an organization name and select organizationType from the dropdown(Business,Seller,Consumer)
    And Selects "Consumer" as the organization type2 
    And Fills in all mandatory fields for Organization Profile2
    Then Fills in all mandatory fields for Organization Admin Details
    And Fills address Details information
    And Enables communication channels radio button and skip if enabled
   
    
    
    
    
    
    
