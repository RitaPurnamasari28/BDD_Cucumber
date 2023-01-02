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

WebUI.openBrowser('https://automationexercise.com/')

WebUI.verifyElementVisible(findTestObject('Register/verify_home'))

WebUI.click(findTestObject('Register/btn_signuplogin'))

WebUI.verifyElementVisible(findTestObject('Register/verify_signup'))

WebUI.setText(findTestObject('Register/field_nama'), 'Selena12354')

String mail = CustomKeywords.'randomEmail.RandomEmail.getEmail'('rita', 'gmail.com')

WebUI.setText(findTestObject('Register/field_email'), mail)

WebUI.click(findTestObject('Register/btn_signup'))

WebUI.verifyElementVisible(findTestObject('Register/verify_informationpage'))

WebUI.check(findTestObject('Register/check_gender'))

WebUI.setText(findTestObject('Register/field_password'), '12345678')

WebUI.selectOptionByValue(findTestObject('Register/btn_date'), '1', false)

WebUI.selectOptionByValue(findTestObject('Register/btn_months'), 'January', false)

WebUI.selectOptionByValue(findTestObject('Register/btn_year'), '2003', false)

WebUI.check(findTestObject('Register/checkbox_newsletter'))

WebUI.check(findTestObject('Register/checkbox_specialoffer'))

WebUI.setText(findTestObject('Register/field_firstname'), 'Selena')

WebUI.setText(findTestObject('Register/filed_lastname'), 'Swift')

WebUI.setText(findTestObject('Register/field_company'), 'Sony Music')

WebUI.setText(findTestObject('Register/field_address'), 'Jalan Brodway')

WebUI.setText(findTestObject('Register/field_address2'), 'Tamarind Street')

WebUI.selectOptionByValue(findTestObject('Register/field_country'), 'India', false)

WebUI.setText(findTestObject('Register/field_state'), 'Jaipur')

WebUI.setText(findTestObject('Register/field_city'), 'A')

WebUI.setText(findTestObject('Register/filed_zipcode'), '456790')

WebUI.setText(findTestObject('Register/field_mobilenumber'), '754329')

WebUI.click(findTestObject('Register/btn_createaccount'))

WebUI.verifyElementVisible(findTestObject('Register/verify_createaccountsuccess'))



