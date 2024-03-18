@vice_dean_creation

  Feature: admin creates vice dean

    Background:
      Given User should click the login button on the home page
      And User should enter the new Admin Username created in the previous US
      And User should enter the new Admin password created in the previous US
      And User should click the login button on the login page

      Scenario: US_23_TC_01
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin enters a username for new Vice Dean
        And Admin enters a password for new Vice Dean(at least eight chars and UpC,LowC,Num)
        And Admin clicks the submit button
        And Admin should see Vice Dean Saved message
        Then Admin should see the new Vice Dean in the Vice Dean List

      Scenario: US_23_TC_02
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin leaves the username field empty
        And Admin enters a password for new Vice Dean(at least eight chars and UpC,LowC,Num)
        And Admin clicks the submit button
        And Admin should see Required message under username field
        Then Admin should NOT see the new Vice Dean in the Vice Dean List

      Scenario: US_23_TC_03
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin enters a username for new Vice Dean
        And Admin enters a password for new admin(at least eight chars and UpC,LowC)
        And Admin clicks the submit button
        And AAdmin should see One Number message under the password field
        Then Admin should NOT see the new Vice Dean in the Vice Dean List

      Scenario: US_23_TC_04
        When Admin enters the first name for new Vice Dean
        And Admin enters the surname for new Vice Dean
        And Admin enters the birth place of new Vice Dean
        And Admin enters gender of new Vice Dean
        And Admin enters birth date of new Vice Dean
        And Admin enters phone number of new Vice Dean in the format(xxx-xxx-xxxx)
        And Admin enters SSN number of new Vice Dean in the format(xxx-xx-xxxx)
        And Admin enters a username for new Vice Dean
        And Admin leaves the password field empty
        And Admin clicks the submit button
        And Admin should see Vice Dean saved message
        And Admin should see the new Vice Dean in the Admin List
        