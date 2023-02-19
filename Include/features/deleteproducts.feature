@deleteproducts @Smoke
Feature: Delete Product
  I want to use this template for my delete product features

  @DP001
  Scenario: User tap delete button but does not delete product
    Given Usser open apk seconddhand
    When Usser input e-mail "studentqa3@binar.id"
    And Usser fill pwwd "studentQA3"
    And Usser press button login
    And Usser press button daftar jual saya
    And Usser press button trash
    Then Usser press menu cancel delete
    
   @DP002
   Scenario: User want to delete product that has been uploaded
   	Given Usser open apk seconddhand
   	When Usser input e-mail "studentqa3@binar.id"
   	And Usser fill pwwd "studentQA3"
   	And Usser press button login
   	And Usser press button daftar jual saya 
   	And Usser pressss button trash
   	And Usser tapp to hapus
   	Then Usser get notification delete successful
    
    

