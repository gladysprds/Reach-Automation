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

WebUI.click(findTestObject('Admin/Create Benefit/Unique_Admin'))

WebUI.setText(findTestObject('Admin/Create Benefit/Field_email Sign In'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Create Benefit/Field_password Sign In'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Benefit/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Benefit/Unique_Section_Benefit'))

WebUI.click(findTestObject('Admin/Create Benefit/button_Create Reach Wording'))

WebUI.setText(findTestObject('Admin/Create Benefit/Field_Reach Wording Desc'), GlobalVariable.BenefitDescription2)

WebUI.click(findTestObject('Admin/Create Benefit/Unique_Checkbox Policy Affected'))

WebUI.click(findTestObject('Admin/Create Benefit/Unique_Reach Wording Insurer'))

WebUI.click(findTestObject('Admin/Create Benefit/button_Create'))

WebUI.verifyElementText(findTestObject('Admin/Create Benefit/Unique_Error Reach Wording Name'), 'Please enter name')

