@SignerApproveOnBoardingClient
Feature: Issuing Application Management

  @CLF1Signert2M
  Scenario Outline: CLF1 Signer Approve Entry Tiket Skenario Sukses 2M
    Given User login <username>, <password>
    When User go to Supervisor App Management Menu
    When User approve issue
    When User do approval
    Then User logout as signer
    
     Examples: 
      | username    | password |
      | div_head    | 12345    |
      
  @CLF1Signert250jt
  Scenario Outline: CLF1 Signer Approve Entry Tiket Skenario Sukses 2M
    Given User login <username>, <password>
    When User go to Supervisor App Management Menu
    When User approve issue
    When User do approval
    Then User logout as signer
    
     Examples: 
      | username    | password |
      | team_leader | 12345    |
      
      
      
      
      
      
      
      
      
      
      
      
      
      