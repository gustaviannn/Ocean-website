@MakerCreateOnBoardingClient
Feature: Onboarding Client and Credit Line

	@CLF1MakerSubmit2M
  Scenario Outline: 8-014 CLF1 Maker Submit Tiket Corporate Onboarding Skenario Sukses
    Given User login <username>, <password>
    When User click menu corporate onboarding, and click plus icon
    When User fill Fin Institution, Branch, Client Type and <newstr>
    When User fill <short_name>, <customer_name_1>, <customer_name_2>, <main_phone_number>, <mothers_name>
    When User then fill <cust_acc_num>, <ktp>, <npwp>, <brinet_id>, <edm_id>, <corp_cust>
    When User continue fill <emergency_contact>, <add_line_1>, <add_line_2>, <add_line_3>, <email>, <phone_mobile>, <state>, <city>, <zip>
    When User then continue fill <contract_name>, <cred_lim_amnt>, <cred_lim_reason>
    When User click save
    Then User logout

    Examples: 
      | username | password | application_id | short_name   | customer_name_1 | customer_name_2 | main_phone_number | mothers_name | cust_acc_num | ktp              | npwp             | brinet_id | edm_id | corp_cust  | emergency_contact | add_line_1 | add_line_2 | add_line_3 | email        | phone_mobile | state  | city | zip    | contract_name | cred_lim_amnt | cred_lim_reason | reason 					|
      | cl_mkr_1 | cl_mkr_1 | automationSV   | automationSV | mika            | namika          |       08212184511 | padme        | 123321abca   | 1111111111111111 | 8888888888888888 | 44332dd   | 566fd1 | automation | ibu               | jl jalan   | gang gu    | aja        | auto@bri.com |  08212222123 | jaksel | jkt  | 152222 | automationSV  |    2000000000 | by default      | pengajuan ulang |
	
	
	@CLF1MakerSubmit250jt
  Scenario Outline: 8-014 CLF1 Maker Submit Tiket Corporate Onboarding Skenario Sukses
    Given User login <username>, <password>
    When User click menu corporate onboarding, and click plus icon
    When User fill Fin Institution, Branch, Client Type and <newstr>
    When User fill <short_name>, <customer_name_1>, <customer_name_2>, <main_phone_number>, <mothers_name>
    When User then fill <cust_acc_num>, <ktp>, <npwp>, <brinet_id>, <edm_id>, <corp_cust>
    When User continue fill <emergency_contact>, <add_line_1>, <add_line_2>, <add_line_3>, <email>, <phone_mobile>, <state>, <city>, <zip>
    When User then continue fill <contract_name>, <cred_lim_amnt>, <cred_lim_reason>
    When User click save
    Then User logout

    Examples: 
      | username | password | application_id | short_name   | customer_name_1 | customer_name_2 | main_phone_number | mothers_name | cust_acc_num | ktp              | npwp             | brinet_id | edm_id | corp_cust  | emergency_contact | add_line_1 | add_line_2 | add_line_3 | email        | phone_mobile | state  | city | zip    | contract_name | cred_lim_amnt | cred_lim_reason | reason 					|
      | cl_mkr_1 | cl_mkr_1 | autoCV         | automationSV | james           | gordon          |       34234234233 | mitchelle    | sddfffqq11   | 1111111111111111 | 8888888888888888 | 44332dd   | 566fd1 | automation | ayah              | kabgusan   | timur      | utara      | auto@sv .com |  08212222123 | jaksel | jkt  | 152222 | automationSV  |    250000000  | by default      | kurang meyakinkan |
	
	
  @CLF1MakerFullFlow
  Scenario Outline: Full flow create onboarding client
    Given User login <username>, <password>
    When User click menu corporate onboarding, and click plus icon
    When User fill Fin Institution, Branch, Client Type and <newstr>
    When User fill <short_name>, <customer_name_1>, <customer_name_2>, <main_phone_number>, <mothers_name>
    When User then fill <cust_acc_num>, <ktp>, <npwp>, <brinet_id>, <edm_id>, <corp_cust>
    When User continue fill <emergency_contact>, <add_line_1>, <add_line_2>, <add_line_3>, <email>, <phone_mobile>, <state>, <city>, <zip>
    When User then continue fill <contract_name>, <cred_lim_amnt>, <cred_lim_reason>
    When User click save
    When User back to Home and go to Issuing menu
    When User input a <application_id>
    Then User logout

    Examples: 
      | username | password | application_id | short_name   | customer_name_1 | customer_name_2 | main_phone_number | mothers_name | cust_acc_num | ktp              | npwp             | brinet_id | edm_id | corp_cust  | emergency_contact | add_line_1 | add_line_2 | add_line_3 | email        | phone_mobile | state  | city | zip    | contract_name | cred_lim_amnt | cred_lim_reason | reason 					|
      | cl_mkr_1 | cl_mkr_1 | automationSV   | automationSV | mika            | namika          |       08212184511 | padme        | 123321abca   | 1111111111111111 | 8888888888888888 | 44332dd   | 566fd1 | automation | ibu               | jl jalan   | gang gu    | aja        | auto@bri.com |  08212222123 | jaksel | jkt  | 152222 | automationSV  |    2000000000 | by default      | pengajuan ulang |

      
      
      
      
      
      
      
      
      
      
      
      
      