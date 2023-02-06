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

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/a_Sign Up'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_Email_email'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input_Email_email'), GlobalVariable.username12)

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/Button_Create Account - First Page'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input_First Name_firstName'), 'QA')

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input_Last Name_lastName'), 'Embreo')

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input_Phone Number_contactNumber'), '+65 1234 567 8')

WebUI.setEncryptedText(findTestObject('Agent/Sign Up Page Reach Agent/input_Create New Password_password'), 'WfRas07xuu4=')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_I am licensed to sell_ant-checkbox-input'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input_Mas Representative Number_masNumber'), '12345678')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_agree_checkbox'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_promotion_checkbox'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/Button_Create Account'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_Coming Soon_ant-radio-input'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/span_Verify'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input'), '5')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input2'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input2'), '5')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input3'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input3'), '5')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input4'))

WebUI.setText(findTestObject('Agent/Sign Up Page Reach Agent/input4'), '5')

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/span_Ok, Select Agency'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/Button_WithoutAgency'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/input_insurer_checkbox'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/Button_Finish'))

WebUI.click(findTestObject('Agent/Sign Up Page Reach Agent/span_Dashboard'))

WebUI.closeBrowser()

