package login
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



class login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User login (.*), (.*)")
	def userLogin(String username, String password) {

		//		TestData data = findTestData('Data Files/login')
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.sendKeys(findTestObject('Object Repository/advance_btn'), GlobalVariable.unsafe)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login_page/input_English_login'), 10)
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_login'), username)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_password'), password)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/Login_page/button_Login'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/01_Maker/02_Onboarding Card/Dashboard/div_Issuing Application Management'), 0)
		WebUI.takeFullPageScreenshot()
	}

	@And("Supervisor login")
	def spvLogin() {

		//		TestData data = findTestData('Data Files/login')
		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.sendKeys(findTestObject('Object Repository/advance_btn'), GlobalVariable.unsafe)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login_page/input_English_login'), 10)
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_login'), "cdd_sgn_1")
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_password'), "cdd_sgn_1")
		WebUI.click(findTestObject('Object Repository/Login_page/button_Login'))
	}


	@And("Checker login (.*), (.*)")
	def checkerLogin(String username, String password) {

		WebUI.openBrowser(GlobalVariable.url)
		WebUI.maximizeWindow()
		WebUI.sendKeys(findTestObject('Object Repository/advance_btn'), GlobalVariable.unsafe)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Login_page/input_English_login'), 10)
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_login'), username)
		WebUI.takeFullPageScreenshot()
		WebUI.setText(findTestObject('Object Repository/Login_page/input_English_password'), password)
		WebUI.takeFullPageScreenshot()
		WebUI.click(findTestObject('Object Repository/Login_page/button_Login'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/01_Maker/02_Onboarding Card/Dashboard/div_Issuing Application Management'), 0)
		WebUI.takeFullPageScreenshot()
	}
}