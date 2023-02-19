import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.callTestCase(findTestCase('Pages/Profile/login'), [('email') : 'binarqae1@gmail.com', ('password') : 'students123'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Profile/navigate to profile'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Profile/change user address'), [('address') : ''], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Pages/Profile/tap submit button'), [:], FailureHandling.STOP_ON_FAILURE)

error_message = Mobile.getText(findTestObject('Page_Profile/input_edit_address'), 0)

