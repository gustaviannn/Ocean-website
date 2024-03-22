@SignerApproveOnBoardingClient
Feature: Issuing Application Management

  @Normal
  Scenario Outline: CLF1 Signer Approve Entry Tiket Skenario Sukses 2M
    Given User login <username>, <password>
    When User go to Supervisor App Management Menu
    When User approve issue
    When User do approval
    Then User logout
    
     Examples: 
      | username    | password |
      | team_leader | 12345    |