
Feature: US_04 Delete Dean
  Background: Login as an Admin
    Given User is authorized as "Admin"

  Scenario: Admin Creates Dean Test
    And Admin sets the Url for Dean Save
    And Admin sets the payload for Dean Save
    When Admin sends POST request and get response
    Then Admin verifies status code is 200
    And Admin verifies response body

  Scenario: Admin Deletes Dean Test
    And Admin gets id of the Dean with username "Ali"
    And Admin sets the Url for Get Dean By id
    And Admin deletes the created dean
