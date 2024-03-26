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



class stepdef_checker {
	@When("User Issuing Application Management Menu")
	def issuing_application_menu() {
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_issuing_application_menu'))
		WebUI.takeFullPageScreenshot()
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		//WebUI.closeBrowser()
	}

	@When("User approve the new issue")
	def approve_newIssue() {
		//		def test = new stepdef_maker()
		//		def apl_reg_num = test.getAplRegNum()

		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_approve_1'))
		WebUI.takeFullPageScreenshot()
		
		//WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/input_reason'))
		//WebUI.sendKeys(findTestObject('Object Repository/02_Checker/01_Onboarding Client/input_comment'), "validate please")
		
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_save_reason'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_ok_send'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_approve_2'))
		//WebUI.sendKeys(findTestObject('Object Repository/02_Checker/01_Onboarding Client/input_comment'), "validate please")
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_save_reason_2'))
		WebUI.delay(2)
		WebUI.takeFullPageScreenshot()
		
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_ok_send_2'))
		WebUI.takeFullPageScreenshot()
	}

	@When("User request spv approval")
	def reqSpv() {
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_send_to_spv'))
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/02_Checker/01_Onboarding Client/button_save_spv'))
		WebUI.takeFullPageScreenshot()
	}
}































