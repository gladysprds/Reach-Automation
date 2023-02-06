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

WebUI.setText(findTestObject('Agent/Create Activity/Field_Email'), GlobalVariable.username)

WebUI.setText(findTestObject('Agent/Create Activity/Field_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Agent/Create Activity/button_Sign In'))

WebUI.click(findTestObject('Agent/Create Activity/button_Create Activity'))

WebUI.click(findTestObject('Agent/Create Activity/button_Create Activity'))

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Error Pop Up'), 'Mandatory field is required to be filled before creating Client Particular.')

WebUI.click(findTestObject('Agent/Create Activity/button_OK Error Pop Up'))

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Empty Client Name'), 'Please select a Client Name')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Empty Activity Name'), 'Activity Name is required')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Empty Date Information'), 'Date & Information is required')

