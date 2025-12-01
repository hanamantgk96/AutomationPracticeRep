Feature: Register New User for Parabanking

  Scenario Outline: Register user with all Credentials in Parabanking
    Given user loads the parabanking website in the browser
    Given user enters the FirstName as "<FirstName>"
    And user enters the LastName as "<LastName>"
    And user enters the Address as "<Address>"
    And user enters the City as "<City>"
    And user enters the State as "<State>"
    And user enters the ZipCode as "<ZipCode>"
    And user enters the Phone as "<phone>"
    And user enters the SSN as "<SSN>"
    And user enters the UserName as "<UserName>"
    And user enters the Password as "<Password>"
    And user enters the confirm Password as "<Password>"
    When user clicks on the Register button
    Then User will be navigated to Parabanking homepage
    And user closes the browser after execution

    Examples: 
      | FirstName | LastName | Address  | City      | State     | ZipCode | phone     | SSN  | UserName | Password   |
      | Tom       | Dsouza   | Madhapur | Hyderabad | Telangana |  500055 | 987656778 | 6789 | sktest12 | test@1234  |
      | Henry     | Brien    | LA       | NJ        | USA       |  700055 | 887656778 | 4789 | hktest12 | htest@1234 |
