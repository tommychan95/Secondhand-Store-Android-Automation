@userLogin @Smoke
Feature: User Login
   As an user, I want to login to Secondhand Store app

  @LG001
  Scenario: User want to login using correct credential
    Given User open app and navigate to login page
    When User input email "irmapujiandrianis@gmail.com"
    And User input password "Admin123"
    And User tap button Login
    Then User navigate to Account page

  @LG002
  Scenario: User want to login without input email and password
    Given User open app and navigate to login page
    And User tap button Login
    Then Text warning "Email tidak boleh kosong" akan muncul

  @LG003
  Scenario: User want to login without password
    Given User on login page
    When User input email "irmapujiandrianis@gmail.com"
    And User tap button Login
    Then Text warning "Password tidak boleh kosong" akan muncul

  @LG004
  Scenario: User want to login using invalid email
    Given User on login page
    When User input email "irmapujiandrianisgmailcom"
    And User input password "Admin123"
    And User tap button Login
    Then Text warning "Email tidak valid" akan muncul
