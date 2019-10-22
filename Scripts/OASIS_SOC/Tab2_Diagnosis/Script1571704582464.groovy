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

WebUI.delay(10)

// TAB diagnosis
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/tab2_diagnosis'))
WebUI.delay(5)

// M1021/1023 Diagnoses and Symptom Control
// M1021
//// A row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1021_Primary_Diagnosis/a_txt_column1'), 'Malignant neoplasm of prostate')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1021_Primary_Diagnosis/a_txt_column2'), 'C61')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1021_Primary_Diagnosis/a_chb_column2_3'))
WebUI.delay(3)

// M1023
//// B row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column1'), 'Secondary malignant neoplasm of bone')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column2'), 'C79.51')
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/click_outside_the_object'))

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_chb_column2_3'))
WebUI.delay(3)
















