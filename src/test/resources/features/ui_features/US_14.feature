@us_14
Feature: See and update teacher
  Background: Login as a Vice Dean
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login right corner of the page
    And enters username in the Username input field
    And enters password in the password input field
    And clicks on Login button
  Scenario: UA_14 TC_01 Vice Dean should be able to see and update teachers.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And finds the teacher created on the Teacher List on the page
    And clicks on Edit button on the teacher name
    And selects lesson on Choose Lessons dropdown list
    And enters a valid teacher NameBox
    And enters a valid teacher Surname
    And enters a valid Birth Place
    And enters a valid email address
    And enters a valid Phone number
    And selects the Is Advisor Teacher box
    And selects the teacher Gender
    And enters a valid Date of Birth
    And enters a valid SSN
    And enters a valid User Name
    And enters a valid Password
    And clicks on Submit button
    Then sees the message "Teacher saved successfully"
    And close the driver

  Scenario: US_14 TC_02 Vice Dean should be able to see and update teachers.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And finds the teacher created on the Teacher List on the page
    And clicks on Edit button on the teacher name
    And selects lesson on Choose Lessons dropdown list
    And enters a valid teacher Name
    And enters a valid teacher Surname
    And enters a valid email address
    And enters a valid Phone number
    And selects the Is Advisor Teacher box
    And selects the teacher Gender
    And enters a valid Date of Birth
    And enters a valid SSN
    And enters a valid User Name
    And enters a valid Password
    And clicks on Submit button
    Then sees required message on the Birth Place box
    And close the driver


