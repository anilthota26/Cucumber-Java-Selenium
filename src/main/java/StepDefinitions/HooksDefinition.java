package StepDefinitions;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDefinition {
	WebDriver driver;
	//*******************Global Hooks With Ordering********************//
	@Before(order=0)
	public void setUP(){
		System.setProperty("webdriver.chrome.driver", "Y:\\Selenium Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Before(order=1)
	public void beforeHook2() {
		System.out.println("Global Hook Before Method 2");
	}
	@After(order=0)
	public void afterHook2() {
		System.out.println(" Global Hook Afetr Method 1");
	}
	@After(order=1)
	public void tearDown()
	{
		System.out.println("Global Hook Method 2");
		driver.close();
	}
	
	
	@Given("^User already in home page$")
	public void user_already_in_home_page() {
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
	}

	@When("^Title of the page is home page$")
	public void title_of_the_page_is_home_page() throws InterruptedException {
	    
		Thread.sleep(3000);
		String pageTitle=driver.getTitle();
		Assert.assertEquals(pageTitle, "#1 Free CRM software for any business - FreeCRM.com");
	}

	@Then("^Click on login link$")
	public void click_on_login_link() throws InterruptedException {
		Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,20);
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	    
	}

	@Then("^Enter the username and password$")
	public void enter_the_username_and_password(DataTable data) throws Throwable {
		
		List<List<String>> dataValues=data.raw();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataValues.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataValues.get(0).get(1));
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	    
	}
	@Then("^Click on Contacts Button$")
	public void click_on_Contacts_Button()  {
		
		WebDriverWait wait=new WebDriverWait(driver,20); 
		WebElement elementNew=driver.findElement(By.xpath("//div[@id='main-nav']//a[3]"));
		wait.until(ExpectedConditions.elementToBeClickable(elementNew));
		elementNew.click(); 
	}

	@Then("^add new contacts$")
	public void add_new_contacts(DataTable data) throws Throwable {
		for (Map<String, String> dataset : data.asMaps(String.class, String.class)) {
			
			
						WebDriverWait wait=new WebDriverWait(driver,20); 
						WebElement elementNew=driver.findElement(By.xpath("//button[contains(text(),'New')]"));
						wait.until(ExpectedConditions.elementToBeClickable(elementNew));
						elementNew.click(); 
			
						driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
						driver.findElement(By.name("first_name")).sendKeys(dataset.get("firstname"));
						driver.findElement(By.name("last_name")).sendKeys(dataset.get("lastname"));
						
						driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
						
			
						WebElement element=driver.findElement(By.xpath("//a[@class='item active']"));
						wait.until(ExpectedConditions.elementToBeClickable(element));
						element.click(); 
						
						
						
						
			
					}
	   
	   
	}

}
