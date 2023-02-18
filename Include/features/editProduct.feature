@editProduct @Smoke
Feature: Edit Product
  As an Seller, I want to change the product info on Secondhand App
  
  @EP001
  Scenario: Selerr want to accept offering product from buyyer 
    Given Selerr has successfully login into the app
    When Selerr input email "ikatriyuli@gmail.com"
    And Selerr input password "Kaminka13"
    And Selerr click Login Button
    And Selerr click Daftar Jual Produk Saya
    And Selerr click Choose Item Product
    And Selerr Input Product Form
    And Selerr click Button Perbarui
    Then App Verify Success Update the product will displayed