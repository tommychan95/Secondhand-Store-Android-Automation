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



class register {
	@Given("User open app and navigate to register page")
	public void user_open_app_and_navigate_to_register_page() {
		Mobile.callTestCase(findTestCase('Pages/Register/Navigate to Register page'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User on the register page")
	public void user_on_the_register_page() {
		Mobile.tap(findTestObject('Page_Register/register_btn_login'), 0)
		Mobile.verifyElementExist(findTestObject('Page_User Login/login_textfield_email'), 0)
		Mobile.tap(findTestObject('Page_User Login/btn_navigate_register'), 0)
	}

	@When("User inputs name {string}")
	public void user_inputs_name(String name) {
		Mobile.clearText(findTestObject('Page_Register/register_input_name'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_name'), name, 0)
	}

	@When("User inputs email {string}")
	public void user_inputs_email(String email) {
		Mobile.clearText(findTestObject('Page_Register/register_input_email'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_email'), email, 0)
	}

	@When("User inputs password {string}")
	public void user_inputs_password(String password) {
		Mobile.clearText(findTestObject('Page_Register/register_input_password'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_password'), password, 0)
	}

	@When("User inputs phone number {string}")
	public void user_inputs_phone_number(String phone_number) {
		Mobile.clearText(findTestObject('Page_Register/register_input_phone_number'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_phone_number'), phone_number, 0)
		Mobile.scrollToText('Sudah punya akun?', FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User inputs city {string}")
	public void user_inputs_city(String city) {
		Mobile.clearText(findTestObject('Page_Register/register_input_city'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_city'), city, 0)
		Mobile.scrollToText('Sudah punya akun?', FailureHandling.STOP_ON_FAILURE)
	}

	@When("User inputs address {string}")
	public void user_inputs_address(String address) {
		Mobile.clearText(findTestObject('Page_Register/register_input_address'), 0)
		Mobile.setText(findTestObject('Page_Register/register_input_address'), address, 0)

	}
	
	@When("User tap button registers")
	public void user_tap_button_registers() {
		Mobile.tap(findTestObject('Page_Register/btn_register'), 0)	
	}

	@When("User tap button register")
	public void user_tap_button_register() {
		Mobile.tap(findTestObject('Page_Register/btn_register'), 0)
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
		Mobile.tapAtPosition(10, 1400)
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
		Mobile.scrollToText('Sudah punya akun?', FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User navigates to Account page")
	public void user_navigates_to_Account_page() {
		Mobile.verifyMatch('Akun Saya', 'Akun Saya', false)
		Mobile.tap(findTestObject('Page_User Logout/button_logout'), 0)
		Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text warning {string}")
	public void text_warning(String string) {
		Mobile.verifyMatch('Alamat tidak boleh kosong', 'Alamat tidak boleh kosong', false)
		Mobile.verifyMatch('Kota tidak boleh kosong', 'Kota tidak boleh kosong', false)
		Mobile.verifyMatch('Email tidak boleh kosong', 'Email tidak boleh kosong', false)
		Mobile.verifyMatch('Nama tidak boleh kosong', 'Nama tidak boleh kosong', false)
		Mobile.verifyMatch('Password tidak boleh kosong', 'Password tidak boleh kosong', false)
		Mobile.verifyMatch('Nomor telepon tidak boleh kosong', 'Nomor telepon tidak boleh kosong', false)
		Mobile.verifyMatch('Password harus lebih dari 6 karakter', 'Password harus lebih dari 6 karakter', false)
	}

	@When("User inputs password less than {int} character {string}")
	public void user_inputs_password_less_than_character(Integer int1, String passwordd) {
		Mobile.setText(findTestObject('Page_Register/register_input_password'), passwordd, 0)
	}
}