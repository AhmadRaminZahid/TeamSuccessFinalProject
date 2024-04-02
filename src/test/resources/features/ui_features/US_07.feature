<<<<<<< HEAD
@us07
=======
@US_07 @EP
>>>>>>> origin/emrepolat
Feature: Deans should be able to see the messages sent by users
Scenario: US_07 Test_Case01
Given  admin goes to "https://managementonschools.com" homepage
  When User clicks on Login button right corner of the page
  And User enters a valid User name
  And User enters a valid password
  And User clicks on Login button
  And User clicks on Menu button right corner of the page
  And User clicks on Contact Get All left side of the page
  Then User sees Messages, authors, emails, sending dates, and subject information
<<<<<<< HEAD
  And close the web page
=======
  And close the browser
>>>>>>> origin/emrepolat

