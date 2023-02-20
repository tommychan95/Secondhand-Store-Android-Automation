@Search_product @Smoke
Feature: Search Product
   As an user, I want to search product by product name

  @SP001
  Scenario: User want to search product by name
    Given User navigate to search page
    When User inputs name product 
    Then Product will appear
    
    
	@SP002
  Scenario: User want to see detail product by search name
    Given User on the search page
    When User inputs name product 
    When User click product
    Then User already in detail product page