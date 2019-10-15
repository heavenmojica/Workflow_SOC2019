import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

// Added 
/*
import org.openqa.selenium.WebElement 
import com.kms.katalon.core.webui.common.WebUiCommonHelper 
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI 
WebElement element = WebUiCommonHelper.findWebElement(findTestObject('OASIS_SOC/Tab1_Clinical_Records/txt_CMS_Certification_Number'),30) 
WebUI.executeJavaScript("arguments[0].value='557443';", Arrays.asList(element))

WebUI.delay(10)
*/
not_run: WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/txt_CMS_Certification_Number'))

not_run: WebUI.delay(10)

not_run: WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/txt_CMS_Certification_Number'), '557443')

WebUI.delay(10)

WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/txt_Branch_ID_Number'), '123')

WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/branch_state/drd_Branch_State'))

WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/branch_state/AZ-Arizona'))

WebUI.delay(10)

