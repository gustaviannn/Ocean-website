package custServiceWorkBench
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



class custServiceWorkBench {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@And("User inquiry customer by name (.*)")
	def custName(String nama_customer) {
		
		WebUI.click(findTestObject('Object Repository/Dashboard/Customer_by_name/div_Customer Service Dashboard'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Customer_by_name/span_By Name'), 0)
		WebUI.setText(findTestObject('Object Repository/Dashboard/Customer_by_name/input__SHORT_NAME'), nama_customer)
		WebUI.click(findTestObject('Object Repository/Dashboard/Customer_by_name/span_Find'))
		
	}
	
	@And("User inquiry customer by ktp (.*)")
	def custKTP(String no_ktp) {
		
		WebUI.click(findTestObject('Object Repository/Dashboard/Customer_by_name/div_Customer Service Dashboard'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Customer_by_name/span_By Name'), 0)
		WebUI.click(findTestObject('Object Repository/Dashboard/Customer_by_ktp/span_By KTP'))
		WebUI.waitForElementPresent(findTestObject('Object Repository/Dashboard/Customer_by_ktp/span_By KTP'), 0)
		WebUI.setText(findTestObject('Object Repository/Dashboard/Customer_by_ktp/span_By KTP'), no_ktp)
		WebUI.click(findTestObject('Object Repository/Dashboard/Customer_by_name/span_Find'))
		
	}
}