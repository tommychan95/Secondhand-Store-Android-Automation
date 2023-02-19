@Preview @Smoke
Feature: Preview
  As an Seller, I want to preview product before add to sell list

  @PRE001
  Scenario: Seller want to preview product
    Given Seller has login into the app
    When Seller input email "irmapujiandrianis@gmail.com"
    And Seller input password "Admin123"
    And Seller click LOGIN Button
    And Seller click ADD Button
    And Sellers input Product Name "Samsung Galaxy A80"
    And Sellers input Product Price "8750000"
    And Sellers choose Product Category
    And Sellers input Location "Jakarta"
    And Sellers input Description "Samsung Galaxy New Release"
    And Sellers upload Product Photo
    And Sellers click Preview Button
    Then Sellers verify product information details
    
  @PRE002
  Scenario: Seller want to preview product while leave one of the field blank
    Given Seller has login into the apps
    And Seller click ADDS Button
    And Sellers input Products Prices "8750000"
    And Sellers choose Products Category
    And Sellers input Locations "Jakarta"
    And Sellers input Descriptions "Samsung Galaxy New Release"
    And Sellers upload Product Photos
    And Sellers click Previews Button
    Then Error Message Product Field can't be blank displayed

    