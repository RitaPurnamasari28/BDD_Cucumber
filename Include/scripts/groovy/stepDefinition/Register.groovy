package stepDefinition
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Register {
@Given("User open browser and navigate to automationexercise.com")
public void user_open_browser_and_navigate_to_automationexercise_com() {
	WebUI.openBrowser('https://automationexercise.com/')
	
	WebUI.maximizeWindow()
}

@When("Verify homepage")
public void verify_homepage() {
	WebUI.verifyElementVisible(findTestObject('Register/verify_home'))
}

@When("Clik signup\\/login button")
public void clik_signup_login_button() {
	WebUI.click(findTestObject('Register/btn_signuplogin'))
}

@When("Input invalid email")
public void input_invalid_email() {
	WebUI.setText(findTestObject('Register/field_email'), 'rita@')
}

@When("Click signup button")
public void click_signup_button() {
	WebUI.click(findTestObject('Register/btn_signup'))
}

@Then("Verify signup failure")
public void verify_signup_failure() {
	WebUI.verifyElementVisible(findTestObject('Register/verify_signup'))
}

@When("Input valid email")
public void input_valid_email() {	
	WebUI.clearText(findTestObject('Register/field_nama'))
	
	WebUI.setText(findTestObject('Register/field_email'), 'rita2@tafmail.com')
}

@When("Input existing name")
public void input_existing_name() {
	WebUI.setText(findTestObject('Register/field_nama'), 'a')
}

@When("Input existing email")
public void input_existing_email() {
	WebUI.setText(findTestObject('Register/field_email'), 'rita@tafmail.com')
}

@Then("Verify email already exist")
public void Verify_email_already_exist() {
	WebUI.verifyElementVisible(findTestObject('Register/verify_emailalreadyexist'))
}

@When("Input name")
public void input_name() {
	WebUI.setText(findTestObject('Register/field_nama'), 'Selena12354')
}

@When("Input email")
public void input_email() {
	WebUI.setText(findTestObject('Register/field_email'), 'rita4@tafmail.com')
}

@When("Choose gender")
public void choose_gender() {
	WebUI.check(findTestObject('Register/check_gender'))
}

@When("Input password")
public void input_password() {
	WebUI.setText(findTestObject('Register/field_password'), '12345678')
	}

@When("Input date of birth")
public void input_date_of_birth() {
	WebUI.click(findTestObject('Register/btn_date'))
	
	WebUI.selectOptionByValue(findTestObject('Register/btn_date'), '1', false)
	
	WebUI.click(findTestObject('Register/btn_months'))
	
	WebUI.selectOptionByValue(findTestObject('Register/btn_months'), '1', false)
	
	WebUI.click(findTestObject('Register/btn_year'))
	
	WebUI.selectOptionByValue(findTestObject('Register/btn_year'), '2003', false)
}

@When("Check Signup for our news letter and Receive Special Offer from our partners")
public void check_Signup_for_our_news_letter_and_Receive_Special_Offer_from_our_partners() {
	WebUI.check(findTestObject('Register/checkbox_newsletter'))
	
	WebUI.check(findTestObject('Register/checkbox_specialoffer'))
}

@When("Input first name, last name, address, backup address")
public void input_first_name_last_name_address_backup_address() {
	WebUI.setText(findTestObject('Register/field_firstname'), 'Selena')
	
	WebUI.setText(findTestObject('Register/filed_lastname'), 'Swift')
	
	WebUI.setText(findTestObject('Register/field_company'), 'Sony Music')
	
	WebUI.setText(findTestObject('Register/field_address'), 'Jalan Brodway')
	
	WebUI.setText(findTestObject('Register/field_address2'), 'Tamarind Street')
}

@When("Choose country")
public void choose_country() {
	WebUI.selectOptionByValue(findTestObject('Register/field_country'), 'India', false)
}

@When("Input state, city, zipcode, and mobile number")
public void input_state_city_zipcode_and_mobile_number() {
	WebUI.setText(findTestObject('Register/field_state'), 'Jaipur')
	
	WebUI.setText(findTestObject('Register/field_city'), 'A')
	
	WebUI.setText(findTestObject('Register/filed_zipcode'), '456790')
	
	WebUI.setText(findTestObject('Register/field_mobilenumber'), '754329')
}

@When("Click Create account")
public void click_Create_account() {
	WebUI.click(findTestObject('Register/btn_createaccount'))
	}

@Then("Verify create account success")
public void verify_create_account_success() {
	WebUI.verifyElementVisible(findTestObject('Register/verify_createaccountsuccess'))
	
	WebUI.closeBrowser()
}

 
}