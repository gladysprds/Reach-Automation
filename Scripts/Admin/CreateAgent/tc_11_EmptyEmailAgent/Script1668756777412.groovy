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

WebUI.click(findTestObject('Admin/Create Agent/Unique_Admin Role'))

WebUI.setText(findTestObject('Admin/Create Agent/Field_Email SignIn'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Create Agent/Field_Password_SignIn'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Agent/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Agent Section'))

WebUI.click(findTestObject('Admin/Create Agent/button_Create Agent'))

WebUI.setText(findTestObject('Admin/Create Agent/Field_First Name'), GlobalVariable.AgentFirstName)

WebUI.setText(findTestObject('Admin/Create Agent/Field_Last Name'), GlobalVariable.AgentLastName)

WebUI.click(findTestObject('Admin/Create Agent/Field_DOB'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_DOB'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Choosing Gender'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Choosing Gender2'))

WebUI.click(findTestObject('Admin/Create Agent/Field_Select Education'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Select Education3'))

WebUI.click(findTestObject('Admin/Create Agent/Field Of Study'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Select Field Of Study'))

WebUI.setText(findTestObject('Admin/Create Agent/Field_Life License'), GlobalVariable.AgentLifeLicenseNumber)

WebUI.setText(findTestObject('Admin/Create Agent/Field_MAS Representative Number'), GlobalVariable.AgentMAS)

WebUI.setText(findTestObject('Admin/Create Agent/Field_Commission Amount'), GlobalVariable.AgentCommisionAmount)

WebUI.setText(findTestObject('Admin/Create Agent/Field_Contact Number'), GlobalVariable.AgentContactNumber)

WebUI.click(findTestObject('Admin/Create Agent/Field_Select Agency'))

WebUI.click(findTestObject('Admin/Create Agent/Unique_Select Agency3'))

WebUI.click(findTestObject('Admin/Create Agent/button_Create'))

WebUI.verifyElementVisible(findTestObject('Admin/Create Agent/Unique_Error Mandatory Field'))

WebUI.getText(findTestObject('Admin/Create Agent/Unique_Error Mandatory Field'))

WebUI.verifyElementText(findTestObject('Admin/Create Agent/Unique_Error Mandatory Field'), 'Mandatory field is required to be filled before creating agent.')

