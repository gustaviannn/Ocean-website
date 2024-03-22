@Signer
Feature: Title of your feature
  I want to use this template for my feature file

  @SignerLogin
  Scenario: Title of your scenario outline
    Given Supervisor login

  @SignerApprove
  Scenario Outline: Title of your scenario outline
    Given Signer approve and accept <usernamesigner>, <passwordsigner>

    Examples: 
      | usernamesigner | passwordsigner |
      | cdd_sgn_1      | cdd_sgn_1      |

  @SignerDecline2Kartu
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 1 kartu tambahan
    And Checker edit contract <editcontractname> and approve
    Then Signer decline entry tiket <usernamesigner>, <passwordsigner>

    Examples: 
      | usernamesigner | passwordsigner | username | password | editcontractname      |
      | cdd_sgn_1      | cdd_sgn_1      | cl_mkr_2 | cl_mkr_2 | ini sudah diedit aldy |

  @SignerDecline3Kartu
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 2 kartu tambahan
    And Checker edit contract <editcontractname> and approve
    Then Signer decline entry tiket <usernamesigner>, <passwordsigner>

    Examples: 
      | usernamesigner | passwordsigner | username | password | editcontractname      |
      | cdd_sgn_1      | cdd_sgn_1      | cl_mkr_2 | cl_mkr_2 | ini sudah diedit aldy |

  @SignerMonitor
  Scenario Outline: Memonitor Data Nasabah dan Kartu Korporat yang telah diproses  Skenario Sukses
    Given Supervisor login
    And Signer Memonitor Data Nasabah dan Kartu Korporat yang telah diproses <name>

    Examples: 
      | name |
      | aldy |
