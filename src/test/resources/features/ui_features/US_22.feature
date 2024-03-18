@admin_creation

  Feature: admin creates new admin
    Background:
      Given User should click the login button on the home page
      And User should enter the current Admin Username
      And User should enter the current Admin Password
      And User should click the login button on the login page


      Scenario: US_22_TC_01
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
        And Admin enters a username for new Admin
        And Admin enters a password for new admin(at least eight chars and UpC,LowC,Num)
        And Admin clicks the Submit button
        And Admin should see Admin saved message
        Then Admin should see the new Admin in the Admin List

      Scenario: US_22_TC_02
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
        And Admin enters a username for new Admin
        And Admin enters a password for new admin(less than eight chars and UpC,LowC,Num)
        And Admin should see the At least 8 characters still visible
        Then Admin should not be able to click Submit button

      Scenario: US_22_TC_03
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN in different format (changes the places of -)
        And Admin enters a username for new Admin
        And Admin enters a password for new admin(at least eight chars and UpC,LowC,Num)
        And Admin clicks the Submit Button
        And Admin should see Please enter valid SSN number message
        Then Admin should not see the New Admin in the Admin List

      Scenario: US_22_TC_04
        When Admin enters the first name for new Admin
        And Admin enters the surname for new Admin
        And Admin enters the birth place of new Admin
        And Admin enters gender of new Admin
        And Admin enters birth date of new Admin
        And Admin enters phone number of new Admin in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Admin in the format(xxx-xx-xxxx)
        And Admin enters a username for new Admin
        And Admin leaves the password field empty
        And Admin clicks the submit button
        And Admin should see Admin saved message
        Then Admin should see the new Admin in the Admin List
