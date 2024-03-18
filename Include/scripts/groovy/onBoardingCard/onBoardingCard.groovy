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
	@Given("User mengisi data (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*), (.*)")
	def inputData(String branch, String app_type, String name_issuing_client, String contract_name, String product, String value, String value_card, String product_card, String title, String EmbossedFirstName, String EmbossedLastName, String EmbossedFirstName_2, String EmbossedLastName_2, String EmbossedFirstName_3, String EmbossedLastName_3) {

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Issuing Application Management'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_create'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/div_Create for Client'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_branch'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_branch'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Branch', [('pilih_branch') : branch]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Pilih_application_type'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/Dropdown_option_Application_Type', [('pilih_app_type') : app_type]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input__IssuingClient'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/input_name_issuing_client'), name_issuing_client)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Find'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Select'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_OK'))
		
		WebUI.callTestCase(findTestCase('Test Cases/Onboarding Card/Save Register Number'), null)

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'), 0)

		///// APPLICATION DATA

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_Application Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/input_contractname'), contract_name)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/button_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/dropdown_option_product', [('pilih_product') : product]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/pilih_currency'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_IDR'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))


		///// CLASSIFIERS

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Classifiers'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/span_Details'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/button_Edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Classifiers/dropdown_option_value', [('pilih_value') : value]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))


		///// SETUP CARD CONTRACT

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), contract_name)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : product_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : value_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : title]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), EmbossedFirstName)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), EmbossedLastName)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		///// TAMBAH 2 DAN 3 KARTU

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/span_CONTRACT 40783682123440'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))

		WebUI.waitForElementClickable(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Add Contract'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Save'))

		///// SETUP KARTU 2


		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD 2'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), contract_name)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : product_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : value_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : title]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), EmbossedFirstName_2)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), EmbossedLastName_2)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)

		///// SETUP KARTU 3


		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_CARD 3'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_Set Plastic Information_ng-isolate-scope'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__ContractName'), contract_name)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Application Data/div_Set Product  Relation'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_product'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_002-Corporate Card 01', [('pilih_productcard') : product_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Details'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_Edit_Classifiers'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_value'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/dropdown_option_value', [('pilih_value') : value_card]))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Card Data'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/icon_edit'))

		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), 0)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/pilih_title'))

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_MR', [('pilih_embossing_title') : title]))

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedFirstName'), EmbossedFirstName_3)

		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input__EmbossedLastName'), EmbossedLastName_3)

		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Dashboard/button_Save'))

		WebUI.findWebElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 0)

		WebUI.scrollToElement(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/div_Embossing Parms'), 1)
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_close'))
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/backtoapplicationprocessing'))
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'), 0)
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_By Registration Number'))
		
		TestData registernumber = findTestData('Data Files/registernumber')
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'))
		
		WebUI.setText(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/input_register_number'), registernumber.getValue("REGISTRATION NUMBER", 1))
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Find'))
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/span_Validate'))
		
		WebUI.click(findTestObject('Object Repository/Maker/Onboarding Card/Setup Card Contract/button_OK_popup_validate'))
	}


	@Then("I verify the (.*) in step")
	def I_verify_the_status_in_step(String status) {
		println status
	}
}