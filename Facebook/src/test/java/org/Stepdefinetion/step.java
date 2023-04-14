package org.Stepdefinetion;
import java.util.List;
import java.util.Map;
import org.bassClass.BassClass;
import org.pojoFacebook.CreateAccount;
import io.cucumber.datatable.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class step extends BassClass {
	CreateAccount c;
	@Given("To launch browser and maximize the facebook")
	public void to_launch_browser_and_maximize_the_facebook() {
		launchBrowser();
		WindowMaximize();
		}
	@When("To launch the facebook url")
	public void to_launch_the_facebook_url() {
		launchUrl("https://en-gb.facebook.com/");
		}
	@When("To click a creat account button")
	public void to_click_a_creat_account_button() {
		c = new CreateAccount();
		clickbtn(c.getCreatNewAccount());
	}
	@When("To pass the firstname in firstText  filed")
	public void to_pass_the_firstname_in_firstText_filed(DataTable d) throws InterruptedException {
		Thread.sleep(6000);
		Map<String, String> m = d.asMap(String.class, String.class);
		c = new CreateAccount();
		PassText(m.get("FristName_2"), c.getFristName());
	}
	@When("To pass the secountname in secountText filed")
	public void to_pass_the_secountname_in_secountText_filed() {
		c = new CreateAccount();
		PassText("infotch", c.getSecountName());
	}
	@When("To pass the email or moblieNumber in emailText Filed")
	public void to_pass_the_email_or_moblieNumber_in_emailText_Filed(DataTable d) {
		List<List<String>> l = d.asLists();
		c = new CreateAccount();
		PassText(l.get(2).get(1), c.getEmail());
	}
	@When("To pass the password int password Filed")
	public void to_pass_the_password_int_password_Filed() {
		c = new CreateAccount();
		PassText("345243", c.getPassword());
		}
	@Then("To close the browser")
	public void to_close_the_browser() {
		CloseEntrieElement();

	}

}
