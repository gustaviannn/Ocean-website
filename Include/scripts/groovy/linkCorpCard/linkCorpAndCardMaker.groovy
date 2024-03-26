package linkCorpCard
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



class linkCorpAndCardMaker {
	@When("User go to Customer Service Dashboard Menu")
	def menuCustService() {
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_menu_cust_service_dashboard'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User search for (.*)")
	def searchCustomer(String customer) {
		WebUI.setText(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/field_customer_name'), customer)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_find_customer'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_select_customer'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_ok_popup'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
	}

	@When("User go to account page")
	def accountPage() {
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_account_page'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/list_account'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User Choose account number and link the customer")
	def linkCust() {
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_details_account'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/icon_edit_account'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/dropdown_liab_contract'))
		WebUI.takeFullPageScreenshot()

		//need to find better path
		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/drodown_list_liab'))
		WebUI.takeFullPageScreenshot()

		WebUI.click(findTestObject('Object Repository/01_Maker/03_Link Corp Billing and Credit Line/button_save_edit_account'))
		WebUI.takeFullPageScreenshot()
	}
}



















