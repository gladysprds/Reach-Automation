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

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Email_email'), 'agentlife@example.com')

WebUI.setText(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/input_Password_password'), 'Brief1*')

WebUI.click(findTestObject('Object Repository/Agent/Create Client Particular/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_tab_Client Particular'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Create Client Particular'))

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Client Name'), 'ClientParticular1')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Address'), 'Saint Vincent Downway #112')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_NRIC Number'), '113190111131')

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Nationality'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Date of Birth'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Choosing_Date'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Gender'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/RadioButton_Smoker'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Marital Status'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_choosing_marital status'))

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), 'client@')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Error invalid input email'), 
    'Please input valid email')

WebUI.doubleClick(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), 'client')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Error invalid input email'), 
    'Please input valid email')

WebUI.doubleClick(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Email'), 'client.com')

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_Verify Error invalid input email'), 
    'Please input valid email')

WebUI.setText(findTestObject('Agent/Create Client Particular/Page_Reach/Field_Contact Number'), '1234 567 89')

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/button_Create'))

WebUI.click(findTestObject('Agent/Create Client Particular/Page_Reach/detail_client'))

WebUI.verifyElementText(findTestObject('Agent/Create Client Particular/Page_Reach/Unique_verify_Client Particular'), 'Please input mandatory field')

