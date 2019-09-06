package StepDefinitions;

import java.io.IOException;

import org.junit.Assert;
import Pages.HomePageUtility;
import Pages.LoginPageUtility;
import Utilities.Base;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class NewLoginStepDefinition extends Base{
	
	
//	HomePageUtility homepage;
//	LoginPageUtility loginpage;
	@Before()
	public void initlization() throws IOException {
		init();
		
		
	}
	@Given("^user is alreay on login page$")
	public void user_is_alreay_on_login_page() throws IOException {
		
		String title=driver.getTitle();
		Assert.assertEquals(title, "#1 Free CRM software for any business - FreeCRM.com");
	  
	}

	
	@Then("^click on login link$")
	public void click_on_login_link() throws IOException  {
		HomePageUtility homepage=new HomePageUtility();
		
		
		homepage.clickOnLogin();
	   
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {

		LoginPageUtility loginpage=new LoginPageUtility();
		loginpage.enterUsername();
		loginpage.enterPassword();
		
	   
	}

	@Then("^user clicks login button$")
	public void user_clicks_login_button() throws IOException  {
//		HomePageUtility homepage=new HomePageUtility(driver);
		LoginPageUtility loginpage=new LoginPageUtility();
		loginpage.clickOnLoginBtn();
	   
	}

	
}
