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

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Email_Login'), 'agency@embreo.sg')

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Password_Login'), 'singapore')

WebUI.click(findTestObject('Agency/Create Client Particular/Page_Reach/tab_agency'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/tab_EB Customers'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/button_Create Customer'))

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Customer Name'), GlobalVariable.CustomerName)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Customer Address'), GlobalVariable.CustomerAddress)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Headcounts'), GlobalVariable.HeadCount)

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Industry'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/Dropdown_Industry'))

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Expected Annual'), GlobalVariable.EstimatedAnnual)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Contact Name'), GlobalVariable.ContactName)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Email'), GlobalVariable.EmailCustomer)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Email'), RandomStringUtils.randomNumeric(3) + '@example.com')

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Contact Number'), GlobalVariable.ContactNumber)

WebUI.setText(findTestObject('Agency/Create EB Customer/Page_Reach/Field_Occupation'), GlobalVariable.Occupation)

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/button_Add More Existing Policy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/Field_DropdownPolicy'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/Choosing Policy'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/button_Create'))

WebUI.click(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Detail EB Customer'))

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_EB Customer Name'), GlobalVariable.CustomerName)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_EB Customer Address'), GlobalVariable.CustomerAddress)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify_Headcount'), GlobalVariable.HeadCount)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify_Industry'), 'MINING AND QUARRYING')

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_New_Expected APE'), GlobalVariable.EstimatedAnnual)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Agent Name'), GlobalVariable.NoAgentName)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify_Contact Name'), GlobalVariable.ContactName)

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify_contact number'), '+65987654321')

WebUI.verifyElementText(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify_Occupation'), GlobalVariable.Occupation)

policy = WebUI.getAttribute(findTestObject('Agency/Create EB Customer/Page_Reach/Unique_Verify Policy'), 'value')

WebUI.verifyMatch(Policy, GlobalVariable.ExistingPolicyAgency, true)

