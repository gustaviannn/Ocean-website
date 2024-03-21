@CheckerApproveOnBoardingClient
Feature: Issuing Application Management

  @Normal
  Scenario Outline: 8-019 CLF1 Checker Approve Entry Tiket Skenario Sukses
    Given User login <username>, <password>
    When User Issuing Application Management Menu
    When User approve the new issue
    When User request spv approval
    Then User logout
    
     Examples: 
      | username | password |
      | cl_chk_1 | cl_chk_1 |