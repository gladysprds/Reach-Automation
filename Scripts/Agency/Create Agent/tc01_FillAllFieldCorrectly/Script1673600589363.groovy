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

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/tab_agency_login page'))

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Email_Login'), 'agency@embreo.sg')

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Password_login'), 'singapore')

WebUI.click(findTestObject('Object Repository/Agency/Create Agent/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/tab_Agents'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Button_Create Agent'))

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Agent Name'), 'Karen')

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Field_Date Of Birth'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/choosing_DOB'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Field_Gender'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Gender'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Field_Highest Education'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Highest Education'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Field_Study'))

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/Study'))

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_License'), '11231231')

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_MAS Representative Number'), '123456789')

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Email'), 'acip122@example.com')

WebUI.setText(findTestObject('Agency/Create Agent/Page_Reach/Field_Contact Number'), '+65 1234 567 8')

WebUI.delay(5)

WebUI.click(findTestObject('Agency/Create Agent/Page_Reach/button_Create After filling'))

WebUI.verifyElementText(findTestObject('Object Repository/Agency/Create Agent/Page_Reach/td_Rae Aguilar'), 'Karen')

