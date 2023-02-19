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



class Preview {
	@Given("Seller has login into the app")
	public void seller_has_login_into_the_app() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller input email {string}")
	public void seller_input_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller input password {string}")
	public void seller_input_password(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click LOGIN Button")
	public void seller_click_LOGIN_Button() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Seller click ADD Button")
	public void seller_click_ADD_Button() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Click Add Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Product Name {string}")
	public void sellers_input_Product_Name(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Product Name'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Product Price {string}")
	public void sellers_input_Product_Price(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Product Price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers choose Product Category")
	public void sellers_choose_Product_Category() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Choose Category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Location {string}")
	public void sellers_input_Location(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Location'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Description {string}")
	public void sellers_input_Description(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Description'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.scrollToText('Nama Produk', FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers upload Product Photo")
	public void sellers_upload_Product_Photo() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Upload Product Photo'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers click Preview Button")
	public void sellers_click_Preview_Button() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Click Preview'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Sellers verify product information details")
	public void sellers_verify_product_information_details() {
		Mobile.verifyElementVisible(findTestObject('Page_Preview/img_samsunggalaxy'), 10)
		Mobile.callTestCase(findTestCase('Pages/Preview/Click Back Button 1'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Given("Seller has login into the apps")
	public void seller_has_login_into_the_apps() {
		Mobile.tap(findTestObject('Page_Preview/btn_back2'), 1)
	}

	@When("Seller click ADDS Button")
	public void seller_click_ADDS_Button() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Click Add Button'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Products Prices {string}")
	public void sellers_input_Products_Prices(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Product Price'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers choose Products Category")
	public void sellers_choose_Products_Category() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Choose Category'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Locations {string}")
	public void sellers_input_Locations(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Location'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers input Descriptions {string}")
	public void sellers_input_Descriptions(String string) {
		Mobile.callTestCase(findTestCase('Pages/Preview/Input Description'), [:], FailureHandling.STOP_ON_FAILURE)
		Mobile.scrollToText('Harga Produk', FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers upload Product Photos")
	public void sellers_upload_Product_Photos() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Upload Product Photo'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("Sellers click Previews Button")
	public void sellers_click_Previews_Button() {
		Mobile.callTestCase(findTestCase('Pages/Preview/Click Preview'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@Then("Error Message Product Field can't be blank displayed")
	public void error_Message_Product_Field_can_t_be_blank_displayed() {
		Mobile.verifyElementVisible(findTestObject('Page_Preview/txtview_Nama produk tidak boleh kosong'), 10)
	}
}