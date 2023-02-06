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

WebUI.click(findTestObject('Admin/Update Policy/tab_Admin'))

WebUI.setText(findTestObject('Admin/Update Policy/Field_Email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Update Policy/Field_Password'), 'singapore')

WebUI.click(findTestObject('Admin/Update Policy/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Update Policy/Policy_section'))

WebUI.click(findTestObject('Admin/Update Policy/Policy_detail'))

WebUI.click(findTestObject('Admin/Update Policy/button_Update'))

WebUI.click(findTestObject('Admin/Update Policy/Policy_detail'))

Policy_Name = WebUI.getAttribute(findTestObject('Admin/Update Policy/Field_Policy Name'), 'value')

WebUI.verifyMatch(Policy_Name, 'Group Hospitalization 1', true)

Policy_Description = WebUI.getAttribute(findTestObject('Admin/Update Policy/Field_Policy Description'), 'value')

WebUI.verifyMatch(Policy_Description, 'This is policy test', true)

