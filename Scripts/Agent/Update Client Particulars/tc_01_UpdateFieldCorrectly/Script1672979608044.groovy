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

WebUI.callTestCase(findTestCase('Agent/Create Client Particulars/tc_01_FilledAllFieldCorrectly'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.openBrowser('')

WebUI.navigateToUrl('https://reach-dev.embreo.global/login')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Email_email'), 'agentlife@example.com')

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Password_password'), 'Brief1*')

WebUI.click(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_tab_Client Particular'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/detail_client'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Edit'))

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Client Name'), 'update')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Address'), 'update')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_NRIC Number'), '0')

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Nationality2'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Date of Birth'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Choosing_Date2'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Gender2'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Smoker2'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Marital Status'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_choosing_marital status2'))

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Contact Number'), '1')

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Create'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/detail_client'))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_Client Particular'), 'ClientParticular1update')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_client_address'), 'Saint Vincent Downway #112update')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_NRIC'), '****1310')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify_Nationality'), 'Singapore PR')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Date Of Birthday'), '02 January 2023')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify_Smoker status'), 'Smoker')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_Gender'), 'Female')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_marital status'), 'Widowed')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_contact number'), '+651234567891')

