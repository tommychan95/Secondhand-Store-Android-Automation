@addproducts @Smoke
Feature: Add Products
  I want to use this template for add product 

  @AP001
  Scenario: User input product by filling all descriptions product
    Given Users navigatedd to login
    When Users fill in email "studentqa3@binar.id"
    And Users fill in pwd "studentQA3"
    And Users tap button login
    And Users navigate to add product
    And Users input nama produk
    And Users input harga produk
    And Users choose kategori produk
    And Users input lokasi produk
    And Users input deskripsi produk
    And Users choose photo produk
    And Users tap terbitkan
    Then Users get notification success add produk
    
   @AP002
   Scenario: User want to add product without input name product 
   		Given Users navigateeddd to login
   		When Users navigatte to add produk
   		And Users input hargaa produk
   		And Users choose kategorii produk
   		And Users input lokasii produk
   		And Users input deskripsii produk
   		And Users choose photoo produk
   		And Users squeeeze terbitkan
   		Then Users get popupp notification failed add product   
   		