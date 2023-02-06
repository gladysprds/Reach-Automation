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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reach-dev.embreo.global/login')

WebUI.click(findTestObject('Admin/Update Agency/Unique_Admin_tab'))

WebUI.setText(findTestObject('Admin/Update Agency/Field_Email sign in'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Update Agency/Field_Password sign in'), 'singapore')

WebUI.click(findTestObject('Admin/Update Agency/button_Sign In'))

WebUI.click(findTestObject('Admin/Update Agency/Unique_Agency Section'))

WebUI.click(findTestObject('Admin/Update Agency/Agency detail'))

WebUI.sendKeys(findTestObject('Admin/Update Agency/Unique_Field_Agency Name'), ' Does')

WebUI.sendKeys(findTestObject('Admin/Update Agency/Unique_Field_Head Name'), ' corps don esto')

WebUI.click(findTestObject('Admin/Update Agency/Unique_License Type Dropdown'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Admin/Update Agency/Unique_General License type'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Admin/Update Agency/Unique_Field General License'), '11')

WebUI.sendKeys(findTestObject('Admin/Update Agency/Unique_Field_Contact Name'), 'doens')

WebUI.sendKeys(findTestObject('Admin/Update Agency/Unique_Field_Contact Number'), '1')

WebUI.click(findTestObject('Admin/Update Agency/Unique_Field_Insurance'))

WebUI.click(findTestObject('Admin/Update Agency/Unique_choosing_insurer'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/button_Update Agent'))

WebUI.verifyElementText(findTestObject('Admin/Update Agency/agency_name'), 'Johny Does')

WebUI.verifyElementText(findTestObject('Admin/Update Agency/head_name'), 'Johny corps don esto')

WebUI.click(findTestObject('Admin/Update Agency/Agency detail'))

Agency_name = WebUI.getAttribute(findTestObject('Admin/Update Agency/Unique_Field_Agency Name'), 'value')

WebUI.verifyMatch(Agency_name, 'Johny Does', true)

Head_name = WebUI.getAttribute(findTestObject('Admin/Update Agency/Unique_Field_Head Name'), 'value')

WebUI.verifyMatch(Head_name, 'Johny corps don esto', true)

General_License = WebUI.getAttribute(findTestObject('Admin/Update Agency/Unique_Field General License'), 'value')

WebUI.verifyMatch(General_License, '11', true)

Contact_Name = WebUI.getAttribute(findTestObject('Admin/Update Agency/Unique_Field_Contact Name'), 'value')

WebUI.verifyMatch(Contact_Name, 'Johnydoens', true)

Contact_Number = WebUI.getAttribute(findTestObject('Admin/Update Agency/Unique_Field_Contact Number'), 'value')

WebUI.verifyMatch(Contact_Number, '06545678121', true)

