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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reach-dev.embreo.global/login')

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Email_email'), 'agency@embreo.sg')

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Password_password'), 'singapore')

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/tab_agency'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_tab_Client Particular'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Create Client Particular'))

WebUI.maximizeWindow()

WebUI.uploadFile(findTestObject('Agency/Create Client Particular/Page_Reach/button_upload policy summary'), file)

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/success_upload'), 'policy.xlsx')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Client Name'), 'ClientParticular1')

WebUI.setText(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Address'), 'Saint Vincent Downway #112')

WebUI.setText(findTestObject('Agency/Create Client Particular/Page_Reach/Field_NRIC Number'), '113190111131')

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/RadioButton_Nationality'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Date of Birth'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_Choosing_Date'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/RadioButton_Gender'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/RadioButton_Smoker'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Marital Status'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_choosing_marital status'))

WebUI.setText(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Email'), GlobalVariable.EmailClient)

WebUI.setText(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Email'), RandomStringUtils.randomNumeric(
        3) + '@example.com')

WebUI.setText(findTestObject('Agency/Create Client Particular/Page_Reach/Field_Contact Number'), '1234 567 89')

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/button_Create'))

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/detail_client'))

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_Client Particular'), 'ClientParticular1')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_Client_address'), 'Saint Vincent Downway #112')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_NRIC'), '****1131')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_Verify_Nationality'), 'Singaporean')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_Verify Date Of Birthday'), '01 January 2023')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_Verify_Smoker status'), 'Smoker')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_Gender'), 'Male')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_marital status'), 'Single')

WebUI.verifyElementText(findTestObject('Agency/Create Client Particular/Page_Reach/Unique_verify_contact number'), '+65123456789')

