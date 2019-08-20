//package StepDefinitions;
//
//import java.util.List;
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
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//
//public class LoginStepDefinition {
//	WebDriver driver;
//	@Given("^user is alreay on login page$")
//	public void user_is_alreay_on_login_page()  {
//
//		System.setProperty("webdriver.chrome.driver", "Y:\\Selenium Softwares\\chromedriver.exe");
//		driver=new ChromeDriver();
//		driver.get("https://www.freecrm.com");
////		driver.manage().window().maximize();
////		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		
//	   
//	}
//
//	@When("^Title of page is login page$")
//	public void title_of_page_is_login_page()  {
//		
//		String pageTitle=driver.getTitle();
//		Assert.assertEquals(pageTitle, "#1 Free CRM software for any business - FreeCRM.com");
//	   
//	}
//	@Then("^click on login button$")
//	public void click_on_login_button() {
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
//		
//	}
//
////	@Then("^user enters username and password$")
////	public void user_enters_username_and_password(){
////		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("anilkumar@gmail.com");;
////		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("anil131841");
////		
////	
////	}
//	
////	Data Driven Approach 1
//	
////	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
////	public void user_enters_and(String user, String pwd) {
////		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);;
////		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
////	}
//
////	@Then("^user enters username and password$")
////	public void user_enters_username_and_password(DataTable data) {
////		List<List<String>> dataValues=data.raw();
////		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(dataValues.get(0).get(0));
////		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(dataValues.get(0).get(1));
////		
////		
////	}
//	
////	Method 3 Data Driven by Scenario Outline And example
//	
//	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
//	public void user_enters_and(String user, String pwd) {
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(user);
//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
//		
//	}
//	
//	@Then("^user clicks login button$")
//	public void user_clicks_login_button() {
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		WebElement element=driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
//		wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click(); 
//		System.out.println("Login Button clicked");
//		
//		}
//
//	@Then("^user is on UserHome Page$")
//	public void user_is_on_UserHome_Page() {
//		String pageTitle=driver.getTitle();
//		Assert.assertEquals(pageTitle, "CRM");
//		
//	   
//	}
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.close();
//	}
//
//
//	
//
//}
