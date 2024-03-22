@MakerCreateOnBoardingCard
Feature: Title of your feature
  I want to use this template for my feature file

  @MakerLogin
  Scenario Outline: Maker gagal membuat transaksi karena data nasabah tidak ditemukan
    Given User login <username>, <password>

    Examples: 
      | username | password |
      | cl_mkr_2 | cl_mkr_2 |

  @MakerEntryData3KartuKorporat
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 2 kartu tambahan
    And Checker edit contract <editcontractname> and approve
    Then Signer approve and accept <usernamesigner>, <passwordsigner>

    Examples: 
      | usernamesigner | passwordsigner | username | password | editcontractname      |
      | cdd_sgn_1      | cdd_sgn_1      | cl_mkr_2 | cl_mkr_2 | ini sudah diedit aldy |

  @MakerGagalSubmit
  Scenario Outline: Maker gagal submit karena data mandatory tidak diisi
    Given User login <username>, <password>
    When User tidak mengisi data mandatory <pilih_branch>, <pilih_apptype>

    Examples: 
      | username | password | pilih_branch | pilih_apptype                               |
      | cl_mkr_2 | cl_mkr_2 | AIW Denpasar | Corporate Billing Account & Card Onboarding |

  @MakerEntryData2KartuKorporat
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 1 kartu tambahan
    And Checker edit contract <editcontractname> and approve
    Then Signer approve and accept <usernamesigner>, <passwordsigner>

    Examples: 
      | usernamesigner | passwordsigner | username | password | editcontractname      |
      | cdd_sgn_1      | cdd_sgn_1      | cl_mkr_2 | cl_mkr_2 | ini sudah diedit aldy |

  @MakerNasabahTidakDitemukan
  Scenario Outline: Maker gagal membuat transaksi karena data nasabah tidak ditemukan
    Given User login <username>, <password>
    And User mencari data nasabah <nama_nasabah>

    Examples: 
      | username | password | nama_nasabah |
      | cl_mkr_2 | cl_mkr_2 | indodrink    |
