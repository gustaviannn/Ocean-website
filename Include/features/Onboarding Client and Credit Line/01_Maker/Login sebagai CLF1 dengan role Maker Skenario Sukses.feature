Feature: Onboarding Client and Credit Line

  @loginMaker1
  Scenario Outline: Login sebagai CLF1 dengan role Maker Skenario Sukses
    Given User login <username>, <password>

    Examples: 
      | username  | password |
      | CL_MKR_1  | CL_MKR_1 |