package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class AddEmployeeSteps extends CommonMethods {

	@Given("user logged in into HRMS")
	public void user_logged_in_into_HRMS() {
		  sendText(login.username, ConfigsReader.getProperty("username"));
		   sendText(login.password , ConfigsReader.getProperty("password"));
		   click(login.loginBtn);
	}

	@Given("user is navigated to Add Employee Page")
	public void user_is_navigated_to_Add_Employee_Page() {
		 dashboard.navigateToAddEmployee();
	}

	@When("user enters employees first name and last name")
	public void user_enters_employees_first_name_and_last_name() {
		sendText(addEmp.firstName, "Karim123@");
		  sendText(addEmp.lastName, "Benzima1234@");
	}

	@When("user clicks save button")
	public void user_clicks_save_button() {
		  click(addEmp.saveBtn);
	}

	@Then("employee is added successfully")
	public void employee_is_added_successfully() {
		  String actual=pdetails.profilePic.getText();
		  String expected="Karim123@ Benzima1234@";
		   Assert.assertEquals("Employee not added",expected, actual);
	}

	@When("user deletes employee id")
	public void user_deletes_employee_id() {
		 //addEmp.employeeId.clear();
		addEmp.employeeId.sendKeys(Keys.DELETE);
	}

	@When("user clicks on create login checkbox")
	public void user_clicks_on_create_login_checkbox() {
		 addEmp.creatLoginCr("Karim123@","Benzima1234@","Benzima1234@");
		  //  addEmp.creatLoginCr(uname, password , );
	}

	@When("user enters  login credentials")
	public void user_enters_login_credentials() {
	    
	}

}