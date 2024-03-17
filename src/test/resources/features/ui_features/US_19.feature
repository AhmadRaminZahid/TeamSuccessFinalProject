Feature: Create meetings with students
  Background: Login part as a Teacher
    Given User navigates to https://managementonschools.com/
    And User clicks on Login button on homepage
    And User types the username of his teacher account
    And User types the password of his teacher account
    And User clicks on Login button
  Scenario: US_19 TC_01 The teacher should be able to create meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see "Meet Management" on the screen
    And User clicks on the Select Student button
    And User selects a student who has been assigned to him from the list
    And User types a FUTURE date in Date of Meet box
    And User types the start time in Start Time box
    And User types the stop time in Stop Time box
    And User types a short description on meeting in Description box
    And User clicks on submit button
    Then User must see Meet saved successfully message

  Scenario: US_19 TC_01 The teacher should be able to create meetings with students
    When User clicks on menu button
    And User clicks on Meet Management
    And User must see "Meet Management" on the screen
    And User clicks on the Select Student button
    And User selects a student who has been assigned to him from the list
    And User types a PAST date in Date of Meet box
    And User types the start time in Start Time box
    And User types the stop time in Stop Time box
    And User types a short description on meeting in Description box
    And User clicks on submit button
    Then User must see must be a future date message
    # ya da "ileri bir tarih olmalı"