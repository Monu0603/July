Feature: To validate the functionality
 Background:
  Given User should be there at log in page
  
  Scenario Outline: To validate the login Functionality
    Given user should enter valid "<username>" and "<password>"
    And user should click on the login button

Examples:
|username|password|
|singh123456|singh@123456|

    Scenario Outline:To validate the search functionality
    Given user should enter valid "<username>" and "<password>"
    When user should click on the login button
    And user has to select location
    And user has to select the given drop down
    
    Examples:
|username|password|
|singh123456|singh@123456|