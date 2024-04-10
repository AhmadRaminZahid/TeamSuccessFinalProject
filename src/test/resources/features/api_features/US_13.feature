@us13_api
Feature: US_13 Add Teacher
  Background: Login as an Vice Dean
    Given User is authorized as "vicedean"

  Scenario: Vice Dean Creates Teacher
    And Vice Dean sets the Url for Teacher Save
    And sets the payload for Teacher Save
    When sends POST request and get response creating teacher
    Then verifies status code for teacher is 200
    And verifies response body for teacher

  Scenario: Vice Dean gets the information for the created Teacher Test
    And Vice Dean gets id of the Teacher with username "Juliete"
    And Vice Dean sets the Url for Get Saved Teacher By id
    And sets the expected data for Get Saved Teacher By id
    When sends GET request and get response for Teacher
    Then verifies status code for teacher is 200
    And verifies response body for Get Teacher By id

    Scenario: Vice Dean deletes the created Teacher
      When Vice Dean deletes the created Teacher


