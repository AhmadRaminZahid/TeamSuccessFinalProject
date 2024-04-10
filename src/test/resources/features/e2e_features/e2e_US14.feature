@e2e_us14
Feature: See and update teacher
#  Background: Login as a Vice Dean
  Scenario: US_13 TC_02 Vice Deans should be able to create a teacher for update
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
  #  And close the driver
  Scenario: UA_14 TC_01 Vice Dean should be able to see and update teachers.
    When click on the Menu button on the right corner of the page
    And selects Teacher Management on the menu
    And finds the teacher created on the Teacher List on the page
    And clicks on Edit button on the teacher name
    And selects lesson on Choose Lessons on Edit Box
    And enters a valid teacher Name on Edit Box
    And enters a valid teacher Surname on Edit Box
    And enters a valid Birth Place on Edit Box
    And enters a valid email address on Edit Box
    And enters a valid Phone number on Edit Box
    And enters a valid SSN on Edit Box
    And selects the Is Advisor Teacher box on Edit Box
    And selects the teacher Gender on Edit Box
    And enters a valid Date of Birth on Edit Box
    And enters a valid User Name on Edit Box
    And enters a valid Password on Edit Box
    And clicks on Submit button on Edit Box
    Then sees the message "Teacher updated Successful" on Edit Box
   # And close the driver
  Scenario: Vice Dean Validates updated Teacher From DB
    Given Vice Dean sets connection for updated Teacher
    And Vice Dean creates statement for updated Teacher
    When Vice Dean executes query for updated Teacher
    Then Vice Dean validates result set for updated Teacher
    And Vice Dean terminates connection for updatedTeacher
  Scenario: Vice Dean deletes created Teacher Test
    Given User is authorized as "vicedean"
    When Vice Dean deletes created Teacher by Id

