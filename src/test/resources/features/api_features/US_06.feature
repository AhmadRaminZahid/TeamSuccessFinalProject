Feature: US_06 Dean creates Vice Dean Account
  Scenario: US_06 TC1
    Given User authorized as "Dean"
    And User sets the Url for Vice Dean Save
    And sets the payload for Vice Dean
    When sends post request and get response
    Then verifies status code is 200
    And verifies response body