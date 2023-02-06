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

WebUI.click(findTestObject('Agent/Create Activity/Field_Client Name'))

WebUI.click(findTestObject('Agent/Create Activity/Choosing_client name'))

WebUI.setText(findTestObject('Agent/Create Activity/Field_Activity Name'), 'First Activity')

WebUI.setText(findTestObject('Agent/Create Activity/Field_Activity Details'), 'This is my First Activity')

WebUI.click(findTestObject('Agent/Create Activity/Field_start_date'))

WebUI.click(findTestObject('Agent/Create Activity/start_date'))

WebUI.click(findTestObject('Agent/Create Activity/dropdown_start_time'))

WebUI.click(findTestObject('Agent/Create Activity/choose_start_time'))

WebUI.click(findTestObject('Agent/Create Activity/button_OK'))

WebUI.click(findTestObject('Agent/Create Activity/Field_end_date'))

WebUI.click(findTestObject('Agent/Create Activity/end_date'))

WebUI.click(findTestObject('Agent/Create Activity/dropdown_end_time'))

WebUI.click(findTestObject('Agent/Create Activity/choose_end_time'))

WebUI.click(findTestObject('Agent/Create Activity/button_OK2'))

WebUI.click(findTestObject('Agent/Create Activity/button_Create Activity'))

WebUI.click(findTestObject('Agent/Create Activity/detail_activity'))

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_verify_clientname'), 'Antonius Ayodya')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Activity Name'), 'First Activity')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Activity Details'), 'This is my First Activity')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Start'), '09 January 2023')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_Start time'), '12:00 AM')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_End'), '10 January 2023')

WebUI.verifyElementText(findTestObject('Agent/Create Activity/Unique_Verify_End Time'), '01:AM')

