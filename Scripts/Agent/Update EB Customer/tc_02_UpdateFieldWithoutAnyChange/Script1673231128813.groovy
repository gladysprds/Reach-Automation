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

WebUI.setText(findTestObject('Agent/Create EB Customer/Page_Reach/Field_Email_Login'), 'agentlife@example.com')

WebUI.setText(findTestObject('Agent/Create EB Customer/Page_Reach/Field_Password_Login'), 'Brief1*')

WebUI.click(findTestObject('Agent/Sign In Agent/button_Sign In'))

WebUI.verifyElementText(findTestObject('Agent/Sign In Agent/span_Dashboard'), 'Dashboard')

WebUI.click(findTestObject('Agent/Create EB Customer/Page_Reach/tab_EB Customers'))

WebUI.click(findTestObject('Agent/Create EB Customer/Page_Reach/detail_EB_Customer'))

WebUI.click(findTestObject('Agent/Create EB Customer/Page_Reach/button_Edit'))

WebUI.click(findTestObject('Agent/Create EB Customer/Page_Reach/button_Create'))

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_EB Customer Name'), 'Excalibur101update')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_EB Customer Address'), 'Saint Hubertus, Northway 123update')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_Verify_Headcount'), '651')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_New_Expected APE'), '$ 1,001')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_Verify_Contact Name'), 'Excaliburupdate')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_Verify_contact number'), '+659876543211')

WebUI.verifyElementText(findTestObject('Agent/Create EB Customer/Page_Reach/Unique_Verify_Occupation'), 'Doctorupdate')

