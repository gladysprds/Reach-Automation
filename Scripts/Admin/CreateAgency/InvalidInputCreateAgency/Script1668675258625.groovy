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

WebUI.setText(findTestObject('Admin/Create Agency/Field_Email SignIn'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Create Agency/Field_Password SignIn'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Agency/Unique_Admin'))

WebUI.click(findTestObject('Admin/Create Agency/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Agency/Unique_Agency'))

WebUI.click(findTestObject('Admin/Create Agency/Button_Create Agency'))

WebUI.setText(findTestObject('Admin/Create Agency/Field_Agency Name'), GlobalVariable.AgencyName1)

WebUI.setText(findTestObject('Admin/Create Agency/Field_Head Name Agency'), GlobalVariable.PolicyName)

WebUI.setText(findTestObject('Admin/Create Agency/Field_Company Register Number'), GlobalVariable.PolicyDescription2)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input Company Register Number'), 'Please enter valid Register Number')

WebUI.doubleClick(findTestObject('Admin/Create Agency/Field_Company Register Number'))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Company Register Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Admin/Create Agency/Field_Company Register Number'), GlobalVariable.PolicyDescription3)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input Company Register Number2'), 'Value should be less than 11 character')

WebUI.click(findTestObject('Admin/Create Agency/Unique_Life License span'))

WebUI.click(findTestObject('Admin/Create Agency/Unique_General License'))

WebUI.setText(findTestObject('Admin/Create Agency/Field_General License Number'), GlobalVariable.AgencyGeneralLicenseNumber2)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input General License Number'), 'Please enter valid General License Number')

WebUI.doubleClick(findTestObject('Admin/Create Agency/Field_General License Number'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_General License Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Admin/Create Agency/Field_General License Number'), GlobalVariable.AgencyGeneralLicenseNumber3)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input General License Number2'), 'Value should be less than 11 character')

WebUI.setText(findTestObject('Admin/Create Agency/Field_Contact Name'), GlobalVariable.AgencyContactName)

WebUI.setText(findTestObject('Admin/Create Agency/Field_Email Agency'), GlobalVariable.AgencyEmail2)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input Email Agency'), 'The input is not valid E-mail!')

WebUI.doubleClick(findTestObject('Admin/Create Agency/Field_Email Agency'))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.doubleClick(findTestObject('Admin/Create Agency/Field_Email Agency'))

WebUI.setText(findTestObject('Admin/Create Agency/Field_Email Agency'), GlobalVariable.AgencyEmail3)

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input Email Agency'), 'The input is not valid E-mail!')

WebUI.doubleClick(findTestObject('Admin/Create Agency/Field_Email Agency'))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Email Agency'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Admin/Create Agency/Field_Contact Number'), GlobalVariable.AgencyContactNumber2)

WebUI.doubleClick(findTestObject('Admin/Create Insurer/Field_Contact Number'))

WebUI.sendKeys(findTestObject('Admin/Create Agency/Field_Contact Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.verifyElementText(findTestObject('Admin/Create Agency/Unique_Invalid Input Contact Number'), 'Please enter valid contact number')

WebUI.click(findTestObject('Admin/Create Agency/Unique_Representing Insurer Bar'))

WebUI.click(findTestObject('Admin/Create Agency/Unique_Choose Representing Insurer Bar'))

WebUI.click(findTestObject('Admin/Create Agency/Button_Create'))

