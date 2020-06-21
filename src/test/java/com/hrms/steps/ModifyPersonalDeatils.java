package com.hrms.steps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ModifyPersonalDeatils extends CommonMethods {

	@Given("user select employee by {string}")
	public void user_select_employee_by_id(String empId) {
		sendText(viewEmp.empID, empId);
		click(viewEmp.searchBtn);
		click(viewEmp.table);
	}

	@When("user should be able to modify employee personal details")
	public void user_should_be_able_to_modify_employee_personal_details(DataTable personalDetails) {
		pdetails.editBtn.click();

		List<Map<String, String>> pDeatils = personalDetails.asMaps();
		for (Map<String, String> map : pDeatils) {
			sendText(pdetails.DLNumber, map.get("DLNNumber"));
			sendText(pdetails.LicenseExpiryDate, map.get("LicenseExpiryDate"));
			sendText(pdetails.SSNNumber, map.get("SSN"));
			sendText(pdetails.SINNumber, map.get("SIN"));
			clickRadioOrCheckbox(pdetails.genderRadioGroup, map.get("Gender"));
			selectDdValue(pdetails.MaritalStatus, map.get("MaritalStatus"));
			selectDdValue(pdetails.nationalityDD, map.get("Nationality"));
			sendText(pdetails.DateofBirth, map.get("DateofBirth"));
			sendText(pdetails.nickName, map.get("NickName"));

			sendText(pdetails.MilitaryService, map.get("MilitaryS"));
			click(pdetails.editBtn);

		}
	}

	@Then("user saves the modifications and takes {string}")
	public void user_saves_the_modifications_and_takes(String screenshot) {
		TakesScreenshot(screenshot);
	}

//	
//	@Given("user select employee bi {string}")
//	public void user_select_employee_bi_ID(String empId) {
//	sendText(viewEmp.empID, empId);
//	click(viewEmp.searchBtn);
//	click(viewEmp.table);
//	wait(2);
//	}
//
//	@When("user modify emp person detail")
//	public void user_modify_emp_person_detail(DataTable PersDetails) {
//	  click(pdetails.editBtn);
//	  
//		List<Map<String , String>> maps = PersDetails.asMaps();
//		for (Map<String, String> map : maps) {
//			sendText(pdetails.DLNumber, map.get("DLNNumber"));
//			sendText(pdetails.LicenseExpiryDate, map.get("LicenseExpiryDate"));
//			sendText(pdetails.SSNNumber, map.get("SSN"));
//			sendText(pdetails.SINNumber, map.get("LicenseExpiryDate"));
//			clickRadioOrCheckbox(pdetails.genderRadioGroup, map.get("Gender"));
//			selectDdValue(pdetails.MaritalStatus, map.get("MaritalStatus"));
//			selectDdValue(pdetails.nationalityDD, map.get("Nationality"));
//			sendText(pdetails.DateofBirth, map.get("DateofBirth"));
//			sendText(pdetails.nickName, map.get("NickName"));
//			click(pdetails.Smoker);
//			selectDdValue(pdetails.MilitaryService, map.get("MilitaryS"));
//		}
//		
//	}
//
//	@Then("user save the modification and tack {string}")
//	public void user_save_the_modification_and_tack(String string) {
//	 
//	}
}