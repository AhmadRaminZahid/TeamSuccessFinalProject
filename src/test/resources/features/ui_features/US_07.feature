Feature: Deans should be able to see the messages sent by users
Scenario: US_07 Test_Case01
Given  admin goes to "https://managementonschools.com" homepage
  When User clicks on Login button right corner of the page
  And User enters a valid User name
  And User enters a valid password
  And User clicks on Login button
  And User clicks on Menu button right corner of the page
  And User clicks on Contact Get All left side of the page
  Then Deans should be able to view messages
  And Deans should be able to see the delete button
  And Deans should be able to delete messages
