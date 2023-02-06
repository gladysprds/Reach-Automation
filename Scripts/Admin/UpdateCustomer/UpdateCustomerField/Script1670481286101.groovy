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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Admin_tab'))

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Password'), 'singapore')

WebUI.click(findTestObject('Admin/Update Customer on Admin/button_Sign In'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Customer Section'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_get detail customer'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/button_Edit'))

WebUI.sendKeys(findTestObject('Admin/Update Customer on Admin/Field_Customer Name'), ' Qualimo')

WebUI.sendKeys(findTestObject('Admin/Update Customer on Admin/Field_Customer Address'), ' singapore 11223')

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Dropdown Industry'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Choosing_CONSTRUCTION'))

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Estimated Annual Revenue'), '4')

WebUI.click(findTestObject('Admin/Update Customer on Admin/Choose_Agent Name'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Dropdown Agent Name'))

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Contact Name'), ' qualimo')

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Contact Number'), '1')

WebUI.setText(findTestObject('Admin/Update Customer on Admin/Field_Jobs'), 'man')

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Button_Add More Existing Policy'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Choosing policy'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_Update Policy'))

WebUI.click(findTestObject('Admin/Update Customer on Admin/button_Update'))

WebUI.delay(5)

WebUI.click(findTestObject('Admin/Update Customer on Admin/Unique_detail customer'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Customer Name'), 'Jose Qualimo')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Customer Address'), 'Elm Streetss singapore 11223')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Industry'), 'CONSTRUCTION')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_EAR'), '$ 12,224')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Agent Name'), 'Agent Alpha 3')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Contact Name'), 'joyse qualimo')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_email'), 'jojo@mail.com')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Contact Number'), '+651234567891')

WebUI.verifyElementText(findTestObject('Admin/Update Customer on Admin/Unique_data_Update_Job'), 'Fisherman')

