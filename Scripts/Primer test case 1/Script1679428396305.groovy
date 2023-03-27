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

WebUI.navigateToUrl('https://uibank.uipath.com/')

WebUI.click(findTestObject('Object Repository/Page_UiBank/a_Products'))

WebUI.click(findTestObject('Object Repository/Page_UiBank/a_Loans'))

WebUI.click(findTestObject('Object Repository/Page_UiBank/button_Apply For A Loan'))

WebUI.setText(findTestObject('Object Repository/Page_UiBank/input_Email Address of Requester_email'), 'uipath@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_UiBank/input_Loan Amount Requested_amount'), '7500')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_UiBank/select_13510'), '5', true)

WebUI.setText(findTestObject('Object Repository/Page_UiBank/input_Current Yearly Income (Before Taxes)_income'), '30000')

WebUI.setText(findTestObject('Object Repository/Page_UiBank/input_Age_age'), '35')

WebUI.click(findTestObject('Object Repository/Page_UiBank/button_Submit Loan Application'))

WebUI.click(findTestObject('Object Repository/Page_UiBank/h1_Youve been approved for a loan with UiBank'))

WebUI.verifyElementText(findTestObject('Page_UiBank/h1_Youve been approved for a loan with UiBank'), 'You\'ve been approved for a loan with UiBank!')

