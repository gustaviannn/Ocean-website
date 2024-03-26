package onBoardingClient
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.Keys as Keys

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import org.apache.poi.xssf.usermodel.XSSFWorkbook

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



public class stepdef_maker {

//	def getAplRegNum() {
//		return WebUI.getAttribute(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/apl_number'), 'title')
//	}

	@When("User click menu corporate onboarding, and click plus icon")
	def menu_onboardClient() {
		WebUI.waitForElementPresent(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_menuOnBoardingApplication'), 3)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_menuOnBoardingApplication'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_addClient'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User fill Fin Institution, Branch, Client Type and (.*)")
	def fill_applicationData(String application_id) {
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_finInstitution'))
		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementClickable(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_BRI'), 2)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_BRI'))
		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_branch'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_branch')) //bandung
		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_client_category'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_client_category'))
		WebUI.takeFullPageScreenshot()

		def aplRegNum_get
//		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_applicationID'), apl_reg_num)
		//WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_applicationID'), apl_reg_num)
		
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_applicationID'), aplRegNum_get.testSubstance)
		
		WebUI.takeFullPageScreenshot()
	}

	@When("User fill (.*), (.*), (.*), (.*), (.*)")
	def fill_personalData(String short_name, String customer_name_1, String customer_name_2, String main_phone_number, String mothers_name) {
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_shortname'), short_name)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_firstname'), customer_name_1)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_lastname'), customer_name_2)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_phonenumber'), main_phone_number)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_mothersname'), mothers_name)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_cardholderaddress'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_cardholderaddress'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_statementtype'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_statementtype'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User then fill (.*), (.*), (.*), (.*), (.*), (.*)")
	def fill_identificationData(String cust_acc_num, String ktp, String npwp, String brinet_id, String edm_id, String corp_cust) {
		WebUI.scrollToElement(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_cust_acc_num'), 3)
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_cust_acc_num'), cust_acc_num)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_ktp'), ktp)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_npwp'), npwp)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_brinet_id'), brinet_id)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_edm_id'), edm_id)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_corp_cust'), corp_cust)
		WebUI.takeFullPageScreenshot()
	}

	@When("User continue fill (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def fill_currentAddress(String emergency_contact, String add_line_1, String add_line_2, String add_line_3, String email, String phone_mobile, String state, String city, String zip) {
		WebUI.scrollToElement(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_emergency_contact'), 3)
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_emergency_contact'), emergency_contact)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_add_line_1'), add_line_1)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_add_line_2'), add_line_2)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_add_line_3'), add_line_3)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_email'), email)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_phone_mobile'), phone_mobile)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_state'), state)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_city'), city)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_zip'), zip)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_country'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_country'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User then continue fill (.*), (.*), (.*)")
	def fill_creditLineData(String contract_name, String cred_lim_amnt, String cred_lim_reason) {
		WebUI.scrollToElement(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_contract_name'), 3)
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_contract_name'), contract_name)
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_cred_lim_amnt'), cred_lim_amnt)
		WebUI.setText(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_cred_lim_reason'), cred_lim_reason)
		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_product'))
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_product'))

		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/input_lim_curr'))
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/select_lim_curr'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User click save")
	def save_onboardingClient() {
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_save'))
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
	}

	//Issuing Client
	@When("User back to Home and go to Issuing menu")
	def menu_issuing() {
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_home'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_issuingApplicationManagement'))

		//		def apl_reg_num = getAplRegNum()
		//		WebUI.click(apl_reg_num)

		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_validate'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_ok_send'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_ok_validate'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_send_to_spv'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/input_reason_exp'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/select_reason_exp'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User input a (.*)")
	def issue_reasoning(String application_id) {
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/textbox_reason'))
		WebUI.takeFullPageScreenshot()
		WebUI.sendKeys(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/textbox_reason'), "validate please")
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/issuingClient/button_save'))
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
	}

	@Then("User logout")
	def maker_logout() {
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/logoutMaker/button_profile'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/logoutMaker/button_logout'))
		WebUI.delay(3)
		WebUI.takeFullPageScreenshot()
		WebUI.closeBrowser()
	}
}










