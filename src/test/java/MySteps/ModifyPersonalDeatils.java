package MySteps;

import java.util.List;
import java.util.Map;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class ModifyPersonalDeatils extends CommonMethods{

	@Given("user select employee bi {string}")
	public void user_select_employee_bi_ID(String empId) {
	sendText(viewEmp.empID, empId);
	click(viewEmp.searchBtn);
	click(viewEmp.table);
	wait(2);
	}

	@When("user modify emp person detail")
	public void user_modify_emp_person_detail(DataTable PersDetails) {
	  click(pdetails.editBtn);
	  
		List<Map<String , String>> maps = PersDetails.asMaps();
		for (Map<String, String> map : maps) {
			
		}
		
	}

	@Then("user save the modification and tack {string}")
	public void user_save_the_modification_and_tack(String string) {
	 
	}
}