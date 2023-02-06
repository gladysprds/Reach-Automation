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

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/a_Sign Up'))

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/div_Agency'))

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Email_email'), GlobalVariable.username2)

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/button_Create Account'))

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Head First Name_headFisrtName'), 'agency')

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Head Last Name_headLastName'), 'embreo')

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Agency name_agencyName'), 'agency1')

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Company Registration Number_registrat_9f7d44'), '12345678')

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Phone Number_contactNumber'), '+65 1234 567 8')

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/input_Agency License Type_ant-checkbox-input'))

WebUI.setText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Mus Number_musNumber'), '12345678')

WebUI.setEncryptedText(findTestObject('Agency/SignUpPage_Reach_Agency/input_Create New Password_password'), 'WfRas07xuu4=')

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/input_Yes_ant-radio-input'))

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/input_agree_checkbox'))

WebUI.click(findTestObject('Agency/SignUpPage_Reach_Agency/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Agency/SignUpPage_Reach_Agency/div_Please_Input_Your_ContactName'))

