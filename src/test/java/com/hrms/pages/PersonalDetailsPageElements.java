package com.hrms.pages;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class PersonalDetailsPageElements {

	@FindBy(id = "personal_txtLicenNo")
	public WebElement DLNumber;
	@FindBy(id = "personal_txtLicExpDate")
	public WebElement LicenseExpiryDate;
	
	@FindBy(id = "personal_txtNICNo")
	public WebElement SSNNumber;
	
	@FindBy(id = "personal_cmbNation")
	public WebElement nationalityDD;

	@FindBy(name = "personal[optGender]")
	public List<WebElement> genderRadioGroup;

	@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
	public WebElement lblPersonalDetails;

	@FindBy(id = "personal_txtEmployeeId")
	public WebElement employeeId;
	
	@FindBy(xpath="//div[@id='profile-pic']//h1")
	public WebElement profilePic;

	@FindBy( id = "personal_txtEmpNickName")
	public WebElement nickName;
	
	@FindBy(id = "personal_txtMilitarySer")
	public WebElement MilitaryService;
	
	@FindBy(id = "personal_txtSINNo")
	public WebElement SINNumber;
	
	@FindBy (id = "personal_cmbMarital") 
	public WebElement MaritalStatus;
	
	@FindBy(id="personal_DOB")
	public WebElement DateofBirth;
	
	@FindBy(id="personal_chkSmokeFlag")
	public WebElement Smoker;
	
	@FindBy(id = "btnSave")
	public WebElement editBtn;
	
	public PersonalDetailsPageElements() {
		PageFactory.initElements(BaseClass.driver, this);
	}
}


 
