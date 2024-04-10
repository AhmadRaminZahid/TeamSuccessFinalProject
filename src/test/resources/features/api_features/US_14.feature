#@us14_api
  @2
Feature: US_14 Add Teacher
  Background: Login as an Vice Dean
    Given User is authorized as "vicedean"

  Scenario: Vice Dean updates created Teacher Test
    And sets the Url for updating Teacher data
    # And gets id of the created Teacher
    And sets the expected data to update the Teacher data
    When updates the Teacher by id
    Then verifies response body for updating Teacher

  Scenario: Vice Dean deletes created Teacher Test
    When Vice Dean deletes created Teacher by Id