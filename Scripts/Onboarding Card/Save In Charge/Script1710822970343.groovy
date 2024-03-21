import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.kms.katalon.keyword.excel.ExcelKeywords as ExcelKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.By as By
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.testobject.ConditionType as ConditionType
import java.io.File as File
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import java.awt.Toolkit as Toolkit
import java.awt.datatransfer.Clipboard as Clipboard
import java.awt.datatransfer.StringSelection as StringSelection
import java.awt.Robot as Robot
import java.awt.event.KeyEvent as KeyEvent
import java.lang.Thread as Thread
import org.apache.poi.ss.usermodel.*
import org.apache.poi.xssf.usermodel.XSSFWorkbook as XSSFWorkbook
import java.io.FileOutputStream as FileOutputStream
import java.nio.file.Paths as Paths
import org.apache.poi.ss.usermodel.Cell as Cell
import org.apache.poi.ss.usermodel.Row as Row
import java.io.FileWriter as FileWriter

WebUI.findWebElement(findTestObject('Object Repository/01_Maker/Onboarding Card/Dashboard/span_cl_mkr_2'), 2)

WebUI.scrollToElement(findTestObject('Object Repository/01_Maker/Onboarding Card/Dashboard/span_cl_mkr_2'), 2)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> tableTransaksi = driver.findElements(By.xpath('//tbody'))

List<WebElement> listSigner = new ArrayList<String>()

List<WebElement> listKolom = new ArrayList<String>()

if (tableTransaksi.size() >= 1) {
    WebElement lastRow = tableTransaksi.get(tableTransaksi.size() - 1)

    String signer = lastRow.findElement(By.xpath('//div[5]/div/div/div[11]/span')).text

    String namakolom = lastRow.findElement(By.xpath('//div[11]/span/div')).text

    listSigner.add(signer)

    listKolom.add(namakolom)

    println(signer)
} else {
    println('No transaction rows found.')
}

//TestData nomorrekening = findTestData('Data Files/NEW CUCUMBER/01 - Setor Tunai/01 - Setor Tunai Pinjaman/01 - Setor Tunai Pinjaman')
String desktopPath = Paths.get(System.getProperty('user.home'), 'Desktop').toString()

String parentFolderName = 'Automation Python'

String fileName = 'loginchecker.xlsx'

//
String parentFolderPath = Paths.get(desktopPath, parentFolderName).toString()

String filePath = Paths.get(parentFolderPath, fileName).toString()

//
String excelPath = filePath

ExcelKeywords.createExcelFile(excelPath)

workBook = ExcelKeywords.getWorkbook(excelPath)

sheet = ExcelKeywords.getExcelSheet(workBook, 'Sheet0')

for (int i = 0; i < listSigner.size(); i++) {
    ExcelKeywords.setValueToCellByIndex(sheet, 1, i, listSigner.get(i))

    ExcelKeywords.setValueToCellByIndex(sheet, i, 0, listKolom.get(i))

    ExcelKeywords.saveWorkbook(excelPath, workBook)
}