package onBoardingCard
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

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


import org.openqa.selenium.Keys
import java.io.File
import org.openqa.selenium.JavascriptExecutor
import java.awt.Toolkit
import java.awt.datatransfer.Clipboard
import java.awt.datatransfer.StringSelection
import java.awt.Robot
import java.awt.event.KeyEvent
import java.lang.Thread
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook
import java.io.FileOutputStream
import java.nio.file.Paths
import org.apache.poi.ss.usermodel.Cell
import org.apache.poi.ss.usermodel.Row
import java.io.FileWriter



class onBoardingCard {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User mengisi data dan menambahkan 2 kartu tambahan")
	def inputData() {

		TestData onboardingcard = findTestData("Data Files/Onboarding Card")
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Issuing Application Management'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Create for Client'))

		//		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Institution'), 0)
		//
		//		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Institution'))
		//
		//		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/span_BRI', [('pilih_institusi') : institution]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_branch'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Branch', [('pilih_branch') : onboardingcard.getValue("branch", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_application_type'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Application_Type', [('pilih_app_type') : onboardingcard.getValue("app_type", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input__IssuingClient'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'), onboardingcard.getValue("name_issuing_client", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Find'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'))

		WebUI.callTestCase(findTestCase('Test Cases/Onboarding Card/Save Register Number'), null)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'), 0)

		///// APPLICATION DATA

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), onboardingcard.getValue("contract_name", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/dropdown_option_product', [('pilih_product') : onboardingcard.getValue("product", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_currency'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_IDR'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_Set Credit Limit'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/input__CreditLimitAmount'), "30000000")

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/Pilih_credit_limit_currency'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_IDR'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_IDR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/input__CreditLimitReason'), "coba")

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// CLASSIFIERS

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Details'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Full Amount'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Free Annual Fee 1st year'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))


		///// CARD 1

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), onboardingcard.getValue("contract_name", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : onboardingcard.getValue("product_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// Classifiers CARD 1


		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : onboardingcard.getValue("title", 1)]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), onboardingcard.getValue("EmbossedFirstName", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), onboardingcard.getValue("EmbossedLastName", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		String state = "Indonesia"
		String city = "Jakarta"
		String zipcode = "11530"
		String zipcode2 = "11630"
		String zipcode3 = "11730"
		String namajalan = "bahagia"
		String kelurahan = "Kebon Jeruk"
		String emergencycontact = "0812121212"
		String phonenumber = "08123456789"
		String email = "a@gmail.com"
		String email2 = "b@gmail.com"
		String email3 = "c@gmail.com"

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Indonesia'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__state'), state)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__City'), city)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__ZIPCode'), zipcode)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__customer_name'), onboardingcard.getValue("EmbossedFirstName", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_nama_jalan'), namajalan)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_kelurahan'), kelurahan)

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_emergency_contact'), emergencycontact)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/salutation'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_MR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_phonenumber'), phonenumber)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__Email'), email)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.takeFullPageScreenshot()

		///// TAMBAH 2 DAN 3 KARTU

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// SETUP KARTU 2

		WebUI.delay(4)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD 2'))
		
		WebUI.delay(4)

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))
		
		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), onboardingcard.getValue("contract_name", 2))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : onboardingcard.getValue("product_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : onboardingcard.getValue("title", 1)]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), onboardingcard.getValue("EmbossedFirstName_2", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), onboardingcard.getValue("EmbossedLastName_2", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Indonesia'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__state'), state)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__City'), city)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__ZIPCode'), zipcode)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__customer_name'), onboardingcard.getValue("EmbossedFirstName_2", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_nama_jalan'), namajalan)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_kelurahan'), kelurahan)

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_emergency_contact'), emergencycontact)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/salutation'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_MR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_phonenumber'), phonenumber)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__Email'), email2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))


		///// KARTU 3

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD 3'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))
		
		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), onboardingcard.getValue("contract_name", 3))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : onboardingcard.getValue("product_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// KARTU 3 CLASSIFIERS

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : onboardingcard.getValue("title", 1)]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), onboardingcard.getValue("EmbossedFirstName_3", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), onboardingcard.getValue("EmbossedLastName_3", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Indonesia'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__state'), state)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__City'), city)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__ZIPCode'), zipcode)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__customer_name'), onboardingcard.getValue("EmbossedFirstName_3", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_nama_jalan'), namajalan)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_kelurahan'), kelurahan)

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_emergency_contact'), emergencycontact)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/salutation'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_MR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_phonenumber'), phonenumber)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__Email'), email3)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))


		///// VALIDATE


		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/backtoapplicationprocessing'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'))

		WebUI.takeFullPageScreenshot()

		TestData registernumber = findTestData('Data Files/registernumber')

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'), registernumber.getValue("REGISTRATION NUMBER", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Find'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Validate'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Send to Supervisor'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.callTestCase(findTestCase('Test Cases/Onboarding Card/Save In Charge'), null)

		WebUI.click(findTestObject('Object Repository/Checker/Profile'))

		WebUI.click(findTestObject('Object Repository/Checker/Logout'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Login_page/input_English_login'), 0)
	}
	
	@And("User mengisi data dan menambahkan 1 kartu tambahan")
	def inputData2() {

		TestData onboardingcard = findTestData("Data Files/Onboarding Card")
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Issuing Application Management'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Create for Client'))

		//		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Institution'), 0)
		//
		//		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Institution'))
		//
		//		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/span_BRI', [('pilih_institusi') : institution]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_branch'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Branch', [('pilih_branch') : onboardingcard.getValue("branch", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_application_type'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Application_Type', [('pilih_app_type') : onboardingcard.getValue("app_type", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input__IssuingClient'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'), onboardingcard.getValue("name_issuing_client", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Find'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'))

		WebUI.callTestCase(findTestCase('Test Cases/Onboarding Card/Save Register Number'), null)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'), 0)

		///// APPLICATION DATA

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), onboardingcard.getValue("contract_name", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/dropdown_option_product', [('pilih_product') : onboardingcard.getValue("product", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_currency'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_IDR'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_Set Credit Limit'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/input__CreditLimitAmount'), "30000000")

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/Pilih_credit_limit_currency'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_IDR'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/span_IDR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create limit/input__CreditLimitReason'), "coba")

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// CLASSIFIERS

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Details'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Full Amount'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Free Annual Fee 1st year'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))


		///// CARD 1

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), onboardingcard.getValue("contract_name", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : onboardingcard.getValue("product_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// Classifiers CARD 1


		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : onboardingcard.getValue("title", 1)]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), onboardingcard.getValue("EmbossedFirstName", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), onboardingcard.getValue("EmbossedLastName", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		String state = "Indonesia"
		String city = "Jakarta"
		String zipcode = "11530"
		String zipcode2 = "11630"
		String zipcode3 = "11730"
		String namajalan = "bahagia"
		String kelurahan = "Kebon Jeruk"
		String emergencycontact = "0812121212"
		String phonenumber = "08123456789"
		String email = "a@gmail.com"
		String email2 = "b@gmail.com"
		String email3 = "c@gmail.com"

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Indonesia'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__state'), state)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__City'), city)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__ZIPCode'), zipcode)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__customer_name'), onboardingcard.getValue("EmbossedFirstName", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_nama_jalan'), namajalan)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_kelurahan'), kelurahan)

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_emergency_contact'), emergencycontact)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/salutation'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_MR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_phonenumber'), phonenumber)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__Email'), email)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.takeFullPageScreenshot()

		///// TAMBAH 1 KARTU

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Save'))

		WebUI.takeFullPageScreenshot()


		///// SETUP KARTU 2

		WebUI.delay(2)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), onboardingcard.getValue("contract_name", 2))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : onboardingcard.getValue("product_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : onboardingcard.getValue("value_card", 1)]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.takeFullPageScreenshot()

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_kedua'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/baris_ketiga'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/Card 1/span_Yes_baris3'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : onboardingcard.getValue("title", 2)]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), onboardingcard.getValue("EmbossedFirstName_2", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), onboardingcard.getValue("EmbossedLastName_2", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Addresses'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.doubleClick(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Home Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/edit_Address'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/select_country'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_Indonesia'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__state'), state)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__City'), city)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__ZIPCode'), zipcode)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__customer_name'), onboardingcard.getValue("EmbossedFirstName_2", 1))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_nama_jalan'), namajalan)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_kelurahan'), kelurahan)

		WebUI.takeFullPageScreenshot()

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_emergency_contact'), emergencycontact)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/salutation'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/span_MR'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input_phonenumber'), phonenumber)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/input__Email'), email2)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/Create address/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))


		///// VALIDATE


		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/backtoapplicationprocessing'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'))

		WebUI.takeFullPageScreenshot()

		TestData registernumber = findTestData('Data Files/registernumber')

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'), registernumber.getValue("REGISTRATION NUMBER", 1))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Find'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Validate'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'), 0)

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Send to Supervisor'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_Save'))

		WebUI.takeFullPageScreenshot()

		WebUI.callTestCase(findTestCase('Test Cases/Onboarding Card/Save In Charge'), null)

		WebUI.click(findTestObject('Object Repository/Checker/Profile'))

		WebUI.click(findTestObject('Object Repository/Checker/Logout'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Login_page/input_English_login'), 0)
	}

	@And("User tidak mengisi data mandatory (.*), (.*)")
	def tidakMengisiDataMandatory(String pilih_branch, String pilih_apptype) {

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Issuing Application Management'))

		WebUI.takeFullPageScreenshot()

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Create for Client'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_branch'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Branch', [('pilih_branch') : pilih_branch]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_application_type'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Application_Type', [('pilih_app_type') : pilih_apptype]))

		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.takeFullPageScreenshot()
	}
}