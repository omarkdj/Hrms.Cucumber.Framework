package com.hrms.steps;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SaceDemoLoginSteps extends CommonMethods {

	@Given("user is login page")
	public void user_is_login_page() {
		setUp();
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string) {
		sendText(sacelogin.userName, "Admin");

	}

	@When("user enter pasword as {string}")
	public void user_enter_pasword_as(String string) {
		sendText(sacelogin.password , "Hum@nhrm123");
	}

	@When("click on login button")
	public void click_on_login_button() {
		click(sacelogin.LoginBTN);
	}

	@Then("user should see the error message")
	public void user_should_see_the_error_message() {
		sacelogin.errorMEssage.isDisplayed();
		takeScreenshot("screnn");
	}

}
