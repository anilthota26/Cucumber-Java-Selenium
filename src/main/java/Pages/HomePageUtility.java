package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.Base;

public class HomePageUtility extends Base {

	public HomePageUtility() throws IOException {
		
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	WebElement loginLink;
	@FindBy(xpath="//a[contains(text(),'Sign Up')]")
	WebElement signUp;
	@FindBy(xpath="//a[contains(text(),'Pricing')]")
	WebElement pricing;
	
	
	
	
	public void clickOnLogin() {
		loginLink.click();
	}
	public void clickOnSignUp() {
		signUp.click();
	}
	public void clickOnPricing() {
		pricing.click();
	}
	
	

}
