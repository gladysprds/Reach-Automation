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

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Admin tab'))

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field Email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field Password'), 'singapore')

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Agent section'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_agent details'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/button_Edit'))

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field First Name'), ' Joe')

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Last Name'), ' Frut')

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/input_Date Of Birth_control-ref_dob'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Update DOB'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_dropdown gender'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_choosing gender'))

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/input_Highest Education'), 's')

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/input_Field of study'), 'ms')

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/span_Life License'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/div_General License'))

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/input_General License_control-ref_generalLicense'), 
    '1111')

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/input_Field MAS Representative Number'), '746')

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field Commision Amount'), '$ 122')

WebUI.sendKeys(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field Contact Number'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_Field Contact Number'), '5')

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_dropdown new agency'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new agency'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/button_Update'))

WebUI.click(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new agent'))

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new agent name'), 'Brennan Joe Franks Frut')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new DOB'), '07 Dec 2022')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new Gender'), 'Male')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new Education'), 'Cupidatats Magnamms')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new License'), 'general')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new License number'), '1111')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_MAS Number'), '746746')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new commision amount'), '$ 122')

WebUI.verifyElementText(findTestObject('Admin/Update Agent on Admin/Page_Reach/Unique_new contact number'), '2312312335')

