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



class deleteproducts {
	@Given("Usser open apk seconddhand")
	public void usser_open_apk_seconddhand() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Usser input e-mail {string}")
	public void usser_input_e_mail(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Usser fill pwwd {string}")
	public void usser_fill_pwwd(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Usser press button login")
	public void usser_press_button_login() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Usser press button daftar jual saya")
	public void usser_press_button_daftar_jual_saya() {
		Mobile.tap(findTestObject('Page_User Delete Product/delete_btn_daftarjual'), 0)
	}

	@When("Usser press button trash")
	public void usser_press_button_trash() {
		Mobile.tap(findTestObject('Page_User Delete Product/sampah_bin'), 10)
	}

	@Then("Usser press menu cancel delete")
	public void usser_press_menu_cancel_delete() {
		Mobile.callTestCase(findTestCase('Pages/User Delete Product/Tap to batalkan hapus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Usser pressss button trash")
	public void usser_pressss_button_trash() {
		Mobile.tap(findTestObject('Page_User Delete Product/sampah_bin'), 10)
	}

	@When("Usser tapp to hapus")
	public void usser_tapp_to_hapus() {
		Mobile.callTestCase(findTestCase('Pages/User Delete Product/Tap to hapus'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Usser get notification delete successful")
	public void usser_get_notification_delete_successful() {
		Mobile.verifyElementVisible(findTestObject('Page_User Delete Product/delete_notifikasi_sukses'), 30)
	}
}