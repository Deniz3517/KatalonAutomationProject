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

WebUI.comment('opened page: ' + GlobalVariable.siteURL)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/p_Consent'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise/a_Signup  Login'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_name'), 'deniz')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/input_New User Signup_email'),
	'deniz13@mail.com')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup  Login/button_Signup'))

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Mr_title'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/div_Date of BirthDay12345678910111213141516_311ccb'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Day123456789101112131415161718192021_40ab5b'),
	'6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_MonthJanuaryFebruaryMarchAprilMayJun_aa9ebb'),
	'5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_Year20212020201920182017201620152014_f874ed'),
	'1996', true)

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Date of Birth_newsletter'))

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__first_name'), 'deniz')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__last_name'), 'deniz')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Company_company'), 'solvd')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_(Street address, P.O. Box, Company na_957d3e'),
	'warsaw')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input_Address 2_address2'), 'warsaw2')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Automation Exercise - Signup/select_IndiaUnited StatesCanadaAustraliaIsr_09757b'),
	'United States', true)

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__state'), 'new york')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__city'), 'new york')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__zipcode'), '123')

WebUI.setText(findTestObject('Object Repository/Page_Automation Exercise - Signup/input__mobile_number'), '123123123')

WebUI.click(findTestObject('Object Repository/Page_Automation Exercise - Signup/button_Create Account'))

WebUI.callTestCase(findTestCase('CallTestCaseExample/login'), [:], FailureHandling.STOP_ON_FAILURE)

