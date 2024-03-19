@Checker
Feature: Title of your feature
  I want to use this template for my feature file

  @CheckerEditContract
  Scenario Outline: Checker merubah nama kontrak
    Given Checker edit contract <editcontractname> and approve

    Examples: 
      | editcontractname |
      | ini sudah diedit |
