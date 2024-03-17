@us_05
Feature: Delete Dean
  Scenario: US_05 TC_01 Admins should be able to delete Deans
    Given admin goes to "https://managementonschools.com/" homepage
    And clicks on Login button
    And enters "<username>" in the Username input field
    And enters "<password>" in the password input field
    And clicks on Login button
    And clicks Menu button
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
    And see Dean Saved message
    And clicks double arrows on end of the Dean List, on the right side
    And clicks created dean's delete button
    Then see Dean deleted message


