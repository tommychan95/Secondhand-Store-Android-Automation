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



class Notification {
	@Given("User has successfully login into the app")
	public void user_has_successfully_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users input email {string}")
	public void users_input_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users input password {string}")
	public void users_input_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users tap login button")
	public void users_tap_login_button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users tap notification icon")
	public void users_tap_notification_icon() {
		Mobile.callTestCase(findTestCase('Pages/Notification/Click Notification Icon'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users scroll notification list")
	public void users_scroll_notification_list() {
		Mobile.callTestCase(findTestCase('Pages/Notification/Scroll Notification List'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Users tap offering details")
	public void users_tap_offering_details() {
		Mobile.callTestCase(findTestCase('Pages/Notification/Click Offering Details'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Notification details displayed")
	public void notification_details_displayed() {
		Mobile.verifyElementVisible(findTestObject('Page_Notification/textview_penawaranproduk'), 2)
	}
}