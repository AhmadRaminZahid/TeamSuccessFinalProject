@student
Feature:Admin_Add_Student
  Background: Login_Part
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin User Name
    And Admin enters the  admin password
    And Admin clicks on the Login button
  Scenario: US_25 TC_01 Admin should be able to add Student
    When Admin clicks the Menu button
  And Admin clicks the Student Management option
  And Admin clicks Choose Advisor Teacher input field
  And Admin selects first teacher from Choose Teacher options
  And Admin enters a student name
  And Admin enters a student surname
  And Admin enters a Birth Place
  And Admin enters an email
  And Admin enters a phone number
  And Admin clicks the Gender box
  And Admin enters Date of Birth in Date of Birth field
  And Admin enters a Ssn number
  And Admin enters a User Name
  And Admin enters the father name
  And Admin enters the mother name
  And Admin enters a password
  Then Admin sees a success message "Student Saved successfully"

