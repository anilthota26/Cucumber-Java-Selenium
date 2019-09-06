package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Base;

public class LoginPageUtility extends Base{
	
	public LoginPageUtility() {
		PageFactory.initElements(driver, this);
		
	
	}

	@FindBy(name="email")
	WebElement userName;
	@FindBy(name="password")
	WebElement Password;
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement btnLogin;
	
	
	public void  enterUsername() {
		String user=prop.getProperty("username");
		userName.sendKeys(user);
	}
	public void  enterPassword() {
		String pwd=prop.getProperty("password");
		userName.sendKeys(pwd);
	}
	public void clickOnLoginBtn() {
		btnLogin.click();
	}
	
	
	
}
