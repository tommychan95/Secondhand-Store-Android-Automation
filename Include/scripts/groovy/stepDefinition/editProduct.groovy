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



class editProduct {
	@Given("Selerr has successfully login into the app")
	public void selerr_has_successfully_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr input email {string}")
	public void selerr_input_email(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : 'ikatriyuli@gmail.com'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr input password {string}")
	public void selerr_input_password(String string) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : 'Kaminka13'], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr click Login Button")
	public void selerr_click_Login_Button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr click Daftar Jual Produk Saya")
	public void selerr_click_Daftar_Jual_Produk_Saya() {
		Mobile.callTestCase(findTestCase('Pages/Edit Produk/Click Daftar Jual Saya'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr click Choose Item Product")
	public void selerr_click_Choose_Item_Product() {
		Mobile.callTestCase(findTestCase('Pages/Edit Produk/Choose Item Product'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	
	@When("Selerr Input Product Form")
	public void selerr_Input_Product_Form() {
		Mobile.callTestCase(findTestCase('Pages/Edit Produk/Input Product Form'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@When("Selerr click Button Perbarui")
	public void selerr_click_Button_Perbarui() {
		Mobile.callTestCase(findTestCase('Pages/Edit Produk/Click Button Perbarui'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Then("App Verify Success Update the product will displayed")
	public void app_Verify_Success_Update_the_product_will_displayed() {
		Mobile.callTestCase(findTestCase('Pages/Edit Produk/Verify Success Update'), [:], FailureHandling.STOP_ON_FAILURE)
	}
}