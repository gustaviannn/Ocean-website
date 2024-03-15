@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @CustomerByName
  Scenario Outline: Title of your scenario outline: Title of your scenario outline
    Given User login
    And User inquiry customer by name <nama_customer>

    Examples: 
      | nama_customer |
      | aldy          |

  @CustomerByKTP
  Scenario Outline: Title of your scenario outline: Title of your scenario outline
    Given User login
    And User inquiry customer by ktp <no_ktp>

    Examples: 
      | no_ktp      |
      | 31313131313 |