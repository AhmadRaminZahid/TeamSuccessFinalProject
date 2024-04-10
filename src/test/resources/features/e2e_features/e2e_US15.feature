@e2e_us15
Feature: End to end test for creating a Student
  Scenario: US_15 TC_01 Vice Deans should be able to create a student.++-
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button
    When click on the Menu button on the right corner of the page
    And selects Student Management on the dropdown list
    And select the teacher on the dropdown list
    And enters a valid student Name
    And enters a valid student Surname
    And enters the student Birth Place
    And enters a valid email address
    And enters a valid Phone number
    And selects the student gender
    And enters the Date of Birth
    And enters a valid SSN number
    And enters a valid User name
    And enters the student Father's name
    And enters the student Mother's name
    And enters a valid Password
    And clicks on Submit button
    Then sees the success message "Student saved Successfully"
    And close the driver
  Scenario: Vice Dean gets the information for the created Student Test
    Given User is authorized as "vicedean"
    And Vice Dean gets id of the Student with name "Melissay"
    And sets the expected data for Get Student By name
    When sends GET request and get response for Student
    Then verifies status code for Student is 200
    And verifies response body for Get Student By name
  Scenario: Vice Dean Validates Created Student From DB
    Given Vice Dean sets connection Student
    And Vice Dean creates statement Student
    When Vice Dean executes query for created Student
    Then Vice Dean validates result set Student
    And Vice Dean terminates connection Student
  Scenario: Vice Dean deletes created Student Test
    Given User is authorized as "vicedean"
    And Vice Dean gets id of the Student with name "Melissay"
    And Vice Dean deletes the created Student