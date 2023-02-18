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



class rejectOffering {
	@Given("Sellerrr has successfully login into the app")
	public void sellerrr_has_successfully_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellerrr input email {string}")
	public void sellerrr_input_email(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : 'ikatriyuli@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellerrr input password {string}")
	public void sellerrr_input_password(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : 'Kaminka13'], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellerrr click Login Button")
	public void sellerrr_click_Login_Button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}


	@When("Sellerrr click Profile")
	public void sellerrr_click_Profile() {
		Mobile.tap(findTestObject('Page_Reject Offering/Nav_Profile'), 0)
	}

	@When("Sellerrr click Daftar Jual Produk Saya")
	public void sellerrr_click_Daftar_Jual_Produk_Saya() {
		Mobile.tap(findTestObject('Page_Reject Offering/ButtonList_Daftar Jual Saya'), 0)
	}

	@When("Sellerrr click Diminati")
	public void sellerrr_click_Diminati() {
		Mobile.callTestCase(findTestCase('Pages/Reject Offering/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellerrr choose item offering product")
	public void sellerrr_choose_item_offering_product() {
		Mobile.callTestCase(findTestCase('Pages/Reject Offering/Choose Item Offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellerrr click Button Tolak")
	public void sellerrr_click_Button_Tolak() {
		Mobile.callTestCase(findTestCase('Pages/Reject Offering/Click Button Tolak'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Text {string} displayed")
	public void text_displayed(String string) {
		Mobile.verifyElementText(findTestObject('Page_Reject Offering/TextView-Penawaranditolak'), '')
	}
}