@us_09
Feature: Delete lesson
  Background: Login as a Vice Dean
    Given Vice Dean goes to "https://managementonschools.com/" homepage
    And clicks on Login button
    And enters "<username>" in the Username input field
    And enters "<password>" in the password input field
    Then clicks on Login button

  Scenario: US_09 TC_01 Vice Dean should be able to delete the lesson.
    When clicks Lessons option
    And clicks Lesson’s Delete Button
    Then should see Lesson Deleted message

  Scenario: US_09 TC_02 Vice Dean shouldn't be able to delete the lesson
    When clicks Menu and Student Management option
    And see Student Management page and Student List
    Then cannot see Delete Button
