Feature: Test the login Functionality of Amazon site

Scenario: The user should be able to login with correct username and password
     Given user is on login page
     When user enters correct email and password
     Then user gets confirmation
     
Scenario Outline: the user should be able to login 
    Given user is on login page
     When user give <username>
     And user clicks on continue button
     And user enter <password>
     And user clicks submit button
     Then user gets confirmation
     
 Examples:
| username                   |  password|
|surbhigupta.tayal@gmail.com |  |
|gupta.harshitg44@gmail.com  |  |