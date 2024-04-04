@us_17_e2e
Feature: Grade Submission by Teacher

  Scenario: US_17 TC_01 - Teacher gives grades to students (Add Student Info)
    Given The teacher navigates to "https://managementonschools.com/"
    And The teacher clicks on Login button on homepage
    And The teacher enters the username
    And The teacher enters the password
    And The teacher clicks on Login button
    When The teacher sees Student Info Management page
    And The teacher clicks Choose Lesson
    And The teacher clicks Choose Student
    And The teacher clicks Choose Education Term
    And The teacher enters Absentee
    And The teacher enters Midterm Exam
    And The teacher enters Final Exam
    And The teacher enters Info Note
    And  teacher clicks Submit Button
    And teachers must see "Student Info Saved Succesfully" message
    And Close driver


  Scenario: Teacher get the created Student info
    Given User is authorized as "teacherIbrahim"
    When Teacher sets the Url for GetAll Student info for teacher
    And Teacher sets the expected data for Student info
    And Teacher sends GETAll request and get response
    And Teacher get id of created Student info
    Then Teacher verifies status code is 200
    And Teacher verifies response body for Student info

  Scenario: teacher validates student info
    When teacher sets connection US_17
    And teacher creates statement US_17
    And teacher executes query for created meet US_17
    Then teacher validates result set US_17
    And teacher terminates connection US_17

  Scenario: Teacher deletes created Student info
    Given User is authorized as "teacherIbrahim"
    When Teacher deletes Student info by id