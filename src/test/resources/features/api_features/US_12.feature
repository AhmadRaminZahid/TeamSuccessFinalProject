Feature: US_12 Assign Lesson
  Background: Login as a Vice Admin
    Given User is authorized as "Vice Dean"

    Scenario: Vice Dean assigns lesson to teacher
      And sets the Url for assigning the lesson to teacher
      And sets the payload for assigning the lesson to teacher
      When sends POST request and GETS response for assigning lesson
      Then verifies status code is 200
      And verifies response body for assigning lesson

      Scenario: Vice Dean deletes assigned lesson
        And Vice Dean gets the id of the assigned lesson
        And Vice Dean sets the url for getting lesson by id
        And Vice Dean deletes the assigned lesson
        Then verifies status code is 200