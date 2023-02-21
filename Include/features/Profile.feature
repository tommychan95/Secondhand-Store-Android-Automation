@Profile @Smoke
Feature: Profile
   As an user, I want to update my profile

  @PF001
  Scenario: User want change name
    Given User open app and navigate to profile page using "binarqae1@gmail.com" and "students123"
    When User tap change name and input "admin"
    And User tap submit button
    Then User show success alert and data "admin" has been updated

  @PF002
  Scenario: User want change phone number
    Given User in profile page
    When User tap change phone and input "0821122212"
    And User tap submit button
    Then User show success alert and data "0821122212" has been updated

  @PF003
  Scenario: User want change city
    Given User in profile page
    When User tap change city and input "Jakarta"
    And User tap submit button
    Then User show success alert and data "Jakarta" has been updated
    
  @PF004
  Scenario: User want change address
    Given User in profile page
    When User tap change address and input "Tebet"
    And User tap submit button
    Then User show success alert and data "Tebet" has been updated
  
  @PF005
  Scenario: User want change email
    Given User in profile page
    When User tap change email address and input "binarqae1@gmail.com"
    And User tap submit button
    Then User show success alert and data "binarqae1@gmail.com" has been updated
    
  @PF006
  Scenario: User want change password
    Given User in profile page
    When User tap change password and input "students123" as current password, "students123" as new password and "students123" as confirmation password
    And User tap submit button
    Then User show success alert
    
  @PF007
  Scenario: User want change password where confirmation password is incorrect
    Given User in profile page
    When User tap change password and input "students123" as current password, "students123" as new password and "students1234" as confirmation password
    And User tap submit button
    Then Warning text "Kata sandi tidak sesuai" will be shown
    
  @PF008
  Scenario: User want change password where confirmation password is incorrect
    Given User in profile page
    When User tap change name and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup
    
  @PF009
  Scenario: User want change profile picture
    Given User in profile page
    When User change profile picture
    Then User show success alert
    
  @PF010
  Scenario: User want change name with empty value
    Given User in profile page
    When User tap change name and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup
    
  @PF011
  Scenario: User want change phone number with empty value
    Given User in profile page
    When User tap change phone and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup
    
  @PF012
  Scenario: User want change city with empty value
    Given User in profile page
    When User tap change city and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup
    
  @PF013
  Scenario: User want change address with empty value
    Given User in profile page
    When User tap change address and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup
    
  @PF014
  Scenario: User want change email with empty value
    Given User in profile page
    When User tap change email address and input ""
    And User tap submit button
    Then Warning text "Wajib diisi." will be shown and close popup