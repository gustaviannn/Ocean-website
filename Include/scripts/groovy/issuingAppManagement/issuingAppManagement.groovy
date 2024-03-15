package issuingAppManagement
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
import org.openqa.selenium.Keys as Keys



class issuingAppManagement {

	@Given("User create new contract (.*), (.*), (.*), (.*), (.*), (.*)")
	def newContract(String contract_number, String institusi, String branch, String apptype, String InstalmentScheme, String tenor) {

		// PILIH INSTITUSI
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/div_Issuing Application Management'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/div_Issuing Application Management'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/svg_Applications In Processing_svg'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/svg_Applications In Processing_svg'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/div_Create for Contract'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Institution'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Institution'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/span_BRI', [('pilih_institusi') : institusi]))
		WebUI.takeScreenshot()


		// PILIH BRANCH
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Branch'))
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/option_branch', [('pilih_branch') : branch]))
		WebUI.takeScreenshot()


		// PILIH APPLICATION TYPE
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Application_type'))
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/span_BRI Close Card', [('pilih_application_type') : apptype]))
		WebUI.takeScreenshot()


		//INQUIRY CONTRACT
		WebUI.scrollToElement(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/input__IssContract'), 1)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/input__IssContract'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/span_Find  Contract'), 0)
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/input_contract_number'))
		WebUI.setText(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/input_contract_number'), contract_number)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/span_Find'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/div_Select'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/div_Select'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Contract'), 0)
		WebUI.takeScreenshot()


		// PILIH CONTRACT
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/Contract'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/span_002-P-ACCT1681186759115874 (top contract)'))
		WebUI.takeScreenshot()


		// SAVE
		WebUI.scrollToElement(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/button_Save'), 1)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Issuing_Application_Management/New Contract/button_Save'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_OK'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_OK'))


		// APPLICATION DATA
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Application Data'), 0)
		WebUI.takeScreenshot()
		WebUI.callTestCase(findTestCase('Test Cases/Issuing App Management/save_registernumber'), null)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Application Data'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Instalment'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Instalment'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/Icon_edit'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/Icon_edit'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/input__InstalmentScheme'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dashboard/Application Proses New Contract/input__InstalmentScheme'), InstalmentScheme)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/input__Tenor'))
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/Dashboard/Application Proses New Contract/input__Tenor'), tenor)
		WebUI.takeScreenshot()
		WebUI.scrollToElement(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_Save'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_Save'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/Icon_close'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/Icon_close'))
		WebUI.takeScreenshot()


		// VALIDATE
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Validate'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/span_Validate'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_OK'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_OK'))
		WebUI.takeScreenshot()


		// SEND TO SUPERVISOR
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/div_Send to Supervisor'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_Save'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/Application Proses New Contract/button_Save'))
		WebUI.takeScreenshot()


		// SUPERVISOR LOGIN
		WebUI.click(findTestObject('Object Repository/Dashboard/div_cll_mkr_1'))
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Dashboard/div_Logout'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/login_page/input_English_login'), 10)
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/login_page/input_English_login'), "cll_sgn_1")
		WebUI.takeScreenshot()
		WebUI.setText(findTestObject('Object Repository/login_page/input_English_password'), "cll_sgn_1")
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/login_page/button_Login'))
		WebUI.takeScreenshot()
	}
}