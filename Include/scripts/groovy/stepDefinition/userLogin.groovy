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



class userLogin {
	@Given("User open app and navigate to login page")
	public void user_open_app_and_navigate_to_login_page() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("User on login page")
	public void user_on_login_page() {
		Mobile.tap(findTestObject('Page_User Login/button_back'), 0)
		Mobile.tap(findTestObject('Page_User Login/account_button_login'), 0)
		Mobile.verifyElementExist(findTestObject('Page_User Login/login_textfield_email'), 0)
	}

	@When("User input email {string}")
	public void user_input_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User input password {string}")
	public void user_input_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@And("User tap button Login")
	public void user_tap_button_Login() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("User navigate to Account page")
	public void user_navigate_to_Account_page() {
		Mobile.verifyElementVisible(findTestObject('Page_User Login/account_user_name'), 0)
		Mobile.tap(findTestObject('Page_User Logout/button_logout'), 0)
	}

	@Then("Text warning {string} akan muncul")
	public void text_warning_akan_muncul(String string) {
		Mobile.verifyMatch('Email tidak boleh kosong', 'Email tidak boleh kosong', false)
		Mobile.verifyMatch('Password tidak boleh kosong', 'Password tidak boleh kosong', false)
		Mobile.verifyMatch('Email tidak valid', 'Email tidak valid', false)
	}
}