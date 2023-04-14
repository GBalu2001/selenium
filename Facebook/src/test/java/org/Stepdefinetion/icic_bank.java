package org.Stepdefinetion;

import org.bassClass.BassClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class icic_bank extends BassClass{
	@Given("To launch browser and maximize the window")
	public void to_launch_browser_and_maximize_the_window() {
		launchBrowser();
		WindowMaximize();
	  
	}
	@When("To pass the url in icic bank")
	public void to_pass_the_url_in_icic_bank() {
	    launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ITM=nli_personalb_personal_login_btn&_gl=1*30xkeg*_ga*MTgzMDcxOTY5Ni4xNjIwMDM5NDU0*_ga_SKB78GHTFV*MTYyODIzNDM4NC43Ny4xLjE2MjgyMzQ1MDQuMjc.&_ga=2.231249115.51744252.1680275855-1061975360.1679486736");
	}

	@When("To click the user id check box")
	public void to_click_the_user_id_check_box() {
		WebElement user_click = driver.findElement(By.id("DUMMY1"));
		user_click.click();
	  
	}

	@When("To pass user id in user filed")
	public void to_pass_user_id_in_user_filed() {
		WebElement user_name = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		user_name.sendKeys("98931267");
	 
	}

	@When("To pass password in password filed")
	public void to_pass_password_in_password_filed() {
		WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		pass.sendKeys("89378");
	  
	}

	@When("To click the login button in icic page")
	public void to_click_the_login_button_in_icic_page() {
	    WebElement login_button = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
	    login_button.click();
}	
	@Then("To close the browser in icic bank")
	public void to_close_the_browser_in_icic_bank() {
		CloseEntrieElement();
	   
	}


}
	
