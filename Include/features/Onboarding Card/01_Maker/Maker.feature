@MakerCreateOnBoardingCard
Feature: Title of your feature
  I want to use this template for my feature file

  @Normal
  Scenario Outline: Title of your scenario outline
    Given User login <username>, <password>
    When User mengisi data <branch>, <app_type>, <name_issuing_client>

    Examples: 
      | username | password | branch       | app_type                                    | name_issuing_client |
      | cl_mkr_2 | cl_mkr_2 | AIW Denpasar | Corporate Billing Account & Card Onboarding | Cinema              |
