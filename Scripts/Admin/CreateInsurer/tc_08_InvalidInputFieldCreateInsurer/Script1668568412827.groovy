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

WebUI.click(findTestObject('Admin/Create Insurer/Unique_Admin'))

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Email_SignIn'), GlobalVariable.email)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_password'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Insurer/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Insurer/div_Insurer'))

WebUI.click(findTestObject('Admin/Create Insurer/button_Create Company'))

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Company Name_control-ref_name'), GlobalVariable.CompanyName)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Company Address'), GlobalVariable.CompanyAddress)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Contact Name'), GlobalVariable.CompanyContactName)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Email'), GlobalVariable.invalidEmailCompany)

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error Invalid E-mail'), 'The input is not valid E-mail!')

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Email'), GlobalVariable.invalidEmailCompany2)

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error Invalid E-mail'), 'The input is not valid E-mail!')

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Contact Number'), GlobalVariable.InvalidContactNumber)

WebUI.verifyElementVisible(findTestObject('Admin/Create Insurer/Unique_Error_Invalid contact number'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error_Invalid contact number'), 'Please enter valid contact number')

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Contact_Number'), GlobalVariable.InvalidContactNumber)

WebUI.verifyElementVisible(findTestObject('Admin/Create Insurer/Unique_Error Invalid phone number'))

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error Invalid phone number'), 'Please enter valid phone number')

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Life License'), GlobalVariable.invalidLicenseNumber)

WebUI.verifyElementVisible(findTestObject('Admin/Create Insurer/Unique_Error_Invalid License Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error_Invalid License Number'), 'Please enter valid Life License Number')

WebUI.verifyElementText(findTestObject('Admin/Create Insurer/Unique_Error Invalid phone number2'), 'Value should be less than 11 character')

WebUI.click(findTestObject('Admin/Create Insurer/Button_Create'))

WebUI.verifyElementVisible(findTestObject('Admin/Create Insurer/Unique_Error Mandatory Field'))

WebUI.click(findTestObject('Admin/Create Insurer/button_Ok'))

