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

WebUI.click(findTestObject('Admin/Create Plan/Unique_Admin'))

WebUI.setText(findTestObject('Admin/Create Plan/Field_Email_SignIn'), GlobalVariable.username)

WebUI.setText(findTestObject('Admin/Create Plan/Field_Pass_SignIn'), GlobalVariable.password)

WebUI.click(findTestObject('Admin/Create Plan/button_Sign In'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Plan'))

WebUI.click(findTestObject('Admin/Create Plan/button_Create Plan'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Select insurer'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Choosing_Insurer'))

WebUI.setText(findTestObject('Admin/Create Plan/Field_Package Name'), GlobalVariable.packagename1)

WebUI.click(findTestObject('Admin/Create Plan/Unique_Select policy'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Choosing Policy'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Dropdown_Benefit'))

WebUI.click(findTestObject('Admin/Create Plan/Unique_Select_Benefit'))

WebUI.setText(findTestObject('Admin/Create Plan/Field_Plan_TableBenefit'), GlobalVariable.planTableBenefit)

WebUI.click(findTestObject('Admin/Create Plan/button_Add new benefits'))

WebUI.setText(findTestObject('Admin/Create Plan/Field_Start Age'), GlobalVariable.startAge)

WebUI.setText(findTestObject('Admin/Create Plan/Field_Limit Age'), GlobalVariable.limitAge)

WebUI.setText(findTestObject('Admin/Create Plan/Field_plans2'), GlobalVariable.planCalculationPremium)

WebUI.click(findTestObject('Admin/Create Plan/button_Add age band'))

WebUI.click(findTestObject('Admin/Create Plan/button_Create'))

WebUI.delay(5)

WebUI.verifyElementText(findTestObject('Admin/Create Plan/Unique_New_Plan'), 'myPackageName1', FailureHandling.STOP_ON_FAILURE)

