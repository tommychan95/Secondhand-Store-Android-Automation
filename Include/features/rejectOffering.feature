@rejectOffering @Smoke
Feature: Reject Offering
  As an Seller, I want to reject offering product from buyyer in Secondhand App

  @RO001
  Scenario: Sellerrr want to reject offering product from buyyer 
    Given Sellerrr has successfully login into the app
    When Sellerrr input email "ikatriyuli@gmail.com"
    And Sellerrr input password "Kaminka13"
    And Sellerrr click Login Button
    And Sellerrr click Daftar Jual Produk Saya
    And Sellerrr click Diminati
    And Sellerrr choose item offering product
    And Sellerrr click Button Tolak
    Then Sellerrr verify "Penawaran ditolak" displayed