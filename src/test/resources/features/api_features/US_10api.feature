@US_10_api
  Feature: US_10 Vice Deans should be able to create a lesson schedule.
    Background: Login as an Vice Dean
      Given User is authorized as "Vice Dean"

    Scenario: Vice Dean Creates Lesson Program
      And User sets the Url for Vice Dean Save
      And sets the payload for Vice Dean Save
      When sends POST request and get response for Vice Dean
      Then verifies status code is 200 for created lesson
      And verifies response body for Vice Dean

    Scenario: Vice Dean gets the information for the created Lesson Program
      And User gets id of the lesson program with "lessonprogramid"
      And User sets the Url for Get lesson program By id
      And sets the expected data for Get Lesson By id
      When sends GET request and get response for lesson
      Then verifies status code is 200 for created lesson
      And verifies response body for Get lesson By id

    Scenario: Vice Dean deletes created Lesson Program
      And User gets id of the lesson program with "lessonprogramid"
      And User sets the Url for Get lesson By id
      And User deletes the created lesson

