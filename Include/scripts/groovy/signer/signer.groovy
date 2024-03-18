package signer
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



class signer {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Then("Supervisor approve")
	def spvApprove() {

		WebUI.click(findTestObject('Object Repository/Signer/span_Approve'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Signer/button_Save'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Signer/button_Save'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Signer/span_Accept'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Signer/span_Accept'))
		WebUI.takeScreenshot()
		WebUI.waitForElementPresent(findTestObject('Object Repository/Signer/button_Save'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Signer/button_Save'))
		WebUI.takeScreenshot()
	}

	@Then("Supervisor decline")
	def spvDecline() {

		WebUI.waitForElementPresent(findTestObject('Object Repository/Signer/span_Decline'), 0)
		WebUI.click(findTestObject('Object Repository/Signer/span_Decline'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Signer/button_Save'), 0)
		WebUI.takeScreenshot()
		WebUI.click(findTestObject('Object Repository/Signer/button_Save'))
		WebUI.takeScreenshot()
	}
}