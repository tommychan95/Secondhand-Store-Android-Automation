@register @Smoke
Feature: User Login
   As an user, I want to create account in Secondhand Store app

  @RG001
  Scenario: User want to create account
    Given User open app and navigate to register page
    When User inputs name "Testing account"
    And User inputs email "iniakuxd5f4fsscczsssdd5@gsfmabgil.com"
    And User inputs password "Admin123"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button registers
    Then User navigates to Account page

  @RG002
  Scenario: User want to create account without input name
    Given User open app and navigate to register page
    When User inputs email "iniakunbaru12@gmail.com"
    And User inputs password "Admin123"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Nama tidak boleh kosong"

  @RG003
  Scenario: User want to create account without input email
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs password "Admin123"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Email tidak boleh kosong"

  @RG004
  Scenario: User want to create account without input password
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs email "iniakunbaru12@gmail.com"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Password tidak boleh kosong"

  @RG005
  Scenario: User want to create account without input phone number
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs email "iniakunbaru12@gmail.com"
    And User inputs password "Admin123"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Nomor telepon tidak boleh kosong"

  @RG006
  Scenario: User want to create account without input city
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs email "iniakunbaru12@gmail.com"
    And User inputs password "Admin123"
    And User inputs phone number "08565425896"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Kota tidak boleh kosong"

  @RG007
  Scenario: User want to create account without input address
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs email "iniakunbaru12@gmail.com"
    And User inputs password "Admin123"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User tap button register
    Then Text warning "Alamat tidak boleh kosong"

  @RG008
  Scenario: User want to create account with input password less than 6 character
    Given User on the register page
    When User inputs name "Testing account"
    And User inputs email "iniakunbaru12@gmail.com"
    And User inputs password less than 6 character "Adm"
    And User inputs phone number "08565425896"
    And User inputs city "Bandung"
    And User inputs address "Jl Merdeka"
    And User tap button register
    Then Text warning "Alamat tidak boleh kosong"
