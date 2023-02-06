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

WebUI.click(findTestObject('Admin/Update Insurer Wording/div_Admin'))

WebUI.setText(findTestObject('Admin/Update Insurer Wording/input_Email_email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Update Insurer Wording/input_Password_password'), 'singapore')

WebUI.click(findTestObject('Admin/Update Insurer Wording/button_Sign In'))

WebUI.click(findTestObject('Admin/Update Insurer Wording/Unique_Tab_Benefit'))

WebUI.click(findTestObject('Admin/Update Insurer Wording/Unique_detail benefit'))

WebUI.setText(findTestObject('Admin/Update Insurer Wording/Field Benefit Name'), ' Accelerated')

WebUI.setText(findTestObject('Admin/Update Insurer Wording/textarea_Description'), 'This is accelerated death')

WebUI.setText(findTestObject('Admin/Update Insurer Wording/Field_Activation Criteria'), 's')

WebUI.click(findTestObject('Admin/Update Insurer Wording/Unique_Checkbox_Insurer'))

WebUI.click(findTestObject('Admin/Update Insurer Wording/Unique_Checkbox_Reach Wording'))

WebUI.click(findTestObject('Admin/Update Insurer Wording/button_Update'))

WebUI.click(findTestObject('Admin/Update Insurer Wording/Unique_detail benefit'))

benefit_name = WebUI.getAttribute(findTestObject('Admin/Update Insurer Wording/Field Benefit Name'), 'value')

WebUI.verifyMatch(benefit_name, 'Death Accelerated', true)

description = WebUI.getAttribute(findTestObject('Admin/Update Insurer Wording/textarea_Description'), 'value')

WebUI.verifyMatch(description, 'This is accelerated death', true)

activation = WebUI.getAttribute(findTestObject('Admin/Update Insurer Wording/Field_Activation Criteria'), 'value')

WebUI.verifyMatch(activation, 'soons', true)

