package cobasarah
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



class cobasarah {
	@Then("Maker save nomor akun")
	def inquiry() {
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/div_Customer Service Dashboard'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/input__SHORT_NAME'))
//
//		WebUI.setText(findTestObject('Object Repository/coba sarah/input__SHORT_NAME'), "aldy")
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/span_Find'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/span_Select Customer'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/button_OK'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/span_Accounts'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/div_Product'))
//
//		WebUI.click(findTestObject('Object Repository/coba sarah/div_Product'))
//
//		WebUI.callTestCase(findTestCase('Test Cases/Save Nomor Akun'), null)
		
		WebUI.waitForElementPresent(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_menuOnBoardingApplication'), 3)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_menuOnBoardingApplication'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/01_Maker/01_Onboarding Client/addClient/button_addClient'))
		WebUI.takeFullPageScreenshot()
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
		
		WebUI.callTestCase(findTestCase('Test Cases/01_Onboarding Client/Save Apl Reg Number'), null)
		
		WebUI.closeBrowser()
		
		
	}
}