package org.pojoFacebook;

import org.bassClass.BassClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccount extends BassClass {
	public CreateAccount(){
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath = "//a[text()='Create new account']")
	private WebElement CreatNewAccount;
	
	@FindBy( name = "firstname")
	private WebElement FristName;
	@FindBy(name = "lastname")
	private WebElement SecountName;
	@FindBy(name = "reg_email__")
	private WebElement email;
	@FindBy(name = "reg_passwd__")
	private WebElement password;
	
	public WebElement getCreatNewAccount() {
		return CreatNewAccount;
	}
	public WebElement getFristName() {
		return FristName;
	}
	public WebElement getSecountName() {
		return SecountName;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	
	
	
}

