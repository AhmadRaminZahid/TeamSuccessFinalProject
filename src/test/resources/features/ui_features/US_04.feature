@us_04
Feature: Add Dean
  Background: Login as a Admin
    Given admin goes to "https://managementonschools.com/" homepage
    And clicks on Login button
    And enters "<username>" in the Username input field
    And enters "<password>" in the password input field
    Then clicks on Login button

  Scenario: US_04 TC_01 Admin should be able to add Dean
    When clicks Menu button
    And clicks Dean Management option
    And enters Dean’s Name
    And enters Dean’s Surname
    And enters Dean’s Birth Place
    And selects Dean’s Gender
    And enters Dean’s Date of Birth
    And enters Dean’s Phone Number
    And enters SSN Number
    And enters user name
    And enters password
    And clicks Submit button
    Then see Dean Saved message


  Scenario: US_04 TC_02 Admin should NOT be able to add Dean
    When clicks Menu button
    And clicks Dean Management option
    And enters Dean’s Name
    And enters Dean’s Surname
    And enters Dean’s Birth Place
    And selects Dean’s Gender
    And enters Dean’s Date of Birth
    And enters Dean’s Phone Number
    And enters invalid SSN Number
    And enters user name
    And enters password
    And clicks Submit button
    Then see Please enter valid SSN number message
