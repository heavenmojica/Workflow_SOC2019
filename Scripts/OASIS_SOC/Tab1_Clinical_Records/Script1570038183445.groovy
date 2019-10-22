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

//WebUI.delay(10)
//WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0010_txt_CMS_Certification_Number'), '557443')

WebUI.delay(10)
// M0010
// NOT WORKING
//WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0010_txt_CMS_Certification_Number'), '557443')

// M0014
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0014_branch_state/drd_Branch_State'))
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0014_branch_state/AK-Alaska'))
WebUI.delay(3)

// M0016
WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0016_txt_Branch_ID_Number'), '123')
WebUI.delay(3)

// M0018 PRIMARY CARE PHYSICIAN section
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0018_National_Provider_Identifier/primary_physician/drd_primary_care_physician'))
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0018_National_Provider_Identifier/primary_physician/opt_primary_care_physician'))
WebUI.delay(3)

// M0065 Medicaid Number Section
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0065_chb_medicaid_number'))
WebUI.delay(3)

// M0090 ate Assessment Completed Section
WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0090_datePicker_date_assessment_completed'), '10/22/2019')
WebUI.delay(3)

// M0102
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0102_Date_of_Physician-ordered_Start_of_Care/M0102_chb'))
WebUI.delay(3)

// M0104 Date of Referral
WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0104_datePicker_Date_Of_Referral'), '10/22/2019')
WebUI.delay(3)

// M0110 Episode Timing
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0110_Episode_Timing/chb_1_early'))
WebUI.delay(3)

// M0140 Race/Ethnicity
// NOT WORKING
//WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0140_Race_Ethnicityg/chb_2_asian'))
//WebUI.delay(3)

// M1050 
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M0150_Current_Payment_Sources_for_Home_Care/chb_1_Medicare_(Traditional_fee-for-service)'))
WebUI.delay(3)

// M1000
WebUI.click(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M1000/chb_3_Short-stay_acute_hospital_(IPPS)'))
WebUI.delay(3)

// M1005
WebUI.setText(findTestObject('OASIS_SOC/Tab1_Clinical_Records/M1005_Inpatient_Discharge_Date/datePicker'), '10/22/2019')
WebUI.delay(3)





