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

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Admin_Tab'))

WebUI.setText(findTestObject('Admin/Updating Insurer on Admin/Field_Email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Updating Insurer on Admin/Field_Password'), 'singapore')

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Sign In'))

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Insurer_section'))

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Insurer Details'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Edit'))

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Company Name'), 'test')

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Company Address'), ' singapore')

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Name'), ' corps')

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Number'), '1')

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Department'), ' and Humanity')

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Dropdown_General License'))

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Choosing_General License2'))

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_General License'), '134')

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Update'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/newest update'), 'Sea insuretest')

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/newest update'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_Company Name'), 'Sea insuretest')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_Company Address'), 'saint paulo singapore')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_Contact Name'), 'sea corps')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_Contact Number'), '+6545678121')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_ Departement'), 'Social and Humanity')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_License type'), 'general')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/update_License Number'), '134')

