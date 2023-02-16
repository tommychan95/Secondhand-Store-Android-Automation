@Offering @Smoke
Feature: Offering
  As an user, I want to fill and send offering price in Secondhand App

  @OF001
  Scenario: Buyer want to fill and send offering price
    Given Buyer has successfully login into the app
    When Buyer input email "irmapujiandrianis@gmail.com"
    And Buyer input password "Admin123"
    And Buyer click Login Button
    And Buyer click Home Page
    And Buyer click Product
    And Buyer click Interested Button
    And Buyer input Offering Price "7500"
    And Buyer click Send Button
    Then Success Message Displayed

	@OF002
  Scenario: Buyer want to fill and send offering price while leave the field blank
    Given Buyer has login into the app
    And Buyer click Productt
    And Buyer click Interestedd Button
    And Buyers input Offering Price "6000"
    And Buyer delete Offering Price
    And Buyers click Send Button
    Then Error Message Displayed