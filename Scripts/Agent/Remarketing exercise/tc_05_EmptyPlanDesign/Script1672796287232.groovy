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

WebUI.setText(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Field_email signIn'), GlobalVariable.username)

WebUI.setText(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Field_Password SignIn'), GlobalVariable.password)

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/button_Sign In'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Unique_section_EB Customer'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Unique_Choosing customer'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/button_Create'))

WebUI.setText(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Field_Exercise Name'), GlobalVariable.RemarketingExerciseName)

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Field_Start Date'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/date'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Unique_choosing existing policy'))

WebUI.click(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/button_Next'))

WebUI.verifyElementText(findTestObject('Agent/Create Remarketing Exercise/Page_Reach/Unique_error empty plan design'), 'Please choose plan variant')

