package com.hrms.steps;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.hrms.utils.CommonMethods;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class InvalidCreadtentialss extends CommonMethods{

//	@When("user enters invalid {string} and {string} and see {string}")
//	public void user_enters_invalid_and_and_see(String string, String string2, String string3, DataTable dataTable) {
//	  List<Map<String,String>> listOfMaps= dataTable.asMaps();
//	  
//	  for (Map<String, String> map : listOfMaps) {
//		
//		 String unme= map.get("UserName");
//		 String pword = map.get("Password");
//		 String eMessage = map.get("ErrorMessage");
//		 
//		 sendText(login.username, uname);
//		 sendText(login.password, pword);
//		 login.loginBtn.click();
//		 String actual = login.errorMsg.getText();
//		 String expected = eMessage;
//		 Assert.assertEquals("Error message is not expected ",actual, expected);
//		 
//		 TakesScreenshot("InvalidCreadtentil");
//	} 
//  
//	}

	@When("user enters invalid {string} and {string} and see {string}")
	public void user_enters_invalid_and_and_see(String uname, String pword, String errMessage) {
		 sendText(login.username, uname);
		 sendText(login.password, pword);
		 login.loginBtn.click();
		 
		 String expected = errMessage;
		 String actual=login.errorMsg.getText();
		 
		 Assert.assertEquals("Error message is not expected ",actual, expected);
	}
}
