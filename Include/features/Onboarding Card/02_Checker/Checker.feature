@Checker
Feature: Title of your feature
  I want to use this template for my feature file

  @CheckerEditContract
  Scenario Outline: Checker merubah nama kontrak
    Given Checker edit contract <editcontractname> and approve

    Examples: 
      | editcontractname |
      | ini sudah diedit |

  @CheckerDecline3Kartu
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 2 kartu tambahan
    And Checker decline entry tiket

    Examples: 
      | username | password |
      | cl_mkr_2 | cl_mkr_2 |

  @CheckerDecline2Kartu
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data dan menambahkan 1 kartu tambahan
    And Checker decline entry tiket

    Examples: 
      | username | password |
      | cl_mkr_2 | cl_mkr_2 |
