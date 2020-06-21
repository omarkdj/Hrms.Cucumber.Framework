package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utils.CommonMethods;

public class AddEmployeePageElements extends CommonMethods {

	@FindBy(id = "firstName")
	public WebElement firstName;

	@FindBy (xpath="//input[@id='middleName']")
	public WebElement middleName;  //-->
	
	@FindBy(id = "lastName")
	public WebElement lastName;

	@FindBy(id = "employeeId")
	public WebElement employeeId;

	@FindBy(id = "chkLogin")
	public WebElement checkboxLoginDetails;

	@FindBy(id = "user_name")
	public WebElement username;

	@FindBy(id = "user_password")
	public WebElement password;

	@FindBy(id = "re_password")
	public WebElement confirmPassword;

	@FindBy(id = "btnSave")
	public WebElement saveBtn;
	
	//--------------
	public void creatLoginCr(String uid, String pwd) {
		checkboxLoginDetails.click();
		sendText(username, "Josephine7");
		sendText(password, "Sephine@Kjy123");
		
		//Select select = new Select(status);
		//select.deselectByVisibleText("Enabled");
		wait(3);
		jsClick(saveBtn);
		
	} 

	public AddEmployeePageElements() {
		PageFactory.initElements(driver, this);
	}

}