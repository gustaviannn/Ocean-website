@CLF1LoginOnBoardingClient
Feature: Login as CLF1 Checker

	@MakerLoginOnBoardingClient
  Scenario Outline: 8-009 Login sebagai CLF1 dengan role Maker Skenario Sukses
    Given User login <username>, <password>
    
    Examples: 
      | username | password |
      | cl_mkr_1 | cl_mkr_1 |


  @CheckerLoginOnBoardingClient
  Scenario Outline: 8-016 Login sebagai CLF1 dengan role Checker Skenario Sukses
    Given User login <username>, <password>
    
    Examples: 
      | username | password |
      | cl_chk_1 | cl_chk_1 |
      
      
  @Signer2MLoginOnBoardingClient
  Scenario Outline: 8-021 Login sebagai CLF1 dengan role Signer 2M Skenario Sukses
    Given User login <username>, <password>
    
    Examples: 
      | username | password |
      | div_head | 12345    |
      
      
      
      
      
      
      
      
      