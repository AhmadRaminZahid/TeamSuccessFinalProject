@e2e_us13
Feature: Create a teacher
  Scenario: US_13 TC_02 Vice Deans should be able to create a teacher
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And selects lesson on Choose Lessons dropdown list
    And enters a valid teacher Name
    And enters a valid teacher Surname
    And enters a valid Birth Place
    And enters a valid email address
    And enters a valid Phone number
    And selects the Is Advisor Teacher box
    And selects the teacher Gender
    And enters a valid Date of Birth
    And enters a valid SSN
    And enters a valid UserName
    And enters a valid Password
    And clicks on Submit button
    Then sees the message "Teacher saved successfully"
    And close the driver
  Scenario: Vice Dean gets the information for the created Teacher Test
    Given User is authorized as "vicedean"
    And Vice Dean gets id of the Teacher with username "Juliete"
    And Vice Dean sets the Url for Get Saved Teacher By id
    And sets the expected data for Get Saved Teacher By id
    When sends GET request and get response for Teacher
    Then verifies status code for teacher is 200
    And verifies response body for Get Teacher By id
  Scenario: Vice Dean Validates Created Teacher From DB
    Given Vice Dean sets connection Teacher
    And Vice Dean creates statement Teacher
    When Vice Dean executes query for created Teacher
    Then Vice Dean validates result set Teacher
    And Vice Dean terminates connection Teacher
  Scenario: Vice Dean deletes the created Teacher
    When Vice Dean deletes the created Teacher


