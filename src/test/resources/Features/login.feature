#author






Feature: Login


As a user I want to login application


  @smoke
  Scenario: Check login is successful with valid credientials
    
    Given  user is on login page
    When  User enters <username> and <password> 
    And  clicks on login button 
    Then  user succsessfully login and see information 
    
    
 
    
    