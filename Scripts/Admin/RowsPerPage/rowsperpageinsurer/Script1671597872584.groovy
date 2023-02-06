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

WebUI.click(findTestObject('Object Repository/Admin/insurancerowsperpage/Page_Reach/div_Admin'))

WebUI.setText(findTestObject('Object Repository/Admin/insurancerowsperpage/Page_Reach/input_Email_email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Object Repository/Admin/insurancerowsperpage/Page_Reach/input_Password_password'), 'singapore')

WebUI.click(findTestObject('Object Repository/Admin/insurancerowsperpage/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Admin/insurancerowsperpage/Page_Reach/div_Insurer'))

WebUI.click(findTestObject('Admin/insurancerowsperpage/Page_Reach/dropdown_rowsperpage'))

WebUI.click(findTestObject('Admin/insurancerowsperpage/Page_Reach/rows_per_page_10'))

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_1'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_2'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_3'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_4'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_5'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_6'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_7'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_8'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_9'), 1)

WebUI.verifyElementPresent(findTestObject('Admin/insurancerowsperpage/Page_Reach/td_10'), 1)

