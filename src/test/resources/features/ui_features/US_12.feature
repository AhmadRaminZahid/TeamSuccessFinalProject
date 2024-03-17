Feature: Assign lessons to teachers
  Background: Login part as a Vice Dean
    Given User navigates to https://managementonschools.com/
    And User clicks on Login button on homepage
    And User types the username of his Vice Dean account
    And User types the password of his Vice Dean account
    And User clicks on Login button
  Scenario: US_12 TC_01 Vice Deans should be able to assign lessons to teachers
    When User clicks on Lesson Program part
    And User chooses a lesson from Lesson Program Assignment part
    And User scrolls down to choose a teacher
    And User clicks on choose teacher button
    And User selects a teacher from the menu
    And User clicks on submit button
    Then User must see Lesson added to Teacher message

  Scenario: US_12 TC_02 Vice Deans should not be able to assign lessons to teachers
    When User clicks on Lesson Program part
    And User chooses a lesson from Lesson Program Assignment part
    And User scrolls down to choose a teacher
    And User clicks on choose teacher button
    And User clicks on submit button
    Then User must see The given id must not be null! message









