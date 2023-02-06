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

WebUI.click(findTestObject('Admin/Create Customer/Unique_Admin'))

WebUI.setText(findTestObject('Admin/Create Customer/Field_Email_SignIn'), GlobalVariable.email)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Password_SignIn'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Customer/Button_Sign In'))

WebUI.verifyElementText(findTestObject('Admin/Create Customer/Unique_Dashboard_Admin'), 'Total Customers')

WebUI.click(findTestObject('Admin/Create Customer/Unique_Customer'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Create Customer/button_Create Customer'))

WebUI.setText(findTestObject('Admin/Create Customer/Field_Customer Name'), GlobalVariable.CustomerName)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Customer_Address'), GlobalVariable.CompanyAddress)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Headcount'), GlobalVariable.HeadCount)

WebUI.click(findTestObject('Admin/Create Customer/Unique_Select industry'))

WebUI.click(findTestObject('Admin/Create Customer/Unique_Agriculture And Fishing'))

WebUI.setText(findTestObject('Admin/Create Customer/Field_Estimated Annual Revenue'), GlobalVariable.EstimatedAnnual)

WebUI.click(findTestObject('Admin/Create Customer/Unique_Select agent'))

WebUI.click(findTestObject('Admin/Create Customer/Unique_Agent Name'))

WebUI.setText(findTestObject('Admin/Create Customer/Field_ContactName'), GlobalVariable.LessContactNumber)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Email'), GlobalVariable.EmailClientCustomer)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Phone_Number'), GlobalVariable.LessContactNumber)

WebUI.setText(findTestObject('Admin/Create Customer/Field_Jobs'), GlobalVariable.Jobs)

WebUI.click(findTestObject('Admin/Create Customer/Button_Create'))

WebUI.click(findTestObject('Admin/Create Customer/Button_OK'))

WebUI.verifyElementVisible(findTestObject('Admin/Create Customer/unique_contactNumberMoreandLess'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyTextPresent('Please enter valid contact number', true)

