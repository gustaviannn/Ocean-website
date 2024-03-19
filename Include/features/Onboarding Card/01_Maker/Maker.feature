@MakerCreateOnBoardingCard
Feature: Title of your feature
  I want to use this template for my feature file

  @Normal
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data <institution>, <branch>, <app_type>, <name_issuing_client>, <contract_name>, <product>, <value>, <value_card>, <product_card>, <title>, <EmbossedFirstName>, <EmbossedLastName>, <EmbossedFirstName_2>, <EmbossedLastName_2>, <EmbossedFirstName_3>, <EmbossedLastName_3>

    Examples: 
      | username | password | institution | branch       | app_type                                    | name_issuing_client | contract_name | product                             | value | value_card | product_card          | title | EmbossedFirstName | EmbossedLastName | EmbossedFirstName_2 | EmbossedLastName_2 | EmbossedFirstName_3 | EmbossedLastName_3 |
      | cl_mkr_2 | cl_mkr_2 | BRI         | AIW Denpasar | Corporate Billing Account & Card Onboarding | Cinema              | cinema xxi    | 002-MC Credit Card 01 Corporate Iss |    10 | Physical   | 002-Corporate Card 01 | MR    | Aldy              | Gustavian        | Charisma            | Dian               | Bianca              | Fianto             |
