Feature: Admin_Adds_Teacher
  Background: Admin_Login
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
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
      And Admin enters a Birth Place
      And Admin enters an email
      And Admin enters a phone number
      And Admin clicks on the Is Adviser Teacher box
      And Admin clicks on one option from Gender boxes
      And Admin enters Date of Birth in Date of Birth field
      And Admin enters a Ssn number
      And Admin enters a User Name
      And Admin enters a password
      And Admin clicks on Submit button
     Then Admin verify to see a success message "Teacher Saved successfully"



