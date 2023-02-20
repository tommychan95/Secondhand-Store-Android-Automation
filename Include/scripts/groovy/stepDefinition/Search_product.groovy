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



class Search_product {
	@Given("User navigate to search page")
	public void user_navigate_to_search_page() {
		Mobile.callTestCase(findTestCase('Pages/Search product by name/Navigate to search page'), [:], FailureHandling.STOP_ON_FAILURE)
	}
	
	@Given("User on the search page")
	public void user_on_the_search_page() {
		Mobile.startApplication('Apk/app-release.apk', true)
		Mobile.callTestCase(findTestCase('Pages/Search product by name/Navigate to search page'), [:], FailureHandling.STOP_ON_FAILURE)
	}

	@When("User inputs name product")
	public void user_inputs_name_product() {
		Mobile.setText(findTestObject('Page_Search product name/input_product_1'), 'Baju Muslim', 0)
		Mobile.waitForElementPresent(findTestObject('Page_Search product name/product_name1'), 3)
	}

	@Then("Product will appear")
	public void product_will_appear() {
		Mobile.getText(findTestObject('Page_Search product name/product_name1'), 0)
		Mobile.closeApplication()
	}

	@When("User click product")
	public void user_click_product() {
		Mobile.tap(findTestObject('Page_Search product name/product_name1'), 0)
	}

	@Then("User already in detail product page")
	public void user_already_in_detail_product_page() {
		Mobile.verifyElementVisible(findTestObject('Page_Search product name/button_nego'), 0)
	}
}