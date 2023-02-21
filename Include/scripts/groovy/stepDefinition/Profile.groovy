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



class Profile {

	@Given("User open app and navigate to profile page using {string} and {string}")
	public void user_open_app_and_navigate_to_profile_page(String email, String password) {
		Mobile.callTestCase(findTestCase('Pages/Profile/login'), [('email'): email, ('password'): password], FailureHandling.STOP_ON_FAILURE)
		Mobile.callTestCase(findTestCase('Pages/Profile/navigate to profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User in profile page")
	public void user_in_profile() {
		Mobile.callTestCase(findTestCase('Pages/Profile/verify content'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When("User tap change name and input {string}")
	public void user_input_name(String name) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change name'), [('name') : name], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap change phone and input {string}")
	public void user_input_phone(String phone) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change phone number'), [('phone') : phone], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap change city and input {string}")
	public void user_input_city(String city) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change city'), [('city') : city], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap change address and input {string}")
	public void user_input_address(String address) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change user address'), [('address') : address], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap change email address and input {string}")
	public void user_input_email(String value) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change email'), [('email') : value], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User tap change password and input {string} as current password, {string} as new password and {string} as confirmation password")
	public void user_input_password(String old_password, String new_password, String confirm_password) {
		Mobile.callTestCase(findTestCase('Pages/Profile/change password'), [('old_password') : old_password, ('password') : new_password, ('confirm_password') : confirm_password], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("User change profile picture")
	public void user_input_profile_picture() {
		Mobile.callTestCase(findTestCase('Pages/Profile/change picture profile'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User tap submit button")
	public void user_tap_button_Login() {
		Mobile.callTestCase(findTestCase('Pages/Profile/tap submit button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User show success alert and data {string} has been updated")
	public void user_show_success_alert_and_validate_data(String string) {
		Mobile.callTestCase(findTestCase('Pages/Profile/verify success alert'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.verifyMatch(string, string, false)
	}

	@Then("User show success alert")
	public void user_show_success_alert() {
		Mobile.callTestCase(findTestCase('Pages/Profile/verify success alert'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Warning text {string} will be shown")
	public void text_warning_akan_muncul(String string) {
		Mobile.verifyMatch(string, string, false)
	}
	
	@Then("Warning text {string} will be shown and close popup")
	public void text_warning_akan_muncul2(String string) {
		Mobile.verifyMatch(string, string, false)
		Mobile.tapAtPosition(360, 321)
	}
}