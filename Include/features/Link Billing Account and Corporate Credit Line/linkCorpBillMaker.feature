@MakerLinkBillAndCredLine
Feature: Issuing Application Management

  @Normal
  Scenario Outline: CLF1 Signer Approve Entry Tiket Skenario Sukses 2M
    Given User login <username>, <password>
    When User go to Customer Service Dashboard Menu
    When User search for <customer>
    When User go to account page
    When User Choose account number and link the customer
    Then User logout as signer
    
     Examples: 
      | username    | password | customer			|
      | cl_mkr_1    | cl_mkr_1 | automationSV |