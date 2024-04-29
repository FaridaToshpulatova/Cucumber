
Feature: Check google search funtionality

  @smoke
  Scenario: validate google search function
    Given open the browswer
    And user on google search page
    When user enters a text in a google search box
    And hits the enter
    Then user is navigated search page
    
 
 