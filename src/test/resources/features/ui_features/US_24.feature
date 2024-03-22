Feature: Admin_Adds_Teacher
  Background: Admin_Login
    Given admin goes to "https://managementonschools.com" homepage
    And User clicks on Login button right corner of the page
    And Admin enters the  admin User Name
    And Admin enters the  admin password
    And Admin clicks on the Login button
    Scenario:US_24 TC_01 Admin should be able to add Teacher
      When Admin clicks the Menu button
      And Admin clicks on the Teacher Management option
      And Admin clicks on Choose Lessons input part
      And Admin selects first lesson from lessons option
      And Admin enters a teacher name
      And Admin enters a teacher surname




