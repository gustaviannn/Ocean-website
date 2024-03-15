@issuingAppManagement
Feature: Title of your feature
  I want to use this template for my feature file

  @NewContract
  Scenario Outline: Melakukan pembuatan kontrak instalment
    Given User login <username>, <password>
    And User create new contract <contract_number>, <institusi>, <branch>, <apptype>, <InstalmentScheme>, <tenor>
    Then Supervisor approve

    Examples: 
      | username  | password  | contract_number            | institusi | branch       | apptype                 | InstalmentScheme | tenor |
      | cll_mkr_1 | cll_mkr_1 | 002-P-ACCT1681186759115874 | BRI       | KC Batulicin | Instalment: Restructure | RSTR_IPP         |     2 | 
