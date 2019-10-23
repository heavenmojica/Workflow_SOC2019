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
import org.openqa.selenium.Keys as Keys

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
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1021_Primary_Diagnosis/a_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1021_Primary_Diagnosis/a_txt_column2'), Keys.chord(Keys.ENTER))

// M1023
//// B row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column1'), 'Secondary malignant neoplasm of bone')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column2'), 'C79.51')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_chb_column2_3'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/b_txt_column2'), Keys.chord(Keys.ENTER))

//// C row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/c_txt_column1'), 'Neoplasm related pain (acute) (chronic)')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/c_txt_column2'), 'G89.3')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/c_chb_column2_3'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/c_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/c_txt_column2'), Keys.chord(Keys.ENTER))

//// C row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/d_txt_column1'), 'Type 2 diabetes mellitus without complications')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/d_txt_column2'), 'E11.9')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/d_chb_column2_3'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/d_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/d_txt_column2'), Keys.chord(Keys.ENTER))

//// E row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/e_txt_column1'), 'Muscle weakness (generalized)')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/e_txt_column2'), 'M62.81')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/e_chb_column2_3'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/e_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/e_txt_column2'), Keys.chord(Keys.ENTER))

//// F row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/f_txt_column1'), 'Difficulty in walking, not elsewhere classified')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/f_txt_column2'), 'R26.2')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/f_chb_column2_3'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/f_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/f_txt_column2'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

// ADD ROW BUTTON
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/btn_add_row'))
WebUI.delay(3)

//// G row
////// Column A
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/g_txt_column1'), 'Occlusion and stenosis of unspecified carotid artery')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/g_txt_column2'), 'I65.29')

////// Column B
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/g_chb_column2_2'))
WebUI.delay(3)
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/g_txt_column1'), Keys.chord(Keys.ENTER))
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1021-1023/M1023_Other_Diagnoses/g_txt_column2'), Keys.chord(Keys.ENTER))

// M1028 Active Diagnoses – Comorbidities and Co-existing Conditions. (Check all that apply. See OASIS Guidance Manual for a complete list of relevant ICD-10 codes.)
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1028/chb_1'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1028/chb_2'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1028/chb_3'))

// M1030 Therapies the patient receives at home: (Mark all that apply.)
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1030/chb_1'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1030/chb_2'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1030/chb_3'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1030/chb_4'))

// M1033 Risk for Hospitalization: Which of the following signs or symptoms characterize this patient as at risk for hospitalization? (Mark all that apply.)
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_1'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_2'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_3'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_4'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_5'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_6'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_7'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_8'))
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_9'))
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/txt_9'), 'other 001')
WebUI.click(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1033/chb_10'))

// M1060 Height and Weight – While measuring, if the number is X.1 – X.4 round down; X.5 or greater round up

WebUI.delay(3)
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1060/txt_a_height'), '68')
WebUI.setText(findTestObject('OASIS_SOC/Tab2_Diagnosis/M1060/txt_b_weight'), '133')










