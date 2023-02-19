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



class addproducts {
	@Given("Users navigatedd to login")
	public void users_navigatedd_to_login() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Navigate to login'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users fill in email {string}")
	public void users_fill_in_email(String email) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input email'), [('email') : email], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users fill in pwd {string}")
	public void users_fill_in_pwd(String password) {
		Mobile.callTestCase(findTestCase('Pages/User Login/Input password'), [('password') : password], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users tap button login")
	public void users_tap_button_login() {
		Mobile.callTestCase(findTestCase('Pages/User Login/Tap button login'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users navigate to add product")
	public void users_navigate_to_add_product() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Navigate to add product'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input nama produk")
	public void users_input_nama_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input nama produk'), [('nama_produk') : 'Monitor\r\n'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input harga produk")
	public void users_input_harga_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input harga produk'), [('harga') : '100000'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users choose kategori produk")
	public void users_choose_kategori_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input kategori'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input lokasi produk")
	public void users_input_lokasi_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input lokasi produk'), [('lokasi') : 'Bandung'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input deskripsi produk")
	public void users_input_deskripsi_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input Deskripsi'), [('deskripsi') : 'Oke'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users choose photo produk")
	public void users_choose_photo_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input photo produk'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users tap terbitkan")
	public void users_tap_terbitkan() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Tap to terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@Then("Users get notification success add produk")
	public void users_get_notification_success_add_produk() {
		Mobile.verifyElementVisible(findTestObject('Page_User Add Product/add_notifikasi_sukses'), 0)

	}
	
	@Given("Users navigateeddd to login")
	public void users_navigateeddd_to_login() {
		Mobile.tap(findTestObject('Page_User Add Product/back_button'), 5)

	}
	
	@When("Users navigatte to add produk")
	public void users_navigatte_to_add_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Navigate to add product'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input hargaa produk")
	public void users_input_hargaa_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input harga produk'), [('harga') : '100000'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users choose kategorii produk")
	public void users_choose_kategorii_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input kategori'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input lokasii produk")
	public void users_input_lokasii_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input lokasi produk'), [('lokasi') : 'Bekasi'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users input deskripsii produk")
	public void users_input_deskripsii_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input Deskripsi'), [('deskripsi') : 'Ini monitor ya'], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users choose photoo produk")
	public void users_choose_photoo_produk() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Input photo produk'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@When("Users squeeeze terbitkan")
	public void users_squeeeze_terbitkan() {
		Mobile.callTestCase(findTestCase('Pages/User Add Product/Tap to terbitkan'), [:], FailureHandling.STOP_ON_FAILURE)

	}
	
	@Then("Users get popupp notification failed add product")
	public void users_get_popupp_notification_failed_add_product() {
		Mobile.verifyElementVisible(findTestObject('Page_User Add Product/txtview_Nama produk tidak boleh kosong'), 3)

	}
}