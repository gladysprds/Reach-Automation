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

WebUI.click(findTestObject('Admin/Create Policy/Unique_Admin'))

WebUI.setText(findTestObject('Admin/Create Policy/Field_Email'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Create Policy/Field_Password'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Policy/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Policy/Unique_Section_Policy'))

WebUI.click(findTestObject('Admin/Create Policy/button_Create Policy'))

WebUI.setText(findTestObject('Admin/Create Policy/Field_Policy Name'), GlobalVariable.PolicyName)

WebUI.click(findTestObject('Admin/Create Policy/Unique_Dropdown Select License'))

WebUI.click(findTestObject('Admin/Create Policy/Unique_Choosing_Life_License'))

WebUI.click(findTestObject('Admin/Create Policy/Unique_Choosing_Insurer'))

WebUI.click(findTestObject('Admin/Create Policy/button_Create'))

WebUI.verifyElementText(findTestObject('Admin/Create Policy/Unique_Empty Policy Description Error'), 'Please enter policy description')

