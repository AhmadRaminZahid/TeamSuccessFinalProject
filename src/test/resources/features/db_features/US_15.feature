@db_15
Feature: Vice Dean Creation Validation DB
  Scenario: Vice Dean Validates Created Student From DB
    Given Vice Dean sets connection Student
    And Vice Dean creates statement Student
    When Vice Dean executes query for created Student
    Then Vice Dean validates result set Student
    And Vice Dean terminates connection Student
