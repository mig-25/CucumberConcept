Feature: To test the login 

  Scenario: Check that I get a confirmation at login
     Given I am on the login page
     When I input my user name and password
     Then I should get confirmation
