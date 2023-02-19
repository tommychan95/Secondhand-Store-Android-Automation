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



class Offering {
	@Given("Buyer has successfully login into the app")
	public void buyer_has_successfully_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer input email {string}")
	public void buyer_input_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer input password {string}")
	public void buyer_input_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Login Button")
	public void buyer_click_Login_Button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Home Page")
	public void buyer_click_Home_Page() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Home Page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Product")
	public void buyer_click_Product() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Interested Button")
	public void buyer_click_Interested_Button() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Interested Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer input Offering Price {string}")
	public void buyer_input_Offering_Price(String string) {
		Mobile.callTestCase(findTestCase('Pages/Offering/Input Offering Price 1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Send Button")
	public void buyer_click_Send_Button() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Send Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Success Message Displayed")
	public void success_Message_Displayed() {
		Mobile.verifyElementVisible(findTestObject('Page_Offering/textview_Harga tawarmu berhasil dikirim ke penjual'), 2)
	}

	@Given("Buyer has login into the app")
	public void buyer_has_login_into_the_app() {
		Mobile.tap(findTestObject('Page_Offering/btn_back'), 1)
	}

	@When("Buyer click Productt")
	public void buyer_click_Productt() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer click Interestedd Button")
	public void buyer_click_Interestedd_Button() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Interested Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyers input Offering Price {string}")
	public void buyers_input_Offering_Price(String string) {
		Mobile.callTestCase(findTestCase('Pages/Offering/Input Offering Price 2'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Buyer delete Offering Price")
	public void buyer_delete_Offering_Price() {
		Mobile.clearText(findTestObject('Page_Offering/edittext_hargatawar'), 2)
	}

	@When("Buyers click Send Button")
	public void buyers_click_Send_Button() {
		Mobile.callTestCase(findTestCase('Pages/Offering/Click Send Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Error Message Displayed")
	public void error_Message_Displayed() {
		Mobile.verifyElementVisible(findTestObject('Page_Offering/errormsg_hargatawartidakbolehkosong'), 1)
	}
}