import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.configuration.RunConfiguration
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
import com.kms.katalon.keyword.excel.ExcelKeywords

import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.WebElement
import com.kms.katalon.core.testobject.ConditionType
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


WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> tableTransaksi = driver.findElements(By.xpath("//tbody"))
List<String> listTrx = new ArrayList<String>()
List<String> listKolom = new ArrayList<String>()
//for(int i = 1; i < tableTransaksi.size(); i++) {
//	String journalSeq = driver.findElement(By.xpath("//tbody["+i+"] /child::tr[1]/child::td[3]")).text
//	listJurnal.add(journalSeq)
//}
//println listJurnal.get(tableTransaksi.size() - 1)
//println(listJurnal)

if (tableTransaksi.size() >= 1) {
	WebElement lastRow = tableTransaksi.get(tableTransaksi.size() - 1);
	String registernumber = lastRow.findElement(By.xpath("//div[5]/div/div/div[4]/span")).text
	String namakolom = lastRow.findElement(By.xpath("//div[4]/span/div")).text
	listTrx.add(registernumber)
	listKolom.add(namakolom)
	
	println (registernumber)
} else {
	println ("No transaction rows found.")
}

//TestData nomorrekening = findTestData('Data Files/NEW CUCUMBER/01 - Setor Tunai/01 - Setor Tunai Pinjaman/01 - Setor Tunai Pinjaman')

String desktopPath = Paths.get(System.getProperty("user.home"), "Desktop").toString()
String parentFolderName = "Automation Python"
String fileName = "registernumber.xlsx"
//
String parentFolderPath = Paths.get(desktopPath, parentFolderName).toString()
String filePath = Paths.get(parentFolderPath, fileName).toString()
//
String excelPath = filePath

//String excelPath = RunConfiguration.getProjectDir()+'/Excel/sequence_number.xlsx'
//String sequencenumbertitle = 'Sequence_Number'
//
//ExcelKeywords.createExcelFile(excelPath)
//workBook = ExcelKeywords.getWorkbook(excelPath)
//sheet = ExcelKeywords.getExcelSheet(workBook, sequencenumbertitle)
//
//
//
//for(int i = 0; i < listJurnal.size(); i++){
//	ExcelKeywords.setValueToCellByIndex(sheet, i, 0, listJurnal.get(i))
//	ExcelKeywords.saveWorkbook(excelPath, workBook)
//}

//String csvFilePath = "C:/Users/Username/Desktop/Automation Python/sequence_number.csv"
//
//CSVWriter writer = new CSVWriter(new FileWriter(csvFilePath, true))
//
//writer.writeNext(listJurnal)

//String excelPath = RunConfiguration.getProjectDir()+'/Excel/sequence_number.csv'

ExcelKeywords.createExcelFile(excelPath)
workBook = ExcelKeywords.getWorkbook(excelPath)
sheet = ExcelKeywords.getExcelSheet(workBook, "Sheet0")

for(int i = 0; i < listTrx.size(); i++){
	ExcelKeywords.setValueToCellByIndex(sheet, 1, i, listTrx.get(i))
	ExcelKeywords.setValueToCellByIndex(sheet, i, 0, listKolom.get(i))
	ExcelKeywords.saveWorkbook(excelPath, workBook)
}