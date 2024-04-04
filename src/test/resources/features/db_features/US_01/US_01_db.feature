
@db01 @api_db
Feature: Verify guest User

  Scenario: User Register guest user list validation
    Given User sets connection
    And User creates statement
    When User executes query for created email
    Then validates result set
    And User terminates connection