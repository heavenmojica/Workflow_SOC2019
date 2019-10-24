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

// CLICK TAB 3 MEDICAL HISTORY
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/tab3_medical_history'))
WebUI.delay(5)

// SENSOSRY section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/chb_vision_problems'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/chb_hearing_loss'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/chb_neuropathy'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Sensory/txt_other'), 'Other Sensory')
WebUI.delay(3)

// INTEGUMENTARY section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/chb_pressure_ulcer'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/chb_stasis_ulcer'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/chb_diabetic_ulcer'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Integumentary/txt_other'), 'Other Integumentary')
WebUI.delay(3)

// ENDOCRINE section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Endocrine/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Endocrine/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Endocrine/chb_diabetes'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Endocrine/chb_thyroid_problems'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Endocrine/txt_other'), 'Other Endocrine')
WebUI.delay(3)

// RESPIRATORY section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_COPD'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_asthma'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_emphysema'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/chb_tuberculosis'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Respiratory/txt_other'), 'Other Respiratory')
WebUI.delay(3)

// CARDIOVASCULAR section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_CHF'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_arrhythmia'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_cardiomyopathy'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_chest_pain'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_CAD'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_HTN'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/chb_PVD'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Cardiovascular/txt_other'), 'Other Cardiovascular')
WebUI.delay(3)

// Gastrointestinal section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_constipation'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_diarrhea'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_fecal_incontinence'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_IBS'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_crohns_disease'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_diverticulitis-diverticulosis'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/chb_liver-gallbladder_problems'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Gastrointestinal/txt_other'), 'Other Gastrointestinal')
WebUI.delay(3)

// Genitourinary section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_urinary_incontinence'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_urinary_retention'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_recent-frequent_UTI'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_BPH'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_chronic_kidney_disease'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/chb_dialysis'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Genitourinary/txt_other'), 'Other Genitourinary')
WebUI.delay(3)

// Neurological section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_headaches'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_dizziness-vertigo'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_parkinsons_disease'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_CVA'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_TIA'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_alzheimers'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_multiple_sclerosis'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_seizures'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/chb_paralysis-paresis'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Neurological/txt_other'), 'Other Neurological')
WebUI.delay(3)

// Musculoskeletal section
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_No_History'))
WebUI.delay(2)
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_rheumatoid_arthritis'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_osteoarthritis-DJD'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_muscular_dystrophy'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_fall'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_gait_problems'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_fractures'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_joint_replacement'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/chb_spinal_cord_injury'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Musculoskeletal/txt_other'), 'Other Musculoskeletal')
WebUI.delay(3)

// Circulatory
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/chb_No_History'))
WebUI.delay(2)
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/chb_anemia'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/chb_abnormal_coagulation'))
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/chb_blood_clots'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Circulatory/txt_other'), 'Other Circulatory')
WebUI.delay(3)

// Other Medical History
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_No_History'))
WebUI.delay(3)

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_cancer_in_remission'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_cancer_in_remission'), 'Other remission')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_substance_abuse'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_substance_abuse'), 'Other abuse')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_tobacco_use'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_tobacco_use'), 'Other tobacco')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_infectious_disease'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_infectious_disease'), 'Other infectious')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_trauma-wound'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_trauma-wound'), 'Other trauma')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/chb_mental_disorder'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_mental_disorder'), 'Other mental')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Other_Medical_History/txt_other'), 'Other Medical History')
WebUI.delay(3)

// Past Surgical History
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/chb_No_History'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/chb_No_History'))
WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_date_001'), '10/23/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_procedure_001'), 'Procedure 1')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_date_002'), '10/24/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_procedure_002'), 'Procedure 2')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_date_003'), '10/25/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_procedure_003'), 'Procedure 3')

	// click ADD button or plus icon
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/btn_plus_icon'))
WebUI.delay(3)

	// insert date and procedure on the added row
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_date_004'), '10/26/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Past_Surgical_History/txt_procedure_004'), 'Procedure 4')
WebUI.delay(3)

// Hospitalizations
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/chb_none'))
WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/chb_none'))
WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_date_001'), '10/27/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_reason_001'), 'Reason 1')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_date_002'), '10/28/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_reason_002'), 'Reason 2')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_date_003'), '10/29/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_reason_003'), 'Reason 3')

	// click ADD button or plus icon
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/btn_plus_icon'))
WebUI.delay(3)

	// insert date and reason on the added row
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_date_004'), '10/30/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Past_Medical_History/Hospitalizations/txt_reason_004'), 'Reason 4')


// Immunizations
// Influenza Vaccine
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/YES_option_chb'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/YES_option_txt_date'), '11/01/2019')
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/YES_option_chb_where_agency'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/YES_option_txt_other'), 'other imm')

	// offered
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/Offered_chb_agreed'))

	// Patient agreed to receive influeza vaccine from:
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Influenza_Vaccine/Patient_agreed_chb_agency'))

// Pneumonia Vaccine 
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/YES_option_chb'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/YES_option_txt_date'), '11/01/2019')
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/YES_option_chb_where_agency'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/YES_option_txt_other'), 'other pneumnia')

	// offered
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/Offered_chb_agreed'))

	// Patient agreed to receive influeza vaccine from:
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Pneumonia_Vaccine/Patient_agreed_chb_agency'))

// Other Immunizations and Tests
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/YES_chb_shingles'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/txt_shingles_date'), '11/02/2019')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/YES_chb_TB_skin_test'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/txt_TB_skin_test_date'), '11/03/2019')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/YES_chb_Hepatitis_B'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/txt_Hepatitis_B_date'), '11/04/2019')

WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/YES_chb_tetanus'))
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Other_Immunizations and_Tests/txt_tetanus_date'), '11/05/2019')

// Health Screening section
WebUI.delay(3)
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_001'), 'exam 1')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_date_001'), '11/07/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_result_001'), 'result 1')

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_002'), 'exam 2')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_date_002'), '11/08/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_result_002'), 'result 2')

	// clicking of PLUS ICON
WebUI.delay(3)
WebUI.click(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/btn_plus_icon'))

WebUI.delay(3)
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_003'), 'exam 3')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_date_003'), '11/09/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_exam_type_result_003'), 'result 3')

	// allergies
		// Clicking of NKA
WebUI.check(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/chb_allergies_NKA'))
WebUI.delay(3)

WebUI.uncheck(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/chb_allergies_NKA'))
		// adding of allergies
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), 'allergy 1')
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), Keys.chord(Keys.ENTER))
WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), 'allergy 2')
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), Keys.chord(Keys.ENTER))
WebUI.delay(3)

WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), 'allergy 3')
WebUI.sendKeys(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Health_Screening/txt_allergies'), Keys.chord(Keys.ENTER))
WebUI.delay(3)

// Recent Face to Face with Physician
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Recent_Face_to_Face_with_Physician/txt_date_last_contracted_physician'), '11/10/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Recent_Face_to_Face_with_Physician/txt_date_last_visit_with_physician'), '11/11/2019')
WebUI.setText(findTestObject('OASIS_SOC/Tab3_Medical_History/Immunizations/Recent_Face_to_Face_with_Physician/txt_reason_for_the_contact_or_visit'), 'No more reason')


WebUI.delay(10)










