@userLogout @Smoke
Feature: User Logout
   As an user, I want to logout account

  @LG001
  Scenario: User want to logout account
    Given User already login
    When User tap button logout
    Then User navigate to homepage
