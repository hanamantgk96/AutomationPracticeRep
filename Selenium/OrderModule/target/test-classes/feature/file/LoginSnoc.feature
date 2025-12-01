
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @Login_01
  Scenario: An existing users login with the UAEADMIN
    Given Launch the browser
    When Login with username and password
    Then User is landing on the dashboard
    And Veryfy the login is successful
