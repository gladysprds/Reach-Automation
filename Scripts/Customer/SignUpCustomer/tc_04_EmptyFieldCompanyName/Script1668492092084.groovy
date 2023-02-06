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

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/a_Sign Up'))

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/div_Customer'))

WebUI.setText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Email_email'), GlobalVariable.username6)

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/button_Create Account'))

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/div_Select industry'))

WebUI.waitForElementPresent(findTestObject('Customer/SignUpPage_Reach_Customer/div_IT'), 5)

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/div_IT'))

WebUI.setText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Number Of Employees_headcount'), '12')

WebUI.setText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Contact Name_contactName'), 'customerembreo')

WebUI.setText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Phone Number_phone'), '+65 1234 567 8')

WebUI.setText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Jobs_jobs'), 'Teacher')

WebUI.setEncryptedText(findTestObject('Customer/SignUpPage_Reach_Customer/input_Create New Password_password'), 'WfRas07xuu4=')

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/input_agree_checkbox'))

WebUI.click(findTestObject('Customer/SignUpPage_Reach_Customer/button_Create Account'))

WebUI.verifyElementVisible(findTestObject('Customer/SignUpPage_Reach_Customer/div_Please input your company name'))

