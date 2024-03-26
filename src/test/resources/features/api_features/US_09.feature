
Feature: US_09 Delete Lesson
  Background: Login as a Vice Dean
    Given User is authorized as "Vice Dean"

  Scenario: Add Lesson as Vice Dean
    And Vice Dean sets the Url to add Lesson
    And Vice Dean sets the payload to add Lesson
    And Vice Dean sends POST request and get response
    Then Vice Dean verifies status code is 200
    And Vice Dean verifies response body

  Scenario: Delete Lesson as Vice Dean
    And Vice Dean gets id of the added Lesson
    And Vice Dean sets the Url for Get Lesson By id
    And Vice Dean deletes the added Lesson
    Then Vice Dean verifies status code is 200

