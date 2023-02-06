import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
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
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Agent/Create EB Customer/tc_01_FilledAllFieldCorrectly'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Agent/Delete EB Customer/tab_EB Customers'))

WebUI.click(findTestObject('Agent/Delete EB Customer/customer_checkbox'))

WebUI.click(findTestObject('Agent/Delete EB Customer/button_Delete'))

WebUI.click(findTestObject('Agent/Delete EB Customer/button_No'))

WebUI.delay(2)

WebUI.click(findTestObject('Agent/Delete EB Customer/button_Delete'))

WebUI.click(findTestObject('Agent/Delete EB Customer/button_Yes'))

WebUI.delay(2)

WebUI.verifyTextNotPresent('Excalibur101 ', true)
