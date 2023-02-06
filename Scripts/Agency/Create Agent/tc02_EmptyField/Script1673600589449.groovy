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

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/tab_agency_login page'))

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Email_Login'), 'agency@embreo.sg')

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Password_login'), 'singapore')

WebUI.click(findTestObject('Object Repository/Agency/Create Agent/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/tab_Agents'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Button_Create Agent'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/button_Create After filling'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/button_OK_error'))

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty Agent Name'), 'Agent Name is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty DOB'), 'Date Of Birth is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty Gender'), 'Gender is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_Highest Education'), 'Highest Education is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty Field Of Study'), 'Study is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty License'), 'Life License is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty MAS number'), 'MAS Representative Number is required')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty Email agent'), 'The input is not valid E-mail!')

WebUI.verifyElementText(findTestObject('Agency/Create Agent/Page_Reach/Unique_verify_error_empty Contact Number'), 'Contact Number is required')

WebUI.closeBrowser()

