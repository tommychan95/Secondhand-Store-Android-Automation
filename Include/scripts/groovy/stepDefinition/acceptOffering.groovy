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



class acceptOffering {
	@Given("Selllerrr has successfully login into the app")
	public void selllerrr_has_successfully_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr input email {string}")
	public void selllerrr_input_email(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : 'ikatriyuli@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr input password {string}")
	public void selllerrr_input_password(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : 'Kaminka13'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr click Login Button")
	public void selllerrr_click_Login_Button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr click Daftar Jual Produk Saya")
	public void selllerrr_click_Daftar_Jual_Produk_Saya() {
		Mobile.tap(findTestObject('Page_Reject Offering/ImageView_DaftarJualSaya'), 0)
	}
	
	@When("Selllerrr click Diminati")
	public void selllerrr_click_Diminati() {
		Mobile.callTestCase(findTestCase('Pages/Reject Offering/Click Button Diminati'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr choose item offering product")
	public void selllerrr_choose_item_offering_product() {
		Mobile.callTestCase(findTestCase('Pages/Reject Offering/Choose Item Offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selllerrr click Button Terima")
	public void selllerrr_click_Button_Terima() {
		Mobile.callTestCase(findTestCase('Pages/Accept Offering/Click Button Terima'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("Selllerrr verify {string} displayed")
	public void selllerrr_verify_displayed(String string) {
		Mobile.callTestCase(findTestCase('Pages/Accept Offering/Verify Success Offering'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}