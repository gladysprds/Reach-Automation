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

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Company Address'), GlobalVariable.CompanyAddress)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Contact Name'), GlobalVariable.CompanyContactName)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Email'), GlobalVariable.CompanyEmail)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Contact Number'), GlobalVariable.CompanyContactNumber)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Department'), GlobalVariable.Departement)

WebUI.setText(findTestObject('Admin/Create Insurer/Field_Life License'), GlobalVariable.LicenseNumber)

WebUI.click(findTestObject('Admin/Create Insurer/button_Create'))

WebUI.verifyElementVisible(findTestObject('Admin/Create Insurer/Unique_Error_Mandatory_Field'), FailureHandling.STOP_ON_FAILURE)

WebUI.getText(findTestObject('Admin/Create Insurer/Unique_Error_Mandatory_Field'))

WebUI.verifyTextPresent('Mandatory field is required to be filled before creating insurance', true)

