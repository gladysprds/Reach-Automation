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

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Email_email'), 'agentlife@example.com')

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Password_password'), 'Brief1*')

WebUI.click(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_tab_Client Particular'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/detail_client'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Edit'))

WebUI.doubleClick(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Client Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Client Name'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Empty Client Name'), 'Please enter client name')

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Address'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Address'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Empty Client Address'), 
    'Please enter address')

WebUI.doubleClick(findTestObject('Agent/Create Client Particular/Page_Reach/Field_NRIC Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_NRIC Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Empty NRIC number'), 'Please fill the NRIC number')

WebUI.doubleClick(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Contact Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Contact Number'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Contact Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Empty Contact Number'), 
    'Contact number is required')

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Create'))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_Update page'), 'Update Client')

