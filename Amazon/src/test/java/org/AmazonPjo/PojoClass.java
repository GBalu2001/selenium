package org.AmazonPjo;

import org.BassClass.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoClass extends BassClass{
	public PojoClass() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id = "createAccountSubmit")
	private WebElement CreateNewAccount;
	
	public WebElement getCreateNewAccount() {
		return CreateNewAccount;
	}

	public WebElement getUserNmae() {
		return UserNmae;
	}

	public WebElement getMobileNumber() {
		return MobileNumber;
	}

	public WebElement getPassword() {
		return Password;
	}
	@FindBy(id = "ap_customer_name")
	private WebElement UserNmae;
	
	@FindBy(id = "ap_phone_number")
	private WebElement MobileNumber;
	
	@FindBy(id = "ap_password")
	private WebElement Password;
	

}
