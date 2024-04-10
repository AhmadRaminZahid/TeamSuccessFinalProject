@db13
Feature: Vice Dean Creation Validation DB
  Scenario: Vice Dean Validates Created Teacher From DB
    Given Vice Dean sets connection Teacher
    And Vice Dean creates statement Teacher
    When Vice Dean executes query for created Teacher
    Then Vice Dean validates result set Teacher
    And Vice Dean terminates connection Teacher

