#@us15_api
  @2
Feature: US_15 Add Student
  Background: Login as an Vice Dean
    Given User is authorized as "vicedean"

  Scenario: Vice Dean Creates Student
    And Vice Dean sets the Url for Student Save
    And sets the payload for Student Save
    When sends POST request and get response creating Student
    Then verifies status code for Student is 200
    And verifies response body for Student

  Scenario: Vice Dean gets the information for the created Student Test
    And Vice Dean gets id of the Student with name "Melissay"
    And sets the expected data for Get Student By name
    When sends GET request and get response for Student
    Then verifies status code for Student is 200
    And verifies response body for Get Student By name

  Scenario: Vice Dean deletes created Student Test
    And Vice Dean gets id of the Student with name "Melissay"
    And Vice Dean deletes the created Student
