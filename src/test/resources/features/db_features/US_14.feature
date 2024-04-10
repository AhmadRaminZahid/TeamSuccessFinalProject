@db_14
Feature: Vice Dean Update Validation DB
  Scenario: Vice Dean Validates updated Teacher From DB
    Given Vice Dean sets connection for updated Teacher
    And Vice Dean creates statement for updated Teacher
    When Vice Dean executes query for updated Teacher
    Then Vice Dean validates result set for updated Teacher
    And Vice Dean terminates connection for updatedTeacher