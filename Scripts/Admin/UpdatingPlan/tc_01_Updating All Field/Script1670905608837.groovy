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

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Tab_Admin'))

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_Email'), 'antonius@embreo.global')

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_Password'), 'singapore')

WebUI.click(findTestObject('Admin/Updating Plan On Admin/button_Sign In'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_plan section'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_detail_plan'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Dropdown_Insurance Company'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Choosing_Dropdown Insurance Company'))

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_PackageName'), ' (update)')

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Dropdown_Policy'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Dropdown_Choosing _Policy'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Field Dropdown TOB'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Unique_Field Choosing Dropdown TOB'))

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_Plan 1 TOB'), 'plan2')

WebUI.click(findTestObject('Admin/Updating Plan On Admin/button_Add new benefits'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/Radio Button_Choose Your Method(Custom Category)'))

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_categoryName'), 'tbl1')

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_Category Class'), 'medium')

WebUI.setText(findTestObject('Admin/Updating Plan On Admin/Field_Plan 1 Premium Calculation'), '$ 12,444')

WebUI.click(findTestObject('Admin/Updating Plan On Admin/button_Add Category'))

WebUI.click(findTestObject('Admin/Updating Plan On Admin/button_Update'))

WebUI.verifyElementText(findTestObject('Admin/Updating Plan On Admin/td_testing plan (update)'), 'testing plan (update)')

WebUI.verifyElementText(findTestObject('Admin/Updating Plan On Admin/Unique_Updated Insurance'), 'AIA')

WebUI.verifyElementText(findTestObject('Admin/Updating Plan On Admin/Unique_Updated Policy'), 'Health policy')

