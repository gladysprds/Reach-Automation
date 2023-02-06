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

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Admin_Tab (1)'))

WebUI.setText(findTestObject('Admin/Updating Insurer on Admin/Field_Email (1)'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Updating Insurer on Admin/Field_Password (1)'), 'singapore')

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Sign In (1)'))

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Unique_Insurer_section (1)'))

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/Insurer Details2 (1)'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Edit (1)'))

WebUI.doubleClick(findTestObject('Admin/Updating Insurer on Admin/Field_Company Name (1)'))

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Company Name (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Admin/Updating Insurer on Admin/Field_Company Address (1)'))

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Company Address (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Name (1)'))

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Name (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Admin/Updating Insurer on Admin/Field_Department (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Department (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Number (1)'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Admin/Updating Insurer on Admin/Field_Contact Number (1)'), Keys.chord(Keys.BACK_SPACE))

WebUI.delay(2)

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_Update (1)'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/Unique_Error Updating'), 'Mandatory field is required to be filled before creating insurance')

WebUI.click(findTestObject('Admin/Updating Insurer on Admin/button_OKAY'))

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/div_Company name is required'), 'Company name is required')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/div_Company address is required'), 'Company address is required')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/div_Contact name is required_1'), 'Contact name is required')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/div_Department is required'), 'Department is required')

WebUI.verifyElementText(findTestObject('Admin/Updating Insurer on Admin/div_Department is required'), 'Department is required')

