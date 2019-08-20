//package StepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//
//public class TagsDefinition {
//	WebDriver driver;
//	
//	@Before()
//	public void setUP(){
//		System.setProperty("webdriver.chrome.driver", "Y:\\Selenium Softwares\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.freecrm.com");
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	}
//	@After()
//	public void tearDown()
//	{
//		driver.close();
//	}
//	
//	@Given("^user is alreay on home page$")
//	public void user_is_alreay_on_home_page(){
//		
//		String Url=driver.getCurrentUrl();
//		System.out.println(Url);
//		
//		
//	   
//	}
//
//	@Given("^test home page title$")
//	public void test_home_page_title() throws InterruptedException {
//		Thread.sleep(5000);
//		String pageTitle=driver.getTitle();
//		Assert.assertEquals(pageTitle, "#1 Free CRM software for any business - FreeCRM.com");
//	}
//
//	@Given("^Click on ligin link$")
//	public void click_on_ligin_link() throws InterruptedException {
//		Thread.sleep(5000);
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//	    
//	}
//
//	@Given("^enter username and password$")
//	public void enter_username_and_password(DataTable data)  {
//		List<List<String>> dataValues=data.raw();
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataValues.get(0).get(0));
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataValues.get(0).get(1));
//	    
//	}
//
//	@Given("^Click on login button$")
//	public void click_on_ligin_buttion() {
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement element=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click(); 
//	    
//	}
//
//	@Given("^Click on Contacts link$")
//	public void click_on_Contacts_link() throws Throwable {
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		WebElement element=driver.findElement(By.xpath("//div[@id='main-nav']//a[3]"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click(); 
//	    
//	}
//
//	@Given("^Click on new button$")
//	public void click_on_new_button() {
//		WebDriverWait wait=new WebDriverWait(driver,20);
//		
//		WebElement element=driver.findElement(By.xpath("//button[contains(text(),'New')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click(); 
//	    
//	  
//	}
//
//	@Given("^enter firstname and lastname$")
//	public void entert_firstname_and_lastname(DataTable data) {
//		for (Map<String, String> dataset : data.asMaps(String.class, String.class)) {
//			
//			//
//						WebDriverWait wait=new WebDriverWait(driver,20); 
//						WebElement elementNew=driver.findElement(By.xpath("//button[contains(text(),'New')]"));
//						wait.until(ExpectedConditions.elementToBeClickable(elementNew));
//						elementNew.click(); 
//			
//			
//						driver.findElement(By.name("first_name")).sendKeys(dataset.get("firstname"));
//						driver.findElement(By.name("last_name")).sendKeys(dataset.get("lastname"));
//						
//						driver.findElement(By.xpath("//button[contains(text(),'Save')]")).click();
//						
//			
//						WebElement element=driver.findElement(By.xpath("//a[@class='item active']"));
//						wait.until(ExpectedConditions.elementToBeClickable(element));
//						element.click(); 
//						
//						
//						
//						
//			
//					}
//	   
//	}
//
//	
//
//}
