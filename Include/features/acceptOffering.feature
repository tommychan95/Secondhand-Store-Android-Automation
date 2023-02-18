@acceptOffering @Smoke
Feature: Accept Offering
  As an Seller, I want to accept offering product from buyyer in Secondhand App

  @AO001
  Scenario: Selllerrr want to accept offering product from buyyer 
    Given Selllerrr has successfully login into the app
    When Selllerrr input email "ikatriyuli@gmail.com"
    And Selllerrr input password "Kaminka13"
    And Selllerrr click Login Button
    And Selllerrr click Daftar Jual Produk Saya
    And Selllerrr click Diminati
    And Selllerrr choose item offering product
    And Selllerrr click Button Terima
    Then Selllerrr verify "Penawaran harga berhasil" displayed