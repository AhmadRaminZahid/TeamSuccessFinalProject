@agu @us24
Feature: Admin_Adds_Teacher
  Background: Admin_Login
    Given Admin goes to website "https://managementonschools.com/"
    And Admin clicks on the Log in button at the home page
    And Admin enters the  admin username
    And Admin enters the  admin password
    And Admin clicks on the Login button
    @tc01
    Scenario:US_24 TC_01 Admin should be able to add Teacher
      When Admin clicks the Menu button
      And Admin clicks on the Teacher Management option
      And Admin selects first lesson from lessons option
      And Admin enters a teacher name as "Namik"
      And Admin enters a teacher surname as "Selimm"
      And Admin enters a Birth Place as "Urfa"
      And Admin enters a teacher email as "Namkk@gmail.com"
      And Admin enters a phone number "699-669-6333"
      And Admin clicks on the Is Adviser Teacher box
      And Admin clicks on one option from Gender boxes
      And Admin enters Date of Birth in Date of Birth field as "01.01.2013"
      And Admin enters a teacher Ssn number as "699-26-5399"
      And Admin enters a User Name "Namkcannk"
      And Admin enters a password "Namkcannk197"
      And Admin clicks on Submit button
     Then Admin verify to see a success message "Teacher saved successfully"
      And close the web page
  Scenario: US_24 TC_02 Admin should not be able to add Teacher
    When Admin clicks the Menu button
    And Admin clicks on the Teacher Management option
    And Admin selects first lesson from lessons option
    And Admin enters a teacher name as "Namik"
    And Admin enters a teacher surname as "Selimm"
    And Admin enters a Birth Place as "Urfa"
    And Admin enters an email as "Namkkk@gmail.com"
    And Admin enters a phone number "699-669-6333"
    And Admin clicks on the Is Adviser Teacher box
    And Admin clicks on one option from Gender boxes
    And Admin enters Date of Birth in Date of Birth field as "01.01.2013"
    And Admin enters a Ssn number as "63563365399"
    And Admin enters a User Name "Namikcann"
    And Admin enters a password "Namikcann197"
    And Admin clicks on Submit button
    Then Admin verify to see a fail message "Please enter valid SSN number"
    And close the web page





